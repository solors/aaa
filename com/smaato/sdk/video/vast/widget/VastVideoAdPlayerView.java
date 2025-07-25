package com.smaato.sdk.video.vast.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.smaato.sdk.core.AndroidsInjector;
import com.smaato.sdk.core.openmeasurement.ViewabilityVerificationResource;
import com.smaato.sdk.core.p573ui.AdContentView;
import com.smaato.sdk.core.p573ui.ProgressView;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.diinjection.Inject;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.video.C27640R;
import com.smaato.sdk.video.p576ad.VerificationResourceMapper;
import com.smaato.sdk.video.vast.model.Verification;
import com.smaato.sdk.video.vast.vastplayer.VideoPlayerView;
import com.smaato.sdk.video.vast.widget.element.VastElementView;
import java.util.List;
import java.util.Map;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public class VastVideoAdPlayerView extends AdContentView {
    @NonNull
    private final List<Verification> adVerifications;
    @NonNull
    private final VastElementView companionAdView;
    @NonNull
    private final VastElementView iconView;
    private FrameLayout layoutView;
    private final VerificationResourceMapper verificationResourceMapper;
    private VideoPlayerView videoPlayerView;
    @Inject
    private VideoPlayerViewFactory videoPlayerViewFactory;

    public VastVideoAdPlayerView(@NonNull Context context, @NonNull List<Verification> list) {
        super(context);
        this.verificationResourceMapper = new VerificationResourceMapper();
        AndroidsInjector.inject(this);
        View.inflate(context, C27640R.C27644layout.smaato_sdk_video_vast_video_player_view, this);
        initPlayerView(context);
        this.iconView = (VastElementView) findViewById(C27640R.C27643id.smaato_sdk_video_icon_view_id);
        this.companionAdView = (VastElementView) findViewById(C27640R.C27643id.smaato_sdk_video_companion_view_id);
        this.adVerifications = list;
    }

    /* renamed from: b */
    public static /* synthetic */ void m38524b(VastVideoAdPlayerView vastVideoAdPlayerView) {
        vastVideoAdPlayerView.lambda$showCompanion$0();
    }

    /* renamed from: c */
    public static /* synthetic */ void m38523c(VastVideoAdPlayerView vastVideoAdPlayerView, boolean z) {
        vastVideoAdPlayerView.lambda$showProgressIndicator$1(z);
    }

    /* renamed from: d */
    public static /* synthetic */ void m38522d(VastVideoAdPlayerView vastVideoAdPlayerView) {
        vastVideoAdPlayerView.lambda$hidePlayer$3();
    }

    private void initPlayerView(@NonNull Context context) {
        VideoPlayerView videoPlayerView = this.videoPlayerViewFactory.getVideoPlayerView(context);
        this.videoPlayerView = videoPlayerView;
        videoPlayerView.setId(C27640R.C27643id.smaato_sdk_video_video_player_view_id);
        FrameLayout frameLayout = (FrameLayout) findViewById(C27640R.C27643id.smaato_sdk_video_player_layout);
        this.layoutView = frameLayout;
        frameLayout.removeAllViews();
        this.layoutView.addView(this.videoPlayerView, new RelativeLayout.LayoutParams(-1, -1));
    }

    public /* synthetic */ void lambda$hidePlayer$3() {
        Objects.onNotNull(this.videoPlayerView, new Consumer() { // from class: com.smaato.sdk.video.vast.widget.e
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ((VideoPlayerView) obj).setVisibility(8);
            }
        });
    }

    public /* synthetic */ void lambda$showCompanion$0() {
        this.companionAdView.setVisibility(0);
        this.companionAdView.requestFocus();
    }

    public /* synthetic */ void lambda$showProgressIndicator$1(boolean z) {
        if (z) {
            addView(new ProgressView(getContext()));
        } else {
            removeView((ProgressView) findViewById(C27640R.C27643id.smaato_sdk_core_progress_view_id));
        }
    }

    @NonNull
    public VastElementView getCompanionAdView() {
        return this.companionAdView;
    }

    @NonNull
    public VastElementView getIconView() {
        return this.iconView;
    }

    @NonNull
    public VideoPlayerView getVideoPlayerView() {
        return this.videoPlayerView;
    }

    @Override // com.smaato.sdk.core.p573ui.AdContentView
    @NonNull
    public View getViewForOmTracking() {
        return this.videoPlayerView;
    }

    @Override // com.smaato.sdk.core.p573ui.AdContentView
    @NonNull
    public View getViewForVisibilityTracking() {
        return this.layoutView;
    }

    @Override // com.smaato.sdk.core.p573ui.AdContentView
    @NonNull
    public Map<String, List<ViewabilityVerificationResource>> getViewabilityVerificationResourcesMap() {
        return this.verificationResourceMapper.apply(this.adVerifications);
    }

    public void hidePlayer() {
        Threads.runOnUi(new Runnable() { // from class: com.smaato.sdk.video.vast.widget.d
            @Override // java.lang.Runnable
            public final void run() {
                VastVideoAdPlayerView.m38522d(VastVideoAdPlayerView.this);
            }
        });
    }

    public void showCompanion() {
        Threads.runOnUi(new Runnable() { // from class: com.smaato.sdk.video.vast.widget.g
            @Override // java.lang.Runnable
            public final void run() {
                VastVideoAdPlayerView.m38524b(VastVideoAdPlayerView.this);
            }
        });
    }

    @Override // com.smaato.sdk.core.p573ui.AdContentView
    @MainThread
    public void showProgressIndicator(final boolean z) {
        Threads.runOnUi(new Runnable() { // from class: com.smaato.sdk.video.vast.widget.f
            @Override // java.lang.Runnable
            public final void run() {
                VastVideoAdPlayerView.m38523c(VastVideoAdPlayerView.this, z);
            }
        });
    }

    @Override // com.smaato.sdk.core.p573ui.AdContentView
    public void destroy() {
    }

    @Override // com.smaato.sdk.core.p573ui.AdContentView
    public void startShowingView() {
    }
}
