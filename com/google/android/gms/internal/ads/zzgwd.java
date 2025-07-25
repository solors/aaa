package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgwd extends zzgwg {
    private final int zzc;
    private final int zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgwd(byte[] bArr, int i, int i2) {
        super(bArr);
        zzgwj.zzq(i, i + i2, bArr.length);
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwg, com.google.android.gms.internal.ads.zzgwj
    public final byte zza(int i) {
        zzgwj.zzy(i, this.zzd);
        return ((zzgwg) this).zza[this.zzc + i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgwg, com.google.android.gms.internal.ads.zzgwj
    public final byte zzb(int i) {
        return ((zzgwg) this).zza[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.ads.zzgwg
    protected final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgwg, com.google.android.gms.internal.ads.zzgwj
    public final int zzd() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgwg, com.google.android.gms.internal.ads.zzgwj
    public final void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(((zzgwg) this).zza, this.zzc + i, bArr, i2, i3);
    }
}
