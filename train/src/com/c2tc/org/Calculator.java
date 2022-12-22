package com.c2tc.org;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JFrame;

public class Calculator extends Frame implements ActionListener {
	static JButton b1,b2,b3,b4;
	static JLabel l;
	static JTextField tf;
	Calculator(){
		JFrame f = new JFrame("Calculator");
		
		l = new JLabel("Enter the host name");
		l.setBounds(50,5,500,50);
		tf = new JTextField();
		tf.setBounds(50, 50, 200, 70);
		
		b1 = new JButton("Add");
		b1.setBounds(50, 150, 100, 50);
		b1.addActionListener(this);
		
		b2 = new JButton("Sub");
		b2.setBounds(160, 150, 100, 50);
		
		b3 = new JButton("Mul");
		b3.setBounds(270, 150, 100, 50);
		
		b4 = new JButton("Div");
		b4.setBounds(380, 150, 100, 50);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(tf);
		f.add(l);
		;
		
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculator();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
			String host = tf.getText();
			if(!host.isEmpty()) {
				String ip = java.net.InetAddress.getByName(host).getHostAddress();
				l.setText("The ip of "+host+" is "+ip);
			}else {
				l.setText("Enter the valid host name");
			}
			
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		
	}

}
