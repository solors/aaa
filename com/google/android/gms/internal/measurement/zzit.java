package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.2 */
/* loaded from: classes5.dex */
public abstract class zzit extends zzhx {
    private static final Logger zzb = Logger.getLogger(zzit.class.getName());
    private static final boolean zzc = zzmg.zzc();
    zziw zza;

    /* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.2 */
    /* loaded from: classes5.dex */
    private static class zza extends zzit {
        private final byte[] zzb;
        private final int zzc;
        private int zzd;

        zza(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                if ((i2 | 0 | (bArr.length - i2)) >= 0) {
                    this.zzb = bArr;
                    this.zzd = 0;
                    this.zzc = i2;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)));
            }
            throw new NullPointerException("buffer");
        }

        private final void zzc(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.zzb, this.zzd, i2);
                this.zzd += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final int zza() {
            return this.zzc - this.zzd;
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final void zzb(byte[] bArr, int i, int i2) throws IOException {
            zzc(i2);
            zzc(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final void zzd(int i, int i2) throws IOException {
            zzc(i, 0);
            zzc(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final void zza(byte b) throws IOException {
            try {
                byte[] bArr = this.zzb;
                int i = this.zzd;
                this.zzd = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final void zzb(int i, int i2) throws IOException {
            zzc(i, 0);
            zzb(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final void zza(int i, boolean z) throws IOException {
            zzc(i, 0);
            zza(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final void zzb(int i) throws IOException {
            if (i >= 0) {
                zzc(i);
            } else {
                zzb(i);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final void zzc(int i, int i2) throws IOException {
            zzc((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final void zzc(int i) throws IOException {
            while ((i & (-128)) != 0) {
                try {
                    byte[] bArr = this.zzb;
                    int i2 = this.zzd;
                    this.zzd = i2 + 1;
                    bArr[i2] = (byte) (i | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e);
                }
            }
            byte[] bArr2 = this.zzb;
            int i3 = this.zzd;
            this.zzd = i3 + 1;
            bArr2[i3] = (byte) i;
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final void zza(int i, zzia zziaVar) throws IOException {
            zzc(i, 2);
            zza(zziaVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final void zzb(int i, zzia zziaVar) throws IOException {
            zzc(1, 3);
            zzd(2, i);
            zza(3, zziaVar);
            zzc(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final void zza(zzia zziaVar) throws IOException {
            zzc(zziaVar.zzb());
            zziaVar.zza(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final void zza(int i, int i2) throws IOException {
            zzc(i, 5);
            zza(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final void zzb(int i, long j) throws IOException {
            zzc(i, 0);
            zzb(j);
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final void zza(int i) throws IOException {
            try {
                byte[] bArr = this.zzb;
                int i2 = this.zzd;
                int i3 = i2 + 1;
                bArr[i2] = (byte) i;
                int i4 = i3 + 1;
                bArr[i3] = (byte) (i >> 8);
                int i5 = i4 + 1;
                bArr[i4] = (byte) (i >> 16);
                this.zzd = i5 + 1;
                bArr[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final void zzb(long j) throws IOException {
            if (zzit.zzc && zza() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.zzb;
                    int i = this.zzd;
                    this.zzd = i + 1;
                    zzmg.zza(bArr, i, (byte) (((int) j) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.zzb;
                int i2 = this.zzd;
                this.zzd = i2 + 1;
                zzmg.zza(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.zzb;
                    int i3 = this.zzd;
                    this.zzd = i3 + 1;
                    bArr3[i3] = (byte) (((int) j) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e);
                }
            }
            byte[] bArr4 = this.zzb;
            int i4 = this.zzd;
            this.zzd = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final void zza(int i, long j) throws IOException {
            zzc(i, 1);
            zza(j);
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final void zza(long j) throws IOException {
            try {
                byte[] bArr = this.zzb;
                int i = this.zzd;
                int i2 = i + 1;
                bArr[i] = (byte) j;
                int i3 = i2 + 1;
                bArr[i2] = (byte) (j >> 8);
                int i4 = i3 + 1;
                bArr[i3] = (byte) (j >> 16);
                int i5 = i4 + 1;
                bArr[i4] = (byte) (j >> 24);
                int i6 = i5 + 1;
                bArr[i5] = (byte) (j >> 32);
                int i7 = i6 + 1;
                bArr[i6] = (byte) (j >> 40);
                int i8 = i7 + 1;
                bArr[i7] = (byte) (j >> 48);
                this.zzd = i8 + 1;
                bArr[i8] = (byte) (j >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzhx
        public final void zza(byte[] bArr, int i, int i2) throws IOException {
            zzc(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        final void zza(int i, zzkt zzktVar, zzll zzllVar) throws IOException {
            zzc(i, 2);
            zzc(((zzhq) zzktVar).zza(zzllVar));
            zzllVar.zza((zzll) zzktVar, (zzna) this.zza);
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final void zza(zzkt zzktVar) throws IOException {
            zzc(zzktVar.zzca());
            zzktVar.zza(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final void zza(int i, zzkt zzktVar) throws IOException {
            zzc(1, 3);
            zzd(2, i);
            zzc(3, 2);
            zza(zzktVar);
            zzc(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final void zza(int i, String str) throws IOException {
            zzc(i, 2);
            zza(str);
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final void zza(String str) throws IOException {
            int i = this.zzd;
            try {
                int zzj = zzit.zzj(str.length() * 3);
                int zzj2 = zzit.zzj(str.length());
                if (zzj2 == zzj) {
                    int i2 = i + zzj2;
                    this.zzd = i2;
                    int zza = zzmk.zza(str, this.zzb, i2, zza());
                    this.zzd = i;
                    zzc((zza - i) - zzj2);
                    this.zzd = zza;
                    return;
                }
                zzc(zzmk.zza(str));
                this.zzd = zzmk.zza(str, this.zzb, this.zzd, zza());
            } catch (zzmo e) {
                this.zzd = i;
                zza(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(e2);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.2 */
    /* loaded from: classes5.dex */
    public static class zzb extends IOException {
        zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzb(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        zzb(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    public static int zza(double d) {
        return 8;
    }

    public static int zzb(int i, boolean z) {
        return zzj(i << 3) + 1;
    }

    public static int zzc(long j) {
        return 8;
    }

    public static int zzd(int i) {
        return zzg(i);
    }

    public static int zze(int i) {
        return 4;
    }

    public static int zzf(int i, int i2) {
        return zzj(i << 3) + 4;
    }

    public static int zzg(int i) {
        return 4;
    }

    public static int zzh(int i, int i2) {
        return zzj(i << 3) + 4;
    }

    private static long zzi(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int zzj(int i, int i2) {
        return zzj(i << 3) + zzj(i2);
    }

    private static int zzl(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public abstract int zza();

    public abstract void zza(byte b) throws IOException;

    public abstract void zza(int i) throws IOException;

    public abstract void zza(int i, int i2) throws IOException;

    public abstract void zza(int i, long j) throws IOException;

    public abstract void zza(int i, zzia zziaVar) throws IOException;

    public abstract void zza(int i, zzkt zzktVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(int i, zzkt zzktVar, zzll zzllVar) throws IOException;

    public abstract void zza(int i, String str) throws IOException;

    public abstract void zza(int i, boolean z) throws IOException;

    public abstract void zza(long j) throws IOException;

    public abstract void zza(zzia zziaVar) throws IOException;

    public abstract void zza(zzkt zzktVar) throws IOException;

    public abstract void zza(String str) throws IOException;

    public abstract void zzb(int i) throws IOException;

    public abstract void zzb(int i, int i2) throws IOException;

    public abstract void zzb(int i, long j) throws IOException;

    public abstract void zzb(int i, zzia zziaVar) throws IOException;

    public abstract void zzb(long j) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(byte[] bArr, int i, int i2) throws IOException;

    public abstract void zzc(int i) throws IOException;

    public abstract void zzc(int i, int i2) throws IOException;

    public abstract void zzd(int i, int i2) throws IOException;

    public final void zzk(int i, int i2) throws IOException {
        zzd(i, zzl(i2));
    }

    private zzit() {
    }

    public static int zza(float f) {
        return 4;
    }

    public static int zzb(zzia zziaVar) {
        int zzb2 = zziaVar.zzb();
        return zzj(zzb2) + zzb2;
    }

    public static int zzd(int i, long j) {
        return zzj(i << 3) + zzg(j);
    }

    public static int zze(long j) {
        return 8;
    }

    public static int zzf(int i) {
        return zzg(i);
    }

    public static int zzg(int i, int i2) {
        return zzj(i << 3) + zzg(i2);
    }

    public static int zzh(int i) {
        return zzj(zzl(i));
    }

    public static int zzi(int i, int i2) {
        return zzj(i << 3) + zzj(zzl(i2));
    }

    public final void zzk(int i) throws IOException {
        zzc(zzl(i));
    }

    public static int zza(boolean z) {
        return 1;
    }

    public static int zzc(int i, zzia zziaVar) {
        int zzj = zzj(i << 3);
        int zzb2 = zziaVar.zzb();
        return zzj + zzj(zzb2) + zzb2;
    }

    public static int zze(int i, int i2) {
        return zzj(i << 3) + zzg(i2);
    }

    public static int zzf(int i, long j) {
        return zzj(i << 3) + zzg(zzi(j));
    }

    public static int zzj(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public final void zzh(int i, long j) throws IOException {
        zzb(i, zzi(j));
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        return zzj(length) + length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static int zzb(int i, zzkt zzktVar, zzll zzllVar) {
        return (zzj(i << 3) << 1) + ((zzhq) zzktVar).zza(zzllVar);
    }

    public static int zzd(long j) {
        return zzg(j);
    }

    public static int zzg(int i, long j) {
        return zzj(i << 3) + zzg(j);
    }

    public static int zzi(int i) {
        return zzj(i << 3);
    }

    public final void zzh(long j) throws IOException {
        zzb(zzi(j));
    }

    public static int zzd(int i, zzia zziaVar) {
        return (zzj(8) << 1) + zzj(2, i) + zzc(3, zziaVar);
    }

    public static int zze(int i, long j) {
        return zzj(i << 3) + 8;
    }

    public static int zzf(long j) {
        return zzg(zzi(j));
    }

    public static int zza(int i, double d) {
        return zzj(i << 3) + 8;
    }

    @Deprecated
    public static int zzb(zzkt zzktVar) {
        return zzktVar.zzca();
    }

    public static int zzc(int i, long j) {
        return zzj(i << 3) + 8;
    }

    public static int zzg(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int zza(int i, float f) {
        return zzj(i << 3) + 4;
    }

    public static int zzb(int i, zzkb zzkbVar) {
        int zzj = zzj(i << 3);
        int zza2 = zzkbVar.zza();
        return zzj + zzj(zza2) + zza2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(int i, zzkt zzktVar, zzll zzllVar) {
        return zzj(i << 3) + zza(zzktVar, zzllVar);
    }

    public static int zza(int i, zzkb zzkbVar) {
        return (zzj(8) << 1) + zzj(2, i) + zzb(3, zzkbVar);
    }

    public static int zzc(zzkt zzktVar) {
        int zzca = zzktVar.zzca();
        return zzj(zzca) + zzca;
    }

    public static int zzb(int i, zzkt zzktVar) {
        return (zzj(8) << 1) + zzj(2, i) + zzj(24) + zzc(zzktVar);
    }

    public static int zza(zzkb zzkbVar) {
        int zza2 = zzkbVar.zza();
        return zzj(zza2) + zza2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzkt zzktVar, zzll zzllVar) {
        int zza2 = ((zzhq) zzktVar).zza(zzllVar);
        return zzj(zza2) + zza2;
    }

    public static int zzb(int i, String str) {
        return zzj(i << 3) + zzb(str);
    }

    final void zza(String str, zzmo zzmoVar) throws IOException {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzmoVar);
        byte[] bytes = str.getBytes(zzjm.zza);
        try {
            zzc(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzb(e);
        }
    }

    public static int zzb(String str) {
        int length;
        try {
            length = zzmk.zza(str);
        } catch (zzmo unused) {
            length = str.getBytes(zzjm.zza).length;
        }
        return zzj(length) + length;
    }

    public static zzit zzb(byte[] bArr) {
        return new zza(bArr, 0, bArr.length);
    }

    public final void zzb() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzb(boolean z) throws IOException {
        zza(z ? (byte) 1 : (byte) 0);
    }

    public final void zzb(int i, double d) throws IOException {
        zza(i, Double.doubleToRawLongBits(d));
    }

    public final void zzb(double d) throws IOException {
        zza(Double.doubleToRawLongBits(d));
    }

    public final void zzb(int i, float f) throws IOException {
        zza(i, Float.floatToRawIntBits(f));
    }

    public final void zzb(float f) throws IOException {
        zza(Float.floatToRawIntBits(f));
    }
}
