package CustomHashMapImpl;

public class CustomHashMapTest {

    public static void main(String[] args) {
        CustomHashMap<Integer,String> nameToLen = new CustomHashMap<>();
        nameToLen.put(1,"a");
        nameToLen.put(6,"riddhi");
        nameToLen.put(5,"abdfgsdf");
        nameToLen.put(3,"abc");
        nameToLen.put(5,"riddd");


        System.out.println(nameToLen.get(5));
        System.out.println(nameToLen.get(1));
        System.out.println(nameToLen.get(6));
        System.out.println(nameToLen.get(3));
        System.out.println(nameToLen.get(7));
    }
}
