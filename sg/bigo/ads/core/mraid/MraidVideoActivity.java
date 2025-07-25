package sg.bigo.ads.core.mraid;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import sg.bigo.ads.C42750R;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.common.utils.C43822e;

/* loaded from: classes10.dex */
public class MraidVideoActivity extends Activity {

    /* renamed from: a */
    private MediaView f116118a;

    /* renamed from: b */
    private VideoController f116119b;

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("INTENT_VIDEO_URL");
        MediaView mediaView = new MediaView(this);
        this.f116118a = mediaView;
        mediaView.m5482a(stringExtra);
        this.f116119b = this.f116118a.getVideoController();
        this.f116118a.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.core.mraid.MraidVideoActivity.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (MraidVideoActivity.this.f116119b != null) {
                    if (MraidVideoActivity.this.f116119b.isPlaying()) {
                        MraidVideoActivity.this.f116119b.pause();
                    } else {
                        MraidVideoActivity.this.f116119b.play();
                    }
                }
            }
        });
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(C42750R.C42752drawable.bigo_ad_ic_close);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.core.mraid.MraidVideoActivity.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MraidVideoActivity.this.finish();
            }
        });
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        frameLayout.addView(this.f116118a, new FrameLayout.LayoutParams(-1, -2, 17));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C43822e.m4906a(this, 25), C43822e.m4906a(this, 25), 8388659);
        layoutParams.leftMargin = C43822e.m4906a(this, 15);
        layoutParams.topMargin = C43822e.m4906a(this, 25);
        frameLayout.addView(imageView, layoutParams);
        setContentView(frameLayout);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        VideoController videoController = this.f116119b;
        if (videoController != null) {
            videoController.pause();
        }
        MediaView mediaView = this.f116118a;
        if (mediaView != null) {
            mediaView.m5477c();
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        VideoController videoController = this.f116119b;
        if (videoController != null) {
            videoController.pause();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        VideoController videoController = this.f116119b;
        if (videoController != null) {
            videoController.play();
        }
    }

    /* renamed from: a */
    public static void m3571a(Context context, String str) {
        Intent intent = new Intent();
        intent.setClass(context, MraidVideoActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        intent.putExtra("INTENT_VIDEO_URL", str);
        context.startActivity(intent);
    }
}
