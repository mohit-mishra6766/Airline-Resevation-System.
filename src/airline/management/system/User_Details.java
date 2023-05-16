package airline.management.system;

import net.proteanit.sql.DbUtils;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class User_Details extends JFrame{  //Second Frame

    private JTable table;
    private JTextField textField;

    public static void main(String[] args){
        new User_Details().setVisible(true);
    }

    public User_Details(){

        getContentPane().setBackground(Color.WHITE);
        getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(860,523);
        setLayout(null);
        setVisible(true);

        JLabel Fcode = new JLabel("FLIGHT CODE");
        Fcode.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Fcode.setBounds(50, 100, 200, 30);
        add(Fcode);


        JLabel FlightDetails = new JLabel("User Details");
        FlightDetails.setFont(new Font("Tahoma", Font.PLAIN, 31));
        FlightDetails.setForeground(new Color(100, 149, 237));
        FlightDetails.setBounds(50, 20, 570, 35);
        add(FlightDetails);

        JButton btnShow = new JButton("SHOW");
        btnShow.setFont(new Font("Tahoma", Font.PLAIN, 20));

        btnShow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                String code = textField.getText();

                try {
                    conn c = new conn();
                    String str = "select pnr_no,address,nationality,name,gender,ph_no,passport_no,fl_code from passenger where fl_code = '"+code+"'";

                    ResultSet rs = c.s.executeQuery(str);
                    table.setModel(DbUtils.resultSetToTableModel(rs));

                }catch(SQLException e){
                    e.printStackTrace();
                }
            }
        });

        btnShow.setBounds(220, 150, 120, 30);
        add(btnShow);

        table = new JTable();
        table.setBackground(Color.WHITE);
        table.setBounds(23, 250, 800, 300);

        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(23, 250, 800, 300);
        pane.setBackground(Color.WHITE);
        add(pane);

        textField = new JTextField();
        textField.setBounds(220, 100, 200, 30);
        add(textField);

        JLabel FlightCode = new JLabel("PNR No.");
        FlightCode.setFont(new Font("Tahoma", Font.PLAIN, 13));
        FlightCode.setBounds(30, 220, 126, 14);
        add(FlightCode);

        JLabel FlightName = new JLabel("Address");
        FlightName.setFont(new Font("Tahoma", Font.PLAIN, 13));
        FlightName.setBounds(120, 220, 120, 14);
        add(FlightName);

        JLabel Source = new JLabel("Nationality");
        Source.setFont(new Font("Tahoma", Font.PLAIN, 13));
        Source.setBounds(235, 220, 104, 14);
        add(Source);

        JLabel Destination = new JLabel("Name");
        Destination.setFont(new Font("Tahoma", Font.PLAIN, 13));
        Destination.setBounds(358, 220, 120, 14);
        add(Destination);


        JLabel Capacity = new JLabel("Gender");
        Capacity.setFont(new Font("Tahoma", Font.PLAIN, 13));
        Capacity.setBounds(445, 220, 111, 14);
        add(Capacity);

        JLabel ClassCode = new JLabel("Phone No.");
        ClassCode.setFont(new Font("Tahoma", Font.PLAIN, 13));
        ClassCode.setBounds(545, 220, 120, 14);
        add(ClassCode);

        JLabel ClassName = new JLabel("Passport No.");
        ClassName.setFont(new Font("Tahoma", Font.PLAIN, 13));
        ClassName.setBounds(645, 220, 111, 14);
        add(ClassName);
        JLabel passport_n = new JLabel("Flight Code");
        passport_n.setFont(new Font("Tahoma", Font.PLAIN, 13));
        passport_n.setBounds(745, 220, 111, 18);
        add(passport_n);


        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(900,650);
        setVisible(true);
        setLocation(200,50);

    }
}
