/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.interage.importacao.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author bruno
 */
@Entity
@Table(name = "TABPRO")
@NamedQueries({
    @NamedQuery(name = "Tabpro.findAll", query = "SELECT t FROM Tabpro t")})
public class Tabpro implements Model {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODPRO")
    private String codpro;
    @Column(name = "DESCPRO")
    private String descpro;
    @Column(name = "DETALHE")
    private String detalhe;
    @Column(name = "CODBARUN")
    private String codbarun;
    @Column(name = "CODBARCX")
    private String codbarcx;
    @Column(name = "CODREFER")
    private String codrefer;
//    @Column(name = "UNEMB")
//    private String unemb;
//    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
//    @Column(name = "QTDEMB")
//    private Double qtdemb;
//    @Column(name = "UNIDADE")
//    private String unidade;
//    @Column(name = "CODVAS")
//    private String codvas;
//    @Column(name = "VLCOMI")
//    private Double vlcomi;
//    @Column(name = "GRUPRO")
//    private String grupro;
//    @Column(name = "FABPRO")
//    private Integer fabpro;
//    @Column(name = "FORPRO01")
//    private Integer forpro01;
//    @Column(name = "FORPRO02")
//    private Integer forpro02;
//    @Column(name = "FORPRO03")
//    private Integer forpro03;
//    @Column(name = "DOCFOR01")
//    private String docfor01;
//    @Column(name = "DOCFOR02")
//    private String docfor02;
//    @Column(name = "DOCFOR03")
//    private String docfor03;
//    @Column(name = "QTDULTENT01")
//    private Double qtdultent01;
//    @Column(name = "QTDULTENT02")
//    private Double qtdultent02;
//    @Column(name = "QTDULTENT03")
//    private Double qtdultent03;
//    @Column(name = "ULTPRCOM01")
//    private Double ultprcom01;
//    @Column(name = "ULTPRCOM02")
//    private Double ultprcom02;
//    @Column(name = "ULTPRCOM03")
//    private Double ultprcom03;
//    @Column(name = "DTULTCOM01")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date dtultcom01;
//    @Column(name = "DTULTCOM02")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date dtultcom02;
//    @Column(name = "DTULTCOM03")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date dtultcom03;
//    @Column(name = "DTCHEGADA")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date dtchegada;
//    @Column(name = "DTSAIPRO")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date dtsaipro;
//    @Column(name = "ICMS")
//    private Double icms;
//    @Column(name = "INDICE")
//    private String indice;
//    @Column(name = "PESO")
//    private Character peso;
//    @Column(name = "LARGURA")
//    private Double largura;
//    @Column(name = "ALTURA")
//    private Double altura;
//    @Column(name = "MASSACOMPR")
//    private Character massacompr;
//    @Column(name = "CONTRQUANT")
//    private Character contrquant;
//    @Column(name = "CONTRREFER")
//    private Character contrrefer;
//    @Column(name = "CONTRCOMP")
//    private Character contrcomp;
//    @Column(name = "CONTRPONTO")
//    private Character contrponto;
//    @Column(name = "BAIXAPONTO")
//    private Integer baixaponto;
//    @Column(name = "STPROD")
//    private Character stprod;
//    @Column(name = "QUALPROD")
//    private Character qualprod;
//    @Column(name = "RGCODUSU")
//    private Integer rgcodusu;
//    @Column(name = "RGUSUARIO")
//    private String rgusuario;
//    @Column(name = "RGDATA")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date rgdata;
    @Column(name = "RGEVENTO")
    private String rgevento;
//    @Column(name = "FATORPIS")
//    private Double fatorpis;
//    @Column(name = "FATORCOFINS")
//    private Double fatorcofins;
//    @Column(name = "SUBSTRIB")
//    private Character substrib;
//    @Column(name = "IPI")
//    private Character ipi;
//    @Column(name = "PERCIPI")
//    private Double percipi;
//    @Column(name = "MEIOAMEIO")
//    private Character meioameio;
//    @Column(name = "TPSUBEST")
//    private Character tpsubest;
//    @Column(name = "MODELO")
//    private String modelo;
//    @Column(name = "TAMANHO")
//    private String tamanho;
//    @Column(name = "PERCLUCRO")
//    private Double perclucro;
//    @Column(name = "REMCONTR")
//    private Character remcontr;
//    @Column(name = "LIBQUANT")
//    private Character libquant;
//    @Column(name = "VLCOMIAVVA")
//    private Double vlcomiavva;
//    @Column(name = "VLCOMICCVA")
//    private Double vlcomiccva;
//    @Column(name = "VLCOMIAPVA")
//    private Double vlcomiapva;
//    @Column(name = "VLCOMIAVAT")
//    private Double vlcomiavat;
//    @Column(name = "VLCOMICCAT")
//    private Double vlcomiccat;
//    @Column(name = "VLCOMIAPAT")
//    private Double vlcomiapat;
//    @Column(name = "DTVENC01")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date dtvenc01;
//    @Column(name = "DTVENC02")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date dtvenc02;
//    @Column(name = "LTVENC01")
//    private String ltvenc01;
//    @Column(name = "LTVENC02")
//    private String ltvenc02;
//    @Column(name = "BALANCA")
//    private Character balanca;
    @Column(name = "CLASFISCAL")
    private String clasfiscal;
//    @Column(name = "CODALUSER")
//    private Integer codaluser;
//    @Column(name = "CODCOLECAO")
//    private Integer codcolecao;
//    @Column(name = "QUANTPED")
//    private Double quantped;
//    @Column(name = "DTCHEGPED")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date dtchegped;
//    @Column(name = "CORCONSUL")
//    private String corconsul;
//    @Column(name = "CASADEC")
//    private Integer casadec;
//    @Column(name = "CST")
    private String cst;
//    @Column(name = "TRIBMONO")
//    private Character tribmono;
//    @Column(name = "PESOBRUTO")
//    private Double pesobruto;
//    @Column(name = "PESOLIQUIDO")
//    private Double pesoliquido;
//    @Column(name = "LIBDESCONTO")
//    private Character libdesconto;
//    @Column(name = "TIPOITEM")
//    private String tipoitem;
//    @Column(name = "EXIPI")
//    private String exipi;
    @Column(name = "CODGEN")
    private String codgen;
//    @Column(name = "CODLST")
//    private String codlst;
//    @Column(name = "CODANP")
//    private String codanp;
//    @Column(name = "CODIF")
//    private String codif;
//    @Column(name = "CLASTERAP")
//    private String clasterap;
//    @Column(name = "USOPROLONG")
//    private String usoprolong;
//    @Column(name = "REGMSMED")
//    private String regmsmed;
//    @Column(name = "UNIDMED")
//    private String unidmed;
//    @Column(name = "CODDCBINS")
//    private String coddcbins;
//    @Column(name = "CESTABAS")
//    private String cestabas;
//    @Column(name = "DESONFOLHA")
//    private String desonfolha;
//    @Column(name = "DIASVENC")
//    private Integer diasvenc;
//    @Column(name = "ORIGPROD")
//    private String origprod;
//    @Column(name = "ICODPRO")
//    private Integer icodpro;
//    @Column(name = "FARMAPOP")
//    private String farmapop;
//    @Column(name = "QUANTUND")
//    private Double quantund;
//    @Column(name = "UNIDEMB")
//    private String unidemb;
//    @Column(name = "CHAMATEC")
//    private String chamatec;
//    @Lob
//    @Column(name = "DETALHE2")
//    private String detalhe2;
//    @Column(name = "CEST")
    private String cest;
//    @Column(name = "CODDCB")
//    private String coddcb;
//    @Column(name = "CODLISTA")
//    private String codlista;
//    @Column(name = "IMPCUPOM")
//    private String impcupom;
//    @Column(name = "CODSPED")
//    private String codsped;
//    @Column(name = "TPVENCIMNETO")
//    private String tpvencimneto;
//    @Column(name = "CODANVISA")
//    private String codanvisa;
//    @Column(name = "DTULTPEDIDO")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date dtultpedido;
//    @Column(name = "MEDPOSNEG")
//    private String medposneg;
//    @Column(name = "UNIDPED")
//    private String unidped;
//    @Column(name = "CORES")
//    private String cores;
//    @Column(name = "FATORSUBST")
//    private Double fatorsubst;
//    @Column(name = "INDESCALA")
//    private String indescala;
//    @Column(name = "CNPJFAB")
//    private String cnpjfab;
//    @Column(name = "CBENEF")
//    private String cbenef;
//    @Column(name = "PDIF")
//    private Double pdif;
//    @Column(name = "COMBDESCANP")
//    private String combdescanp;
//    @Column(name = "DTENVSERV")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date dtenvserv;
//    @Column(name = "QUARTOBOV")
//    private String quartobov;
//    @Column(name = "UNIDADEQUARTO")
//    private String unidadequarto;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tabpro", fetch = FetchType.EAGER)
//    private List<Tabprofil> tabprofilList;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tabpro", fetch = FetchType.EAGER)
//    private List<Tabproimp> tabproimpList;
    @Column(name = "NATPRO")
    private String natpro;

