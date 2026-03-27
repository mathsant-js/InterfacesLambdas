package org.example;

public class Computer implements MusicPlayer, VideoPlayer {
    @Override
    public void playMusic() {
        System.out.println("O computador está tocando uma música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O computador pausou uma música");
    }

    @Override
    public void stopMusic() {
        System.out.println("O computador parou uma música");
    }

    @Override
    public void playVideo() {
        System.out.println("O computador está reproduzindo um vídeo");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O computador pausou um vídeo");
    }

    @Override
    public void stopVideo() {
        System.out.println("O computador parou um vídeo");
    }
}
