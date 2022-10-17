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
public class TotalPoints {
  
  public static int points(String[] games) {
    int totalPoints = 0;
    
    for (String item:games){
      int x = (int) item.charAt(0);
      int y = (int) item.charAt(2);
      
      if (x > y){
        totalPoints += 3;
      }else if (x == y){
        totalPoints++;
      }
    }
    return totalPoints;
  }
}
///////////////////////////////////////////////////////////////////

  
///////////////////////////////////////////////////////////////////
}
