package chapter10.pr21;

interface Car {
    public void what();

    class who{
        static void show(Car c){
            c.what();
        }
    }
}

class bus implements Car{

    public  void what() {
        System.out.println("i am bus.");
    }

    public static void main(String[] args) {
        bus b = new bus();
        Car.who.show(b);
    }
}
