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
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class LibrarianForm extends JFrame {
    private static final long serialVersionUID = 1L;
    static LibrarianForm frame;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JPasswordField passwordField;

    // Launch The Application
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new LibrarianForm();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    // Create The Frame
public LibrarianForm(){
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100,10,100,100);
    contentPane=new JPanel();
    contentPane.setBorder(new EmptyBorder(5,5,5,5));
    setContentPane(contentPane);

    JLabel lblAddLibrarian=new JLabel("Add Librarian");
    lblAddLibrarian.setForeground(Color.MAGENTA);
    lblAddLibrarian.setFont(new Font("Tahoma",Font.ITALIC,20));

    JLabel lblName=new JLabel("Name");
    JLabel lblPassword=new JLabel("Password");
    JLabel lblEmail=new JLabel("Email");
    JLabel lblAddress=new JLabel("Address");
    JLabel lblCity=new JLabel("City");
    JLabel lblContactNo=new JLabel("Contact No");

    textField=new JTextField();
    textField.setColumns(10);

    textField1=new JTextField();
    textField1.setColumns(10);

    textField2=new JTextField();
    textField2.setColumns(10);

    textField3=new JTextField();
    textField3.setColumns(10);

    textField4=new JTextField();
    textField4.setColumns(10);

    passwordField=new JPasswordField();

    JButton btnNewButton=new JButton("Add Librarian");
    btnNewButton.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
            String name=textField.getText();
            String password=String.valueOf(passwordField.getPassword());
            String email=textField1.getText();
            String address=textField2.getText();
            String city=textField3.getText();
            String contact=textField4.getText();

            int i=LibrarianDao.save(name,password,email,address,city,contact);
            if(i>0){
                JOptionPane.showMessageDialog(LibrarianForm.this,"Librarian Added Successfully!");
                AdminSuccess.main(new String[]{});
                frame.dispose();
            }else{
                JOptionPane.showMessageDialog(LibrarianForm.this,"Sorry!,Unable to save!");
            }
		}
    });
    btnNewButton.setForeground(Color.DARK_GRAY);

    JButton btnBack=new JButton("Back");
    btnBack.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
            AdminSuccess.main(new String[]{});
            frame.dispose();	
		}
    });
    GroupLayout gl_contentPane=new GroupLayout(contentPane);
    gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblPassword, GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
						.addComponent(lblName)
						.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAddress, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblCity, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblContactNo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(58)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textField4, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
						.addComponent(textField3, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
						.addComponent(textField2, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
						.addComponent(textField1, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
						.addComponent(textField, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
						.addComponent(passwordField))
					.addContainerGap(107, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(151, Short.MAX_VALUE)
					.addComponent(lblAddLibrarian)
					.addGap(144))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(160, Short.MAX_VALUE)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
					.addGap(133))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(200, Short.MAX_VALUE)
					.addComponent(btnBack)
					.addGap(169))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblAddLibrarian)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblName)
							.addGap(18)
							.addComponent(lblPassword))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmail)
						.addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAddress)
						.addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCity)
						.addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblContactNo)
						.addComponent(textField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
					.addComponent(btnBack)
					.addGap(19))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
