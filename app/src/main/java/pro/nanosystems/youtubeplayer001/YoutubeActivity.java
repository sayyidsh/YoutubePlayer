package pro.nanosystems.youtubeplayer001;

import android.os.Bundle;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class YoutubeActivity extends YouTubeBaseActivity
        implements YouTubePlayer.OnInitializedListener{




    public static final String GOOGLE_API_KEY ="AIzaSyAsA9r0PSgbcVgIwaBCOmen62gz1VAHsQw";

    public static final String YOUTUBE_VIDEO_ID ="1ooJxa83zBM";

    public static final String YOUTUBE_PLAYLIST_ID="PLMFGVXWuJ1C5PQtl1V8sf4FGoVbor52px";

   YouTubePlayerView playerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);
        playerView = findViewById(R.id.youtubePlayer);
        playerView.initialize(GOOGLE_API_KEY, this);

    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

            youTubePlayer.cueVideo(YOUTUBE_VIDEO_ID);


    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

    }
}
