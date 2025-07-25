package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzdnj implements zzbjp {
    final /* synthetic */ zzdnl zza;
    private final WeakReference zzb;
    private final String zzc;
    private final zzbjp zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdnj(zzdnl zzdnlVar, WeakReference weakReference, String str, zzbjp zzbjpVar, zzdnk zzdnkVar) {
        this.zza = zzdnlVar;
        this.zzb = weakReference;
        this.zzc = str;
        this.zzd = zzbjpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object obj, Map map) {
        Object obj2 = this.zzb.get();
        if (obj2 == null) {
            this.zza.zzn(this.zzc, this);
        } else {
            this.zzd.zza(obj2, map);
        }
    }
}
