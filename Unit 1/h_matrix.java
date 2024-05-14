import java.util.Scanner;

class h_matrix {
    public static void main(String[] args) {
        int[][] arr = new int[3][5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0; j<5; j++){
                arr [i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix of 3X5");
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr [i][j] +" ");
            }
            System.out.println();
        }

        sc.close();
        
    }
}
