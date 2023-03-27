import java.util.Date;

public class StopWatch {
    private long startTime;
    private long endTime;
    public StopWatch(){
        this.startTime =new Date().getTime();
    }
    public long getStartTime(){
        return this.startTime;
    }
    public long getEndTime(){
        return this.endTime;
    }
    public void setStartTime(){
        this.startTime = new Date().getTime();
    }
    public void setEndTime(){
        this.endTime =  new Date().getTime();
    }
    public long getElapsedTime(){
        return this.endTime - this.startTime;
    }

}
