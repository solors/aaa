package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzftn {
    private final Context zzb;
    private final zzfto zzc;
    private boolean zzf;
    private final Intent zzg;
    @Nullable
    private ServiceConnection zzi;
    @Nullable
    private IInterface zzj;
    private final List zze = new ArrayList();
    private final String zzd = "OverlayDisplayService";
    private final zzfvf zza = zzfvj.zza(new zzfvf("OverlayDisplayService") { // from class: com.google.android.gms.internal.ads.zzfte
        public final /* synthetic */ String zza = "OverlayDisplayService";

        @Override // com.google.android.gms.internal.ads.zzfvf
        public final Object zza() {
            HandlerThread handlerThread = new HandlerThread(this.zza, 10);
            handlerThread.start();
            return new Handler(handlerThread.getLooper());
        }
    });
    private final IBinder.DeathRecipient zzh = new IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.zzftf
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            zzftn.this.zzk();
        }
    };

    public zzftn(Context context, zzfto zzftoVar, String str, Intent intent, zzfss zzfssVar) {
        this.zzb = context;
        this.zzc = zzftoVar;
        this.zzg = intent;
    }

    public static /* bridge */ /* synthetic */ IBinder.DeathRecipient zza(zzftn zzftnVar) {
        return zzftnVar.zzh;
    }

    public static /* bridge */ /* synthetic */ IInterface zzb(zzftn zzftnVar) {
        return zzftnVar.zzj;
    }

    public static /* bridge */ /* synthetic */ zzfto zzd(zzftn zzftnVar) {
        return zzftnVar.zzc;
    }

    public static /* bridge */ /* synthetic */ List zze(zzftn zzftnVar) {
        return zzftnVar.zze;
    }

    public static /* bridge */ /* synthetic */ void zzf(zzftn zzftnVar, boolean z) {
        zzftnVar.zzf = false;
    }

    public static /* bridge */ /* synthetic */ void zzg(zzftn zzftnVar, IInterface iInterface) {
        zzftnVar.zzj = iInterface;
    }

    public final void zzo(final Runnable runnable) {
        ((Handler) this.zza.zza()).post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzftg
            @Override // java.lang.Runnable
            public final void run() {
                zzftn.this.zzl(runnable);
            }
        });
    }

    @Nullable
    public final IInterface zzc() {
        return this.zzj;
    }

    public final void zzi(final Runnable runnable) {
        zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfth
            @Override // java.lang.Runnable
            public final void run() {
                zzftn.this.zzj(runnable);
            }
        });
    }

    public final /* synthetic */ void zzj(Runnable runnable) {
        if (this.zzj == null && !this.zzf) {
            this.zzc.zzc("Initiate binding to the service.", new Object[0]);
            synchronized (this.zze) {
                this.zze.add(runnable);
            }
            zzftl zzftlVar = new zzftl(this, null);
            this.zzi = zzftlVar;
            this.zzf = true;
            if (!this.zzb.bindService(this.zzg, zzftlVar, 1)) {
                this.zzc.zzc("Failed to bind to the service.", new Object[0]);
                this.zzf = false;
                synchronized (this.zze) {
                    this.zze.clear();
                }
            }
        } else if (this.zzf) {
            this.zzc.zzc("Waiting to bind to the service.", new Object[0]);
            synchronized (this.zze) {
                this.zze.add(runnable);
            }
        } else {
            runnable.run();
        }
    }

    public final /* synthetic */ void zzk() {
        this.zzc.zzc("%s : Binder has died.", this.zzd);
        synchronized (this.zze) {
            this.zze.clear();
        }
    }

    public final /* synthetic */ void zzl(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e) {
            this.zzc.zza("error caused by ", e);
        }
    }

    public final /* synthetic */ void zzm() {
        if (this.zzj != null) {
            this.zzc.zzc("Unbind from service.", new Object[0]);
            Context context = this.zzb;
            ServiceConnection serviceConnection = this.zzi;
            serviceConnection.getClass();
            context.unbindService(serviceConnection);
            this.zzf = false;
            this.zzj = null;
            this.zzi = null;
            synchronized (this.zze) {
                this.zze.clear();
            }
        }
    }

    public final void zzn() {
        zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfti
            @Override // java.lang.Runnable
            public final void run() {
                zzftn.this.zzm();
            }
        });
    }
}