    public Tabpro() {
    }

    public Tabpro(String codpro) {
        this.codpro = codpro;
    }

    public String getCodpro() {
        return codpro;
    }

    public void setCodpro(String codpro) {
        this.codpro = codpro;
    }

    public String getDescpro() {
        return descpro;
    }

    public void setDescpro(String descpro) {
        this.descpro = descpro;
    }

    public String getDetalhe() {
        return detalhe;
    }

    public void setDetalhe(String detalhe) {
        this.detalhe = detalhe;
    }

    public String getCodbarun() {
        return codbarun;
    }

    public void setCodbarun(String codbarun) {
        this.codbarun = codbarun;
    }

    public String getCodbarcx() {
        return codbarcx;
    }

    public void setCodbarcx(String codbarcx) {
        this.codbarcx = codbarcx;
    }

    public String getCodrefer() {
        return codrefer;
    }

    public void setCodrefer(String codrefer) {
        this.codrefer = codrefer;
    }
//
//    public String getUnemb() {
//        return unemb;
//    }
//
//    public void setUnemb(String unemb) {
//        this.unemb = unemb;
//    }
//
//    public Double getQtdemb() {
//        return qtdemb;
//    }
//
//    public void setQtdemb(Double qtdemb) {
//        this.qtdemb = qtdemb;
//    }
//
//    public String getUnidade() {
//        return unidade;
//    }
//
//    public void setUnidade(String unidade) {
//        this.unidade = unidade;
//    }
//
//    public String getCodvas() {
//        return codvas;
//    }
//
//    public void setCodvas(String codvas) {
//        this.codvas = codvas;
//    }
//
//    public Double getVlcomi() {
//        return vlcomi;
//    }
//
//    public void setVlcomi(Double vlcomi) {
//        this.vlcomi = vlcomi;
//    }
//
//    public String getGrupro() {
//        return grupro;
//    }
//
//    public void setGrupro(String grupro) {
//        this.grupro = grupro;
//    }
//
//    public Integer getFabpro() {
//        return fabpro;
//    }
//
//    public void setFabpro(Integer fabpro) {
//        this.fabpro = fabpro;
//    }
//
//    public Integer getForpro01() {
//        return forpro01;
//    }
//
//    public void setForpro01(Integer forpro01) {
//        this.forpro01 = forpro01;
//    }
//
//    public Integer getForpro02() {
//        return forpro02;
//    }
//
//    public void setForpro02(Integer forpro02) {
//        this.forpro02 = forpro02;
//    }
//
//    public Integer getForpro03() {
//        return forpro03;
//    }
//
//    public void setForpro03(Integer forpro03) {
//        this.forpro03 = forpro03;
//    }
//
//    public String getDocfor01() {
//        return docfor01;
//    }
//
//    public void setDocfor01(String docfor01) {
//        this.docfor01 = docfor01;
//    }
//
//    public String getDocfor02() {
//        return docfor02;
//    }
//
//    public void setDocfor02(String docfor02) {
//        this.docfor02 = docfor02;
//    }
//
//    public String getDocfor03() {
//        return docfor03;
//    }
//
//    public void setDocfor03(String docfor03) {
//        this.docfor03 = docfor03;
//    }
//
//    public Double getQtdultent01() {
//        return qtdultent01;
//    }
//
//    public void setQtdultent01(Double qtdultent01) {
//        this.qtdultent01 = qtdultent01;
//    }
//
//    public Double getQtdultent02() {
//        return qtdultent02;
//    }
//
//    public void setQtdultent02(Double qtdultent02) {
//        this.qtdultent02 = qtdultent02;
//    }
//
//    public Double getQtdultent03() {
//        return qtdultent03;
//    }
//
//    public void setQtdultent03(Double qtdultent03) {
//        this.qtdultent03 = qtdultent03;
//    }
//
//    public Double getUltprcom01() {
//        return ultprcom01;
//    }
//
//    public void setUltprcom01(Double ultprcom01) {
//        this.ultprcom01 = ultprcom01;
//    }
//
//    public Double getUltprcom02() {
//        return ultprcom02;
//    }
//
//    public void setUltprcom02(Double ultprcom02) {
//        this.ultprcom02 = ultprcom02;
//    }
//
//    public Double getUltprcom03() {
//        return ultprcom03;
//    }
//
//    public void setUltprcom03(Double ultprcom03) {
//        this.ultprcom03 = ultprcom03;
//    }
//
//    public Date getDtultcom01() {
//        return dtultcom01;
//    }
//
//    public void setDtultcom01(Date dtultcom01) {
//        this.dtultcom01 = dtultcom01;
//    }
//
//    public Date getDtultcom02() {
//        return dtultcom02;
//    }
//
//    public void setDtultcom02(Date dtultcom02) {
//        this.dtultcom02 = dtultcom02;
//    }
//
//    public Date getDtultcom03() {
//        return dtultcom03;
//    }
//
//    public void setDtultcom03(Date dtultcom03) {
//        this.dtultcom03 = dtultcom03;
//    }
//
//    public Date getDtchegada() {
//        return dtchegada;
//    }
//
//    public void setDtchegada(Date dtchegada) {
//        this.dtchegada = dtchegada;
//    }
//
//    public Date getDtsaipro() {
//        return dtsaipro;
//    }
//
//    public void setDtsaipro(Date dtsaipro) {
//        this.dtsaipro = dtsaipro;
//    }
//
//    public Double getIcms() {
//        return icms;
//    }
//
//    public void setIcms(Double icms) {
//        this.icms = icms;
//    }
//
//    public String getIndice() {
//        return indice;
//    }
//
//    public void setIndice(String indice) {
//        this.indice = indice;
//    }
//
//    public Character getPeso() {
//        return peso;
//    }
//
//    public void setPeso(Character peso) {
//        this.peso = peso;
//    }
//
//    public Double getLargura() {
//        return largura;
//    }
//
//    public void setLargura(Double largura) {
//        this.largura = largura;
//    }
//
//    public Double getAltura() {
//        return altura;
//    }
//
//    public void setAltura(Double altura) {
//        this.altura = altura;
//    }
//
//    public Character getMassacompr() {
//        return massacompr;
//    }
//
//    public void setMassacompr(Character massacompr) {
//        this.massacompr = massacompr;
//    }
//
//    public Character getContrquant() {
//        return contrquant;
//    }
//
//    public void setContrquant(Character contrquant) {
//        this.contrquant = contrquant;
//    }
//
//    public Character getContrrefer() {
//        return contrrefer;
//    }
//
//    public void setContrrefer(Character contrrefer) {
//        this.contrrefer = contrrefer;
//    }
//
//    public Character getContrcomp() {
//        return contrcomp;
//    }
//
//    public void setContrcomp(Character contrcomp) {
//        this.contrcomp = contrcomp;
//    }
//
//    public Character getContrponto() {
//        return contrponto;
//    }
//
//    public void setContrponto(Character contrponto) {
//        this.contrponto = contrponto;
//    }
//
//    public Integer getBaixaponto() {
//        return baixaponto;
//    }
//
//    public void setBaixaponto(Integer baixaponto) {
//        this.baixaponto = baixaponto;
//    }
//
//    public Character getStprod() {
//        return stprod;
//    }
//
//    public void setStprod(Character stprod) {
//        this.stprod = stprod;
//    }
//
//    public Character getQualprod() {
//        return qualprod;
//    }
//
//    public void setQualprod(Character qualprod) {
//        this.qualprod = qualprod;
//    }
//
//    public Integer getRgcodusu() {
//        return rgcodusu;
//    }
//
//    public void setRgcodusu(Integer rgcodusu) {
//        this.rgcodusu = rgcodusu;
//    }
//
//    public String getRgusuario() {
//        return rgusuario;
//    }
//
//    public void setRgusuario(String rgusuario) {
//        this.rgusuario = rgusuario;
//    }
//
//    public Date getRgdata() {
//        return rgdata;
//    }
//
//    public void setRgdata(Date rgdata) {
//        this.rgdata = rgdata;
//    }

