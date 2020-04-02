import javax.swing.*;
import java.awt.*;

/**
 * 可以让这个类继承JFrame 这样在构造方法中设置窗体
 */
public class JFrameTest {
    public static void main(String[] args) {
        final JFrame frame = new JFrame("窗体标题");
        frame.setVisible(true);//显示窗口
        /**
         * 窗口关闭规则         setDefaultCloseOperation(JFrame属性)
         * JFrame.EXIT_ON_CLOSE :隐藏窗体，并停止程序
         * JFrame.DO_NOTHING_ON_CLOSE : 无任何操作
         * JFrame.HIDE_ON_CLOSE :隐藏窗体，但不停止程序
         * JFrame.DISPOSE_ON_CLOSE :释放出题资源
         */
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(500,500);//设置窗体的大小 单位是像素
//        frame.setLocation(600,350);//设置窗体出现的坐标 单位是像素
        frame.setBounds(600,350,500,500);//设置窗体的坐标和大小
        final Container contentPane = frame.getContentPane();//获取窗体容器
        contentPane.setBackground(Color.pink);//设置窗体容器的背景颜色
        final JLabel jLabel = new JLabel("这是一个窗体");//创建一个标签
        contentPane.add(jLabel);//把这个标签添加到窗体容器中
//        contentPane.remove(jLabel);//删除组件
        contentPane.validate();//验证容器中的组件  相当于刷新
//        frame.setContentPane(contentPane);//程序载入容器 一般用上面那个刷新就行了
        frame.setResizable(false);//设置窗体是否可以改变大小
        System.out.println("获取窗体的坐标 x="+frame.getX()+" y="+frame.getY());
    }
}
