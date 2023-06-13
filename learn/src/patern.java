public class patern {
    public static void main(String[] args) {
        int i,j,k;
        for(i = 1;i<7;i++)
        {
            for (k=0;k<i;k++) {
                System.out.print("   ");
            }
            for (j=7;j>i;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