    public String getRgevento() {
        return rgevento;
    }

    public void setRgevento(String rgevento) {
        this.rgevento = rgevento;
    }

//    public Double getFatorpis() {
//        return fatorpis;
//    }
//
//    public void setFatorpis(Double fatorpis) {
//        this.fatorpis = fatorpis;
//    }
//
//    public Double getFatorcofins() {
//        return fatorcofins;
//    }
//
//    public void setFatorcofins(Double fatorcofins) {
//        this.fatorcofins = fatorcofins;
//    }
//
//    public Character getSubstrib() {
//        return substrib;
//    }
//
//    public void setSubstrib(Character substrib) {
//        this.substrib = substrib;
//    }
//
//    public Character getIpi() {
//        return ipi;
//    }
//
//    public void setIpi(Character ipi) {
//        this.ipi = ipi;
//    }
//
//    public Double getPercipi() {
//        return percipi;
//    }
//
//    public void setPercipi(Double percipi) {
//        this.percipi = percipi;
//    }
//
//    public Character getMeioameio() {
//        return meioameio;
//    }
//
//    public void setMeioameio(Character meioameio) {
//        this.meioameio = meioameio;
//    }
//
//    public Character getTpsubest() {
//        return tpsubest;
//    }
//
//    public void setTpsubest(Character tpsubest) {
//        this.tpsubest = tpsubest;
//    }
//
//    public String getModelo() {
//        return modelo;
//    }
//
//    public void setModelo(String modelo) {
//        this.modelo = modelo;
//    }
//
//    public String getTamanho() {
//        return tamanho;
//    }
//
//    public void setTamanho(String tamanho) {
//        this.tamanho = tamanho;
//    }
//
//    public Double getPerclucro() {
//        return perclucro;
//    }
//
//    public void setPerclucro(Double perclucro) {
//        this.perclucro = perclucro;
//    }
//
//    public Character getRemcontr() {
//        return remcontr;
//    }
//
//    public void setRemcontr(Character remcontr) {
//        this.remcontr = remcontr;
//    }
//
//    public Character getLibquant() {
//        return libquant;
//    }
//
//    public void setLibquant(Character libquant) {
//        this.libquant = libquant;
//    }
//
//    public Double getVlcomiavva() {
//        return vlcomiavva;
//    }
//
//    public void setVlcomiavva(Double vlcomiavva) {
//        this.vlcomiavva = vlcomiavva;
//    }
//
//    public Double getVlcomiccva() {
//        return vlcomiccva;
//    }
//
//    public void setVlcomiccva(Double vlcomiccva) {
//        this.vlcomiccva = vlcomiccva;
//    }
//
//    public Double getVlcomiapva() {
//        return vlcomiapva;
//    }
//
//    public void setVlcomiapva(Double vlcomiapva) {
//        this.vlcomiapva = vlcomiapva;
//    }
//
//    public Double getVlcomiavat() {
//        return vlcomiavat;
//    }
//
//    public void setVlcomiavat(Double vlcomiavat) {
//        this.vlcomiavat = vlcomiavat;
//    }
//
//    public Double getVlcomiccat() {
//        return vlcomiccat;
//    }
//
//    public void setVlcomiccat(Double vlcomiccat) {
//        this.vlcomiccat = vlcomiccat;
//    }
//
//    public Double getVlcomiapat() {
//        return vlcomiapat;
//    }
//
//    public void setVlcomiapat(Double vlcomiapat) {
//        this.vlcomiapat = vlcomiapat;
//    }
//
//    public Date getDtvenc01() {
//        return dtvenc01;
//    }
//
//    public void setDtvenc01(Date dtvenc01) {
//        this.dtvenc01 = dtvenc01;
//    }
//
//    public Date getDtvenc02() {
//        return dtvenc02;
//    }
//
//    public void setDtvenc02(Date dtvenc02) {
//        this.dtvenc02 = dtvenc02;
//    }
//
//    public String getLtvenc01() {
//        return ltvenc01;
//    }
//
//    public void setLtvenc01(String ltvenc01) {
//        this.ltvenc01 = ltvenc01;
//    }
//
//    public String getLtvenc02() {
//        return ltvenc02;
//    }
//
//    public void setLtvenc02(String ltvenc02) {
//        this.ltvenc02 = ltvenc02;
//    }
//
//    public Character getBalanca() {
//        return balanca;
//    }
//
//    public void setBalanca(Character balanca) {
//        this.balanca = balanca;
//    }
//
    public String getClasfiscal() {
        return clasfiscal;
    }

