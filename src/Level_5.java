import java.util.Arrays;

public class Level_5 {
    // Đệ quy chia mảng
    // Cho:
    // [5,2,4,1]
    // In:
    // [5,2,4,1]
    // [5,2]
    // [4,1]
    // [5]
    // [2]
    // [4]
    // [1]

    public static void splitArray(int[] arr){

        System.out.println(Arrays.toString(arr));

        if (arr.length <= 1){
            return;
        }

        int mid = arr.length / 2;

        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        for (int i = 0; i < mid; i++){
            left[i] = arr[i];
        }

        // index mới = index cũ - vị trí bắt đầu của right
        for (int i = mid; i < arr.length; i++){
            right[i - mid] = arr[i];
        }

        splitArray(left);
        splitArray(right);

    }

    public static void main(String[] args){

        int[] arr = {5, 2, 4, 1};
        splitArray(arr);

    }
}
