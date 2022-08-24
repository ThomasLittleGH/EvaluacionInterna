package planernutricional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class machineID {

    private final String OS = System.getProperty("os.name").toLowerCase();
    public String ID;
    
    public void identificarOS() throws IOException, InterruptedException {
        System.out.println("OS: " + OS);
        if (OS.contains("win")) {
            
            String command = "wmic csproduct get UUID";
            StringBuffer output = new StringBuffer();

            Process SerNumProcess = Runtime.getRuntime().exec(command);
            BufferedReader sNumReader = new BufferedReader(new InputStreamReader(SerNumProcess.getInputStream()));

            String line = "";
            while ((line = sNumReader.readLine()) != null) {
                output.append(line + "\n");
            }
            ID = output.toString().substring(output.indexOf("\n"), output.length()).trim();;
            System.out.println(ID);
            return;
        }
        
        if (OS.contains("mac")) {
            
            String command = "system_profiler SPHardwareDataType | awk '/UUID/ { print $3; }'";

            StringBuffer output = new StringBuffer();

            Process SerNumProcess = Runtime.getRuntime().exec(command);

            BufferedReader sNumReader = new BufferedReader(new InputStreamReader(SerNumProcess.getInputStream()));

            String line = "";

            while ((line = sNumReader.readLine()) != null) {
                output.append(line + "\n");
            }

            ID = output.toString().substring(output.indexOf("UUID: "), output.length()).replace("UUID: ", "").trim();

            SerNumProcess.waitFor();

            sNumReader.close();
            
            System.out.println(ID);
            return;
        }
        
        System.out.println("NO SUPPORT FOR SYSTEMS OTHER THAN WINDOWS AND MAC OS, SORRY!");
        System.exit(0);
    }
    
    public Boolean checkSameOS(String id){
        return ID.equals(id);
    }
}
