import javax.swing.*;
import java.awt.*;

/**
 * 流布局  FlowLayout 相当于html中的浮动
 * FlowLayout 构造方法
 * 1.new FlowLayout()
 * 2.new FlowLayout(FlowLayout.属性) 可以这是布局方式 比如 new FlowLayout(FlowLayout.LEFT) 就是左对齐
 * 2.new FlowLayout(FlowLayout.属性,水平间距,垂直间距)
 */

public class 流布局 extends JFrame {
    public 流布局(){
        setBounds(100,100,300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        final Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));//给窗体容器设置流布局
        for(int i=1;i<=10;i++){
            contentPane.add(new JButton("按钮"+i));

        }

        setVisible(true);
    }

    public static void main(String[] args) {
        new 流布局();
    }

}
