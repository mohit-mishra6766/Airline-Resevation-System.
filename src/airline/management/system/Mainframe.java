package airline.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Mainframe extends JFrame{

    public static void main(String[] args) {
        new Mainframe().setVisible(true);
    }
    
    public Mainframe() {
        super("AIRLINE RESERVATION MANAGEMENT SYSTEM");
        initialize();
    }

    
    private void initialize() {
	
        setForeground(Color.CYAN);
        setLayout(null); 

        JLabel NewLabel = new JLabel("");
	NewLabel.setIcon(new ImageIcon(ClassLoader.getSystemResource("airline/management/system/icon/logo3.png")));
	NewLabel.setBounds(400, 130, 1000, 400);
	add(NewLabel);

        JLabel AirlineManagementSystem = new JLabel("AIRLINE MANAGEMENT SYSTEM");
	AirlineManagementSystem.setForeground(Color.BLACK);
        AirlineManagementSystem.setFont(new Font("Segoe UI", Font.BOLD, 40));
	AirlineManagementSystem.setBounds(330, 70, 1000, 40);
	add(AirlineManagementSystem);
		
		
//        JMenuBar menuBar = new JMenuBar();
//	setJMenuBar(menuBar);
//
//        JMenu AirlineSystem = new JMenu("AIRLINE SYSTEM");
//        AirlineSystem.setForeground(Color.black);
//	menuBar.add(AirlineSystem);
//
        JButton FlightDetails = new JButton("FLIGHT_INFO");
        FlightDetails.setBounds(95,420,200,30);
        FlightDetails.setBackground(Color.CYAN);
                add(FlightDetails);

        JButton ReservationDetails = new JButton("ADD_CUSTOMER_DETAILS");
        ReservationDetails.setBounds(95,220,200,30);
        ReservationDetails.setBackground(Color.CYAN);
        add(ReservationDetails);
        JButton GetUserDetails = new JButton("CUSTOMER DETAILS");
        GetUserDetails.setBounds(95,320,200,30);
        GetUserDetails.setBackground(Color.CYAN);
        add(GetUserDetails);

        JButton PassengerDetails = new JButton("JOURNEY_DETAILS");
        PassengerDetails.setBounds(950,220,200,30);
        PassengerDetails.setBackground(Color.CYAN);
        add(PassengerDetails);

        JButton SectorDetails_1 = new JButton("PAYMENT_DETAILS");
        SectorDetails_1.setBounds(950,320,200,30);
        SectorDetails_1.setBackground(Color.CYAN);
        add(SectorDetails_1);

        JButton Cancellation = new JButton("CANCELLATION");
        Cancellation.setBounds(950,420,200,30);
        Cancellation.setBackground(Color.CYAN);
        add(Cancellation);
		
	/*JMenu Ticket = new JMenu("TICKET");
        Ticket.setForeground(Color.black);
	menuBar.add(Ticket);
		
        JMenu List = new JMenu("LIST");
        List.setForeground(Color.black);
	menuBar.add(List);
		
	JMenu Misc = new JMenu("MISC");
        Misc.setForeground(Color.black);
	menuBar.add(Misc);*/
        
		
	FlightDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Flight_Info();
            }
	});
    GetUserDetails.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            new User_Details();
        }
    });
        
	ReservationDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Add_Customer();
		} catch (Exception e) {
                    e.printStackTrace();
		} 
            }
	});
		
        PassengerDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Journey_Details();
                } catch (Exception e) {
                    e.printStackTrace();
		}
            }
	});
		
        SectorDetails_1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Payment_Details();
		} catch (Exception e) {
                    e.printStackTrace();
		}
            }
	});
		
        Cancellation.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Cancel();
            }
	});
		
        setSize(1920,1000);
        getContentPane().setBackground(Color.pink);
	setVisible(true);
    }
}
