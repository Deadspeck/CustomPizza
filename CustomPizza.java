package custompizza;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class CustomPizza extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    // field, instance or class variables

    JPanel sizePanel = new JPanel();
    ButtonGroup sizeButtonGroup = new ButtonGroup();
    JRadioButton smallRadioButton = new JRadioButton();
    JRadioButton mediumRadioButton = new JRadioButton();
    JRadioButton largeRadioButton = new JRadioButton();

    JPanel crustPanel = new JPanel();
    ButtonGroup crustButtonGroup = new ButtonGroup();
    JRadioButton thinRadioButton = new JRadioButton();
    JRadioButton thickRadioButton = new JRadioButton();

    JPanel toppingsPanel = new JPanel();
    JCheckBox cheeseCheckBox = new JCheckBox();
    JCheckBox mushroomsCheckBox = new JCheckBox();
    JCheckBox olivesCheckBox = new JCheckBox();
    JCheckBox onionsCheckBox = new JCheckBox();
    JCheckBox peppersCheckBox = new JCheckBox();
    JCheckBox tomatoesCheckBox = new JCheckBox();

    ButtonGroup whereButtonGroup = new ButtonGroup();
    JRadioButton eatInRadioButton = new JRadioButton();
    JRadioButton takeOutRadioButton = new JRadioButton();

    JButton buildButton = new JButton();
    JButton exitButton = new JButton();

    // give these initial(default) values at the end of the constructor
    String pizzaSize;
    String pizzaCrust;
    String pizzaWhere;
    JCheckBox[] topping = new JCheckBox[6];


    // constructor

    public CustomPizza() {

        setTitle("Build your Custom Million Dollar Pizza Order!");
        setResizable(false);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                exitForm(e);
            }
        });

        getContentPane().setLayout(new GridBagLayout()); // use GBL JFrame
        GridBagConstraints gridConstraints;

        // size panel with components
        // use GBL for the panel
        sizePanel.setLayout(new GridBagLayout());
        sizePanel.setBorder(BorderFactory.createTitledBorder("Location"));

        smallRadioButton.setText("Front");

        sizeButtonGroup.add(smallRadioButton);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 0;
        gridConstraints.gridwidth = 2;
        gridConstraints.anchor = GridBagConstraints.WEST;
        sizePanel.add(smallRadioButton, gridConstraints);
        smallRadioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sizeRadioButtonActionPerformed(e);
            }
        });

        mediumRadioButton.setText("Body");
        mediumRadioButton.setSelected(true);
        sizeButtonGroup.add(mediumRadioButton);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 1;
        gridConstraints.anchor = GridBagConstraints.WEST;
        sizePanel.add(mediumRadioButton, gridConstraints);
        mediumRadioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sizeRadioButtonActionPerformed(e);
            }
        });

        largeRadioButton.setText("Rear          ");
        largeRadioButton.setSelected(true);
        sizeButtonGroup.add(largeRadioButton);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 2;
        gridConstraints.anchor = GridBagConstraints.WEST;
        sizePanel.add(largeRadioButton, gridConstraints);
        largeRadioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sizeRadioButtonActionPerformed(e);
            }
        });

        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 0;
        getContentPane().add(sizePanel, gridConstraints);
        // end of size panel and components

        ///////////////////////////////////////////////////////////////////

        crustPanel.setLayout(new GridBagLayout());
        crustPanel.setBorder(BorderFactory.createTitledBorder("Engine type"));

        thinRadioButton.setText("Thin Crust");
        thinRadioButton.setSelected(true);
        crustButtonGroup.add(thinRadioButton);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 0;
        gridConstraints.anchor = GridBagConstraints.WEST;
        crustPanel.add(thinRadioButton, gridConstraints);
        thinRadioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                crustRadioButtonActionPerformed(e);
            }
        });

        thickRadioButton.setText("Thick Crust");
        crustButtonGroup.add(thickRadioButton);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 1;
        gridConstraints.anchor = GridBagConstraints.WEST;
        crustPanel.add(thickRadioButton, gridConstraints);
        thickRadioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                crustRadioButtonActionPerformed(e);
            }
        });


        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 0;
        getContentPane().add(crustPanel, gridConstraints);

        /////////////////////////////////////////////////////////////////////////////////

        toppingsPanel.setLayout(new GridBagLayout());
        toppingsPanel.setBorder(BorderFactory.createTitledBorder("Toppings"));

        cheeseCheckBox.setText("Extra Cheese");
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 0;
        gridConstraints.anchor = GridBagConstraints.WEST;
        toppingsPanel.add(cheeseCheckBox, gridConstraints);

        mushroomsCheckBox.setText("Mushrooms");
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 1;
        gridConstraints.anchor = GridBagConstraints.WEST;
        toppingsPanel.add(mushroomsCheckBox, gridConstraints);

        olivesCheckBox.setText("Olives");
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 2;
        gridConstraints.anchor = GridBagConstraints.WEST;
        toppingsPanel.add(olivesCheckBox, gridConstraints);

        onionsCheckBox.setText("Onions");
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 0;
        gridConstraints.anchor = GridBagConstraints.WEST;
        toppingsPanel.add(onionsCheckBox, gridConstraints);

        peppersCheckBox.setText("Green Peppers");
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 1;
        gridConstraints.anchor = GridBagConstraints.WEST;
        toppingsPanel.add(peppersCheckBox, gridConstraints);

        tomatoesCheckBox.setText("Tomatoes");
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 2;
        gridConstraints.anchor = GridBagConstraints.WEST;
        toppingsPanel.add(tomatoesCheckBox, gridConstraints);


        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 2;
        gridConstraints.gridy = 0;
        gridConstraints.gridwidth = 2;
        getContentPane().add(toppingsPanel, gridConstraints);


        eatInRadioButton.setText("Eat In");
        eatInRadioButton.setSelected(true);
        whereButtonGroup.add(eatInRadioButton);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 1;
        gridConstraints.anchor = GridBagConstraints.WEST;
        getContentPane().add(eatInRadioButton, gridConstraints);
        eatInRadioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                whereRadioButtonActionPerformed(e);
            }
        });

        takeOutRadioButton.setText("Take Out");
        whereButtonGroup.add(takeOutRadioButton);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 2;
        gridConstraints.gridy = 1;
        gridConstraints.anchor = GridBagConstraints.WEST;
        getContentPane().add(takeOutRadioButton, gridConstraints);
        takeOutRadioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                whereRadioButtonActionPerformed(e);
            }
        });


        buildButton.setText("Build Pizza");
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 2;
        getContentPane().add(buildButton, gridConstraints);
        buildButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buildButtonActionPerformed(e);
            }
        });

        exitButton.setText("Exit");
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 2;
        gridConstraints.gridy = 2;
        getContentPane().add(exitButton, gridConstraints);
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exitButtonActionPerformed(e);
            }
        });


        getContentPane().setBackground(Color.YELLOW);
        //pack();
        setSize(700, 400);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((int) (0.5 * (screenSize.width - getWidth())),
                (int) (0.5 * (screenSize.height - getHeight())),
                getWidth(), getHeight());

        // Initialize parameters
        pizzaSize = smallRadioButton.getText(); // small is default
        pizzaCrust = thinRadioButton.getText(); // thin is default
        pizzaWhere = eatInRadioButton.getText(); // eat-in is default
        // Define an array of topping check boxes
        topping[0] = cheeseCheckBox;
        topping[1] = mushroomsCheckBox;
        topping[2] = olivesCheckBox;
        topping[3] = onionsCheckBox;
        topping[4] = peppersCheckBox;
        topping[5] = tomatoesCheckBox;


    } // end of constructor


    // methods

    private void exitButtonActionPerformed(ActionEvent e) {
        // "Are you sure?"
        // "Do you want to save your work?"
        // code for a graceful exit
        System.exit(0);
    }

    private void buildButtonActionPerformed(ActionEvent e) {

        String message; // local or method var, works only inside this method
        message = pizzaWhere + "\n";
        message += pizzaSize + " Pizza" + "\n";
        message += pizzaCrust + "\n";
        // Check each topping using the array we set up
        for (int i = 0; i < 6; i++) {
            if (topping[i].isSelected()) {
                message += topping[i].getText() + "\n";
            }
        }
        JOptionPane.showConfirmDialog(
                null,
                message,
                "Your Custom Pizza",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE
        );

    }

    private void whereRadioButtonActionPerformed(ActionEvent e) {
        pizzaWhere = e.getActionCommand();
        System.out.println("Eat-in / take-out: " + pizzaWhere);
    }

    private void crustRadioButtonActionPerformed(ActionEvent e) {
        pizzaCrust = e.getActionCommand();
        System.out.println("Crust: " + pizzaCrust);
    }

    private void sizeRadioButtonActionPerformed(ActionEvent e) {
        pizzaSize = e.getActionCommand();
        System.out.println("Size: " + pizzaSize);
    }


    private void exitForm(WindowEvent e) {
        // ask "are sure?"
        // ask "do you want to save this file?"
        System.exit(0); // normal exit, zero errors

    }

    public static void main(String[] args) {

        new CustomPizza().setVisible(true);

    }

} // end of class