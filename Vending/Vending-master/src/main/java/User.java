public class User {

    private int money;

    public int getMoney(){
        return this.money;
    }

    public void inputMoney(int input){
        money += input;
    }
    public void change(int change){
        if(change>money){
            throw new IllegalArgumentException();
        }
        money -= change;
    }
}
