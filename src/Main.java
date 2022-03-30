public class Main {

    public static void main(String[] args) {

 /*       DoublyLinkedList list = new DoublyLinkedList();
        Food patatnik = new Food("patatnik",10,"potatoes,eggs,cheese");
        Food pizza = new Food("pizza",20,"tomatoes,olives,cheese");
        Food burger = new Food("burger",30,"meat,bread,cheese");
        Food soup = new Food("skembe",40,"magic");
        Food friedPotatoes = new Food("friend potatoes",7.5,"potatoes,salt");
        Food patatnikSysSirene = new Food("patatnikSysSirene",20,"sirene,kartofi,sol");


        Cache cache = new Cache(3);

*//*        System.out.println(cache.get("beer"));*//*
        cache.putInCache("pizza",pizza);
        cache.putInCache("burger",burger);
        cache.putInCache("patatnik",patatnik);
        cache.putInCache("patatnik",patatnikSysSirene);
        cache.putInCache("soup",soup);
        cache.putInCache("pizza",pizza);
        cache.putInCache("pizza",pizza);
        cache.putInCache("soup",soup);
        cache.get("burger");
        cache.get("burger");
        cache.get("burger");
        cache.get("patatnik");
        cache.get("soup");
        cache.get("soup");
        cache.get("soup");
        cache.get("soup");
        cache.displayElementsFromTheList();*/

        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(2,1); // cache is {1=1, 2=2}
        lRUCache.put(1,1);
        lRUCache.put(2,3);
        lRUCache.put(4,1);
        lRUCache.get(1);
        lRUCache.get(2);


    }
}
