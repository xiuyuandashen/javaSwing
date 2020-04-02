import javax.swing.*;
import java.awt.*;

/**
 * 边界布局是窗体容器的默认布局  BorderLayout
 * 将容器划分为 5个区
 * ---- 北 -----
 *|西  中间  东 |
 * ---- 南 -----
 * 注意：1.添加组件时，需要指定区域，否在默认添加到 中间 区
 *      2.同一区域的组件会互相覆盖
 *
 */

public class 边界布局 extends JFrame {
    public 边界布局(){
        setBounds(100,100,350,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        final Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());//设置为边界布局
        JButton b1=new JButton("中");
        JButton b2=new JButton("东");
        JButton b3=new JButton("西");
        JButton b4=new JButton("南");
        JButton b5=new JButton("北");
        /**
         * 添加组件 并且指定区域
         */
        contentPane.add(b1,BorderLayout.CENTER);
        contentPane.add(b2,BorderLayout.EAST);
        contentPane.add(b3,BorderLayout.WEST);
        contentPane.add(b4,BorderLayout.SOUTH);
        contentPane.add(b5,BorderLayout.NORTH);
        /**同一区域的组件会互相覆盖**/
        contentPane.add(new JButton("覆盖中间的组件"),BorderLayout.CENTER);
        setVisible(true);

    }

    public static void main(String[] args) {
        new 边界布局();
    }
}
