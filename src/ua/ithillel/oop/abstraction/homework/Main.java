package ua.ithillel.oop.abstraction.homework;

public class Main {
    public static void main(String[] args) {
        Obstacle[] obstacles = {new RunningRoad(), new ThreadMill()};
        Participant[] participants = {new Robot(), new Cat()};

        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                if (!obstacles[j].overcome(participants[i])) {
                    break;
                }
            }
        }
    }
}
