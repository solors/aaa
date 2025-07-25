package com.monetization.ads.base.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.monetization.ads.common.AdImpressionData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public final class MediationNetwork implements Parcelable {
    @NotNull
    public static final Parcelable.Creator<MediationNetwork> CREATOR = new C25442a();
    @NotNull

    /* renamed from: b */
    private final String f66044b;
    @NotNull

    /* renamed from: c */
    private final Map<String, String> f66045c;
    @Nullable

    /* renamed from: d */
    private final List<String> f66046d;
    @Nullable

    /* renamed from: e */
    private final List<String> f66047e;
    @Nullable

    /* renamed from: f */
    private final List<String> f66048f;
    @Nullable

    /* renamed from: g */
    private final AdImpressionData f66049g;
    @Nullable

    /* renamed from: h */
    private final Map<String, String> f66050h;

    /* renamed from: com.monetization.ads.base.model.MediationNetwork$a */
    /* loaded from: classes7.dex */
    public static final class C25442a implements Parcelable.Creator<MediationNetwork> {
        @Override // android.os.Parcelable.Creator
        public final MediationNetwork createFromParcel(Parcel parcel) {
            AdImpressionData createFromParcel;
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap2.put(parcel.readString(), parcel.readString());
            }
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = AdImpressionData.CREATOR.createFromParcel(parcel);
            }
            AdImpressionData adImpressionData = createFromParcel;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt2 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            return new MediationNetwork(readString, linkedHashMap2, createStringArrayList, createStringArrayList2, createStringArrayList3, adImpressionData, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final MediationNetwork[] newArray(int i) {
            return new MediationNetwork[i];
        }
    }

    public MediationNetwork(@NotNull String adapter, @NotNull Map<String, String> networkData, @Nullable List<String> list, @Nullable List<String> list2, @Nullable List<String> list3, @Nullable AdImpressionData adImpressionData, @Nullable Map<String, String> map) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(networkData, "networkData");
        this.f66044b = adapter;
        this.f66045c = networkData;
        this.f66046d = list;
        this.f66047e = list2;
        this.f66048f = list3;
        this.f66049g = adImpressionData;
        this.f66050h = map;
    }

    @Nullable
    /* renamed from: c */
    public final AdImpressionData m44558c() {
        return this.f66049g;
    }

    @Nullable
    /* renamed from: d */
    public final List<String> m44557d() {
        return this.f66048f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NotNull
    /* renamed from: e */
    public final String m44556e() {
        return this.f66044b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediationNetwork)) {
            return false;
        }
        MediationNetwork mediationNetwork = (MediationNetwork) obj;
        if (Intrinsics.m17075f(this.f66044b, mediationNetwork.f66044b) && Intrinsics.m17075f(this.f66045c, mediationNetwork.f66045c) && Intrinsics.m17075f(this.f66046d, mediationNetwork.f66046d) && Intrinsics.m17075f(this.f66047e, mediationNetwork.f66047e) && Intrinsics.m17075f(this.f66048f, mediationNetwork.f66048f) && Intrinsics.m17075f(this.f66049g, mediationNetwork.f66049g) && Intrinsics.m17075f(this.f66050h, mediationNetwork.f66050h)) {
            return true;
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public final Map<String, String> m44555f() {
        return this.f66050h;
    }

    @Nullable
    /* renamed from: g */
    public final List<String> m44554g() {
        return this.f66047e;
    }

    @Nullable
    /* renamed from: h */
    public final List<String> m44553h() {
        return this.f66046d;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = (this.f66045c.hashCode() + (this.f66044b.hashCode() * 31)) * 31;
        List<String> list = this.f66046d;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = (hashCode5 + hashCode) * 31;
        List<String> list2 = this.f66047e;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        List<String> list3 = this.f66048f;
        if (list3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        AdImpressionData adImpressionData = this.f66049g;
        if (adImpressionData == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = adImpressionData.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Map<String, String> map = this.f66050h;
        if (map != null) {
            i = map.hashCode();
        }
        return i5 + i;
    }

    @NotNull
    /* renamed from: i */
    public final Map<String, String> m44552i() {
        return this.f66045c;
    }

    @NotNull
    public final String toString() {
        String str = this.f66044b;
        Map<String, String> map = this.f66045c;
        List<String> list = this.f66046d;
        List<String> list2 = this.f66047e;
        List<String> list3 = this.f66048f;
        AdImpressionData adImpressionData = this.f66049g;
        Map<String, String> map2 = this.f66050h;
        return "MediationNetwork(adapter=" + str + ", networkData=" + map + ", impressionTrackingUrls=" + list + ", clickTrackingUrls=" + list2 + ", adResponseTrackingUrls=" + list3 + ", adImpressionData=" + adImpressionData + ", biddingInfo=" + map2 + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66044b);
        Map<String, String> map = this.f66045c;
        out.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            out.writeString(entry.getValue());
        }
        out.writeStringList(this.f66046d);
        out.writeStringList(this.f66047e);
        out.writeStringList(this.f66048f);
        AdImpressionData adImpressionData = this.f66049g;
        if (adImpressionData == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            adImpressionData.writeToParcel(out, i);
        }
        Map<String, String> map2 = this.f66050h;
        if (map2 == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(map2.size());
        for (Map.Entry<String, String> entry2 : map2.entrySet()) {
            out.writeString(entry2.getKey());
            out.writeString(entry2.getValue());
        }
    }
}
