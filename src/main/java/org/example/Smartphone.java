package org.example;

public class Smartphone implements MusicPlayer, VideoPlayer {
    @Override
    public void playMusic() {
        System.out.println("Tocando música no smartphone");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Pausando música no smartphone");
    }

    @Override
    public void stopMusic() {
        System.out.println("Parando música no smartphone");
    }

    @Override
    public void playVideo() {
        System.out.println("Video iniciado no smartphone");
    }

    @Override
    public void pauseVideo() {
        System.out.println("Vídeo pausado no smartphone");
    }

    @Override
    public void stopVideo() {
        System.out.println("Parando o vídeo no smartphone");
    }
}
