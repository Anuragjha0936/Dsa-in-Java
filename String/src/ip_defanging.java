public class ip_defanging {
    public static void main(String[] args) {
       String address = "1.1.1.1";
       address=address.replace(".","[.]");
        System.out.println(address);

    }
}