    public void setClasfiscal(String clasfiscal) {
        this.clasfiscal = clasfiscal;
    }
//
//    public Integer getCodaluser() {
//        return codaluser;
//    }
//
//    public void setCodaluser(Integer codaluser) {
//        this.codaluser = codaluser;
//    }
//
//    public Integer getCodcolecao() {
//        return codcolecao;
//    }
//
//    public void setCodcolecao(Integer codcolecao) {
//        this.codcolecao = codcolecao;
//    }
//
//    public Double getQuantped() {
//        return quantped;
//    }
//
//    public void setQuantped(Double quantped) {
//        this.quantped = quantped;
//    }
//
//    public Date getDtchegped() {
//        return dtchegped;
//    }
//
//    public void setDtchegped(Date dtchegped) {
//        this.dtchegped = dtchegped;
//    }
//
//    public String getCorconsul() {
//        return corconsul;
//    }
//
//    public void setCorconsul(String corconsul) {
//        this.corconsul = corconsul;
//    }
//
//    public Integer getCasadec() {
//        return casadec;
//    }
//
//    public void setCasadec(Integer casadec) {
//        this.casadec = casadec;
//    }

    public String getCst() {
        return cst;
    }

    public void setCst(String cst) {
        this.cst = cst;
    }

//    public Character getTribmono() {
//        return tribmono;
//    }
//
//    public void setTribmono(Character tribmono) {
//        this.tribmono = tribmono;
//    }
//
//    public Double getPesobruto() {
//        return pesobruto;
//    }
//
//    public void setPesobruto(Double pesobruto) {
//        this.pesobruto = pesobruto;
//    }
//
//    public Double getPesoliquido() {
//        return pesoliquido;
//    }
//
//    public void setPesoliquido(Double pesoliquido) {
//        this.pesoliquido = pesoliquido;
//    }
//
//    public Character getLibdesconto() {
//        return libdesconto;
//    }
//
//    public void setLibdesconto(Character libdesconto) {
//        this.libdesconto = libdesconto;
//    }
//
//    public String getTipoitem() {
//        return tipoitem;
//    }
//
//    public void setTipoitem(String tipoitem) {
//        this.tipoitem = tipoitem;
//    }
//
//    public String getExipi() {
//        return exipi;
//    }
//
//    public void setExipi(String exipi) {
//        this.exipi = exipi;
//    }
//
    public String getCodgen() {
        return codgen;
    }

