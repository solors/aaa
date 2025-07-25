package com.monetization.ads.base.model.reward;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public final class ServerSideReward implements Parcelable {
    @NotNull
    public static final Parcelable.Creator<ServerSideReward> CREATOR = new C25455a();
    @NotNull

    /* renamed from: b */
    private final String f66074b;

    /* renamed from: com.monetization.ads.base.model.reward.ServerSideReward$a */
    /* loaded from: classes7.dex */
    public static final class C25455a implements Parcelable.Creator<ServerSideReward> {
        @Override // android.os.Parcelable.Creator
        public final ServerSideReward createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ServerSideReward(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ServerSideReward[] newArray(int i) {
            return new ServerSideReward[i];
        }
    }

    public ServerSideReward(@NotNull String rewardUrl) {
        Intrinsics.checkNotNullParameter(rewardUrl, "rewardUrl");
        this.f66074b = rewardUrl;
    }

    @NotNull
    /* renamed from: c */
    public final String m44530c() {
        return this.f66074b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ServerSideReward) && Intrinsics.m17075f(this.f66074b, ((ServerSideReward) obj).f66074b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f66074b.hashCode();
    }

    @NotNull
    public final String toString() {
        String str = this.f66074b;
        return "ServerSideReward(rewardUrl=" + str + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66074b);
    }
}
