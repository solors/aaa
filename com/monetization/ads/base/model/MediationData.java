package com.monetization.ads.base.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes7.dex */
public final class MediationData implements Parcelable {
    @NotNull
    public static final Parcelable.Creator<MediationData> CREATOR = new C25441a();
    @NotNull

    /* renamed from: b */
    private final List<MediationNetwork> f66042b;
    @NotNull

    /* renamed from: c */
    private Map<String, String> f66043c;

    /* renamed from: com.monetization.ads.base.model.MediationData$a */
    /* loaded from: classes7.dex */
    public static final class C25441a implements Parcelable.Creator<MediationData> {
        @Override // android.os.Parcelable.Creator
        public final MediationData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(MediationNetwork.CREATOR.createFromParcel(parcel));
            }
            int readInt2 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new MediationData(arrayList, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final MediationData[] newArray(int i) {
            return new MediationData[i];
        }
    }

    public MediationData(@NotNull ArrayList mediationNetworks, @NotNull Map passbackParameters) {
        Intrinsics.checkNotNullParameter(mediationNetworks, "mediationNetworks");
        Intrinsics.checkNotNullParameter(passbackParameters, "passbackParameters");
        this.f66042b = mediationNetworks;
        this.f66043c = passbackParameters;
    }

    @NotNull
    /* renamed from: c */
    public final List<MediationNetwork> m44560c() {
        return this.f66042b;
    }

    @NotNull
    /* renamed from: d */
    public final Map<String, String> m44559d() {
        return this.f66043c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        List<MediationNetwork> list = this.f66042b;
        out.writeInt(list.size());
        for (MediationNetwork mediationNetwork : list) {
            mediationNetwork.writeToParcel(out, i);
        }
        Map<String, String> map = this.f66043c;
        out.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            out.writeString(entry.getValue());
        }
    }
}
