package Main;

import controller.ControlRoom;
import view.Helicopter;
import view.MainController;
import view.Submarine;
import view.Tank;

public class Defence {
    public static void main(String[] args) {
        ControlRoom controlRoom=new ControlRoom();
        controlRoom.addObsever(new MainController(controlRoom));
        controlRoom.addObsever(new Helicopter(controlRoom));
        controlRoom.addObsever(new Tank(controlRoom));
        controlRoom.addObsever(new Submarine(controlRoom));
    }   
}
