package gr.aueb.cf.ch7;

/**
 * Compares two strings for lt (less than),
 * gt (greater than), eq (equal)
 */


public class StrBuilderApp {

    public static void main(String[] args) {
      String concatStr = "" ;
      long timeStart = 0L;
      long timeEnd = 0L;
      double sbElapseTime = 0.0;
      double elapseTime = 0.0;
      StringBuilder sb = new StringBuilder();
            timeStart = System.currentTimeMillis();
      for (int i = 1; i <= 50_000; i++) {
          concatStr = concatStr + 1;
      }
      timeEnd = System.currentTimeMillis();
      elapseTime = (timeEnd - timeStart) / 1000.0;

      timeStart = System.currentTimeMillis();
      for (int i = 1; i <= 50_000; i++){
          sb.append(i);
      }
      timeEnd = System.currentTimeMillis();
      sbElapseTime = (timeEnd - timeStart) / 1000.0;
        System.out.println("String elapsed time: " + elapseTime + "seconds");
        System.out.println("Sb Elapse time" + sbElapseTime + "seconds");
    }
}
