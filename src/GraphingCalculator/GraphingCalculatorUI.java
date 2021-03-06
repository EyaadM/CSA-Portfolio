package GraphingCalculator;

import CalculatorUI.CalculatorUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphingCalculatorUI {
    private JTextField mTextField;
    private JLabel mLabel;
    private JLabel aLabel;
    private JTextField aTextField;
    private JLabel nLabel;
    private JLabel bLabel;
    private JTextField nTextField;
    private JTextField bTextField;
    private JButton graphButton;
    private JPanel panelMain;
    private JTextArea mTextArea;
    private JTextArea aTextArea;
    private JTextArea nTextArea;
    private JTextArea bTextArea;

    public static GraphingCalculator gc = new GraphingCalculator();

    public GraphingCalculatorUI() {
        graphButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double[] arr = {Double.parseDouble(mTextArea.getText()), Double.parseDouble(aTextArea.getText()), Double.parseDouble(nTextArea.getText()), Double.parseDouble(bTextArea.getText())};
                gc.m = arr[0];
                gc.a = arr[1];
                gc.n = arr[2];
                gc.b = arr[3];
                gc.RunGraphingCalculator();
            }
        });
    }

    public static void main(String[] args) {

    }

    public static void RunGraphingCalculatorUI() {
        JFrame frame = new JFrame("GraphingCalculatorUI");
        frame.setContentPane(new GraphingCalculatorUI().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panelMain = new JPanel();
        panelMain.setLayout(new GridBagLayout());
        mLabel = new JLabel();
        Font mLabelFont = this.$$$getFont$$$(null, -1, 16, mLabel.getFont());
        if (mLabelFont != null) mLabel.setFont(mLabelFont);
        mLabel.setHorizontalAlignment(11);
        mLabel.setText("m  ");
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 0.1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelMain.add(mLabel, gbc);
        aLabel = new JLabel();
        Font aLabelFont = this.$$$getFont$$$(null, -1, 16, aLabel.getFont());
        if (aLabelFont != null) aLabel.setFont(aLabelFont);
        aLabel.setHorizontalAlignment(11);
        aLabel.setText("a  ");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 0.1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelMain.add(aLabel, gbc);
        nLabel = new JLabel();
        Font nLabelFont = this.$$$getFont$$$(null, -1, 16, nLabel.getFont());
        if (nLabelFont != null) nLabel.setFont(nLabelFont);
        nLabel.setHorizontalAlignment(11);
        nLabel.setText("n  ");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weightx = 0.1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelMain.add(nLabel, gbc);
        bLabel = new JLabel();
        Font bLabelFont = this.$$$getFont$$$(null, -1, 16, bLabel.getFont());
        if (bLabelFont != null) bLabel.setFont(bLabelFont);
        bLabel.setHorizontalAlignment(11);
        bLabel.setText("b  ");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.weightx = 0.1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelMain.add(bLabel, gbc);
        final JLabel label1 = new JLabel();
        Font label1Font = this.$$$getFont$$$("Source Code Pro", Font.BOLD, 24, label1.getFont());
        if (label1Font != null) label1.setFont(label1Font);
        label1.setHorizontalAlignment(0);
        label1.setText("y=m((x+a)^n)+b");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.weightx = 0.1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelMain.add(label1, gbc);
        graphButton = new JButton();
        Font graphButtonFont = this.$$$getFont$$$(null, -1, 16, graphButton.getFont());
        if (graphButtonFont != null) graphButton.setFont(graphButtonFont);
        graphButton.setText("Graph!");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelMain.add(graphButton, gbc);
        mTextArea = new JTextArea();
        mTextArea.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weightx = 0.1;
        gbc.fill = GridBagConstraints.BOTH;
        panelMain.add(mTextArea, gbc);
        aTextArea = new JTextArea();
        aTextArea.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.weightx = 0.1;
        gbc.fill = GridBagConstraints.BOTH;
        panelMain.add(aTextArea, gbc);
        bTextArea = new JTextArea();
        bTextArea.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.weightx = 0.1;
        gbc.fill = GridBagConstraints.BOTH;
        panelMain.add(bTextArea, gbc);
        nTextArea = new JTextArea();
        nTextArea.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.weightx = 0.1;
        gbc.fill = GridBagConstraints.BOTH;
        panelMain.add(nTextArea, gbc);
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        return new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panelMain;
    }

}
