/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Location;

import Dashboard.Statistics1;
import Lecture_Location.Add_CRooms;
import Lecture_Location.Add_SRooms;
import Lecture_Location.Display_SRooms;
import Lecture_Location.lectureLocationNoAvii;
import Lecturer.Add_Lecturer;
import Lecturer.Manage_Lecturer;
import Session.Add_Session;
import Session.Manage_Session;
import Student_Group.addStd;
import Student_Group.manageStd;
import Subjects.Add_Subject;
import Subjects.Manage_Subjects;
import Tags.addtag;
import Tags.managetag;
import Time_Allocations.addSession;
import WorkingDH.manageworkingday;
import WorkingDH.workingday;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JFrame;


/**
 *
 * @author Hiran
 */
public class AddLocations extends javax.swing.JFrame {
    
    Connection con = null;
    PreparedStatement pst = null;

    /**
     * Creates new form AddLocations
     */
    public AddLocations() {
        initComponents();
        
        con = DB.DBConnect.getConnection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        labelDashboard = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelAddLecturer = new javax.swing.JLabel();
        labelManageLecture = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelAddSubject = new javax.swing.JLabel();
        labelManageSubject = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelAddSG = new javax.swing.JLabel();
        labelManageSG = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        labelAddTag = new javax.swing.JLabel();
        labelManageTag = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        labelAddWDH = new javax.swing.JLabel();
        labelManageWDH = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        labelAddLocation = new javax.swing.JLabel();
        labelManageLocation = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        labelAddSession = new javax.swing.JLabel();
        labelManageSession = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        labelManageLL = new javax.swing.JLabel();
        labelAddSR = new javax.swing.JLabel();
        labelAddCSR = new javax.swing.JLabel();
        labelTimeAllocations = new javax.swing.JLabel();
        labelAddNAT = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        clearL = new javax.swing.JButton();
        jLabel87 = new javax.swing.JLabel();
        roomT = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        buldingN = new javax.swing.JTextField();
        roomN = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        cap = new javax.swing.JTextField();
        lecHall = new javax.swing.JRadioButton();
        lab = new javax.swing.JRadioButton();
        saveL = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(36, 190, 135));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(149, 249, 174));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        labelDashboard.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelDashboard.setText("Dashboard");
        labelDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDashboardMouseClicked(evt);
            }
        });

        jLabel2.setText("Lecturer");

        labelAddLecturer.setText("Add a Lecturer");
        labelAddLecturer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAddLecturerMouseClicked(evt);
            }
        });

        labelManageLecture.setText("Manage Lecturers");
        labelManageLecture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelManageLectureMouseClicked(evt);
            }
        });

        jLabel5.setText("Subject");

        labelAddSubject.setText("Add a Subject");
        labelAddSubject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAddSubjectMouseClicked(evt);
            }
        });

        labelManageSubject.setText("Manage Subjects");
        labelManageSubject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelManageSubjectMouseClicked(evt);
            }
        });

        jLabel8.setText("Student Groups");

        labelAddSG.setText("Add a Student Group");
        labelAddSG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAddSGMouseClicked(evt);
            }
        });

        labelManageSG.setText("Manage Student Groups");
        labelManageSG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelManageSGMouseClicked(evt);
            }
        });

        jLabel11.setText("Tags");

        labelAddTag.setText("Add a Tag");
        labelAddTag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAddTagMouseClicked(evt);
            }
        });

        labelManageTag.setText("Manage Tags");
        labelManageTag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelManageTagMouseClicked(evt);
            }
        });

        jLabel14.setText("Working Days & Hours");

        labelAddWDH.setText("Add Working Days & Hours");
        labelAddWDH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAddWDHMouseClicked(evt);
            }
        });

        labelManageWDH.setText("Manage Working Days & Hours");
        labelManageWDH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelManageWDHMouseClicked(evt);
            }
        });

        jLabel17.setText("Locations");

        labelAddLocation.setText("Add a Location");
        labelAddLocation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAddLocationMouseClicked(evt);
            }
        });

        labelManageLocation.setText("Manage Locations");
        labelManageLocation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelManageLocationMouseClicked(evt);
            }
        });

        jLabel20.setText("Sessions");

        labelAddSession.setText("Add a Session");
        labelAddSession.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAddSessionMouseClicked(evt);
            }
        });

        labelManageSession.setText("Manage Sessions");
        labelManageSession.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelManageSessionMouseClicked(evt);
            }
        });

        jLabel23.setText("Lecture Locations");

        labelManageLL.setText("Manage Lecture Locations");
        labelManageLL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelManageLLMouseClicked(evt);
            }
        });

        labelAddSR.setText("Add a Session");
        labelAddSR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAddSRMouseClicked(evt);
            }
        });

        labelAddCSR.setText("Add a Consecutive Session");
        labelAddCSR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAddCSRMouseClicked(evt);
            }
        });

        labelTimeAllocations.setText("Time Allocations");
        labelTimeAllocations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelTimeAllocationsMouseClicked(evt);
            }
        });

        labelAddNAT.setText("Add Not Availiable Times");
        labelAddNAT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAddNATMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDashboard)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14)
                    .addComponent(jLabel17)
                    .addComponent(jLabel23)
                    .addComponent(labelTimeAllocations)
                    .addComponent(jLabel20))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelManageSession)
                    .addComponent(labelAddLecturer)
                    .addComponent(labelManageLecture)
                    .addComponent(labelAddSubject)
                    .addComponent(labelManageSubject)
                    .addComponent(labelAddSG)
                    .addComponent(labelManageSG)
                    .addComponent(labelAddTag)
                    .addComponent(labelManageTag)
                    .addComponent(labelAddWDH)
                    .addComponent(labelManageWDH)
                    .addComponent(labelAddLocation)
                    .addComponent(labelManageLocation)
                    .addComponent(labelAddSession)
                    .addComponent(labelManageLL)
                    .addComponent(labelAddSR)
                    .addComponent(labelAddCSR)
                    .addComponent(labelAddNAT))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(labelDashboard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelAddLecturer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelManageLecture)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelAddSubject)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelManageSubject)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelAddSG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelManageSG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelAddTag)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelManageTag)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelAddWDH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelManageWDH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelAddLocation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelManageLocation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelAddSession, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelManageSession)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelManageLL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelAddSR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelAddCSR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelAddNAT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTimeAllocations))
        );

        jLabel85.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel85.setText("Add Locations");
        jLabel85.setToolTipText("");
        jLabel85.setAlignmentX(0.5F);
        jLabel85.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel86.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel86.setText("Add Rooms Building wise:");

        clearL.setBackground(new java.awt.Color(255, 51, 51));
        clearL.setText("Clear All");
        clearL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearLActionPerformed(evt);
            }
        });

        jLabel87.setText("Bulding Name");

        roomT.setText("Room Type");

        jLabel89.setText("Capacity");

        buldingN.setToolTipText("");
        buldingN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buldingNActionPerformed(evt);
            }
        });

        roomN.setToolTipText("aa");

        jLabel29.setText("Room Name");

        cap.setToolTipText("50");
        cap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capActionPerformed(evt);
            }
        });

        buttonGroup.add(lecHall);
        lecHall.setText("Lecture Hall");
        lecHall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecHallActionPerformed(evt);
            }
        });

        buttonGroup.add(lab);
        lab.setText("Laboratory");
        lab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labActionPerformed(evt);
            }
        });

        saveL.setBackground(new java.awt.Color(0, 204, 51));
        saveL.setText("Save");
        saveL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel86))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel87)
                                    .addComponent(jLabel29)
                                    .addComponent(roomT)
                                    .addComponent(jLabel89))
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lecHall)
                                        .addGap(18, 18, 18)
                                        .addComponent(lab))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(roomN, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(buldingN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cap, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(218, 218, 218)
                                .addComponent(clearL)
                                .addGap(63, 63, 63)
                                .addComponent(saveL)))
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel85)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel86)
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel87)
                            .addComponent(buldingN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(roomN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(roomT)
                            .addComponent(lecHall)
                            .addComponent(lab))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel89)
                            .addComponent(cap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clearL)
                            .addComponent(saveL))
                        .addGap(113, 113, 113))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clearLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearLActionPerformed
        buldingN.setText("");
        roomN.setText("");
        buttonGroup.clearSelection();
        cap.setText("");
    }//GEN-LAST:event_clearLActionPerformed

    private void buldingNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buldingNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buldingNActionPerformed

    private void lecHallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecHallActionPerformed

    }//GEN-LAST:event_lecHallActionPerformed

    private void labActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labActionPerformed

    }//GEN-LAST:event_labActionPerformed

    private void saveLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveLActionPerformed
        
        lecHall.setActionCommand("Lecture Hall");
        lab.setActionCommand("Laboratory");
        
        String bulding = buldingN.getText();
        String room = roomN.getText();
        String r_type = buttonGroup.getSelection().getActionCommand();
        String capa = cap.getText();
        
        try{
            String q = "insert into locations (bulding,room,r_type,capa) values ('"+bulding+"','"+room+"','"+r_type+"','"+capa+"')";
            pst = con.prepareStatement(q);
            pst.execute();
             Manage_Locations ml = new Manage_Locations();
        ml.setVisible(true);
        this.dispose();
            //table refesh
            //tableload();
        }catch (Exception e){
            
        }

    }//GEN-LAST:event_saveLActionPerformed

    private void capActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capActionPerformed

    }//GEN-LAST:event_capActionPerformed

    private void labelDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDashboardMouseClicked
        Statistics1 ml = new Statistics1();
        ml.setVisible(true);
        ml.pack();
        ml.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_labelDashboardMouseClicked

    private void labelAddLecturerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddLecturerMouseClicked
        Add_Lecturer ml = new Add_Lecturer();
        ml.setVisible(true);
        ml.pack();
        ml.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_labelAddLecturerMouseClicked

    private void labelManageLectureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelManageLectureMouseClicked
        Manage_Lecturer ml = new Manage_Lecturer();
        ml.setVisible(true);
        ml.pack();
        ml.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_labelManageLectureMouseClicked

    private void labelAddSubjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddSubjectMouseClicked
        Add_Subject ml = new Add_Subject();
        ml.setVisible(true);
        ml.pack();
        ml.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose(); 
    }//GEN-LAST:event_labelAddSubjectMouseClicked

    private void labelManageSubjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelManageSubjectMouseClicked
        Manage_Subjects ml = new Manage_Subjects();
        ml.setVisible(true);
        ml.pack();
        ml.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose(); 
    }//GEN-LAST:event_labelManageSubjectMouseClicked

    private void labelAddSGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddSGMouseClicked
        addStd ml = new addStd();
        ml.setVisible(true);
        ml.pack();
        ml.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose(); 
    }//GEN-LAST:event_labelAddSGMouseClicked

    private void labelManageSGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelManageSGMouseClicked
        manageStd ml = new manageStd();
        ml.setVisible(true);
        ml.pack();
        ml.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();      }//GEN-LAST:event_labelManageSGMouseClicked

    private void labelAddTagMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddTagMouseClicked
        addtag ml = new addtag();
        ml.setVisible(true);
        ml.pack();
        ml.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_labelAddTagMouseClicked

    private void labelManageTagMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelManageTagMouseClicked
        managetag ml = new managetag();
        ml.setVisible(true);
        ml.pack();
        ml.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_labelManageTagMouseClicked

    private void labelAddWDHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddWDHMouseClicked
        workingday ml = new workingday();
        ml.setVisible(true);
        ml.pack();
        ml.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_labelAddWDHMouseClicked

    private void labelManageWDHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelManageWDHMouseClicked
        manageworkingday ml = new manageworkingday();
        ml.setVisible(true);
        ml.pack();
        ml.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_labelManageWDHMouseClicked

    private void labelAddLocationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddLocationMouseClicked
        AddLocations ml = new AddLocations();
        ml.setVisible(true);
        ml.pack();
        ml.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_labelAddLocationMouseClicked

    private void labelManageLocationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelManageLocationMouseClicked
        Manage_Locations ml = new Manage_Locations();
        ml.setVisible(true);
        ml.pack();
        ml.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_labelManageLocationMouseClicked

    private void labelAddSessionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddSessionMouseClicked
        Add_Session ml = new Add_Session();
        ml.setVisible(true);
        ml.pack();
        ml.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_labelAddSessionMouseClicked

    private void labelManageSessionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelManageSessionMouseClicked
        Manage_Session ml = new Manage_Session();
        ml.setVisible(true);
        ml.pack();
        ml.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_labelManageSessionMouseClicked

    private void labelManageLLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelManageLLMouseClicked
        Display_SRooms ml = new Display_SRooms();
        ml.setVisible(true);
        ml.pack();
        ml.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_labelManageLLMouseClicked

    private void labelAddSRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddSRMouseClicked
        Add_SRooms ml = new Add_SRooms();
        ml.setVisible(true);
        ml.pack();
        ml.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_labelAddSRMouseClicked

    private void labelAddCSRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddCSRMouseClicked
        Add_CRooms ml = new Add_CRooms();
        ml.setVisible(true);
        ml.pack();
        ml.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_labelAddCSRMouseClicked

    private void labelAddNATMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddNATMouseClicked
        lectureLocationNoAvii ml = new lectureLocationNoAvii();
        ml.setVisible(true);
        ml.pack();
        ml.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_labelAddNATMouseClicked

    private void labelTimeAllocationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelTimeAllocationsMouseClicked
        addSession ml = new addSession();
        ml.setVisible(true);
        ml.pack();
        ml.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_labelTimeAllocationsMouseClicked

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
            java.util.logging.Logger.getLogger(AddLocations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddLocations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddLocations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddLocations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddLocations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buldingN;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JTextField cap;
    private javax.swing.JButton clearL;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton lab;
    private javax.swing.JLabel labelAddCSR;
    private javax.swing.JLabel labelAddLecturer;
    private javax.swing.JLabel labelAddLocation;
    private javax.swing.JLabel labelAddNAT;
    private javax.swing.JLabel labelAddSG;
    private javax.swing.JLabel labelAddSR;
    private javax.swing.JLabel labelAddSession;
    private javax.swing.JLabel labelAddSubject;
    private javax.swing.JLabel labelAddTag;
    private javax.swing.JLabel labelAddWDH;
    private javax.swing.JLabel labelDashboard;
    private javax.swing.JLabel labelManageLL;
    private javax.swing.JLabel labelManageLecture;
    private javax.swing.JLabel labelManageLocation;
    private javax.swing.JLabel labelManageSG;
    private javax.swing.JLabel labelManageSession;
    private javax.swing.JLabel labelManageSubject;
    private javax.swing.JLabel labelManageTag;
    private javax.swing.JLabel labelManageWDH;
    private javax.swing.JLabel labelTimeAllocations;
    private javax.swing.JRadioButton lecHall;
    private javax.swing.JTextField roomN;
    private javax.swing.JLabel roomT;
    private javax.swing.JButton saveL;
    // End of variables declaration//GEN-END:variables
}
