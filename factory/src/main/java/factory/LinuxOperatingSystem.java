package factory;

public class LinuxOperatingSystem extends OperatingSystem{

	public LinuxOperatingSystem(String version, String architecture) {
		super(version, architecture);
		// TODO Auto-generated constructor stub
	}
	private String version;
	private String architecture;
	@Override
	public void changeDir(String dir) {
		System.out.println("directory changed to"+dir+" in LinuxOperatingSystem");
	}
	@Override
	public void removeDir(String dir) {
		System.out.println("directory deleted in LinuxOperatingSystem");
	}
}
