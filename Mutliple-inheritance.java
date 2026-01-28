interface Ubuntu {
    default void ubuntu() {
        System.out.println("This is Ubuntu OS");
    }
}
interface Kali {
    default void kali() {
        System.out.println("This is Kali OS");
    }
}

class Debian implements Ubuntu, Kali {
    void parent() {
        System.out.println("This is parent OS for above both!");
    }
}

class Main {
    public static void main(String[]ppe){
        Debian d = new Debian();
        d.ubuntu();
        d.kali();
        d.parent();
    }
}
