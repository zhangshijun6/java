public class MyCircularLinkedListTest {
    public static void main(String[] args) {
        MyCircularLinkedList myCircularLinkedList = new MyCircularLinkedList();

        //增加测试,添加三个整数元素
        myCircularLinkedList.add(new Integer(1));
        myCircularLinkedList.add(new Integer(2));
        myCircularLinkedList.add(new Integer(3));
        System.out.println(" 增加测试：");
        myCircularLinkedList.print();

        //删除测试，删除第三个位置的元素
        myCircularLinkedList.delete(3);
        System.out.println("删除测试：");
        myCircularLinkedList.print();

        //修改测试，将第二个位置的元素改为整数5
        myCircularLinkedList.set(1,new Integer(5));
        System.out.println("修改测试：");
        myCircularLinkedList.print();

        //查询测试，取第一个位置的元素
        System.out.println("查询测试：");
        System.out.println(myCircularLinkedList.get(0).toString());

    }
}