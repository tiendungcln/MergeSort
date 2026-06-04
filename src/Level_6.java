import java.util.Arrays;

public class Level_6 {

    public static int[] mergeSort(int[] arr){

        if (arr.length <= 1){
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        for (int i = 0; i < mid; i++){
            left[i] = arr[i];
        }

        for (int i = mid; i < arr.length; i++){
            right[i - mid] = arr[i];
        }

        // Đệ quy sort nửa bên trái
        int[] sortedLeft = mergeSort(left);
        // Đệ quy sort nửa bên phải
        int[] sortedRight = mergeSort(right);

        // Gộp 2 mảng đã sort và trả kết quả về
        return merge(sortedLeft, sortedRight);

        // Chia xuống:
        // [5,2]
        // [5] [2]

        // Return lên:
        // sortedLeft = [5]
        // sortedRight = [2]
        // merge([5], [2]) => [2,5]

    }

    public static int[] merge(int[] left, int[] right){

        int[] result = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

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

        return result;

    }

    public static void main(String[] args){

        int[] arr = {5, 2, 4, 1};

        System.out.println(Arrays.toString(mergeSort(arr)));

    }

    /*
    mergeSort([5,2,4,1])
    ├─ mergeSort([5,2])
    │  ├─ mergeSort([5]) -> [5]
    │  ├─ mergeSort([2]) -> [2]
    │  └─ merge([5],[2]) -> [2,5]
    │
    │  return [2,5] --> int[] sortedLeft = [2,5];
    │
    ├─ mergeSort([4,1])
    │  ├─ mergeSort([4]) -> [4]
    │  ├─ mergeSort([1]) -> [1]
    │  └─ merge([4],[1]) -> [1,4]
    │
    │  return [1,4] --> int[] sortedRight = [1,4];
    │
    └─ merge([2,5],[1,4])
       -> [1,2,4,5]
     */
}
