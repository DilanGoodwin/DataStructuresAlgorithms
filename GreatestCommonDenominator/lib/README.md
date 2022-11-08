# Code

```
package lib;

public class GreatestCommonDenominator{
  public static int GCD(int value1,int value2){
    int remainder=1;
    if(value1>value2){
      remainder=value1%value2;
    }else{
      remainder=value1;
    }
    if(remainder==0){
      return value2;
    }else{
      return GCD(value2,remainder);
    }
  }
}
```