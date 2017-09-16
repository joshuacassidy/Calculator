package calculator;


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

public class CalculatorGUI extends JFrame {
    double num,ans;
    int action;
    String number;
    public CalculatorGUI() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    private void initComponents() {

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

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        display.setEditable(false);
        display.setFont(new Font("Tahoma", 1, 18)); 
        display.setHorizontalAlignment(JTextField.RIGHT);
        

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(backSpaceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(minusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(multiplicationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(divideBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(decimalPointBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(equalsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(display)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(display, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backSpaceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(multiplicationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(divideBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equalsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decimalPointBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        
    
    private void calc(){
        
        double currentDisplay = Double.parseDouble(number);
        System.out.println(number);
        double[] x = {num+currentDisplay,num-currentDisplay,num*currentDisplay,num/currentDisplay};
        for(int i = 0; i < x.length; i++){
            if(action == i){
                ans = x[i];
                display.setText(Double.toString(ans));
                break;
            }
        }
        num = Double.parseDouble(display.getText());
 

    }
    
    private void addActionEventLister(JButton btn){
                btn.setFont(new Font("Tahoma", 1, 14)); 
                btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
    }

    private void btnActionPerformed(ActionEvent evt) {
        display.setText(display.getText() + evt.getActionCommand());
        numberToBeUsed(evt.getActionCommand());
    }
    
    private void numberToBeUsed(String x){
        number = number + x;
    }

    private void decimalPointBtnActionPerformed(ActionEvent evt) {
        if(!display.getText().contains(".")){
            display.setText(display.getText() + ".");
        }
        
    }

    private void backSpaceBtnActionPerformed(ActionEvent evt) {
        if(display.getText().length() > 0){
            StringBuffer back = new StringBuffer(display.getText());
            back.deleteCharAt(display.getText().length()-1);
            display.setText(back.toString());
        }
        
    }

    private void clearBtnActionPerformed(ActionEvent evt) {
        display.setText("");
    }

    private void addBtnActionPerformed(ActionEvent evt) {
        operationPreformed();
        action=0;
    }

    private void minusBtnActionPerformed(ActionEvent evt) {
        operationPreformed();
        action=1;
        
    }

    private void multiplicationBtnActionPerformed(ActionEvent evt) {
        operationPreformed();
        action=2;
    }

    private void divideBtnActionPerformed(ActionEvent evt) {
        operationPreformed();
        action=3;
    }
    
    private void operationPreformed(){
        try{
            num = Double.parseDouble(display.getText());
            display.setText("");
            number = "";
        } catch (NumberFormatException e){
            
        }
    }

    private void equalsBtnActionPerformed(ActionEvent evt) {
        calc();
    }

    
    public static void main(String args[]) {

        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException |IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(CalculatorGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorGUI().setVisible(true);
            }
        });
    }

    private JButton addBtn,backSpaceBtn,btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,clearBtn,decimalPointBtn,minusBtn,divideBtn,equalsBtn,multiplicationBtn;
    private JTextField display;
    
}
