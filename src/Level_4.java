import java.util.Arrays;

public class Level_4 {
    // In quá trình merge
    // Cho:
    // left  = [2, 5]
    // right = [1, 4]
    // In:
    // So sánh 2 và 1
    // Chọn 1
    // So sánh 2 và 4
    // Chọn 2
    // So sánh 5 và 4
    // Chọn 4
    // Thêm 5 còn lại

    public static void mergeTwoSortedArrays(int[] left, int[] right){

        int[] result = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length){

            System.out.println("Left: " + left[i] + " ? " + "Right: " + right[j]);

            if (left[i] <= right[j]){

                result[k] = left[i];
                System.out.println("Chọn : " + left[i]);
                i++;

            }else {

                result[k] = right[j];
                System.out.println("Chọn : " + right[j]);
                j++;

            }

            k++;

        }

        while (i < left.length){

            result[k] = left[i];
            System.out.println("Thêm " + left[i] + " còn lại");
            i++;
            k++;

        }

        while (j < right.length){

            result[k] = right[j];
            System.out.println("Thêm " + right[j] + " còn lại");
            j++;
            k++;

        }

        System.out.println(Arrays.toString(result));

    }

    public static void main(String[] args){

        int[] left = {2, 5};
        int[] right = {1, 4};

        mergeTwoSortedArrays(left, right);

    }

}
