package DS.Class5_Arrays.BinarySearch;


public class FirstBadVersion {
    static boolean isBadVersion(int n) {
        if (n >= 4) {
            System.out.println(n);
            return true;
        }
        System.out.println(false);
        return false;
    }

    static int firstBadVersion(int n) {
        int left = 1, right = n;

        while(left < right) {
            int mid = left + (right - left)/ 2;
            System.out.println(mid);
            if(isBadVersion(mid)) right = mid;
            else left = mid + 1;
            System.out.println(left);
        }
        return left;
    }

    public static void main(String[] args) {
        firstBadVersion(5);
    }
}
