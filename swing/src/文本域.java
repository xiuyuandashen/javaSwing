import javax.swing.*;
import java.awt.*;

public class 文本域 extends JFrame {
        public 文本域(){
            setBounds(100,100,400,400);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            final Container contentPane = getContentPane();
            contentPane.setLayout(new FlowLayout());
            JTextArea area=new JTextArea("这是一个文本域");
//            area.setText("这是一个文本域"); /**设置文本内容**/
            area.setRows(5);/**设定行**/
            area.setColumns(20);/** 设定列**/
            area.insert("内容",2);/**在第二个字符后面插入内容**/
            area.append("添加内容");/**在末尾添加内容**/
            area.setBackground(Color.PINK);
            area.setFont(new Font("楷体",Font.BOLD,20));
            /** 为防止文本域中内容过多无法显示 我们使用滚动面板 **/
            JScrollPane js=new JScrollPane(area);/**向滚动面板中添加**/
            contentPane.add(js);/** 向窗体容器中添加滚动面板 **/
            setVisible(true);
        }

    public static void main(String[] args) {
        new 文本域();
    }

}
