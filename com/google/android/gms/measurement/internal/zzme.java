package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.MainThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzmi;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzme<T extends Context & zzmi> {
    private final T zza;

    public zzme(T t) {
        Preconditions.checkNotNull(t);
        this.zza = t;
    }

    private final zzfw zzc() {
        return zzhj.zza(this.zza, null, null).zzj();
    }

    @MainThread
    public final int zza(final Intent intent, int i, final int i2) {
        final zzfw zzj = zzhj.zza(this.zza, null, null).zzj();
        if (intent == null) {
            zzj.zzu().zza("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        zzj.zzp().zza("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            zza(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzmg
                @Override // java.lang.Runnable
                public final void run() {
                    zzme.this.zza(i2, zzj, intent);
                }
            });
        }
        return 2;
    }

    @MainThread
    public final void zzb() {
        zzhj.zza(this.zza, null, null).zzj().zzp().zza("Local AppMeasurementService is shutting down");
    }

    @MainThread
    public final boolean zzc(Intent intent) {
        if (intent == null) {
            zzc().zzg().zza("onUnbind called with null intent");
            return true;
        }
        zzc().zzp().zza("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    @MainThread
    public final void zzb(Intent intent) {
        if (intent == null) {
            zzc().zzg().zza("onRebind called with null intent");
            return;
        }
        zzc().zzp().zza("onRebind called. action", intent.getAction());
    }

    @MainThread
    public final IBinder zza(Intent intent) {
        if (intent == null) {
            zzc().zzg().zza("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new zzhn(zznc.zza(this.zza));
        }
        zzc().zzu().zza("onBind received unknown action", action);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(int i, zzfw zzfwVar, Intent intent) {
        if (this.zza.zza(i)) {
            zzfwVar.zzp().zza("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            zzc().zzp().zza("Completed wakeful intent.");
            this.zza.zza(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzfw zzfwVar, JobParameters jobParameters) {
        zzfwVar.zzp().zza("AppMeasurementJobService processed last upload request.");
        this.zza.zza(jobParameters, false);
    }

    @MainThread
    public final void zza() {
        zzhj.zza(this.zza, null, null).zzj().zzp().zza("Local AppMeasurementService is starting up");
    }

    private final void zza(Runnable runnable) {
        zznc zza = zznc.zza(this.zza);
        zza.zzl().zzb(new zzmf(this, zza, runnable));
    }

    @TargetApi(24)
    @MainThread
    public final boolean zza(final JobParameters jobParameters) {
        final zzfw zzj = zzhj.zza(this.zza, null, null).zzj();
        String string = jobParameters.getExtras().getString("action");
        zzj.zzp().zza("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            zza(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzmd
                @Override // java.lang.Runnable
                public final void run() {
                    zzme.this.zza(zzj, jobParameters);
                }
            });
            return true;
        }
        return true;
    }
}
