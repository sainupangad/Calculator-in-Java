import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	
	boolean isOperatorClicked=false;
	boolean divClicked= false;
	boolean malClicked=false;
	boolean plusClicked=false;
	boolean minusClicked= false;
	String oldValue;
	
	JFrame jf;
	JLabel displayLable ;
	float result;
	float oldValueF;
	float newValueF;
	
	
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;	
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton dotButton;
	JButton zeroButton;
	JButton equalButton;
	JButton divButton;
	JButton malButton;
	JButton minusButton;
	JButton plusButton;
	JButton clearButton;
	
		
	public Calculator() {
		 jf= new JFrame("calculator");
		jf.setLayout(null);
		jf.setSize(600,600);
		jf.setLocation(300,50);
		
		 displayLable = new JLabel();
		displayLable.setBounds(30, 50, 540, 40);
		displayLable.setBackground(Color.gray);;
		displayLable.setOpaque(true);
		displayLable.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLable.setForeground(Color.white);
		jf.add(displayLable);
		
		sevenButton= new JButton("7");
		sevenButton.setBounds(30, 130, 80, 80);
		jf.add(sevenButton);
		sevenButton.addActionListener(this);
		 
		eightButton= new JButton("8");
		eightButton.setBounds(130, 130, 80, 80);
		jf.add(eightButton);
		eightButton.addActionListener(this);
		
		nineButton= new JButton("9");
		nineButton.setBounds(230, 130, 80, 80);
		jf.add(nineButton);
		nineButton.addActionListener(this);
		
		fourButton= new JButton("4");
		fourButton.setBounds(30, 230, 80, 80);
		jf.add(fourButton);
		fourButton.addActionListener(this);
		
		fiveButton= new JButton("5");
		fiveButton.setBounds(130, 230, 80, 80);
		jf.add(fiveButton);
		fiveButton.addActionListener(this);
		
		sixButton= new JButton("6");
		sixButton.setBounds(230, 230, 80, 80);
		jf.add(sixButton);
		sixButton.addActionListener(this);
		
		oneButton= new JButton("1");
		oneButton.setBounds(30, 330, 80, 80);
		jf.add(oneButton);
		oneButton.addActionListener(this);
		
		twoButton= new JButton("2");
		twoButton.setBounds(130, 330, 80, 80);
		jf.add(twoButton);
		twoButton.addActionListener(this);
		
		threeButton= new JButton("3");
		threeButton.setBounds(230, 330, 80, 80);
		jf.add(threeButton);
		threeButton.addActionListener(this);
		
		dotButton= new JButton(".");
		dotButton.setBounds(30, 430, 80, 80);
		jf.add(dotButton);
		dotButton.addActionListener(this);
		
		zeroButton= new JButton("0");
		zeroButton.setBounds(130, 430, 80, 80);
		jf.add(zeroButton);
		zeroButton.addActionListener(this);
		
		equalButton= new JButton("=");
		equalButton.setBounds(230, 430, 80, 80);
		jf.add(equalButton);
		equalButton.addActionListener(this);
		
		divButton= new JButton("/");
		divButton.setBounds(330, 130, 80, 80);
		jf.add(divButton);
		divButton.addActionListener(this);
		
		malButton= new JButton("X");
		malButton.setBounds(330, 230, 80, 80);
		jf.add(malButton);
		malButton.addActionListener(this);
		
		minusButton= new JButton("-");
		minusButton.setBounds(330, 330, 80, 80);
		jf.add(minusButton);
		minusButton.addActionListener(this);
		
		plusButton= new JButton("+");
		plusButton.setBounds(330, 430, 80, 80);
		jf.add(plusButton);
		plusButton.addActionListener(this);
		
		clearButton= new JButton("Clear");
		clearButton.setBounds(430, 430, 80, 80);
		jf.add(clearButton);
		clearButton.addActionListener(this);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public static void main(String[] args) {
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== sevenButton) {
			if(isOperatorClicked) {
				displayLable.setText("7");
				isOperatorClicked=false;
			}else {
				displayLable.setText(displayLable.getText()+"7");
			}
			
			
		}else if(e.getSource()==eightButton) {
			if(isOperatorClicked) {
				displayLable.setText("8");
				isOperatorClicked=false;
			}else {
				displayLable.setText(displayLable.getText()+"8");
			}
			
		}else if(e.getSource()==nineButton) {
			
			if(isOperatorClicked) {
				displayLable.setText("9");
				isOperatorClicked=false;
			}else {
				displayLable.setText(displayLable.getText()+"9");
			}
		}else if(e.getSource()==fourButton) {
			
			if(isOperatorClicked) {
				displayLable.setText("4");
				isOperatorClicked=false;
			}else {
				displayLable.setText(displayLable.getText()+"4");
			}
		}else if(e.getSource()==fiveButton) {
			
			if(isOperatorClicked) {
				displayLable.setText("5");
				isOperatorClicked=false;
			}else {
				displayLable.setText(displayLable.getText()+"5");
			}
		}else if(e.getSource()==sixButton) {
			
			if(isOperatorClicked) {
				displayLable.setText("6");
				isOperatorClicked=false;
			}else {
				displayLable.setText(displayLable.getText()+"6");
			}
		}else if(e.getSource()==oneButton) {
			
			if(isOperatorClicked) {
				displayLable.setText("1");
				isOperatorClicked=false;
			}else {
				displayLable.setText(displayLable.getText()+"1");
			}
		}else if(e.getSource()==twoButton) {
			
			if(isOperatorClicked) {
				displayLable.setText("2");
				isOperatorClicked=false;
			}else {
				displayLable.setText(displayLable.getText()+"2");
			}
		}else if(e.getSource()==threeButton) {
			
			if(isOperatorClicked) {
				displayLable.setText("3");
				isOperatorClicked=false;
			}else {
				displayLable.setText(displayLable.getText()+"3");
			}
		}else if(e.getSource()==dotButton) {
			
			if(isOperatorClicked) {
				displayLable.setText(".");
				isOperatorClicked=false;
			}else {
				displayLable.setText(displayLable.getText()+".");
			}
		}else if(e.getSource()==zeroButton) {
			
			if(isOperatorClicked) {
				displayLable.setText("0");
				isOperatorClicked=false;
			}else {
				displayLable.setText(displayLable.getText()+"0");
			}
		}else if(e.getSource()==equalButton) {
			String newValue = displayLable.getText();
			 oldValueF = Float.parseFloat(oldValue);
			 newValueF = Float.parseFloat(newValue);
			 
			 if(malClicked) {
				 result=oldValueF*newValueF;
			 }else if(plusClicked) {
				 result=oldValueF + newValueF;
				 
			 }else if(minusClicked) {
				 result=oldValueF - newValueF;
			 }else if(divClicked) {
				 result=oldValueF / newValueF;
			 }
			
			
			
			
			
			
			displayLable.setText(result+"");
			 
			
		}else if(e.getSource()==divButton) {
			isOperatorClicked=true;
			divClicked = true;
			oldValue=displayLable.getText();
			
			
		}else if(e.getSource()==malButton) {
			isOperatorClicked=true;
			malClicked=true;
			oldValue= displayLable.getText();
			
		}else if(e.getSource()==minusButton) {
			oldValue= displayLable.getText();
			isOperatorClicked=true;
			minusClicked= true;
			
		}else if(e.getSource()==plusButton) {
			isOperatorClicked=true;
			plusClicked=true;
			oldValue= displayLable.getText();
			
			
		}else if(e.getSource()==clearButton) {
			
			displayLable.setText("");
			 divClicked= false;
			 malClicked=false;
			 plusClicked=false;
			 minusClicked= false;
			
			
		}
		
	}

}
