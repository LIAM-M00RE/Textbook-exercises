public class simpleDotComTester {
    public static void main (String [] args){
        SimpleDotCom dot = new SimpleDotCom();
        int [] locations = {2,3,4};
        dot.setLocationCells(locations);

        String[] guesses = {"2", "3", "4", "5"};
        for (String userGuess : guesses) {
            String result = dot.checkYourself(userGuess);
           
        }
    }
}

