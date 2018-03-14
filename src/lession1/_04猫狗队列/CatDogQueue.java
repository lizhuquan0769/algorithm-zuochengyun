package lession1._04猫狗队列;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by lizhuquan on 2018/3/14.
 */
public class CatDogQueue {

    private Queue<PetQueueEntry> catQ;
    private Queue<PetQueueEntry> dogQ;
    private AtomicLong counter;

    public CatDogQueue() {
        this.catQ = new LinkedList<>();
        this.dogQ = new LinkedList<>();
        counter = new AtomicLong();
    }

    public void add(Pet pet) {
        switch (pet.getType()) {
            case Pet.TYPE_CAT:
                catQ.add(new PetQueueEntry(pet, counter.incrementAndGet()));
                break;
            case Pet.TYPE_DOG:
                dogQ.add(new PetQueueEntry(pet, counter.incrementAndGet()));
        }
    }

    public Pet pollPet() {
        if (!catQ.isEmpty() && !dogQ.isEmpty()) {
            if (catQ.peek().getCount() < dogQ.peek().getCount()) {
                return catQ.poll().getPet();
            } else {
                return dogQ.poll().getPet();
            }
        } else if (!catQ.isEmpty()) {
            return catQ.poll().getPet();
        } else if (!dogQ.isEmpty()) {
            return dogQ.poll().getPet();
        } else {
            throw new RuntimeException("queue is empty");
        }
    }

    public Cat pollCat() {
        if (!catQ.isEmpty()) {
            return (Cat) catQ.poll().getPet();
        }
        throw new RuntimeException("cat queue is empty");
    }

    public Dog pollDog() {
        if (!dogQ.isEmpty()) {
            return (Dog) dogQ.poll().getPet();
        }
        throw new RuntimeException("dog queue is empty");
    }
}
