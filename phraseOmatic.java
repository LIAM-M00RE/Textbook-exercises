public class phraseOmatic {
    public static void main (String[] args){
        //make 3 sets of strings to choose from
        String [] wordListOne = {
            "Synergize", "Leverage", "Streamline", "Innovate", "Optimize",
            "Disrupt", "Facilitate", "Transform", "Orchestrate", "Monetize"
        };

        String [] wordListTwo = {
            "cross-functional", "mission-critical", "value-added", "cloud-based",
            "AI-powered", "data-driven", "customer-centric", "scalable",
            "best-in-class", "blockchain-enabled"
        };

        String [] wordListThree = {
            "solutions", "paradigm shift", "ecosystem", "deliverables", "infrastructure",
            "KPIs", "brand equity", "touchpoints", "user engagement", "growth metrics"
        };
        //Find out num words in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //Generate 3 random number
        int rand1 = (int) (Math.random()*oneLength);
        int rand2 = (int) (Math.random()*twoLength);
        int rand3 = (int) (Math.random()*threeLength);

        //Phrase builder
        String Phrase =wordListOne[rand1]+ "" + wordListTwo[rand2]+ "" + wordListThree[rand3];

        System.out.println("what we need is " + Phrase);
    }
}