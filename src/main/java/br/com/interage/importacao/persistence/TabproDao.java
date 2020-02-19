package br.com.interage.importacao.persistence;

import br.com.interage.importacao.entity.ImportacaoImp;
import br.com.interage.importacao.entity.Tabpro;
import java.util.ArrayList;
import java.util.List;

public class TabproDao extends AbstractDaoCrud<Tabpro> {
    
    public List<ImportacaoImp> getImportacaoImpostos(Integer codfil) {
        List<ImportacaoImp> result = new ArrayList<>();
        List<Object[]> query = getEntityManager().createNativeQuery("select tp.descpro as nomeproduto,"
                + "tp.codpro as codigoproduto,"
                + "tp.codbarun as codigobarra,"
                + "tp.codgen as genero,"
                + "tp.clasfiscal as ncm,"
                + "tpi.cfop as cfop,"
                + "tp.cest as cest,"
                + "tpi.icmscst as cst,"
                + "tpi.icmspicms as icmssaida,"
                + "tpf.cstpise as pisentrada,"
                + "tpi.piscst as pissaida,"
                + "tpf.cstcofinse as cofinsentrada,"
                + "tpi.cofinscst as cofinssaida,"
                + "tp.natpro as naturezaproduto,"
                + "tpi.pisppis as aliquotapis,"
                + "tpi.cofinspcofins as aliquotaCofins "
                + "from tabpro tp "
                + "left join tabprofil tpf on tpf.codpro = tp.codpro "
                + "left join tabproimp tpi on tpi.codfil = tpf.codfil and tpi.codpro = tp.codpro "
                + "where tpf.codfil = :codfil and tp.rgevento <> '3'").setParameter("codfil", codfil).getResultList();
        
        if (!query.isEmpty()) {
            query.forEach((o) -> {
                ImportacaoImp imp = new ImportacaoImp();
                imp.setNomeproduto(o[0] != null ? (String) o[0] : "");
                imp.setCodigoproduto(o[1] != null ? (String) o[1] : "");
                imp.setCodigobarra(o[2] != null ? (String) o[2] : "");
                imp.setGenero(o[3] != null ? (String) o[3] : "");
                imp.setNcm(o[4] != null ? (String) o[4] : "");
                imp.setCfop(o[5] != null ? (String) o[5] : "");
                imp.setCest(o[6] != null ? (String) o[6] : "");
                imp.setCst(o[7] != null ? (String) o[7] : "");
                imp.setIcmsSaida(o[8] != null ? (Double) o[8] : 0.0);
                imp.setPisentrada(o[9] != null ? (String) o[9] : "");
                imp.setPissaida(o[10] != null ? (String) o[10] : "");
                imp.setCofinsentrada(o[11] != null ? (String) o[11] : "");
                imp.setCofinssaida(o[12] != null ? (String) o[12] : "");
                imp.setNaturezaproduto(o[13] != null ? (String) o[13] : "");
                imp.setAliquotaPis(o[14] != null ? (Double) o[14] : 0.0);
                imp.setAliquotaCofins(o[15] != null ? (Double) o[15] : 0.0);
                result.add(imp);
//                System.out.println(imp.getNomeproduto());
            });
        }
        
        return result;
        
    }
    
}
