package com.google.android.gms.internal.measurement;

import com.amazon.aps.shared.util.APSSharedUtil;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.2 */
/* loaded from: classes5.dex */
public abstract class zzia implements Serializable, Iterable<Byte> {
    public static final zzia zza = new zzij(zzjm.zzb);
    private static final zzid zzb = new zzim();
    private int zzc = 0;

    static {
        new zzic();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int zza(byte b) {
        return b & 255;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzia zzb(byte[] bArr) {
        return new zzij(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzif zzc(int i) {
        return new zzif(i);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int zzb2 = zzb();
            i = zzb(zzb2, 0, zzb2);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzhz(this);
    }

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzb());
        if (zzb() <= 50) {
            str = zzmb.zza(this);
        } else {
            str = zzmb.zza(zza(0, 47)) + APSSharedUtil.TRUNCATE_SEPARATOR;
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i);

    public abstract zzia zza(int i, int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(zzhx zzhxVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte zzb(int i);

    public abstract int zzb();

    protected abstract int zzb(int i, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i < 0) {
                throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
            } else if (i2 < i) {
                throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
            } else {
                throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
            }
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zza() {
        return this.zzc;
    }

    public static zzia zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    public static zzia zza(byte[] bArr, int i, int i2) {
        zza(i, i + i2, bArr.length);
        return new zzij(zzb.zza(bArr, i, i2));
    }

    public static zzia zza(String str) {
        return new zzij(str.getBytes(zzjm.zza));
    }
}
