package com.google.android.gms.internal.ads;

import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
final class zzgwl extends zzgwp {
    private final Iterable zze;
    private final Iterator zzf;
    private ByteBuffer zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgwl(Iterable iterable, int i, boolean z, zzgwo zzgwoVar) {
        super(null);
        this.zzj = Integer.MAX_VALUE;
        this.zzh = i;
        this.zze = iterable;
        this.zzf = iterable.iterator();
        this.zzl = 0;
        if (i == 0) {
            this.zzg = zzgye.zzc;
            this.zzm = 0L;
            this.zzn = 0L;
            this.zzo = 0L;
            return;
        }
        zzM();
    }

    private final int zzI() {
        return (int) (((this.zzh - this.zzl) - this.zzm) + this.zzn);
    }

    private final void zzJ() throws zzgyg {
        if (this.zzf.hasNext()) {
            zzM();
            return;
        }
        throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    private final void zzK(byte[] bArr, int i, int i2) throws IOException {
        if (i2 <= zzI()) {
            int i3 = i2;
            while (i3 > 0) {
                if (this.zzo - this.zzm == 0) {
                    zzJ();
                }
                int min = Math.min(i3, (int) (this.zzo - this.zzm));
                long j = min;
                zzhao.zzo(this.zzm, bArr, i2 - i3, j);
                i3 -= min;
                this.zzm += j;
            }
        } else if (i2 <= 0) {
        } else {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final void zzL() {
        int i = this.zzh + this.zzi;
        this.zzh = i;
        int i2 = this.zzj;
        if (i > i2) {
            int i3 = i - i2;
            this.zzi = i3;
            this.zzh = i - i3;
            return;
        }
        this.zzi = 0;
    }

    private final void zzM() {
        ByteBuffer byteBuffer = (ByteBuffer) this.zzf.next();
        this.zzg = byteBuffer;
        this.zzl += (int) (this.zzm - this.zzn);
        long position = byteBuffer.position();
        this.zzm = position;
        this.zzn = position;
        this.zzo = this.zzg.limit();
        long zze = zzhao.zze(this.zzg);
        this.zzm += zze;
        this.zzn += zze;
        this.zzo += zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final boolean zzA() throws IOException {
        if ((this.zzl + this.zzm) - this.zzn == this.zzh) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final boolean zzB() throws IOException {
        if (zzr() != 0) {
            return true;
        }
        return false;
    }

    final long zzC() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte zzh = zzh();
            j |= (zzh & Byte.MAX_VALUE) << i;
            if ((zzh & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                return j;
            }
        }
        throw new zzgyg("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final double zza() throws IOException {
        return Double.longBitsToDouble(zzq());
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final float zzb() throws IOException {
        return Float.intBitsToFloat(zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final int zzc() {
        return (int) ((this.zzl + this.zzm) - this.zzn);
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final int zzd(int i) throws zzgyg {
        if (i >= 0) {
            int zzc = i + zzc();
            int i2 = this.zzj;
            if (zzc <= i2) {
                this.zzj = zzc;
                zzL();
                return i2;
            }
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final int zze() throws IOException {
        return zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final int zzf() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final int zzg() throws IOException {
        return zzp();
    }

    public final byte zzh() throws IOException {
        if (this.zzo - this.zzm == 0) {
            zzJ();
        }
        long j = this.zzm;
        this.zzm = 1 + j;
        return zzhao.zza(j);
    }

    public final int zzi() throws IOException {
        long j = this.zzo;
        long j2 = this.zzm;
        if (j - j2 >= 4) {
            this.zzm = 4 + j2;
            return (zzhao.zza(j2) & 255) | ((zzhao.zza(1 + j2) & 255) << 8) | ((zzhao.zza(2 + j2) & 255) << 16) | ((zzhao.zza(j2 + 3) & 255) << 24);
        }
        return (zzh() & 255) | ((zzh() & 255) << 8) | ((zzh() & 255) << 16) | ((zzh() & 255) << 24);
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final int zzj() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final int zzk() throws IOException {
        return zzgwp.zzD(zzp());
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final int zzl() throws IOException {
        if (zzA()) {
            this.zzk = 0;
            return 0;
        }
        int zzp = zzp();
        this.zzk = zzp;
        if ((zzp >>> 3) != 0) {
            return zzp;
        }
        throw new zzgyg("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final int zzm() throws IOException {
        return zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final long zzn() throws IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final long zzo() throws IOException {
        return zzr();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
        if (com.google.android.gms.internal.ads.zzhao.zza(r4) >= 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzp() throws java.io.IOException {
        /*
            r10 = this;
            long r0 = r10.zzm
            long r2 = r10.zzo
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L8c
        La:
            r2 = 1
            long r4 = r0 + r2
            byte r0 = com.google.android.gms.internal.ads.zzhao.zza(r0)
            if (r0 < 0) goto L1a
            long r4 = r10.zzm
            long r4 = r4 + r2
            r10.zzm = r4
            return r0
        L1a:
            long r6 = r10.zzo
            long r8 = r10.zzm
            long r6 = r6 - r8
            r8 = 10
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L8c
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhao.zza(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L33
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L89
        L33:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhao.zza(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L42
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L40:
            r6 = r4
            goto L89
        L42:
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhao.zza(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L52
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L89
        L52:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhao.zza(r6)
            int r6 = r1 << 28
            r0 = r0 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r6
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhao.zza(r4)
            if (r1 >= 0) goto L89
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhao.zza(r6)
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhao.zza(r4)
            if (r1 >= 0) goto L89
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhao.zza(r6)
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhao.zza(r4)
            if (r1 < 0) goto L8c
        L89:
            r10.zzm = r6
            return r0
        L8c:
            long r0 = r10.zzC()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgwl.zzp():int");
    }

    public final long zzq() throws IOException {
        long j = this.zzo;
        long j2 = this.zzm;
        if (j - j2 >= 8) {
            this.zzm = 8 + j2;
            long zza = zzhao.zza(j2) & 255;
            long zza2 = (zzhao.zza(1 + j2) & 255) << 8;
            return ((zzhao.zza(j2 + 4) & 255) << 32) | zza | zza2 | ((zzhao.zza(j2 + 2) & 255) << 16) | ((zzhao.zza(3 + j2) & 255) << 24) | ((zzhao.zza(j2 + 5) & 255) << 40) | ((zzhao.zza(j2 + 6) & 255) << 48) | ((zzhao.zza(j2 + 7) & 255) << 56);
        }
        long zzh = (zzh() & 255) << 8;
        return (zzh() & 255) | zzh | ((zzh() & 255) << 16) | ((zzh() & 255) << 24) | ((zzh() & 255) << 32) | ((zzh() & 255) << 40) | ((zzh() & 255) << 48) | ((zzh() & 255) << 56);
    }

    public final long zzr() throws IOException {
        long zza;
        long j;
        long j2;
        int i;
        long j3 = this.zzm;
        if (this.zzo != j3) {
            long j4 = j3 + 1;
            byte zza2 = zzhao.zza(j3);
            if (zza2 >= 0) {
                this.zzm++;
                return zza2;
            } else if (this.zzo - this.zzm >= 10) {
                long j5 = j4 + 1;
                int zza3 = zza2 ^ (zzhao.zza(j4) << 7);
                if (zza3 < 0) {
                    i = zza3 ^ (-128);
                } else {
                    long j6 = j5 + 1;
                    int zza4 = zza3 ^ (zzhao.zza(j5) << 14);
                    if (zza4 >= 0) {
                        zza = zza4 ^ 16256;
                    } else {
                        j5 = j6 + 1;
                        int zza5 = zza4 ^ (zzhao.zza(j6) << 21);
                        if (zza5 < 0) {
                            i = zza5 ^ (-2080896);
                        } else {
                            j6 = j5 + 1;
                            long zza6 = zza5 ^ (zzhao.zza(j5) << 28);
                            if (zza6 >= 0) {
                                j2 = 266354560;
                            } else {
                                long j7 = j6 + 1;
                                long zza7 = zza6 ^ (zzhao.zza(j6) << 35);
                                if (zza7 < 0) {
                                    j = -34093383808L;
                                } else {
                                    j6 = j7 + 1;
                                    zza6 = zza7 ^ (zzhao.zza(j7) << 42);
                                    if (zza6 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        j7 = j6 + 1;
                                        zza7 = zza6 ^ (zzhao.zza(j6) << 49);
                                        if (zza7 < 0) {
                                            j = -558586000294016L;
                                        } else {
                                            j6 = j7 + 1;
                                            zza = (zza7 ^ (zzhao.zza(j7) << 56)) ^ 71499008037633920L;
                                            if (zza < 0) {
                                                long j8 = 1 + j6;
                                                if (zzhao.zza(j6) >= 0) {
                                                    j5 = j8;
                                                    this.zzm = j5;
                                                    return zza;
                                                }
                                            }
                                        }
                                    }
                                }
                                zza = zza7 ^ j;
                                j5 = j7;
                                this.zzm = j5;
                                return zza;
                            }
                            zza = zza6 ^ j2;
                        }
                    }
                    j5 = j6;
                    this.zzm = j5;
                    return zza;
                }
                zza = i;
                this.zzm = j5;
                return zza;
            }
        }
        return zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final long zzs() throws IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final long zzt() throws IOException {
        return zzgwp.zzF(zzr());
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final long zzu() throws IOException {
        return zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final zzgwj zzv() throws IOException {
        int zzp = zzp();
        if (zzp > 0) {
            long j = this.zzo;
            long j2 = this.zzm;
            long j3 = zzp;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[zzp];
                zzhao.zzo(j2, bArr, 0L, j3);
                this.zzm += j3;
                return new zzgwg(bArr);
            }
        }
        if (zzp > 0 && zzp <= zzI()) {
            byte[] bArr2 = new byte[zzp];
            zzK(bArr2, 0, zzp);
            return new zzgwg(bArr2);
        } else if (zzp == 0) {
            return zzgwj.zzb;
        } else {
            if (zzp < 0) {
                throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final String zzw() throws IOException {
        int zzp = zzp();
        if (zzp > 0) {
            long j = this.zzo;
            long j2 = this.zzm;
            long j3 = zzp;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[zzp];
                zzhao.zzo(j2, bArr, 0L, j3);
                String str = new String(bArr, zzgye.zza);
                this.zzm += j3;
                return str;
            }
        }
        if (zzp > 0 && zzp <= zzI()) {
            byte[] bArr2 = new byte[zzp];
            zzK(bArr2, 0, zzp);
            return new String(bArr2, zzgye.zza);
        } else if (zzp == 0) {
            return "";
        } else {
            if (zzp < 0) {
                throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final String zzx() throws IOException {
        int zzp = zzp();
        if (zzp > 0) {
            long j = this.zzo;
            long j2 = this.zzm;
            long j3 = zzp;
            if (j3 <= j - j2) {
                String zzg = zzhat.zzg(this.zzg, (int) (j2 - this.zzn), zzp);
                this.zzm += j3;
                return zzg;
            }
        }
        if (zzp >= 0 && zzp <= zzI()) {
            byte[] bArr = new byte[zzp];
            zzK(bArr, 0, zzp);
            return zzhat.zzh(bArr, 0, zzp);
        } else if (zzp == 0) {
            return "";
        } else {
            if (zzp <= 0) {
                throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final void zzy(int i) throws zzgyg {
        if (this.zzk == i) {
            return;
        }
        throw new zzgyg("Protocol message end-group tag did not match expected tag.");
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final void zzz(int i) {
        this.zzj = i;
        zzL();
    }
}
