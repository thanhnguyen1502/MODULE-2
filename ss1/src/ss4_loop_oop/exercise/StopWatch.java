package ss4_loop_oop.exercise;

import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public StopWatch() {
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public Date start() {
        return this.startTime = new Date();
    }

    public Date stop() {
        return this.endTime = new Date();
    }

    public long getElapsetTime() {
        return getEndTime().getTime() - getStartTime().getTime();
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (long i = 0; i < 99999; i++) {
            for (int j = 0; j < i; j++) {

            }
        }
        stopWatch.stop();
        System.out.println(stopWatch.getElapsetTime());
    }
}
