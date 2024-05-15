package Week_3.Day_17.Recursive_Approach;

public class Climbing_Stairs_Recursive_Approach {
    public int climbStairs(int n){
        if(n == 0 || n == 1) return 1;

        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}
