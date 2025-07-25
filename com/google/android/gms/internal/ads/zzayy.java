package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzayy extends com.google.android.gms.ads.internal.client.zzcl {
    private final AppEventListener zza;

    public zzayy(AppEventListener appEventListener) {
        this.zza = appEventListener;
    }

    public final AppEventListener zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzc(String str, String str2) {
        this.zza.onAppEvent(str, str2);
    }
}
