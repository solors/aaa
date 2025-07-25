package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@SafeParcelable.Class(creator = "GoogleThirdPartyPaymentExtensionCreator")
/* loaded from: classes4.dex */
public class GoogleThirdPartyPaymentExtension extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<GoogleThirdPartyPaymentExtension> CREATOR = new zzaf();
    @NonNull
    @SafeParcelable.Field(getter = "getThirdPartyPayment", m72314id = 1)
    private final boolean zza;

    @SafeParcelable.Constructor
    public GoogleThirdPartyPaymentExtension(@SafeParcelable.Param(m72313id = 1) boolean z) {
        this.zza = z;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof GoogleThirdPartyPaymentExtension) || this.zza != ((GoogleThirdPartyPaymentExtension) obj).getThirdPartyPayment()) {
            return false;
        }
        return true;
    }

    public boolean getThirdPartyPayment() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zza));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, getThirdPartyPayment());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
