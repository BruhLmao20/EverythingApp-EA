// package WORK_IN_PROGRESS.gui;

// import java.awt.*;
// import javax.swing.*; 

// public class GUI extends JFrame{
    
//     private JList leftlist; 
//     private JList rightlist; 
//     private JButton movebutton; 
    
//     private static String[] apps = {"\tFibonacci Program (1, 1, 2, 3, 5, 8, ect...)", "\tFactorial Program (n!)", "\tn -> 0 -> n (Stack Implementation) Program", "\tPalindrome Program (racecar)", };

//     public Gui(){
//         super("title"); 
//         setLayout(new FlowLayout()); 

//         leftlist = new JList(apps); 
//         leftlist.setVisibleRowCount(3); 
//         leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
//         add(new JScrollPane(leftlist)); 

//         movebutton = new JButton("Move -->"); 
//         movebutton.addActionListener(
//             new ActionListener(){
//                 public void actionPerfromed(ActionEvent event){
//                     rightlist.setListData(leftlist.getSelectedValues());
//                 }
//             }
//         );
//         add(movebutton); 

//     }
// }

// https://www.youtube.com/watch?v=9z_8yEv7nIc
//https://www.youtube.com/watch?v=68X8RUxeXeA