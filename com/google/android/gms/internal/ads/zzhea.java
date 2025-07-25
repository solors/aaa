package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzhea extends zzhdy {
    private int zzg;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzhea(String str) {
        super("mvhd");
    }

    public final int zzg() {
        if (!this.zzb) {
            zzf();
        }
        return this.zzg;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long zzh(ByteBuffer byteBuffer) {
        this.zzg = zzaqy.zzc(byteBuffer.get());
        zzaqy.zzd(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
