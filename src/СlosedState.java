public class –°losedState implements Condition {
    @Override
    public void changePosition(Door door) {
        System.out.println("Door is clouse");
        door.setCondition(new OpeningState());
    }
}
