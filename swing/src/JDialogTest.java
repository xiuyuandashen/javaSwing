import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 对话框窗体
 */
public class JDialogTest extends JDialog {
    public JDialogTest(JFrame frame){
        /**
         * 第一个参数：父窗体对象
         * 第二个参数：对话框标题
         * 第三个参数：是否阻塞父窗体
         */
        super(frame,"对话框标题",true);//如果要阻塞父窗体的话 加入这个父类构造方法


        final Container contentPane = getContentPane();//获取窗体容器
        contentPane.add(new JLabel("这是一个对话框"));//设置一个标签
//        setVisible(true);//设置窗体可见 把这个放在父窗体动作监听里显示
        setBounds(100,100,100,100);//设置窗体坐标和大小


    }

    public static void main(String[] args) {
        final JFrame frame = new JFrame("父窗体");
        frame.setBounds(50,50,300,300);
        final Container contentPane = frame.getContentPane();//获取窗体容器
        JButton btn=new JButton("弹出对话框");
        contentPane.setLayout(new FlowLayout());//设置布局，使用流布局
        contentPane.add(btn);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);//设置关闭规则
//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                new JDialogTest();
//            }
//        });//添加动作监听
        /**
         * 这种lambda方式比上面那种简洁
         */
        btn.addActionListener(e -> {
            final JDialogTest jDialogTest = new JDialogTest(frame);
            jDialogTest.setVisible(true);

        });//添加动作监听
    }

}
