import java.util.*;

class Program {

  public String tournamentWinner(
      ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
    HashMap<String, Integer> scores = new HashMap<String, Integer>();
    String currentWinner = "";
    scores.put(currentWinner, 0);
    for(int idx = 0; idx < competitions.size(); idx++) {
      ArrayList<String> competition = competitions.get(idx);
      int result = results.get(idx);
      String homeTeam = competition.get(0);
      String awayTeam = competition.get(1);
      String winnerTeam = result == 1 ? homeTeam : awayTeam;
      updateScore(winnerTeam, 3, scores);
      if(scores.get(winnerTeam) > scores.get(currentWinner)) {
        currentWinner = winnerTeam;
      }
    }
    return currentWinner;
  }
  public void updateScore(String team, int points, HashMap<String, Integer> scores) {
    if(!scores.containsKey(team)) {
      scores.put(team, 0);
    }
    scores.put(team, scores.get(team) + points);
  }
}
