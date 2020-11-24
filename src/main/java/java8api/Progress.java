package java8api;

import java.time.Duration;

public class Progress {
    private Duration stduyDuration;

    private boolean finished;

    public Duration getStduyDuration() {
        return stduyDuration;
    }

    public void setStduyDuration(Duration stduyDuration) {
        this.stduyDuration = stduyDuration;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }
}
