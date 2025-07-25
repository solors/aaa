package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.gms:play-services-auth@@20.7.0 */
@SafeParcelable.Class(creator = "CredentialPickerConfigCreator")
@Deprecated
/* loaded from: classes4.dex */
public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new zbb();
    @SafeParcelable.Field(m72314id = 1000)
    final int zba;
    @SafeParcelable.Field(getter = "shouldShowAddAccountButton", m72314id = 1)
    private final boolean zbb;
    @SafeParcelable.Field(getter = "shouldShowCancelButton", m72314id = 2)
    private final boolean zbc;
    @SafeParcelable.Field(getter = "getPromptInternalId", m72314id = 4)
    private final int zbd;

    /* compiled from: com.google.android.gms:play-services-auth@@20.7.0 */
    /* loaded from: classes4.dex */
    public static class Builder {
        private boolean zba = false;
        private boolean zbb = true;
        private int zbc = 1;

        @NonNull
        public CredentialPickerConfig build() {
            return new CredentialPickerConfig(2, this.zba, this.zbb, false, this.zbc);
        }

        @NonNull
        @Deprecated
        public Builder setForNewAccount(boolean z) {
            int i = 1;
            if (true == z) {
                i = 3;
            }
            this.zbc = i;
            return this;
        }

        @NonNull
        public Builder setPrompt(int i) {
            this.zbc = i;
            return this;
        }

        @NonNull
        public Builder setShowAddAccountButton(boolean z) {
            this.zba = z;
            return this;
        }

        @NonNull
        public Builder setShowCancelButton(boolean z) {
            this.zbb = z;
            return this;
        }
    }

    /* compiled from: com.google.android.gms:play-services-auth@@20.7.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface Prompt {
        public static final int CONTINUE = 1;
        public static final int SIGN_IN = 2;
        public static final int SIGN_UP = 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public CredentialPickerConfig(@SafeParcelable.Param(m72313id = 1000) int i, @SafeParcelable.Param(m72313id = 1) boolean z, @SafeParcelable.Param(m72313id = 2) boolean z2, @SafeParcelable.Param(m72313id = 3) boolean z3, @SafeParcelable.Param(m72313id = 4) int i2) {
        this.zba = i;
        this.zbb = z;
        this.zbc = z2;
        if (i < 2) {
            this.zbd = true == z3 ? 3 : 1;
        } else {
            this.zbd = i2;
        }
    }

    @Deprecated
    public boolean isForNewAccount() {
        if (this.zbd == 3) {
            return true;
        }
        return false;
    }

    public boolean shouldShowAddAccountButton() {
        return this.zbb;
    }

    public boolean shouldShowCancelButton() {
        return this.zbc;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, shouldShowAddAccountButton());
        SafeParcelWriter.writeBoolean(parcel, 2, shouldShowCancelButton());
        SafeParcelWriter.writeBoolean(parcel, 3, isForNewAccount());
        SafeParcelWriter.writeInt(parcel, 4, this.zbd);
        SafeParcelWriter.writeInt(parcel, 1000, this.zba);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
