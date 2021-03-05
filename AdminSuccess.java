package LibraryMgmtSystem;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;

public class AdminSuccess extends JFrame {
    private static final long serialVersionUID = 1L;
    static AdminSuccess frame;
    private JPanel contentPane;

    // Launch The Application
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new AdminSuccess();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

public AdminSuccess(){
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100,100,340,450);
    contentPane=new JPanel();
    setContentPane(contentPane);

    JLabel lblAdminSection=new JLabel("Admin Section");
    lblAdminSection.setFont(new Font("Tahoma",Font.BOLD,20));
    lblAdminSection.setForeground(Color.CYAN);

    JButton btnNewButton=new JButton("Add Librarian");
    btnNewButton.setFont(new Font("Tahoma",Font.PLAIN,20));
    btnNewButton.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
            LibrarianForm.main(new String[]{});
            frame.dispose();
        }
    });
    JButton btnViewLibrarian=new JButton("View Librarian");
    btnViewLibrarian.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
            ViewLibrarian.main(new String[]{});
            frame.dispose();
		}  
    });
    btnViewLibrarian.setFont(new Font("Tahoma",Font.ITALIC,20));

    JButton btnDeleteLibrarian=new JButton("Delete Librarian");
    btnDeleteLibrarian.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e){
            DeleteLibrarian.main(new String[]{});
            frame.dispose();
        }
    });
    btnDeleteLibrarian.setFont(new Font("Tahoma",Font.PLAIN,20));   

    JButton btnLogout=new JButton("Logout");
    btnLogout.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
            Library.main(new String[]{});
            frame.dispose();
		}
    });
    btnLogout.setFont(new Font("Tahoma",Font.BOLD,20));
    GroupLayout gl_contentPane=new GroupLayout(contentPane);
    gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(150, Short.MAX_VALUE)
					.addComponent(lblAdminSection, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
					.addGap(123))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(134)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnDeleteLibrarian, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnViewLibrarian, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(109, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblAdminSection, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnViewLibrarian, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnDeleteLibrarian, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(21, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
