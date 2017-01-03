package project;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.mysql.jdbc.Connection;

public class DeleteItemView extends JFrame {
	public ButtonGroup buttonGroup1;
	public JButton jButton1;
	public JButton jButton10;
	public JButton jButton11;
	public JButton jButton12;
	public JButton jButton13;
	public JButton jButton14;
	public JButton jButton15;
	public JButton jButton16;
	public JButton jButton17;
	public JButton jButton18;
	public JButton jButton19;
	public JButton jButton2;
	public JButton jButton20;
	public JButton jButton21;
	public JButton jButton22;
	public JButton jButton23;
	public JButton jButton24;
	public JButton jButton25;
	public JButton jButton26;
	public JButton jButton27;
	public JButton jButton28;
	public JButton jButton29;
	public JButton jButton3;
	public JButton jButton30;
	public JButton jButton31;
	public JButton jButton32;
	public JButton jButton33;
	public JButton jButton34;
	public JButton jButton35;
	public JButton jButton36;
	public JButton jButton37;
	public JButton jButton38;
	public JButton jButton39;
	public JButton jButton4;
	public JButton jButton40;
	public JButton jButton41;
	public JButton jButton42;
	public JButton jButton43;
	public JButton jButton44;
	public JButton jButton45;
	public JButton jButton46;
	public JButton jButton47;
	public JButton jButton48;
	public JButton jButton49;
	public JButton jButton5;
	public JButton jButton50;
	public JButton jButton51;
	public JButton jButton52;
	public JButton jButton53;
	public JButton jButton54;
	public JButton jButton6;
	public JButton jButton7;
	public JButton jButton8;
	public JButton jButton9;
	public JComboBox jComboBox1;
	public JComboBox jComboBox2;
	public JComboBox jComboBox3;
	public JFrame jFrame1;
	public JFrame jFrame10;
	public JFrame jFrame11;
	public JFrame jFrame12;
	public JFrame jFrame13;
	public JFrame jFrame14;
	public JFrame jFrame15;
	public JFrame jFrame16;
	public JFrame jFrame17;
	public JFrame jFrame18;
	public JFrame jFrame19;
	public JFrame jFrame2;
	public JFrame jFrame20;
	public JFrame jFrame21;
	public JFrame jFrame22;
	public JFrame jFrame3;
	public JFrame jFrame4;
	public JFrame jFrame5;
	public JFrame jFrame6;
	public JFrame jFrame7;
	public JFrame jFrame8;
	public JFrame jFrame9;
	public JLabel jLabel1;
	public JLabel jLabel10;
	public JLabel jLabel11;
	public JLabel jLabel12;
	public JLabel jLabel13;
	public JLabel jLabel14;
	public JLabel jLabel15;
	public JLabel jLabel16;
	public JLabel jLabel17;
	public JLabel jLabel18;
	public JLabel jLabel19;
	public JLabel jLabel2;
	public JLabel jLabel20;
	public JLabel jLabel21;
	public JLabel jLabel22;
	public JLabel jLabel23;
	public JLabel jLabel24;
	public JLabel jLabel25;
	public JLabel jLabel26;
	public JLabel jLabel27;
	public JLabel jLabel28;
	public JLabel jLabel29;
	public JLabel jLabel3;
	public JLabel jLabel30;
	public JLabel jLabel31;
	public JLabel jLabel32;
	public JLabel jLabel33;
	public JLabel jLabel34;
	public JLabel jLabel35;
	public JLabel jLabel36;
	public JLabel jLabel37;
	public JLabel jLabel38;
	public JLabel jLabel39;
	public JLabel jLabel4;
	public JLabel jLabel40;
	public JLabel jLabel41;
	public JLabel jLabel42;
	public JLabel jLabel43;
	public JLabel jLabel44;
	public JLabel jLabel45;
	public JLabel jLabel46;
	public JLabel jLabel47;
	public JLabel jLabel48;
	public JLabel jLabel49;
	public JLabel jLabel5;
	public JLabel jLabel50;
	public JLabel jLabel51;
	public JLabel jLabel52;
	public JLabel jLabel53;
	public JLabel jLabel54;
	public JLabel jLabel55;
	public JLabel jLabel56;
	public JLabel jLabel57;
	public JLabel jLabel58;
	public JLabel jLabel59;
	public JLabel jLabel6;
	public JLabel jLabel60;
	public JLabel jLabel61;
	public JLabel jLabel62;
	public JLabel jLabel63;
	public JLabel jLabel64;
	public JLabel jLabel65;
	public JLabel jLabel66;
	public JLabel jLabel67;
	public JLabel jLabel68;
	public JLabel jLabel69;
	public JLabel jLabel7;
	public JLabel jLabel70;
	public JLabel jLabel71;
	public JLabel jLabel72;
	public JLabel jLabel73;
	public JLabel jLabel74;
	public JLabel jLabel75;
	public JLabel jLabel76;
	public JLabel jLabel8;
	public JLabel jLabel9;
	public JMenu jMenu1;
	public JMenu jMenu10;
	public JMenu jMenu11;
	public JMenu jMenu2;
	public JMenu jMenu3;
	public JMenu jMenu4;
	public JMenu jMenu5;
	public JMenu jMenu6;
	public JMenu jMenu7;
	public JMenu jMenu8;
	public JMenu jMenu9;
	public JMenuBar jMenuBar1;
	public JMenuItem jMenuItem1;
	public JMenuItem jMenuItem10;
	public JMenuItem jMenuItem11;
	public JMenuItem jMenuItem12;
	public JMenuItem jMenuItem13;
	public JMenuItem jMenuItem14;
	public JMenuItem jMenuItem15;
	public JMenuItem jMenuItem16;
	public JMenuItem jMenuItem17;
	public JMenuItem jMenuItem18;
	public JMenuItem jMenuItem19;
	public JMenuItem jMenuItem2;
	public JMenuItem jMenuItem20;
	public JMenuItem jMenuItem21;
	public JMenuItem jMenuItem22;
	public JMenuItem jMenuItem23;
	public JMenuItem jMenuItem3;
	public JMenuItem jMenuItem4;
	public JMenuItem jMenuItem5;
	public JMenuItem jMenuItem6;
	public JMenuItem jMenuItem7;
	public JMenuItem jMenuItem8;
	public JMenuItem jMenuItem9;
	public JPanel jPanel1;
	public JPanel jPanel2;
	public JPanel jPanel3;
	public JPanel jPanel4;
	public JPanel jPanel5;
	public JRadioButton jRadioButton1;
	public JRadioButton jRadioButton2;
	public JScrollPane jScrollPane1;
	public JScrollPane jScrollPane10;
	public JScrollPane jScrollPane11;
	public JScrollPane jScrollPane12;
	public JScrollPane jScrollPane13;
	public JScrollPane jScrollPane14;
	public JScrollPane jScrollPane2;
	public JScrollPane jScrollPane3;
	public JScrollPane jScrollPane4;
	public JScrollPane jScrollPane5;
	public JScrollPane jScrollPane6;
	public JScrollPane jScrollPane7;
	public JScrollPane jScrollPane8;
	public JScrollPane jScrollPane9;
	public JTable jTable1;
	public JTable jTable2;
	public JTable jTable3;
	public JTable jTable4;
	public JTable jTable5;
	public JTable jTable6;
	public JTable jTable7;
	public JTable jTable8;
	public JTable jTable9;
	public JTextArea jTextArea1;
	public JTextField jTextField1;
	public JTextField jTextField10;
	public JTextField jTextField11;
	public JTextField jTextField12;
	public JTextField jTextField13;
	public JTextField jTextField14;
	public JTextField jTextField15;
	public JTextField jTextField16;
	public JTextField jTextField17;
	public JTextField jTextField18;
	public JTextField jTextField19;
	public JTextField jTextField2;
	public JTextField jTextField20;
	public JTextField jTextField21;
	public JTextField jTextField22;
	public JTextField jTextField23;
	public JTextField jTextField24;
	public JTextField jTextField25;
	public JTextField jTextField26;
	public JTextField jTextField27;
	public JTextField jTextField28;
	public JTextField jTextField29;
	public JTextField jTextField3;
	public JTextField jTextField30;
	public JTextField jTextField31;
	public JTextField jTextField32;
	public JTextField jTextField33;
	public JTextField jTextField34;
	public JTextField jTextField35;
	public JTextField jTextField36;
	public JTextField jTextField37;
	public JTextField jTextField38;
	public JTextField jTextField39;
	public JTextField jTextField4;
	public JTextField jTextField40;
	public JTextField jTextField41;
	public JTextField jTextField42;
	public JTextField jTextField43;
	public JTextField jTextField44;
	public JTextField jTextField45;
	public JTextField jTextField46;
	public JTextField jTextField47;
	public JTextField jTextField48;
	public JTextField jTextField49;
	public JTextField jTextField5;
	public JTextField jTextField50;
	public JTextField jTextField51;
	public JTextField jTextField6;
	public JTextField jTextField7;
	public JTextField jTextField8;
	public JTextField jTextField9;
	public JTable ups;
	public JTable ups1;
	public JTable ups2;
	public JTable ups3;

