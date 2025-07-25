package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzccn implements zzhed {
    private final ByteBuffer zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzccn(ByteBuffer byteBuffer) {
        this.zza = byteBuffer.duplicate();
    }

    @Override // com.google.android.gms.internal.ads.zzhed
    public final int zza(ByteBuffer byteBuffer) throws IOException {
        if (this.zza.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), this.zza.remaining());
        byte[] bArr = new byte[min];
        this.zza.get(bArr);
        byteBuffer.put(bArr);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzhed
    public final long zzb() throws IOException {
        return this.zza.position();
    }

    @Override // com.google.android.gms.internal.ads.zzhed
    public final long zzc() throws IOException {
        return this.zza.limit();
    }

    @Override // com.google.android.gms.internal.ads.zzhed
    public final ByteBuffer zzd(long j, long j2) throws IOException {
        ByteBuffer byteBuffer = this.zza;
        int position = byteBuffer.position();
        byteBuffer.position((int) j);
        ByteBuffer slice = this.zza.slice();
        slice.limit((int) j2);
        this.zza.position(position);
        return slice;
    }

    @Override // com.google.android.gms.internal.ads.zzhed
    public final void zze(long j) throws IOException {
        this.zza.position((int) j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }
}
