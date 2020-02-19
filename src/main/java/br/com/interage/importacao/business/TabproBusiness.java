package br.com.interage.importacao.business;

import br.com.interage.importacao.entity.ImportacaoImp;
import br.com.interage.importacao.entity.Tabpro;
import java.util.List;


public interface TabproBusiness extends BusinessCrud<Tabpro>{
public List<ImportacaoImp> getImportacaoImpostos(Integer codfil);

}