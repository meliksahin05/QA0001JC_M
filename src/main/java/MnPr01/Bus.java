package MnPr01;

import java.util.ArrayList;
import java.util.List;

public class Bus {


    //number of seats, busNo

    //1) create busNumber variable

    public String busNum;

    //3 create e object from bus class into Ticket reservation class

    public List<String> seats = new ArrayList<>();



    public Bus(String busNum){

        this.busNum = busNum;

        for (int i = 1; i <33 ; i++) {

            this.seats.add(String.valueOf(i));


        }


    }
}
