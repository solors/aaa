package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.2 */
/* loaded from: classes5.dex */
public class zzij extends zzih {
    protected final byte[] zzb;

    public zzij(byte[] bArr) {
        super();
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzia
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzia) || zzb() != ((zzia) obj).zzb()) {
            return false;
        }
        if (zzb() == 0) {
            return true;
        }
        if (obj instanceof zzij) {
            zzij zzijVar = (zzij) obj;
            int zza = zza();
            int zza2 = zzijVar.zza();
            if (zza != 0 && zza2 != 0 && zza != zza2) {
                return false;
            }
            return zza(zzijVar, 0, zzb());
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzia
    public byte zza(int i) {
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzia
    public byte zzb(int i) {
        return this.zzb[i];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzia
    public final zzia zza(int i, int i2) {
        int zza = zzia.zza(0, i2, zzb());
        if (zza == 0) {
            return zzia.zza;
        }
        return new zzie(this.zzb, zzc(), zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzia
    protected final int zzb(int i, int i2, int i3) {
        return zzjm.zza(i, this.zzb, zzc(), i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzia
    public int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzia
    public final void zza(zzhx zzhxVar) throws IOException {
        zzhxVar.zza(this.zzb, zzc(), zzb());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzih
    public final boolean zza(zzia zziaVar, int i, int i2) {
        if (i2 <= zziaVar.zzb()) {
            if (i2 <= zziaVar.zzb()) {
                if (zziaVar instanceof zzij) {
                    zzij zzijVar = (zzij) zziaVar;
                    byte[] bArr = this.zzb;
                    byte[] bArr2 = zzijVar.zzb;
                    int zzc = zzc() + i2;
                    int zzc2 = zzc();
                    int zzc3 = zzijVar.zzc();
                    while (zzc2 < zzc) {
                        if (bArr[zzc2] != bArr2[zzc3]) {
                            return false;
                        }
                        zzc2++;
                        zzc3++;
                    }
                    return true;
                }
                return zziaVar.zza(0, i2).equals(zza(0, i2));
            }
            int zzb = zziaVar.zzb();
            throw new IllegalArgumentException("Ran off end of other: 0, " + i2 + ", " + zzb);
        }
        int zzb2 = zzb();
        throw new IllegalArgumentException("Length too large: " + i2 + zzb2);
    }
}
