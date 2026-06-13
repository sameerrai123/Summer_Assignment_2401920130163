class MyCalendar {
    List<int[]> bookings;
    public MyCalendar() {
        bookings = new ArrayList<>();
    }
    
    public boolean book(int startTime, int endTime) {
        for(int[] booking : bookings){
            int s = booking[0];
            int e = booking[1];

            if(startTime < e && endTime > s){
                return false;
            }
        }
        bookings.add(new int[]{startTime , endTime});
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */
