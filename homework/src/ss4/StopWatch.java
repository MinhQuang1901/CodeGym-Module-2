package ss4;

import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public StopWatch(){
        this.startTime = new Date();
        this.endTime = null;
    }

    public Date getStartTime(){
        return startTime;
    }
    public Date getEndTime(){
        return endTime;
    }

    public void start(){
        this.startTime = new Date();
        this.endTime = null;
    }

    public void stop(){
        this.endTime = new Date();
    }


    public long getElapsedTime(){
        if(endTime != null){
            return endTime.getTime() - startTime.getTime();
        } else {
            return new Date().getTime() - startTime.getTime();
        }
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        System.out.println("Start time: " + stopWatch.getStartTime());

        stopWatch.stop();

        System.out.println("End time " + stopWatch.getEndTime());

        System.out.println("Elapsed Time " + stopWatch.getElapsedTime());
    }
}
