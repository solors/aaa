package com.monetization.ads.exo.metadata.id3;

import com.monetization.ads.exo.metadata.Metadata;

/* loaded from: classes7.dex */
public abstract class Id3Frame implements Metadata.Entry {

    /* renamed from: b */
    public final String f66283b;

    public Id3Frame(String str) {
        this.f66283b = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f66283b;
    }
}
