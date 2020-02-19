package br.com.interage.importacao.business;

import br.com.interage.importacao.entity.ImportacaoImp;
import br.com.interage.importacao.entity.Tabpro;
import br.com.interage.importacao.entity.Tabprofil;
import br.com.interage.importacao.entity.Tabproimp;
import br.com.interage.importacao.persistence.TabproDao;
import br.com.interage.importacao.utils.Utils;
import java.util.List;
import javax.persistence.TypedQuery;

public class TabproBusinessBean extends AbstractBusinessCrud<Tabpro, TabproDao> implements TabproBusiness {

    private TabproimpBusinessBean tabproimpBusinessBean = new TabproimpBusinessBean();
    private TabprofilBusinessBean tabprofilBusinessBean = new TabprofilBusinessBean();

    @Override
    public List<ImportacaoImp> getImportacaoImpostos(Integer codfil) {
        return getDao().getImportacaoImpostos(codfil);
    }

    public void updateImpostoImp(List<ImportacaoImp> result, Integer codFil) throws Exception {
        int i = 1;
        for (ImportacaoImp imp : result) {
            String query = "SELECT * FROM Tabpro tp WHERE tp.codbarun = '"+Utils.retirarCaracteresEspeciais(imp.getCodigobarra().trim())+"'";
//            if (imp.getCodigobarra() != null && !imp.getCodigobarra().equals("")) {
//                query += "tp.codbarun= '" + imp.getCodigobarra().trim() + "' ";
//            } else {
//                query += "tp.codpro= '" + imp.getCodigoproduto().trim() + "' ";
//            }

            boolean isExist = false;
            TypedQuery<Tabpro> listTp = (TypedQuery<Tabpro>) getDao().getEntityManager().createNativeQuery(query, Tabpro.class);
            if (!listTp.getResultList().isEmpty()) {
                Tabpro tp = listTp.getResultList().get(0);
                tp.setCodgen(imp.getGenero().trim());
                tp.setClasfiscal(imp.getNcm().trim().replace(".", ""));
                tp.setCest(imp.getCest().trim().replace(".", ""));
                tp.setNatpro(imp.getNaturezaproduto().trim());
                update(tp);
                String codPro = tp.getCodpro();

                TypedQuery<Tabprofil> listTpf = (TypedQuery<Tabprofil>) getDao().getEntityManager().createNativeQuery("select * from tabprofil tpf where tpf.codpro = :codpro and tpf.codfil = :codfil", Tabprofil.class).setParameter("codpro", codPro).setParameter("codfil", codFil);
                if (!listTpf.getResultList().isEmpty()) {
                    Tabprofil tpf = listTpf.getResultList().get(0);
                    tpf.setCstpise(imp.getPisentrada());
                    tpf.setCstcofinse(imp.getCofinsentrada());
                    tabprofilBusinessBean.update(tpf);
                } else if (imp.getPisentrada() != null || imp.getCofinsentrada() != null) {
                    Tabprofil fil = new Tabprofil(codPro, codFil);
                    fil.setCstpise(imp.getPisentrada());
                    fil.setCstcofinse(imp.getCofinsentrada());
                    tabprofilBusinessBean.insert(fil);
                }
                TypedQuery<Tabproimp> listTpi = (TypedQuery<Tabproimp>) getDao().getEntityManager().createNativeQuery("select * from tabproimp tpi where tpi.codpro = :codpro and tpi.codfil = :codfil and tpi.tpimpos='D'", Tabproimp.class).setParameter("codpro", codPro).setParameter("codfil", codFil);
                if (!listTpi.getResultList().isEmpty()) {
                    Tabproimp tpi = listTpi.getResultList().get(0);
                    tpi.setCfop(imp.getCfop());
                    tpi.setIcmscst(imp.getCst().trim().substring(1));
                    tpi.setIcmspicms(imp.getIcmsSaida());
                    tpi.setPiscst(imp.getPissaida());
                    tpi.setCofinscst(imp.getCofinssaida());
                    tpi.setPisppis(imp.getAliquotaPis());
                    tpi.setCofinspcofins(imp.getAliquotaCofins());

                    tabproimpBusinessBean.update(tpi);
                } else if ((imp.getCfop() != null && !imp.getCfop().equals("")) || imp.getPissaida() != null || imp.getCofinssaida() != null) {
                    Tabproimp tpImp = new Tabproimp(codPro, codFil, "D");
                    tpImp.setCfop(imp.getCfop());
                    tpImp.setIcmscst(imp.getCst().trim().substring(1));
                    if (tpImp.getIcmscst().equals("00")) {
                        tpImp.setIcmsmodbc("3");
                    }
                    tpImp.setIcmspicms(imp.getIcmsSaida());
                    tpImp.setPiscst(imp.getPissaida());
                    tpImp.setCofinscst(imp.getCofinssaida());
                    tpImp.setPisppis(imp.getAliquotaPis());
                    tpImp.setCofinspcofins(imp.getAliquotaCofins());
                    tabproimpBusinessBean.insert(tpImp);
                }
                isExist = true;
            }
          
            System.out.println(!isExist?"!! Não Encontrado na Base de Dados !!":"Posição = " + i + "| codBarra = " + imp.getCodigobarra());
            i++;
        }
    }

}
