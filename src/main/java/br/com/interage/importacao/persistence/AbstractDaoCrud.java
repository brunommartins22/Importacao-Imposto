package br.com.interage.importacao.persistence;



import br.com.interage.importacao.entity.Model;
import br.com.interage.importacao.utils.JPAUtil;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

abstract class AbstractDaoCrud<T extends Model> implements DaoCrud<T> {

    private Integer maxRowCount = 10;
    public String tpDB;
    private EntityManager em;

    private Class<T> entityClass;

    public AbstractDaoCrud() {

        ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();

        this.entityClass = (Class<T>) genericSuperclass.getActualTypeArguments()[0];

    }

    public void insert(T entity) {

        em = getEntityManager();

        try {

            em.getTransaction().begin();
            em.persist(entity);
            em.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        } finally {
            if (em.isOpen()) {
                em.close();
            }
        }

    }

    /**
     * Método para executar um query de update
     */
    public void executeUpdate(Query query) {

        try {
            EntityManager em = getEntityManager();

            em.getTransaction().begin();

            query.executeUpdate();

            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        } finally {
            if (em.isOpen()) {
                em.close();
            }
        }

    }

    @Override
    public T findById(Object id) {

        EntityManager em = getEntityManager();

        T t = em.find(entityClass, id);

        em.close();

        return t;

    }

    public void update(T entity) {

        em = getEntityManager();

        try {

            em.getTransaction().begin();

            em.merge(entity);

            em.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw e;
        } finally {
            if (em.isOpen()) {
                em.close();
            }
        }
    }

    @Override
    public void delete(T entity) {
        em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.remove(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        } finally {
            if (em.isOpen()) {
                em.close();
            }
        }
    }

    public void insertList(List<T> entity) {

        em = getEntityManager();

        try {

            em.getTransaction().begin();

            for (T e : entity) {
                em.merge(e);
            }

            em.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        } finally {
            if (em.isOpen()) {
                em.close();
            }
        }

    }

    @Override
    public List<T> getAll() {

        Query query = getEntityManager().createQuery("SELECT o FROM " + entityClass.getName() + " o ");

        return query.getResultList();

    }

    public EntityManager getEntityManager() {
        if (em == null || em.isOpen() == false) {
            em = JPAUtil.createEntityManagerIntegrado();
        }
        return em;
    }

    public void closeEntityManager() {
        if (em.isOpen()) {
            em.close();
        }
    }

    public Integer getMaxRowCount() {
        return maxRowCount;
    }

}
