public class Logger {
    private static Logger logger;
    protected int num = 1;

    public void log(String msg) {
        System.out.println("[" + num++ + "] " + msg);
    }

    private Logger() { }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }
}