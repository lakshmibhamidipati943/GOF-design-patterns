package bridge;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Video youtubeVideo = new YoutubeVideo(new HDProcessor());
		youtubeVideo.paly("abc.mp4");
		Video netflixVideo=new NetflixVideo(new UHD4KProcessor());
		netflixVideo.paly("abc.mp4");
	}

}
