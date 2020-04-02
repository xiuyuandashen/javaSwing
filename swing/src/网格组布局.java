import javax.swing.*;
import java.awt.*;

/**
 * 网格组布局管理器 GridBagLayout
 * 使用网格组布局管理器有4步：
 *  1：创建网格组布局管理器对象 GridBagLayout gridBagLayout = new GridBagLayout();
 *  2: 容器对象.setLayout(gridBagLayout); 设置容器对象的布局
 *  3: 组件约束 GridBagConstraints gridBagConstraints = new GridBagConstraints();
 *  4: 加入容器中 容器对象.add(组件对象,约束对象);
 * GridBagConstraints 常用的属性
 *  gridx,gridy 组件所在的位置 数值范围(0-n) 比如 (0,0)代表第一个单元格
 *  gridwidth,gridheight 组件占用的列数和行数
 *  anchor 组件所在的方位
 *      北 南 东 西 东北 西北 东南 西南
 *  fill 组件的填充方式
 *      1.GridBagConstraints.HORIZONTAL 水平填充
 *      2.GridBagConstraints.VERTICAL   垂直填充
 *      3.GridBagConstraints.BOTH       全部填充
 *  insets(是个对象)  组件与单元格边缘的最小距离(自定义方位)
 *      组件约束对象.insets=new Insets(上,左,下,右) 单位都是像素
 *  ipadx,ipady 组件的首先大小（组件初始的大小）
 *      值为正数是放大 负数是缩小 单位都是像素
 *  weightx,weighty 一个单元格的最大宽高
 *      如果窗体宽度足够 他就是显示为最大的宽高
 *      不够的话 就会调整宽高
 *
 */

public class 网格组布局 extends JFrame {
    public 网格组布局(){
        setBounds(100,100,700,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        final Container contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());//设置为网格组布局
        for(int i=0;i<10;i++){
            /** 创建组件约束 **/
            final GridBagConstraints gridBagConstraints = new GridBagConstraints();
            final GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
            /** 设置组件在容器中的位置 **/
            gridBagConstraints.gridx=i;
            gridBagConstraints.gridy=0;
            /** 将组件及组件约束加入容器中 **/
            contentPane.add(new JButton("按钮"+i),gridBagConstraints);
            gridBagConstraints2.gridx=0;
            gridBagConstraints2.gridy=i;
            contentPane.add(new JButton("按钮"+i),gridBagConstraints2);
        }
        GridBagConstraints g1=new GridBagConstraints();
        g1.gridx=2;g1.gridy=3;
        /** 组件占用的宽的格数 高的格数**/
        g1.gridwidth=3;g1.gridheight=2;
        g1.fill=GridBagConstraints.BOTH;/**设置填充方式为全部填充**/
        contentPane.add(new JButton("按钮"),g1);
        GridBagConstraints g2=new GridBagConstraints();
        JPanel p=new JPanel();/** 创建面板 **/
        g2.gridx=6;g2.gridy=2;
        g2.gridwidth=3;g2.gridheight=2;
        g2.fill=GridBagConstraints.BOTH;

        p.setBackground(Color.PINK);/** 面板底色 **/
        contentPane.add(p,g2);
        g2.fill=GridBagConstraints.CENTER;
        g2.anchor=GridBagConstraints.NORTH;/** 方位设置为北 **/
        contentPane.add(new JButton("按钮-方位"),g2);
        /** insets属性的用法 **/
        g2.gridx=6;g2.gridy=5;
        g2.gridwidth=3;g2.gridheight=2;
        g2.insets=new Insets(5,3,5,10);
        contentPane.add(new JButton("自定义方位"),g2);
        setVisible(true);

    }

    public static void main(String[] args) {
        new 网格组布局();
    }
}
