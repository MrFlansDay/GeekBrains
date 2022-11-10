public class App {
    int position = 0;
    int[] storage = new int[1000];

    void clear() {
        position = 0;
        int size = storage.length;
        for (int i = 0; i < size; i++) {
            storage[i] = 0;
        }
    }

    void print() {
        for (int j : storage) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    void shift() {
        if (position + 1 >= 0) System.arraycopy(storage, 1, storage, 0, position + 1);
        storage[position] = 0;
        position--;
    }

    void add(int item) {
        if (position >= storage.length)
            return;
        storage[position++] = item;
    }

    int remove() {
        if (storage[0] != 0) {
            int el = storage[0];
            shift();
            return el;
        } else {
            return -1;
        }

    }
}
