package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.util.Comparator;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.r */
/* loaded from: classes4.dex */
public final class C15125r implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        float f = ((C15126s) obj).f29814c;
        float f2 = ((C15126s) obj2).f29814c;
        if (f < f2) {
            return -1;
        }
        if (f2 < f) {
            return 1;
        }
        return 0;
    }
}
