class Solution {
    public static int[] twoSum(int[] nums, int target) {

       Map<Integer,Integer> num_map = new HashMap<>();

       

       for (int i=0;i<nums.length;i++) {

         int complement = target - nums[i];

         if (num_map.containsKey(complement)) {

            return new int[] {num_map.get(complement),i};

            }

           num_map.put(nums[i],i);

         }

         throw new IllegalArgumentException("No match Found");

       }

       

       

       

       

       

  public static void main (String[] args) throws java.lang.Exception 

  {

    // your code goes here

    Scanner sc = new Scanner(System.in);

    int y = sc.nextInt();

    int[] x = new int[y];

    

    System.out.println(twoSum(x,y));   
    }
}