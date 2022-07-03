class Java {
    public static void main(String[] args) {
        System.out.println("This is Snigdha Hello world\n ");
        int n1=400;
        double wideningVariable = n1;
        wideningVariable=n1+0.1;
        int narrowingVariable=(int)wideningVariable; //Type Casting
        System.out.println("Narrowing Variable "+narrowingVariable);
    }
}
