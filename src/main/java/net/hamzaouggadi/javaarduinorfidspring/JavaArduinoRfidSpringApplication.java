package net.hamzaouggadi.javaarduinorfidspring;

import com.fazecast.jSerialComm.SerialPort;
import lombok.extern.slf4j.Slf4j;
import net.hamzaouggadi.javaarduinorfidspring.utils.ApplicationReadyListener;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;

@SpringBootApplication
@Slf4j
public class JavaArduinoRfidSpringApplication {

    private static final String PORT_NAME_MAC = "/dev/tty.usbmodem11201";

    public static void main(String[] args) {
        SpringApplication.run(JavaArduinoRfidSpringApplication.class, args);

        serialCommProcess();
    }

/*    @Bean
    CommandLineRunner startCommProcess() {
        return args -> {
            serialCommProcess();
        };
    }*/

    /**
     * USB port listening process
     */
    private static void serialCommProcess() {

        if (!checkIfSpringAppStarted()) {
            return;
        }

        SerialPort serialPort = SerialPort.getCommPort(PORT_NAME_MAC);
        serialPort.setComPortParameters(9600, 8, 1, 0);
        serialPort.setComPortTimeouts(SerialPort.TIMEOUT_WRITE_BLOCKING, 0, 0);

        if (!serialPort.openPort()) {
            log.warn("COM port not available !");
            return;
        }

        int blinks = 5;

        for (int i = blinks; i > 0; i--) {
            try {
                Thread.sleep(1500);
                serialPort.getOutputStream().write(1);
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    private static boolean checkIfSpringAppStarted() {
        return ApplicationReadyListener.isStarted;
    }

}
