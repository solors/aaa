package com.fyber.inneractive.sdk.activities;

import android.media.MediaPlayer;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.activities.m */
/* loaded from: classes4.dex */
public final class C14190m implements MediaPlayer.OnPreparedListener {

    /* renamed from: a */
    public final /* synthetic */ InneractiveRichMediaVideoPlayerActivityCore f26893a;

    public C14190m(InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore) {
        this.f26893a = inneractiveRichMediaVideoPlayerActivityCore;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        IAlog.m76529a("onPrepared", new Object[0]);
        InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore = this.f26893a;
        inneractiveRichMediaVideoPlayerActivityCore.f26875a.seekTo(inneractiveRichMediaVideoPlayerActivityCore.f26876b);
        this.f26893a.f26875a.start();
    }
}
