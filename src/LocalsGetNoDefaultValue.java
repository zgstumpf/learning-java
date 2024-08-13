public class LocalsGetNoDefaultValue {
    public static void main(String[] args) {
        // Why does this not work? Why doesn't a get a default value of 0?
//        int a;
//        System.out.println(a);
        // Because only instance variables can not be initialized and get a default value.
        // Local variables must be initialized before use.

    }
}
