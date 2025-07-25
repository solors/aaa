package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@SafeParcelable.Class(creator = "UvmEntryCreator")
/* loaded from: classes4.dex */
public class UvmEntry extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<UvmEntry> CREATOR = new zzba();
    @SafeParcelable.Field(getter = "getUserVerificationMethod", m72314id = 1)
    private final int zza;
    @SafeParcelable.Field(getter = "getKeyProtectionType", m72314id = 2)
    private final short zzb;
    @SafeParcelable.Field(getter = "getMatcherProtectionType", m72314id = 3)
    private final short zzc;

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    /* loaded from: classes4.dex */
    public static final class Builder {
        private int zza;
        private short zzb;
        private short zzc;

        @NonNull
        public UvmEntry build() {
            return new UvmEntry(this.zza, this.zzb, this.zzc);
        }

        @NonNull
        public Builder setKeyProtectionType(short s) {
            this.zzb = s;
            return this;
        }

        @NonNull
        public Builder setMatcherProtectionType(short s) {
            this.zzc = s;
            return this;
        }

        @NonNull
        public Builder setUserVerificationMethod(int i) {
            this.zza = i;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public UvmEntry(@SafeParcelable.Param(m72313id = 1) int i, @SafeParcelable.Param(m72313id = 2) short s, @SafeParcelable.Param(m72313id = 3) short s2) {
        this.zza = i;
        this.zzb = s;
        this.zzc = s2;
    }

    public boolean equals(@NonNull Object obj) {
        if (!(obj instanceof UvmEntry)) {
            return false;
        }
        UvmEntry uvmEntry = (UvmEntry) obj;
        if (this.zza != uvmEntry.zza || this.zzb != uvmEntry.zzb || this.zzc != uvmEntry.zzc) {
            return false;
        }
        return true;
    }

    public short getKeyProtectionType() {
        return this.zzb;
    }

    public short getMatcherProtectionType() {
        return this.zzc;
    }

    public int getUserVerificationMethod() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Short.valueOf(this.zzb), Short.valueOf(this.zzc));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getUserVerificationMethod());
        SafeParcelWriter.writeShort(parcel, 2, getKeyProtectionType());
        SafeParcelWriter.writeShort(parcel, 3, getMatcherProtectionType());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