    public void setCodgen(String codgen) {
        this.codgen = codgen;
    }
//
//    public String getCodlst() {
//        return codlst;
//    }
//
//    public void setCodlst(String codlst) {
//        this.codlst = codlst;
//    }
//
//    public String getCodanp() {
//        return codanp;
//    }
//
//    public void setCodanp(String codanp) {
//        this.codanp = codanp;
//    }
//
//    public String getCodif() {
//        return codif;
//    }
//
//    public void setCodif(String codif) {
//        this.codif = codif;
//    }
//
//    public String getClasterap() {
//        return clasterap;
//    }
//
//    public void setClasterap(String clasterap) {
//        this.clasterap = clasterap;
//    }
//
//    public String getUsoprolong() {
//        return usoprolong;
//    }
//
//    public void setUsoprolong(String usoprolong) {
//        this.usoprolong = usoprolong;
//    }
//
//    public String getRegmsmed() {
//        return regmsmed;
//    }
//
//    public void setRegmsmed(String regmsmed) {
//        this.regmsmed = regmsmed;
//    }
//
//    public String getUnidmed() {
//        return unidmed;
//    }
//
//    public void setUnidmed(String unidmed) {
//        this.unidmed = unidmed;
//    }
//
//    public String getCoddcbins() {
//        return coddcbins;
//    }
//
//    public void setCoddcbins(String coddcbins) {
//        this.coddcbins = coddcbins;
//    }
//
//    public String getCestabas() {
//        return cestabas;
//    }
//
//    public void setCestabas(String cestabas) {
//        this.cestabas = cestabas;
//    }
//
//    public String getDesonfolha() {
//        return desonfolha;
//    }
//
//    public void setDesonfolha(String desonfolha) {
//        this.desonfolha = desonfolha;
//    }
//
//    public Integer getDiasvenc() {
//        return diasvenc;
//    }
//
//    public void setDiasvenc(Integer diasvenc) {
//        this.diasvenc = diasvenc;
//    }
//
//    public String getOrigprod() {
//        return origprod;
//    }
//
//    public void setOrigprod(String origprod) {
//        this.origprod = origprod;
//    }
//
//    public Integer getIcodpro() {
//        return icodpro;
//    }
//
//    public void setIcodpro(Integer icodpro) {
//        this.icodpro = icodpro;
//    }
//
//    public String getFarmapop() {
//        return farmapop;
//    }
//
//    public void setFarmapop(String farmapop) {
//        this.farmapop = farmapop;
//    }
//
//    public Double getQuantund() {
//        return quantund;
//    }
//
//    public void setQuantund(Double quantund) {
//        this.quantund = quantund;
//    }
//
//    public String getUnidemb() {
//        return unidemb;
//    }
//
//    public void setUnidemb(String unidemb) {
//        this.unidemb = unidemb;
//    }
//
//    public String getChamatec() {
//        return chamatec;
//    }
//
//    public void setChamatec(String chamatec) {
//        this.chamatec = chamatec;
//    }
//
//    public String getDetalhe2() {
//        return detalhe2;
//    }
//
//    public void setDetalhe2(String detalhe2) {
//        this.detalhe2 = detalhe2;
//    }

