/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CreditsDialog.java
 *
 * Created on Dec 20, 2008, 5:05:34 PM
 */
package ihmprojet2.IHM;

import java.awt.Frame;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class CreditsDialog extends javax.swing.JDialog {

    public CreditsDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        animate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        copyrightLabel = new javax.swing.JLabel();
        JissImgLabel = new javax.swing.JLabel();
        gcarrierImgLabel = new javax.swing.JLabel();
        JissLabel = new javax.swing.JLabel();
        gcarrierLabel = new javax.swing.JLabel();
        mitLicLabel = new javax.swing.JTextPane();
        iconsLicLabel = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("About...");
        setResizable(false);

        copyrightLabel.setText("Copyright (c) 2008");
        copyrightLabel.setName("copyrightLabel"); // NOI18N

        JissImgLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance().getContext().getResourceMap(CreditsDialog.class);
        JissImgLabel.setIcon(resourceMap.getIcon("ICON_JC")); // NOI18N
        JissImgLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        JissImgLabel.setName("JissImgLabel"); // NOI18N

        gcarrierImgLabel.setIcon(resourceMap.getIcon("ICON_GEOFFROY")); // NOI18N
        gcarrierImgLabel.setName("gcarrierImgLabel"); // NOI18N

        JissLabel.setText("Jean-Christophe Saad-Dupuy,");
        JissLabel.setName("JissLabel"); // NOI18N

        gcarrierLabel.setText("Geoffroy Carrier");
        gcarrierLabel.setName("gcarrierLabel"); // NOI18N

        mitLicLabel.setEditable(false);
        mitLicLabel.setText("Permission is hereby granted, free of charge, to any person obtaining a copy\nof this software and associated documentation files (the \"Software\"), to deal\nin the Software without restriction, including without limitation the rights\nto use, copy, modify, merge, publish, distribute, sublicense, and/or sell\ncopies of the Software, and to permit persons to whom the Software is\nfurnished to do so, subject to the following conditions:\n\nThe above copyright notice and this permission notice shall be included in\nall copies or substantial portions of the Software.\n\nTHE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\nIMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\nFITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\nAUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\nLIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,\nOUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN\nTHE SOFTWARE."); // NOI18N
        mitLicLabel.setFocusable(false);
        mitLicLabel.setName("mitLicLabel"); // NOI18N

        iconsLicLabel.setEditable(false);
        iconsLicLabel.setText("Icons, on the other hand, CANNOT be redistributed.\nCopyright (c) 2007 David Lanham & (c) 2003-2008 FastIcon Studio."); // NOI18N
        iconsLicLabel.setFocusable(false);
        iconsLicLabel.setName("iconsLicLabel"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(copyrightLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JissImgLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(JissLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gcarrierImgLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(gcarrierLabel))))
                    .addComponent(mitLicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconsLicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(copyrightLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JissImgLabel)
                    .addComponent(gcarrierImgLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JissLabel)
                    .addComponent(gcarrierLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mitLicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(iconsLicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void animate() {
        final Point jpi = JissImgLabel.getLocation();
        final Point gpi = gcarrierImgLabel.getLocation();
        t = new Timer(50, new ActionListener() {

            Point jp, gp;

            public void actionPerformed(ActionEvent e) {
                gp = (Point) gpi.clone();
                jp = (Point) jpi.clone();
                gp.translate((int) (Math.random() * 32 - 16), (int) (Math.random() * 32 - 16));
                jp.translate((int) (Math.random() * 32 - 16), (int) (Math.random() * 32 - 16));
                JissImgLabel.setLocation(jp);
                gcarrierImgLabel.setLocation(gp);
            }
        });
        t.start();
    }

    public static void launch(Frame parent, boolean modal) {
        final CreditsDialog dialog = new CreditsDialog(parent, modal);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {

            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                dialog.t.stop();
            }
        });
        dialog.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JissImgLabel;
    private javax.swing.JLabel JissLabel;
    private javax.swing.JLabel copyrightLabel;
    private javax.swing.JLabel gcarrierImgLabel;
    private javax.swing.JLabel gcarrierLabel;
    private javax.swing.JTextPane iconsLicLabel;
    private javax.swing.JTextPane mitLicLabel;
    // End of variables declaration//GEN-END:variables
    private Timer t;
}
