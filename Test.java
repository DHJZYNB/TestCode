import javax.swing.*;
import java.awt.*;
import java.util.*;
class Test{
    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable(){
            public void run(){
                MyFrame frame = new MyFrame();
                frame.setVisible(true);
            }
        });
    }
}

class MyFrame extends JFrame{
    public MyFrame(){
        this.setSize(400,300);
        this.setTitle("Test for Java GUI!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}