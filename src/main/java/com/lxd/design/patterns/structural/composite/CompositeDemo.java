package com.lxd.design.patterns.structural.composite;

/**
 * 组合模式
 * 说的是对象包含对象的问题，通过组合的方式（在对象内部引用对象）来进行布局，这种组合是区别于继承的，
 * 而另一层含义是指树形结构子节点的抽象（将叶子节点与数枝节点抽象为子节点），区别于普通的分别定义叶子节点与数枝节点的方式。
 * @author lixiaodong
 * @version V1.0.0
 * @date 2019-01-10
 */
public class CompositeDemo {
    public static void main(String[] args) {
        Employee CEO = new Employee("John","CEO", 30000);

        Employee headMarketing = new Employee("Michel","Head Marketing", 20000);
        Employee clerk1 = new Employee("Laura","Marketing", 10000);
        Employee clerk2 = new Employee("Bob","Marketing", 10000);
        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        Employee headSales = new Employee("Robert","Head Sales", 20000);
        Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob","Sales", 10000);
        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        CEO.add(headSales);
        CEO.add(headMarketing);

        //打印该组织的所有员工
        System.out.println(CEO);
        for (Employee headEmployee : CEO.getSubItems()) {
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getSubItems()) {
                System.out.println(employee);
            }
        }
    }
}
