package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreak;
import com.yandex.mobile.ads.instream.InstreamAdBreakEventListener;
import com.yandex.mobile.ads.instream.inroll.Inroll;
import com.yandex.mobile.ads.instream.pauseroll.Pauseroll;
import com.yandex.mobile.ads.instream.player.p625ad.InstreamAdPlayer;
import com.yandex.mobile.ads.instream.player.p625ad.InstreamAdView;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;
import java.util.List;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class bl0 implements Inroll, Pauseroll {
    @NotNull

    /* renamed from: a */
    private final sq0 f77352a;
    @NotNull

    /* renamed from: b */
    private final ng2 f77353b;
    @NotNull

    /* renamed from: c */
    private final xi0 f77354c;

    public /* synthetic */ bl0(sq0 sq0Var) {
        this(sq0Var, new ng2(), new xi0());
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    @NotNull
    public final InstreamAdBreak getInstreamAdBreak() {
        return new dg2(this.f77352a.m29568a());
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void invalidate() {
        this.f77352a.m29563b();
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void pause() {
        this.f77352a.m29562c();
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void play(@NotNull InstreamAdView instreamAdView) {
        Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
        this.f77352a.m29566a(instreamAdView);
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void prepare(@NotNull InstreamAdPlayer instreamAdPlayer) {
        Intrinsics.checkNotNullParameter(instreamAdPlayer, "instreamAdPlayer");
        this.f77352a.m29565a(new jg2(instreamAdPlayer, this.f77353b));
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void resume() {
        this.f77352a.m29561d();
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void setListener(@Nullable InstreamAdBreakEventListener instreamAdBreakEventListener) {
        eg2 eg2Var;
        if (instreamAdBreakEventListener != null) {
            eg2Var = new eg2(instreamAdBreakEventListener);
        } else {
            eg2Var = null;
        }
        this.f77352a.m29567a(eg2Var);
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void setVideoAdPlaybackListener(@Nullable VideoAdPlaybackListener videoAdPlaybackListener) {
        sh2 sh2Var;
        List m17161r;
        if (videoAdPlaybackListener != null) {
            sh2Var = new sh2(videoAdPlaybackListener, this.f77353b);
        } else {
            sh2Var = null;
        }
        m17161r = C37563v.m17161r(sh2Var, this.f77354c);
        this.f77352a.m29564a(new C32008zp(m17161r));
    }

    public bl0(@NotNull sq0 manualAdBreakPlaybackController, @NotNull ng2 videoAdAdapterCache, @NotNull xi0 updateCreativeUiElementsListener) {
        Intrinsics.checkNotNullParameter(manualAdBreakPlaybackController, "manualAdBreakPlaybackController");
        Intrinsics.checkNotNullParameter(videoAdAdapterCache, "videoAdAdapterCache");
        Intrinsics.checkNotNullParameter(updateCreativeUiElementsListener, "updateCreativeUiElementsListener");
        this.f77352a = manualAdBreakPlaybackController;
        this.f77353b = videoAdAdapterCache;
        this.f77354c = updateCreativeUiElementsListener;
    }
}
