/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dashboard;

import Lecture_Location.Add_CRooms;
import Lecture_Location.Add_SRooms;
import Lecture_Location.Display_SRooms;
import Lecture_Location.lectureLocationNoAvii;
import Lecturer.Add_Lecturer;
import Lecturer.Manage_Lecturer;
import Location.AddLocations;
import Location.Manage_Locations;
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
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.JFrame;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;

/**
 *
 * @author Hiran
 */
public class Statistics2 extends javax.swing.JFrame {
Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    /**
     * Creates new form Statistics2
     */
    public Statistics2() {
        initComponents();
        conn=DB.DBConnect.getConnection();
        totLceture();
        totStudent();
        totSubject();
        totRoom();
        latestLceture();
        latestSubject();
        latestLocation();
    }
public void totLceture(){
       
        
        try{
            
            String sql="SELECT * FROM tot_lect";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            
            
            while(rs.next()){
                jTextField1.setText(rs.getString("totLecturer"));
            }
           
            
        }catch(Exception e){
         
        }
        
        
    } 
     
     public void totStudent(){
       
        
        try{
            
            String sql="SELECT * FROM tot_std";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            
            
            while(rs.next()){
                jTextField8.setText(rs.getString("totalstd)"));
            }
           
            
        }catch(Exception e){
         
        }
        
        
    } 
     
     public void totSubject(){
       
        
        try{
            
            String sql="SELECT * FROM tot_sub";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            
            
            while(rs.next()){
                jTextField9.setText(rs.getString("TotalSubject"));
            }
           
            
        }catch(Exception e){
         
        }
        
        
    } 
     
     public void totRoom(){
       
        
        try{
            
            String sql="SELECT * FROM tot_rooms";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            
            
            while(rs.next()){
                jTextField19.setText(rs.getString("totallrooms"));
            }
           
            
        }catch(Exception e){
         
        }
        
        
    } 
       public void latestLceture(){
       
        
        try{
            
            String sql="SELECT * FROM lecturer";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            
            
            while(rs.next()){
                jTextField16.setText(rs.getString("lecturerName"));
            }
           
            
        }catch(Exception e){
         
        }
        
        
    } 
    
    
    
    
    
    public void latestSubject(){
       
        
        try{
            
            String sql="SELECT * FROM subjects";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            
            
            while(rs.next()){
                jTextField18.setText(rs.getString("subjectName"));
            }
           
            
        }catch(Exception e){
         
        }
        
        
    } 
     public void latestLocation(){
       
        
        try{
            
            String sql="SELECT * FROM locations";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            
            
            while(rs.next()){
                jTextField17.setText(rs.getString("room"));
            }
           
            
        }catch(Exception e){
         
        }
        
        
    } 
  
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelDashboard = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelAddLecturer = new javax.swing.JLabel();
        labelManageLecturer = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelAddSubject = new javax.swing.JLabel();
        labelManageSubjects = new javax.swing.JLabel();
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
        labelManageLectureLocations = new javax.swing.JLabel();
        labelAddSR = new javax.swing.JLabel();
        labelAddCSR = new javax.swing.JLabel();
        labelTimeAllocations = new javax.swing.JLabel();
        labelAddNAT = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lecLev = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

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

