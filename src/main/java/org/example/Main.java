package org.example;

public class Main {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new Computer();
        VideoPlayer videoPlayer = new Computer();

        runMusic(musicPlayer);
        runVideo(videoPlayer);
    }

    public static void runMusic(MusicPlayer musicPlayer) {
        musicPlayer.playMusic();
    }

    public static void runVideo(VideoPlayer videoPlayer) {
        videoPlayer.playVideo();
    }
}