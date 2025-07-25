package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.ironsource.C19658bt;
import com.ironsource.C21114v8;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdsv implements AppEventListener, zzcyq, com.google.android.gms.ads.internal.client.zza, zzcvt, zzcwn, zzcwo, zzcxh, zzcvw, zzfgo {
    private final List zza;
    private final zzdsj zzb;
    private long zzc;

    public zzdsv(zzdsj zzdsjVar, zzcgx zzcgxVar) {
        this.zzb = zzdsjVar;
        this.zza = Collections.singletonList(zzcgxVar);
    }

    private final void zzg(Class cls, String str, Object... objArr) {
        this.zzb.zza(this.zza, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzg(com.google.android.gms.ads.internal.client.zza.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        zzg(AppEventListener.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zza() {
        zzg(zzcvt.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzb() {
        zzg(zzcvt.class, C19658bt.f49348k, new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzc() {
        zzg(zzcvt.class, C19658bt.f49340c, new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final void zzd(zzfgh zzfghVar, String str) {
        zzg(zzfgg.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final void zzdA(zzfgh zzfghVar, String str) {
        zzg(zzfgg.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final void zzdB(zzfgh zzfghVar, String str, Throwable th) {
        zzg(zzfgg.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final void zzdC(zzfgh zzfghVar, String str) {
        zzg(zzfgg.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final void zzdh(Context context) {
        zzg(zzcwo.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final void zzdj(Context context) {
        zzg(zzcwo.class, C21114v8.C21122h.f54092t0, context);
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final void zzdk(Context context) {
        zzg(zzcwo.class, C21114v8.C21122h.f54094u0, context);
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdl(zzbvk zzbvkVar) {
        this.zzc = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
        zzg(zzcyq.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzdq(zzbvw zzbvwVar, String str, String str2) {
        zzg(zzcvt.class, "onRewarded", zzbvwVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void zzdz(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzg(zzcvw.class, "onAdFailedToLoad", Integer.valueOf(zzeVar.zza), zzeVar.zzb, zzeVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zze() {
        zzg(zzcvt.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzf() {
        zzg(zzcvt.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zzr() {
        zzg(zzcwn.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzs() {
        long elapsedRealtime = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - this.zzc;
        com.google.android.gms.ads.internal.util.zze.zza("Ad Request Latency : " + elapsedRealtime);
        zzg(zzcxh.class, "onAdLoaded", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdm(zzfca zzfcaVar) {
    }
}
