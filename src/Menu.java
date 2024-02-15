import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

class Menu
{
    private enum PlaneTypes{
        AirbusA330, Boeing747, Boeing777,
        An24, Boeing737, AirbusA320
    }
    private enum WeekDay{
        Monday,Tuesday,Wednesday,
        Thursday,Friday,Saturday,Sunday
    }
    private int id = 0;
    List<Airlines> flights = new ArrayList<>();
    public void FlightsMaker()
    {
        Random random = new Random();
        for(int i =0; i<3; i++)
        {
            int randomTime = random.nextInt(0,23);
            int randomIndexPlaneType = random.nextInt(PlaneTypes.values().length);
            PlaneTypes planeType = PlaneTypes.values()[randomIndexPlaneType];
            int randomIndexWeekDay = random.nextInt(WeekDay.values().length);
            WeekDay weekDay = WeekDay.values()[randomIndexWeekDay];
            id += 1;
            flights.add(new Airlines(id,randomTime,planeType.toString(),weekDay.toString()));
        }
    }
    public void PrintFlights()
    {
        for (Airlines airlines:flights) {
            airlines.ShowDetails();
        }
    }

}