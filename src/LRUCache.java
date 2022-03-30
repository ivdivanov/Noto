public class LRUCache {


    Cache <Integer, Integer> cache;

    public LRUCache(int capacity) {
        this.cache = new Cache<>(capacity);
    }

    public int get(int key) {
        if (this.cache.get(key)== null) {
            return -1;
        }
        return this.cache.get(key);
    }

    public void put(int key, int value) {
        this.cache.putInCache(key,value);
    }

}
