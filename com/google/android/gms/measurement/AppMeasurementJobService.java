package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.internal.zzme;
import com.google.android.gms.measurement.internal.zzmi;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
@TargetApi(24)
/* loaded from: classes5.dex */
public final class AppMeasurementJobService extends JobService implements zzmi {
    private zzme<AppMeasurementJobService> zza;

    @Override // android.app.Service
    @MainThread
    public final void onCreate() {
        super.onCreate();
        zza().zza();
    }

    @Override // android.app.Service
    @MainThread
    public final void onDestroy() {
        zza().zzb();
        super.onDestroy();
    }

    @Override // android.app.Service
    @MainThread
    public final void onRebind(@NonNull Intent intent) {
        zza().zzb(intent);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(@NonNull JobParameters jobParameters) {
        return zza().zza(jobParameters);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(@NonNull JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    @MainThread
    public final boolean onUnbind(@NonNull Intent intent) {
        return zza().zzc(intent);
    }

    @Override // com.google.android.gms.measurement.internal.zzmi
    public final void zza(@NonNull Intent intent) {
    }

    private final zzme<AppMeasurementJobService> zza() {
        if (this.zza == null) {
            this.zza = new zzme<>(this);
        }
        return this.zza;
    }

    @Override // com.google.android.gms.measurement.internal.zzmi
    @TargetApi(24)
    public final void zza(@NonNull JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    @Override // com.google.android.gms.measurement.internal.zzmi
    public final boolean zza(int i) {
        throw new UnsupportedOperationException();
    }
}
