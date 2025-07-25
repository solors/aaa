package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.mbridge.msdk.foundation.entity.BaseCampaignUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzduh extends zzfqz {
    private final SensorManager zza;
    private final Sensor zzb;
    private float zzc;
    private Float zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private zzdug zzi;
    private boolean zzj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzduh(Context context) {
        super("FlickDetector", BaseCampaignUnit.JSON_KEY_ADS);
        this.zzc = 0.0f;
        this.zzd = Float.valueOf(0.0f);
        this.zze = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
        this.zzf = 0;
        this.zzg = false;
        this.zzh = false;
        this.zzi = null;
        this.zzj = false;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.zza = sensorManager;
        if (sensorManager != null) {
            this.zzb = sensorManager.getDefaultSensor(4);
        } else {
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqz
    public final void zza(SensorEvent sensorEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziW)).booleanValue()) {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
            if (this.zze + ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziY)).intValue() < currentTimeMillis) {
                this.zzf = 0;
                this.zze = currentTimeMillis;
                this.zzg = false;
                this.zzh = false;
                this.zzc = this.zzd.floatValue();
            }
            Float valueOf = Float.valueOf(this.zzd.floatValue() + (sensorEvent.values[1] * 4.0f));
            this.zzd = valueOf;
            float floatValue = valueOf.floatValue();
            float f = this.zzc;
            zzbcc zzbccVar = zzbcl.zziX;
            if (floatValue > f + ((Float) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).floatValue()) {
                this.zzc = this.zzd.floatValue();
                this.zzh = true;
            } else if (this.zzd.floatValue() < this.zzc - ((Float) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).floatValue()) {
                this.zzc = this.zzd.floatValue();
                this.zzg = true;
            }
            if (this.zzd.isInfinite()) {
                this.zzd = Float.valueOf(0.0f);
                this.zzc = 0.0f;
            }
            if (this.zzg && this.zzh) {
                com.google.android.gms.ads.internal.util.zze.zza("Flick detected.");
                this.zze = currentTimeMillis;
                int i = this.zzf + 1;
                this.zzf = i;
                this.zzg = false;
                this.zzh = false;
                zzdug zzdugVar = this.zzi;
                if (zzdugVar != null) {
                    if (i == ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziZ)).intValue()) {
                        zzduv zzduvVar = (zzduv) zzdugVar;
                        zzduvVar.zzh(new zzdut(zzduvVar), zzduu.GESTURE);
                    }
                }
            }
        }
    }

    public final void zzb() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (this.zzj && (sensorManager = this.zza) != null && (sensor = this.zzb) != null) {
                sensorManager.unregisterListener(this, sensor);
                this.zzj = false;
                com.google.android.gms.ads.internal.util.zze.zza("Stopped listening for flick gestures.");
            }
        }
    }

    public final void zzc() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziW)).booleanValue()) {
                return;
            }
            if (!this.zzj && (sensorManager = this.zza) != null && (sensor = this.zzb) != null) {
                sensorManager.registerListener(this, sensor, 2);
                this.zzj = true;
                com.google.android.gms.ads.internal.util.zze.zza("Listening for flick gestures.");
            }
            if (this.zza != null && this.zzb != null) {
                return;
            }
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Flick detection failed to initialize. Failed to obtain gyroscope.");
        }
    }

    public final void zzd(zzdug zzdugVar) {
        this.zzi = zzdugVar;
    }
}
