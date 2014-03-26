/*
 * Autopsy Forensic Browser
 *
 * Copyright 2011 Basis Technology Corp.
 * Contact: carrier <at> sleuthkit <dot> org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sleuthkit.autopsy.casemodule;

import org.openide.util.NbBundle;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 * visual component of 2nd panle in add image wizard. allows the user to
 * configure ingest modules. delegates most details to ingestPanel attribute.
 *
 *
 */
 class AddImageWizardIngestConfigVisual extends javax.swing.JPanel {

    //could this be something more specific than JPanel? - jm
    private JPanel ingestPanel = null;

    /**
     * Creates new form AddImageVisualPanel3
     */
    public AddImageWizardIngestConfigVisual(JPanel ingestPanel) {
        this.ingestPanel = ingestPanel;
        initComponents();
        customizeComponents();
    }

    private void customizeComponents() {
        configPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        configPanel.setLayout(new BorderLayout());
        configPanel.add(ingestPanel, BorderLayout.CENTER);
    }

    /**
     * Returns the name of the this panel. This name will be shown on the left
     * panel of the "Add Image" wizard panel.
     *
     * @return name the name of this panel
     */
    @Override
    public String getName() {
        return NbBundle.getMessage(this.getClass(), "AddImageWizardIngestConfigVisual.getName.text");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        subtitleLabel = new javax.swing.JLabel();
        configPanel = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(569, 300));

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titleLabel.setText(org.openide.util.NbBundle.getMessage(AddImageWizardIngestConfigVisual.class, "AddImageWizardIngestConfigVisual.titleLabel.text")); // NOI18N

        subtitleLabel.setText(org.openide.util.NbBundle.getMessage(AddImageWizardIngestConfigVisual.class, "AddImageWizardIngestConfigVisual.subtitleLabel.text")); // NOI18N

        configPanel.setPreferredSize(new java.awt.Dimension(569, 255));

        javax.swing.GroupLayout configPanelLayout = new javax.swing.GroupLayout(configPanel);
        configPanel.setLayout(configPanelLayout);
        configPanelLayout.setHorizontalGroup(
            configPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 569, Short.MAX_VALUE)
        );
        configPanelLayout.setVerticalGroup(
            configPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(subtitleLabel)))
                .addContainerGap(218, Short.MAX_VALUE))
            .addComponent(configPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titleLabel)
                .addGap(5, 5, 5)
                .addComponent(subtitleLabel)
                .addGap(18, 18, 18)
                .addComponent(configPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel configPanel;
    private javax.swing.JLabel subtitleLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
