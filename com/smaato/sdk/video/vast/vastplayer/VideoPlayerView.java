package com.smaato.sdk.video.vast.vastplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.StubOnGestureListener;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.video.C27640R;
import com.smaato.sdk.video.vast.vastplayer.VideoPlayerView;
import com.smaato.sdk.video.vast.widget.VastSurfaceHolder;

/* loaded from: classes7.dex */
public abstract class VideoPlayerView extends FrameLayout {
    @NonNull
    private final ImageButton muteButton;
    @NonNull
    private final ImageButton skipButton;
    @NonNull
    private final TextView skipButtonCountDown;
    @NonNull
    private final View surfaceHolderView;
    @Nullable
    private VideoPlayerPresenter videoPlayerPresenter;
    @NonNull
    private final ProgressBar videoProgressBar;

    /* renamed from: com.smaato.sdk.video.vast.vastplayer.VideoPlayerView$a */
    /* loaded from: classes7.dex */
    public class C27996a extends StubOnGestureListener {
        C27996a() {
            VideoPlayerView.this = r1;
        }

        /* renamed from: b */
        public static /* synthetic */ void m38600b(MotionEvent motionEvent, VideoPlayerPresenter videoPlayerPresenter) {
            videoPlayerPresenter.m38596D(motionEvent.getX(), motionEvent.getY());
        }

