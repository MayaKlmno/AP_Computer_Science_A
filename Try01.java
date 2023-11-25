public class Try01 {
  public static int diff21(int n) {
    if(Math.abs(21-n) > 21){
      return Math.abs(21-n) * 2;
    }
    return Math.abs(21-n);
  }
  public static void main(String[] args){
    int h = diff21(22);
  }
  
  }