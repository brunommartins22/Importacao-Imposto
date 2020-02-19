package br.com.interage.importacao.entity;



public interface SelectableModel extends Model{

    public boolean isSelected();

    public void setSelected(boolean isSelected);
}
