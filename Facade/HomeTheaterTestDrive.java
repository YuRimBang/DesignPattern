package hf.dp.Facade;

public class HomeTheaterTestDrive
{
    public static void main(String[] args)
    {
        MyHWInfo.printInfo();

        Amplifier amp = new Amplifier("Top-o-Line Amplifier");
        Tuner tuner = new Tuner("Top-o-Line Amplifier", amp);
        DvdPlayer dvd = new DvdPlayer("Top-o-Line Amplifier", amp);
        CdPlayer cd = new CdPlayer("Top-o-Line Amplifier", amp);
        Projector projector = new Projector("Top-o-Line Amplifier", dvd);
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd, projector, screen, lights, popper);

        homeTheater.watchMovie("Radiers of the Lost Ark");
        homeTheater.endMovie();
    }
}
