public class arrayTwo{

  public static int countEvens(int[] nums) {
    int numEvens = 0;
    for (int x: nums){
      if (x%2 == 0){
        numEvens += 1;
      }
    }
    return numEvens;
 }

 public static int bigDiff(int[] nums) {
   int min = nums[0];
   int max = nums[0];
   for (int x: nums){
     min = Math.min(min, x);
     max = Math.max(max, x);
   }
   return max - min;
 }

 public static int centeredAverage(int[] nums) {
   int min = nums[0];
   int max = nums[0];
   for (int x: nums){
     min = Math.min(min, x);
     max = Math.max(max, x);
   }
   int total = 0;
   for (int x: nums){
     total += x;
   }
   total = total - min - max;
   return total / (nums.length - 2);
 }

  public static void main (String[] args){
    int[] a = {2, 1, 2, 3, 4};
    System.out.println("countEvens: should be 3..." + countEvens(a));
    System.out.println("bigDiff: should be 3..." + bigDiff(a));
    System.out.println("centeredAverage: should be 2..." + centeredAverage(a));
  }
}
