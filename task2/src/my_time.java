public class my_time {

    private long second = -1;
    private long minute = -1;
    private long hour = -1;

    public my_time() {
        long time = System.currentTimeMillis();
        setTime(time);
    }

    public my_time(long time) {
        setTime(time);
    }

    public my_time(long _hour, long _minute, long _second) {
        second = _second;
        minute = _minute;
        hour = _hour;
    }

    public void setTime(long elapseTime) {
        second = (elapseTime / 1000) % 60;
        minute = (elapseTime / 60000) % 60;
        hour = (elapseTime / 3600000) % 24;
    }

    public long getSeconds() {
        return second;
    }

    public long getMinutes() {
        return minute;
    }

    public long getHours() {
        return hour;
    }

    public String toString() {
        return getHours() + ":" + getMinutes() + ":" + getSeconds();
    }

}