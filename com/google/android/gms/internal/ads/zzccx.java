package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzccx implements Iterable {
    private final List zza = new ArrayList();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public final zzccw zza(zzcbs zzcbsVar) {
        Iterator it = iterator();
        while (it.hasNext()) {
            zzccw zzccwVar = (zzccw) it.next();
            if (zzccwVar.zza == zzcbsVar) {
                return zzccwVar;
            }
        }
        return null;
    }

    public final void zzb(zzccw zzccwVar) {
        this.zza.add(zzccwVar);
    }

    public final void zzc(zzccw zzccwVar) {
        this.zza.remove(zzccwVar);
    }

    public final boolean zzd(zzcbs zzcbsVar) {
        ArrayList<zzccw> arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            zzccw zzccwVar = (zzccw) it.next();
            if (zzccwVar.zza == zzcbsVar) {
                arrayList.add(zzccwVar);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        for (zzccw zzccwVar2 : arrayList) {
            zzccwVar2.zzb.zzf();
        }
        return true;
    }
}
