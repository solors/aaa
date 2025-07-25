package com.smaato.sdk.video.vast.vastplayer;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.model.Verification;
import com.smaato.sdk.video.vast.widget.VastVideoAdPlayerView;
import java.util.List;

/* loaded from: classes7.dex */
public class VastVideoPlayer {
    @NonNull
    private final VastVideoPlayerPresenter vastVideoPlayerPresenter;
    @NonNull
    private final VastVideoPlayerViewFactory vastVideoPlayerViewFactory;

    /* loaded from: classes7.dex */
    public interface EventListener {
        void onAdClick();

        void onAdError();

        void onClose();

        void onCompanionShown();

        void onComplete();

        void onFirstQuartile();

        void onMidPoint();

        void onMute();

        void onPaused();

        void onResumed();

        void onSkipped();

        void onStart(float f, float f2);

        void onThirdQuartile();

        void onUnmute();

        void onVideoImpression();
    }

    /* renamed from: com.smaato.sdk.video.vast.vastplayer.VastVideoPlayer$a */
    /* loaded from: classes7.dex */
    class View$OnAttachStateChangeListenerC27988a implements View.OnAttachStateChangeListener {

        /* renamed from: b */
        final /* synthetic */ VastVideoAdPlayerView f72849b;

        View$OnAttachStateChangeListenerC27988a(VastVideoAdPlayerView vastVideoAdPlayerView) {
            this.f72849b = vastVideoAdPlayerView;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NonNull View view) {
            VastVideoPlayer.this.vastVideoPlayerPresenter.attachView(this.f72849b);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NonNull View view) {
            view.removeOnAttachStateChangeListener(this);
            VastVideoPlayer.this.vastVideoPlayerPresenter.detachView();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public VastVideoPlayer(@NonNull VastVideoPlayerPresenter vastVideoPlayerPresenter, @NonNull VastVideoPlayerViewFactory vastVideoPlayerViewFactory) {
        this.vastVideoPlayerPresenter = (VastVideoPlayerPresenter) Objects.requireNonNull(vastVideoPlayerPresenter);
        this.vastVideoPlayerViewFactory = (VastVideoPlayerViewFactory) Objects.requireNonNull(vastVideoPlayerViewFactory);
    }

    @NonNull
    public VastVideoAdPlayerView getNewVideoPlayerView(@NonNull Context context, @NonNull List<Verification> list) {
        Objects.requireNonNull(context);
        VastVideoAdPlayerView vastVideoPlayerView = this.vastVideoPlayerViewFactory.getVastVideoPlayerView(context, list);
        vastVideoPlayerView.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC27988a(vastVideoPlayerView));
        return vastVideoPlayerView;
    }

    public void loaded() {
        this.vastVideoPlayerPresenter.loaded();
    }

    public void onCloseClicked() {
        this.vastVideoPlayerPresenter.onCloseClicked();
    }

    public void pause() {
        this.vastVideoPlayerPresenter.pause();
    }

    public void resume() {
        this.vastVideoPlayerPresenter.resume();
    }

    public void setEventListener(@NonNull EventListener eventListener) {
        this.vastVideoPlayerPresenter.getVideoPlayerModel().m38673A(eventListener);
    }
}
