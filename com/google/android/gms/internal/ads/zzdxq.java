package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdxq extends zzbvb {
    final /* synthetic */ zzdxs zza;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzdxq(zzdxs zzdxsVar) {
        this.zza = zzdxsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final void zze(com.google.android.gms.ads.internal.util.zzbb zzbbVar) {
        this.zza.zza.zzd(zzbbVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        zzdxs zzdxsVar = this.zza;
        zzdxsVar.zza.zzc(new zzdyi(autoCloseInputStream, zzdxsVar.zze));
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbvk zzbvkVar) {
        this.zza.zza.zzc(new zzdyi(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzbvkVar));
    }
}
