class Animal{    // == parent_class, INDICATING ANIMALS SOUNDS==
    public void animals(){
        System.out.println("Animals makes sound");
    }
}
// 'extends'--> KEYWORD IS USED TO INHERIT PROPERTIES AND BEHAVIORS OF THE parent_class
class Dog extends Animal{ // THIS DOG CLASS(sub_class / child_class) IS DERIVED(extends) FROM ANIMAL(parent_class) 
    void dog(){
        System.out.println("Animals makes sound, under that DOG Barks!!!");
    }
}
class Cat extends Animal{
    void cat(){  // HERE THE 'cat()' IS USER-DEFINED ONE. WE CAN CREATE OUR OWN!
        System.out.println("Animals makes sound, under that CAT Meows!!!");
    }
}


public class classObj {
    public static void main (String[]args){
       Animal a1 = new Animal(); // CREATING parent_class
       Dog a2 = new Dog(); // sub_class
       Cat a3 = new Cat(); // sub_class
       a1.animals(); // CALLING THE METHOD
       a2.dog();
       a3.cat();
    }
}
