package CodingBat;

public class Array1 {
    public boolean firstLast6(int[] nums) {
        return nums[0]==6 || nums[nums.length-1]==6;
    }

    public boolean commonEnd(int[] a, int[] b) {
        return a[a.length-1]==b[b.length-1];
    }
}
