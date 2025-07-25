package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzegb {
    @GuardedBy("this")
    private final zzgdb zzc;
    @GuardedBy("this")
    private zzegr zzf;
    private final String zzh;
    private final int zzi;
    private final zzegq zzj;
    private zzfbo zzk;
    @GuardedBy("this")
    private final Map zza = new HashMap();
    @GuardedBy("this")
    private final List zzb = new ArrayList();
    @GuardedBy("this")
    private final List zzd = new ArrayList();
    @GuardedBy("this")
    private final Set zze = new HashSet();
    @GuardedBy("this")
    private int zzg = Integer.MAX_VALUE;
    @GuardedBy("this")
    private boolean zzl = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzegb(zzfca zzfcaVar, zzegq zzegqVar, zzgdb zzgdbVar) {
        this.zzi = zzfcaVar.zzb.zzb.zzr;
        this.zzj = zzegqVar;
        this.zzc = zzgdbVar;
        this.zzh = zzegx.zzc(zzfcaVar);
        List list = zzfcaVar.zzb.zza;
        for (int i = 0; i < list.size(); i++) {
            this.zza.put((zzfbo) list.get(i), Integer.valueOf(i));
        }
        this.zzb.addAll(list);
    }

    private final synchronized void zze() {
        this.zzj.zzi(this.zzk);
        zzegr zzegrVar = this.zzf;
        if (zzegrVar != null) {
            this.zzc.zzc(zzegrVar);
        } else {
            this.zzc.zzd(new zzegu(3, this.zzh));
        }
    }

    private final synchronized boolean zzf(boolean z) {
        int i;
        for (zzfbo zzfboVar : this.zzb) {
            Integer num = (Integer) this.zza.get(zzfboVar);
            if (num != null) {
                i = num.intValue();
            } else {
                i = Integer.MAX_VALUE;
            }
            Integer valueOf = Integer.valueOf(i);
            if (z || !this.zze.contains(zzfboVar.zzat)) {
                if (valueOf.intValue() < this.zzg) {
                    return true;
                }
                if (valueOf.intValue() > this.zzg) {
                    break;
                }
            }
        }
        return false;
    }

    private final synchronized boolean zzg() {
        int i;
        for (zzfbo zzfboVar : this.zzd) {
            Integer num = (Integer) this.zza.get(zzfboVar);
            if (num != null) {
                i = num.intValue();
            } else {
                i = Integer.MAX_VALUE;
            }
            if (Integer.valueOf(i).intValue() < this.zzg) {
                return true;
            }
        }
        return false;
    }

    private final synchronized boolean zzh() {
        if (!zzf(true)) {
            if (!zzg()) {
                return false;
            }
        }
        return true;
    }

    private final synchronized boolean zzi() {
        if (this.zzl) {
            return false;
        }
        if (!this.zzb.isEmpty() && ((zzfbo) this.zzb.get(0)).zzav && !this.zzd.isEmpty()) {
            return false;
        }
        if (!zzd()) {
            List list = this.zzd;
            if (list.size() < this.zzi) {
                if (zzf(false)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized zzfbo zza() {
        if (zzi()) {
            for (int i = 0; i < this.zzb.size(); i++) {
                zzfbo zzfboVar = (zzfbo) this.zzb.get(i);
                String str = zzfboVar.zzat;
                if (!this.zze.contains(str)) {
                    if (zzfboVar.zzav) {
                        this.zzl = true;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        this.zze.add(str);
                    }
                    this.zzd.add(zzfboVar);
                    return (zzfbo) this.zzb.remove(i);
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void zzb(Throwable th, zzfbo zzfboVar) {
        this.zzl = false;
        this.zzd.remove(zzfboVar);
        this.zze.remove(zzfboVar.zzat);
        if (!zzd() && !zzh()) {
            zze();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void zzc(zzegr zzegrVar, zzfbo zzfboVar) {
        int i;
        this.zzl = false;
        this.zzd.remove(zzfboVar);
        if (zzd()) {
            zzegrVar.zzr();
            return;
        }
        Integer num = (Integer) this.zza.get(zzfboVar);
        if (num != null) {
            i = num.intValue();
        } else {
            i = Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf.intValue() > this.zzg) {
            this.zzj.zzm(zzfboVar);
            return;
        }
        if (this.zzf != null) {
            this.zzj.zzm(this.zzk);
        }
        this.zzg = valueOf.intValue();
        this.zzf = zzegrVar;
        this.zzk = zzfboVar;
        if (!zzh()) {
            zze();
        }
    }

    final synchronized boolean zzd() {
        return this.zzc.isDone();
    }
}
