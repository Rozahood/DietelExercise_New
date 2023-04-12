package chapterFour;

public class TabularOutput {
    public static void main(String[] args) {
        int y = 0, n = 1, x=0, z=0;

        System.out.println("N\t2N\t3N\t4N");
        while ( n <= 5){
            y = n*n;
            x = n*n*n;
            z = n*n*n*n;
            System.out.println(n+"\t"+y+"\t"+x+"\t"+z);
            n++;
        }
    }
}
