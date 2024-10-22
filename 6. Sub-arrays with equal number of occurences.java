class Solution {

    static int sameOccurrence(int arr[], int x, int y) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int currentDiff = 0; 
        int count = 0; 
        countMap.put(0, 1); 
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                currentDiff++; 
            } else if (arr[i] == y) {
                currentDiff--; 
            }
            count += countMap.getOrDefault(currentDiff, 0);
            countMap.put(currentDiff, countMap.getOrDefault(currentDiff, 0) + 1);
        }
        return count;
    }
}
