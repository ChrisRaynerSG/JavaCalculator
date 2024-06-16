import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.EventListener;

public class CalculatorWindow {

    //create the calculator window, set default close operation, size and layout for the window, and create all the components for the window

    public CalculatorWindow(){
        JFrame calculatorWindow = new JFrame("Calculator");
        JPanel topPanelForNumbers = new JPanel();
        calculatorWindow.setSize(300,500);
        calculatorWindow.setResizable(false);
        calculatorWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel middleNumberGridPanel = new JPanel();
        JPanel equalsButtonPanel = new JPanel();
        JTextArea fullCalculationOutput = new JTextArea();
        JTextArea numberOutput = new JTextArea();
        Font numberFont = new Font("Calibri", Font.BOLD, 30);
        Font fullCalculationFont = new Font("Calibri", Font.BOLD, 15);
        numberOutput.setFont(numberFont);
        fullCalculationOutput.setFont(fullCalculationFont);
        fullCalculationOutput.setForeground(Color.lightGray);
        numberOutput.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        fullCalculationOutput.setPreferredSize(new Dimension(280,20));
        numberOutput.setPreferredSize(new Dimension(280,40));
        GridLayout middleNumberGrid = new GridLayout(5,4);
        middleNumberGridPanel.setLayout(middleNumberGrid);

        //Create buttons to populate the calculator window

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
        JButton squareButton = new JButton("x²");
        JButton squareRootButton = new JButton("²√x");
        JButton backspaceButton = new JButton("⌫");

        // Stylise buttons

        ArrayList<Component> numberButtons = new ArrayList<Component>();
        numberButtons.add(zeroButton);
        numberButtons.add(oneButton);
        numberButtons.add(twoButton);
        numberButtons.add(threeButton);
        numberButtons.add(fourButton);
        numberButtons.add(fiveButton);
        numberButtons.add(sixButton);
        numberButtons.add(sevenButton);
        numberButtons.add(eightButton);
        numberButtons.add(nineButton);

        ArrayList<Component> functionButtons = new ArrayList<Component>();
        functionButtons.add(clearButton);
        functionButtons.add(decimalPointButton);
        functionButtons.add(plusButton);
        functionButtons.add(minusButton);
        functionButtons.add(multiplyButton);
        functionButtons.add(divideButton);
        functionButtons.add(backspaceButton);
        functionButtons.add(squareButton);
        functionButtons.add(squareRootButton);

        for(Component c: numberButtons){
            c.setBackground(Color.white);
        }

        for(Component c: functionButtons){
            c.setBackground(Color.LIGHT_GRAY);
        }
        equalsButton.setBackground(Color.orange);


        // make the equals button occupy the bottom space of the window

        equalsButton.setPreferredSize(new Dimension(300,40));

        //instantiate operations to be used by the calculator "+-/*="

        Operations operations = new Operations();

        //Action Listeners for calculator buttons

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberOutput.setText("");
                operations.setOperation("");
                fullCalculationOutput.setText("");
            }
        });
        zeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (numberOutput.getText().equals("0")||numberOutput.getText().equals(operations.calculatedNumbertoString)){
                    numberOutput.setText("0");
                }
                else {
                    numberOutput.append("0");
                    fullCalculationOutput.append("0");
                }
            }
        });
        oneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(numberOutput.getText().equals("0")||numberOutput.getText().equals(operations.calculatedNumbertoString)){
                    numberOutput.setText("1");
                    fullCalculationOutput.setText("1");
                }
                else {
                    numberOutput.append("1");
                    fullCalculationOutput.append("1");
                }
            }
        });

        twoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(numberOutput.getText().equals("0")||numberOutput.getText().equals(operations.calculatedNumbertoString)){
                    numberOutput.setText("2");
                    fullCalculationOutput.setText("2");
                }
                else {
                    numberOutput.append("2");
                    fullCalculationOutput.append("2");
                }
            }
        });

        threeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(numberOutput.getText().equals("0")||numberOutput.getText().equals(operations.calculatedNumbertoString)){
                    numberOutput.setText("3");
                    fullCalculationOutput.setText("3");
                }
                else {
                    numberOutput.append("3");
                    fullCalculationOutput.append("3");
                }
            }
        });

        fourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(numberOutput.getText().equals("0")||numberOutput.getText().equals(operations.calculatedNumbertoString)){
                    numberOutput.setText("4");
                    fullCalculationOutput.setText("4");
                }
                else {
                    numberOutput.append("4");
                    fullCalculationOutput.append("4");
                }
            }
        });

        fiveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(numberOutput.getText().equals("0")||numberOutput.getText().equals(operations.calculatedNumbertoString)){
                    numberOutput.setText("5");
                    fullCalculationOutput.setText("5");
                }
                else {
                    numberOutput.append("5");
                    fullCalculationOutput.append("5");
                }
            }
        });

        sixButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(numberOutput.getText().equals("0")||numberOutput.getText().equals(operations.calculatedNumbertoString)){
                    numberOutput.setText("6");
                    fullCalculationOutput.setText("6");
                }
                else {
                    numberOutput.append("6");
                    fullCalculationOutput.append("6");
                }
            }
        });

        sevenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(numberOutput.getText().equals("0")||numberOutput.getText().equals(operations.calculatedNumbertoString)){
                    numberOutput.setText("7");
                    fullCalculationOutput.setText("7");
                }
                else {
                    numberOutput.append("7");
                    fullCalculationOutput.append("7");
                }
            }
        });

        eightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(numberOutput.getText().equals("0")||numberOutput.getText().equals(operations.calculatedNumbertoString)){
                    numberOutput.setText("8");
                    fullCalculationOutput.setText("8");
                }
                else {
                    numberOutput.append("8");
                    fullCalculationOutput.append("8");
                }
            }
        });

        nineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(numberOutput.getText().equals("0")||numberOutput.getText().equals(operations.calculatedNumbertoString)){
                    numberOutput.setText("9");
                    fullCalculationOutput.setText("9");
                }
                else {
                    numberOutput.append("9");
                    fullCalculationOutput.append("9");
                }
            }
        });

        decimalPointButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(numberOutput.getText().isEmpty()||numberOutput.getText().equals(operations.calculatedNumbertoString)){
                    numberOutput.setText("0");

                }
                if(numberOutput.getText().contains(".")){

                }
                else {
                    numberOutput.append(".");
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
                    fullCalculationOutput.append("=");
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
                    fullCalculationOutput.append("+");
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
                    fullCalculationOutput.append("-");
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
                    fullCalculationOutput.append("x");
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
                    fullCalculationOutput.append("÷");
                }
            }
        });

        backspaceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(numberOutput.getText().isEmpty()){

                }
                else{
                    String removeLast = numberOutput.getText();
                    removeLast = removeLast.substring(0, removeLast.length()-1);
                    numberOutput.setText(removeLast);
                }
            }
        });

        squareButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

        // Number Output
        // ⌫ x² ²√x ÷
        // 7 8 9 x
        // 4 5 6 -
        // 1 2 3 +
        // C 0 . =

        //Add 4x4 grid buttons to grid layout
        middleNumberGridPanel.add(backspaceButton);
        middleNumberGridPanel.add(squareButton);
        middleNumberGridPanel.add(squareRootButton);
        middleNumberGridPanel.add (divideButton);
        middleNumberGridPanel.add(sevenButton);
        middleNumberGridPanel.add(eightButton);
        middleNumberGridPanel.add(nineButton);
        middleNumberGridPanel.add(multiplyButton);
        middleNumberGridPanel.add(fourButton);
        middleNumberGridPanel.add(fiveButton);
        middleNumberGridPanel.add(sixButton);
        middleNumberGridPanel.add(minusButton);
        middleNumberGridPanel.add(oneButton);
        middleNumberGridPanel.add(twoButton);
        middleNumberGridPanel.add(threeButton);
        middleNumberGridPanel.add(plusButton);
        middleNumberGridPanel.add(clearButton);
        middleNumberGridPanel.add(zeroButton);
        middleNumberGridPanel.add(decimalPointButton);
        middleNumberGridPanel.add(equalsButton);

        //create the layout of the window and set it to be visible

        JTable mainWindowContents = new JTable();


//        equalsButtonPanel.add(equalsButton);
        calculatorWindow.add(topPanelForNumbers, BorderLayout.NORTH);
        fullCalculationOutput.setBorder(null);
        numberOutput.setBorder(null);
//        topPanelForNumbers.add(fullCalculationOutput, BorderLayout.BEFORE_FIRST_LINE);
        topPanelForNumbers.add(numberOutput, BorderLayout.AFTER_LAST_LINE);
//        calculatorWindow.add(fullCalculationOutput,BorderLayout.NORTH);
//        calculatorWindow.add(numberOutput,BorderLayout.NORTH);
        calculatorWindow.add(middleNumberGridPanel, BorderLayout.CENTER);
//        calculatorWindow.add(equalsButton,BorderLayout.SOUTH);
        calculatorWindow.setVisible(true);
    }

}
