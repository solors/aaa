package com.fyber.inneractive.sdk.activities;

import android.media.MediaPlayer;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.activities.p */
/* loaded from: classes4.dex */
public final class C14193p implements MediaPlayer.OnErrorListener {

    /* renamed from: a */
    public final /* synthetic */ InneractiveRichMediaVideoPlayerActivityCore f26896a;

    public C14193p(InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore) {
        this.f26896a = inneractiveRichMediaVideoPlayerActivityCore;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        IAlog.m76529a("Error: video can not be played.", new Object[0]);
        this.f26896a.finish();
        return false;
    }
}
