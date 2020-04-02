import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * 焦点监听器 FocusListener  组件.addFocusListener(FocusListener)
 * FocusListener 中有两个方法
 *  1:void focusGained(FocusEvent e) 组件获取焦点时调用的方法
 *  2:void focusLost(FocusEvent e) 组件失去焦点时调用的方法
 *  由于不是接口中不止一个方法 所以不能用lambda表达式
 */
public class 焦点监听器 extends JFrame {
    public 焦点监听器(){
        setBounds(100,100,500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        final Container contentPane = getContentPane();
        contentPane.setLayout(null);//绝对布局
        final JTextField jL1 = new JTextField();
        final JTextField jL2 = new JTextField();
        final JTextField jL3 = new JTextField();
        jL1.setBounds(20,20,100,30);
        jL2.setBounds(20,60,100,30);
        jL3.setBounds(20,100,100,30);
        final JLabel j1 = new JLabel("未获得焦点");
        final JLabel j2 = new JLabel("未获得焦点");
        final JLabel j3 = new JLabel("未获得焦点");
        j1.setBounds(140,20,100,30);
        j2.setBounds(140,60,100,30);
        j3.setBounds(140,100,100,30);
        contentPane.add(jL1);
        contentPane.add(jL2);
        contentPane.add(jL3);
//        contentPane.add(j1);
//        contentPane.add(j2);
//        contentPane.add(j3);
        /**
         * 添加焦点监听器 由于代码重复度很高 下面用自定义焦点监听类
        jL1.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                j1.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
                j1.setText("失去焦点");
                j1.setForeground(Color.pink);//修改字体颜色 前景色
            }
        });
        jL2.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                j2.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
                j2.setText("失去焦点");
                j2.setForeground(Color.pink);//修改字体颜色 前景色
            }
        });
        jL3.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                j3.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
                j3.setText("失去焦点");
                j3.setForeground(Color.pink);//修改字体颜色 前景色
            }
        });
**/
        /**调用自定义焦点监听类**/
        jL1.addFocusListener(new myFocusListener());
        jL2.addFocusListener(new myFocusListener());
        jL3.addFocusListener(new myFocusListener());
        setVisible(true);
    }
    class myFocusListener implements FocusListener{

        @Override
        public void focusGained(FocusEvent e) {
            final Object source = e.getSource();
            JTextField jt=(JTextField)source;
            jt.setBorder(BorderFactory.createLineBorder(Color.green));/**修改边框颜色**/
        }

        @Override
        public void focusLost(FocusEvent e) {
            final Object source = e.getSource();
            JTextField jt=(JTextField)source;
            jt.setBorder(BorderFactory.createLineBorder(Color.red));/**修改边框颜色**/
        }
    }
    public static void main(String[] args) {
        new 焦点监听器();
    }

}
