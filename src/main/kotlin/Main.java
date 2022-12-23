public class Main {
    public static void main(String[] args) {

//        Node node=new Node(-1);
//        node.add(1);
//        node.add(2);
//        node.add(3);
//        node.add(4);
//        node.add(5);
//        node.print();

        String s1="Tarun";
        String s2=new String("Tarun");
        System.out.println(s1==s2);
    }
//    static class Node{
//        Node head;
//        int val;
//        Node next;
//        Node(int val){
//            this.val=val;
//            this.next=null;
//        }
//
//        public void add(int val){
//            Node newNode=new Node(val);
//            if(head==null){
//                head=newNode;
//                return;
//            }
//            Node cur=head;
//            while (cur.next!=null){
//                cur=cur.next;
//            }
//            cur.next=newNode;
//        }
//        public void print(){
//            if(head==null) return;
//            Node cur=head;
//            while (cur!=null){
//                System.out.println(cur.val);
//                cur=cur.next;
//            }
//        }
//    }
}
