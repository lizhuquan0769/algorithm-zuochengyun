package lession1._04猫狗队列;

/**
 * Created by lizhuquan on 2018/3/14.
 */
public class PetQueueEntry {

    private Pet pet;
    private Long count;

    public PetQueueEntry(Pet pet, Long count) {
        this.pet = pet;
        this.count = count;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
