package com.monetization.ads.exo.metadata.vorbis;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class VorbisComment extends com.monetization.ads.exo.metadata.flac.VorbisComment {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new C25568a();

    /* renamed from: com.monetization.ads.exo.metadata.vorbis.VorbisComment$a */
    /* loaded from: classes7.dex */
    final class C25568a implements Parcelable.Creator<VorbisComment> {
        C25568a() {
        }

        @Override // android.os.Parcelable.Creator
        public final VorbisComment createFromParcel(Parcel parcel) {
            return new VorbisComment(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final VorbisComment[] newArray(int i) {
            return new VorbisComment[i];
        }
    }

    public VorbisComment(String str, String str2) {
        super(str, str2);
    }

    VorbisComment(Parcel parcel) {
        super(parcel);
    }
}
