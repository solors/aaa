package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public class zzgwg extends zzgwf {
    protected final byte[] zza;

    public zzgwg(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgwj) || zzd() != ((zzgwj) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (obj instanceof zzgwg) {
            zzgwg zzgwgVar = (zzgwg) obj;
            int zzr = zzr();
            int zzr2 = zzgwgVar.zzr();
            if (zzr != 0 && zzr2 != 0 && zzr != zzr2) {
                return false;
            }
            return zzg(zzgwgVar, 0, zzd());
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public byte zzb(int i) {
        return this.zza[i];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, i, bArr, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgwf
    public final boolean zzg(zzgwj zzgwjVar, int i, int i2) {
        if (i2 <= zzgwjVar.zzd()) {
            int i3 = i + i2;
            if (i3 <= zzgwjVar.zzd()) {
                if (zzgwjVar instanceof zzgwg) {
                    zzgwg zzgwgVar = (zzgwg) zzgwjVar;
                    byte[] bArr = this.zza;
                    byte[] bArr2 = zzgwgVar.zza;
                    int zzc = zzc() + i2;
                    int zzc2 = zzc();
                    int zzc3 = zzgwgVar.zzc() + i;
                    while (zzc2 < zzc) {
                        if (bArr[zzc2] != bArr2[zzc3]) {
                            return false;
                        }
                        zzc2++;
                        zzc3++;
                    }
                    return true;
                }
                return zzgwjVar.zzk(i, i3).equals(zzk(0, i2));
            }
            int zzd = zzgwjVar.zzd();
            throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + zzd);
        }
        int zzd2 = zzd();
        throw new IllegalArgumentException("Length too large: " + i2 + zzd2);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final int zzi(int i, int i2, int i3) {
        return zzgye.zzb(i, this.zza, zzc() + i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final int zzj(int i, int i2, int i3) {
        int zzc = zzc() + i2;
        return zzhat.zzf(i, this.zza, zzc, i3 + zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final zzgwj zzk(int i, int i2) {
        int zzq = zzgwj.zzq(i, i2, zzd());
        if (zzq == 0) {
            return zzgwj.zzb;
        }
        return new zzgwd(this.zza, zzc() + i, zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final zzgwp zzl() {
        return zzgwp.zzH(this.zza, zzc(), zzd(), true);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    protected final String zzm(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final ByteBuffer zzn() {
        return ByteBuffer.wrap(this.zza, zzc(), zzd()).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final void zzo(zzgwa zzgwaVar) throws IOException {
        zzgwaVar.zza(this.zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final boolean zzp() {
        int zzc = zzc();
        return zzhat.zzi(this.zza, zzc, zzd() + zzc);
    }
}
