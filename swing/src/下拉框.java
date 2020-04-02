import javax.swing.*;
import java.awt.*;

public class 下拉框 extends JFrame {
    public 下拉框(){
        setBounds(100,100,190,120);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        final Container contentPane = getContentPane();
        contentPane.setLayout(null);/** 设置为绝对布局 **/
        /** 第一种创建下拉列表方式 **/
//        JComboBox<String> comboBox=new JComboBox<>();/** 创建下拉列表 **/
//        comboBox.addItem("Java");
//        comboBox.addItem("C++");
//        comboBox.addItem("python");
        /** 第二种创建下拉列表方式 **/
        String item[]={"java","C++","python"};
        JComboBox<String> comboBox=new JComboBox<>(item);
        /** 第三种创建下拉列表方式 **/
//        JComboBox<String> comboBox=new JComboBox<>();
//        /** 创建下拉列表模型**/
//        final ComboBoxModel comboBoxModel = new DefaultComboBoxModel<>(item);
//        comboBox.setModel(comboBoxModel);/** 向列表中添加数据模型 **/
        comboBox.setBounds(10,10,80,21);/**设置位置和大小**/
        contentPane.add(comboBox);
        comboBox.setEditable(true);/** 设置是否可以编辑 **/
        final JButton jButton = new JButton("打印");
        /** 添加事件监听 **/
        jButton.addActionListener(a->{
            System.out.println("选中的索引:"+comboBox.getSelectedIndex());
            System.out.println("选中的值："+comboBox.getSelectedItem());
        });
        jButton.setBounds(100,10,60,20);
        contentPane.add(jButton);
        setVisible(true);

    }

    public static void main(String[] args) {
        new 下拉框();

    }
}
