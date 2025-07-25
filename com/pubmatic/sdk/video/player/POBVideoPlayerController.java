package com.pubmatic.sdk.video.player;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.SeekBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.video.R$color;
import com.pubmatic.sdk.video.R$dimen;
import com.pubmatic.sdk.video.R$drawable;
import com.pubmatic.sdk.video.R$id;
import com.pubmatic.sdk.video.R$integer;

/* loaded from: classes7.dex */
public class POBVideoPlayerController extends POBPlayerController {
    @Nullable

    /* renamed from: a */
    private POBVideoPlayer f70967a;
    @NonNull

    /* renamed from: b */
    private SeekBar f70968b;
    @NonNull

    /* renamed from: c */
    private ImageButton f70969c;
    @NonNull

    /* renamed from: d */
    private Resources f70970d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.video.player.POBVideoPlayerController$a */
    /* loaded from: classes7.dex */
    public class View$OnTouchListenerC26859a implements View.OnTouchListener {
        View$OnTouchListenerC26859a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.video.player.POBVideoPlayerController$b */
    /* loaded from: classes7.dex */
    public class View$OnClickListenerC26860b implements View.OnClickListener {
        View$OnClickListenerC26860b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (POBVideoPlayerController.this.f70967a != null) {
                POBVideoPlayerController pOBVideoPlayerController = POBVideoPlayerController.this;
                pOBVideoPlayerController.m39996a(!pOBVideoPlayerController.f70967a.isMute());
                POBVideoPlayerController pOBVideoPlayerController2 = POBVideoPlayerController.this;
                pOBVideoPlayerController2.m39993b(pOBVideoPlayerController2.f70967a.isMute());
            }
        }
    }

    public POBVideoPlayerController(@NonNull Context context) {
        super(context);
        this.f70970d = getResources();
        this.f70968b = m39992c();
        this.f70969c = m39995b();
        m39999a();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: c */
    private SeekBar m39992c() {
        SeekBar seekBar = new SeekBar(getContext());
        seekBar.setPadding(0, 0, 0, POBUtils.convertDpToPixel(1));
        seekBar.setThumb(null);
        seekBar.getProgressDrawable().setColorFilter(this.f70970d.getColor(17170450), PorterDuff.Mode.SRC_ATOP);
        seekBar.setOnTouchListener(new View$OnTouchListenerC26859a());
        return seekBar;
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayerController, com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onProgressUpdate(int i) {
        this.f70968b.setProgress(i);
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayerController, com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onStart() {
        POBVideoPlayer pOBVideoPlayer = this.f70967a;
        if (pOBVideoPlayer != null) {
            this.f70968b.setMax(pOBVideoPlayer.getMediaDuration());
            m39993b(this.f70967a.isMute());
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayerController
    public void setVideoPlayerEvents(@NonNull POBVideoPlayer pOBVideoPlayer) {
        this.f70967a = pOBVideoPlayer;
    }

    /* renamed from: b */
    private ImageButton m39995b() {
        ImageButton imageButton = new ImageButton(getContext());
        imageButton.setId(R$id.pob_mute_btn);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(this.f70970d.getColor(R$color.pob_controls_background_color));
        gradientDrawable.setStroke(this.f70970d.getDimensionPixelOffset(R$dimen.pob_control_stroke_width), this.f70970d.getColor(R$color.pob_controls_stroke_color));
        gradientDrawable.setAlpha(this.f70970d.getInteger(R$integer.pob_controls_alpha));
        imageButton.setBackground(gradientDrawable);
        imageButton.setPadding(0, 0, 0, 0);
        imageButton.setImageResource(R$drawable.pob_ic_volume_up_black_24dp);
        imageButton.setOnClickListener(new View$OnClickListenerC26860b());
        return imageButton;
    }

    /* renamed from: a */
    private void m39999a() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.f70970d.getDimensionPixelOffset(R$dimen.pob_seek_bar_height));
        layoutParams.gravity = 80;
        layoutParams.leftMargin = this.f70970d.getDimensionPixelOffset(R$dimen.pob_seek_left_margin);
        layoutParams.rightMargin = this.f70970d.getDimensionPixelOffset(R$dimen.pob_seek_right_margin);
        addView(this.f70968b, layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(this.f70970d.getDimensionPixelOffset(R$dimen.pob_control_width), this.f70970d.getDimensionPixelOffset(R$dimen.pob_control_height));
        layoutParams2.gravity = 8388691;
        layoutParams2.bottomMargin = this.f70970d.getDimensionPixelOffset(R$dimen.pob_mute_button_bottom_margin);
        layoutParams2.leftMargin = this.f70970d.getDimensionPixelOffset(R$dimen.pob_mute_button_left_margin);
        addView(this.f70969c, layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m39996a(boolean z) {
        POBVideoPlayer pOBVideoPlayer = this.f70967a;
        if (pOBVideoPlayer != null) {
            if (z) {
                pOBVideoPlayer.mute();
            } else {
                pOBVideoPlayer.unMute();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m39993b(boolean z) {
        if (z) {
            this.f70969c.setImageResource(R$drawable.pob_ic_volume_off_black_24dp);
        } else {
            this.f70969c.setImageResource(R$drawable.pob_ic_volume_up_black_24dp);
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayerController, com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onPause() {
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayerController, com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onResume() {
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayerController, com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onMute(boolean z) {
    }
}
