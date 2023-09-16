import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student_information {
    private JTextField TxtOfNameOfStudent;
    private JTextField TxtOfMarks1;
    private JTextField TxtOfMarks2;
    private JTextField TxtOfMarks3;
    private JTextField TxtOfMarks4;
    private JTextField TxtOfMarks5;
    private JTextField TxtOfMarks6;
    private JTextField TxtOfMarks7;
    private JTextField TxtOfTotal;
    private JTextField TxtOfAverage;
    private JTextField TxtOfGrade;
    private JButton calculateButton;
    private JPanel Main;
    private JButton clearButton;
    private JButton exitButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student_information");
        frame.setContentPane(new Student_information().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Student_information() {
    calculateButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int m1,m2,m3,m4,m5,m6,m7,total;
            double avg;
            m1 = Integer.parseInt(TxtOfMarks1.getText());
            m2 = Integer.parseInt(TxtOfMarks2.getText());
            m3 = Integer.parseInt(TxtOfMarks3.getText());
            m4 = Integer.parseInt(TxtOfMarks4.getText());
            m5 = Integer.parseInt(TxtOfMarks5.getText());
            m6 = Integer.parseInt(TxtOfMarks6.getText());
            m7 = Integer.parseInt(TxtOfMarks7.getText());
            total = m1+m2+m3+m4+m5+m6+m7;
            avg = (total / 7);
            TxtOfTotal.setText(String.valueOf(total));
            TxtOfAverage.setText(String.valueOf(avg));
            if (avg>50)
            {
                TxtOfGrade.setText("Pass");
            }
            else
            {
                TxtOfGrade.setText("Fail");
            }
        }
    });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TxtOfNameOfStudent.setText("");
                TxtOfMarks1.setText("");
                TxtOfMarks2.setText("");
                TxtOfMarks3.setText("");
                TxtOfMarks4.setText("");
                TxtOfMarks5.setText("");
                TxtOfMarks6.setText("");
                TxtOfMarks7.setText("");
                TxtOfTotal.setText("");
                TxtOfAverage.setText("");
                TxtOfGrade.setText("");
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
