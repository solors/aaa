package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d */
/* loaded from: classes4.dex */
public final class C15056d extends AbstractC15059g {

    /* renamed from: c */
    public final AtomicReference f29601c = new AtomicReference(new C15055c());

    /* renamed from: a */
    public static boolean m77273a(int i, boolean z) {
        int i2 = i & 3;
        if (i2 != 3 && (!z || i2 != 2)) {
            return false;
        }
        return true;
    }
}
