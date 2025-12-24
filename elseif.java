public class elseif {
    public static void main(String[] args) {
        int weather = 2; // 1 = raining, 2 = sunny, 3 = cloudy

        if (weather == 1) {
          System.out.println("Bring an umbrella.");
          } 
        else if (weather == 2) {
          System.out.println("Wear sunglasses.");
          }
           else {
           System.out.println("Just go outside normally.");
            }
            int time = 22;
        if (time < 10) {
          System.out.println("Good morning.");
         }
        else if (time < 18) {
          System.out.println("Good day.");
        }
        else {
          System.out.println("Good evening.");
        }
    }
    
}
