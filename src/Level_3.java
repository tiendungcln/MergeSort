import java.util.Arrays;

public class Level_3 {
    // Merge mảng dài hơn
    // Cho:
    // left  = [1, 3, 7]
    // right = [2, 4, 5, 8]
    // Kết quả:
    // [1, 2, 3, 4, 5, 7, 8]

    public static void mergeTwoSortedArrays(int[] left, int[] right){

        int[] result = new int[left.length + right.length];

        int i = 0; // left
        int j = 0; // right
        int k = 0; // result

        while (i < left.length && j < right.length){

            if (left[i] <= right[j]){

                result[k] = left[i];
                i++;

            } else {

                result[k] = right[j];
                j++;

            }

            k++;

        }

        while (i < left.length){

            result[k] = left[i];

            i++;
            k++;

        }

        while (j < right.length){

            result[k] = right[j];

            j++;
            k++;

        }

        System.out.println(Arrays.toString(result));

    }

    public static void main(String[] args){

        int[] left  = {1, 3, 7};
        int[] right = {2, 4, 5, 8};

        mergeTwoSortedArrays(left, right);

    }

}
