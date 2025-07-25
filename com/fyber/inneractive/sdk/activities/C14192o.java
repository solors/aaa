package com.fyber.inneractive.sdk.activities;

import android.media.MediaPlayer;

/* renamed from: com.fyber.inneractive.sdk.activities.o */
/* loaded from: classes4.dex */
public final class C14192o implements MediaPlayer.OnCompletionListener {

    /* renamed from: a */
    public final /* synthetic */ InneractiveRichMediaVideoPlayerActivityCore f26895a;

    public C14192o(InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore) {
        this.f26895a = inneractiveRichMediaVideoPlayerActivityCore;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        this.f26895a.finish();
    }
}
