package org.example.kosci;

public class Player {

    private String name;
    private int currentSum;
    private int savedSum;
    private boolean isPlaying;

    public Player(String name, boolean isPlaying) {
        this.name = name;
        this.isPlaying = isPlaying;
        this.currentSum = 0;
        this.savedSum = 0;
    }

    public int getSavedSum() {
        return savedSum;
    }

    public void setSavedSum(int savedSum) {
        this.savedSum = savedSum;
    }

    public void resetSum(){
        currentSum = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentSum() {
        return currentSum;
    }

    public void setCurrentSum(int currentSum) {
        this.currentSum = currentSum;
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", sum=" + currentSum +
                '}';
    }
}
