package LibraryMgmtSystem;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class ViewLibrarian extends JFrame{
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable table;
public static void main(String[] args){
    EventQueue.invokeLater(new Runnable(){
        public void run(){
            try{
                ViewLibrarian frame=new ViewLibrarian();
                frame.setVisible(true); 
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    });
} 
//Create The Frame
public ViewLibrarian(){
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100,100,100,100);
    contentPane=new JPanel();
    contentPane.setBorder(new EmptyBorder(5,5,5,5));
    setContentPane(contentPane);

    String data[][]=null;
    String column[]=null;
    try{
        Connection con=DB.getConnection();
        PreparedStatement ps=con.prepareStatement("select * from Librarian",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ResultSet rs=ps.executeQuery();

        ResultSetMetaData rsmd=rs.getMetaData();
        int cols=rsmd.getColumnCount();
        column=new String[cols];

        for(int i=1;i<=cols;i++){
            column[i-1]=rsmd.getColumnName(i);
        }
        rs.last();
        int rows=rs.getRow();
        rs.beforeFirst();

        data=new String[rows][cols];
        int count=0;
        while(rs.next()){
            for(int i=1;i<=cols;i++){
                data[count][i-1]=rs.getString(i);
            }
            count++;
        }
        con.close();
    }catch(Exception e){
        e.printStackTrace();
    }
    table=new JTable(data,column);
    JScrollPane sp=new JScrollPane(table);

    contentPane.add(sp);
    }
}
