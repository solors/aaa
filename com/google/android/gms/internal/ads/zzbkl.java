package com.google.android.gms.internal.ads;

import androidx.annotation.RequiresApi;
import com.google.android.gms.ads.p381h5.OnH5AdsEventListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
@RequiresApi(api = 21)
/* loaded from: classes5.dex */
public final class zzbkl extends zzbkn {
    private final OnH5AdsEventListener zza;

    public zzbkl(OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbko
    public final void zzb(String str) {
        this.zza.onH5AdsEvent(str);
    }
}
