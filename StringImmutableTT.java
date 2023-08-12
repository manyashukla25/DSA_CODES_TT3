public class StringImmutableTT {
    public static void main(String[] args) {
        String name = "Amit";
        String name2 = "Amit";
        String name3 = "Amit";
        System.out.println(name == name3);
        name3 = "Ram";
        System.out.println(name == name3);
        System.out.println(name == name2);
        name2="Sita";
        System.out.println(name == name2);
    }
}
