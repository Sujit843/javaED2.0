package Interfaces.Example2;

// Ham yaha multiple class ko inherit kar pa rhe he help of interface
// ham yhi kam inheritance me nhi kar pa rhe he
// ( ham wha par multiple class ko extent nhi kar pa rhe he)

public class SmartPhone implements Phone , Camera, MusicPlayer   {



    @Override
    public void clickPhoto() {
        System.out.println("taking photo with smartphone.");
    }

    @Override
    public void recordVideo() {
        System.out.println("record video with smartphone..");
    }

    @Override
    public void playMusic() {
        System.out.println("play music with smartphone...");
    }

    @Override
    public void stopMusic() {
        System.out.println("stop music with help of smartphone....");
    }

    @Override
    public void makeCall() {
        System.out.println("make call with smartphone.....");
    }

    @Override
    public void endCall() {
        System.out.println("end call with smartphone.....");
    }
}
