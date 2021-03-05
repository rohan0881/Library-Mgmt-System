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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class IssueBooksForm extends JFrame {
    private static final long serialVersionUID = 1L;
    static IssueBooksForm frame;
    private JPanel contentPane;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;

    // Launch The Application
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new IssueBooksForm();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // Create The Frame
public IssueBooksForm(){
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100,100,100,100);
    contentPane=new JPanel();
    contentPane.setBorder(new EmptyBorder(5,5,5,5));
    setContentPane(contentPane);

    JLabel lblIssueBook=new JLabel("Issue Book");
    lblIssueBook.setFont(new Font("Tahoma",Font.BOLD,20));
    lblIssueBook.setForeground(Color.BLACK);

    JLabel lblBookCallNo=new JLabel("Book CallNo");

    textField1=new JTextField();
    textField1.setColumns(10);

    textField2=new JTextField();
    textField2.setColumns(10);

    textField3=new JTextField();
    textField3.setColumns(10);

    textField4=new JTextField();
    textField4.setColumns(10);

    JLabel lblStudentId=new JLabel("Student ID");
    JLabel lblStudentName=new JLabel("Student Name");
    JLabel lblStudentContact=new JLabel("Student Contact");
    
    JButton btnIssueBook=new JButton("Issue Book");
    btnIssueBook.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
            String bookcallno=textField1.getText();
            int studentid=Integer.parseInt(textField2.getText());
            String studentname=textField3.getText();
            String studentcontact=textField4.getText();

            if(IssueBookDao.checkBook(bookcallno)){
                int i=IssueBookDao.save(bookcallno,studentid,studentname,studentcontact);
                if(i>0){
                    JOptionPane.showMessageDialog(IssueBooksForm.this,"Book Issued Successfully!");
                    LibrarianSuccess.main(new String[]{});
                    frame.dispose();
                }else{
                    JOptionPane.showMessageDialog(IssueBooksForm.this,"Sorry,Unable to Issue!");
                }
            }else {
                JOptionPane.showMessageDialog(IssueBooksForm.this,"Sorry,CallNo Doesn't Exist!");
            }
        }
});
JButton btnBack=new JButton("Back");
btnBack.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e) {
        LibrarianSuccess.main(new String[]{});
        frame.dispose();
    }
});
JLabel lblNewLabel1=new JLabel("Please check student ID carefully before issuing Book!");
lblNewLabel1.setFont(new Font("Tahoma",Font.PLAIN,20));
lblNewLabel1.setForeground(Color.GREEN);

GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(10, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblBookCallNo)
								.addComponent(lblStudentId)
								.addComponent(lblStudentName, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblStudentContact, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
							.addGap(10)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textField2, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField1, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField3, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField4, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE))
							.addGap(48))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addGap(20)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel1)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnIssueBook, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
									.addGap(47)
									.addComponent(btnBack)))
							.addGap(100))))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(146)
					.addComponent(lblNewLabel1)
					.addContainerGap(235, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(37)
					.addComponent(lblNewLabel1)
					.addGap(43)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBookCallNo)
						.addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblStudentId)
						.addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblStudentName)
						.addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblStudentContact)
						.addComponent(textField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnIssueBook, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBack))
					.addGap(18)
					.addComponent(lblNewLabel1)
					.addGap(25))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
