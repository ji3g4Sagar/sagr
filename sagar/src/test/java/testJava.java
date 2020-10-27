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

  @Test
  public void thread(){
    Thread t1 = Thread.currentThread();
    Thread t2 = new Thread("my thread");
    Thread t3 = new Thread();

    System.out.println(t1);
    System.out.println(t2);
    System.out.println(t3);
  }
}
