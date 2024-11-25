package com.java_learnings.basic.javaawt;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;

@SuppressWarnings("serial")
class MyApp extends Frame {
	
	Label l1, l2;
	TextField tf;
	
	public MyApp() {
		
		super("Text Field Demo!!");
		
		l1 = new Label("No Test is Entered Yet");
		l2 = new Label("Enter key is not yet hit");
		tf = new TextField(15);
		tf.setEchoChar('*');
		Handler h = new Handler();
		tf.addTextListener(h);
		tf.addActionListener(h);
		
		setLayout(new FlowLayout());
		add(l1);
		add(tf);
		add(l2);

	}
	
	
	
	
	class Handler implements TextListener, ActionListener {

		@Override
		public void textValueChanged(TextEvent te) {
			// TODO Auto-generated method stub
			l1.setText(tf.getText());
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			l2.setText(tf.getText());
		}
		
	}

	
}

public class JavaTestListener {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			MyApp mp = new MyApp();
			mp.setSize(400,400);
			mp.setVisible(true);
		}


}
