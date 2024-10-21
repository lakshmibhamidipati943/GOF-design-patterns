package bridge;

public class YoutubeVideo extends Video{

	public YoutubeVideo(VideoProcessor processor) {
		super(processor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void paly(String videoFile) {
		// TODO Auto-generated method stub
		processor.process(videoFile);
	}

}
