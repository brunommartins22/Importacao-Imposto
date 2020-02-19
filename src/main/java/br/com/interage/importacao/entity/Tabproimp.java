/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.interage.importacao.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author bruno
 */
@Entity
@Table(name = "TABPROIMP")
@NamedQueries({
    @NamedQuery(name = "Tabproimp.findAll", query = "SELECT t FROM Tabproimp t")})
public class Tabproimp implements Model {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TabproimpPK tabproimpPK;
    @Column(name = "ICMSCST")
    private String icmscst;
//    @Column(name = "ICMSORIG")
//    private String icmsorig;
    @Column(name = "ICMSMODBC")
    private String icmsmodbc;
//    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
//    @Column(name = "ICMSPREDBC")
//    private Double icmspredbc;
    @Column(name = "ICMSPICMS")
    private Double icmspicms;
//    @Column(name = "ICMSMODBCST")
//    private String icmsmodbcst;
//    @Column(name = "ICMSPMVAST")
//    private Double icmspmvast;
//    @Column(name = "ICMSPREDBCST")
//    private Double icmspredbcst;
//    @Column(name = "ICMSPICMSST")
//    private Double icmspicmsst;
//    @Column(name = "IPIPICST")
//    private String ipipicst;
//    @Column(name = "IPICENQ")
//    private String ipicenq;
//    @Column(name = "IPICLENQ")
//    private String ipiclenq;
//    @Column(name = "IPICNPJPROD")
//    private String ipicnpjprod;
//    @Column(name = "TIPOIPICALC")
//    private String tipoipicalc;
//    @Column(name = "IPIVUNID")
//    private Double ipivunid;
//    @Column(name = "IPIPIPI")
//    private Double ipipipi;
    @Column(name = "PISCST")
    private String piscst;
//    @Column(name = "TIPOPISCALC")
//    private String tipopiscalc;
    @Column(name = "PISPPIS")
    private Double pisppis;
//    @Column(name = "VALIQPROD")
//    private Double valiqprod;
//    @Column(name = "TIPOPISSTCALC")
//    private String tipopisstcalc;
//    @Column(name = "PISPPISST")
//    private Double pisppisst;
//    @Column(name = "VALIQPRODST")
//    private Double valiqprodst;
    @Column(name = "COFINSCST")
    private String cofinscst;
//    @Column(name = "TIPOCOFINSCALC")
//    private String tipocofinscalc;
    @Column(name = "COFINSPCOFINS")
    private Double cofinspcofins;
//    @Column(name = "COFINSVALIQPROD")
//    private Double cofinsvaliqprod;
//    @Column(name = "TIPOCOFINSSTCALC")
//    private String tipocofinsstcalc;
//    @Column(name = "COFINSPCOFINSST")
//    private Double cofinspcofinsst;
//    @Column(name = "COFINSVALIQPRODST")
//    private Double cofinsvaliqprodst;
//    @Column(name = "ISSVALIQ")
//    private Double issvaliq;
//    @Column(name = "CLISTSERV")
//    private String clistserv;
//    @Column(name = "EXTIPI")
//    private String extipi;
//    @Column(name = "ICMSMOTDESICMS")
//    private String icmsmotdesicms;
//    @Column(name = "ICMSPCREDSN")
//    private Double icmspcredsn;
//    @Column(name = "CSITTRIB")
//    private String csittrib;
//    @Column(name = "ICMSPBCOP")
//    private Double icmspbcop;
//    @Column(name = "ICMSCSTINT")
//    private String icmscstint;
    @Column(name = "CFOP")
    private String cfop;
//    @Column(name = "NCM")
//    private String ncm;
//    @Column(name = "CFOPT")
//    private String cfopt;
//    @Column(name = "CODINFNFE")
//    private Integer codinfnfe;
//    @Column(name = "DTENVSERV")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date dtenvserv;
    @JoinColumn(name = "CODFIL", referencedColumnName = "CODFIL", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Tabfil tabfil;
    @JoinColumn(name = "CODPRO", referencedColumnName = "CODPRO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Tabpro tabpro;

    public Tabproimp() {
    }

    public Tabproimp(TabproimpPK tabproimpPK) {
        this.tabproimpPK = tabproimpPK;
    }

    public Tabproimp(String codpro, int codfil, String tpimpos) {
        this.tabproimpPK = new TabproimpPK(codpro, codfil, tpimpos);
    }

    public TabproimpPK getTabproimpPK() {
        return tabproimpPK;
    }

    public void setTabproimpPK(TabproimpPK tabproimpPK) {
        this.tabproimpPK = tabproimpPK;
    }

    public String getIcmscst() {
        return icmscst;
    }

    public void setIcmscst(String icmscst) {
        this.icmscst = icmscst;
    }
//
//    public String getIcmsorig() {
//        return icmsorig;
//    }
//
//    public void setIcmsorig(String icmsorig) {
//        this.icmsorig = icmsorig;
//    }
//
    public String getIcmsmodbc() {
        return icmsmodbc;
    }

    public void setIcmsmodbc(String icmsmodbc) {
        this.icmsmodbc = icmsmodbc;
    }
//
//    public Double getIcmspredbc() {
//        return icmspredbc;
//    }
//
//    public void setIcmspredbc(Double icmspredbc) {
//        this.icmspredbc = icmspredbc;
//    }
//

    public Double getIcmspicms() {
        if (icmspicms == null) {
            icmspicms = 0.0;
        }
        return icmspicms;
    }

    public void setIcmspicms(Double icmspicms) {
        this.icmspicms = icmspicms;
    }
//
//    public String getIcmsmodbcst() {
//        return icmsmodbcst;
//    }
//
//    public void setIcmsmodbcst(String icmsmodbcst) {
//        this.icmsmodbcst = icmsmodbcst;
//    }
//
//    public Double getIcmspmvast() {
//        return icmspmvast;
//    }
//
//    public void setIcmspmvast(Double icmspmvast) {
//        this.icmspmvast = icmspmvast;
//    }
//
//    public Double getIcmspredbcst() {
//        return icmspredbcst;
//    }
//
//    public void setIcmspredbcst(Double icmspredbcst) {
//        this.icmspredbcst = icmspredbcst;
//    }
//
//    public Double getIcmspicmsst() {
//        return icmspicmsst;
//    }
//
//    public void setIcmspicmsst(Double icmspicmsst) {
//        this.icmspicmsst = icmspicmsst;
//    }
//
//    public String getIpipicst() {
//        return ipipicst;
//    }
//
//    public void setIpipicst(String ipipicst) {
//        this.ipipicst = ipipicst;
//    }
//
//    public String getIpicenq() {
//        return ipicenq;
//    }
//
//    public void setIpicenq(String ipicenq) {
//        this.ipicenq = ipicenq;
//    }
//
//    public String getIpiclenq() {
//        return ipiclenq;
//    }
//
//    public void setIpiclenq(String ipiclenq) {
//        this.ipiclenq = ipiclenq;
//    }
//
//    public String getIpicnpjprod() {
//        return ipicnpjprod;
//    }
//
//    public void setIpicnpjprod(String ipicnpjprod) {
//        this.ipicnpjprod = ipicnpjprod;
//    }
//
//    public String getTipoipicalc() {
//        return tipoipicalc;
//    }
//
//    public void setTipoipicalc(String tipoipicalc) {
//        this.tipoipicalc = tipoipicalc;
//    }
//
//    public Double getIpivunid() {
//        return ipivunid;
//    }
//
//    public void setIpivunid(Double ipivunid) {
//        this.ipivunid = ipivunid;
//    }
//
//    public Double getIpipipi() {
//        return ipipipi;
//    }
//
//    public void setIpipipi(Double ipipipi) {
//        this.ipipipi = ipipipi;
//    }
//

    public String getPiscst() {
        return piscst;
    }

    public void setPiscst(String piscst) {
        this.piscst = piscst;
    }
//
//    public String getTipopiscalc() {
//        return tipopiscalc;
//    }
//
//    public void setTipopiscalc(String tipopiscalc) {
//        this.tipopiscalc = tipopiscalc;
//    }

    public Double getPisppis() {
        return pisppis;
    }

    public void setPisppis(Double pisppis) {
        this.pisppis = pisppis;
    }

//    public Double getValiqprod() {
//        return valiqprod;
//    }
//
//    public void setValiqprod(Double valiqprod) {
//        this.valiqprod = valiqprod;
//    }
//
//    public String getTipopisstcalc() {
//        return tipopisstcalc;
//    }
//
//    public void setTipopisstcalc(String tipopisstcalc) {
//        this.tipopisstcalc = tipopisstcalc;
//    }
//
//    public Double getPisppisst() {
//        return pisppisst;
//    }
//
//    public void setPisppisst(Double pisppisst) {
//        this.pisppisst = pisppisst;
//    }
//
//    public Double getValiqprodst() {
//        return valiqprodst;
//    }
//
//    public void setValiqprodst(Double valiqprodst) {
//        this.valiqprodst = valiqprodst;
//    }
//
    public String getCofinscst() {
        return cofinscst;
    }

    public void setCofinscst(String cofinscst) {
        this.cofinscst = cofinscst;
    }
//
//    public String getTipocofinscalc() {
//        return tipocofinscalc;
//    }
//
//    public void setTipocofinscalc(String tipocofinscalc) {
//        this.tipocofinscalc = tipocofinscalc;
//    }

    public Double getCofinspcofins() {
        return cofinspcofins;
    }

    public void setCofinspcofins(Double cofinspcofins) {
        this.cofinspcofins = cofinspcofins;
    }

//    public Double getCofinsvaliqprod() {
//        return cofinsvaliqprod;
//    }
//
//    public void setCofinsvaliqprod(Double cofinsvaliqprod) {
//        this.cofinsvaliqprod = cofinsvaliqprod;
//    }
//
//    public String getTipocofinsstcalc() {
//        return tipocofinsstcalc;
//    }
//
//    public void setTipocofinsstcalc(String tipocofinsstcalc) {
//        this.tipocofinsstcalc = tipocofinsstcalc;
//    }
//
//    public Double getCofinspcofinsst() {
//        return cofinspcofinsst;
//    }
//
//    public void setCofinspcofinsst(Double cofinspcofinsst) {
//        this.cofinspcofinsst = cofinspcofinsst;
//    }
//
//    public Double getCofinsvaliqprodst() {
//        return cofinsvaliqprodst;
//    }
//
//    public void setCofinsvaliqprodst(Double cofinsvaliqprodst) {
//        this.cofinsvaliqprodst = cofinsvaliqprodst;
//    }
//
//    public Double getIssvaliq() {
//        return issvaliq;
//    }
//
//    public void setIssvaliq(Double issvaliq) {
//        this.issvaliq = issvaliq;
//    }
//
//    public String getClistserv() {
//        return clistserv;
//    }
//
//    public void setClistserv(String clistserv) {
//        this.clistserv = clistserv;
//    }
//
//    public String getExtipi() {
//        return extipi;
//    }
//
//    public void setExtipi(String extipi) {
//        this.extipi = extipi;
//    }
//
//    public String getIcmsmotdesicms() {
//        return icmsmotdesicms;
//    }
//
//    public void setIcmsmotdesicms(String icmsmotdesicms) {
//        this.icmsmotdesicms = icmsmotdesicms;
//    }
//
//    public Double getIcmspcredsn() {
//        return icmspcredsn;
//    }
//
//    public void setIcmspcredsn(Double icmspcredsn) {
//        this.icmspcredsn = icmspcredsn;
//    }
//
//    public String getCsittrib() {
//        return csittrib;
//    }
//
//    public void setCsittrib(String csittrib) {
//        this.csittrib = csittrib;
//    }
//
//    public Double getIcmspbcop() {
//        return icmspbcop;
//    }
//
//    public void setIcmspbcop(Double icmspbcop) {
//        this.icmspbcop = icmspbcop;
//    }
//
//    public String getIcmscstint() {
//        return icmscstint;
//    }
//
//    public void setIcmscstint(String icmscstint) {
//        this.icmscstint = icmscstint;
//    }
    public String getCfop() {
        return cfop;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

//    public String getNcm() {
//        return ncm;
//    }
//
//    public void setNcm(String ncm) {
//        this.ncm = ncm;
//    }
//    public String getCfopt() {
//        return cfopt;
//    }
//
//    public void setCfopt(String cfopt) {
//        this.cfopt = cfopt;
//    }
//
//    public Integer getCodinfnfe() {
//        return codinfnfe;
//    }
//
//    public void setCodinfnfe(Integer codinfnfe) {
//        this.codinfnfe = codinfnfe;
//    }
//
//    public Date getDtenvserv() {
//        return dtenvserv;
//    }
//
//    public void setDtenvserv(Date dtenvserv) {
//        this.dtenvserv = dtenvserv;
//    }
    public Tabfil getTabfil() {
        return tabfil;
    }

    public void setTabfil(Tabfil tabfil) {
        this.tabfil = tabfil;
    }

    public Tabpro getTabpro() {
        return tabpro;
    }

    public void setTabpro(Tabpro tabpro) {
        this.tabpro = tabpro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tabproimpPK != null ? tabproimpPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabproimp)) {
            return false;
        }
        Tabproimp other = (Tabproimp) object;
        if ((this.tabproimpPK == null && other.tabproimpPK != null) || (this.tabproimpPK != null && !this.tabproimpPK.equals(other.tabproimpPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.interage.importacao.entity.Tabproimp[ tabproimpPK=" + tabproimpPK + " ]";
    }

    @Override
    public Object getId() {
        return tabproimpPK;
    }

    @Override
    public void setId(Object object) {
        this.tabproimpPK = (TabproimpPK) object;
    }

}
