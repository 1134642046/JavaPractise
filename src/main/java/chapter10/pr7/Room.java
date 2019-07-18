package chapter10.pr7;

public class Room {
    private String s = "light";

    private void print(String ss){
        this.s = ss;
        System.out.println(this.s);
    }
    //获取内部类pricate属性
    public void getInner(){
        Inner i = this.new Inner();
        System.out.println(i.s);
    }

    class Inner{
        private String s = "Inner";

        public void update(){
            print("hello");
        }

    }

    public void createInner(){
        Inner inner = new Inner();
        inner.update();
        System.out.println("InnerCreate");
    }

    public static void main(String[] args) {
        Room room = new Room();
        room.createInner();
        room.getInner();
    }
}
