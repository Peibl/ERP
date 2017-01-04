package project;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.mysql.jdbc.Connection;

public class DeleteItemView extends JFrame {
	private static final long serialVersionUID = 1L;
	private JButton jButton3;
	private JButton jButton4;
	private JButton jButton47;
	private JFrame jFrame2;
	private JLabel jLabel10;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JLabel jLabel7;
	private JLabel jLabel9;
	private JPanel jPanel1;
	private JTextField jTextField10;
	private JTextField jTextField7;
	private JTextField jTextField8;
	private JTextField jTextField9;

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