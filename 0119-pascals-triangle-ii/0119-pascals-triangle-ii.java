class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> arr = new ArrayList<>();
        long value = 1;
        arr.add((int) value);
        for (int i = 1; i <= rowIndex; i++) {
            value = value * (rowIndex - i + 1) / i;
            arr.add((int) value);
        }
        return arr;
    }
}