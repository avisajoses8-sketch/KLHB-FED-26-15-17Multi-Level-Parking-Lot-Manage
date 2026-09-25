import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class javaprojectparttwo {

    // Parking lot structure parameters
    private static final int LEVELS = 3;
    private static final int SLOTS_PER_LEVEL = 5;

    // Arrays to store parking slot details
    private static String[][] vehicleNumber = new String[LEVELS][SLOTS_PER_LEVEL];
    private static String[][] vehicleType = new String[LEVELS][SLOTS_PER_LEVEL];
    private static long[][] entryTime = new long[LEVELS][SLOTS_PER_LEVEL]; // Entry timestamp in milliseconds

    private static final String DATA_FILE = "parking_records.txt";
