package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Va */
/* loaded from: classes9.dex */
public final class C34276Va implements Parcelable {
    public static final Parcelable.Creator<C34276Va> CREATOR = new C34252Ua();

    /* renamed from: a */
    public final ResultReceiver f93596a;

    /* renamed from: b */
    public final List f93597b;

    /* renamed from: c */
    public final HashMap f93598c;

    public C34276Va(ResultReceiverC33812C6 resultReceiverC33812C6, List list, Map map) {
        HashMap hashMap;
        this.f93597b = list;
        this.f93596a = resultReceiverC33812C6;
        if (map == null) {
            hashMap = new HashMap();
        } else {
            hashMap = new HashMap(map);
        }
        this.f93598c = hashMap;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver", this.f93596a);
        if (this.f93597b != null) {
            bundle.putStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList", new ArrayList<>(this.f93597b));
        }
        HashMap hashMap = this.f93598c;
        if (hashMap != null) {
            bundle.putString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification", AbstractC34024Kl.m22488a((Map) hashMap));
        }
        parcel.writeBundle(bundle);
    }

    public C34276Va(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(ResultReceiverC33812C6.class.getClassLoader());
        if (readBundle != null) {
            this.f93596a = (ResultReceiver) readBundle.getParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver");
            this.f93597b = readBundle.getStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList");
            this.f93598c = AbstractC34024Kl.m22490a(readBundle.getString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification"));
            return;
        }
        this.f93598c = new HashMap();
    }
}
