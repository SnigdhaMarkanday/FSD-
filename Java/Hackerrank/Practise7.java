public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan= new Scanner(System.in);
        int line_num = 0;
        while(scan.hasNext()){
            System.out.println(++line_num + " " + scan.nextLine());
        }
            
        scan.close();
    }
