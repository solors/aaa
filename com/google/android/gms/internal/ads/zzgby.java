package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public class zzgby extends zzgci {
    public static zzgby zzu(ListenableFuture listenableFuture) {
        if (listenableFuture instanceof zzgby) {
            return (zzgby) listenableFuture;
        }
        return new zzgbz(listenableFuture);
    }
}
