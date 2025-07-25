package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgnf {
    private final Map zza;
    private final zzgnd zzb;
    private final Class zzc;
    private final zzglo zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgnf(Map map, List list, zzgnd zzgndVar, zzglo zzgloVar, Class cls, zzgne zzgneVar) {
        this.zza = map;
        this.zzb = zzgndVar;
        this.zzc = cls;
        this.zzd = zzgloVar;
    }

    public static zzgnc zzb(Class cls) {
        return new zzgnc(cls, null);
    }

    public final zzglo zza() {
        return this.zzd;
    }

    public final zzgnd zzc() {
        return this.zzb;
    }

    public final Class zzd() {
        return this.zzc;
    }

    public final Collection zze() {
        return this.zza.values();
    }

    public final List zzf(byte[] bArr) {
        List list = (List) this.zza.get(zzgvo.zzb(bArr));
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }

    public final boolean zzg() {
        if (!this.zzd.zza().isEmpty()) {
            return true;
        }
        return false;
    }
}
