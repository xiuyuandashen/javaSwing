import javax.swing.*;
import java.awt.*;

public class JButtonTest extends JFrame {

    public JButtonTest(){
        setBounds(200,200,350,350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());/**设置流布局**/
        final Container contentPane = getContentPane();
        final JButton[] buttons = new JButton[6];
        for(int i=0;i<buttons.length;i++){
            buttons[i]=new JButton();
            contentPane.add(buttons[i]);
        }
        buttons[0].setText("不可用");
        buttons[0].setEnabled(false);/**设置组件不可用**/

        buttons[1].setText("有背景色");
        buttons[1].setBackground(Color.pink);/**背景色**/

        buttons[2].setText("无边框");
        buttons[2].setBorderPainted(false);/** 不显示边框**/

        buttons[3].setText("有边框");
        /**使用边框工厂设置线性边框**/
        buttons[3].setBorder(BorderFactory.createLineBorder(Color.pink));

        /**设置图片**/
//        Icon cion=new ImageIcon("src/1.jpeg");
//        buttons[4].setIcon(cion);

        buttons[5].setText("点击有事件");
        buttons[5].addActionListener(e->{
            /**弹出小对话框**/
            JOptionPane.showMessageDialog(JButtonTest.this,"点击按钮");
        });
        setVisible(true);

    }

    public static void main(String[] args) {
        new JButtonTest();
    }
}
