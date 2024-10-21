package bridge;

public class NetflixVideo extends Video{

	public NetflixVideo(VideoProcessor processor) {
		super(processor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void paly(String videoFile) {
		// TODO Auto-generated method stub
		processor.process(videoFile);
	}

}
