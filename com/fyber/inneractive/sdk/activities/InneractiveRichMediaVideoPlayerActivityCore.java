package com.fyber.inneractive.sdk.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.VideoView;
import com.fyber.inneractive.sdk.C14169R;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes4.dex */
public class InneractiveRichMediaVideoPlayerActivityCore extends Activity {
    public static final String VIDEO_CURRENT_POSITION = "video_current_position";
    public static final String VIDEO_URL = "video_url";

    /* renamed from: a */
    public VideoView f26875a;

    /* renamed from: b */
    public int f26876b = 0;

    /* renamed from: c */
    public final C14190m f26877c = new C14190m(this);

    public static boolean startRichMediaIntent(Context context, String str) {
        Intent intent = new Intent(context, InneractiveRichMediaVideoPlayerActivityCore.class);
        intent.setFlags(268435456);
        intent.putExtra("video_url", str);
        try {
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            IAlog.m76529a("Activity InneractiveRichMediaVideoPlayerActivityCore was not found. Did you declare it in your AndroidManifest.xml?", new Object[0]);
            return false;
        }
    }

    public void initWindowFeatures() {
        requestWindowFeature(1);
        getWindow().addFlags(1024);
        getWindow().addFlags(128);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        initWindowFeatures();
        super.onCreate(bundle);
        if (bundle != null) {
            this.f26876b = bundle.getInt(VIDEO_CURRENT_POSITION, 0);
        }
        setContentView(C14169R.C14173layout.ia_layout_rich_media_video);
        this.f26875a = (VideoView) findViewById(C14169R.C14172id.mraid_video_view);
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("video_url")) {
            str = intent.getStringExtra("video_url");
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            IAlog.m76529a("Error: video can not be played.", new Object[0]);
            finish();
        } else {
            this.f26875a.setVideoPath(str);
            this.f26875a.setOnCompletionListener(new C14192o(this));
            this.f26875a.setOnErrorListener(new C14193p(this));
            this.f26875a.setOnPreparedListener(this.f26877c);
        }
        findViewById(C14169R.C14172id.ia_iv_close_button).setOnClickListener(new View$OnClickListenerC14191n(this));
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f26876b = this.f26875a.getCurrentPosition();
        this.f26875a.pause();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        int currentPosition;
        super.onSaveInstanceState(bundle);
        VideoView videoView = this.f26875a;
        if (videoView == null) {
            currentPosition = 0;
        } else {
            currentPosition = videoView.getCurrentPosition();
        }
        bundle.putInt(VIDEO_CURRENT_POSITION, currentPosition);
    }
}
