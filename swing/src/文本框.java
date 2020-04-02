import javax.swing.*;
import java.awt.*;

public class 文本框 extends JFrame {
    public 文本框(){
        setBounds(100,100,250,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        final Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        JTextField jt=new JTextField();/**创建文本框 **/
        jt.setColumns(20);/** 设置文本框长度 ,20个字符**/
        jt.setText("hello Java Swing");/** 设置文本内容 **/
        jt.setFont(new Font("黑体",Font.PLAIN,20));/**设置字体样式**/
        contentPane.add(jt);
        final JButton jButton = new JButton("确认");
        jButton.addActionListener(e->{
            System.out.println("文本框中的内容:"+jt.getText());
            jt.setText("");//每次打印 清空文本框内容
            /**但是每次执行完 文本框就失去了焦点 我们需要获取焦点(光标)**/
            jt.requestFocus(); /**获取焦点**/
        });
        contentPane.add(jButton);
        setVisible(true);
    }

    public static void main(String[] args) {
        new 文本框();
    }
}
