public class Program {

    public static void main(String[] args) {
        LinkeList list = new LinkeList();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(20);

        list.append(list.getNodeAt(1), 30);
        list.delete(list.getNodeAt(4));

        list.print();
    }
}
