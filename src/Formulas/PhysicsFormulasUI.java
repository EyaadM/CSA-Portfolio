package Formulas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PhysicsFormulasUI {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JTextPane ViTextArea;
    private JLabel VfLabel;
    private JTextPane VfTextArea;
    private JLabel ViLabel;
    private JLabel TLabel;
    private JTextPane TTextArea;
    private JLabel ALabel;
    private JTextPane ATextArea;
    private JLabel XiLabel;
    private JTextPane XiTextArea;
    private JLabel XfLabel;
    private JTextPane XfTextArea;
    private JPanel mainPanel;
    private JLabel answerLabel;

    private double[] vals;

    private JTextPane[] textAreas;


    public PhysicsFormulasUI() {

        vals = new double[6];
        textAreas = new JTextPane[]{XiTextArea, XfTextArea, ViTextArea, VfTextArea, ATextArea, TTextArea};

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SetVals();
                PhysicsCalculation physicsCalculation = new PhysicsCalculation(vals);
                answerLabel.setText(Double.toString(physicsCalculation.Calculate(1)));
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SetVals();
                PhysicsCalculation physicsCalculation = new PhysicsCalculation(vals);
                answerLabel.setText(Double.toString(physicsCalculation.Calculate(2)));
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SetVals();
                PhysicsCalculation physicsCalculation = new PhysicsCalculation(vals);
                answerLabel.setText(Double.toString(physicsCalculation.Calculate(3)));
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SetVals();
                PhysicsCalculation physicsCalculation = new PhysicsCalculation(vals);
                answerLabel.setText(Double.toString(physicsCalculation.Calculate(4)));
            }
        });
    }

    public void SetVals() {
        for (int i = 0; i < textAreas.length; i++) {
            if (textAreas[i].getText().isBlank()) {
                textAreas[i].setText("0.0");
            }
            vals[i] = Double.parseDouble(textAreas[i].getText());
        }
    }

    public static void RunPhysicsFormulasUI() {
        JFrame frame = new JFrame("Physics Formulas");
        frame.setContentPane(new PhysicsFormulasUI().mainPanel);
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
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());
        button2 = new JButton();
        button2.setText("2");
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 4;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(button2, gbc);
        button1 = new JButton();
        button1.setText("1");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 4;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(button1, gbc);
        button4 = new JButton();
        button4.setText("4");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 4;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(button4, gbc);
        ViTextArea = new JTextPane();
        ViTextArea.setBackground(new Color(-9014670));
        ViTextArea.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.weightx = 0.5;
        gbc.fill = GridBagConstraints.BOTH;
        mainPanel.add(ViTextArea, gbc);
        VfTextArea = new JTextPane();
        VfTextArea.setBackground(new Color(-9014670));
        VfTextArea.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weightx = 0.5;
        gbc.fill = GridBagConstraints.BOTH;
        mainPanel.add(VfTextArea, gbc);
        TTextArea = new JTextPane();
        TTextArea.setBackground(new Color(-9014670));
        TTextArea.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.weightx = 0.5;
        gbc.fill = GridBagConstraints.BOTH;
        mainPanel.add(TTextArea, gbc);
        ATextArea = new JTextPane();
        ATextArea.setBackground(new Color(-9014670));
        ATextArea.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.weightx = 0.5;
        gbc.fill = GridBagConstraints.BOTH;
        mainPanel.add(ATextArea, gbc);
        VfLabel = new JLabel();
        VfLabel.setText("Vf");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 0.5;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(5, 5, 5, 5);
        mainPanel.add(VfLabel, gbc);
        ViLabel = new JLabel();
        ViLabel.setText("Vi");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 0.5;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(5, 5, 5, 5);
        mainPanel.add(ViLabel, gbc);
        TLabel = new JLabel();
        TLabel.setText("T");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.weightx = 0.5;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(5, 5, 5, 5);
        mainPanel.add(TLabel, gbc);
        ALabel = new JLabel();
        ALabel.setText("A");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.weightx = 0.5;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(5, 5, 5, 5);
        mainPanel.add(ALabel, gbc);
        button3 = new JButton();
        button3.setText("3");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 4;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(button3, gbc);
        XiTextArea = new JTextPane();
        XiTextArea.setBackground(new Color(-9014670));
        XiTextArea.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 0.5;
        gbc.fill = GridBagConstraints.BOTH;
        mainPanel.add(XiTextArea, gbc);
        XfTextArea = new JTextPane();
        XfTextArea.setBackground(new Color(-9014670));
        XfTextArea.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.weightx = 0.5;
        gbc.fill = GridBagConstraints.BOTH;
        mainPanel.add(XfTextArea, gbc);
        XiLabel = new JLabel();
        XiLabel.setText("Xi");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0.5;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(5, 5, 5, 5);
        mainPanel.add(XiLabel, gbc);
        XfLabel = new JLabel();
        XfLabel.setText("Xf");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.weightx = 0.5;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(5, 5, 5, 5);
        mainPanel.add(XfLabel, gbc);
        answerLabel = new JLabel();
        answerLabel.setText("Answer");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 4;
        gbc.weightx = 1.0;
        mainPanel.add(answerLabel, gbc);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return mainPanel;
    }

}