    public String getCest() {
        return cest;
    }

    public void setCest(String cest) {
        this.cest = cest;
    }

//    public String getCoddcb() {
//        return coddcb;
//    }
//
//    public void setCoddcb(String coddcb) {
//        this.coddcb = coddcb;
//    }
//
//    public String getCodlista() {
//        return codlista;
//    }
//
//    public void setCodlista(String codlista) {
//        this.codlista = codlista;
//    }
//
//    public String getImpcupom() {
//        return impcupom;
//    }
//
//    public void setImpcupom(String impcupom) {
//        this.impcupom = impcupom;
//    }
//
//    public String getCodsped() {
//        return codsped;
//    }
//
//    public void setCodsped(String codsped) {
//        this.codsped = codsped;
//    }
//
//    public String getTpvencimneto() {
//        return tpvencimneto;
//    }
//
//    public void setTpvencimneto(String tpvencimneto) {
//        this.tpvencimneto = tpvencimneto;
//    }
//
//    public String getCodanvisa() {
//        return codanvisa;
//    }
//
//    public void setCodanvisa(String codanvisa) {
//        this.codanvisa = codanvisa;
//    }
//
//    public Date getDtultpedido() {
//        return dtultpedido;
//    }
//
//    public void setDtultpedido(Date dtultpedido) {
//        this.dtultpedido = dtultpedido;
//    }
//
//    public String getMedposneg() {
//        return medposneg;
//    }
//
//    public void setMedposneg(String medposneg) {
//        this.medposneg = medposneg;
//    }
//
//    public String getUnidped() {
//        return unidped;
//    }
//
//    public void setUnidped(String unidped) {
//        this.unidped = unidped;
//    }
//
//    public String getCores() {
//        return cores;
//    }
//
//    public void setCores(String cores) {
//        this.cores = cores;
//    }
//
//    public Double getFatorsubst() {
//        return fatorsubst;
//    }
//
//    public void setFatorsubst(Double fatorsubst) {
//        this.fatorsubst = fatorsubst;
//    }
//
//    public String getIndescala() {
//        return indescala;
//    }
//
//    public void setIndescala(String indescala) {
//        this.indescala = indescala;
//    }
//
//    public String getCnpjfab() {
//        return cnpjfab;
//    }
//
//    public void setCnpjfab(String cnpjfab) {
//        this.cnpjfab = cnpjfab;
//    }
//
//    public String getCbenef() {
//        return cbenef;
//    }
//
//    public void setCbenef(String cbenef) {
//        this.cbenef = cbenef;
//    }
//
//    public Double getPdif() {
//        return pdif;
//    }
//
//    public void setPdif(Double pdif) {
//        this.pdif = pdif;
//    }
//
//    public String getCombdescanp() {
//        return combdescanp;
//    }
//
//    public void setCombdescanp(String combdescanp) {
//        this.combdescanp = combdescanp;
//    }

//    public Date getDtenvserv() {
//        return dtenvserv;
//    }
//
//    public void setDtenvserv(Date dtenvserv) {
//        this.dtenvserv = dtenvserv;
//    }

//    public String getQuartobov() {
//        return quartobov;
//    }
//
//    public void setQuartobov(String quartobov) {
//        this.quartobov = quartobov;
//    }
//
//    public String getUnidadequarto() {
//        return unidadequarto;
//    }
//
//    public void setUnidadequarto(String unidadequarto) {
//        this.unidadequarto = unidadequarto;
//    }
//
//    public List<Tabprofil> getTabprofilList() {
//        return tabprofilList;
//    }
//
//    public void setTabprofilList(List<Tabprofil> tabprofilList) {
//        this.tabprofilList = tabprofilList;
//    }
//
//    public List<Tabproimp> getTabproimpList() {
//        return tabproimpList;
//    }
//
//    public void setTabproimpList(List<Tabproimp> tabproimpList) {
//        this.tabproimpList = tabproimpList;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codpro != null ? codpro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabpro)) {
            return false;
        }
        Tabpro other = (Tabpro) object;
        if ((this.codpro == null && other.codpro != null) || (this.codpro != null && !this.codpro.equals(other.codpro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.interage.importacao.entity.Tabpro[ codpro=" + codpro + " ]";
    }

    @Override
    public Object getId() {
        return codpro;
    }

    @Override
    public void setId(Object object) {
        this.codpro = object.toString();
    }

    public String getNatpro() {
        return natpro;
    }

    public void setNatpro(String natpro) {
        this.natpro = natpro;
    }

}
