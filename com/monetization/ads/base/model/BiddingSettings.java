package com.monetization.ads.base.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.monetization.ads.base.model.mediation.prefetch.config.MediationPrefetchSettings;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public final class BiddingSettings implements Parcelable {
    @NotNull
    public static final Parcelable.Creator<BiddingSettings> CREATOR = new C25440a();
    @NotNull

    /* renamed from: b */
    private final List<AdUnitIdBiddingSettings> f66040b;
    @Nullable

    /* renamed from: c */
    private final MediationPrefetchSettings f66041c;

    /* renamed from: com.monetization.ads.base.model.BiddingSettings$a */
    /* loaded from: classes7.dex */
    public static final class C25440a implements Parcelable.Creator<BiddingSettings> {
        @Override // android.os.Parcelable.Creator
        public final BiddingSettings createFromParcel(Parcel parcel) {
            MediationPrefetchSettings createFromParcel;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(AdUnitIdBiddingSettings.CREATOR.createFromParcel(parcel));
            }
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = MediationPrefetchSettings.CREATOR.createFromParcel(parcel);
            }
            return new BiddingSettings(arrayList, createFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BiddingSettings[] newArray(int i) {
            return new BiddingSettings[i];
        }
    }

    public BiddingSettings(@NotNull ArrayList adUnitIdBiddingSettingsList, @Nullable MediationPrefetchSettings mediationPrefetchSettings) {
        Intrinsics.checkNotNullParameter(adUnitIdBiddingSettingsList, "adUnitIdBiddingSettingsList");
        this.f66040b = adUnitIdBiddingSettingsList;
        this.f66041c = mediationPrefetchSettings;
    }

    @NotNull
    /* renamed from: c */
    public final List<AdUnitIdBiddingSettings> m44562c() {
        return this.f66040b;
    }

    @Nullable
    /* renamed from: d */
    public final MediationPrefetchSettings m44561d() {
        return this.f66041c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiddingSettings)) {
            return false;
        }
        BiddingSettings biddingSettings = (BiddingSettings) obj;
        if (Intrinsics.m17075f(this.f66040b, biddingSettings.f66040b) && Intrinsics.m17075f(this.f66041c, biddingSettings.f66041c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f66040b.hashCode() * 31;
        MediationPrefetchSettings mediationPrefetchSettings = this.f66041c;
        if (mediationPrefetchSettings == null) {
            hashCode = 0;
        } else {
            hashCode = mediationPrefetchSettings.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @NotNull
    public final String toString() {
        List<AdUnitIdBiddingSettings> list = this.f66040b;
        MediationPrefetchSettings mediationPrefetchSettings = this.f66041c;
        return "BiddingSettings(adUnitIdBiddingSettingsList=" + list + ", mediationPrefetchSettings=" + mediationPrefetchSettings + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        List<AdUnitIdBiddingSettings> list = this.f66040b;
        out.writeInt(list.size());
        for (AdUnitIdBiddingSettings adUnitIdBiddingSettings : list) {
            adUnitIdBiddingSettings.writeToParcel(out, i);
        }
        MediationPrefetchSettings mediationPrefetchSettings = this.f66041c;
        if (mediationPrefetchSettings == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        mediationPrefetchSettings.writeToParcel(out, i);
    }
}
