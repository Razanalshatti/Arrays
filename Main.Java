// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

class Main {
    public static void main(String[] args) {
      double[] temperature = new double[5];
      temperature[0] = 20.0;
      temperature[1] = 21.0;
      temperature[2] = 22.0;
      temperature[3] = 23.5;
      temperature[4] = 21.5;
  
      temperature[2] = 24.5;
  
      for (double temp : temperature) {
        System.out.println("Weather Temprature: " + temp);
      }
  
    }
  
    // @Test
    // void addition() {
    // assertEquals(2, 1 + 1);
    // }
  }