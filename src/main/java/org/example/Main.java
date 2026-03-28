package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new Computer();
        VideoPlayer videoPlayer = new Computer();

        List<User> users = List.of
                (
                    new User("Matheus", 18),
                    new User("Henrique", 18),
                    new User("Tino", 18)
                );

        users.forEach(user -> {
            System.out.println(user);
            System.out.println(user.getClass().getCanonicalName());
        });

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