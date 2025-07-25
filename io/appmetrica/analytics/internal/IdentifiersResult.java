package io.appmetrica.analytics.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.impl.C34300Wa;

/* loaded from: classes9.dex */
public class IdentifiersResult implements Parcelable {
    public static final Parcelable.Creator<IdentifiersResult> CREATOR = new C34300Wa();
    @Nullable
    public final String errorExplanation;
    @Nullable

    /* renamed from: id */
    public final String f95711id;
    @NonNull
    public final IdentifierStatus status;

    public IdentifiersResult(@Nullable String str, @NonNull IdentifierStatus identifierStatus, @Nullable String str2) {
        this.f95711id = str;
        this.status = identifierStatus;
        this.errorExplanation = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IdentifiersResult identifiersResult = (IdentifiersResult) obj;
        String str = this.f95711id;
        if (str == null ? identifiersResult.f95711id != null : !str.equals(identifiersResult.f95711id)) {
            return false;
        }
        if (this.status != identifiersResult.status) {
            return false;
        }
        String str2 = this.errorExplanation;
        if (str2 != null) {
            return str2.equals(identifiersResult.errorExplanation);
        }
        if (identifiersResult.errorExplanation == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        String str = this.f95711id;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int hashCode = (this.status.hashCode() + (i * 31)) * 31;
        String str2 = this.errorExplanation;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "IdentifiersResult{id='" + this.f95711id + "', status=" + this.status + ", errorExplanation='" + this.errorExplanation + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f95711id);
        parcel.writeString(this.status.getValue());
        parcel.writeString(this.errorExplanation);
    }
}
