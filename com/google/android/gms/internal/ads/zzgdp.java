package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgdp {
    private final OutputStream zza;

    private zzgdp(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzgdp zzb(OutputStream outputStream) {
        return new zzgdp(outputStream);
    }

    public final void zza(zzgsx zzgsxVar) throws IOException {
        try {
            zzgsxVar.zzaU(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
