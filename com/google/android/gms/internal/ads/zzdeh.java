package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdeh extends zzdbj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdeh(Set set) {
        super(set);
    }

    public final synchronized void zza(@Nullable final com.google.android.gms.ads.nonagon.signalgeneration.zzbk zzbkVar) {
        zzq(new zzdbi() { // from class: com.google.android.gms.internal.ads.zzdef
            @Override // com.google.android.gms.internal.ads.zzdbi
            public final void zza(Object obj) {
                ((zzdee) obj).zze(com.google.android.gms.ads.nonagon.signalgeneration.zzbk.this);
            }
        });
    }

    public final synchronized void zzb(@Nullable final String str) {
        zzq(new zzdbi() { // from class: com.google.android.gms.internal.ads.zzdeg
            @Override // com.google.android.gms.internal.ads.zzdbi
            public final void zza(Object obj) {
                ((zzdee) obj).zzf(str);
            }
        });
    }
}
