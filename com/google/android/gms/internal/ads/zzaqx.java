package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzaqx extends zzhec {
    static {
        zzhej.zzb(zzaqx.class);
    }

    public zzaqx(zzhed zzhedVar, zzaqw zzaqwVar) throws IOException {
        zze(zzhedVar, zzhedVar.zzc(), zzaqwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final String toString() {
        String obj = this.zzc.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 7);
        sb2.append("model(");
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhec, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }
}
