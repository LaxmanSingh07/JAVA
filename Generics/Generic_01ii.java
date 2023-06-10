public class Generic_01ii<T> {
    @SuppressWarnings("unchecked")
    T data[] = (T[]) new Object[3];

    public static void main(String args[]) {
        Generic_01ii<String> g = new Generic_01ii<>();
        g.data[0] = "hi";
        g.data[1] = "bye";
        g.data[2] = "hello";

        for (int i = 0; i < 3; i++) {
            System.out.println(g.data[i]); // no need to type casting here
        }

    }
}
