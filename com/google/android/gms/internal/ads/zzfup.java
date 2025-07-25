package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
final class zzfup implements Serializable, zzfuo {
    private final List zza;

    public final boolean equals(Object obj) {
        if (obj instanceof zzfup) {
            return this.zza.equals(((zzfup) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append("and(");
        boolean z = true;
        for (Object obj : this.zza) {
            if (!z) {
                sb2.append(',');
            }
            sb2.append(obj);
            z = false;
        }
        sb2.append(')');
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfuo
    public final boolean zza(Object obj) {
        for (int i = 0; i < this.zza.size(); i++) {
            if (!((zzfuo) this.zza.get(i)).zza(obj)) {
                return false;
            }
        }
        return true;
    }
}
