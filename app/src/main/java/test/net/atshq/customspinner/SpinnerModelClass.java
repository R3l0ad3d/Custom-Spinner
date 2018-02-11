package test.net.atshq.customspinner;

import android.graphics.Paint;

/**
 * Created by User on 2/11/2018.
 */

public class SpinnerModelClass {
    private String name;
    private String discription;
    private int pic;

    public SpinnerModelClass(String name, String discription, int pic) {
        this.name = name;
        this.discription = discription;
        this.pic = pic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }
}
