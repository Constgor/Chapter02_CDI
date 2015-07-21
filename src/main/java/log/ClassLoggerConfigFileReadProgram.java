package log;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

class ClassWithOwnLogger_2{
    private final static Logger log = Logger.getLogger(ClassWithOwnLogger_2.class.getName());
    private static int counter = 0;

    public ClassWithOwnLogger_2(){
        log.log(Level.INFO, "->> Object of: " + getClass().getName() + " created!");
    }

    public int coutSelfCalls(String message){
        log.entering("examples.log.ClassWithOwnLogger_2", "coutSelfCalls", message);
        System.out.println(counter++ + " " + message);
        log.exiting("examples.log.ClassWithOwnLogger_2", "coutSelfCalls", counter);
        return counter;
    }
}

public class ClassLoggerConfigFileReadProgram {
    // читаем общие настройки системы логирования из файла
    static {

        try{
            FileInputStream fis = new FileInputStream("./003_Logging/loggerConfig.txt");
            LogManager.getLogManager().readConfiguration(fis);
        }
        catch (final IOException e)
        {   Logger.getAnonymousLogger().severe("Could not load default logging.properties file");
            Logger.getAnonymousLogger().severe(e.getMessage());
        }
    }
    public static void main(String[] args) {
        ClassWithOwnLogger_2 obj = new ClassWithOwnLogger_2();
        for (int i=0; i<5; i++)
            obj.coutSelfCalls("Hello!");
    }
}

