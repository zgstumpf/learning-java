public class VariablePointing {
    public static void main(String[] args) {
        // a points to 1
        // a -> 1
        int a = 1;

        // b points to what a is pointing to
        // a -> 1 <- b
        int b = a;

        // a points to something else
        //      1 <- b
        // a -> 2
        a = 2;

        System.out.println(a); // 2
        System.out.println(b); // 1
    }
}
