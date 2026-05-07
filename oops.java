
public class oops {
    public static void main(String[]args){
        Animal a = new cat();
        a.bark();
    }
}
 class Animal{
    void bark(){
        System.out.println("animal sounds");
    }
}
class cat extends Animal{
    void sound(){
        bark();
    }
}