package freebase.com.appzorba;

import android.app.ListActivity;
import android.os.Bundle;

import com.twitter.sdk.android.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.tweetui.TweetTimelineListAdapter;
import com.twitter.sdk.android.tweetui.UserTimeline;

import io.fabric.sdk.android.Fabric;

public class Fin extends ListActivity {




    private static final String TWITTER_KEY = "3yQtkOlLD7jV6b881fM5zx8cp";
    private static final String TWITTER_SECRET = "XusZzlvBK4Knv4vQbUzuRbWQ0PcT2UAQJg6UvLXIrFoOVs3zsR";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(!Fabric.isInitialized()) {
            TwitterAuthConfig authConfig = new TwitterAuthConfig(TWITTER_KEY, TWITTER_SECRET);
            Fabric.with(this, new Twitter(authConfig));
        }

        setContentView(R.layout.activity_fin);





        final UserTimeline userTimeline = new UserTimeline.Builder().screenName("Fin24").build();
        final TweetTimelineListAdapter adapter = new TweetTimelineListAdapter.Builder(this).setTimeline(userTimeline).build();
        setListAdapter(adapter);


    }
}
