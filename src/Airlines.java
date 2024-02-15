class Airlines
{
    private int flightNumber;
    private int departureTime;
    private String planeType;
    private String weekDay;

    public Airlines(int flightNumber, int departureTime, String planeType, String weekDay)
    {
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
        this.planeType = planeType;
        this.weekDay = weekDay;
    }

    public void ShowDetails()
    {
        System.out.println
                (
                "Flight Number: " + flightNumber + '\n' +
                "Departure Time: " + departureTime + '\n' +
                "Plane Type: " + planeType + '\n' +
                "Week Day: " + weekDay + '\n'
                );
    }
}