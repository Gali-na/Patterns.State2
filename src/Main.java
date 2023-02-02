public class Main {
    public static void main(String[] args) {
      Door door = new Door();
      Condition condition = new СlosedState();
      door.setCondition(condition);
      for(int i=0; i<10;i++){
          door.changeСondition();
      }
    }
}