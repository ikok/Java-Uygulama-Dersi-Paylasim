public class Clock
{
	
	
	    private int hour;
		private int minute;
		private int second;
		private String name;	

		
	public Clock() {
            setHours(0);
            setMinutes(0);
            setSeconds(0);
	}

	
	public Clock(int hours, int minutes, int seconds) {
            setHours(hours);
            setMinutes(minutes);
            setSeconds(seconds);
            //setClock(hours,minutes,seconds);
	}
	
	
	
	public Clock(Clock clock) {
            setHours(clock.getHours());
            setMinutes(clock.getMinutes());
            setSeconds(clock.getSeconds());
            setName(clock.getName());
	}
	
	//--------
	
	public void setClock(int hours, int minutes, int seconds) {
            setHours(hours);
            setMinutes(minutes);
            setSeconds(seconds);
	}
	

	
	public String getClock() {
            String time;
            time = String.format("%2d:%2d:%2d", getHours(), getMinutes(), getSeconds());
            return time;
	}
	

	public void setHours(int hours) {
            if (hours > 23 || hours < 0)
                hours = 0;
            hour = hours;
	}
	
	
	
	public void setMinutes(int minutes) {
            if (minutes > 59 || minutes < 0)
                minutes = 0;
            minute = minutes;
	}
	
		
	public void setSeconds(int seconds) {
            if (seconds > 59 || seconds < 0)
                seconds = 0;
            second = seconds;
	}
	
	
	
	public void incrementHours(int hours) {
            hour = (hour + hours) % 24;
            if (hour < 0)//Check if user decrements hour
                hour += 24;
	}
	

	
	public void incrementMinutes(int minutes) {
            if (minute + minutes >= 60 || minute + minutes < 0)
                incrementHours((minute + minutes) / 60);
            minute = (minute + minutes) % 60;
            if (minute < 0)
                minute += 60;
	}
	
	
	public void incrementSeconds(int seconds) {
            if (second + seconds >= 60 || second + seconds < 0)
                incrementMinutes((second + seconds) / 60);
            second = (second + seconds) % 60;
            if (second < 0)
                second += 60;
	}
	

	public int getHours() {
            return hour;
	}
	
	
	
	public int getMinutes() {
            return minute;
	}
	
	public int getSeconds() {
            return second;
	}
	
	public void displayTime() {
            System.out.println(String.format("%s - %s", getName(), getClock()));
	}
	
	void setName(String nm) {
            name = nm;
	}
	
  
	public String getName() {
            return name;
	}
}
