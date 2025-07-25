package com.monetization.ads.base.model.reward;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public final class RewardData implements Parcelable {
    @NotNull
    public static final Parcelable.Creator<RewardData> CREATOR = new C25454b();

    /* renamed from: b */
    private final boolean f66068b;
    @Nullable

    /* renamed from: c */
    private final ClientSideReward f66069c;
    @Nullable

    /* renamed from: d */
    private final ServerSideReward f66070d;

    /* renamed from: com.monetization.ads.base.model.reward.RewardData$a */
    /* loaded from: classes7.dex */
    public static final class C25453a {

        /* renamed from: a */
        private boolean f66071a;
        @Nullable

        /* renamed from: b */
        private ClientSideReward f66072b;
        @Nullable

        /* renamed from: c */
        private ServerSideReward f66073c;

        @NotNull
        /* renamed from: a */
        public final RewardData m44534a() {
            return new RewardData(this.f66071a, this.f66072b, this.f66073c);
        }

        @NotNull
        /* renamed from: a */
        public final C25453a m44531a(boolean z) {
            this.f66071a = z;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C25453a m44533a(@Nullable ClientSideReward clientSideReward) {
            this.f66072b = clientSideReward;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C25453a m44532a(@Nullable ServerSideReward serverSideReward) {
            this.f66073c = serverSideReward;
            return this;
        }
    }

    /* renamed from: com.monetization.ads.base.model.reward.RewardData$b */
    /* loaded from: classes7.dex */
    public static final class C25454b implements Parcelable.Creator<RewardData> {
        @Override // android.os.Parcelable.Creator
        public final RewardData createFromParcel(Parcel parcel) {
            boolean z;
            ClientSideReward createFromParcel;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            ServerSideReward serverSideReward = null;
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = ClientSideReward.CREATOR.createFromParcel(parcel);
            }
            ClientSideReward clientSideReward = createFromParcel;
            if (parcel.readInt() != 0) {
                serverSideReward = ServerSideReward.CREATOR.createFromParcel(parcel);
            }
            return new RewardData(z, clientSideReward, serverSideReward);
        }

        @Override // android.os.Parcelable.Creator
        public final RewardData[] newArray(int i) {
            return new RewardData[i];
        }
    }

    public RewardData(boolean z, @Nullable ClientSideReward clientSideReward, @Nullable ServerSideReward serverSideReward) {
        this.f66068b = z;
        this.f66069c = clientSideReward;
        this.f66070d = serverSideReward;
    }

    @Nullable
    /* renamed from: c */
    public final ClientSideReward m44537c() {
        return this.f66069c;
    }

    @Nullable
    /* renamed from: d */
    public final ServerSideReward m44536d() {
        return this.f66070d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean m44535e() {
        return this.f66068b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardData)) {
            return false;
        }
        RewardData rewardData = (RewardData) obj;
        if (this.f66068b == rewardData.f66068b && Intrinsics.m17075f(this.f66069c, rewardData.f66069c) && Intrinsics.m17075f(this.f66070d, rewardData.f66070d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Boolean.hashCode(this.f66068b) * 31;
        ClientSideReward clientSideReward = this.f66069c;
        int i = 0;
        if (clientSideReward == null) {
            hashCode = 0;
        } else {
            hashCode = clientSideReward.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        ServerSideReward serverSideReward = this.f66070d;
        if (serverSideReward != null) {
            i = serverSideReward.hashCode();
        }
        return i2 + i;
    }

    @NotNull
    public final String toString() {
        boolean z = this.f66068b;
        ClientSideReward clientSideReward = this.f66069c;
        ServerSideReward serverSideReward = this.f66070d;
        return "RewardData(serverSideRewardType=" + z + ", clientSideReward=" + clientSideReward + ", serverSideReward=" + serverSideReward + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.f66068b ? 1 : 0);
        ClientSideReward clientSideReward = this.f66069c;
        if (clientSideReward == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            clientSideReward.writeToParcel(out, i);
        }
        ServerSideReward serverSideReward = this.f66070d;
        if (serverSideReward == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        serverSideReward.writeToParcel(out, i);
    }
}
