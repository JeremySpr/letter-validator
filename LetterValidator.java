
/**
 * This class validates if every letter of the alphabet is used in a user-defined sentence.
 *
 * @Jeremy Sprader
 * @02/24/22
 */
public class LetterValidator
{
    // Defines usage of user input
    public static void main(String[] args) {
        String fullStatement = String.join(" ",args) ;
        String[] validatorArray = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"}  ;
        int pass = 0 ;
        // Validates letters
            for (String letter : validatorArray) {
                int charValidator = fullStatement.indexOf(letter) ;
                    if (charValidator == -1) {
                        System.out.println("\"" + letter + "\"" + " is missing from this statement") ; 
                        pass = (pass + 1) ;
                }
                    else{ 
                        if (letter == "z" && pass == 0) { 
                        System.out.println("Congrats! \"" + fullStatement + "\" contains every letter of the alphabet!");
                        }
            }
        }
    }
}
