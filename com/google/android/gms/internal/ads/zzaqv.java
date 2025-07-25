package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C15633C;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzaqv implements zzaqw {
    private static final Logger zzb = Logger.getLogger(zzaqv.class.getName());
    final ThreadLocal zza = new zzaqu(this);

    public abstract zzaqz zza(String str, byte[] bArr, String str2);

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final zzaqz zzb(zzhed zzhedVar, zzara zzaraVar) throws IOException {
        int zza;
        long j;
        String str;
        long zzb2 = zzhedVar.zzb();
        ((ByteBuffer) this.zza.get()).rewind().limit(8);
        do {
            zza = zzhedVar.zza((ByteBuffer) this.zza.get());
            if (zza == 8) {
                ((ByteBuffer) this.zza.get()).rewind();
                long zze = zzaqy.zze((ByteBuffer) this.zza.get());
                byte[] bArr = null;
                if (zze < 8 && zze > 1) {
                    Logger logger = zzb;
                    Level level = Level.SEVERE;
                    StringBuilder sb2 = new StringBuilder(80);
                    sb2.append("Plausibility check failed: size < 8 (size = ");
                    sb2.append(zze);
                    sb2.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb2.toString());
                    return null;
                }
                byte[] bArr2 = new byte[4];
                ((ByteBuffer) this.zza.get()).get(bArr2);
                try {
                    String str2 = new String(bArr2, C15633C.ISO88591_NAME);
                    if (zze == 1) {
                        ((ByteBuffer) this.zza.get()).limit(16);
                        zzhedVar.zza((ByteBuffer) this.zza.get());
                        ((ByteBuffer) this.zza.get()).position(8);
                        j = zzaqy.zzf((ByteBuffer) this.zza.get()) - 16;
                    } else if (zze == 0) {
                        j = zzhedVar.zzc() - zzhedVar.zzb();
                    } else {
                        j = zze - 8;
                    }
                    if (CommonUrlParts.UUID.equals(str2)) {
                        ((ByteBuffer) this.zza.get()).limit(((ByteBuffer) this.zza.get()).limit() + 16);
                        zzhedVar.zza((ByteBuffer) this.zza.get());
                        bArr = new byte[16];
                        for (int position = ((ByteBuffer) this.zza.get()).position() - 16; position < ((ByteBuffer) this.zza.get()).position(); position++) {
                            bArr[position - (((ByteBuffer) this.zza.get()).position() - 16)] = ((ByteBuffer) this.zza.get()).get(position);
                        }
                        j -= 16;
                    }
                    long j2 = j;
                    if (zzaraVar instanceof zzaqz) {
                        str = ((zzaqz) zzaraVar).zza();
                    } else {
                        str = "";
                    }
                    zzaqz zza2 = zza(str2, bArr, str);
                    ((ByteBuffer) this.zza.get()).rewind();
                    zza2.zzb(zzhedVar, (ByteBuffer) this.zza.get(), j2, this);
                    return zza2;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(e);
                }
            }
        } while (zza >= 0);
        zzhedVar.zze(zzb2);
        throw new EOFException();
    }
}
