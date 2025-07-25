package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzflk {
    private static final zzflk zza = new zzflk();
    private final ArrayList zzb = new ArrayList();
    private final ArrayList zzc = new ArrayList();

    private zzflk() {
    }

    public static zzflk zza() {
        return zza;
    }

    public final Collection zzb() {
        return Collections.unmodifiableCollection(this.zzc);
    }

    public final Collection zzc() {
        return Collections.unmodifiableCollection(this.zzb);
    }

    public final void zzd(zzfkt zzfktVar) {
        this.zzb.add(zzfktVar);
    }

    public final void zze(zzfkt zzfktVar) {
        ArrayList arrayList = this.zzb;
        boolean zzg = zzg();
        arrayList.remove(zzfktVar);
        this.zzc.remove(zzfktVar);
        if (zzg && !zzg()) {
            zzfls.zzb().zzg();
        }
    }

    public final void zzf(zzfkt zzfktVar) {
        ArrayList arrayList = this.zzc;
        boolean zzg = zzg();
        arrayList.add(zzfktVar);
        if (!zzg) {
            zzfls.zzb().zzf();
        }
    }

    public final boolean zzg() {
        if (this.zzc.size() > 0) {
            return true;
        }
        return false;
    }
}
