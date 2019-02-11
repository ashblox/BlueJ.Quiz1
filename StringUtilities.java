
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue.concat(valueToBeAdded);
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        String reverse = "";
        for (int i = (valueToBeReversed.length() - 1); i >= 0; i--) {
            reverse += valueToBeReversed.charAt(i);
        }
        return reverse;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int middlePosition = 0;
        if (word.length() % 2 != 0) {
            middlePosition = Math.round(word.length() / 2);
        } else {
            System.out.println("The word has an even number of characters.");;
        }
        return word.charAt(middlePosition);
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        String characterRemoved = "";
        for (int i = 0; i < value.length(); i++){
            if (value.charAt(i) != charToRemove) {
                characterRemoved += value.charAt(i);
            }
        }
        return characterRemoved;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String [] wordsInSentence = sentence.split(" ");
        return wordsInSentence[wordsInSentence.length - 1];
    }
}
