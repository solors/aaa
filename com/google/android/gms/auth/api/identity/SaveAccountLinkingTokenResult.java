package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-auth@@20.7.0 */
@SafeParcelable.Class(creator = "SaveAccountLinkingTokenResultCreator")
/* loaded from: classes4.dex */
public class SaveAccountLinkingTokenResult extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<SaveAccountLinkingTokenResult> CREATOR = new zbq();
    @Nullable
    @SafeParcelable.Field(getter = "getPendingIntent", m72314id = 1)
    private final PendingIntent zba;

    @SafeParcelable.Constructor
    public SaveAccountLinkingTokenResult(@Nullable @SafeParcelable.Param(m72313id = 1) PendingIntent pendingIntent) {
        this.zba = pendingIntent;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenResult)) {
            return false;
        }
        return Objects.equal(this.zba, ((SaveAccountLinkingTokenResult) obj).zba);
    }

    @Nullable
    public PendingIntent getPendingIntent() {
        return this.zba;
    }

    public boolean hasResolution() {
        if (this.zba != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.zba);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getPendingIntent(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
