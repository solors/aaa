package com.pubmatic.sdk.webrendering.mraid;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.webrendering.POBUIUtil;
import com.pubmatic.sdk.webrendering.R$drawable;
import com.pubmatic.sdk.webrendering.R$id;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class POBVideoPlayerActivity extends Activity {
    public static final String ACTION_FINISH = "com.pubmatic.sdk.webrendering.mraid.POBVideoPlayerActivity.finish";
    public static final String ALLOW_ORIENTATION_KEY = "AllowOrientationChange";
    public static final String FORCE_ORIENTATION_KEY = "ForceOrientation";
    public static final String MSG_VIDEO_PLAYER_EMPTY_URL = "Can't launch video player due to null or empty value of URL";
    @Nullable

    /* renamed from: a */
    private static List<POBVideoPlayerActivityListener> f71204a;
    @Nullable

    /* renamed from: b */
    private MediaController f71205b;
    @Nullable

    /* renamed from: c */
    private VideoView f71206c;

    /* renamed from: d */
    private int f71207d;

    /* renamed from: e */
    private boolean f71208e;
    @Nullable

    /* renamed from: f */
    private BroadcastReceiver f71209f;

    /* renamed from: g */
    private int f71210g;

    /* loaded from: classes7.dex */
    public interface POBVideoPlayerActivityListener {
        void onDismiss();

        void onStart();
    }

    /* loaded from: classes7.dex */
    protected class POBVideoPlayerBroadcast extends BroadcastReceiver {
        protected POBVideoPlayerBroadcast() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null && POBVideoPlayerActivity.ACTION_FINISH.equals(intent.getAction())) {
                POBVideoPlayerActivity.this.finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.webrendering.mraid.POBVideoPlayerActivity$a */
    /* loaded from: classes7.dex */
    public class View$OnClickListenerC26919a implements View.OnClickListener {
        View$OnClickListenerC26919a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            POBVideoPlayerActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.webrendering.mraid.POBVideoPlayerActivity$b */
    /* loaded from: classes7.dex */
    public class C26920b implements MediaPlayer.OnCompletionListener {
        C26920b() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            POBVideoPlayerActivity.this.f71208e = true;
        }
    }

    /* renamed from: b */
    private void m39871b() {
        List<POBVideoPlayerActivityListener> list = f71204a;
        if (list != null) {
            for (POBVideoPlayerActivityListener pOBVideoPlayerActivityListener : list) {
                if (this.f71210g == pOBVideoPlayerActivityListener.hashCode()) {
                    pOBVideoPlayerActivityListener.onDismiss();
                    m39874a(pOBVideoPlayerActivityListener);
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    private void m39870c() {
        List<POBVideoPlayerActivityListener> list = f71204a;
        if (list != null) {
            for (POBVideoPlayerActivityListener pOBVideoPlayerActivityListener : list) {
                if (this.f71210g == pOBVideoPlayerActivityListener.hashCode()) {
                    pOBVideoPlayerActivityListener.onStart();
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    private void m39869d() {
        VideoView videoView = this.f71206c;
        if (videoView != null) {
            videoView.pause();
            this.f71207d = this.f71206c.getCurrentPosition();
            POBLog.debug("POBVideoPlayerActivity", "VideoView visibility is false. Seeked position =" + this.f71207d, new Object[0]);
            return;
        }
        POBLog.debug("POBVideoPlayerActivity", "Unable to pause video, VideoView not available.", new Object[0]);
    }

    /* renamed from: e */
    private void m39868e() {
        if (this.f71208e) {
            POBLog.debug("POBVideoPlayerActivity", "Video Ad is completed", new Object[0]);
            return;
        }
        VideoView videoView = this.f71206c;
        if (videoView != null) {
            if (videoView.isPlaying()) {
                this.f71206c.seekTo(this.f71207d);
                return;
            }
            POBLog.debug("POBVideoPlayerActivity", "VideoView visibility is false. Seeked position =" + this.f71207d, new Object[0]);
            return;
        }
        POBLog.debug("POBVideoPlayerActivity", "Unable to resume video, VideoView not available.", new Object[0]);
    }

    public static void startNewActivity(@NonNull Context context, @NonNull String str, @Nullable Bundle bundle, @NonNull POBVideoPlayerActivityListener pOBVideoPlayerActivityListener) {
        if (f71204a == null) {
            f71204a = new ArrayList();
        }
        f71204a.add(pOBVideoPlayerActivityListener);
        Intent intent = new Intent(context, POBVideoPlayerActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("URL", str);
        intent.putExtra("listener_hash_code", pOBVideoPlayerActivityListener.hashCode());
        intent.putExtra("bundle_extra", bundle);
        try {
            POBUtils.startActivity(context, intent);
        } catch (Exception e) {
            POBLog.warn("POBVideoPlayerActivity", "Error in starting video player activity. Error: %s", e.getMessage());
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        String str;
        boolean z;
        char c;
        super.onCreate(bundle);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("URL");
        if (POBUtils.isNullOrEmpty(stringExtra)) {
            POBLog.error("POBVideoPlayerActivity", MSG_VIDEO_PLAYER_EMPTY_URL, new Object[0]);
            finish();
        }
        Bundle bundleExtra = intent.getBundleExtra("bundle_extra");
        if (bundleExtra != null) {
            str = bundleExtra.getString(FORCE_ORIENTATION_KEY);
            z = bundleExtra.getBoolean(ALLOW_ORIENTATION_KEY, true);
        } else {
            str = null;
            z = true;
        }
        if (!z) {
            if (str == null) {
                str = "none";
            }
            switch (str.hashCode()) {
                case -1700437898:
                    if (str.equals("sensor_landscape")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -31410088:
                    if (str.equals("reverse_portrait")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 729267099:
                    if (str.equals("portrait")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1430647483:
                    if (str.equals("landscape")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    setRequestedOrientation(6);
                    break;
                case 1:
                    setRequestedOrientation(7);
                    break;
                case 2:
                    setRequestedOrientation(1);
                    break;
                case 3:
                    setRequestedOrientation(0);
                    break;
            }
        }
        setContentView(m39875a(m39872a(stringExtra), -1, -1));
        POBVideoPlayerBroadcast pOBVideoPlayerBroadcast = new POBVideoPlayerBroadcast();
        this.f71209f = pOBVideoPlayerBroadcast;
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                registerReceiver(pOBVideoPlayerBroadcast, new IntentFilter(ACTION_FINISH), 4);
            } else {
                registerReceiver(pOBVideoPlayerBroadcast, new IntentFilter(ACTION_FINISH));
            }
        } catch (Exception e) {
            POBLog.warn("POBVideoPlayerActivity", "Error in registering broadcast receiver. Error: %s", e.getMessage());
        }
        this.f71210g = getIntent().getIntExtra("listener_hash_code", 0);
        m39870c();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        m39876a();
        try {
            unregisterReceiver(this.f71209f);
        } catch (Exception e) {
            POBLog.warn("POBVideoPlayerActivity", "Error in unregistering broadcast receiver. Error: %s", e.getMessage());
        }
        this.f71209f = null;
        m39871b();
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        m39869d();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        m39868e();
    }

    /* renamed from: a */
    private void m39874a(@NonNull POBVideoPlayerActivityListener pOBVideoPlayerActivityListener) {
        List<POBVideoPlayerActivityListener> list = f71204a;
        if (list != null) {
            list.remove(pOBVideoPlayerActivityListener);
            if (f71204a.isEmpty()) {
                f71204a = null;
            }
        }
    }

    /* renamed from: a */
    private void m39876a() {
        VideoView videoView = this.f71206c;
        if (videoView != null) {
            videoView.suspend();
        }
        this.f71206c = null;
        this.f71205b = null;
    }

    @NonNull
    /* renamed from: a */
    private View m39875a(@Nullable View view, int i, int i2) {
        FrameLayout frameLayout = new FrameLayout(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2);
        layoutParams.gravity = 17;
        layoutParams.setMargins(0, 0, 0, 0);
        if (view != null) {
            frameLayout.addView(view, layoutParams);
        }
        ImageButton createSkipButton = POBUIUtil.createSkipButton(this, R$id.pob_close_btn, R$drawable.pob_ic_close_black_24dp);
        frameLayout.addView(createSkipButton);
        createSkipButton.setOnClickListener(new View$OnClickListenerC26919a());
        return frameLayout;
    }

    /* renamed from: a */
    private View m39872a(@NonNull String str) {
        this.f71206c = new VideoView(this);
        if (this.f71205b == null) {
            MediaController mediaController = new MediaController(this);
            this.f71205b = mediaController;
            mediaController.setMediaPlayer(this.f71206c);
        }
        this.f71206c.setMediaController(this.f71205b);
        this.f71205b.setAnchorView(this.f71206c);
        this.f71206c.setOnCompletionListener(new C26920b());
        this.f71206c.setVideoURI(Uri.parse(str));
        this.f71206c.start();
        return this.f71206c;
    }
}
