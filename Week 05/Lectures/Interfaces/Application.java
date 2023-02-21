package Interfaces;

public class Application {

	public static void main(String[] args) {
		
		Logger logger = new FileLogger();
		
		logger.info("Hello");
		logger.warning("This is a warning");
		logger.error("This is an error!");
		logger.fatal("Fatal error");
		
		logger.close();

	}

}
