import java.util.List;
import java.util.ArrayList;

final class RefTypeTest{
  public int intValue;
}

public final class SampleJava{
    static void copyTest(RefTypeTest sample){
      sample = new RefTypeTest();
      sample.intValue = 1;
    }
    
    static void copyTest2(RefTypeTest sample){
      sample.intValue = 2;
    }

    public static void main(String args[]){
      RefTypeTest sample = new RefTypeTest();

      sample.intValue = 999;
      copyTest(sample);
      System.out.println("copyTest() sample.intValue = " + sample.intValue);

      sample.intValue = 999;
      copyTest2(sample);
      System.out.println("copyTest() sample.intValue = " + sample.intValue);
    }

}