package Week_8.Day_53;

public class Pass_the_Pillow_2582 {
    /**
     * Determines the final position of the pillow after a specified time.
     *
     * @param totalParticipants the number of participants in the game.
     * @param totalTime the total time for which the pillow is passed.
     * @return the final position of the pillow after the specified time.
     */
    public int passThePillow(int totalParticipants, int totalTime) {
        // Compute the number of complete rounds that have been made
        int completeRounds = totalTime / (totalParticipants - 1);

        // Compute the remaining time after the complete rounds
        int remainingTime = totalTime % (totalParticipants - 1);

        // If the number of complete rounds is odd, the direction of passing is reversed
        // Since the passing starts with participant 1, the final position will be counted backwards
        // from the total number of participants
        if ((completeRounds & 1) == 1) {
            return totalParticipants - remainingTime;
        } else {
            // If the number of complete rounds is even, the final position will be counted forward
            // The '+1' is required to adjust the position to a 1-indexed based
            return remainingTime + 1;
        }
    }
}
