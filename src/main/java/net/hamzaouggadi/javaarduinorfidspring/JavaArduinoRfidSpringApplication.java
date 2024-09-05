package net.hamzaouggadi.javaarduinorfidspring;

import com.fazecast.jSerialComm.SerialPort;
import net.hamzaouggadi.javaarduinorfidspring.utils.ApplicationReadyListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaArduinoRfidSpringApplication {

    public static void main(String[] args) {
        // Spring API Section
        SpringApplication.run(JavaArduinoRfidSpringApplication.class, args);

        if (ApplicationReadyListener.isStarted) {
            System.out.println("isStarted is True !");
        } else {
            System.out.println("isStarted is False !");
        }

        // Serial Communication Section
/*        SerialPort serialPort = SerialPort.getCommPort("");
        serialPort.setComPortParameters(9600, 8, 1, 0);
        serialPort.setComPortTimeouts(SerialPort.TIMEOUT_WRITE_BLOCKING, 0, 0);*/
    }

}
