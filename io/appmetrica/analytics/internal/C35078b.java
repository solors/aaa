package io.appmetrica.analytics.internal;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.impl.ResultReceiverC33812C6;

/* renamed from: io.appmetrica.analytics.internal.b */
/* loaded from: classes9.dex */
public final class C35078b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new CounterConfiguration((ContentValues) parcel.readBundle(ResultReceiverC33812C6.class.getClassLoader()).getParcelable("io.appmetrica.analytics.internal.CounterConfiguration.data"), 0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new CounterConfiguration[i];
    }
}
