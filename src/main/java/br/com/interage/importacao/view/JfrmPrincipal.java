/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.interage.importacao.view;

import br.com.interage.importacao.business.TabfilBusiness;
import br.com.interage.importacao.business.TabfilBusinessBean;
import br.com.interage.importacao.business.TabproBusinessBean;
import br.com.interage.importacao.entity.ImportacaoImp;
import br.com.interage.importacao.entity.Tabfil;
import br.com.interage.importacao.table.ItensTableModel;
import br.com.interage.importacao.utils.Actions;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.metal.MetalButtonUI;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

/**
 *
 * @author bruno
 */
public class JfrmPrincipal extends javax.swing.JFrame {

    private Actions a = new Actions();
    private ItensTableModel tableModel = null;
    private TabproBusinessBean tabproBusiness = new TabproBusinessBean();
    private TabfilBusiness tabfilBusiness = new TabfilBusinessBean();

    /**
     * Creates new form JfrmPrincipal
     */
    public JfrmPrincipal() {
        initComponents();
        definirFormulario();
    }

    public void definirFormulario() {
        a.iconApplication(this);
        this.setName("importacao");
        this.setTitle("Importação de Imposto");
        this.setSize(1200, 600);
        jProgressBar.setVisible(false);
        setLocationRelativeTo(null);
        a.mapearTeclas(this);
        jCbxFilial.setModel(new DefaultComboBoxModel(tabfilBusiness.getAll().toArray(new Tabfil[]{})));
        carregarImpostos(jCbxFilial.getItemAt(0).getCodfil());

    }

    public void carregarImpostos(Integer codfil) {
        tableModel = new ItensTableModel(tabproBusiness.getImportacaoImpostos(codfil));
        jTable.setModel(tableModel);
        JlblTotal.setText("" + jTable.getRowCount());

        jTable.setAutoResizeMode(jTable.AUTO_RESIZE_OFF);
        a.setColumnMinWidth(jTable, 0, 300);
        a.setColumn(jTable, 1, 150);
        a.setColumn(jTable, 2, 150);
        a.setColumn(jTable, 3, 150);
        a.setColumn(jTable, 4, 120);
        a.setColumn(jTable, 5, 120);
        a.setColumn(jTable, 6, 120);
        a.setColumn(jTable, 7, 120);
        a.setColumn(jTable, 8, 120);
        a.setColumn(jTable, 9, 120);
        a.setColumn(jTable, 10, 120);
        a.setColumn(jTable, 11, 120);
        a.setColumn(jTable, 12, 150);
        a.setColumn(jTable, 13, 150);
        a.setColumn(jTable, 14, 150);
        a.setColumn(jTable, 15, 150);
        jButton1.setUI(new MetalButtonUI());
        jButton2.setUI(new MetalButtonUI());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel(){
            protected  void paintComponent(Graphics g){
                super.paintComponent(g);
                ImageIcon icon = new ImageIcon(getClass().getResource("/imagens/fundo.png"));
                Image image = icon.getImage();
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }};
            jScrollPane1 = new javax.swing.JScrollPane();
            jTable = new javax.swing.JTable();
            jCbxFilial = new javax.swing.JComboBox<>();
            jButton1 = new javax.swing.JButton();
            jButton2 = new javax.swing.JButton();
            jPanel2 = new javax.swing.JPanel();
            jLabel1 = new javax.swing.JLabel();
            JlblTotal = new javax.swing.JLabel();
            jProgressBar = new javax.swing.JProgressBar();

            setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
            addWindowListener(new java.awt.event.WindowAdapter() {
                public void windowClosing(java.awt.event.WindowEvent evt) {
                    formWindowClosing(evt);
                }
                public void windowOpened(java.awt.event.WindowEvent evt) {
                    formWindowOpened(evt);
                }
            });
            getContentPane().setLayout(new java.awt.CardLayout());

            jTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
                },
                new String [] {
                    "Title 1", "Title 2", "Title 3", "Title 4"
                }
            ));
            jTable.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jTableMouseClicked(evt);
                }
            });
            jTable.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    jTableKeyPressed(evt);
                }
            });
            jScrollPane1.setViewportView(jTable);

            jCbxFilial.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
            jCbxFilial.addItemListener(new java.awt.event.ItemListener() {
                public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    jCbxFilialItemStateChanged(evt);
                }
            });

            jButton1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
            jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/import-sped2.png"))); // NOI18N
            jButton1.setMnemonic('i');
            jButton1.setText("[ ALT + I ] - Importar Arquivo(Excel)");
            jButton1.setToolTipText("");
            jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            jButton1.setFocusable(false);
            jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            jButton1.setMargin(new java.awt.Insets(2, 0, 2, 14));
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            jButton2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
            jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/export.png"))); // NOI18N
            jButton2.setMnemonic('e');
            jButton2.setText(" [ ALT + E ] - Exportar Arquivo(Excel)");
            jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            jButton2.setFocusable(false);
            jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            jButton2.setMargin(new java.awt.Insets(2, 0, 2, 14));
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2ActionPerformed(evt);
                }
            });

            jPanel2.setBackground(new java.awt.Color(58, 53, 53));
            jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));

            jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(255, 255, 255));
            jLabel1.setText("Total Itens :");

            JlblTotal.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
            JlblTotal.setForeground(new java.awt.Color(255, 255, 255));
            JlblTotal.setText("0");

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(36, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(JlblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(JlblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
            );

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1017, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jCbxFilial, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(jProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(170, 170, 170)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap())
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCbxFilial, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(24, 24, 24))))
            );

            getContentPane().add(jPanel1, "card2");

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        if (evt.getClickCount() == 2) {
//            openDialogItens();
        }
    }//GEN-LAST:event_jTableMouseClicked

    private void jTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
