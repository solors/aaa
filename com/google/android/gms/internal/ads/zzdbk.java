package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdbk {
    private final Set zza = new HashSet();
    private final Set zzb = new HashSet();
    private final Set zzc = new HashSet();
    private final Set zzd = new HashSet();
    private final Set zze = new HashSet();
    private final Set zzf = new HashSet();
    private final Set zzg = new HashSet();
    private final Set zzh = new HashSet();
    private final Set zzi = new HashSet();
    private final Set zzj = new HashSet();
    private final Set zzk = new HashSet();
    private final Set zzl = new HashSet();
    private final Set zzm = new HashSet();
    private final Set zzn = new HashSet();
    private zzezc zzo;

    public final zzdbk zza(com.google.android.gms.ads.internal.client.zza zzaVar, Executor executor) {
        this.zzc.add(new zzddk(zzaVar, executor));
        return this;
    }

    public final zzdbk zzb(zzcvw zzcvwVar, Executor executor) {
        this.zzi.add(new zzddk(zzcvwVar, executor));
        return this;
    }

    public final zzdbk zzc(zzcwj zzcwjVar, Executor executor) {
        this.zzl.add(new zzddk(zzcwjVar, executor));
        return this;
    }

    public final zzdbk zzd(zzcwn zzcwnVar, Executor executor) {
        this.zzf.add(new zzddk(zzcwnVar, executor));
        return this;
    }

    public final zzdbk zze(zzcvt zzcvtVar, Executor executor) {
        this.zze.add(new zzddk(zzcvtVar, executor));
        return this;
    }

    public final zzdbk zzf(zzcxh zzcxhVar, Executor executor) {
        this.zzh.add(new zzddk(zzcxhVar, executor));
        return this;
    }

    public final zzdbk zzg(zzcxs zzcxsVar, Executor executor) {
        this.zzg.add(new zzddk(zzcxsVar, executor));
        return this;
    }

    public final zzdbk zzh(com.google.android.gms.ads.internal.overlay.zzr zzrVar, Executor executor) {
        this.zzn.add(new zzddk(zzrVar, executor));
        return this;
    }

    public final zzdbk zzi(zzcye zzcyeVar, Executor executor) {
        this.zzm.add(new zzddk(zzcyeVar, executor));
        return this;
    }

    public final zzdbk zzj(zzcyq zzcyqVar, Executor executor) {
        this.zzb.add(new zzddk(zzcyqVar, executor));
        return this;
    }

    public final zzdbk zzk(AppEventListener appEventListener, Executor executor) {
        this.zzk.add(new zzddk(appEventListener, executor));
        return this;
    }

    public final zzdbk zzl(zzdds zzddsVar, Executor executor) {
        this.zzd.add(new zzddk(zzddsVar, executor));
        return this;
    }

    public final zzdbk zzm(zzezc zzezcVar) {
        this.zzo = zzezcVar;
        return this;
    }

    public final zzdbm zzn() {
        return new zzdbm(this, null);
    }
}
