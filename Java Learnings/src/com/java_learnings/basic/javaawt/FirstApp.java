package com.java_learnings.basic.javaawt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


@SuppressWarnings("serial")
class MyFrame1 extends Frame implements ActionListener{
	int count =0;
	Label l;
	TextField tf;
	Button b;
	
	public MyFrame1(){
		super("Button Demo");
		setLayout(new FlowLayout());
		
		l=new Label("  " + count);
		b = new Button("Click");
		b.addActionListener(this);
		
		add(l);
		add(b);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		count++;
		l.setText("  " +count);
		
	}
}
public class FirstApp {
	
	public static void main(String[] args) {
		
		MyFrame f = new MyFrame();
		f.setSize(400,400);
		f.setVisible(true);
	
	}

}
