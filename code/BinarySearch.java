public class BinarySearch {
    public static void main(String[] args){
        int[] numbers = new int[20];
        for(int i = 0; i < 20; i+=1) numbers[i] = 1 + i*2;

        System.out.println(LinearSearch.search(numbers, 11));
    }

    public static int search(int[] numbers, int target){
        int lo = 0;
        int hi = numbers.length - 1;
        int mid = lo + (hi - lo) / 2;

        while(numbers[mid] != target) {
            if(numbers[mid] < target) lo = mid + 1;
            else hi = mid + 1;
            if (hi < lo) return -1;
            mid = lo + (hi - lo) / 2;
        }
        return mid;
    }
}
