package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdxu extends zzdxs {
    private final Context zzg;
    private final Executor zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdxu(Context context, Executor executor) {
        this.zzg = context;
        this.zzh = executor;
        this.zzf = new zzbup(context, com.google.android.gms.ads.internal.zzv.zzu().zzb(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzbvc zzdxqVar;
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    zzbuy zzp = this.zzf.zzp();
                    zzbvk zzbvkVar = this.zze;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmM)).booleanValue()) {
                        zzdxqVar = new zzdxr(this.zza, this.zze);
                    } else {
                        zzdxqVar = new zzdxq(this);
                    }
                    zzp.zzf(zzbvkVar, zzdxqVar);
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zzd(new zzdyh(1));
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "RemoteSignalsClientTask.onConnected");
                    this.zza.zzd(new zzdyh(1));
                }
            }
        }
    }

    public final ListenableFuture zza(zzbvk zzbvkVar) {
        synchronized (this.zzb) {
            if (this.zzc) {
                return this.zza;
            }
            this.zzc = true;
            this.zze = zzbvkVar;
            this.zzf.checkAvailabilityAndConnect();
            this.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxt
                {
                    zzdxu.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzdxu.this.zzb();
                }
            }, zzbzw.zzg);
            zzdxs.zzc(this.zzg, this.zza, this.zzh);
            return this.zza;
        }
    }
}
