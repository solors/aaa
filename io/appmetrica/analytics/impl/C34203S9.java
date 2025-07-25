package io.appmetrica.analytics.impl;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* renamed from: io.appmetrica.analytics.impl.S9 */
/* loaded from: classes9.dex */
public final class C34203S9 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Boolean bool;
        Object readValue = parcel.readValue(Boolean.TYPE.getClassLoader());
        if (readValue instanceof Boolean) {
            bool = (Boolean) readValue;
        } else {
            bool = null;
        }
        return new C34227T9(bool, IdentifierStatus.Companion.from(parcel.readString()), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C34227T9[i];
    }
}
