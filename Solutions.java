public class Solutions {

  public class CodeWars {
    public static int strCount(String str, char letter) {
        int count = 0;
        
        for (int i = 0; i < str.length(); i++){
          if (str.charAt(i) == letter){
            count++;
          }
        }
        return count;
    }
  }
///////////////////////////////////////////////////////////////////
  public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
      int count = 0;
    
      for (int i = 0; i < arrayOfSheeps.length; i++){
        if (arrayOfSheeps[i] != null && arrayOfSheeps[i] == true){
          count++;
        }
      }
      return count;
      }
    }
///////////////////////////////////////////////////////////////////
  public static boolean feast(String beast, String dish) {
    String bFirstLetter = beast.chartAt(0);
    String bLastLetter = beast.chartAt(beast.length() -1);

    String dFirstLetter = dish.chartAt(0);
    String dLastLetter = dish.chartAt(dish.length() -1);

    if (bFirstLetter && bLastLetter == dFirstLetter && dLastLetter){
      return true;
    }
      
  }

  
///////////////////////////////////////////////////////////////////
}
