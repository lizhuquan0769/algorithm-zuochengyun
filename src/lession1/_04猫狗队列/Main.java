package lession1._04猫狗队列;

/**
 * Created by lizhuquan on 2018/3/14.
 */
public class Main {

    public static void main(String[] args) {
        CatDogQueue queue = new CatDogQueue();
        queue.add(new Cat());
        queue.add(new Cat());
        queue.add(new Cat());
        queue.add(new Cat());
        queue.add(new Cat());
        queue.add(new Dog());
        queue.add(new Dog());
        queue.add(new Dog());
        queue.add(new Dog());
        queue.add(new Dog());

        System.out.println(queue.pollDog());
        System.out.println(queue.pollCat());
        System.out.println(queue.pollPet());
        System.out.println(queue.pollPet());
        System.out.println(queue.pollPet());
        System.out.println(queue.pollPet());
        System.out.println(queue.pollPet());
        System.out.println(queue.pollPet());
        System.out.println(queue.pollPet());
        System.out.println(queue.pollPet());
        System.out.println(queue.pollPet());
    }
}
