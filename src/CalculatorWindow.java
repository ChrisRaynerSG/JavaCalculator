import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class CalculatorWindow {
    public CalculatorWindow(){
        JFrame calculatorWindow = new JFrame("Calculator");
        calculatorWindow.setSize(300,400);
        calculatorWindow.setResizable(false);
        calculatorWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel middleNumberGridPanel = new JPanel();
        JPanel equalsButtonPanel = new JPanel();
        JTextArea numberOutput = new JTextArea();
        Font numberFont = new Font("Calibri", Font.BOLD, 24);
        numberOutput.setFont(numberFont);
        numberOutput.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        numberOutput.setPreferredSize(new Dimension(300,60));
        GridLayout middleNumberGrid = new GridLayout(4,4);
        middleNumberGridPanel.setLayout(middleNumberGrid);

        JButton zeroButton = new JButton("0");
        JButton oneButton = new JButton("1");
        JButton twoButton = new JButton("2");
        JButton threeButton = new JButton("3");
        JButton fourButton = new JButton("4");
        JButton fiveButton = new JButton("5");
        JButton sixButton = new JButton("6");
        JButton sevenButton = new JButton("7");
        JButton eightButton = new JButton("8");
        JButton nineButton = new JButton("9");
        JButton decimalPointButton = new JButton(".");
        JButton equalsButton = new JButton("=");
        JButton plusButton = new JButton("+");
        JButton minusButton = new JButton("-");
        JButton multiplyButton = new JButton("x");
        JButton divideButton = new JButton("÷");
        JButton clearButton = new JButton("C");

        equalsButton.setPreferredSize(new Dimension(300,40));

        Operations operations = new Operations();

        //Action Listeners for calculator buttons

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clear");
                numberOutput.setText("");
                operations.setOperation("");
            }
        });
        zeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("0");
                if (numberOutput.getText().equals("0")||numberOutput.getText().equals(operations.calculatedNumbertoString)){
                    numberOutput.setText("0");
                }
                else {
                    numberOutput.append("0");
                }
            }
        });
        oneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("1");
                if(numberOutput.getText().equals("0")||numberOutput.getText().equals(operations.calculatedNumbertoString)){
                    numberOutput.setText("1");
                }
                else {
                    numberOutput.append("1");
                }
            }
        });

        twoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(numberOutput.getText().equals("0")||numberOutput.getText().equals(operations.calculatedNumbertoString)){
                    numberOutput.setText("2");
                }
                else {
                    numberOutput.append("2");
                }
            }
        });

        threeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(numberOutput.getText().equals("0")||numberOutput.getText().equals(operations.calculatedNumbertoString)){
                    numberOutput.setText("3");
                }
                else {
                    numberOutput.append("3");
                }
            }
        });

        fourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(numberOutput.getText().equals("0")||numberOutput.getText().equals(operations.calculatedNumbertoString)){
                    numberOutput.setText("4");
                }
                else {
                    numberOutput.append("4");
                }
            }
        });

        fiveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(numberOutput.getText().equals("0")||numberOutput.getText().equals(operations.calculatedNumbertoString)){
                    numberOutput.setText("5");
                }
                else {
                    numberOutput.append("5");
                }
            }
        });

        sixButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(numberOutput.getText().equals("0")||numberOutput.getText().equals(operations.calculatedNumbertoString)){
                    numberOutput.setText("6");
                }
                else {
                    numberOutput.append("6");
                }
            }
        });

        sevenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(numberOutput.getText().equals("0")||numberOutput.getText().equals(operations.calculatedNumbertoString)){
                    numberOutput.setText("7");
                }
                else {
                    numberOutput.append("7");
                }
            }
        });

        eightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(numberOutput.getText().equals("0")||numberOutput.getText().equals(operations.calculatedNumbertoString)){
                    numberOutput.setText("8");
                }
                else {
                    numberOutput.append("8");
                }
            }
        });

        nineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(numberOutput.getText().equals("0")||numberOutput.getText().equals(operations.calculatedNumbertoString)){
                    numberOutput.setText("9");
                }
                else {
                    numberOutput.append("9");
                }
            }
        });

        equalsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(operations.operation.isEmpty()){

                }
                else {
                    String number2 = numberOutput.getText();
                    numberOutput.setText("");
                    numberOutput.setText(operations.equals(number2));
                }
            }
        });

        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(numberOutput.getText().equals("")){

                }
                else {
                    operations.add(numberOutput.getText());
                    numberOutput.setText("");
                }
            }
        });

        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(numberOutput.getText().equals("")){

                }
                else {
                    operations.subtract(numberOutput.getText());
                    numberOutput.setText("");
                }
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(numberOutput.getText().equals("")){

                }
                else {
                    operations.multiply(numberOutput.getText());
                    numberOutput.setText("");
                }
            }
        });

        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(numberOutput.getText().equals("")){

                }
                else {
                    operations.divide(numberOutput.getText());
                    numberOutput.setText("");
                }
            }
        });

        // Number Output
        // 7 8 9 ÷
        // 4 5 6 x
        // 1 2 3 -
        // C 0 . +
        // =

        //Add 4x4 grid buttons to grid layout

        middleNumberGridPanel.add(sevenButton);
        middleNumberGridPanel.add(eightButton);
        middleNumberGridPanel.add(nineButton);
        middleNumberGridPanel.add(divideButton);
        middleNumberGridPanel.add(fourButton);
        middleNumberGridPanel.add(fiveButton);
        middleNumberGridPanel.add(sixButton);
        middleNumberGridPanel.add(multiplyButton);
        middleNumberGridPanel.add(oneButton);
        middleNumberGridPanel.add(twoButton);
        middleNumberGridPanel.add(threeButton);
        middleNumberGridPanel.add(minusButton);
        middleNumberGridPanel.add(clearButton);
        middleNumberGridPanel.add(zeroButton);
        middleNumberGridPanel.add(decimalPointButton);
        middleNumberGridPanel.add(plusButton);

        //create the layout of the window and set it to be visible

        equalsButtonPanel.add(equalsButton);
        calculatorWindow.add(numberOutput, BorderLayout.NORTH);
        calculatorWindow.add(middleNumberGridPanel, BorderLayout.CENTER);
        calculatorWindow.add(equalsButton,BorderLayout.SOUTH);
        calculatorWindow.setVisible(true);
    }
}
