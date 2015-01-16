package gregory.abc.utility;


public class Counter {
  private int count;
  private int fDelayValue;
  private int fMaxValue;
  private int fSetValue;

  public Counter() {
    this(25, 20, -10);
    // The default constructor instantiates fSetValue = 25, fMaxValue = 20, count = -10, fDelayValue = count
  }

  public Counter(int pSetValue, int pMaxValue, int pDelayValue) {
    fSetValue = pSetValue;
    fMaxValue = pMaxValue;
    fDelayValue = pDelayValue;
    count = pDelayValue;
  }

  public boolean isDelay() {
    return count > fDelayValue;
  }

  public boolean isEnable() {
    return count > 0;
  }

  public boolean isReady() {
    return count >= fMaxValue;
  }

  public int getCount() {
    return count;
  }

  public void setCount() {
    if(count > fDelayValue) {
      count--;
    }
  }

  public void setCount(boolean b) {
    count = b
        ? (isEnable() ? fMaxValue : fSetValue)
        : fDelayValue;
  }

  public void setCount(boolean b, int i) {
    if(b) {
      count = fMaxValue;
    } else if(count > i) {
      count = i;
    }
  }

  public void setCount(int i) {
    count = i;
  }

  public void setCountValue(int pSetValue, int pMaxValue, int pDelayValue) {
    fSetValue = pSetValue;
    fMaxValue = pMaxValue;
    fDelayValue = pDelayValue;
  }
}
