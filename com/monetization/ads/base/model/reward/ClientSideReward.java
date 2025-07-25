package com.monetization.ads.base.model.reward;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public final class ClientSideReward implements Parcelable {
    @NotNull
    public static final Parcelable.Creator<ClientSideReward> CREATOR = new C25452a();

    /* renamed from: b */
    private final int f66066b;
    @NotNull

    /* renamed from: c */
    private final String f66067c;

    /* renamed from: com.monetization.ads.base.model.reward.ClientSideReward$a */
    /* loaded from: classes7.dex */
    public static final class C25452a implements Parcelable.Creator<ClientSideReward> {
        @Override // android.os.Parcelable.Creator
        public final ClientSideReward createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ClientSideReward(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ClientSideReward[] newArray(int i) {
            return new ClientSideReward[i];
        }
    }

    public ClientSideReward(int i, @NotNull String rewardType) {
        Intrinsics.checkNotNullParameter(rewardType, "rewardType");
        this.f66066b = i;
        this.f66067c = rewardType;
    }

    /* renamed from: c */
    public final int m44539c() {
        return this.f66066b;
    }

    @NotNull
    /* renamed from: d */
    public final String m44538d() {
        return this.f66067c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientSideReward)) {
            return false;
        }
        ClientSideReward clientSideReward = (ClientSideReward) obj;
        if (this.f66066b == clientSideReward.f66066b && Intrinsics.m17075f(this.f66067c, clientSideReward.f66067c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f66067c.hashCode() + (Integer.hashCode(this.f66066b) * 31);
    }

    @NotNull
    public final String toString() {
        int i = this.f66066b;
        String str = this.f66067c;
        return "ClientSideReward(rewardAmount=" + i + ", rewardType=" + str + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.f66066b);
        out.writeString(this.f66067c);
    }
}
