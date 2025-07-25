package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.errorprone.annotations.InlineMe;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@KeepForSdk
@SafeParcelable.Class(creator = "MethodInvocationCreator")
/* loaded from: classes4.dex */
public class MethodInvocation extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new zan();
    @SafeParcelable.Field(getter = "getMethodKey", m72314id = 1)
    private final int zaa;
    @SafeParcelable.Field(getter = "getResultStatusCode", m72314id = 2)
    private final int zab;
    @SafeParcelable.Field(getter = "getConnectionResultStatusCode", m72314id = 3)
    private final int zac;
    @SafeParcelable.Field(getter = "getStartTimeMillis", m72314id = 4)
    private final long zad;
    @SafeParcelable.Field(getter = "getEndTimeMillis", m72314id = 5)
    private final long zae;
    @Nullable
    @SafeParcelable.Field(getter = "getCallingModuleId", m72314id = 6)
    private final String zaf;
    @Nullable
    @SafeParcelable.Field(getter = "getCallingEntryPoint", m72314id = 7)
    private final String zag;
    @SafeParcelable.Field(defaultValue = "0", getter = "getServiceId", m72314id = 8)
    private final int zah;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getLatencyMillis", m72314id = 9)
    private final int zai;

    @InlineMe(replacement = "this(methodKey, resultStatusCode, connectionResultStatusCode, startTimeMillis, endTimeMillis, callingModuleId, callingEntryPoint, serviceId, -1)")
    @KeepForSdk
    @Deprecated
    public MethodInvocation(int i, int i2, int i3, long j, long j2, @Nullable String str, @Nullable String str2, int i4) {
        this(i, i2, i3, j, j2, str, str2, i4, -1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int i2 = this.zaa;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeInt(parcel, 2, this.zab);
        SafeParcelWriter.writeInt(parcel, 3, this.zac);
        SafeParcelWriter.writeLong(parcel, 4, this.zad);
        SafeParcelWriter.writeLong(parcel, 5, this.zae);
        SafeParcelWriter.writeString(parcel, 6, this.zaf, false);
        SafeParcelWriter.writeString(parcel, 7, this.zag, false);
        SafeParcelWriter.writeInt(parcel, 8, this.zah);
        SafeParcelWriter.writeInt(parcel, 9, this.zai);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public MethodInvocation(@SafeParcelable.Param(m72313id = 1) int i, @SafeParcelable.Param(m72313id = 2) int i2, @SafeParcelable.Param(m72313id = 3) int i3, @SafeParcelable.Param(m72313id = 4) long j, @SafeParcelable.Param(m72313id = 5) long j2, @Nullable @SafeParcelable.Param(m72313id = 6) String str, @Nullable @SafeParcelable.Param(m72313id = 7) String str2, @SafeParcelable.Param(m72313id = 8) int i4, @SafeParcelable.Param(m72313id = 9) int i5) {
        this.zaa = i;
        this.zab = i2;
        this.zac = i3;
        this.zad = j;
        this.zae = j2;
        this.zaf = str;
        this.zag = str2;
        this.zah = i4;
        this.zai = i5;
    }
}
