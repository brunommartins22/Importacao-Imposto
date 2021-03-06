package br.com.interage.importacao.view;

import br.com.interage.importacao.utils.Actions;
import br.com.interage.importacao.utils.JPAUtil;

import java.awt.Window;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;

public class JDlgCarregandoApp extends javax.swing.JDialog {

    private Actions a = new Actions();

    public JDlgCarregandoApp(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public JDlgCarregandoApp(Window window, String title, ModalityType type) {
        super(window, title, type);
        initComponents();
        definirFormulario();
    }

    private void definirFormulario() {
        a.iconApplication(this);
        dispose();

        setUndecorated(true);
        //**********************************************************************
//        a.settingImgJLabel(jLblImg, "/imagens/carregando.png", 650, 250, 100);
        jLblImg.add(new JLabel(new ImageIcon(getClass().getResource("/imagens/carregando.gif"))));

        pack();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLblImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLblImg.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        getContentPane().add(jLblImg, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        Runnable runnable = new ShowAndWait(new Runnable() {
            @Override
            public void run() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        },new JFrame());
        runnable.run();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLblImg;
    // End of variables declaration//GEN-END:variables

    public static class ShowAndWait implements Runnable {

        Runnable runnable = null;
        JFrame frame = null;

        public ShowAndWait(Runnable r, JFrame f) {
            runnable = r;
            frame=f;
        }

        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                runnable.run();
                return null;
            }

        };

        @Override
        public void run() {

            Window window = SwingUtilities.getWindowAncestor(frame);

            JDlgCarregandoApp dialog = new JDlgCarregandoApp(window, "carregando", ModalityType.APPLICATION_MODAL);

            worker.addPropertyChangeListener((evt) -> {
                if (evt.getPropertyName().equals("state")) {
                    if (evt.getNewValue() == SwingWorker.StateValue.DONE) {
                      dialog.dispose();
                    }
                }
            });

            worker.execute();

            dialog.setVisible(true);

        }

    }

//    public static void verificarLiberacao() {
//
//        ArquivoBusiness arquivoBusiness = new ArquivoBusinessBean();
//
//        //Busca o arquivo de atualização mais recente do banco
//        Arquivo liberacao = arquivoBusiness.getLiberacao();
//
//        try {
//
//            //Descriptografa o texto
//            String texto = descriptografarLiberacao(7, liberacao.getArquivo());
//
//            //Carrega em um properties
//            Properties props = new Properties();
//
//            props.load(new StringReader(texto));
//
//            //Pega a propriedade VERSAOMDFE
//            String versao = props.getProperty("VERSAOESTOQUE");
//
//            //Pega a propriedade LIBMDFE
//            String libMdfe = props.getProperty("LIBESTOQUE");
//
//            //Pega a propriedade VENCIMENTOMDFE
//            String dataTemp = props.getProperty("VENCIMENTOESTOQUE");
//
//            //Se for diferente de null
//            if (libMdfe != null) {
//
//                System.out.println("Versão:" + versao);
//                if (versao.equals("X3") == false) {
//                    JOptionPane.showMessageDialog(null, "Versão não autorizada: '" + versao + "'!\n"
//                            + "Solicite liberação para versão X3.");
//
//                    System.exit(0);
//                }
//
//                //Se a prop libMdfe for 'S' 
//                if (libMdfe.equals("S")) {
//
//                    //Converte a data de vencimento de String para Date
//                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//                    Date dataVenc = sdf.parse(dataTemp);
//
//                    //Pega data atual
//                    Date dataAtual = new Date(sdf.parse(sdf.format(System.currentTimeMillis())).getTime());
//
//                    System.out.println("Data Atual:" + dataAtual);
//                    System.out.println("Data Venc:" + dataVenc);
//
//                    //Compara a data atual com o vencimento
//                    if (dataAtual.compareTo(dataVenc) < 0 || dataAtual.compareTo(dataVenc) == 0) {
//                        //Não está vencido
//
//                        if (props.getProperty("CNPJLIBERADO") != null) {
//
//                            String[] cnpjsLib = props.getProperty("CNPJLIBERADO").split(";");
//
//                            //Grava os cnpj's liberados
//                            for (String cnpjLib : cnpjsLib) {
//                                //Sessao.getCnpjs().add(cnpjLib);
//                            }
//
//                        }
//
//                    } else if (dataAtual.compareTo(dataVenc) > 0) {
//                        //Está vencido
//                        JOptionPane.showMessageDialog(null, "Sua licensa de uso expirou.\n"
//                                + "Favor entrar em contato com a INTERAGE\n"
//                                + "www.interagese.com.br - interagesac@hotmail.com\n"
//                                + "Fone: (91)3263-6261 (91)3088-1588 (91)8114-2418");
//                        System.exit(0);
//                    }
//
//                } else {
//                    JOptionPane.showMessageDialog(null, "Sistema não liberado para uso!\n"
//                            + "Solicite liberação para este sistema.");
//                    System.exit(0);
//                }
//            } else {
//                JOptionPane.showMessageDialog(null, "Sistema de Download de notas não liberado para uso!\n"
//                        + "Solicite liberação para este sistema.");
//                System.exit(0);
//            }
//
//        } catch (IOException ex) {
//            Logger.getLogger(JDlgSplashScreen.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ParseException ex) {
//            Logger.getLogger(JDlgSplashScreen.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }
    public static String descriptografarLiberacao(int chave, String texto) throws IOException {

        String resultado = "";

        for (int i = 0; i < texto.length(); i++) {
            resultado += ((char) (((int) texto.charAt(i) - chave) % 255));
        }

        System.out.println("Liberação: " + resultado);

        //System.out.println(resultado);
        return resultado;
    }

}
