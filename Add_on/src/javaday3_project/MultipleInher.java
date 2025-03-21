package javaday3_project;

interface Camera1 {
    void capturePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class Mobile implements Camera1, MusicPlayer {
    public void capturePhoto() {
        System.out.println("Photo captured using this camera");
    }

    public void playMusic() {
        System.out.println("Playing music");
    }
}

public class MultipleInher {
    public static void main(String[] args) {
        Mobile s = new Mobile();
        s.capturePhoto();
        s.playMusic();
    }
}
