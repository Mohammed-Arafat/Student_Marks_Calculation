import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

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
    private JTextArea result_summary;

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
            String sc;
            if (avg>50)
            {
                TxtOfGrade.setText("Pass");
                sc = "\n\n\n\tCongratulations!!!\n\tYou are passed!!!!\n";
            }
            else
            {
                TxtOfGrade.setText("Fail");
                sc = "\n\n\n\tSorry...\n\tYou are failed....\n";
            }
            String sm = TxtOfNameOfStudent.getText(),s1 = TxtOfMarks1.getText(),s2 = TxtOfMarks2.getText(),s3 =
                    TxtOfMarks3.getText(),s4 = TxtOfMarks4.getText(),s5 = TxtOfMarks5.getText(),s6 =
                    TxtOfMarks6.getText(),s7 = TxtOfMarks7.getText();
            result_summary.setText("\n\n\tName:- "+sm+"\n\n"+"\tMarks 1:- "+s1+"\n\n"+"\tMarks 2:- "+s2+"\n\n"+
                    "\tMarks 3:- "+s3+"\n\n"+
                    "\tMarks 4:- "+s4+"\n\n"+"\tMarks 5:- "+s5+"\n\n"+"\tMarks 6:- "+s6+"\n\n"+
                    "\tMarks 7:- "+s7+"\n\n"+sc);
            /*
            result_summary.setText("Marks 1:- "+s1+"\n");
            result_summary.setText("Marks 2:- "+s2+"\n");
            result_summary.setText("Marks 3:- "+s3+"\n");
            result_summary.setText("Marks 4:- "+s4+"\n");
            result_summary.setText("Marks 5:- "+s5+"\n");
            result_summary.setText("Marks 6:- "+s6+"\n");
            result_summary.setText("Marks 7:- "+s7+"\n");

            if (avg>50)
            {
                result_summary.setText("\nCongratulations!!!\nYou are passed!!!!\n");
            }
            else
            {
                result_summary.setText("\nSorry...\nYou are failed....\n");
            }*/
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
                result_summary.setText("");
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
