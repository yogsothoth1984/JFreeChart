package freechart;
import javax.swing.JFrame;
import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import  org.jfree.data.*;
import  org.jfree.data.category.DefaultCategoryDataset;

public class Ventana extends javax.swing.JFrame implements Cloneable{
    JFreeChart grafica;
    DefaultCategoryDataset datos=new DefaultCategoryDataset();
    
    public Ventana() {
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBoton = new javax.swing.JButton();
        jBoton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBoton.setText("Graficos");
        jBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonActionPerformed(evt);
            }
        });

        jBoton2.setText("Graficos editables");
        jBoton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBoton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jBoton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jBoton2)
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBoton2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonActionPerformed
        datos.addValue(1,"Negocio1","Lunes");
        datos.addValue(2,"Negocio1","Martes");
        datos.addValue(3,"Negocio1","Miercoles");
        datos.addValue(4,"Negocio1","Jueves");
        datos.addValue(5,"Negocio1","Viernes");
        datos.addValue(6,"Negocio1","Sabado");
        datos.addValue(7,"Negocio1","domingo");
        
        datos.addValue(2, "Negocio 2", "Lunes");
        datos.addValue(4, "Negocio 2", "Martes");
        datos.addValue(6, "Negocio 2", "Miércoles");
        datos.addValue(8, "Negocio 2", "Jueves");
        datos.addValue(10, "Negocio 2", "Viernes");
        datos.addValue(12, "Negocio 2", "Sábado");
        datos.addValue(14, "Negocio 2", "Domingo");
        
        JFreeChart grafica=ChartFactory.createBarChart("Visitas diarias", "Dias", "Visitas",
                datos,PlotOrientation.VERTICAL,true,true,false);
        
        ChartPanel panel=new ChartPanel(grafica);
        /*Creamos un Panel y colocamos dentro nuestra gráfica*/
        
        JFrame jVentana=new JFrame("JFreeChart");
        /*Creamos un nuevo Frame para nuestra gráfica*/
        
        jVentana.getContentPane().add(panel);
        /*Agregamos el panel a la nueva ventana*/
        
        jVentana.pack();
        /*Reseteamos la ventana*/
        
        jVentana.setVisible(true);
        /*Hacemos visible la nueva ventana*/
        
        jVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*Establecemos la acción que hará la ventana cuando se presione el botón de cerrar la ventana*/
    }//GEN-LAST:event_jBotonActionPerformed

    private void jBoton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBoton2ActionPerformed
        
    }//GEN-LAST:event_jBoton2ActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBoton;
    private javax.swing.JButton jBoton2;
    // End of variables declaration//GEN-END:variables
}
