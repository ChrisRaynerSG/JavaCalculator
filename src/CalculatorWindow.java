import javax.swing.*;
import java.awt.*;

public class CalculatorWindow{
    CalculatorWindow(){
        JFrame calculatorWindow = new JFrame("Calculator");
        calculatorWindow.setSize(300,400);
        calculatorWindow.setResizable(false);
        calculatorWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel middleNumberGridPanel = new JPanel();
        JPanel equalsButtonPanel = new JPanel();
        JTextArea numberOutput = new JTextArea();
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





//        middleNumberGrid.addLayoutComponent("0",zeroButton);
//        middleNumberGrid.addLayoutComponent(".",decimalPointButton);
//        middleNumberGrid.addLayoutComponent("+",plusButton);
//        middleNumberGrid.addLayoutComponent("1",oneButton);
//        middleNumberGrid.addLayoutComponent("2",twoButton);
//        middleNumberGrid.addLayoutComponent("3",threeButton);
//        middleNumberGrid.addLayoutComponent("-",minusButton);
//        middleNumberGrid.addLayoutComponent("4",fourButton);
//        middleNumberGrid.addLayoutComponent("5",fiveButton);
//        middleNumberGrid.addLayoutComponent("6",sixButton);
//        middleNumberGrid.addLayoutComponent("x",multiplyButton);
//        middleNumberGrid.addLayoutComponent("7",sevenButton);
//        middleNumberGrid.addLayoutComponent("8",eightButton);
//        middleNumberGrid.addLayoutComponent("9",nineButton);
//        middleNumberGrid.addLayoutComponent("÷",divideButton);

        equalsButtonPanel.add(equalsButton);
        calculatorWindow.add(numberOutput, BorderLayout.NORTH);
        calculatorWindow.add(middleNumberGridPanel, BorderLayout.CENTER);
        calculatorWindow.add(equalsButton,BorderLayout.SOUTH);

        calculatorWindow.setVisible(true);

    }

}
