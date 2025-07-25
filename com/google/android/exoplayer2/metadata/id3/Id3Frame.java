package com.google.android.exoplayer2.metadata.id3;

import com.google.android.exoplayer2.metadata.Metadata;

/* loaded from: classes4.dex */
public abstract class Id3Frame implements Metadata.Entry {

    /* renamed from: id */
    public final String f33929id;

    public Id3Frame(String str) {
        this.f33929id = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f33929id;
    }
}
