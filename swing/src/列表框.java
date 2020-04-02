import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * 列表框 设置选择模式  setSelectionMode(ListSelectionModel.模式)
 * 选择模式有:
 *      1: ListSelectionModel.SINGLE_SELECTION  单选模式
 *      2: ListSelectionModel.SINGLE_INTERVAL_SELECTION 按住ctrl选择 只能连续选择相邻的元素
 *      3: ListSelectionModel.MULTIPLE_INTERVAL_SELECTION 按住ctrl 随便选择
 */
public class 列表框 extends JFrame {

    public 列表框(){
        setBounds(100,100,217,167);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        final Container contentPane = getContentPane();
        contentPane.setLayout(null);
        String items[]={"java","python","C++","C","C#","java","java","java","java","java"};
        /**第一种创建列表方式**/
//        final JList<String> jl = new JList<>(items);
//        jl.setBounds(10,10,100,100); /** 使用滚动面板就不需要设置大小 我们设置滚动面板的大小就好 **/
        /**第二种创建列表方式 使用数据模型添加列表元素**/
        final DefaultListModel<String> model = new DefaultListModel<>();/** 创建列表框的数据模型 **/
        /** 向数据模型添加数据**/
        for(String str:items){
            model.addElement(str);
        }
        JList<String> jl=new JList<>();/** 创建列表框 **/
        jl.setModel(model);/** 列表框载入数据模型 **/
        /**
         * 使用数据模型方式可以随时向列表框中添加数据
         */
        /**
         * 设置列表选择模式
         *  ListSelectionModel.SINGLE_SELECTION  单选模式
         *  ListSelectionModel.SINGLE_INTERVAL_SELECTION  只能连续选择相邻的元素 按住ctrl选择
         *  ListSelectionModel.MULTIPLE_INTERVAL_SELECTION 按住ctrl 随便选择
         */
        jl.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        /** 创建一个滚动面板 并将列表框放入 ，这样数据过多的话会有滚动条效果**/
        JScrollPane js=new JScrollPane(jl);
        js.setBounds(10,10,100,100);
        contentPane.add(js);
        final JButton btn = new JButton("确认");
        btn.setBounds(120,90,70,25);
        /** 添加事件监听打印选中列表框的结果 **/
        btn.addActionListener(e->{
            final List<String> valuesList = jl.getSelectedValuesList();/** 获取结果集 **/
            for(String tmp:valuesList){
                System.out.println(tmp);
            }
            System.out.println("-------END------");
        });
        contentPane.add(btn);
        setVisible(true);

    }

    public static void main(String[] args) {
        new 列表框();
    }
}