        labelManageLecturer.setText("Manage Lecturers");
        labelManageLecturer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelManageLecturerMouseClicked(evt);
            }
        });

        jLabel5.setText("Subject");

        labelAddSubject.setText("Add a Subject");
        labelAddSubject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAddSubjectMouseClicked(evt);
            }
        });

        labelManageSubjects.setText("Manage Subjects");
        labelManageSubjects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelManageSubjectsMouseClicked(evt);
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

        labelManageLectureLocations.setText("Manage Lecture Locations");
        labelManageLectureLocations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelManageLectureLocationsMouseClicked(evt);
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
                    .addComponent(labelManageLecturer)
                    .addComponent(labelAddSubject)
                    .addComponent(labelManageSubjects)
                    .addComponent(labelAddSG)
                    .addComponent(labelManageSG)
                    .addComponent(labelAddTag)
                    .addComponent(labelManageTag)
                    .addComponent(labelAddWDH)
                    .addComponent(labelManageWDH)
                    .addComponent(labelAddLocation)
                    .addComponent(labelManageLocation)
                    .addComponent(labelAddSession)
                    .addComponent(labelManageLectureLocations)
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
                .addComponent(labelManageLecturer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelAddSubject)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelManageSubjects)
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
                .addComponent(labelAddSession)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelManageSession)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelManageLectureLocations)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelAddSR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelAddCSR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelAddNAT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTimeAllocations))
        );

        jPanel5.setBackground(new java.awt.Color(36, 190, 135));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jTextField1.setEditable(false);

        jLabel85.setText("Registered Lecturers");

        jTextField8.setEditable(false);

        jLabel86.setText("Registered Students");

        jTextField9.setEditable(false);

        jLabel87.setText("Registered Subjects");

        jPanel6.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel45.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel45.setText("What's New?");

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel46.setText("Last Lecturer");

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel47.setText("Last Group");

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel48.setText("Last Subject");

        jTextField16.setEditable(false);

        jTextField17.setEditable(false);

        jTextField18.setEditable(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47)
                            .addComponent(jLabel46)
                            .addComponent(jLabel48))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField17, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(jTextField18)
                            .addComponent(jTextField16)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel45)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45)
                .addGap(66, 66, 66)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(123, Short.MAX_VALUE))
        );

        jTextField19.setEditable(false);

        jLabel88.setText("Registered Rooms");

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel7AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 334, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
        );

        lecLev.setBackground(new java.awt.Color(51, 255, 51));
        lecLev.setText("View statistics Related to Lecturers & level");
        lecLev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecLevActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel85))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel86)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel87)
                                .addGap(47, 47, 47))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel88)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(lecLev)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel86)
                                    .addComponent(jLabel85)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel88)
                                    .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lecLev))
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lecLevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecLevActionPerformed
        Statistics1 d = new Statistics1();
        d.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lecLevActionPerformed

    private void jPanel7AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel7AncestorAdded
         String SQL = "SELECT acc_yer_sem ,totalstd FROM std_year";
         DefaultCategoryDataset barChartData=new DefaultCategoryDataset();
        try {
            barChartData = new JDBCCategoryDataset(conn,SQL);
        } catch (SQLException ex) {
            Logger.getLogger(Statistics2.class.getName()).log(Level.SEVERE, null, ex);
        }
        JFreeChart barcht=ChartFactory.createBarChart("Total no of Studnt Related to year Semister", "Year Semister", "Number of Students", barChartData, PlotOrientation.VERTICAL, true,true,true);
         CategoryPlot p= barcht.getCategoryPlot();
         p.setRangeGridlinePaint(Color.ORANGE);
         ChartPanel myChart = new ChartPanel(barcht);
         
         jPanel7.setLayout(new java.awt.BorderLayout());
         jPanel7.add(myChart,BorderLayout.CENTER);
         jPanel7.validate();
   
    }//GEN-LAST:event_jPanel7AncestorAdded

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

    private void labelManageLecturerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelManageLecturerMouseClicked
        Manage_Lecturer ml = new Manage_Lecturer();
        ml.setVisible(true);
        ml.pack();
        ml.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_labelManageLecturerMouseClicked

    private void labelAddSubjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddSubjectMouseClicked
        Add_Subject ml = new Add_Subject();
        ml.setVisible(true);
        ml.pack();
        ml.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();      
    }//GEN-LAST:event_labelAddSubjectMouseClicked

    private void labelManageSubjectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelManageSubjectsMouseClicked
        Manage_Subjects ml = new Manage_Subjects();
        ml.setVisible(true);
        ml.pack();
        ml.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose(); 
    }//GEN-LAST:event_labelManageSubjectsMouseClicked

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
        this.dispose();  
    }//GEN-LAST:event_labelManageSGMouseClicked

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

    private void labelManageLectureLocationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelManageLectureLocationsMouseClicked
        Display_SRooms ml = new Display_SRooms();
        ml.setVisible(true);
        ml.pack();
        ml.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_labelManageLectureLocationsMouseClicked

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
            java.util.logging.Logger.getLogger(Statistics2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Statistics2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Statistics2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Statistics2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Statistics2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
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
    private javax.swing.JLabel labelManageLectureLocations;
    private javax.swing.JLabel labelManageLecturer;
    private javax.swing.JLabel labelManageLocation;
    private javax.swing.JLabel labelManageSG;
    private javax.swing.JLabel labelManageSession;
    private javax.swing.JLabel labelManageSubjects;
    private javax.swing.JLabel labelManageTag;
    private javax.swing.JLabel labelManageWDH;
    private javax.swing.JLabel labelTimeAllocations;
    private javax.swing.JButton lecLev;
    // End of variables declaration//GEN-END:variables
}
