package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfvc {
    private final zzfvb zza;

    private zzfvc(zzfvb zzfvbVar) {
        int i = zzftx.zzb;
        this.zza = zzfvbVar;
    }

    public static zzfvc zza(int i) {
        return new zzfvc(new zzfuy(4000));
    }

    public static zzfvc zzb(zzfty zzftyVar) {
        return new zzfvc(new zzfuu(zzftyVar));
    }

    public static zzfvc zzc(Pattern pattern) {
        zzfue zzfueVar = new zzfue(pattern);
        zzfun.zzi(!((zzfud) zzfueVar.zza("")).zza.matches(), "The pattern may not match the empty string: %s", zzfueVar);
        return new zzfvc(new zzfuw(zzfueVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator zzg(CharSequence charSequence) {
        return this.zza.zza(this, charSequence);
    }

    public final Iterable zzd(CharSequence charSequence) {
        charSequence.getClass();
        return new zzfuz(this, charSequence);
    }

    public final List zzf(CharSequence charSequence) {
        charSequence.getClass();
        Iterator zzg = zzg(charSequence);
        ArrayList arrayList = new ArrayList();
        while (zzg.hasNext()) {
            arrayList.add((String) zzg.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
