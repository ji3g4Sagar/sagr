import org.junit.jupiter.api.Test;

public class testJava {

  enum CityCode {
    TPE,
    TCH,
    TNN,
    KHH
  }

  @Test
  public void test(){
    CityCode city = CityCode.TPE;

    System.out.println(city.name()+ ", "+ city.ordinal());


  }
}
