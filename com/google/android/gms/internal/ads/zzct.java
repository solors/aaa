package com.google.android.gms.internal.ads;

import android.text.Spannable;
import android.text.style.RelativeSizeSpan;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzct {
    public static void zza(Spannable spannable, float f, int i, int i2, int i3) {
        RelativeSizeSpan[] relativeSizeSpanArr;
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) spannable.getSpans(i, i2, RelativeSizeSpan.class)) {
            if (spannable.getSpanStart(relativeSizeSpan) <= i && spannable.getSpanEnd(relativeSizeSpan) >= i2) {
                f *= relativeSizeSpan.getSizeChange();
            }
            zzc(spannable, relativeSizeSpan, i, i2, 33);
        }
        spannable.setSpan(new RelativeSizeSpan(f), i, i2, 33);
    }

    public static void zzb(Spannable spannable, Object obj, int i, int i2, int i3) {
        for (Object obj2 : spannable.getSpans(i, i2, obj.getClass())) {
            zzc(spannable, obj2, i, i2, 33);
        }
        spannable.setSpan(obj, i, i2, 33);
    }

    private static void zzc(Spannable spannable, Object obj, int i, int i2, int i3) {
        if (spannable.getSpanStart(obj) == i && spannable.getSpanEnd(obj) == i2 && spannable.getSpanFlags(obj) == 33) {
            spannable.removeSpan(obj);
        }
    }
}
