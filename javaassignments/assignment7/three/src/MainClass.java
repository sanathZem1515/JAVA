public class MainClass {
    void m1(FirstInterface i1) {
        i1.method1();
    }

    void m2(SecondInterface i2) {
        i2.method4();
    }

    void m3(ThirdInterface i3) {
        i3.method6();
    }

    void m4(FourthInterface ni) {
        ni.method7();
    }

    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        NewClass newClass = new NewClass();

        mainClass.m1(newClass);
        mainClass.m2(newClass);
        mainClass.m3(newClass);
        mainClass.m4(newClass);
    }
}