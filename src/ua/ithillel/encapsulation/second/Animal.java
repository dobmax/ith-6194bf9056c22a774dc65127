package ua.ithillel.encapsulation.second;

public class Animal {
    private String skinColor;
    private EyeColor eyeColor;

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public EyeColor getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(EyeColor eyeColor) {
        this.eyeColor = eyeColor;
    }

    /**
     * @deprecated since {@link #setEyeColor(EyeColor)} introduced
     */
    @Deprecated
    public void setEyeColor(String eyeColor) {
        this.eyeColor = new EyeColor(eyeColor, "#fff", 1);
    }
}
