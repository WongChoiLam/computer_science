public class LinearSearch {
    public static void main(String[] args){
        int[] numbers = new int[20];
        for(int i = 0; i < 20; i+=1) numbers[i] = 1 + i*2;

        System.out.println(LinearSearch.search(numbers, 11));
    }

    public static int search(int[] numbers, int target){
        int lo = 0;
        int hi = numbers.length - 1;
        
        for(int i = lo; i < hi; i+=1){
            if(numbers[i] == target) return i;
        }

        return -1;
    }
}
