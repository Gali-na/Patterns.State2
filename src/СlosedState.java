public class СlosedState implements Condition {
    @Override
    public void changePosition(Door door) {
        System.out.println("Door is clouse");
        door.setCondition(new OpeningState());
    }
}
