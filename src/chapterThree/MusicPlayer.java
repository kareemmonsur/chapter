package chapterThree;

public class MusicPlayer {

    private boolean isOn;
    private String productName;
    private int stationFrequency;
    private int volume;

    public MusicPlayer(boolean isOn, String productName, int stationFrequency, int volume) {

        this.isOn = isOn;
        this.productName = productName;
        this.stationFrequency = stationFrequency;
        this.volume = volume;
    }
    public void setOff(boolean isOn) {
        this.isOn = isOn;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void setProductName(String samsung) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setChannel(int stationFrequency) {
        this.stationFrequency = stationFrequency;
    }

    public int getChannel() {
        return stationFrequency;
    }

    public void setIncreaseChannel(int stationFrequency) {
        this.stationFrequency = stationFrequency + 1;
    }

    public void setDecreaseChannel(int stationFrequency) {
        this.stationFrequency= stationFrequency - 1;
    }

    public void setIncreaseVolume(int volume) {

        this.volume = volume + 1;
    }

    public int getIncreaseVolume() {
        return volume;
    }

    public void setDecreaseVolume(int volume) {
        this.volume = volume - 1;
    }

    public int getDecreaseVolume () {
        return volume;
    }
}






