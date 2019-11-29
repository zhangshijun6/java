public class MyCircularLinkedList {

    public Node header = null;// 头结点
    int size = 0;// 表示数组大小的指标

    class Node {
        Object o;// 结点中存放的数据（数据域）
        Node next;// 用来指向该结点的下一个结点（指针域）

        public Node() {}
        public Node(Object o) {
            this.o = o;
        }
    }

    private Node getNode(int index) {
        Node temp = header;
        int count = 0;
        while(count!=index){
            temp = temp.next;
            count++;
        }
        return temp;
    }

    /**
     * 增加操作：
     * 若size为0，则直接为header赋值new Node
     * 若size不为0，获取链表最后一个节点，将此节点的next赋值为new Node
     * size ++
     */
    public boolean add(Object o) {
        if (size == 0) {
            header = new Node(o);
            header.next = header;
        } else {
            Node temp = this.getNode(size -1);
            temp.next = new Node(o);
            temp.next.next = header;
        }
        size++;
        return true;
    }
    /**
     * 修改操作
     * 直接获取index处节点temp
     * 取temp的属性，直接赋值为新的
     * 设置第n个结点的值
     *
     */
    public boolean set(int index, Object o) {
        Node temp = getNode(index);
        temp.o = o;
        return true;
    }

    /**
     * 删除操作
     * 若index为0，直接将header赋值为header.next
     * 若index不为0，将index-1处节点的next赋值为index处节点的next
     */
    public boolean delete(int index){
        if(index%size == 0){
            header = header.next;
        }else{
            this.getNode(index-1).next = this.getNode(index).next;
        }
        size--;
        return true;
    }
    /**
     * 查询操作：
     * 实例化Node对象temp，并赋值为header，意为从头结点开始查起
     * 声明count计数器并从0开始，当count！=index，则temp = temp.next,一直查下去，计数器增1
     * 直到count = index停止查找，取temp.e的值并返回。
     *
     */
    public Object get(int index) {

        Node temp = header;
        int count = 0;
        while (count != index) {
            temp = temp.next;
            count++;
        }
        Object o = temp.o;
        return o;
    }
    public int size() {
        return this.size;
    }

    public void print(){
        System.out.print("[");
        for(int i =0;i<this.size();i++){
            System.out.print(this.get(i).toString() +" ");
        }
        System.out.print("]");
    }
}
