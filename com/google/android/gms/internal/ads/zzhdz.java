package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public class zzhdz extends zzhec implements zzaqz {
    protected final String zza = "moov";

    public zzhdz(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzaqz
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaqz
    public final void zzb(zzhed zzhedVar, ByteBuffer byteBuffer, long j, zzaqw zzaqwVar) throws IOException {
        zzhedVar.zzb();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.zzc = zzhedVar;
        this.zze = zzhedVar.zzb();
        zzhedVar.zze(zzhedVar.zzb() + j);
        this.zzf = zzhedVar.zzb();
        this.zzb = zzaqwVar;
    }
}
