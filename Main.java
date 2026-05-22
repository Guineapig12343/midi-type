
import javax.sound.midi.MidiDevice;
import javax.sound.midi.MidiDeviceReceiver;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.*;
import javax.swing.JOptionPane;


public class Main {
    

    public static void main(String[] args) {
        
    
    System.out.println("hello world");
    /*JOptionPane.showConfirmDialog(null,"hey there");
    String name = JOptionPane.showInputDialog("what name sya it now bro");
    System.out.println("whats up "+name);*/
    MidiDevice.Info[] infos = MidiSystem.getMidiDeviceInfo();
    System.out.println(infos);

    int getMaxTransmitters;
    System.out.println(getMaxTransmitters);
    }
}
