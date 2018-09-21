import javax.swing.*;
import java.awt.*;

public class ItemPanel extends JPanel {
    JTextField itemField, quantityField;
    JButton addButton;

    public ItemPanel()
    {
        this.itemField = new JTextField();
        this.quantityField = new JTextField();
        this.addButton = new JButton("Add Item");

        setLayout(new FlowLayout());

        add(new JLabel("Item Name:"));
        add(itemField);
        add(new JLabel("Quantity:"));
        add(quantityField);
        add(addButton);
    }
}
