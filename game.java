public class game {
    private int x;
    private int y;
    public game(int whatTheyChoose){
        x = (int) (Math.random() * 100);
        y = whatTheyChoose;
    }
    public int getY(){
        return y;
    }
    public void setY(int whatTheyChoose){
        y = whatTheyChoose;
    }
    public static void main(String[] args){
        game game1 = new game(21);
        game1.getNumber();
    }

    public int getNumber(){
        if(y > x){
            System.out.println("nope, the number you have chosen is too big.");
            return 1;
        }
        else if(y < x){
            System.out.println("Nope, your wrong, the number is too small.");
            return 1;
        }
        else{
            System.out.println("Yes, good job, you have guess the number " + x);
            return x;
        }
    }
}
