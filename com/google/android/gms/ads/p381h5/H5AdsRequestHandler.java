package com.google.android.gms.ads.p381h5;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.ads.zzbkv;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* renamed from: com.google.android.gms.ads.h5.H5AdsRequestHandler */
/* loaded from: classes4.dex */
public final class H5AdsRequestHandler {
    private final zzbkv zza;

    public H5AdsRequestHandler(@NonNull Context context, @NonNull OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = new zzbkv(context, onH5AdsEventListener);
    }

    public void clearAdObjects() {
        this.zza.zza();
    }

    public boolean handleH5AdsRequest(@NonNull String str) {
        return this.zza.zzb(str);
    }

    public boolean shouldInterceptRequest(@NonNull String str) {
        return zzbkv.zzc(str);
    }
}
