class intern {
    public static void main(String[] args) {

        String str1 = new String("xyz");
        String str2 = new String("xyz");

        System.out.println(str1 == str2); // false

        str1 = str1.intern();
        str2 = str2.intern();

        System.out.println(str1 == str2); // true
    }
}
