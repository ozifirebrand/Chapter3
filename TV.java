//OKOROAFOR OZIOMA ASSIGNMENT 18/7/2021
package chapterThree;

public class TV {
    private boolean isOn;
    private int volume = 10;
    private int currentChannel = 1;

    public void on(boolean isOn) {
        if (isOn = false)
            this.isOn = isOn;
    }

    public boolean returnOnOff(){
        return isOn;
    }

    public void changeChannelIncrementally(int button) {
        button = 1;
        if (currentChannel >= 1)
            currentChannel = currentChannel + button;
        if (currentChannel + button > 99)
            currentChannel = 1;
    }

    public void changeChannelDecrementally(int button){
        button = -1;
        if (currentChannel + button == 0)
            currentChannel = 1;
    }

    public void setCurrentChannel(int typeNumber){
        currentChannel = typeNumber;
    }

    public int displayChannel() {
        return currentChannel;
    }

    public void increaseVolume(){
        int newVolume = 1;
        if (volume <= 24)
            volume = volume + newVolume;
        if (volume + newVolume >25)
            volume = 25;
    }

    public int displayVolume() {
        return volume;
    }

    public void decreaseVolume(){
       int newVolume = -1;
       volume = volume + newVolume;
       if (volume < 1)
           volume = 0;
    }


}
