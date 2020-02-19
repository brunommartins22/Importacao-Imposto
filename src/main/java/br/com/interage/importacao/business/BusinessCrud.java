/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.interage.importacao.business;


import br.com.interage.importacao.entity.Model;
import java.util.List;

/**
 *
 * @author bruno
 * @param <T>
 */
public interface BusinessCrud<T extends Model> {

    public void insert(T entity);

    public void update(T entity);

    public void delete(T entity);
    
    public T findById(Object id);
    
    public List<T> getAll();
    
    public void insertList(List<T> list);
}
