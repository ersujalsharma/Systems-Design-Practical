package CricBuzz.ScoreUpdater;

import CricBuzz.Inning.BallDetails;

public interface ScoreUpdaterObserver {
    public void update(BallDetails ballDetails);
}
