package net.hamzaouggadi.javaarduinorfidspring.serialcomm;

import com.fazecast.jSerialComm.SerialPort;
import com.fazecast.jSerialComm.SerialPortDataListener;
import com.fazecast.jSerialComm.SerialPortEvent;

public class ComPortListener implements SerialPortDataListener {

    private static String bufferReadToString = "";
    private static final int cutOffASCII = 10;

    @Override
    public int getListeningEvents() {
        return SerialPort.LISTENING_EVENT_DATA_AVAILABLE;
    }

    @Override
    public void serialEvent(SerialPortEvent serialPortEvent) {
        byte[] buffer = new byte[serialPortEvent.getSerialPort().bytesAvailable()];
        serialPortEvent.getSerialPort().readBytes(buffer, buffer.length);
        String stringData = new String(buffer);
        bufferReadToString = bufferReadToString.concat(stringData);

        if ((bufferReadToString.indexOf(cutOffASCII) + 1) > 0) {
            System.out.println(bufferReadToString);
        }
    }
}
