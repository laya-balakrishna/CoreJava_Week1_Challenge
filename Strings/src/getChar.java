class getChar {
    public static void main( String args[] ) {
        String str = "Hello My name is Laya";
        char[] dest = new char[12];

        try {
            str.getChars(0, 5, dest, 0);
            System.out.println(dest);
        }
        catch (Exception e) {
            System.out.println("Exception Thrown:" + e);
        }
    }
}