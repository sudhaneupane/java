package view;

import javax.swing.*;
import java.awt.*;
import db.DbConnection;

public class Registration {

    public static void main(String[] args) {
        DbConnection.connectDB();
        MyFrame frame=new MyFrame();
    }
}

class MyFrame extends JFrame{

    JLabel label1,label2,label3,label4,label5;
    JPasswordField pass;
    JTextField tName,tNumber,tAddress;
    JRadioButton male,female;
    JComboBox day,month,year;
    JCheckBox terms;
    JButton submit;
    JLabel msg;

    MyFrame(){
        setTitle("Registration Form");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setLocationRelativeTo(null);
        Container c=getContentPane();
        c.setLayout(null);

        label1=new JLabel("username");
        label1.setBounds(20,50,100,20);
        c.add(label1);

        tName=new JTextField();
        tName.setBounds(130,50,150,20);
        c.add(tName);

        label2=new JLabel("Phone.no");
        label2.setBounds(20,100,100,20);
        c.add(label2);

        tNumber=new JTextField();
        tNumber.setBounds(130,100,150,20);
        c.add(tNumber);

        label3=new JLabel("Gender");
        label3.setBounds(20,150,100,20);
        c.add(label3);

        male=new JRadioButton("Male");
        female=new JRadioButton("Female");
        male.setSelected(true);

        female.setBounds(220,150,80,20);
        male.setBounds(130,150,80,20);

        c.add(male);
        c.add(female);

        ButtonGroup gen=new ButtonGroup();
        gen.add(male);
        gen.add(female);

        label5=new JLabel("D.O.B");
        label5.setBounds(20,200,150,20);
        c.add(label5);

        String days[]={"1","2"};
        String months[]={"Jan","Feb","Mar","Apr"};
        String years[]={"2018","2017","2016","2015"};

        day=new JComboBox(days);
        month=new JComboBox(months);
        year=new JComboBox(years);

        c.add(day);
        c.add(month);
        c.add(year);

        day.setBounds(130,200,50,20);
        month.setBounds(190,200,50,20);
        year.setBounds(250,200,60,20);

        label4=new JLabel("Password");
        label4.setBounds(20,250,150,20);
        c.add(label4);

        pass=new JPasswordField();
        pass.setBounds(130,250,150,20);
        c.add(pass);

//        ta1=new JTextArea();
//        ta1.setBounds(130,240,200,50);
//        c.add(ta1);

        terms=new JCheckBox("Please accept our Terms and Condition");
        terms.setBounds(50,320,250,20);
        c.add(terms);

        submit=new JButton("Submit");
        submit.setBounds(130,370,80,20);
        c.add(submit);

        msg=new JLabel();
        msg.setBounds(20,400,250,20);
        c.add(msg);

        setVisible(true);

    }
}