import javax.swing.*;
import java.awt.*;

public class View
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        String[][] data = {  {"Item 1", "$10", "$8"},
                        {"Item 2", "$15", "$14"},
                        {"Item 3", "$19", "$15"} };

        String[] cols = {"Item Name", "Price", "Cost"};

        JTable table = new JTable(data, cols);
        JScrollPane spane = new JScrollPane(table);

        JTextField textField = new JTextField();

        frame.setSize(400, 600);

        frame.add(spane, BorderLayout.CENTER);
        frame.add(new ItemPanel(), BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}