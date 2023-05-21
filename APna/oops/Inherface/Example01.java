package Inherface;

import java.security.PublicKey;

class Phone
{
    public void call() {
        System.out.println("Phone Call");

    }
    public void sms()
    {
        System.out.println("Phione sending SMS");
    }

}
interface ICamera
{
    void click();
    void record();


}

interface IMusicPlayer
{
    void play();
    void stop();
}


class SmartPhone extends Phone implements ICamera,IMusicPlayer
{

    @Override
    public void play() {
        System.out.println("SmartPhone is playing music");
    }

    @Override
    public void stop() {
        System.out.println("SmartH");
    }

    @Override
    public void click() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'click'");
    }

    @Override
    public void record() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'record'");
    }
    
}

public class Example01 {
    
}
