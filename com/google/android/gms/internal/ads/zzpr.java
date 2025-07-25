package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzpr extends zzci {
    @Nullable
    private int[] zzd;
    @Nullable
    private int[] zze;

    @Override // com.google.android.gms.internal.ads.zzch
    public final void zze(ByteBuffer byteBuffer) {
        int[] iArr = this.zze;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer zzj = zzj(((limit - position) / this.zzb.zze) * this.zzc.zze);
        while (position < limit) {
            for (int i : iArr) {
                zzj.putShort(byteBuffer.getShort(i + i + position));
            }
            position += this.zzb.zze;
        }
        byteBuffer.position(limit);
        zzj.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final zzcf zzi(zzcf zzcfVar) throws zzcg {
        boolean z;
        boolean z2;
        int[] iArr = this.zzd;
        if (iArr == null) {
            return zzcf.zza;
        }
        if (zzcfVar.zzd == 2) {
            if (zzcfVar.zzc != iArr.length) {
                z = true;
            } else {
                z = false;
            }
            int i = 0;
            while (true) {
                int length = iArr.length;
                if (i < length) {
                    int i2 = iArr[i];
                    if (i2 < zzcfVar.zzc) {
                        if (i2 != i) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z |= z2;
                        i++;
                    } else {
                        throw new zzcg("Unhandled input format:", zzcfVar);
                    }
                } else if (z) {
                    return new zzcf(zzcfVar.zzb, length, 2);
                } else {
                    return zzcf.zza;
                }
            }
        } else {
            throw new zzcg("Unhandled input format:", zzcfVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzci
    protected final void zzk() {
        this.zze = this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    protected final void zzm() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzo(@Nullable int[] iArr) {
        this.zzd = iArr;
    }
}
