package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzcwl extends zzdbj {
    private boolean zzb;

    public zzcwl(Set set) {
        super(set);
        this.zzb = false;
    }

    public final synchronized void zza() {
        if (!this.zzb) {
            zzq(new zzdbi() { // from class: com.google.android.gms.internal.ads.zzcwk
                @Override // com.google.android.gms.internal.ads.zzdbi
                public final void zza(Object obj) {
                    ((zzcwn) obj).zzr();
                }
            });
            this.zzb = true;
        }
    }
}
