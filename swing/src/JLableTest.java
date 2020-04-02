import javax.swing.*;
import java.awt.*;

/**
 * 标签
 */
public class JLableTest extends JFrame {
    public JLableTest(){
        setBounds(100,100,100,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        final Container contentPane = getContentPane();
        setVisible(true);
        final JLabel jLabel = new JLabel("这是一个标签");
        jLabel.setText("更改标签内容");
        System.out.println("获取标签内容= "+jLabel.getText());
        jLabel.setFont(new Font("楷体",Font.BOLD,15));//更改标签的字体
        jLabel.setForeground(Color.pink);//就是更改前景色 就是更改标签字体颜色
        contentPane.add(jLabel);
    }

    public static void main(String[] args) {
        new JLableTest();
    }
}
