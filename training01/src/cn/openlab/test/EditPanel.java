/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * EditPanel.java
 *
 * Created on 2009-7-4, 9:31:18
 */

package cn.openlab.test;

import javax.swing.JOptionPane;

/**
 *
 * @author johnny
 */
public class EditPanel extends javax.swing.JPanel {

    /** Creates new form EditPanel */
    public EditPanel() {
        initComponents();
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();

        jLabel1.setText("name");

        jLabel2.setText("password");

        jLabel3.setText("ID");

        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });

        jButton1.setText("保存");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Age");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAge, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jButton1)
                .addContainerGap(149, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(38, 38, 38)
                .addComponent(jButton1)
                .addContainerGap(97, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        User user = new User();
        try{
            user.setAge(Integer.parseInt(txtAge.getText()));
        }catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "请输入一个整形的年龄！");
            return;
        }
//        try{
//            user.setId(Integer.parseInt(txtId.getText()));
//        }catch(NumberFormatException nfe) {
//            JOptionPane.showMessageDialog(this, "请输入一个整形的ID！");
//            return;
//        }
        user.setName(txtName.getText());
        user.setPassword(txtPassword.getText());
        if(forUpdate) {
        	UserDaoManager.getDao().updateUserById(user);
        } else {
            try {
            	UserDaoManager.getDao().add(user);
            } catch (InvalidUserException ex) {
                JOptionPane.showMessageDialog(this, "用户号码不能为空，请重新输入！");
                return;
            } catch(UserDuplicationException ude) {
                int ret = JOptionPane.showConfirmDialog(this, "用户号码不能重复，点击是更新该ID记录，否则取消该操作");
                if(JOptionPane.YES_OPTION == ret) {
                	UserDaoManager.getDao().updateUserById(user);
                } else {
                    return;
                }

            }
            JOptionPane.showMessageDialog(this, "保存成功，请继续操作！");
            setUser(new User(), false);
        }
}//GEN-LAST:event_jButton1ActionPerformed

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        char c = evt.getKeyChar();
        if(c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtIdKeyTyped

    private boolean forUpdate;
    public void setUser(User u, boolean forUpdate) {
        txtName.setText(u.getName());
        if(u.getAge() != null)
            txtAge.setText(u.getAge().toString());
        else
            txtAge.setText("");
        if(u.getId() != null) {
            txtId.setText(u.getId().toString());
        } else
            txtId.setText("");
        txtPassword.setText(u.getPassword());
        this.forUpdate = forUpdate;
        txtId.setEditable(!forUpdate);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables

}
