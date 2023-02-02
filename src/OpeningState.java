public class OpeningState implements Condition {
    @Override
    public void changePosition(Door door) {
        System.out.println("Door is Open");
        door.setCondition(new СlosedState());

    }
}
