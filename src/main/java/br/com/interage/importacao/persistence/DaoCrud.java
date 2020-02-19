package br.com.interage.importacao.persistence;

import br.com.interage.importacao.entity.Model;
import java.util.List;

public interface DaoCrud<T extends Model> {

    public void insert(T entity);

    public void update(T entity);

    public void delete(T entity);

    public List<T> getAll();

    public void insertList(List<T> list);

    public T findById(Object id);

}
