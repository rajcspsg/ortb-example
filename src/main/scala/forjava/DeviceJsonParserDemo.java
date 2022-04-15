package forjava;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DeviceJsonParserDemo {
    public static void main(String[] args) throws IOException {

        ObjectMapper jsonMapperBidRequest  = new ObjectMapper();
        String dev = Files.readString(Paths.get("src/main/resources/device.json"));
        Device device = jsonMapperBidRequest.readValue(dev, Device.class);
        System.out.println(device);
    }
}
