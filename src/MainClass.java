
import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.RaspiPin;
/**
 *
 * @author haydut
 */
public class MainClass {

public static void main(String[] args) {
        System.out.println("<--Pi4J--> GPIO Blink Ornegi ....");
        final GpioController gpio = GpioFactory.getInstance();
        final GpioPinDigitalOutput led = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_07);
        //Blink için hazır fonksiyon var ^_^ 
        led.blink(500);
        System.out.println("<CTRL-C> ile kapatabilirsiniz..");
    }

}