package com.google.android.gms.internal.measurement;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzme {
    private static final zzme zza = new zzme(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzme() {
        this(0, new int[8], new Object[8], true);
    }

    public static zzme zzc() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzme zzd() {
        return new zzme();
    }

    private final void zzf() {
        if (this.zzf) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzme)) {
            return false;
        }
        zzme zzmeVar = (zzme) obj;
        int i = this.zzb;
        if (i == zzmeVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzmeVar.zzc;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (iArr[i2] != iArr2[i2]) {
                        z = false;
                        break;
                    }
                    i2++;
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                Object[] objArr = this.zzd;
                Object[] objArr2 = zzmeVar.zzd;
                int i3 = this.zzb;
                int i4 = 0;
                while (true) {
                    if (i4 < i3) {
                        if (!objArr[i4].equals(objArr2[i4])) {
                            z2 = false;
                            break;
                        }
                        i4++;
                    } else {
                        z2 = true;
                        break;
                    }
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = (i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        int[] iArr = this.zzc;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.zzd;
        int i7 = this.zzb;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final int zza() {
        int zzg;
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i4 = this.zzc[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                zzg = zzit.zzg(i5, ((Long) this.zzd[i3]).longValue());
            } else if (i6 == 1) {
                zzg = zzit.zzc(i5, ((Long) this.zzd[i3]).longValue());
            } else if (i6 == 2) {
                zzg = zzit.zzc(i5, (zzia) this.zzd[i3]);
            } else if (i6 == 3) {
                zzg = (zzit.zzi(i5) << 1) + ((zzme) this.zzd[i3]).zza();
            } else if (i6 == 5) {
                zzg = zzit.zzf(i5, ((Integer) this.zzd[i3]).intValue());
            } else {
                throw new IllegalStateException(zzjs.zza());
            }
            i2 += zzg;
        }
        this.zze = i2;
        return i2;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            i2 += zzit.zzd(this.zzc[i3] >>> 3, (zzia) this.zzd[i3]);
        }
        this.zze = i2;
        return i2;
    }

    public final void zze() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    private zzme(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public final void zzb(zzna zznaVar) throws IOException {
        if (this.zzb == 0) {
            return;
        }
        if (zznaVar.zza() == 1) {
            for (int i = 0; i < this.zzb; i++) {
                zza(this.zzc[i], this.zzd[i], zznaVar);
            }
            return;
        }
        for (int i2 = this.zzb - 1; i2 >= 0; i2--) {
            zza(this.zzc[i2], this.zzd[i2], zznaVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzme zza(zzme zzmeVar) {
        if (zzmeVar.equals(zza)) {
            return this;
        }
        zzf();
        int i = this.zzb + zzmeVar.zzb;
        zza(i);
        System.arraycopy(zzmeVar.zzc, 0, this.zzc, this.zzb, zzmeVar.zzb);
        System.arraycopy(zzmeVar.zzd, 0, this.zzd, this.zzb, zzmeVar.zzb);
        this.zzb = i;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzme zza(zzme zzmeVar, zzme zzmeVar2) {
        int i = zzmeVar.zzb + zzmeVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzmeVar.zzc, i);
        System.arraycopy(zzmeVar2.zzc, 0, copyOf, zzmeVar.zzb, zzmeVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzmeVar.zzd, i);
        System.arraycopy(zzmeVar2.zzd, 0, copyOf2, zzmeVar.zzb, zzmeVar2.zzb);
        return new zzme(i, copyOf, copyOf2, true);
    }

    private final void zza(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(StringBuilder sb2, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzku.zza(sb2, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(int i, Object obj) {
        zzf();
        zza(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzna zznaVar) throws IOException {
        if (zznaVar.zza() == 2) {
            for (int i = this.zzb - 1; i >= 0; i--) {
                zznaVar.zza(this.zzc[i] >>> 3, this.zzd[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zznaVar.zza(this.zzc[i2] >>> 3, this.zzd[i2]);
        }
    }

    private static void zza(int i, Object obj, zzna zznaVar) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            zznaVar.zzb(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            zznaVar.zza(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            zznaVar.zza(i2, (zzia) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                zznaVar.zzb(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzjs.zza());
        } else if (zznaVar.zza() == 1) {
            zznaVar.zzb(i2);
            ((zzme) obj).zzb(zznaVar);
            zznaVar.zza(i2);
        } else {
            zznaVar.zza(i2);
            ((zzme) obj).zzb(zznaVar);
            zznaVar.zzb(i2);
        }
    }
}
