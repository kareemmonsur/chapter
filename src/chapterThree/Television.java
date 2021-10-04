package chapterThree;

public class Television {

    private boolean isOn;
    private String productName;
    private int channel;
    private int volume;

    public Television(boolean isOn, String productName, int channel, int volume) {

        this.isOn = isOn;
        this.productName = productName;
        this.channel = channel;
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

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getChannel() {
        return channel;
    }

    public void setIncreaseChannel(int channel) {
        this.channel = channel + 1;
    }

    public void setDecreaseChannel(int channel) {
            this.channel = channel - 1;
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
