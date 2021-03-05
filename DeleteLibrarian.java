package LibraryMgmtSystem;

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
import javax.swing.border.EmptyBorder;

public class DeleteLibrarian extends JFrame {
    private static final long serialVersionUID = 1L;
    static DeleteLibrarian frame;
    private JPanel contentPane;
    private JTextField textField;

    // Launch The Application
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    frame = new DeleteLibrarian();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // Create The Frame
public DeleteLibrarian(){
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100,100,450,300);
    contentPane=new JPanel();
    contentPane.setBorder(new EmptyBorder(5,5,5,5));
    setContentPane(contentPane);

    JLabel lblEnterId=new JLabel("Enter ID");

    textField=new JTextField();
    textField.setColumns(10);

    JButton btnDelete=new JButton("Delete");
    btnDelete.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
            String sid=textField.getText();
            if(sid==null||sid.trim().equals("")){
                JOptionPane.showMessageDialog(DeleteLibrarian.this,"ID cant be blank!");
            }else{
                int id=Integer.parseInt(sid);
                int i=LibrarianDao.delete(id);
                if(i>0){
                    JOptionPane.showMessageDialog(DeleteLibrarian.this,"ID can't be blank");
                }else{
                    JOptionPane.showMessageDialog(DeleteLibrarian.this,"Unable to delete given ID!");
                }
            }
		}
    });
    btnDelete.setFont(new Font("Tahoma",Font.BOLD,20));

    JButton btnBack=new JButton("Back");
    btnBack.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
            AdminSuccess.main(new String[]{});
            frame.dispose();
		} 
    });
    btnBack.setFont(new Font("Tahoma",Font.ITALIC,20));
    GroupLayout gl_contentPane=new GroupLayout(contentPane);
    gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(39)
					.addComponent(lblEnterId)
					.addGap(57)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(107, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(175, Short.MAX_VALUE)
					.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
					.addGap(140))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(322, Short.MAX_VALUE)
					.addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(19)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEnterId))
					.addGap(33)
					.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addGap(43)
					.addComponent(btnBack)
					.addContainerGap(78, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
