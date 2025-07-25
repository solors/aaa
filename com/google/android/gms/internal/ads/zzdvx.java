package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.mbridge.msdk.foundation.entity.BaseCampaignUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdvx extends zzfqz {
    private final Context zza;
    private SensorManager zzb;
    private Sensor zzc;
    private long zzd;
    private int zze;
    private zzdvw zzf;
    private boolean zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdvx(Context context) {
        super("ShakeDetector", BaseCampaignUnit.JSON_KEY_ADS);
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfqz
    public final void zza(SensorEvent sensorEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziR)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0];
            float f2 = f / 9.80665f;
            float f3 = fArr[1] / 9.80665f;
            float f4 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f2 * f2) + (f3 * f3) + (f4 * f4))) >= ((Float) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziS)).floatValue()) {
                long currentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
                if (this.zzd + ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziT)).intValue() <= currentTimeMillis) {
                    if (this.zzd + ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziU)).intValue() < currentTimeMillis) {
                        this.zze = 0;
                    }
                    com.google.android.gms.ads.internal.util.zze.zza("Shake detected.");
                    this.zzd = currentTimeMillis;
                    int i = this.zze + 1;
                    this.zze = i;
                    zzdvw zzdvwVar = this.zzf;
                    if (zzdvwVar != null) {
                        if (i == ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziV)).intValue()) {
                            zzduv zzduvVar = (zzduv) zzdvwVar;
                            zzduvVar.zzh(new zzdus(zzduvVar), zzduu.GESTURE);
                        }
                    }
                }
            }
        }
    }

    public final void zzb() {
        synchronized (this) {
            if (this.zzg) {
                SensorManager sensorManager = this.zzb;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(this, this.zzc);
                    com.google.android.gms.ads.internal.util.zze.zza("Stopped listening for shake gestures.");
                }
                this.zzg = false;
            }
        }
    }

    public final void zzc() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziR)).booleanValue()) {
                return;
            }
            if (this.zzb == null) {
                SensorManager sensorManager2 = (SensorManager) this.zza.getSystemService("sensor");
                this.zzb = sensorManager2;
                if (sensorManager2 == null) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Shake detection failed to initialize. Failed to obtain accelerometer.");
                    return;
                }
                this.zzc = sensorManager2.getDefaultSensor(1);
            }
            if (!this.zzg && (sensorManager = this.zzb) != null && (sensor = this.zzc) != null) {
                sensorManager.registerListener(this, sensor, 2);
                this.zzd = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziT)).intValue();
                this.zzg = true;
                com.google.android.gms.ads.internal.util.zze.zza("Listening for shake gestures.");
            }
        }
    }

    public final void zzd(zzdvw zzdvwVar) {
        this.zzf = zzdvwVar;
    }
}
