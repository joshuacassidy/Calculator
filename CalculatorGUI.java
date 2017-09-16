package calculator;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;

public class CalculatorGUI extends JFrame {
    // Creating the variable for the numbers to be added and the answer variable. The action variable decides what math's operation should be preformed.
    double num1,ans;
    int action = -1;
    String num2 = "";

    public CalculatorGUI() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    private void initComponents() {

        // Instantiating the objects of the GUI
        display = new JTextField();
        addBtn = new JButton();
        clearBtn = new JButton();
        backSpaceBtn = new JButton();
        minusBtn = new JButton();
        btn9 = new JButton();
        btn8 = new JButton();
        btn7 = new JButton();
        multiplicationBtn = new JButton();
        btn6 = new JButton();
        btn5 = new JButton();
        btn4 = new JButton();
        equalsBtn = new JButton();
        decimalPointBtn = new JButton();
        btn0 = new JButton();
        divideBtn = new JButton();
        btn3 = new JButton();
        btn2 = new JButton();
        btn1 = new JButton();

        // Exit program on close.
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // Don't allow the window to be resized
        setResizable(false);

        display.setEditable(false);
        display.setFont(new Font("Tahoma", 1, 18)); 
        display.setHorizontalAlignment(JTextField.RIGHT);
        
        // Creating the buttons, setting their font, text and creating their action listeners's.
        addBtn.setFont(new Font("Tahoma", 1, 14)); 
        addBtn.setText("+");
        addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        clearBtn.setFont(new Font("Tahoma", 1, 14)); 
        clearBtn.setText("C");
        clearBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        backSpaceBtn.setFont(new Font("Tahoma", 1, 14)); 
        backSpaceBtn.setText("Backspace");
        backSpaceBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                backSpaceBtnActionPerformed(evt);
            }
        });

        minusBtn.setFont(new Font("Tahoma", 1, 14)); 
        minusBtn.setText("-");
        minusBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                minusBtnActionPerformed(evt);
            }
        });

        btn9.setText("9");
        addActionEventLister(btn9);

        btn8.setText("8");
        addActionEventLister(btn8);


        btn7.setText("7");
        addActionEventLister(btn7);

        multiplicationBtn.setFont(new Font("Tahoma", 1, 14)); 
        multiplicationBtn.setText("*");
        multiplicationBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                multiplicationBtnActionPerformed(evt);
            }
        });

        btn6.setText("6");
        addActionEventLister(btn6);

        btn5.setText("5");
        addActionEventLister(btn5);

        btn4.setText("4");
        addActionEventLister(btn4);

        equalsBtn.setFont(new Font("Tahoma", 1, 14)); 
        equalsBtn.setText("=");
        equalsBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                equalsBtnActionPerformed(evt);
            }
        });

        decimalPointBtn.setFont(new Font("Tahoma", 1, 14)); 
        decimalPointBtn.setText(".");
        decimalPointBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                decimalPointBtnActionPerformed(evt);
            }
        });

        btn0.setText("0");
        addActionEventLister(btn0);

        divideBtn.setFont(new Font("Tahoma", 1, 14)); 
        divideBtn.setText("/");
        divideBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                divideBtnActionPerformed(evt);
            }
        });

        btn3.setText("3");
        addActionEventLister(btn3);

        btn2.setText("2");
        addActionEventLister(btn2);

        btn1.setText("1");
        addActionEventLister(btn1);

        // Components of the GUI being added to the windeow.
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(backSpaceBtn, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(clearBtn, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(addBtn, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btn7, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn8, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn9, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(minusBtn, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btn4, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn5, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn6, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(multiplicationBtn, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn1, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn2, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn3, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(divideBtn, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn0, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(decimalPointBtn, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(equalsBtn, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(display)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(display, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBtn, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                    .addComponent(backSpaceBtn, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(minusBtn, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(multiplicationBtn, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(divideBtn, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(equalsBtn, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                    .addComponent(decimalPointBtn, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn0, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }                     
    
    // The calculate button
    private void calc(){
        try{
            double currentDisplay = Double.parseDouble(num2);
            double[] x = {num1+currentDisplay,num1-currentDisplay,num1*currentDisplay,num1/currentDisplay};
            for(int i = 0; i < x.length; i++){
                // Deciding whether to add, subtract divide or multiple depending on the button clicked.
                if(action == i){
                    // Set the answer to the chosen operation.
                    ans = x[i];
                    // Setting the text to the new answer.
                    display.setText(ans == (long) ans ? String.format("%d",(long)ans) : String.format("%s",ans));
                    // Break out of the loop to prevent unneccessary iterations.
                    break;
                }
            }
            // Setting num1 to prevent math errors.
            num1 = Double.parseDouble(display.getText());
 
        } catch(NumberFormatException e){
            // When a number hasn't been added to another just show the number put into the calculator.
            display.setText(Double.toString(num1));
        }
    }
    
    // Adding the action listener to the number buttons.
    private void addActionEventLister(JButton btn){
                btn.setFont(new Font("Tahoma", 1, 14)); 
                btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
    }

    // Setting the text and num2 using the one function instead of having 10 seperate functions for each number.
    private void btnActionPerformed(ActionEvent evt) {
        display.setText(display.getText() + evt.getActionCommand());
        secondNumber(evt.getActionCommand());
    }
    
    // Setting the second number to be operated upon
    private void secondNumber(String nextNumberEntered){
        num2 = num2 + nextNumberEntered;
    }

    // Adding the decimal point.
    private void decimalPointBtnActionPerformed(ActionEvent evt) {
        // Make sure the number doesn't already have a decimal point.
        if(!display.getText().contains(".")){
            display.setText(display.getText() + ".");
            // Setting the decimal point for the secound number.
            secondNumber(evt.getActionCommand());
        }
        
    }

    // The method that controls what happpens whaen the back space button is pressed
    private void backSpaceBtnActionPerformed(ActionEvent evt) {
        // If there is text in the field
        if(display.getText().length() > 0){
            // Delete the last character using a string buffer.
            StringBuffer back = new StringBuffer(display.getText());
            back.deleteCharAt(display.getText().length()-1);
            display.setText(back.toString());
        }
        
    }

    private void clearBtnActionPerformed(ActionEvent evt) {
        // Set the numbers to be added to 0
        num1 = 0;
        num2 ="";
        display.setText("");
    }

    // When the add action button is pressed.
    private void addBtnActionPerformed(ActionEvent evt) {
        // Call function to manage the two numbers to be added (num1 and num2).
        operationPreformed();
        // Let the for loop in the calc method know to preform the addition operation.
        action=0;
    }

    // When the subtraction action button is pressed.
    private void minusBtnActionPerformed(ActionEvent evt) {
        // Call function to manage the two numbers to be subtracted (num1 and num2).
        operationPreformed();
        // Let the for loop in the calc method know to preform the subtraction operation.
        action=1;
        
    }

    // When the multiplication action button is pressed.
    private void multiplicationBtnActionPerformed(ActionEvent evt) {
        // Call function to manage the two numbers to be multiplied (num1 and num2).
        operationPreformed();
        // Let the for loop in the calc method know to preform the multiplication operation.
        action=2;
    }

    // When the division action button is pressed.
    private void divideBtnActionPerformed(ActionEvent evt) {
        // Call function to manage the two numbers to be divided (num1 and num2).
        operationPreformed();
        // Let the for loop in the calc method know to preform the division operation.
        action=3;
    }

    // Method that manages num1 and num2 when the add, subtract. multiply or divide button is pressed.
    private void operationPreformed(){
        // Using a try and catch statement to make sure that there is no NumberFormatException which would occur is a mathimatic operation button (add,subtract,multiply, divide) button was pressed twice in a row.
        try{
            // Set num1 to the text displayed on the calculator
            num1 = Double.parseDouble(display.getText());
            // Set the calculator text and num2 to nothing.
            display.setText("");
            num2 = "";
        } catch (NumberFormatException e){
            
        }
    }
    // The method that manages when the equals button action is pressed.
    private void equalsBtnActionPerformed(ActionEvent evt) {
        // Call the calc function
        calc();
    }

    // Initialising the Calculator Buttons and Display
    private JButton addBtn,backSpaceBtn,btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,clearBtn,decimalPointBtn,minusBtn,divideBtn,equalsBtn,multiplicationBtn;
    private JTextField display;
    
}
