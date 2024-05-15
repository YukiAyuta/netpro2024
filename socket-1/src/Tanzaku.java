package src;

import java.io.Serializable;

public class Tanzaku implements Serializable {

    String wishJ;
    String wishE;

    public String getWishJ() {
        return wishJ;
    }

    public void setWishJ(String wishJ) {
        this.wishJ = wishJ;
    }

    public String getWishE() {
        return wishE;
    }

    public void setWishE(String wishE) {
        this.wishE = wishE;
    }

}
