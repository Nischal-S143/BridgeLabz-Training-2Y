class DequeArray {
    int[] arr;
    int size;
    int capacity;

    public DequeArray(int k) {
        arr = new int[k];
        capacity = k;
        size = 0;
    }

    // Insert at front
    public boolean insertFront(int val) {
        if (size == capacity) return false;

        for (int i = size; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = val;
        size++;
        return true;
    }

    // Insert at rear
    public boolean insertRear(int val) {
        if (size == capacity) return false;

        arr[size] = val;
        size++;
        return true;
    }

    // Delete front
    public boolean deleteFront() {
        if (size == 0) return false;

        for (int i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--;
        return true;
    }

    // Delete rear
    public boolean deleteRear() {
        if (size == 0) return false;

        size--;
        return true;
    }

    public int getFront() {
        if (size == 0) return -1;
        return arr[0];
    }

    public int getRear() {
        if (size == 0) return -1;
        return arr[size - 1];
    }
}