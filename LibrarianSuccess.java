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
import javax.swing.border.EmptyBorder;

public class LibrarianSuccess extends JFrame {
    private static final long serialVersionUID = 1L;
    static LibrarianSuccess frame;
    private JPanel contentPane;

    // Launch The Application
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new LibrarianSuccess();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    // Create The Frame
public LibrarianSuccess(){
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100,100,100,100);
    contentPane=new JPanel();
    contentPane.setForeground(Color.GREEN);
    contentPane.setBorder(new EmptyBorder(5,5,5,5));
    setContentPane(contentPane);

    JLabel lblLibrarianSection=new JLabel("Librarian Section");
    lblLibrarianSection.setFont(new Font("Tahoma",Font.ITALIC,20));

    JButton btnNewButton=new JButton("Add Books");
    btnNewButton.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
            BooksForm.main(new String[]{});
            frame.dispose();
		}
    });
    btnNewButton.setFont(new Font("Tahoma",Font.BOLD,20));

    JButton btnViewBooks=new JButton("View Books");
    btnViewBooks.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
			ViewBooks.main(new String[]{});
			frame.dispose();
		}
    });
    btnViewBooks.setFont(new Font("Tahoma",Font.BOLD,20));

    JButton btnIssueBook=new JButton("Issue Book");
    btnIssueBook.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
            IssueBooksForm.main(new String[]{});
            frame.dispose();
		}
    });
    btnIssueBook.setFont(new Font("Tahoma",Font.BOLD,20));

    JButton btnViewIssuedBooks=new JButton("View Issued Books");
    btnViewIssuedBooks.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
            ViewIssuedBooks.main(new String[]{});
            frame.dispose();
		}
    });
    btnViewIssuedBooks.setFont(new Font("Tahoma",Font.BOLD,20));

    JButton btnReturnBook=new JButton("Return Book");
    btnReturnBook.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
            ReturnBook.main(new String[]{});
            frame.dispose();
		}
    });
    btnReturnBook.setFont(new Font("Tahoma",Font.BOLD,20));

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
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(81, Short.MAX_VALUE)
					.addComponent(lblLibrarianSection)
					.addGap(54))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(132)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnReturnBook, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnViewIssuedBooks, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnIssueBook, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnViewBooks, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(101, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblLibrarianSection)
					.addGap(18)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnViewBooks, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnIssueBook, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnViewIssuedBooks, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnReturnBook, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(16, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
