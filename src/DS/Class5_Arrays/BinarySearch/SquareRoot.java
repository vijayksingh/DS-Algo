package DS.Class5_Arrays.BinarySearch;

public class SquareRoot {
    static boolean isSquareRoot(int n, int square) {
        if( n > square/n ) return true;
        return false;
    }

    static int squareRoot(int square) {
        if (square == 1) return 1;

        int left = 1, right = square;
        while (left < right) {
            int mid = left + (right - left) / 2;
            System.out.println(mid);
            if (isSquareRoot(mid, square)) right = mid;
            else left = mid+1;
        }
        return left-1;
    }

    public static void main(String[] args) {
        System.out.println(squareRoot(2147395599));
    }
}
