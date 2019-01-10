package com.lxd.design.patterns.structural.adapter;

/**
 * @author lixiaodong
 * @version V1.0.0
 * @date 2019-01-10
 */
public interface AdvancedMediaPlayer {
    void playVlc(String fileName);
    void playMp4(String fileName);
}
class VlcPlayer implements AdvancedMediaPlayer{
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    public void playMp4(String fileName) {
        //什么也不做
    }
}

class Mp4Player implements AdvancedMediaPlayer{

    public void playVlc(String fileName) {
        //什么也不做
    }

    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}