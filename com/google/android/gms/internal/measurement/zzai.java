package com.google.android.gms.internal.measurement;

import androidx.exifinterface.media.ExifInterface;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzai implements zzaq {
    private final Double zza;

    public zzai(Double d) {
        if (d == null) {
            this.zza = Double.valueOf(Double.NaN);
        } else {
            this.zza = d;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzai)) {
            return false;
        }
        return this.zza.equals(((zzai) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return zzf();
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zza(String str, zzh zzhVar, List<zzaq> list) {
        if ("toString".equals(str)) {
            return new zzas(zzf());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", zzf(), str));
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zzc() {
        return new zzai(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean zzd() {
        boolean z;
        if (!Double.isNaN(this.zza.doubleValue()) && this.zza.doubleValue() != 0.0d) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double zze() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String zzf() {
        BigDecimal stripTrailingZeros;
        int scale;
        if (Double.isNaN(this.zza.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.zza.doubleValue())) {
            if (this.zza.doubleValue() > 0.0d) {
                return "Infinity";
            }
            return "-Infinity";
        }
        BigDecimal valueOf = BigDecimal.valueOf(this.zza.doubleValue());
        if (valueOf.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = valueOf.stripTrailingZeros();
        }
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        if (stripTrailingZeros.scale() > 0) {
            scale = stripTrailingZeros.precision();
        } else {
            scale = stripTrailingZeros.scale();
        }
        decimalFormat.setMinimumFractionDigits(scale - 1);
        String format = decimalFormat.format(stripTrailingZeros);
        int indexOf = format.indexOf(ExifInterface.LONGITUDE_EAST);
        if (indexOf > 0) {
            int parseInt = Integer.parseInt(format.substring(indexOf + 1));
            if ((parseInt < 0 && parseInt > -7) || (parseInt >= 0 && parseInt < 21)) {
                return stripTrailingZeros.toPlainString();
            }
            return format.replace("E-", "e-").replace(ExifInterface.LONGITUDE_EAST, "e+");
        }
        return format;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator<zzaq> zzh() {
        return null;
    }
}
