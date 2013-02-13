package bbc.test.test;

/**
 * Created with IntelliJ IDEA.
 * User: evansa38
 * Date: 13/02/2013
 * Time: 14:15
 * To change this template use File | Settings | File Templates.
 */
public class Panel {



    private static final String[][] digits = new String[10][3];

    {
       digits[0] = new String[] {"._." , "|.|" , "|_|"};
       digits[1] = new String[] {"..." , "..|" , "..|"};
       digits[2] = new String[] {"._." , "._|" , "|_."};
       digits[3] = new String[] {"._." , "._|" , "._|"};
       digits[4] = new String[] {"..." , "|_|" , "..|"};
       digits[5] = new String[] {"._." , "|_." , "._|"};
       digits[6] = new String[] {"._." , "|_." , "|_|"};
       digits[7] = new String[] {"._." , "..|" , "..|"};
       digits[8] = new String[] {"._." , "|_|" , "|_|"};
       digits[9] = new String[] {"._." , "|_|" , "..|"};
    }

    public String display(int digit) {
        char[] digitAsChars = String.valueOf(digit).toCharArray();

        String result = "";

        for(int row = 0; row < 3; row++) {
            for (int i=0; i< digitAsChars.length; i++) {
                int num = Integer.parseInt(String.valueOf(digitAsChars[i]));
                result += digits[num][row];
                if(i < digitAsChars.length-1) result += " " ;
            }
            if (row < 2) {
                result += "\n";
            }
        }

        return result;

    }
}