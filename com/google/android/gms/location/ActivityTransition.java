package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@SafeParcelable.Class(creator = "ActivityTransitionCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public class ActivityTransition extends AbstractSafeParcelable {
    public static final int ACTIVITY_TRANSITION_ENTER = 0;
    public static final int ACTIVITY_TRANSITION_EXIT = 1;
    @NonNull
    public static final Parcelable.Creator<ActivityTransition> CREATOR = new zzl();
    @SafeParcelable.Field(getter = "getActivityType", m72314id = 1)
    private final int zza;
    @SafeParcelable.Field(getter = "getTransitionType", m72314id = 2)
    private final int zzb;

    /* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    /* loaded from: classes5.dex */
    public static class Builder {
        private int zza = -1;
        private int zzb = -1;

        @NonNull
        public ActivityTransition build() {
            boolean z;
            boolean z2 = true;
            if (this.zza != -1) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "Activity type not set.");
            if (this.zzb == -1) {
                z2 = false;
            }
            Preconditions.checkState(z2, "Activity transition type not set.");
            return new ActivityTransition(this.zza, this.zzb);
        }

        @NonNull
        public Builder setActivityTransition(int i) {
            ActivityTransition.zza(i);
            this.zzb = i;
            return this;
        }

        @NonNull
        public Builder setActivityType(int i) {
            this.zza = i;
            return this;
        }
    }

    /* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface SupportedActivityTransition {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public ActivityTransition(@SafeParcelable.Param(m72313id = 1) int i, @SafeParcelable.Param(m72313id = 2) int i2) {
        this.zza = i;
        this.zzb = i2;
    }

    public static void zza(int i) {
        boolean z = false;
        if (i >= 0 && i <= 1) {
            z = true;
        }
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append("Transition type ");
        sb2.append(i);
        sb2.append(" is not valid.");
        Preconditions.checkArgument(z, sb2.toString());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransition)) {
            return false;
        }
        ActivityTransition activityTransition = (ActivityTransition) obj;
        if (this.zza == activityTransition.zza && this.zzb == activityTransition.zzb) {
            return true;
        }
        return false;
    }

    public int getActivityType() {
        return this.zza;
    }

    public int getTransitionType() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb));
    }

    @NonNull
    public String toString() {
        int i = this.zza;
        int i2 = this.zzb;
        StringBuilder sb2 = new StringBuilder(75);
        sb2.append("ActivityTransition [mActivityType=");
        sb2.append(i);
        sb2.append(", mTransitionType=");
        sb2.append(i2);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getActivityType());
        SafeParcelWriter.writeInt(parcel, 2, getTransitionType());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
