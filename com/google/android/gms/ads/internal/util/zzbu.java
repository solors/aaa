package com.google.android.gms.ads.internal.util;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes4.dex */
public final class zzbu {
    final Map zza = new ConcurrentHashMap();

    public zzbu() {
        new AtomicInteger(0);
    }

    public final Bitmap zza(Integer num) {
        return (Bitmap) this.zza.get(num);
    }
}
