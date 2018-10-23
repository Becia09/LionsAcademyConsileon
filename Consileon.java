public class Consileon {
	//https://codingbat.com/prob/p124620
    public int wordsCount(String[] words, int len) {

        int howManyWords = 0;
        for (String word : words)
        {
            int howManyLetters = 0;
            for (char letter : word.toCharArray())
            {
                howManyLetters++;
                if (howManyLetters > len)
                {
                    break;
                }
            }
            if (howManyLetters == len)
            {
                howManyWords++;
            }
        }

        return howManyWords;
    }
	//https://codingbat.com/prob/p183837
    public String[] wordsFront(String[] words, int n) {
        String [] stringN = new String[n];
        for (int i = 0; i < n; i++)
        {
            stringN [i] = words [i];
        }

        return stringN;
    }
	//https://codingbat.com/prob/p120633
    public int greenTicket(int a, int b, int c) {

        if (a == b)
        {
            if (a == c)
            {
                return 20;
            }
            return 10;
        }

        if (a == c || b == c)
        {
            return 10;
        }

        return 0;
    }
}
