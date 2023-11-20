public class Stereo {
    private boolean on;
    private String inputSource;
    private int volume;

    public Stereo() {
        on = false;
        inputSource = null;
        volume = 0;
    }

    public void on() {
        on = true;
        System.out.println("Strero on");
    }

    public void off() {
        on = false;
        System.out.println("Strero off");

    }

    public void setCd() {
        inputSource = "CD";
    }

    public void setDvd() {
        inputSource = "DVD";
    }

    public void setRadio() {
        inputSource = "Radio";
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public String getInputSource() {
        return inputSource;
    }

    public boolean isOn() {
        return on;
    }

    public void setCD() {
    }
}
