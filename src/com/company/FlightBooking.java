package com.company;

class FlightBooking //sub system class 1
{
    private String ongoingDate;
    private String returnDate;
    public FlightBooking(String ongoingDate, String returnDate) {
        super();
        this.ongoingDate = ongoingDate;
        this.returnDate = returnDate;
    }
    public void printFlightTicket()
    {
        System.out.println("Călătoria va începe "+ongoingDate);
        System.out.println("revenire "+returnDate);
    }
}
class HotelBooking //sub system class 1
{
    private String checkinDate;
    private String checkoutDate;

    public HotelBooking(String checkinDate, String checkoutDate) {
        super();
        this.checkinDate = checkinDate;
        this.checkoutDate = checkoutDate;
    }

    public void printHotelBookings()
    {
        System.out.println("Prima zi de rezervare: "+checkinDate);
        System.out.println("Ultima zi de rezervare: "+checkoutDate);
    }

}
class Facade
{
    private String journeyBegindate;
    private String journeyEndDate;
    public Facade(String journeyBegindate, String journeyEndDate) {
        super();
        this.journeyBegindate = journeyBegindate;
        this.journeyEndDate = journeyEndDate;
    }
    public void printJourneyTrip()
    {
        FlightBooking flight=new FlightBooking(journeyBegindate, journeyEndDate);
        flight.printFlightTicket();
        HotelBooking hotel= new HotelBooking(journeyBegindate, journeyEndDate);
        hotel.printHotelBookings();
    }
}


