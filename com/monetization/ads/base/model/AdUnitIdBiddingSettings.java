package com.monetization.ads.base.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.C31097p9;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public final class AdUnitIdBiddingSettings implements Parcelable {
    @NotNull
    public static final Parcelable.Creator<AdUnitIdBiddingSettings> CREATOR = new C25439a();
    @NotNull

    /* renamed from: b */
    private final String f66037b;
    @NotNull

    /* renamed from: c */
    private final List<MediationNetwork> f66038c;
    @NotNull

    /* renamed from: d */
    private final String f66039d;

    /* renamed from: com.monetization.ads.base.model.AdUnitIdBiddingSettings$a */
    /* loaded from: classes7.dex */
    public static final class C25439a implements Parcelable.Creator<AdUnitIdBiddingSettings> {
        @Override // android.os.Parcelable.Creator
        public final AdUnitIdBiddingSettings createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(MediationNetwork.CREATOR.createFromParcel(parcel));
            }
            return new AdUnitIdBiddingSettings(readString, parcel.readString(), arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AdUnitIdBiddingSettings[] newArray(int i) {
            return new AdUnitIdBiddingSettings[i];
        }
    }

    public AdUnitIdBiddingSettings(@NotNull String adUnitId, @NotNull String rawData, @NotNull ArrayList mediationNetworks) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(mediationNetworks, "mediationNetworks");
        Intrinsics.checkNotNullParameter(rawData, "rawData");
        this.f66037b = adUnitId;
        this.f66038c = mediationNetworks;
        this.f66039d = rawData;
    }

    @NotNull
    /* renamed from: c */
    public final String m44566c() {
        return this.f66037b;
    }

    @NotNull
    /* renamed from: d */
    public final String m44565d() {
        return this.f66039d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NotNull
    /* renamed from: e */
    public final String m44564e() {
        return this.f66037b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdUnitIdBiddingSettings)) {
            return false;
        }
        AdUnitIdBiddingSettings adUnitIdBiddingSettings = (AdUnitIdBiddingSettings) obj;
        if (Intrinsics.m17075f(this.f66037b, adUnitIdBiddingSettings.f66037b) && Intrinsics.m17075f(this.f66038c, adUnitIdBiddingSettings.f66038c) && Intrinsics.m17075f(this.f66039d, adUnitIdBiddingSettings.f66039d)) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: f */
    public final List<MediationNetwork> m44563f() {
        return this.f66038c;
    }

    public final int hashCode() {
        return this.f66039d.hashCode() + C31097p9.m30807a(this.f66038c, this.f66037b.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f66037b;
        List<MediationNetwork> list = this.f66038c;
        String str2 = this.f66039d;
        return "AdUnitIdBiddingSettings(adUnitId=" + str + ", mediationNetworks=" + list + ", rawData=" + str2 + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66037b);
        List<MediationNetwork> list = this.f66038c;
        out.writeInt(list.size());
        for (MediationNetwork mediationNetwork : list) {
            mediationNetwork.writeToParcel(out, i);
        }
        out.writeString(this.f66039d);
    }
}
