public class Door {
    private Condition condition;
    public void setCondition(Condition condition) {
        this.condition = condition;
    }
    public void changeСondition() {
          condition.changePosition(this);
    }

}
