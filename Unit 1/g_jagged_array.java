import java.util.*;
class g_jagged_array {
    public static void main(String[] args) {
       int[] x ={4,7,24,9,454,6}; 
       int[] y ={4,7,24, 7,8,34,1,9,454,6};
       int[] z ={9,454,6};
       
       int[][] xyz = {x,y,z};
       System.out.println(xyz.length); // length of jagged array
       System.out.println(xyz[0].length); // length of 1st array of jagged array ie x
       System.out.println(xyz[1].length);
       System.out.println(xyz[2].length);
       System.out.println(xyz[1][4]);  // to access 4th index element of 1st index array
    
       for(int i=0; i< xyz.length; i++){
            for(int j=0; j<xyz[i].length; j++){
                System.out.print(xyz[i][j] +" ");
            }
            System.out.println();
       }

       for(int[] m : xyz ){
            for(int item : m){
                System.out.print(item + " ");
            }
            System.out.println();
       }
    }
}
