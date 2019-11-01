package niuke;


import static net.mindview.util.Print.print;

public class offer6 {

    public static int minNumberInRotateArray(int [] array) {
        int mid = 0,mid2 = 0;
        int left = 0;
        int right = 0;
        right = array.length;
        if (array.length == 0){
            return 0;
        }else if(array.length == 1){
            return array[0];
        }
        while(true){
            mid = (left+right)/2;
            mid2 = mid-1;
            if(mid == 0){
                mid2 = 0;
            }
            if(array[mid2] > array[mid]){
                return array[mid];
            }else if(array[mid] > array[0]){
                left = mid + 1;
            }else{
                right = mid-1;
            }

        }
    }

    public static void main(String[] args) {
        int array[] = {};
        int a = offer6.minNumberInRotateArray(array);
        print(a);
    }
}
