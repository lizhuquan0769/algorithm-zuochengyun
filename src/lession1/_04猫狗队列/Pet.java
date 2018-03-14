package lession1._04猫狗队列;

/**
 * Created by lizhuquan on 2018/3/14.
 */
public class Pet {

    public final static String TYPE_CAT = "cat";
    public final static String TYPE_DOG = "dog";

    private String type;

    public Pet(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
