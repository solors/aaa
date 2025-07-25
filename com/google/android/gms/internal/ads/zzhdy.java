package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzhdy implements zzaqz {
    private static final zzhej zzg = zzhej.zzb(zzhdy.class);
    protected final String zza;
    long zzd;
    zzhed zzf;
    private ByteBuffer zzh;
    long zze = -1;
    boolean zzc = true;
    boolean zzb = true;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzhdy(String str) {
        this.zza = str;
    }

    private final synchronized void zzc() {
        String str;
        if (!this.zzc) {
            try {
                zzhej zzhejVar = zzg;
                String str2 = this.zza;
                if (str2.length() != 0) {
                    str = "mem mapping ".concat(str2);
                } else {
                    str = new String("mem mapping ");
                }
                zzhejVar.zza(str);
                this.zzh = this.zzf.zzd(this.zzd, this.zze);
                this.zzc = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqz
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaqz
    public final void zzb(zzhed zzhedVar, ByteBuffer byteBuffer, long j, zzaqw zzaqwVar) throws IOException {
        this.zzd = zzhedVar.zzb();
        byteBuffer.remaining();
        this.zze = j;
        this.zzf = zzhedVar;
        zzhedVar.zze(zzhedVar.zzb() + j);
        this.zzc = false;
        this.zzb = false;
        zzf();
    }

    protected abstract void zze(ByteBuffer byteBuffer);

    public final synchronized void zzf() {
        String str;
        zzc();
        zzhej zzhejVar = zzg;
        String str2 = this.zza;
        if (str2.length() != 0) {
            str = "parsing details of ".concat(str2);
        } else {
            str = new String("parsing details of ");
        }
        zzhejVar.zza(str);
        ByteBuffer byteBuffer = this.zzh;
        if (byteBuffer != null) {
            this.zzb = true;
            byteBuffer.rewind();
            zze(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                byteBuffer.slice();
            }
            this.zzh = null;
        }
    }
}
