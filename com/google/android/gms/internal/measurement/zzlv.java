package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.2 */
/* loaded from: classes5.dex */
final class zzlv implements Iterator {
    private int zza;
    private boolean zzb;
    private Iterator zzc;
    private final /* synthetic */ zzlm zzd;

    private final Iterator zza() {
        Map map;
        if (this.zzc == null) {
            map = this.zzd.zzb;
            this.zzc = map.entrySet().iterator();
        }
        return this.zzc;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.zza + 1;
        list = this.zzd.zza;
        if (i >= list.size()) {
            map = this.zzd.zzb;
            if (map.isEmpty() || !zza().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        List list2;
        this.zzb = true;
        int i = this.zza + 1;
        this.zza = i;
        list = this.zzd.zza;
        if (i < list.size()) {
            list2 = this.zzd.zza;
            return (Map.Entry) list2.get(this.zza);
        }
        return (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (this.zzb) {
            this.zzb = false;
            this.zzd.zzg();
            int i = this.zza;
            list = this.zzd.zza;
            if (i < list.size()) {
                zzlm zzlmVar = this.zzd;
                int i2 = this.zza;
                this.zza = i2 - 1;
                zzlmVar.zzb(i2);
                return;
            }
            zza().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    private zzlv(zzlm zzlmVar) {
        this.zzd = zzlmVar;
        this.zza = -1;
    }
}
