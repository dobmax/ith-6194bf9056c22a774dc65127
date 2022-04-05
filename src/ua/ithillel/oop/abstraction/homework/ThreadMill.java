package ua.ithillel.oop.abstraction.homework;

public class ThreadMill implements Obstacle {
    private static final int DISTANCE = 200;
    @Override
    public boolean overcome(Participant participant) {
        if (participant.getJumpDistance() >= DISTANCE) {
            participant.jump();
            return true;
        }
        return false;

    }
}
