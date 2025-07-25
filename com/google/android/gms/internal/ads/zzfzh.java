package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
final class zzfzh extends zzfyy implements Serializable {
    final zzfyy zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfzh(zzfyy zzfyyVar) {
        this.zza = zzfyyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfyy, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfzh) {
            return this.zza.equals(((zzfzh) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString().concat(".reverse()");
    }
}