	public DeleteItemView() {
		this.jFrame2.setTitle("Item this Update");
		this.jFrame2.setLocationByPlatform(true);
		this.jFrame2.setMinimumSize(new java.awt.Dimension(426, 400));
		this.jFrame2.setResizable(false);

		this.jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		this.jLabel5.setText("Item this");

		this.jLabel6.setText("Enter Code of item to be updated :");

		this.jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter this :"));

		this.jLabel9.setText("Rate :");

		this.jLabel7.setText("Stock - in - Hand :");

		this.jLabel10.setText("Item Name :");

		this.jButton3.setText("Update");
		this.jButton3.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		this.jButton4.setText("Reset");
		this.jButton4.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		this.jButton47.setText("Back");
		this.jButton47.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton47ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(this.jPanel1);
		this.jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(34, 34, 34).addComponent(this.jButton3)
						.addGap(50, 50, 50).addComponent(this.jButton4).addGap(41, 41, 41).addComponent(this.jButton47)
						.addContainerGap(52, Short.MAX_VALUE))
				.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(27, 27, 27).addGroup(jPanel1Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(this.jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 158,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6,
												Short.MAX_VALUE)
										.addComponent(this.jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 141,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(this.jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 158,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6,
												Short.MAX_VALUE)
										.addComponent(this.jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 141,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(this.jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 158,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6,
												Short.MAX_VALUE)
										.addComponent(this.jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 141,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGap(28, 28, 28))));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
						.addContainerGap(141, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(this.jButton3).addComponent(this.jButton47).addComponent(this.jButton4))
						.addContainerGap())
				.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(this.jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
												javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(this.jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(this.jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(this.jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(this.jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(this.jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap(80, Short.MAX_VALUE))));

		javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(this.jFrame2.getContentPane());
		this.jFrame2.getContentPane().setLayout(jFrame2Layout);
		jFrame2Layout.setHorizontalGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jFrame2Layout.createSequentialGroup().addGap(28, 28, 28)
						.addComponent(this.jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(this.jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 167,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(53, 53, 53))
				.addGroup(jFrame2Layout.createSequentialGroup().addContainerGap()
						.addComponent(this.jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jFrame2Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(this.jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 158,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(128, 128, 128)));
		jFrame2Layout.setVerticalGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jFrame2Layout.createSequentialGroup().addContainerGap()
						.addComponent(this.jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(this.jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(this.jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(39, 39, 39)
						.addComponent(this.jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
		try {
			String mk = jTextField7.getText();
			String ml = jTextField9.getText();
			String mj = jTextField10.getText();
			String md = jTextField8.getText();
			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				Connection con = createConnection();
				Statement stmt = con.createStatement();
				int bp = JOptionPane.showConfirmDialog(this, "Do you want to update the record ?");
				if (bp == JOptionPane.YES_OPTION) {
					String query = "update item1 set item_name = '" + ml + "'and Rate = '" + mj
							+ "'and Stock_in_hand = '" + md + "'where item_code = '" + mk + "';";
					stmt.execute(query);
					JOptionPane.showMessageDialog(this, "Record has been updated");
				}
				if (bp == JOptionPane.CANCEL_OPTION) {
					jFrame2.dispose();
					jFrame2.setVisible(true);
				}
				if (bp == JOptionPane.NO_OPTION) {
					jFrame2.dispose();
					jFrame2.setVisible(true);
				}
				stmt.close();
				con.close();

			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, "Error in connectivity");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Invalid Entry", "message", 2);
		} // TODO add your handling code here:
	}// GEN-LAST:event_jButton3ActionPerformed

	private Connection createConnection() throws SQLException {
		Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/practise", "root", "root");
		return con;
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
		jTextField8.setText(null);
		jTextField7.setText(null);
		jTextField10.setText(null);
		jTextField9.setText(null); // TODO add your handling code here:
	}// GEN-LAST:event_jButton4ActionPerformed

	private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton47ActionPerformed
		jFrame2.setVisible(false); // TODO add your handling code here:
	}// GEN-LAST:event_jButton47ActionPerformed
}