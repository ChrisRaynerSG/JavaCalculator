import javax.swing.*;
import java.awt.*;

public class CalculatorWindow{
    CalculatorWindow(){
        JFrame calculatorWindow = new JFrame();
        calculatorWindow.setSize(300,400);
        calculatorWindow.setResizable(false);

        calculatorWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();

        JPanel buttonGrid = new JPanel(new GridBagLayout());


        JButton zeroButton = new JButton("0");
        JButton decimalPoint = new JButton(".");
        JButton equalsButton = new JButton("=");
        JButton oneButton = new JButton("1");
        JButton twoButton = new JButton("2");
        JButton threeButton = new JButton("3");
        JButton plusButton = new JButton("+");
        JButton fourButton = new JButton("4");
        JButton fiveButton = new JButton("5");
        JButton sixButton = new JButton("6");
        JButton minusButton = new JButton("-");
        JButton sevenButton = new JButton("7");
        JButton eightButton = new JButton("8");
        JButton nineButton = new JButton("9");
        JButton multiplyButton = new JButton("x");


        buttonGrid.add(zeroButton);
        buttonGrid.add(oneButton);
        buttonGrid.add(twoButton);
        buttonGrid.add(threeButton);
        buttonGrid.add(fourButton);
        buttonGrid.add(fiveButton);
        buttonGrid.add(sixButton);
        buttonGrid.add(sevenButton);
        buttonGrid.add(eightButton);
        buttonGrid.add(nineButton);

        mainPanel.add(buttonGrid);
        calculatorWindow.add(mainPanel);
        calculatorWindow.setVisible(true);










    }

}
