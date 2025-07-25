package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzden extends zzdbj {
    private boolean zzb;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzden(Set set) {
        super(set);
    }

    public final void zza() {
        zzq(new zzdbi() { // from class: com.google.android.gms.internal.ads.zzdek
            @Override // com.google.android.gms.internal.ads.zzdbi
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoEnd();
            }
        });
    }

    public final void zzb() {
        zzq(new zzdbi() { // from class: com.google.android.gms.internal.ads.zzdej
            @Override // com.google.android.gms.internal.ads.zzdbi
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPause();
            }
        });
    }

    public final synchronized void zzc() {
        if (!this.zzb) {
            zzq(new zzdel());
            this.zzb = true;
        }
        zzq(new zzdbi() { // from class: com.google.android.gms.internal.ads.zzdem
            @Override // com.google.android.gms.internal.ads.zzdbi
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPlay();
            }
        });
    }

    public final synchronized void zzd() {
        zzq(new zzdel());
        this.zzb = true;
    }
}
