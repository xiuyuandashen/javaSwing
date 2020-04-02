import javax.swing.*;
import java.awt.*;

public class 密码框 extends JFrame {
    public 密码框(){
        setBounds(100,100,300,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        final Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        /** 创建密码框 **/
        JPasswordField jp=new JPasswordField(20);

        jp.setFont(new Font("Arial",Font.BOLD,18));
        jp.setEchoChar('#');/**设置回显字符**/
        /** 添加动作监听 回车 后台获取输入的密码内容**/
        jp.addActionListener(e->{
            final char[] password = jp.getPassword();
            final String s = new String(password);
            System.out.println(s);
        });
        contentPane.add(jp);
        setVisible(true);
    }

    public static void main(String[] args) {
        new 密码框();
    }

}
