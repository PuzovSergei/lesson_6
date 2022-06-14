import java.util.logging.*;

public class Main {
    private static final Logger logger = Logger.getLogger("");
    public static void main(String[] args) {
        /*logger.info("Info message");
        logger.warning("Error message");

        logger.log(Level.SEVERE, "SEVERE msg");
        logger.log(Level.INFO, "INFO msg");
        logger.log(Level.WARNING, "WARNING msg");
        logger.log(Level.CONFIG, "CONFIG msg");
        logger.log(Level.FINE, "FINE msg");
        logger.log(Level.ALL, "ALL msg");*/

        //Handler handler = new ConsoleHandler();

        logger.getHandlers()[0].setFilter(new Filter() {
            @Override
            public boolean isLoggable(LogRecord record) {
                return record.getMessage().startsWith("JAVA");
            }
        });

        logger.getHandlers()[0].setLevel(Level.WARNING);

        //logger.addHandler(handler);

        logger.log(Level.INFO, "JAVA msg1");
        logger.log(Level.INFO, "JAVA msg2");
        logger.log(Level.INFO, "JAVA msg3");
        logger.log(Level.INFO, "PYTHON msg1");
        logger.log(Level.WARNING, "JAVA ERROR");



    }
}
