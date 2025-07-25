package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbbd implements BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzbav zza;
    final /* synthetic */ zzcab zzb;
    final /* synthetic */ zzbbf zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbd(zzbbf zzbbfVar, zzbav zzbavVar, zzcab zzcabVar) {
        this.zza = zzbavVar;
        this.zzb = zzcabVar;
        this.zzc = zzbbfVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        Object obj;
        boolean z;
        final zzbau zzbauVar;
        obj = this.zzc.zzd;
        synchronized (obj) {
            zzbbf zzbbfVar = this.zzc;
            z = zzbbfVar.zzb;
            if (!z) {
                zzbbfVar.zzb = true;
                zzbauVar = this.zzc.zza;
                if (zzbauVar == null) {
                    return;
                }
                zzgcs zzgcsVar = zzbzw.zza;
                final zzbav zzbavVar = this.zza;
                final zzcab zzcabVar = this.zzb;
                final ListenableFuture zza = zzgcsVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbba
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbas zzf;
                        zzbbd zzbbdVar = zzbbd.this;
                        zzbau zzbauVar2 = zzbauVar;
                        zzcab zzcabVar2 = zzcabVar;
                        try {
                            zzbax zzq = zzbauVar2.zzq();
                            boolean zzp = zzbauVar2.zzp();
                            zzbav zzbavVar2 = zzbavVar;
                            if (zzp) {
                                zzf = zzq.zzg(zzbavVar2);
                            } else {
                                zzf = zzq.zzf(zzbavVar2);
                            }
                            if (!zzf.zze()) {
                                zzcabVar2.zzd(new RuntimeException("No entry contents."));
                                zzbbf.zze(zzbbdVar.zzc);
                                return;
                            }
                            zzbbc zzbbcVar = new zzbbc(zzbbdVar, zzf.zzc(), 1);
                            int read = zzbbcVar.read();
                            if (read != -1) {
                                zzbbcVar.unread(read);
                                zzcabVar2.zzc(zzbbh.zzb(zzbbcVar, zzf.zzd(), zzf.zzg(), zzf.zza(), zzf.zzf()));
                                return;
                            }
                            throw new IOException("Unable to read from cache.");
                        } catch (RemoteException | IOException e) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to obtain a cache service instance.", e);
                            zzcabVar2.zzd(e);
                            zzbbf.zze(zzbbdVar.zzc);
                        }
                    }
                });
                final zzcab zzcabVar2 = this.zzb;
                zzcabVar2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbbb
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (zzcab.this.isCancelled()) {
                            zza.cancel(true);
                        }
                    }
                }, zzbzw.zzg);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}
