package ua.ithillel.oop.abstraction.homework;

public class RunningRoad implements Obstacle {
    private static final int DISTANCE = 15;
    @Override
    public boolean overcome(Participant participant) {
        if (participant.getRunDistance() >= DISTANCE) {
            participant.run();
            return true;
        }
        return false;
    }
}
