package com.java_learnings.basic.javaawt;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.List;

class ChoiceAndListBox extends Frame implements ItemListener, ActionListener{
	
	List l;
	Choice c;
	TextArea ta;
	
	public ChoiceAndListBox() {
		// TODO Auto-generated constructor stub
		l = new List(4,true);
		c = new Choice();
		ta = new TextArea(20,30);
		
		l.add("Monday");
		l.add("Tuesday");
		l.add("Wenesday");
		l.add("Thursday");
		l.add("Friday");
		l.add("Satuarday");
		l.add("Sunday");
		
		c.add("Jan");
		c.add("Feb");
		c.add("Mar");
		c.add("Apr");
		c.add("May");
		c.add("jun");
		
		setLayout(new FlowLayout());
		add(l);
		add(c);
		add(ta);
		
		l.addItemListener(this);
		c.addItemListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void itemStateChanged(ItemEvent ie) {
		// TODO Auto-generated method stub
		if(ie.getSource()==l)
			ta.setText(l.getSelectedItem());
		else
			ta.setText(c.getSelectedItem());
	}
	
	
	
	
}

public class JavaChoiceAndListBox {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChoiceAndListBox cl = new ChoiceAndListBox();
		cl.setSize(400,400);
		cl.setVisible(true);
	}

}
