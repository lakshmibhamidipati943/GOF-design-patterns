package factory;

public class OperatingSystemFactory {

	public static void main(String[] args) {
		getInstance("LINUX","3.0","3-tier");
	}
	private OperatingSystemFactory() {}
	public static OperatingSystem getInstance(String type, String version, String architecture) {
		switch(type) {
		case "WINDOWS":
			return new WindowsOperatingSystem(version,architecture);
		case "LINUX":
			return new LinuxOperatingSystem(version,architecture);
		default:
			throw new IllegalArgumentException("OS Not Supported");
		}		
	}
}
