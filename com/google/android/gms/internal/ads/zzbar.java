package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbar {
    private ScheduledFuture zza = null;
    private final Runnable zzb = new zzban(this);
    private final Object zzc = new Object();
    @Nullable
    private zzbau zzd;
    @Nullable
    private Context zze;
    @Nullable
    private zzbax zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzh(zzbar zzbarVar) {
        synchronized (zzbarVar.zzc) {
            zzbau zzbauVar = zzbarVar.zzd;
            if (zzbauVar == null) {
                return;
            }
            if (zzbauVar.isConnected() || zzbarVar.zzd.isConnecting()) {
                zzbarVar.zzd.disconnect();
            }
            zzbarVar.zzd = null;
            zzbarVar.zzf = null;
            Binder.flushPendingCommands();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl() {
        synchronized (this.zzc) {
            if (this.zze != null && this.zzd == null) {
                zzbau zzd = zzd(new zzbap(this), new zzbaq(this));
                this.zzd = zzd;
                zzd.checkAvailabilityAndConnect();
            }
        }
    }

    public final long zza(zzbav zzbavVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return -2L;
            }
            if (this.zzd.zzp()) {
                try {
                    return this.zzf.zze(zzbavVar);
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to call into cache service.", e);
                }
            }
            return -2L;
        }
    }

    public final zzbas zzb(zzbav zzbavVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return new zzbas();
            }
            try {
                if (this.zzd.zzp()) {
                    return this.zzf.zzg(zzbavVar);
                }
                return this.zzf.zzf(zzbavVar);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to call into cache service.", e);
                return new zzbas();
            }
        }
    }

    @VisibleForTesting
    protected final synchronized zzbau zzd(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new zzbau(this.zze, com.google.android.gms.ads.internal.zzv.zzu().zzb(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    public final void zzi(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.zzc) {
            if (this.zze != null) {
                return;
            }
            this.zze = context.getApplicationContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzem)).booleanValue()) {
                zzl();
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzel)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzv.zzb().zzc(new zzbao(this));
                }
            }
        }
    }

    public final void zzj() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzen)).booleanValue()) {
            synchronized (this.zzc) {
                zzl();
                ScheduledFuture scheduledFuture = this.zza;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.zza = zzbzw.zzd.schedule(this.zzb, ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzeo)).longValue(), TimeUnit.MILLISECONDS);
            }
        }
    }
}
