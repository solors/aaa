package com.facebook.ads.redexgen.p370X;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.R2 */
/* loaded from: assets/audience_network.dex */
public class C12486R2 implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ C113718T A00;

    public C12486R2(C113718T c113718t) {
        this.A00 = c113718t;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        new Handler(Looper.getMainLooper()).post(new C12437QF(this, i));
    }
}
