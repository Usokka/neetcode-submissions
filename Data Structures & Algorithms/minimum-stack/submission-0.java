class MinStack {

    private Integer min;
    private int[] vals;
    private int currIndex;
    private int maxVals;

    public MinStack() {
        min = null;
        currIndex = 0;
        maxVals = 256;
        vals = new int[maxVals];
    }

    public void push(int val) {

        if (currIndex == maxVals) {
            maxVals += 256;
            int[] arr = new int[maxVals];

            for (int i = 0; i < vals.length; i++) {
                arr[i] = vals[i];
            }

            vals = arr;
        }

        vals[currIndex] = val;
        currIndex++;

        if (min == null || val < min) {
            min = val;
        }
    }

    public void pop() {
        if (currIndex == 0) {
            return;
        }
        currIndex--;

        if (vals[currIndex] == min) {
            if (currIndex == 0) {
                min = null;
            } else {
                min = vals[0];
                for (int i = 1; i < currIndex; i++) {
                    if (vals[i] < min) {
                        min = vals[i];
                    }
                }
            }
        }
    }

    public int top() {
        return vals[currIndex - 1];
    }

    public int getMin() {
        return min;
    }
}