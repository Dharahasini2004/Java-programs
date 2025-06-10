class animal{
    void eat(){
        System.out.println("Animal is eating ");
    }
}
//child-1
class dog extends animal{
    void bark(){
        System.out.println("Dog is barking");
    }
}
//child-2
class cat extends animal{
    void meow(){
        System.out.println("Cat is meowing");
    }
}
public class heir{
public static void main(String args[]){
    dog d=new dog();
    d.eat();
    d.bark();
    cat c=new cat();
    c.eat();
    c.meow();
}
}