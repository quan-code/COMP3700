public class Finder {

    public Integer findMax(int[] intArray) {
        int max = Integer.MIN_VALUE;
        if (intArray == null || intArray.length == 0) {
            return null;
        }
        for(int i = 0; i < intArray.length; i++) {
            if (intArray[i] > max) {
                max = intArray[i];
            }
        }
        return max;
    }

    public Integer findMin(int[] intArray) {
        int min = Integer.MAX_VALUE;
        if (intArray == null || intArray.length == 0) {
            return null;
        }
        for(int i = 0; i < intArray.length; i++) {
            if (intArray[i] < min) {
                min = intArray[i];
            }
        }
        return min;
    }
}
