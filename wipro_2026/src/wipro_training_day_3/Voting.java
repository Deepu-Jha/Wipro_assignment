package wipro_training_day_3;

class Voting {
    private boolean hasVoted = false;

    public void vote() {
        if (!hasVoted) {
            System.out.println("Vote got");
            hasVoted = true;
        } else {
            System.out.println("Already voted!");
        }
    }

    public static void main(String[] args) {
        Voting v = new Voting();
        v.vote();  // first time
        v.vote();  // second time
    }
}