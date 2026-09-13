class RandomizedSet {

    private ArrayList<Integer> list;
    private HashMap<Integer, Integer> map;
    private Random random;

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
    }

    public boolean insert(int val) {

        // Already exists
        if (map.containsKey(val)) {
            return false;
        }

        // Add value to the end
        list.add(val);

        // Store value -> index
        map.put(val, list.size() - 1);

        return true;
    }

    public boolean remove(int val) {

        // Doesn't exist
        if (!map.containsKey(val)) {
            return false;
        }

        // Index of value we want to remove
        int index = map.get(val);

        // Last element
        int last = list.get(list.size() - 1);

        // Put last element in the position of val
        list.set(index, last);

        // Update last element's new index
        map.put(last, index);

        // Remove last position
        list.remove(list.size() - 1);

        // Remove val from map
        map.remove(val);

        return true;
    }

    public int getRandom() {

        int index = random.nextInt(list.size());

        return list.get(index);
    }
}