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
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class Library extends JFrame {
    private static final long serialVersionUID = 1L;
    static Library frame;
    private JPanel contentPane;

    // Launch The Application
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new Library();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // Create The Frame
public Library(){
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100,100,100,100);
    contentPane=new JPanel();
    contentPane.setBorder(new EmptyBorder(5,5,5,5));
    setContentPane(contentPane);

    JLabel lblLibraryManagement=new JLabel("Library Management");
    lblLibraryManagement.setFont(new Font("Tahoma",Font.BOLD,20));
    lblLibraryManagement.setForeground(Color.BLUE);

    JButton btnAdminLogin=new JButton("Admin Login");
    btnAdminLogin.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
            AdminLogin.main(new String[]{});
            frame.dispose();
		}
    });
    btnAdminLogin.setFont(new Font("Tahoma",Font.BOLD,20));

    JButton btnLibrarianLogin=new JButton("Librarian Login");
    btnLibrarianLogin.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
            LibrarianLogin.main(new String[]{});
            frame.dispose();
		}
    });
        btnLibrarianLogin.setFont(new Font("Tahoma",Font.ITALIC,20));

    GroupLayout gl_contentPane=new GroupLayout(contentPane);
    gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(64)
							.addComponent(lblLibraryManagement))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(140)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btnLibrarianLogin, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnAdminLogin, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))))
					.addContainerGap(95, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblLibraryManagement)
					.addGap(32)
					.addComponent(btnAdminLogin, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnLibrarianLogin, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(70, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}


