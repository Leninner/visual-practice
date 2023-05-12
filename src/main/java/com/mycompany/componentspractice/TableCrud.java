package com.mycompany.componentspractice;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TableCrud extends javax.swing.JFrame {
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JScrollPane jScrollPane3;
  private javax.swing.JButton jbtnCalculateAge;
  private javax.swing.JButton jbtnCancel;
  private javax.swing.JButton jbtnDelete;
  private javax.swing.JButton jbtnSave;
  private javax.swing.JButton jbtnUpdate;
  private javax.swing.JComboBox<String> jcbCivilStatus;
  private javax.swing.JComboBox<String> jcbNationality;
  private javax.swing.JComboBox<String> jcbSex;
  private com.toedter.calendar.JDateChooser jdcBirthDate;
  private javax.swing.JTextArea jtaHobbies;
  private javax.swing.JTextArea jtaStudies;
  private javax.swing.JTable jtblPeople;
  private javax.swing.JTextField jtxtDocumentId;
  private javax.swing.JTextField jtxtEmail;
  private javax.swing.JTextField jtxtLastName;
  private javax.swing.JTextField jtxtName;

  public TableCrud() {
    initComponents();
  }

  private void initComponents() {
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jtxtDocumentId = new javax.swing.JTextField();
    jtxtName = new javax.swing.JTextField();
    jtxtLastName = new javax.swing.JTextField();
    jtxtEmail = new javax.swing.JTextField();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jcbSex = new javax.swing.JComboBox<>();
    jcbCivilStatus = new javax.swing.JComboBox<>();
    jLabel8 = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();
    jdcBirthDate = new com.toedter.calendar.JDateChooser();
    jScrollPane2 = new javax.swing.JScrollPane();
    jtaHobbies = new javax.swing.JTextArea();
    jLabel10 = new javax.swing.JLabel();
    jcbNationality = new javax.swing.JComboBox<>();
    jLabel11 = new javax.swing.JLabel();
    jScrollPane3 = new javax.swing.JScrollPane();
    jtaStudies = new javax.swing.JTextArea();
    jbtnSave = new javax.swing.JButton();
    jbtnUpdate = new javax.swing.JButton();
    jbtnCalculateAge = new javax.swing.JButton();
    jbtnCancel = new javax.swing.JButton();
    jbtnDelete = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    jtblPeople = new javax.swing.JTable();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
    jLabel1.setText("Ingresa los siguientes datos para empezar a añadir personas");

    jLabel2.setText("Cédula");

    jLabel3.setText("Nombre");

    jLabel4.setText("Apellido");

    jLabel5.setText("E-mail");

    jLabel6.setText("Sexo");

    jLabel7.setText("Estado Civil");

    jcbSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

    jcbCivilStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Casado", "Soltero", "Divorciado" }));

    jLabel8.setText("Fecha de Nacimiento");

    jLabel9.setText("Hobbies");

    jtaHobbies.setColumns(20);
    jtaHobbies.setRows(5);
    jScrollPane2.setViewportView(jtaHobbies);

    jLabel10.setText("Nacionalidad");

    jcbNationality.setModel(
        new javax.swing.DefaultComboBoxModel<>(new String[] { "Mestizo", "Indígena", "Afroamericano", "Montubio" }));

    jLabel11.setText("Estudios");

    jtaStudies.setColumns(20);
    jtaStudies.setRows(5);
    jScrollPane3.setViewportView(jtaStudies);

    jbtnSave.setText("Guardar");
    jbtnSave.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jbtnSaveActionPerformed(evt);
      }
    });

    jbtnUpdate.setText("Actualizar");
    jbtnUpdate.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jbtnUpdateActionPerformed(evt);
      }
    });
    jbtnUpdate.setEnabled(false);

    jbtnCalculateAge.setText("Calcular Edad");
    jbtnCalculateAge.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jbtnCalculateAgeActionPerformed(evt);
      }
    });
    jbtnCalculateAge.setEnabled(false);

    jbtnCancel.setText("Cancelar");
    jbtnCancel.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jbtnCancelActionPerformed(evt);
      }
    });

    jbtnDelete.setText("Borrar");
    jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jbtnDeleteActionPerformed(evt);
      }
    });
    jbtnDelete.setEnabled(false);

    jtblPeople.setModel(new javax.swing.table.DefaultTableModel(
        new Object[][] {

        },
        new String[] {
            "Cédula", "Nombre", "Apellido", "E-mail", "Sexo", "Estado Civil", "Fecha de Nacimiento", "Nacionalidad",
            "Hobbies", "Estudios"
        }));
    jtblPeople.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jtblPeopleMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(jtblPeople);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jbtnSave))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50,
                                            Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jbtnUpdate)
                                                .addGap(41, 41, 41)
                                                .addComponent(jbtnCalculateAge)
                                                .addGap(43, 43, 43)
                                                .addComponent(jbtnCancel))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                            javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jdcBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE,
                                            javax.swing.GroupLayout.DEFAULT_SIZE,
                                            javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                            javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jcbSex, javax.swing.GroupLayout.PREFERRED_SIZE,
                                            javax.swing.GroupLayout.DEFAULT_SIZE,
                                            javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                            javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 234,
                                            javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                            javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(
                                            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jtxtName, javax.swing.GroupLayout.DEFAULT_SIZE, 167,
                                                    Short.MAX_VALUE)
                                                .addComponent(jtxtDocumentId))))
                                .addGap(144, 144, 144)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbtnDelete)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel10))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jcbNationality, javax.swing.GroupLayout.Alignment.TRAILING,
                                            javax.swing.GroupLayout.PREFERRED_SIZE,
                                            javax.swing.GroupLayout.DEFAULT_SIZE,
                                            javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jcbCivilStatus, javax.swing.GroupLayout.Alignment.TRAILING,
                                            javax.swing.GroupLayout.PREFERRED_SIZE,
                                            javax.swing.GroupLayout.DEFAULT_SIZE,
                                            javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtxtLastName, javax.swing.GroupLayout.Alignment.TRAILING,
                                            javax.swing.GroupLayout.PREFERRED_SIZE, 182,
                                            javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(73, 73, 73)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(25, Short.MAX_VALUE)));
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtDocumentId, javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxtName, javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jtxtLastName, javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jcbCivilStatus, javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jcbNationality, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jcbSex, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jdcBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnSave)
                    .addComponent(jbtnUpdate)
                    .addComponent(jbtnCancel)
                    .addComponent(jbtnDelete)
                    .addComponent(jbtnCalculateAge))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)));

    pack();
  }

  public void resetForm() {
    jtxtDocumentId.setText("");
    jtxtName.setText("");
    jtxtLastName.setText("");
    jtxtEmail.setText("");
    jcbSex.setSelectedIndex(0);
    jcbCivilStatus.setSelectedIndex(0);
    jdcBirthDate.setDate(null);
    jcbNationality.setSelectedIndex(0);
    jtaHobbies.setText("");
    jtaStudies.setText("");
  }

  public void updatePerson(Person person, int index) {
    try {
      DefaultTableModel model = (DefaultTableModel) jtblPeople.getModel();

      model.setValueAt(person.getDocumentId(), index, 0);
      model.setValueAt(person.getName(), index, 1);
      model.setValueAt(person.getLastName(), index, 2);
      model.setValueAt(person.getEmail(), index, 3);
      model.setValueAt(person.getSex(), index, 4);
      model.setValueAt(person.getCivilStatus(), index, 5);
      model.setValueAt(person.getBirthDate(), index, 6);
      model.setValueAt(person.getNationality(), index, 7);
      model.setValueAt(person.getHobbies(), index, 8);
      model.setValueAt(person.getStudies(), index, 9);
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, e.getMessage());
    }
  }

  public void insertPerson(Person person) {
    try {
      DefaultTableModel model = (DefaultTableModel) jtblPeople.getModel();
      for (int i = 0; i < model.getRowCount(); i++) {
        if (model.getValueAt(i, 0).equals(person.getDocumentId())) {
          updatePerson(person, i);
          return;
        }
      }

      model.addRow(person.getObjectData());
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, e.getMessage());
    }
  }

  public HashMap<String, Object> getFormFieldsDataValidated() {
    try {
      Validator validator = new Validator();
      String documentId = jtxtDocumentId.getText();
      String name = jtxtName.getText();
      String lastName = jtxtLastName.getText();
      String email = jtxtEmail.getText();
      String sex = jcbSex.getSelectedItem().toString();
      String civilStatus = jcbCivilStatus.getSelectedItem().toString();
      Date date = jdcBirthDate
          .getDate();
      LocalDate birthDate = null;

      if (date == null) {
        validator.addToErrors("Fecha de nacimiento");
      } else {
        birthDate = date.toInstant()
            .atZone(ZoneId.systemDefault())
            .toLocalDate();
      }

      String nationality = jcbNationality.getSelectedItem().toString();
      String hobbies = jtaHobbies.getText();
      String studies = jtaStudies.getText();

      validator
          .documentId(documentId)
          .email(email)
          .string(name, "Nombre")
          .string(lastName, "Apellido")
          .string(hobbies, "Hobbies")
          .string(studies, "Estudios")
          .validate();

      HashMap<String, Object> data = new HashMap<>();
      data.put("documentId", documentId);
      data.put("name", name);
      data.put("lastName", lastName);
      data.put("email", email);
      data.put("sex", sex);
      data.put("civilStatus", civilStatus);
      data.put("birthDate", birthDate);
      data.put("nationality", nationality);
      data.put("hobbies", hobbies);
      data.put("studies", studies);

      return data;
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, e.getMessage());
      return null;
    }
  }

  private void jtblPeopleMouseClicked(java.awt.event.MouseEvent evt) {
    if (evt.getClickCount() == 2) {
      handlePersonUpdate();
    }

    jbtnUpdate.setEnabled(true);
    jbtnCalculateAge.setEnabled(true);
    jbtnDelete.setEnabled(true);
  }

  private void jbtnCalculateAgeActionPerformed(java.awt.event.ActionEvent evt) {
    handleCalculateAge();
  }

  public void handleCalculateAge() {
    int selectedRow = jtblPeople.getSelectedRow();
    int age = 0;
    int BIRTH_DATE_COLUMN = 6;
    LocalDate birthDate = (LocalDate) jtblPeople.getValueAt(selectedRow, BIRTH_DATE_COLUMN);
    age = Period.between(birthDate, LocalDate.now()).getYears();
    
    JOptionPane.showMessageDialog(null, "La edad es: " + age);
  }

  private void jbtnSaveActionPerformed(java.awt.event.ActionEvent evt) {
    handlePersonCreation();
  }

  public void handlePersonCreation() {
    HashMap<String, Object> data = getFormFieldsDataValidated();
    if (data == null)
      return;

    Person newPerson = new Person(
        data.get("documentId").toString(),
        data.get("name").toString(),
        data.get("lastName").toString(),
        data.get("email").toString(),
        data.get("sex").toString(),
        data.get("civilStatus").toString(),
        (LocalDate) data.get("birthDate"),
        data.get("nationality").toString(),
        data.get("hobbies").toString(),
        data.get("studies").toString());

    insertPerson(newPerson);
    resetForm();
    jtxtDocumentId.setEnabled(true);
  }

  private void jbtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {
    handlePersonUpdate();
  }

  private void handlePersonUpdate() {
    int selectedRow = jtblPeople.getSelectedRow();

    String documentId = jtblPeople.getValueAt(selectedRow, 0).toString();
    String name = jtblPeople.getValueAt(selectedRow, 1).toString();
    String lastName = jtblPeople.getValueAt(selectedRow, 2).toString();
    String email = jtblPeople.getValueAt(selectedRow, 3).toString();
    String sex = jtblPeople.getValueAt(selectedRow, 4).toString();
    String civilStatus = jtblPeople.getValueAt(selectedRow, 5).toString();
    LocalDate birthDate = (LocalDate) jtblPeople.getValueAt(selectedRow, 6);
    String nationality = jtblPeople.getValueAt(selectedRow, 7).toString();
    String hobbies = jtblPeople.getValueAt(selectedRow, 8).toString();
    String studies = jtblPeople.getValueAt(selectedRow, 9).toString();

    jtxtDocumentId.setText(documentId);
    jtxtName.setText(name);
    jtxtLastName.setText(lastName);
    jtxtEmail.setText(email);
    jcbSex.setSelectedItem(sex);
    jcbCivilStatus.setSelectedItem(civilStatus);
    jdcBirthDate.setDate(Date.from(birthDate.atStartOfDay(ZoneId.systemDefault()).toInstant()));
    jcbNationality.setSelectedItem(nationality);
    jtaHobbies.setText(hobbies);
    jtaStudies.setText(studies);

    jtxtDocumentId.setEnabled(false);
    jbtnUpdate.setEnabled(false);
    jbtnCalculateAge.setEnabled(false);
  }

  private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {
    handlePersonDelete();
  }

  public void handlePersonDelete() {
    int selectedRow = jtblPeople.getSelectedRow();
    DefaultTableModel model = (DefaultTableModel) jtblPeople.getModel();
    model.removeRow(selectedRow);
    resetForm();

    jbtnUpdate.setEnabled(true);
    jtxtDocumentId.setEnabled(true);
    jbtnCalculateAge.setEnabled(true);
  }

  public void jbtnCancelActionPerformed(java.awt.event.ActionEvent evt) {
    resetForm();
  }
  
  public static void main(String args[]) {
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(TableCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(TableCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(TableCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(TableCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }

    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new TableCrud().setVisible(true);
      }
    });
  }
}
