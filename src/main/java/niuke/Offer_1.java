package niuke;

import static net.mindview.util.Print.print;

public class Offer_1 {
    public boolean Find(int target, int [][] array) {
        int rows = array.length;
        int cols = array[0].length;
        Boolean b = false;
        for(int i = rows - 1; i >= 0; i--){
            for(int j = 0; j < cols; j++){
                if (array[i][j] > target){
                    break;
                }else{
                    if (array[i][j] == target){
                        b = true;
                    }
                }
            }
        }
        return b;
    }

    public static void main(String[] args) {
        int  target = 5;
        int[][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        Offer_1 o = new Offer_1();
        Boolean b = o.Find(target,array);
        print(b);
    }
}
