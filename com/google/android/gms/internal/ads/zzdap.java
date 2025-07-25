package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdap extends zzdbj implements zzbih {
    public zzdap(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final synchronized void zzb(final String str, final String str2) {
        zzq(new zzdbi() { // from class: com.google.android.gms.internal.ads.zzdao
            @Override // com.google.android.gms.internal.ads.zzdbi
            public final void zza(Object obj) {
                ((AppEventListener) obj).onAppEvent(str, str2);
            }
        });
    }
}
