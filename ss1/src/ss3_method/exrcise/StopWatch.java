package ss3_method.exrcise;

import java.util.Date;

public class StopWatch {
   private Date startTime, endTime;

    public StopWatch() {
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }
    public Date start(){
        return this.startTime = new Date();
    }
    public Date stop(){
        return this.endTime = new Date();
    }
    public long getElapsetTime(){
        return getEndTime().getTime()-getStartTime().getTime();
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (long i = 0; i < 9999; i++) {
            System.out.println(" ♥ ");
        }
        System.out.println("");
        stopWatch.stop();
        System.out.println(stopWatch.getElapsetTime());
    }
}
