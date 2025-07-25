package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@6.1.0 */
/* loaded from: classes5.dex */
final class zzdq extends zzdt {
    private final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdq(byte[] bArr, int i, int i2) {
        super(bArr);
        zzdw.zzj(0, i2, bArr.length);
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdt, com.google.android.gms.internal.play_billing.zzdw
    public final byte zza(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
        }
        return this.zza[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.zzdt, com.google.android.gms.internal.play_billing.zzdw
    public final byte zzb(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.play_billing.zzdt
    protected final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdt, com.google.android.gms.internal.play_billing.zzdw
    public final int zzd() {
        return this.zzc;
    }
}
