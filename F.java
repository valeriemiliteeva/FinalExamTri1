import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Color;
import java.awt.Component;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;


import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class F extends MenuControl {
	private final JLabel calcArea = new JLabel("");

	// calculator control
	private String calcAreaDefault = new String("0.0");
	private boolean initialCalcAreaInputState;
	private enum STATE { INITIAL, SAVE1, SAVE2, CALC };
	private STATE mathState;
	
	// calculator values
	private enum OPERATOR { NOOP, PLUS, MINUS, DIVIDE, MULTIPLY };
    private OPERATOR mathOp;
	private double arg1;
    private double arg2;
    private double calcAnswer;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					F frame = new F();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void calculateAnswer()  // method to perform calculation
	{
	    switch(mathOp)
	    {
	        case PLUS:
	            calcAnswer = arg1 + arg2;
	            break;
	        case MINUS:
	            calcAnswer = arg1 - arg2;
	            break;
	        case DIVIDE:
	            calcAnswer = arg1 / arg2;
	            break;
	        case MULTIPLY:
	            calcAnswer = arg1 * arg2;
	            break;
	        case NOOP:
	            calcAnswer = arg1;
	    }
		calcArea.setText(String.valueOf(calcAnswer));
	    arg1 = Double.valueOf(calcArea.getText());
	    mathState = STATE.CALC;
		initialCalcAreaInputState = true;
	}
	
	private void updateCalcArea(String string) {
		if (initialCalcAreaInputState) {  // sets text to string on initial key typed
			calcArea.setText(string);
			initialCalcAreaInputState = false;
	    } else  {                         // concatenates string to end of text subsequent keys typed
			calcArea.setText(calcArea.getText() + string);
	    }
	}
	
	/**
	 * Save values for Calculator.
	 */
	private void saveValueOfArg1() { // method to store 1st value in calculation (arg1)
	    arg1 = Double.valueOf(calcArea.getText());
	    mathState = STATE.SAVE1;
		initialCalcAreaInputState = true;
	}
	
	private void saveValueOfArg2() { // method to store 2nd value in calculation (arg2)
		if (mathState != STATE.CALC) {
			arg2 = Double.valueOf(calcArea.getText());
			mathState = STATE.SAVE2;
		}
	}
	
	private void saveValueOfMathOp(OPERATOR op) { // method to store operator
		mathOp = op;
	}
	
	private void clearCalculator() {  // helper method to clear and update calculator to default
		calcArea.setText(calcAreaDefault);
		mathState = STATE.INITIAL;
		initialCalcAreaInputState = true;
		arg1 = 0.0;
		arg2 = 0.0;
		calcAnswer = 0.0;
	}
	
	public F() {
		getContentPane().setBackground(Color.YELLOW);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 418, 315);
		getContentPane().setLayout(null);
		calcArea.setForeground(new Color(255, 0, 0));
		calcArea.setFont(new Font("Lucida Grande", Font.PLAIN, 72));
		calcArea.setHorizontalAlignment(SwingConstants.RIGHT);
		calcArea.setBounds(18, 6, 377, 67);
		getContentPane().add(calcArea);
		

		
		JButton button_plus = new JButton("+");
		button_plus.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_plus.setBackground(new Color(30, 144, 255));
			}
			
			public void mouseReleased(MouseEvent e) {
				button_plus.setBackground(new Color(0, 0, 255));
			}
		});
		button_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveValueOfArg1();
				saveValueOfMathOp(OPERATOR.PLUS);
			}
		});
		button_plus.setOpaque(true);
		button_plus.setForeground(new Color(0, 255, 255));
		button_plus.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 255, 255)));
		button_plus.setBackground(new Color(0, 0, 255));
		button_plus.setBounds(327, 138, 75, 40);
		getContentPane().add(button_plus);
		
		JButton button_minus = new JButton("-");
		button_minus.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_minus.setBackground(new Color(30, 144, 255));
			}
			
			public void mouseReleased(MouseEvent e) {
				button_minus.setBackground(new Color(0, 0, 255));
			}
		});
		button_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveValueOfArg1();
				saveValueOfMathOp(OPERATOR.MINUS);
			}
		});
		button_minus.setOpaque(true);
		button_minus.setForeground(new Color(0, 255, 255));
		button_minus.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 255, 255)));
		button_minus.setBackground(new Color(0, 0, 255));
		button_minus.setBounds(327, 190, 75, 40);
		getContentPane().add(button_minus);
		
		JButton button_equals = new JButton("=");
		button_equals.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_equals.setBackground(new Color(30, 144, 255));
			}
			
			public void mouseReleased(MouseEvent e) {
				button_equals.setBackground(new Color(0, 0, 255));
			}
		});
		button_equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveValueOfArg2();
				calculateAnswer();
			}
		});
		button_equals.setOpaque(true);
		button_equals.setForeground(new Color(0, 255, 255));
		button_equals.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 255, 255)));
		button_equals.setBackground(new Color(0, 0, 255));
		button_equals.setBounds(327, 242, 75, 40);
		getContentPane().add(button_equals);
		
		JButton button_clear = new JButton("AC");
		button_clear.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_clear.setBackground(new Color(30, 144, 255));
			}
			
			public void mouseReleased(MouseEvent e) {
				button_clear.setBackground(new Color(0, 225, 255));
			}
		});
		button_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearCalculator();
			}
		});
		button_clear.setOpaque(true);
		button_clear.setForeground(new Color(0, 0, 255));
		button_clear.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 255)));
		button_clear.setBackground(new Color(0, 255, 255));
		button_clear.setBounds(327, 85, 75, 40);
		getContentPane().add(button_clear);
		
		JButton button_1 = new JButton("1");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_1.setBackground(new Color(219,112,147));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				button_1.setBackground(new Color(255,20,147));
			}
		});
		button_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 255, 0)));
		button_1.setOpaque(true);
		button_1.setForeground(new Color(0, 255, 0));
		button_1.setBackground(new Color(255, 20, 147));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateCalcArea(button_1.getText());
			}
		});
		button_1.setBounds(36, 85, 75, 40);
		getContentPane().add(button_1);
		
		JButton button_2 = new JButton("2");
		
			button_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					button_2.setBackground(new Color(219,112,147));
				}
				@Override
				public void mouseReleased(MouseEvent e) {
					button_2.setBackground(new Color(255, 20, 147));
				}
			
		});
		button_2.setOpaque(true);
		button_2.setForeground(new Color(0, 255, 0));
		button_2.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 255, 0)));
		button_2.setBackground(new Color(255, 20, 147));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateCalcArea(button_2.getText());
			}
		});
		button_2.setBounds(123, 85, 75, 40);
		getContentPane().add(button_2);
		
		JButton button_3 = new JButton("3");
		
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_3.setBackground(new Color(219,112,147));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				button_3.setBackground(new Color(255, 20, 147));
			}
		
	});
		
		button_3.setOpaque(true);
		button_3.setForeground(new Color(0, 255, 0));
		button_3.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 255, 0)));
		button_3.setBackground(new Color(255, 20, 147));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateCalcArea(button_3.getText());
			}
			
		});
		button_3.setBounds(210, 85, 75, 40);
		getContentPane().add(button_3);
		
		JButton button_4 = new JButton("4");
		
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_4.setBackground(new Color(219,112,147));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				button_4.setBackground(new Color(255, 20, 147));
			}
		
	});
		
		button_4.setOpaque(true);
		button_4.setForeground(new Color(0, 255, 0));
		button_4.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 255, 0)));
		button_4.setBackground(new Color(255, 20, 147));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateCalcArea(button_4.getText());
			}
		});
		button_4.setBounds(36, 137, 75, 40);
		getContentPane().add(button_4);
		
		JButton button_5 = new JButton("5");
		
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_5.setBackground(new Color(219,112,147));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				button_5.setBackground(new Color(255, 20, 147));
			}
		
	});
		
		button_5.setOpaque(true);
		button_5.setForeground(new Color(0, 255, 0));
		button_5.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 255, 0)));
		button_5.setBackground(new Color(255, 20, 147));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateCalcArea(button_5.getText());
				
			}
		});
		button_5.setBounds(123, 138, 75, 40);
		getContentPane().add(button_5);
		
		JButton button_6 = new JButton("6");
		
		button_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_6.setBackground(new Color(219,112,147));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				button_6.setBackground(new Color(255, 20, 147));
			}
		
	});
		
		button_6.setOpaque(true);
		button_6.setForeground(new Color(0, 255, 0));
		button_6.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 255, 0)));
		button_6.setBackground(new Color(255, 20, 147));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateCalcArea(button_6.getText());
			}
		});
		button_6.setBounds(210, 138, 75, 40);
		getContentPane().add(button_6);
		
		JButton button_7 = new JButton("8");
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_7.setBackground(new Color(219,112,147));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				button_7.setBackground(new Color(255, 20, 147));
			}
		
	});
		
		button_7.setOpaque(true);
		button_7.setForeground(new Color(0, 255, 0));
		button_7.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 255, 0)));
		button_7.setBackground(new Color(255, 20, 147));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateCalcArea(button_7.getText());
			}
		});
		button_7.setBounds(123, 190, 75, 40);
		getContentPane().add(button_7);
		
		JButton button_8 = new JButton("7");
		button_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_8.setBackground(new Color(219,112,147));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				button_8.setBackground(new Color(255, 20, 147));
			}
		
	});
		
		button_8.setOpaque(true);
		button_8.setForeground(new Color(0, 255, 0));
		button_8.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 255, 0)));
		button_8.setBackground(new Color(255, 20, 147));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateCalcArea(button_8.getText());
			}
		});
		button_8.setBounds(36, 190, 75, 40);
		getContentPane().add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_9.setBackground(new Color(219,112,147));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				button_9.setBackground(new Color(255, 20, 147));
			}
		
	});
		
		button_9.setOpaque(true);
		button_9.setForeground(new Color(0, 255, 0));
		button_9.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 255, 0)));
		button_9.setBackground(new Color(255, 20, 147));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateCalcArea(button_9.getText());
			}
		});
		button_9.setBounds(210, 190, 75, 40);
		getContentPane().add(button_9);
		
		JLabel lblNewLabel = new JLabel("Valerie Militeeva's Calculator");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		lblNewLabel.setBounds(77, 242, 180, 40);
		getContentPane().add(lblNewLabel);
	}
}