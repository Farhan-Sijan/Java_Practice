public class Method {

    static void foo(){
        System.out.println("Good morning bro ");
    }
    static void foo(int a ){
        System.out.println("Good morning "+a+" Bro! ");
    }

    public static void main(String[] args){

        foo();
        foo(300);

    }
}
