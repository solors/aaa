package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzalk implements zzakf {
    private final zzdy zza = new zzdy();
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final float zzf;
    private final int zzg;

    public zzalk(List list) {
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.zzc = bArr[24];
            this.zzd = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.zze = true == "Serif".equals(zzei.zzC(bArr, 43, bArr.length + (-43))) ? "serif" : "sans-serif";
            int i = bArr[25] * 20;
            this.zzg = i;
            boolean z = (bArr[0] & 32) != 0;
            this.zzb = z;
            if (z) {
                this.zzf = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.95f));
                return;
            } else {
                this.zzf = 0.85f;
                return;
            }
        }
        this.zzc = 0;
        this.zzd = -1;
        this.zze = "sans-serif";
        this.zzb = false;
        this.zzf = 0.85f;
        this.zzg = -1;
    }

    private static void zzb(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    private static void zzc(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            int i7 = i & 1;
            int i8 = i & 2;
            boolean z = true;
            if (i7 != 0) {
                if (i8 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                    z = false;
                }
            } else {
                if (i8 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
                }
                z = false;
            }
            if ((i & 4) == 0) {
                if (i7 == 0 && !z) {
                    spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
                    return;
                }
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzakf
    public final void zza(byte[] bArr, int i, int i2, zzake zzakeVar, zzdb zzdbVar) {
        String zzB;
        int i3;
        int i4;
        int i5;
        this.zza.zzJ(bArr, i + i2);
        this.zza.zzL(i);
        zzdy zzdyVar = this.zza;
        int i6 = 1;
        int i7 = 0;
        int i8 = 2;
        zzcw.zzd(zzdyVar.zzb() >= 2);
        int zzq = zzdyVar.zzq();
        if (zzq == 0) {
            zzB = "";
        } else {
            int zzd = zzdyVar.zzd();
            Charset zzC = zzdyVar.zzC();
            int zzd2 = zzdyVar.zzd() - zzd;
            if (zzC == null) {
                zzC = StandardCharsets.UTF_8;
            }
            zzB = zzdyVar.zzB(zzq - zzd2, zzC);
        }
        if (zzB.isEmpty()) {
            zzdbVar.zza(new zzajx(zzfxn.zzn(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(zzB);
        zzc(spannableStringBuilder, this.zzc, 0, 0, spannableStringBuilder.length(), 16711680);
        zzb(spannableStringBuilder, this.zzd, -1, 0, spannableStringBuilder.length(), 16711680);
        String str = this.zze;
        int length = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f = this.zzf;
        while (true) {
            zzdy zzdyVar2 = this.zza;
            if (zzdyVar2.zzb() >= 8) {
                int zzd3 = zzdyVar2.zzd();
                int zzg = zzdyVar2.zzg();
                int zzg2 = this.zza.zzg();
                if (zzg2 == 1937013100) {
                    zzcw.zzd(this.zza.zzb() >= i8 ? i6 : i7);
                    int zzq2 = this.zza.zzq();
                    int i9 = i7;
                    while (i9 < zzq2) {
                        zzdy zzdyVar3 = this.zza;
                        zzcw.zzd(zzdyVar3.zzb() >= 12 ? i6 : i7);
                        int zzq3 = zzdyVar3.zzq();
                        int zzq4 = zzdyVar3.zzq();
                        zzdyVar3.zzM(i8);
                        int zzm = zzdyVar3.zzm();
                        zzdyVar3.zzM(i6);
                        int zzg3 = zzdyVar3.zzg();
                        if (zzq4 > spannableStringBuilder.length()) {
                            int length2 = spannableStringBuilder.length();
                            StringBuilder sb2 = new StringBuilder();
                            i4 = zzq2;
                            sb2.append("Truncating styl end (");
                            sb2.append(zzq4);
                            sb2.append(") to cueText.length() (");
                            sb2.append(length2);
                            sb2.append(").");
                            zzdo.zzf("Tx3gParser", sb2.toString());
                            i5 = spannableStringBuilder.length();
                        } else {
                            i4 = zzq2;
                            i5 = zzq4;
                        }
                        if (zzq3 >= i5) {
                            zzdo.zzf("Tx3gParser", "Ignoring styl with start (" + zzq3 + ") >= end (" + i5 + ").");
                        } else {
                            int i10 = i5;
                            zzc(spannableStringBuilder, zzm, this.zzc, zzq3, i10, 0);
                            zzb(spannableStringBuilder, zzg3, this.zzd, zzq3, i10, 0);
                        }
                        i9++;
                        zzq2 = i4;
                        i6 = 1;
                        i7 = 0;
                        i8 = 2;
                    }
                    i3 = i8;
                } else if (zzg2 == 1952608120 && this.zzb) {
                    i3 = 2;
                    zzcw.zzd(this.zza.zzb() >= 2);
                    f = Math.max(0.0f, Math.min(this.zza.zzq() / this.zzg, 0.95f));
                } else {
                    i3 = 2;
                }
                this.zza.zzL(zzd3 + zzg);
                i8 = i3;
                i6 = 1;
                i7 = 0;
            } else {
                zzcm zzcmVar = new zzcm();
                zzcmVar.zzl(spannableStringBuilder);
                zzcmVar.zze(f, 0);
                zzcmVar.zzf(0);
                zzdbVar.zza(new zzajx(zzfxn.zzo(zzcmVar.zzp()), -9223372036854775807L, -9223372036854775807L));
                return;
            }
        }
    }
}
