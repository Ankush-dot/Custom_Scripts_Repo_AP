package com.java_learnings.basic.javaawt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SApp extends Frame implements ActionListener{
	TextArea textArea;
	TextField textField;
	Button b;
	Label l;
	
	public SApp() {
		super("Demo APP");
		l = new Label("No Text Entered");
		textArea = new TextArea(10,40);
		textField = new TextField(15);
		b = new Button("click");
		
		setLayout(new FlowLayout());
		
		add(textArea);
		add(l);
		add(textField);
		add(b);
		b.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		l.setText(textArea.getSelectedText());
		textArea.append(textField.getText());
		textArea.insert(textField.getText(), textArea.getCaretPosition());
	}
	
}

public class JavaTextArea {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SApp sap = new SApp();
		sap.setSize(400,400);
		sap.setVisible(true);
	}
}
