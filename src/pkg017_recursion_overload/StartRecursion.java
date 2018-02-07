/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg017_recursion_overload;

/**
 *
 * @author Michael C
 */
public class StartRecursion {
  //  static int startValue,stopValue;
        
        
       static int total=1;
    public static void main(String[] args) {
        int n = 10;
        
     //   recurseDown(n);
      //  recurseUp(n);
  /*      startValue = 0;
        stopValue=50;
        
        recurseEvens(startValue, stopValue);
        n = 2;
        startValue = 10;
        stopValue=30;
        total=0;
        recurseEvens(startValue, stopValue, n);
   */
  factorial(7);
    

    }
/**
 * 
 * @param n amount of times we recurse
 * 
 */
    private static void recurseDown(int n) {
      
       
       System.out.println("We need to do \"RecurseDown\" "+ n +" more times");
        n--;
    
        if(n>=0){
        recurseDown(n);
        };
        
        }
    /**
     * 
     * @param n how many times we are going to recurse
     * This method recurses itself n amount of times, counting up
     */
     private static void recurseUp(int n) {
       
       System.out.println("We have done \"RecurseUp\" "+ (11-n) +" times");
        n--;
    
        if(n>0){
        recurseUp(n);
        };
        
        }
     /**
      * Display all even numbers from startValue (inclusive) to stopValue (exclusive)
      * @param startValue Value that we start at for our recursion
      * @param stopValue  Value that we are trying to get to from our recursion
      */
     
     
     /*
     Overload definition: methods with the same name but different pass parameters.
     Thats how Java tells them apart 
     */
     private static void recurseEvens(int startValue, int stopValue) {
       if(startValue == 0){
       System.out.println(startValue);
       startValue=1;
       
       }
      if(total<stopValue){
          total++;
          if(total==stopValue){
          return;
          }
          if(total%2==0){
              System.out.println(total);
          }
          recurseEvens(startValue,stopValue);
      }
        }
     
     
          private static void recurseEvens(int startValue, int stopValue, int n) {
       if(startValue == 0){
      System.out.println(startValue);
      startValue=1;
       
       }
      if(total<stopValue){
          if(total==0){
          total=startValue;
          System.out.println(total);
          }
        
          else if(total != 0|| total!=startValue||total!=stopValue){
              total+=n;
            System.out.println(total);
          }
          
              
          recurseEvens(startValue,stopValue, n);
      }
        }

    private static void factorial(int i) {
       if(i!=0&&i>1){
           total = total * Math.abs(i);
           factorial(i-1);
       }
       else{
           System.out.println(total);
       }
    }
  
    
}// End of class
