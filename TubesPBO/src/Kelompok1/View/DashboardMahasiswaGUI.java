/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kelompok1.View;

/**
 *
 * @author TaufikH
 */
public class DashboardMahasiswaGUI extends javax.swing.JFrame {

    /**
     * Creates new form DashboardMasiswaGUI
     */
    public DashboardMahasiswaGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BodyPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ButtonLogout = new javax.swing.JButton();
        ButtonProfile = new javax.swing.JButton();
        ButtonHome = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        HomeLayout = new javax.swing.JPanel();
        Notifikasi = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        ProfileLayout = new javax.swing.JPanel();
        HomeProfile = new javax.swing.JPanel();
        ButtonTambahProfile = new javax.swing.JButton();
        ButtonEditProfile = new javax.swing.JButton();
        LabelNamaHome = new javax.swing.JLabel();
        LabelNIMHome = new javax.swing.JLabel();
        LabelTTLHome = new javax.swing.JLabel();
        LabelEmailHome = new javax.swing.JLabel();
        LabelNoTelHome = new javax.swing.JLabel();
        AddProfile = new javax.swing.JPanel();
        LabelTambahProfile = new javax.swing.JLabel();
        addNama = new javax.swing.JLabel();
        addNIM = new javax.swing.JLabel();
        addNoTel = new javax.swing.JLabel();
        addEmail = new javax.swing.JLabel();
        FieldAddNama = new javax.swing.JTextField();
        FieldAddNIM = new javax.swing.JTextField();
        FieldAddNoTel = new javax.swing.JTextField();
        FieldAddEmail = new javax.swing.JTextField();
        ButtonSimpanTambahProfile = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        addEmail1 = new javax.swing.JLabel();
        FieldAddEmail1 = new javax.swing.JTextField();
        EditProfile = new javax.swing.JPanel();
        editNama = new javax.swing.JLabel();
        editNIM = new javax.swing.JLabel();
        editNoTel = new javax.swing.JLabel();
        editEmail = new javax.swing.JLabel();
        FieldEditNama = new javax.swing.JTextField();
        FieldEditNIM = new javax.swing.JTextField();
        FieldEditNoTel = new javax.swing.JTextField();
        FieldEditEmail = new javax.swing.JTextField();
        ButtonSimpanEditProfile = new javax.swing.JButton();
        LabelEdit = new javax.swing.JLabel();
        editNoTel1 = new javax.swing.JLabel();
        FieldEditTTL = new javax.swing.JTextField();
        ButtonKembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BodyPanel.setBackground(new java.awt.Color(204, 0, 51));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel3.setBackground(new java.awt.Color(204, 0, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Dashboard ");

        ButtonLogout.setText("Logout");
        ButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLogoutActionPerformed(evt);
            }
        });

        ButtonProfile.setText("Profile");
        ButtonProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonProfileActionPerformed(evt);
            }
        });

        ButtonHome.setText("Home");
        ButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonHome)
                .addGap(18, 18, 18)
                .addComponent(ButtonProfile)
                .addGap(18, 18, 18)
                .addComponent(ButtonLogout)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonLogout)
                    .addComponent(ButtonProfile)
                    .addComponent(ButtonHome))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setLayout(new java.awt.CardLayout());

        HomeLayout.setLayout(new java.awt.CardLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Kosong");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout NotifikasiLayout = new javax.swing.GroupLayout(Notifikasi);
        Notifikasi.setLayout(NotifikasiLayout);
        NotifikasiLayout.setHorizontalGroup(
            NotifikasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NotifikasiLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(337, Short.MAX_VALUE))
        );
        NotifikasiLayout.setVerticalGroup(
            NotifikasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NotifikasiLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        HomeLayout.add(Notifikasi, "card2");

        jPanel2.add(HomeLayout, "card3");

        ProfileLayout.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ProfileLayout.setLayout(new java.awt.CardLayout());

        HomeProfile.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        HomeProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        HomeProfile.setPreferredSize(new java.awt.Dimension(836, 327));

        ButtonTambahProfile.setText("Tambah Profile");
        ButtonTambahProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTambahProfileActionPerformed(evt);
            }
        });

        ButtonEditProfile.setText("Edit Profile");
        ButtonEditProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEditProfileActionPerformed(evt);
            }
        });

        LabelNamaHome.setText("Nama ");

        LabelNIMHome.setText("NIM");

        LabelTTLHome.setText("TTL");

        LabelEmailHome.setText("Email");

        LabelNoTelHome.setText("No. Telepon");

        javax.swing.GroupLayout HomeProfileLayout = new javax.swing.GroupLayout(HomeProfile);
        HomeProfile.setLayout(HomeProfileLayout);
        HomeProfileLayout.setHorizontalGroup(
            HomeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeProfileLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(HomeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelNoTelHome)
                    .addComponent(LabelEmailHome)
                    .addComponent(LabelTTLHome)
                    .addComponent(LabelNIMHome)
                    .addComponent(LabelNamaHome)
                    .addGroup(HomeProfileLayout.createSequentialGroup()
                        .addComponent(ButtonTambahProfile)
                        .addGap(39, 39, 39)
                        .addComponent(ButtonEditProfile)))
                .addContainerGap(653, Short.MAX_VALUE))
        );
        HomeProfileLayout.setVerticalGroup(
            HomeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeProfileLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(LabelNamaHome)
                .addGap(18, 18, 18)
                .addComponent(LabelNIMHome)
                .addGap(18, 18, 18)
                .addComponent(LabelTTLHome)
                .addGap(18, 18, 18)
                .addComponent(LabelEmailHome)
                .addGap(18, 18, 18)
                .addComponent(LabelNoTelHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addGroup(HomeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonTambahProfile)
                    .addComponent(ButtonEditProfile))
                .addContainerGap())
        );

        ProfileLayout.add(HomeProfile, "");

        LabelTambahProfile.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        LabelTambahProfile.setText("Tambah Profile");

        addNama.setText("Nama              :");

        addNIM.setText("NIM                  :");

        addNoTel.setText("No. Telepon   :");

        addEmail.setText("Email              :");

        FieldAddNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldAddNamaActionPerformed(evt);
            }
        });

        FieldAddNoTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldAddNoTelActionPerformed(evt);
            }
        });

        ButtonSimpanTambahProfile.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ButtonSimpanTambahProfile.setText("Simpan");
        ButtonSimpanTambahProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSimpanTambahProfileActionPerformed(evt);
            }
        });

        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        addEmail1.setText("TTL                  :");

        javax.swing.GroupLayout AddProfileLayout = new javax.swing.GroupLayout(AddProfile);
        AddProfile.setLayout(AddProfileLayout);
        AddProfileLayout.setHorizontalGroup(
            AddProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddProfileLayout.createSequentialGroup()
                .addContainerGap(455, Short.MAX_VALUE)
                .addComponent(ButtonSimpanTambahProfile)
                .addGap(416, 416, 416))
            .addGroup(AddProfileLayout.createSequentialGroup()
                .addGroup(AddProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddProfileLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(AddProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelTambahProfile)
                            .addComponent(jButton1)))
                    .addGroup(AddProfileLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(AddProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addEmail)
                            .addGroup(AddProfileLayout.createSequentialGroup()
                                .addGroup(AddProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(AddProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(addNIM)
                                        .addComponent(addNama)
                                        .addComponent(addEmail1))
                                    .addGroup(AddProfileLayout.createSequentialGroup()
                                        .addComponent(addNoTel)
                                        .addGap(2, 2, 2)))
                                .addGap(27, 27, 27)
                                .addGroup(AddProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(AddProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(FieldAddNoTel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(FieldAddEmail1)
                                            .addComponent(FieldAddEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(AddProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(FieldAddNIM, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(FieldAddNama, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AddProfileLayout.setVerticalGroup(
            AddProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelTambahProfile)
                .addGap(18, 18, 18)
                .addGroup(AddProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addNama)
                    .addComponent(FieldAddNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addNIM)
                    .addComponent(FieldAddNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(AddProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddProfileLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(addEmail1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                        .addComponent(ButtonSimpanTambahProfile)
                        .addGap(4, 4, 4)
                        .addComponent(jButton1))
                    .addGroup(AddProfileLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(FieldAddEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AddProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldAddEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AddProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldAddNoTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addNoTel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        ProfileLayout.add(AddProfile, "card4");

        EditProfile.setPreferredSize(new java.awt.Dimension(688, 307));

        editNama.setText("Nama          :");

        editNIM.setText("NIM             :");

        editNoTel.setText("No.Telepon  :");

        editEmail.setText("Email          :");

        FieldEditNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldEditNamaActionPerformed(evt);
            }
        });

        FieldEditNIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldEditNIMActionPerformed(evt);
            }
        });

        FieldEditEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldEditEmailActionPerformed(evt);
            }
        });

        ButtonSimpanEditProfile.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ButtonSimpanEditProfile.setText("Simpan");

        LabelEdit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        LabelEdit.setText("Edit Profile");

        editNoTel1.setText("TTL             :");

        ButtonKembali.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ButtonKembali.setText("Kembali");
        ButtonKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonKembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EditProfileLayout = new javax.swing.GroupLayout(EditProfile);
        EditProfile.setLayout(EditProfileLayout);
        EditProfileLayout.setHorizontalGroup(
            EditProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditProfileLayout.createSequentialGroup()
                .addGroup(EditProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EditProfileLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(EditProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EditProfileLayout.createSequentialGroup()
                                .addGroup(EditProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(editNama)
                                    .addComponent(editEmail)
                                    .addGroup(EditProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(editNoTel1)
                                        .addComponent(editNIM)))
                                .addGap(18, 18, 18)
                                .addGroup(EditProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FieldEditEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FieldEditNIM, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FieldEditNama, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FieldEditTTL, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(EditProfileLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(editNoTel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(FieldEditNoTel, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(EditProfileLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(LabelEdit))
                    .addGroup(EditProfileLayout.createSequentialGroup()
                        .addGap(411, 411, 411)
                        .addComponent(ButtonSimpanEditProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EditProfileLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ButtonKembali)))
                .addContainerGap(449, Short.MAX_VALUE))
        );
        EditProfileLayout.setVerticalGroup(
            EditProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelEdit)
                .addGap(18, 18, 18)
                .addGroup(EditProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editNama)
                    .addComponent(FieldEditNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(EditProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editNIM)
                    .addComponent(FieldEditNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(EditProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editNoTel1)
                    .addComponent(FieldEditTTL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(EditProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editEmail)
                    .addComponent(FieldEditEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(EditProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editNoTel)
                    .addComponent(FieldEditNoTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(ButtonSimpanEditProfile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        ProfileLayout.add(EditProfile, "card3");

        jPanel2.add(ProfileLayout, "card2");

        javax.swing.GroupLayout BodyPanelLayout = new javax.swing.GroupLayout(BodyPanel);
        BodyPanel.setLayout(BodyPanelLayout);
        BodyPanelLayout.setHorizontalGroup(
            BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        BodyPanelLayout.setVerticalGroup(
            BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BodyPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BodyPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonProfileActionPerformed
        // TODO add your handling code here:
        jPanel2.removeAll();
        jPanel2.repaint();
        jPanel2.revalidate();
        jPanel2.add(ProfileLayout);
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_ButtonProfileActionPerformed

    private void ButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHomeActionPerformed
        // TODO add your handling code here:jPanel4.removeAll();
        jPanel2.removeAll();
        jPanel2.repaint();
        jPanel2.revalidate();
        jPanel2.add(HomeLayout);
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_ButtonHomeActionPerformed

    private void ButtonEditProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditProfileActionPerformed
        // TODO add your handling code here:
        ProfileLayout.removeAll();
        ProfileLayout.repaint();
        ProfileLayout.revalidate();
        ProfileLayout.add(EditProfile);
        ProfileLayout.repaint();
        ProfileLayout.revalidate();
    }//GEN-LAST:event_ButtonEditProfileActionPerformed

    private void ButtonTambahProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTambahProfileActionPerformed
        // TODO add your handling code here:
        ProfileLayout.removeAll();
        ProfileLayout.repaint();
        ProfileLayout.revalidate();
        ProfileLayout.add(AddProfile);
        ProfileLayout.repaint();
        ProfileLayout.revalidate();
    }//GEN-LAST:event_ButtonTambahProfileActionPerformed

    private void ButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLogoutActionPerformed
        // TODO add your handling code here:
        Login lg = new Login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ButtonLogoutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Login lg = new Login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ButtonSimpanTambahProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSimpanTambahProfileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonSimpanTambahProfileActionPerformed

    private void FieldAddNoTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldAddNoTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldAddNoTelActionPerformed

    private void FieldAddNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldAddNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldAddNamaActionPerformed

    private void FieldEditEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldEditEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldEditEmailActionPerformed

    private void FieldEditNIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldEditNIMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldEditNIMActionPerformed

    private void FieldEditNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldEditNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldEditNamaActionPerformed

    private void ButtonKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonKembaliActionPerformed
        // TODO add your handling code here:
        Login lg = new Login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ButtonKembaliActionPerformed

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
            java.util.logging.Logger.getLogger(DashboardMahasiswaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardMahasiswaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardMahasiswaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardMahasiswaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardMahasiswaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddProfile;
    private javax.swing.JPanel BodyPanel;
    private javax.swing.JButton ButtonEditProfile;
    private javax.swing.JButton ButtonHome;
    private javax.swing.JButton ButtonKembali;
    private javax.swing.JButton ButtonLogout;
    private javax.swing.JButton ButtonProfile;
    private javax.swing.JButton ButtonSimpanEditProfile;
    private javax.swing.JButton ButtonSimpanTambahProfile;
    private javax.swing.JButton ButtonTambahProfile;
    private javax.swing.JPanel EditProfile;
    private javax.swing.JTextField FieldAddEmail;
    private javax.swing.JTextField FieldAddEmail1;
    private javax.swing.JTextField FieldAddNIM;
    private javax.swing.JTextField FieldAddNama;
    private javax.swing.JTextField FieldAddNoTel;
    private javax.swing.JTextField FieldEditEmail;
    private javax.swing.JTextField FieldEditNIM;
    private javax.swing.JTextField FieldEditNama;
    private javax.swing.JTextField FieldEditNoTel;
    private javax.swing.JTextField FieldEditTTL;
    private javax.swing.JPanel HomeLayout;
    private javax.swing.JPanel HomeProfile;
    private javax.swing.JLabel LabelEdit;
    private javax.swing.JLabel LabelEmailHome;
    private javax.swing.JLabel LabelNIMHome;
    private javax.swing.JLabel LabelNamaHome;
    private javax.swing.JLabel LabelNoTelHome;
    private javax.swing.JLabel LabelTTLHome;
    private javax.swing.JLabel LabelTambahProfile;
    private javax.swing.JPanel Notifikasi;
    private javax.swing.JPanel ProfileLayout;
    private javax.swing.JLabel addEmail;
    private javax.swing.JLabel addEmail1;
    private javax.swing.JLabel addNIM;
    private javax.swing.JLabel addNama;
    private javax.swing.JLabel addNoTel;
    private javax.swing.JLabel editEmail;
    private javax.swing.JLabel editNIM;
    private javax.swing.JLabel editNama;
    private javax.swing.JLabel editNoTel;
    private javax.swing.JLabel editNoTel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
