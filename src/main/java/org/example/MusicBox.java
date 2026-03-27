package org.example;

public record MusicBox(String music, boolean isPaused) implements MusicPlayer {
    @Override
    public void playMusic() {

    }

    @Override
    public void pauseMusic() {

    }

    @Override
    public void stopMusic() {

    }
}
