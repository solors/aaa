package com.monetization.ads.exo.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.facebook.share.internal.ShareConstants;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.monetization.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.C31014o3;
import com.yandex.mobile.ads.impl.mt0;
import com.yandex.mobile.ads.impl.y32;

@Deprecated
/* loaded from: classes7.dex */
public class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new C25529a();

    /* renamed from: b */
    public final String f66249b;

    /* renamed from: c */
    public final String f66250c;

    /* renamed from: com.monetization.ads.exo.metadata.flac.VorbisComment$a */
    /* loaded from: classes7.dex */
    final class C25529a implements Parcelable.Creator<VorbisComment> {
        C25529a() {
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
        this.f66249b = str;
        this.f66250c = str2;
    }

    @Override // com.monetization.ads.exo.metadata.Metadata.Entry
    /* renamed from: a */
    public final void mo44375a(mt0.C30881a c30881a) {
        String str = this.f66249b;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c = 0;
                    break;
                }
                break;
            case 79833656:
                if (str.equals(ShareConstants.TITLE)) {
                    c = 1;
                    break;
                }
                break;
            case 428414940:
                if (str.equals(ShareConstants.DESCRIPTION)) {
                    c = 2;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c = 3;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                c30881a.m31819b(this.f66250c);
                return;
            case 1:
                c30881a.m31792i(this.f66250c);
                return;
            case 2:
                c30881a.m31803f(this.f66250c);
                return;
            case 3:
                c30881a.m31823a(this.f66250c);
                return;
            case 4:
                c30881a.m31815c(this.f66250c);
                return;
            default:
                return;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VorbisComment vorbisComment = (VorbisComment) obj;
        if (this.f66249b.equals(vorbisComment.f66249b) && this.f66250c.equals(vorbisComment.f66250c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f66250c.hashCode() + C31014o3.m31189a(this.f66249b, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
    }

    public final String toString() {
        return "VC: " + this.f66249b + "=" + this.f66250c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f66249b);
        parcel.writeString(this.f66250c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public VorbisComment(Parcel parcel) {
        this.f66249b = (String) y32.m27077a(parcel.readString());
        this.f66250c = (String) y32.m27077a(parcel.readString());
    }
}
