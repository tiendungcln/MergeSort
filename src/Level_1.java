import java.util.Arrays;

public class Level_1 {
    // Chia mảng thành 2 nửa
    // Ví dụ:
    // int[] arr = {5, 2, 4, 1, 8, 3};
    // Kết quả:
    // Left:  [5, 2, 4]
    // Right: [1, 8, 3]
    // Mục tiêu:
    // Tìm mid
    // Tách mảng thành left và right

    public static void splitArray(int[] arr){

        int mid = arr.length / 2;

        // mid = 3 => left = [0, 0 ,0]
        int[] left = new int[mid];
        // arr.length - mid = 6 - 3 => right = [0, 0, 0]
        int[] right = new int[arr.length - mid];

        for (int i = 0; i < mid; i++){
            left[i] = arr[i];
        }

        for (int i = mid; i < arr.length; i++){
            // right phải bắt đầu từ index 0
            // nhưng arr đang bắt đầu từ index mid nên:
            // Lần 1: i = mid = 3 => 3 - 3 = 0 => Bắt buộc mảng phải chạy từ 0
            // Lần 2: i = 4 => 4 - mid = 1
            // Lần 3: ......
            right[i - mid] = arr[i];
        }

        System.out.println("Left: " + Arrays.toString(left));
        System.out.println("Right: " + Arrays.toString(right));

    }

    public static void main(String[] args){

        int[] arr = {5, 2, 4, 1, 8, 3};

        splitArray(arr);

    }
}
