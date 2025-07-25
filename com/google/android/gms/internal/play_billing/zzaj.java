package com.google.android.gms.internal.play_billing;

import java.util.Set;

/* compiled from: com.android.billingclient:billing@@6.1.0 */
/* loaded from: classes5.dex */
public abstract class zzaj extends zzac implements Set {
    private transient zzaf zza;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return zzar.zza(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzac
    public zzaf zzd() {
        zzaf zzafVar = this.zza;
        if (zzafVar == null) {
            zzaf zzh = zzh();
            this.zza = zzh;
            return zzh;
        }
        return zzafVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzac, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zze */
    public abstract zzas iterator();

    zzaf zzh() {
        Object[] array = toArray();
        int i = zzaf.zzd;
        return zzaf.zzi(array, array.length);
    }
}
