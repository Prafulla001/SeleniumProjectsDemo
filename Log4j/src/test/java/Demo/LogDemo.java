package Demo;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.*;

public class LogDemo {
    public static void main(String[] agrs){
        Logger log = (Logger) LogManager.getLogger("LogDemo");
        log.fatal("for fatal type");
        log.error("for error type");
        log.warn("for warn type");
        log.info("for info type");
        log.debug("for debug type");
    }

}
