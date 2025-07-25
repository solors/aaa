package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzon {
    private final Context zza;
    private final Handler zzb;
    @Nullable
    private final zzoj zzc;
    private final BroadcastReceiver zzd;
    @Nullable
    private final zzok zze;
    @Nullable
    private zzoi zzf;
    @Nullable
    private zzoo zzg;
    private zze zzh;
    private boolean zzi;
    private final zzpw zzj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzon(Context context, zzpw zzpwVar, zze zzeVar, @Nullable zzoo zzooVar) {
        zzoj zzojVar;
        Context applicationContext = context.getApplicationContext();
        this.zza = applicationContext;
        this.zzj = zzpwVar;
        this.zzh = zzeVar;
        this.zzg = zzooVar;
        Handler handler = new Handler(zzei.zzz(), null);
        this.zzb = handler;
        if (zzei.zza >= 23) {
            zzojVar = new zzoj(this, null);
        } else {
            zzojVar = null;
        }
        this.zzc = zzojVar;
        this.zzd = new zzol(this, null);
        Uri zza = zzoi.zza();
        this.zze = zza != null ? new zzok(this, handler, applicationContext.getContentResolver(), zza) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzj(zzoi zzoiVar) {
        if (this.zzi && !zzoiVar.equals(this.zzf)) {
            this.zzf = zzoiVar;
            this.zzj.zza.zzJ(zzoiVar);
        }
    }

    public final zzoi zzc() {
        zzoj zzojVar;
        if (this.zzi) {
            zzoi zzoiVar = this.zzf;
            zzoiVar.getClass();
            return zzoiVar;
        }
        this.zzi = true;
        zzok zzokVar = this.zze;
        if (zzokVar != null) {
            zzokVar.zza();
        }
        if (zzei.zza >= 23 && (zzojVar = this.zzc) != null) {
            Context context = this.zza;
            Handler handler = this.zzb;
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            audioManager.getClass();
            audioManager.registerAudioDeviceCallback(zzojVar, handler);
        }
        zzoi zzd = zzoi.zzd(this.zza, this.zza.registerReceiver(this.zzd, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.zzb), this.zzh, this.zzg);
        this.zzf = zzd;
        return zzd;
    }

    public final void zzg(zze zzeVar) {
        this.zzh = zzeVar;
        zzj(zzoi.zzc(this.zza, zzeVar, this.zzg));
    }

    @RequiresApi(23)
    public final void zzh(@Nullable AudioDeviceInfo audioDeviceInfo) {
        AudioDeviceInfo audioDeviceInfo2;
        zzoo zzooVar = this.zzg;
        zzoo zzooVar2 = null;
        if (zzooVar == null) {
            audioDeviceInfo2 = null;
        } else {
            audioDeviceInfo2 = zzooVar.zza;
        }
        if (Objects.equals(audioDeviceInfo, audioDeviceInfo2)) {
            return;
        }
        if (audioDeviceInfo != null) {
            zzooVar2 = new zzoo(audioDeviceInfo);
        }
        this.zzg = zzooVar2;
        zzj(zzoi.zzc(this.zza, this.zzh, zzooVar2));
    }

    public final void zzi() {
        zzoj zzojVar;
        if (!this.zzi) {
            return;
        }
        this.zzf = null;
        if (zzei.zza >= 23 && (zzojVar = this.zzc) != null) {
            AudioManager audioManager = (AudioManager) this.zza.getSystemService("audio");
            audioManager.getClass();
            audioManager.unregisterAudioDeviceCallback(zzojVar);
        }
        this.zza.unregisterReceiver(this.zzd);
        zzok zzokVar = this.zze;
        if (zzokVar != null) {
            zzokVar.zzb();
        }
        this.zzi = false;
    }
}