        @Override // com.smaato.sdk.core.util.StubOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(@NonNull final MotionEvent motionEvent) {
            Objects.onNotNull(VideoPlayerView.this.videoPlayerPresenter, new Consumer() { // from class: com.smaato.sdk.video.vast.vastplayer.b3
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    VideoPlayerView.C27996a.m38600b(motionEvent, (VideoPlayerPresenter) obj);
                }
            });
            return true;
        }
    }

    public VideoPlayerView(Context context) {
        super(context);
        View.inflate(context, C27640R.C27644layout.smaato_sdk_video_player_view, this);
        this.surfaceHolderView = initSurfaceHolderView(context);
        this.videoProgressBar = initProgressView();
        this.muteButton = initMuteButton();
        this.skipButton = initSkipButton();
        this.skipButtonCountDown = initSkipButtonCountDown();
    }

    @NonNull
    private ImageButton initMuteButton() {
        ImageButton imageButton = (ImageButton) findViewById(C27640R.C27643id.smaato_sdk_video_mute_button);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.smaato.sdk.video.vast.vastplayer.g2
            {
                VideoPlayerView.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoPlayerView.this.lambda$initMuteButton$5(view);
            }
        });
        return imageButton;
    }

    @NonNull
    private ProgressBar initProgressView() {
        return (ProgressBar) findViewById(C27640R.C27643id.smaato_sdk_video_video_progress);
    }

    @NonNull
    private ImageButton initSkipButton() {
        ImageButton imageButton = (ImageButton) findViewById(C27640R.C27643id.smaato_sdk_video_skip_button);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.smaato.sdk.video.vast.vastplayer.f2
            {
                VideoPlayerView.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoPlayerView.this.lambda$initSkipButton$4(view);
            }
        });
        return imageButton;
    }

    @NonNull
    private TextView initSkipButtonCountDown() {
        TextView textView = (TextView) findViewById(C27640R.C27643id.smaato_sdk_video_skip_countdown);
        textView.setVisibility(0);
        return textView;
    }

    @NonNull
    @SuppressLint({"ClickableViewAccessibility"})
    private View initSurfaceHolderView(@NonNull Context context) {
        VastSurfaceHolder initVastSurfaceHolder = initVastSurfaceHolder(context);
        initVastSurfaceHolder.setOnSurfaceAvailableListener(new VastSurfaceHolder.OnSurfaceAvailableListener() { // from class: com.smaato.sdk.video.vast.vastplayer.v2
            {
                VideoPlayerView.this = this;
            }

            @Override // com.smaato.sdk.video.vast.widget.VastSurfaceHolder.OnSurfaceAvailableListener
            public final void onSurfaceAvailable(Surface surface, int i, int i2) {
                VideoPlayerView.this.onSurfaceAvailable(surface, i, i2);
            }
        });
        initVastSurfaceHolder.setOnSurfaceChangedListener(new VastSurfaceHolder.OnSurfaceChangedListener() { // from class: com.smaato.sdk.video.vast.vastplayer.w2
            {
                VideoPlayerView.this = this;
            }

            @Override // com.smaato.sdk.video.vast.widget.VastSurfaceHolder.OnSurfaceChangedListener
            public final void onSurfaceChanged(Surface surface, int i, int i2) {
                VideoPlayerView.this.onSurfaceChanged(surface, i, i2);
            }
        });
        initVastSurfaceHolder.setOnSurfaceDestroyedListener(new VastSurfaceHolder.OnSurfaceDestroyedListener() { // from class: com.smaato.sdk.video.vast.vastplayer.x2
            {
                VideoPlayerView.this = this;
            }

            @Override // com.smaato.sdk.video.vast.widget.VastSurfaceHolder.OnSurfaceDestroyedListener
            public final void onSurfaceDestroyed(Surface surface) {
                VideoPlayerView.this.onSurfaceDestroyed(surface);
            }
        });
        final GestureDetector gestureDetector = new GestureDetector(getContext(), new C27996a());
        View view = initVastSurfaceHolder.getView();
        view.setId(C27640R.C27643id.smaato_sdk_video_surface_holder_view_id);
        FrameLayout frameLayout = (FrameLayout) findViewById(C27640R.C27643id.smaato_sdk_video_player_surface_layout);
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setOnTouchListener(new View.OnTouchListener() { // from class: com.smaato.sdk.video.vast.vastplayer.y2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean lambda$initSurfaceHolderView$2;
                lambda$initSurfaceHolderView$2 = VideoPlayerView.lambda$initSurfaceHolderView$2(gestureDetector, view2, motionEvent);
                return lambda$initSurfaceHolderView$2;
            }
        });
        return view;
    }

    private static boolean isInLayoutJellyBeanMR2(@NonNull View view) {
        if (view.isInLayout()) {
            return true;
        }
        return false;
    }

    public /* synthetic */ void lambda$changeMuteIcon$1(boolean z) {
        int i;
        ImageButton imageButton = this.muteButton;
        if (z) {
            i = C27640R.C27642drawable.smaato_sdk_video_muted;
        } else {
            i = C27640R.C27642drawable.smaato_sdk_video_unmuted;
        }
        imageButton.setImageResource(i);
    }

    public /* synthetic */ void lambda$hideCountdownText$11() {
        if (this.skipButtonCountDown.getVisibility() == 0) {
            this.skipButtonCountDown.setVisibility(8);
        }
    }

    public /* synthetic */ void lambda$hideMuteButton$16() {
        if (this.muteButton.getVisibility() == 0) {
            this.muteButton.setVisibility(8);
        }
    }

    public /* synthetic */ void lambda$hideProgressBar$15() {
        if (this.videoProgressBar.getVisibility() == 0) {
            this.videoProgressBar.setVisibility(8);
        }
    }

    public /* synthetic */ void lambda$hideSkipButton$14() {
        if (this.skipButton.getVisibility() == 0) {
            this.skipButton.setVisibility(8);
        }
    }

    public /* synthetic */ void lambda$initMuteButton$5(View view) {
        Objects.onNotNull(this.videoPlayerPresenter, new Consumer() { // from class: com.smaato.sdk.video.vast.vastplayer.s2
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ((VideoPlayerPresenter) obj).m38567x();
            }
        });
    }

    public /* synthetic */ void lambda$initSkipButton$4(View view) {
        Objects.onNotNull(this.videoPlayerPresenter, new Consumer() { // from class: com.smaato.sdk.video.vast.vastplayer.i2
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ((VideoPlayerPresenter) obj).m38565z();
            }
        });
    }

    public static /* synthetic */ boolean lambda$initSurfaceHolderView$2(GestureDetector gestureDetector, View view, MotionEvent motionEvent) {
        gestureDetector.onTouchEvent(motionEvent);
        return true;
    }

    public /* synthetic */ void lambda$onMeasure$0(int i, int i2, VideoPlayerPresenter videoPlayerPresenter) {
        videoPlayerPresenter.m38595E(this, i, i2);
    }

    public /* synthetic */ void lambda$setSkipButtonSize$12(int i) {
        ViewGroup.LayoutParams layoutParams = this.skipButton.getLayoutParams();
        int applyDimension = (int) TypedValue.applyDimension(1, i, getContext().getResources().getDisplayMetrics());
        layoutParams.height = applyDimension;
        layoutParams.width = applyDimension;
        this.skipButton.setLayoutParams(layoutParams);
    }

    public /* synthetic */ void lambda$setVideoSize$3(int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.surfaceHolderView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        layoutParams.gravity = 17;
        this.surfaceHolderView.setLayoutParams(layoutParams);
    }

    public /* synthetic */ void lambda$showSkipButton$13() {
        boolean z;
        if (this.skipButton.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        this.skipButton.setAlpha(0.0f);
        this.skipButton.setVisibility(0);
        this.skipButton.animate().alpha(1.0f).setDuration(300L).start();
    }

    public /* synthetic */ void lambda$updateCountdownText$10(int i) {
        this.skipButtonCountDown.setText(String.valueOf(i));
    }

    public /* synthetic */ void lambda$updateProgressBar$9(long j, long j2) {
        this.videoProgressBar.setMax((int) j);
        this.videoProgressBar.setProgress((int) j2, true);
    }

    public void onSurfaceAvailable(@NonNull final Surface surface, int i, int i2) {
        Objects.onNotNull(this.videoPlayerPresenter, new Consumer() { // from class: com.smaato.sdk.video.vast.vastplayer.e2
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ((VideoPlayerPresenter) obj).m38599A(surface);
            }
        });
    }

    public void onSurfaceChanged(@NonNull final Surface surface, final int i, final int i2) {
        Objects.onNotNull(this.videoPlayerPresenter, new Consumer() { // from class: com.smaato.sdk.video.vast.vastplayer.o2
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ((VideoPlayerPresenter) obj).m38598B(surface, i, i2);
            }
        });
    }

    public void onSurfaceDestroyed(@NonNull final Surface surface) {
        Objects.onNotNull(this.videoPlayerPresenter, new Consumer() { // from class: com.smaato.sdk.video.vast.vastplayer.r2
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ((VideoPlayerPresenter) obj).m38597C(surface);
            }
        });
        surface.release();
    }

    public void changeMuteIcon(final boolean z) {
        Threads.runOnUi(new Runnable() { // from class: com.smaato.sdk.video.vast.vastplayer.j2
            {
                VideoPlayerView.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                VideoPlayerView.this.lambda$changeMuteIcon$1(z);
            }
        });
    }

    public void hideCountdownText() {
        Threads.runOnUi(new Runnable() { // from class: com.smaato.sdk.video.vast.vastplayer.l2
            {
                VideoPlayerView.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                VideoPlayerView.this.lambda$hideCountdownText$11();
            }
        });
    }

    public void hideMuteButton() {
        Threads.runOnUi(new Runnable() { // from class: com.smaato.sdk.video.vast.vastplayer.m2
            {
                VideoPlayerView.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                VideoPlayerView.this.lambda$hideMuteButton$16();
            }
        });
    }

    public void hideProgressBar() {
        Threads.runOnUi(new Runnable() { // from class: com.smaato.sdk.video.vast.vastplayer.u2
            {
                VideoPlayerView.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                VideoPlayerView.this.lambda$hideProgressBar$15();
            }
        });
    }

    public void hideSkipButton() {
        Threads.runOnUi(new Runnable() { // from class: com.smaato.sdk.video.vast.vastplayer.h2
            {
                VideoPlayerView.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                VideoPlayerView.this.lambda$hideSkipButton$14();
            }
        });
    }

    @NonNull
    protected abstract VastSurfaceHolder initVastSurfaceHolder(@NonNull Context context);

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        if (isInLayoutJellyBeanMR2(this)) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Objects.onNotNull(this.videoPlayerPresenter, new Consumer() { // from class: com.smaato.sdk.video.vast.vastplayer.p2
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ((VideoPlayerPresenter) obj).m38574q();
            }
        });
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        final int size = View.MeasureSpec.getSize(i);
        final int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        if (size > 0 && size2 > 0) {
            Objects.onNotNull(this.videoPlayerPresenter, new Consumer() { // from class: com.smaato.sdk.video.vast.vastplayer.z2
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    VideoPlayerView.this.lambda$onMeasure$0(size, size2, (VideoPlayerPresenter) obj);
                }
            });
        }
    }

    public void setSkipButtonSize(final int i) {
        Threads.runOnUi(new Runnable() { // from class: com.smaato.sdk.video.vast.vastplayer.n2
            {
                VideoPlayerView.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                VideoPlayerView.this.lambda$setSkipButtonSize$12(i);
            }
        });
    }

    public void setVideoPlayerPresenter(@Nullable VideoPlayerPresenter videoPlayerPresenter) {
        Threads.ensureMainThread();
        this.videoPlayerPresenter = videoPlayerPresenter;
    }

    public void setVideoSize(final int i, final int i2) {
        Threads.runOnUi(new Runnable() { // from class: com.smaato.sdk.video.vast.vastplayer.q2
            {
                VideoPlayerView.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                VideoPlayerView.this.lambda$setVideoSize$3(i, i2);
            }
        });
    }

    public void showSkipButton() {
        Threads.runOnUi(new Runnable() { // from class: com.smaato.sdk.video.vast.vastplayer.a3
            {
                VideoPlayerView.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                VideoPlayerView.this.lambda$showSkipButton$13();
            }
        });
    }

    public void updateCountdownText(final int i) {
        if (i > 0) {
            Threads.runOnUi(new Runnable() { // from class: com.smaato.sdk.video.vast.vastplayer.k2
                {
                    VideoPlayerView.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    VideoPlayerView.this.lambda$updateCountdownText$10(i);
                }
            });
        }
    }

    public void updateProgressBar(final long j, final long j2) {
        Threads.runOnUi(new Runnable() { // from class: com.smaato.sdk.video.vast.vastplayer.t2
            {
                VideoPlayerView.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                VideoPlayerView.this.lambda$updateProgressBar$9(j2, j);
            }
        });
    }
}
