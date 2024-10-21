package factory;

public class WindowsOperatingSystem extends OperatingSystem{

	public WindowsOperatingSystem(String version, String architecture) {
		super(version, architecture);
		// TODO Auto-generated constructor stub
	}
	private String version;
	private String architecture;
	@Override
	public void changeDir(String dir) {
		System.out.println("directory changed to"+dir+" in WindowsOperatingSystem");
	}
	@Override
	public void removeDir(String dir) {
		System.out.println("directory deleted in WindowsOperatingSystem");
	}
}