//            openDialogItens();
        }
    }//GEN-LAST:event_jTableKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            if (!tableModel.getResultList().isEmpty()) {
                JFileChooser chooser = new JFileChooser();
                chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int i = chooser.showSaveDialog(this);
                if (i == JFileChooser.APPROVE_OPTION) {
                    i = 0;
                    String filename = chooser.getSelectedFile().getAbsolutePath() + ".xls";
                    HSSFWorkbook workbook = new HSSFWorkbook();
                    HSSFSheet sheet = workbook.createSheet("FirstSheet");

                    HSSFCellStyle txtStyle1 = (HSSFCellStyle) workbook.createCellStyle();
                    HSSFCellStyle txtStyle2 = (HSSFCellStyle) workbook.createCellStyle();
                    HSSFCellStyle txtStyle3 = (HSSFCellStyle) workbook.createCellStyle();

                    HSSFFont txtFont1 = (HSSFFont) workbook.createFont();
                    HSSFFont txtFont2 = (HSSFFont) workbook.createFont();
                    HSSFFont txtFont3 = (HSSFFont) workbook.createFont();

                    txtFont1.setFontName("Arial");
                    txtFont1.setFontHeightInPoints((short) 18);
                    txtFont1.setBold(true);
                    txtFont1.setColor((short) 003366);
                    txtStyle1.setFont(txtFont1);

                    txtFont2.setFontHeightInPoints((short) 14);
                    txtFont2.setFontName("Arial");
                    txtFont2.setColor((short) 003366);
                    txtStyle2.setFont(txtFont2);

                    txtFont3.setFontHeightInPoints((short) 11);
                    txtFont3.setFontName("Arial");
                    txtFont3.setBold(true);
                    txtFont3.setColor((short) 003366);
                    txtStyle3.setFont(txtFont3);

                    //******************* titulo ************************
                    HSSFRow rowTitulo = sheet.createRow((short) i++);
                    rowTitulo.createCell(4).setCellValue("Importação de Impostos");
                    rowTitulo.getCell(4).setCellStyle(txtStyle1);

                    HSSFRow rowfilial = sheet.createRow((short) i++);
                    rowfilial.createCell(0).setCellValue("Filial: ");
                    rowfilial.createCell(1).setCellValue(((Tabfil) jCbxFilial.getModel().getSelectedItem()).toString());
                    rowfilial.getCell(0).setCellStyle(txtStyle2);
                    rowfilial.getCell(1).setCellStyle(txtStyle2);

                    HSSFRow rowHeader2 = sheet.createRow((short) i++);
                    rowHeader2.createCell(0).setCellValue("Produto");
                    rowHeader2.createCell(1).setCellValue("Cód Produto");
                    rowHeader2.createCell(2).setCellValue("Cód Barras");
                    rowHeader2.createCell(3).setCellValue("Gênero");
                    rowHeader2.createCell(4).setCellValue("NCM");
                    rowHeader2.createCell(5).setCellValue("CFOP");
                    rowHeader2.createCell(6).setCellValue("CEST");
                    rowHeader2.createCell(7).setCellValue("CST");
                    rowHeader2.createCell(8).setCellValue("Icms Saída");
                    rowHeader2.createCell(9).setCellValue("Pis Entrada");
                    rowHeader2.createCell(10).setCellValue("Pis Saída");
                    rowHeader2.createCell(11).setCellValue("Cofins Entrada");
                    rowHeader2.createCell(12).setCellValue("Cofins Saída");
                    rowHeader2.createCell(13).setCellValue("Nat Produto");
                    rowHeader2.createCell(14).setCellValue("Alíquota Pis");
                    rowHeader2.createCell(15).setCellValue("Alíquota Cofins");
                    rowHeader2.getCell(0).setCellStyle(txtStyle3);
                    rowHeader2.getCell(1).setCellStyle(txtStyle3);
                    rowHeader2.getCell(2).setCellStyle(txtStyle3);
                    rowHeader2.getCell(3).setCellStyle(txtStyle3);
                    rowHeader2.getCell(4).setCellStyle(txtStyle3);
                    rowHeader2.getCell(5).setCellStyle(txtStyle3);
                    rowHeader2.getCell(6).setCellStyle(txtStyle3);
                    rowHeader2.getCell(7).setCellStyle(txtStyle3);
                    rowHeader2.getCell(8).setCellStyle(txtStyle3);
                    rowHeader2.getCell(9).setCellStyle(txtStyle3);
                    rowHeader2.getCell(10).setCellStyle(txtStyle3);
                    rowHeader2.getCell(11).setCellStyle(txtStyle3);
                    rowHeader2.getCell(12).setCellStyle(txtStyle3);
                    rowHeader2.getCell(13).setCellStyle(txtStyle3);
                    rowHeader2.getCell(14).setCellStyle(txtStyle3);
                    rowHeader2.getCell(15).setCellStyle(txtStyle3);

                    //***************************************************
                    DecimalFormat Formata = new DecimalFormat("#,##0.00");
                    int cont = 1;
                    for (ImportacaoImp item : tableModel.getResultList()) {

                        HSSFRow rowHeader3 = sheet.createRow(i++);
                        rowHeader3.createCell(0).setCellValue(item.getNomeproduto());
                        rowHeader3.createCell(1).setCellValue(item.getCodigoproduto());
                        rowHeader3.createCell(2).setCellValue(item.getCodigobarra());
                        rowHeader3.createCell(3).setCellValue(item.getGenero());
                        rowHeader3.createCell(4).setCellValue(item.getNcm());
                        rowHeader3.createCell(5).setCellValue(item.getCfop());
                        rowHeader3.createCell(6).setCellValue(item.getCest());
                        rowHeader3.createCell(7).setCellValue(item.getCst());
                        rowHeader3.createCell(8).setCellValue(item.getIcmsSaida());
                        rowHeader3.createCell(9).setCellValue(item.getPisentrada());
                        rowHeader3.createCell(10).setCellValue(item.getPissaida());
                        rowHeader3.createCell(11).setCellValue(item.getCofinsentrada());
                        rowHeader3.createCell(12).setCellValue(item.getCofinssaida());
                        rowHeader3.createCell(13).setCellValue(item.getNaturezaproduto());
                        rowHeader3.createCell(14).setCellValue(Formata.format(item.getAliquotaPis()));
                        rowHeader3.createCell(15).setCellValue(Formata.format(item.getAliquotaCofins()));

                        cont++;
                    }

                    FileOutputStream fileOut = new FileOutputStream(filename);
                    workbook.write(fileOut);
                    fileOut.close();
                    workbook.close();

                    JOptionPane.showMessageDialog(null, "Arquivo Exportado com Sucesso", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Operação cancelada pelo usuário!!", null, JOptionPane.ERROR_MESSAGE);
                }

            }
        } catch (Exception ex) {
            JDlgMensagem mensagem = new JDlgMensagem(this, true, ex);
            System.out.println(ex.getMessage());
            mensagem.setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int resp = JOptionPane.showConfirmDialog(this, "Deseja realmente sair do sistema?", null, JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void jCbxFilialItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCbxFilialItemStateChanged
        if (evt.getStateChange() == evt.SELECTED) {
            carregarImpostos(((Tabfil) jCbxFilial.getSelectedItem()).getCodfil());
        }
    }//GEN-LAST:event_jCbxFilialItemStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        boolean resp = jDlgBoasVindas.jDlgBoasVindasIniciar(this);
    }//GEN-LAST:event_formWindowOpened

    private Integer codfil = null;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            List<ImportacaoImp> result = new ArrayList<>();
            JFileChooser chooser = new JFileChooser();
            chooser.setMultiSelectionEnabled(true);
            chooser.setFileFilter(new FileNameExtensionFilter("Arquivos do Excel", "xlsx", "xlsm", "xlsb", "xltx", "xltm", "xls", "xlt", "xml", "xlam", "xla", "xlw", "xlr", "csv"));
            int resp = chooser.showOpenDialog(this);
            if (resp == JFileChooser.APPROVE_OPTION) {
                for (File f : chooser.getSelectedFiles()) {
                    FileInputStream fips = new FileInputStream(f);
                    HSSFWorkbook workbook = new HSSFWorkbook(fips);
                    HSSFSheet linhas = workbook.getSheetAt(0);

                    for (int i = 0; i < linhas.getPhysicalNumberOfRows(); i++) {
                        Row linha = linhas.getRow(i);
                        if (i == 1) {
                            codfil = Integer.parseInt(linha.getCell(1).getRichStringCellValue().toString().split("-")[0].trim());
                        }
                        if (i > 2) {
                            ImportacaoImp imp = new ImportacaoImp();
//                            imp.setNomeproduto(linha.getCell(0).getCellTypeEnum().name().equals("STRING") ? linha.getCell(0).getRichStringCellValue().toString() : ((Double) linha.getCell(0).getNumericCellValue()).toString().replace(".0", ""));
//                            imp.setNomeproduto(((Double) linha.getCell(0).getNumericCellValue()).toString());
                            imp.setNomeproduto(linha.getCell(0).getCellTypeEnum().name().equals("STRING") ? linha.getCell(0).getRichStringCellValue().toString() : ((Double) linha.getCell(0).getNumericCellValue()).toString().replace(".0", ""));
                            imp.setCodigoproduto(linha.getCell(1).getCellTypeEnum().name().equals("STRING") ? linha.getCell(1).getRichStringCellValue().toString() : ((Double) linha.getCell(1).getNumericCellValue()).toString().replace(".0", ""));
                            imp.setCodigobarra(linha.getCell(2).getCellTypeEnum().name().equals("STRING") ? linha.getCell(2).getRichStringCellValue().toString() : ((Double) linha.getCell(2).getNumericCellValue()).toString().replace(".0", ""));
                            imp.setGenero(linha.getCell(3).getCellTypeEnum().name().equals("STRING") ? linha.getCell(3).getRichStringCellValue().toString() : ((Double) linha.getCell(3).getNumericCellValue()).toString().replace(".0", ""));
                            imp.setNcm(linha.getCell(4).getCellTypeEnum().name().equals("STRING") ? linha.getCell(4).getRichStringCellValue().toString() == null ? "0.0" : linha.getCell(4).getRichStringCellValue().toString() : ((Double) linha.getCell(4).getNumericCellValue()).toString().replace(".0", ""));
                            imp.setCfop(linha.getCell(5).getCellTypeEnum().name().equals("STRING") ? linha.getCell(5).getRichStringCellValue().toString() == null ? "0.0" : linha.getCell(5).getRichStringCellValue().toString() : ((Double) linha.getCell(5).getNumericCellValue()).toString().replace(".0", ""));
                            imp.setCest(linha.getCell(6).getCellTypeEnum().name().equals("STRING") ? linha.getCell(6).getRichStringCellValue().toString() == null ? "0.0" : linha.getCell(6).getRichStringCellValue().toString() : ((Double) linha.getCell(6).getNumericCellValue()).toString().replace(".0", ""));
                            imp.setCst(linha.getCell(7).getCellTypeEnum().name().equals("STRING") ? linha.getCell(7).getRichStringCellValue().toString() == null ? "0.0" : linha.getCell(7).getRichStringCellValue().toString() : ((Double) linha.getCell(7).getNumericCellValue()).toString().replace(".0", ""));
                            imp.setIcmsSaida(linha.getCell(8).getCellTypeEnum().name().equals("STRING") ? new DecimalFormat("#,##0").parse(linha.getCell(8).getRichStringCellValue().toString() == null ? "0.0" : linha.getCell(8).getRichStringCellValue().toString().trim()).doubleValue() : linha.getCell(8).getNumericCellValue());
                            imp.setPisentrada(linha.getCell(9).getCellTypeEnum().name().equals("STRING") ? linha.getCell(9).getRichStringCellValue().toString() == null ? "0.0" : linha.getCell(9).getRichStringCellValue().toString().trim() : ((Double) linha.getCell(9).getNumericCellValue()).toString().replace(".0", ""));
                            imp.setPissaida(linha.getCell(10).getCellTypeEnum().name().equals("STRING") ? linha.getCell(10).getRichStringCellValue().toString() == null ? "0.0" : linha.getCell(10).getRichStringCellValue().toString().trim() : ((Double) linha.getCell(10).getNumericCellValue()).toString().replace(".0", ""));
                            imp.setCofinsentrada(linha.getCell(11).getCellTypeEnum().name().equals("STRING") ? linha.getCell(11).getRichStringCellValue().toString() == null ? "0.0" : linha.getCell(11).getRichStringCellValue().toString().trim() : ((Double) linha.getCell(11).getNumericCellValue()).toString().replace(".0", ""));
                            imp.setCofinssaida(linha.getCell(12).getCellTypeEnum().name().equals("STRING") ? linha.getCell(12).getRichStringCellValue().toString() == null ? "0.0" : linha.getCell(12).getRichStringCellValue().toString(): ((Double) linha.getCell(12).getNumericCellValue()).toString().replace(".0", ""));
                            imp.setNaturezaproduto(linha.getCell(13).getCellTypeEnum().name().equals("STRING") ? linha.getCell(13).getRichStringCellValue().toString() == null ? "0.0" : linha.getCell(13).getRichStringCellValue().toString().trim() : ((Double) linha.getCell(13).getNumericCellValue()).toString().replace(".0", ""));
                            imp.setAliquotaPis(linha.getCell(14).getCellTypeEnum().name().equals("STRING") ? new DecimalFormat("#,##0.00").parse(linha.getCell(14).getRichStringCellValue().toString() == null ? "0.0" : linha.getCell(14).getRichStringCellValue().toString().trim()).doubleValue() : linha.getCell(14).getNumericCellValue());
                            imp.setAliquotaCofins(linha.getCell(15).getCellTypeEnum().name().equals("STRING") ? new DecimalFormat("#,##0.00").parse(linha.getCell(15).getRichStringCellValue().toString() == null ? "0.0" : linha.getCell(15).getRichStringCellValue().toString().trim()).doubleValue() : linha.getCell(15).getNumericCellValue());
                            result.add(imp);
                        }
                    }

//                    Runnable runnable = new JDlgCarregandoApp.ShowAndWait(new Runnable() {
//                        @Override
//                        public void run() {
//                            try {
//                                
//                            } catch (Exception ex) {
//                                ex.getLocalizedMessage();
//                                JOptionPane.showMessageDialog(null, ex.getMessage());
//                            }
//                        }
//                    },this);
//                    runnable.run();
                    new Thread(new Runnable() {
                        @Override
                        public void run() {

                            try {
                                jProgressBar.setVisible(true);
                                jProgressBar.setIndeterminate(true);
                                tabproBusiness.updateImpostoImp(result, codfil);
                                carregarImpostos(codfil);
                                jProgressBar.setVisible(false);
                                JOptionPane.showMessageDialog(null, "Arquivo Importado com sucesso !!");
                            } catch (Exception ex) {
                               ex.printStackTrace();
                                JDlgMensagem mensagem = new JDlgMensagem(null, true, ex);
                                mensagem.setVisible(true);
                                jProgressBar.setVisible(false);
                            }
                        }
                    }).start();

                }

            } else {
                JOptionPane.showMessageDialog(this, "Operação cancelada pelo usuário!!", null, JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            JDlgMensagem mensagem = new JDlgMensagem(this, true, ex);
            mensagem.setVisible(true);
            jProgressBar.setVisible(false);
//            JOptionPane.showMessageDialog(this, ex.getMessage(), null, JOptionPane.ERROR_MESSAGE);
        }
//        JOptionPane.showMessageDialog(this, "!! Em desenvolvimento !! ");
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JfrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlblTotal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<Tabfil> jCbxFilial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
