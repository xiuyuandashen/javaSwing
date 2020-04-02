import javax.swing.*;
import java.awt.*;

public class ImgTest extends JFrame {
    public ImgTest(){
        setBounds(100,100,500,350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        final Container contentPane = getContentPane();
        final JLabel jLabel = new JLabel();
        Icon icon=new ImageIcon("src/1.jpeg");//获取相应路径下的图片
        jLabel.setIcon(icon);//添加图片
        /**
         * 即使改变标签大小 也无法改变图片大小
         */
        jLabel.setSize(20,20);
        contentPane.add(jLabel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ImgTest();
    }
}
