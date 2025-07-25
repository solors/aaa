package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdxy extends zzdxs {
    private String zzg;
    private int zzh = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdxy(Context context) {
        this.zzf = new zzbup(context, com.google.android.gms.ads.internal.zzv.zzu().zzb(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        zzbvc zzdxqVar;
        zzbvc zzdxqVar2;
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    int i = this.zzh;
                    if (i == 2) {
                        zzbuy zzp = this.zzf.zzp();
                        zzbvk zzbvkVar = this.zze;
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmM)).booleanValue()) {
                            zzdxqVar2 = new zzdxr(this.zza, this.zze);
                        } else {
                            zzdxqVar2 = new zzdxq(this);
                        }
                        zzp.zze(zzbvkVar, zzdxqVar2);
                    } else if (i == 3) {
                        zzbuy zzp2 = this.zzf.zzp();
                        String str = this.zzg;
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmM)).booleanValue()) {
                            zzdxqVar = new zzdxr(this.zza, this.zze);
                        } else {
                            zzdxqVar = new zzdxq(this);
                        }
                        zzp2.zzh(str, zzdxqVar);
                    } else {
                        this.zza.zzd(new zzdyh(1));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zzd(new zzdyh(1));
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                    this.zza.zzd(new zzdyh(1));
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdxs, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        com.google.android.gms.ads.internal.util.client.zzo.zze("Cannot connect to remote service, fallback to local instance.");
        this.zza.zzd(new zzdyh(1));
    }

    public final ListenableFuture zza(zzbvk zzbvkVar) {
        synchronized (this.zzb) {
            int i = this.zzh;
            if (i != 1 && i != 2) {
                return zzgch.zzg(new zzdyh(2));
            } else if (this.zzc) {
                return this.zza;
            } else {
                this.zzh = 2;
                this.zzc = true;
                this.zze = zzbvkVar;
                this.zzf.checkAvailabilityAndConnect();
                this.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxw
                    {
                        zzdxy.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdxy.this.zzb();
                    }
                }, zzbzw.zzg);
                return this.zza;
            }
        }
    }

    public final ListenableFuture zzd(String str) {
        synchronized (this.zzb) {
            int i = this.zzh;
            if (i != 1 && i != 3) {
                return zzgch.zzg(new zzdyh(2));
            } else if (this.zzc) {
                return this.zza;
            } else {
                this.zzh = 3;
                this.zzc = true;
                this.zzg = str;
                this.zzf.checkAvailabilityAndConnect();
                this.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxx
                    {
                        zzdxy.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdxy.this.zzb();
                    }
                }, zzbzw.zzg);
                return this.zza;
            }
        }
    }
}
