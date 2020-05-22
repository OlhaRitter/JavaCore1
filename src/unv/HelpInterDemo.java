package unv;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class HelpInterDemo {
    public static void main(String[] args) {
        HelpInter help = new HelpInter();
        JFrame frame = new JFrame();
        frame.setBounds(600,200,700,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());
        JLabel label2 = new JLabel("   Получи результат работы       ");
        JCheckBox checkBox = new JCheckBox();
        JButton button = new JButton("Дни недели");
        String el[] = {"Жми на 1","Жми на 2","Жми на 3","Жми на 4","Жми на 5","Жми на 6"};
        TextField textField = new TextField();
        textField.setColumns(15);



       JList<String> list = new JList<String>(el);
        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent listSelectionEvent) {
                System.out.println(list.getSelectedValue());
                switch (list.getSelectedValue()){
                    case "Жми на 1":{
                        label2.setText(help.get_day1());
                        frame.validate();
                        break;
                    }
                    case "Жми на 2":{
                        label2.setText(help.get_day2());
                        frame.validate();
                        break;
                    }
                    case "Жми на 3":{
                        label2.setText(help.get_day3());
                        frame.validate();
                        break;
                    }
                    case "Жми на 4":{
                        label2.setText(help.get_day4());
                        frame.validate();
                        break;
                    }
                    case "Жми на 5":{
                        label2.setText(help.get_day5());
                        frame.validate();
                        break;
                    }
                    case "Жми на 6":{
                        label2.setText(help.get_day6());
                        frame.validate();
                        break;
                    }
                }
            }
        });
        checkBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(checkBox.isSelected() == true){
                    System.out.println("checkBox сработало");
                }else{
                    System.out.println("checkBox не сработал");
                }
            }
        });
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("При работе:...");
            }
        });
        frame.add(textField,"East");
        frame.add(checkBox,"South");
        frame.add(button,"North");
        frame.add(label2, "Center");
        frame.add(list, "West");
    }}
