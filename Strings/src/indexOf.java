// Java String indexOf() with only one parameter
class indexOf {
    public static void main(String[] args) {
        String str1 = "Learn Java";
        int result;
        result = str1.indexOf('J');
        System.out.println(result);
        result = str1.indexOf('j');
        System.out.println(result);
        result = str1.indexOf("ava");
        System.out.println(result);
        result = str1.indexOf("java");
        System.out.println(result);
        result = str1.indexOf("");
        System.out.println(result);
    }
}
