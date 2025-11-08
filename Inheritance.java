class WindowsOS {
    void company() {
        System.out.println("Microsoft Windows");
    }
} 

class Windows7 extends WindowsOS {
    void version() {
        System.out.println("Windows 7");
    }
}

class Windows8 extends WindowsOS {
    void version() {
        System.out.println("Windows 8");
    }
}

class Windows10 extends WindowsOS {
    void version() {
        System.out.println("Windows 10");
    }
}

public class inherit {
    public static void main(String[] args) {
        Windows7 win7 = new Windows7();
        Windows8 win8 = new Windows8();
        Windows10 win10 = new Windows10();
        
        win7.company();  // Inherited from parent
        win7.version();  // Own method
        
        win8.company();  // Inherited from parent  
        win8.version();  // Own method
        
        win10.company(); // Inherited from parent
        win10.version(); // Own method
    }
}
