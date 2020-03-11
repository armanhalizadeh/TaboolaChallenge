import java.lang.Character;

public class Taboola {

   /** Takes in a string representation of an integer and converts it to an int
    *
    * @param s String representation of integer to be converted
    * @return int representation of the string entered
    *
    * PRE: string is a valid string representation of integer. No non numerical characters besides optional
    * '-' at beginning to denote negative.
    */
   public int convertToInt(String s) {
      int res = 0;
      boolean isNegative = false;
      for (int i = 0; i < s.length(); i++) {
         if (i == 0 && s.charAt(i) == '-') { //if first character is '-' set isNegative to true and ignore that char
            isNegative = true;
         } else {
            int digit = s.charAt(i) - '0'; //finds integer value by accessing char value
            res = (res * 10) + digit;
         }
      }
      if (isNegative) {return -1 * res;} //returns negative
      return res;
   }

   /** Checks a string for existence of a number
    *
    * @param s String to check
    * @return true if there exists a number, false if there doesn't
    */
   public boolean hasNumber(String s) {
      for (int i = 0; i < s.length(); i++) {
         if (Character.isDigit(s.charAt(i))) { //if the character is a number
            return true;
         }
      }
      return false;
   }
}
