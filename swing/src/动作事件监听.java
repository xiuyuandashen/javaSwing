import javax.swing.*;
import java.awt.*;

/**
 * 动作事件监听 ActionListener  组件.addActionListener(ActionListener)
 *  动作得实现 ActionListener接口中的方法 actionPerformed(ActionEvent e) 组件发生操作时调用的方法
 *  由于是接口 我们可以使用lambda表达式(java 8 新特性) e->{} 来实现 动作事件
 *  文本框中的动作监听是回车
 *  下拉列表被选择会触发动作监听
 *
 */
public class 动作事件监听 extends JFrame {
    public 动作事件监听(){
        setBounds(100,100,500,500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        final Container contentPane = getContentPane();
        final JTextField jTextField = new JTextField();
        jTextField.setColumns(30);
        jTextField.setFont(new Font("黑体",Font.BOLD,20));
        contentPane.add(jTextField);
        final JLabel jLabel = new JLabel();
        contentPane.add(jLabel);
        jTextField.addActionListener(e->{
            jLabel.setText("文本框触发回车动作监听");
            final Object source = e.getSource();/**获取监听对象**/
            JTextField jt=(JTextField)source;/** 强转为监听对象的类型**/
            System.out.println(jt.getText());
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new 动作事件监听();
    }

}
