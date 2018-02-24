package pro.nanosystems.youtubeplayer001;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

import java.util.ArrayList;

/**
 * Created by Sayyid Shaban on 13/02/2018.
 * E-mail: sayyid.ls@gmail.com
 */

public class VideoPlay extends AppCompatActivity implements View.OnClickListener {
    Button playVideo, playList, playMyActivity;
    ArrayList<String> videos;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_video);
        videos = new ArrayList<>();
        videos.add("1ooJxa83zBM");
        videos.add("Y-lBvI6u_hw");
        videos.add("bYAZ3NWVgtc");
        playVideo = findViewById(R.id.playVideo);
        playList = findViewById(R.id.playList);
        playMyActivity = findViewById(R.id.playMyActivity);
        playVideo.setOnClickListener(this);
        playList.setOnClickListener(this);
        playMyActivity.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()) {
            case R.id.playVideo:
                intent = YouTubeStandalonePlayer.
                        createVideoIntent(this,
                                YoutubeActivity.GOOGLE_API_KEY,
                                YoutubeActivity.YOUTUBE_VIDEO_ID, 0,
                                true, true);

                break;
            case R.id.playList:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this,
                        YoutubeActivity.GOOGLE_API_KEY,
                        YoutubeActivity.YOUTUBE_PLAYLIST_ID);
                break;
            case R.id.playMyActivity:
                intent = YouTubeStandalonePlayer.createVideosIntent(this,
                        YoutubeActivity.GOOGLE_API_KEY,videos);
                break;
        }
        if (intent != null) {
            startActivity(intent);
        }

    }
}
