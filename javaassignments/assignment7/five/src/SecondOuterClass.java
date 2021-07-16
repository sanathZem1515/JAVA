public class SecondOuterClass extends FirstOuterClass{
    class SecondInnerClass extends FirstInnerClass{
        public SecondInnerClass(String string){
            super(string);
            System.out.println("Second outer class");
        }
    }
    public static void main(String[] args) {
        FirstOuterClass firstOuterClass = new FirstOuterClass();
        SecondOuterClass secondOuterClass = new SecondOuterClass();
        SecondInnerClass secondInnerClass = secondOuterClass.new SecondInnerClass("Hi");
    }
}