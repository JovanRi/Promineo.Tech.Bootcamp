package Interfaces;

public interface Logger {
	//Does not define any method implementation
	//we have to define the methods but not the bodies of what they do
	
	public void info(String info);
	public void warning(String warning);
	public void error(String error);
	public void fatal(String fatal);
	public void close();
	//void since it will simply log out some data, not return anything

}
