import javax.swing.*;
import java.awt.*;

/**
 * 网格布局管理器 GridLayout
 * 构造方法 1.new GridLayout(int 行,int 列)
 *         2.new GridLayout(int 行,int 列,int 水平间距,int 垂直间距)
 *
 *
 */
public class 网格布局 extends JFrame {
    public 网格布局(){
        setBounds(100,100,300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        final Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(4,5,5,5));
        /**
         * 组件如果比布局的数目多的话 网格布局会自动优化布局
         * 例如下面是21个按钮  可是布局只有 4X5
         * 他会自动优化为 4X6
         */
        for(int i=1;i<=21;i++){
            contentPane.add(new JButton("按钮"+i));
        }
        setVisible(true);
    }

    public static void main(String[] args) {
        new 网格布局();
    }
}
