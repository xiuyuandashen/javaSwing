import javax.swing.*;
import java.awt.*;

/**
 * 对布局设置null--->即绝对布局
 * 弊端：使用绝对布局的窗口 通常都是固定大小的，组件的位置和形状不会随着窗体的改变而发生改变
 */
public class 绝对布局 extends JFrame {
    public 绝对布局(){
        setBounds(100,100,200,150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        final Container contentPane = getContentPane();
        contentPane.setLayout(null);//设置布局为绝对布局
        JButton b1=new JButton("按钮1");
        b1.setBounds(10,30,80,30);//设置按钮在容器中的坐标和大小
        JButton b2=new JButton("按钮2");
        b2.setBounds(60,70,100,20);//设置按钮在容器中的坐标和大小
        contentPane.add(b1);
        contentPane.add(b2);
        setVisible(true);
    }

    public static void main(String[] args) {
        new 绝对布局();
    }

}
