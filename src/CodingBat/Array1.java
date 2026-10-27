package CodingBat;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Array1 {
    public boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }

    public boolean commonEnd(int[] a, int[] b) {
        return (a[0] == b[0]) || (a[a.length - 1] == b[b.length - 1]);
    }

    public int[] reverse3(int[] nums) {
        return new int[]{nums[2], nums[1], nums[0]};
    }

    public int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }

    public boolean no23(int[] nums) {
        return nums[0] != 2 && nums[0] != 3 && nums[1] != 2 && nums[1] != 3;
    }

    public int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3) nums[i + 1] = 0;
        }
        return nums;
    }

    public int[] makeMiddle(int[] nums) {
        int mid = nums.length / 2;
        return new int[]{nums[mid - 1], nums[mid]};
    }

    public int[] midThree(int[] nums) {
        int mid = nums.length / 2;
        return new int[]{nums[mid - 1], nums[mid], nums[mid + 1]};
    }

    public boolean unlucky1(int[] nums) {
        int len = nums.length;
        if (len < 2) return false;
        if (nums[0] == 1 && nums[1] == 3) return true;
        if (len >= 3 && nums[1] == 1 && nums[2] == 3) return true;
        if (nums[len - 2] == 1 && nums[len - 1] == 3) return true;
        return false;
    }

    public boolean sameFirstLast(int[] nums) {
        int len = nums.length;
        if (len >= 1 && nums[0] == nums[len - 1]) return true;
        return false;
    }

    public int sum3(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public int[] maxEnd3(int[] nums) {
        int max = Math.max(nums[0], nums[2]);
        return new int[]{max, max, max};
    }

    public int[] rotateLeft3(int[] nums) {
        int index = nums.length - 1;
        int[] arr = new int[nums.length];
        for (int i = index; i <= 0; i--) {
            arr[i] = nums[i];
        }
        return arr;
    }

    public int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length > 0 && a[0] == 1) count++;
        if (b.length > 0 && b[0] == 1) count++;
        return count;
    }

    public int[] biggerTwo(int[] a, int[] b) {
        int first = a[0] + a[1];
        int second = b[0] + b[1];
        return first >= second ? a : b;
    }
    public int[] swapEnds(int[] nums) {
        if(nums.length<=1) return nums;
        int first=nums[0];
        int last=nums[nums.length-1];
        nums[0]=last;
        nums[nums.length-1]=first;
        return nums;
    }
    public int maxTriple(int[] nums) {
        int first = nums[0];
        int middle = nums[nums.length / 2];
        int last = nums[nums.length - 1];
        int[] arr = {first, middle, last};
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public int[] make2(int[] a, int[] b) {
        if(a.length>=2) return new int[] {a[0],a[1]};
        else if(a.length==1 && b.length>1) return new int[] {a[0],b[0]};
        return new int[] {b[0],b[1]};
    }
}
