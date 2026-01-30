package Pattern_For_Loop;
public class Cube {
    public static void main(String[] args) {

        int i ,j, k ;
        int n = 5;  // size of cube face

        for (i=0; i<n; i++) {
            for (j = 0; j < n; j++) {
                for (k = 0; k < n; k++) {
                    System.out.print("* ");  //print * * * * *(rows)
                }
                System.out.println( );
            }
            System.out.println( );
        }
    }

}



