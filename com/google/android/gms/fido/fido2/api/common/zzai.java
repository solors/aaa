package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@SafeParcelable.Class(creator = "PrfExtensionCreator")
/* loaded from: classes4.dex */
public final class zzai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzai> CREATOR = new zzaj();
    @NonNull
    @SafeParcelable.Field(getter = "getEvaluationPoints", m72314id = 1)
    private final byte[][] zza;

    @SafeParcelable.Constructor
    public zzai(@NonNull @SafeParcelable.Param(m72313id = 1) byte[][] bArr) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (bArr != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        if (1 != ((bArr.length & 1) ^ 1)) {
            z2 = false;
        } else {
            z2 = true;
        }
        Preconditions.checkArgument(z2);
        for (int i = 0; i < bArr.length; i += 2) {
            if (i != 0 && bArr[i] == null) {
                z3 = false;
            } else {
                z3 = true;
            }
            Preconditions.checkArgument(z3);
            int i2 = i + 1;
            if (bArr[i2] != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            Preconditions.checkArgument(z4);
            int length = bArr[i2].length;
            if (length != 32 && length != 64) {
                z5 = false;
            } else {
                z5 = true;
            }
            Preconditions.checkArgument(z5);
        }
        this.zza = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof zzai)) {
            return false;
        }
        return Arrays.deepEquals(this.zza, ((zzai) obj).zza);
    }

    public final int hashCode() {
        byte[][] bArr = this.zza;
        int length = bArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i ^= Objects.hashCode(bArr[i2]);
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArrayArray(parcel, 1, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
