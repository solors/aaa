package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.C4061af;
import com.applovin.impl.C5631ud;
import com.facebook.share.internal.ShareConstants;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.applovin.impl.dr */
/* loaded from: classes2.dex */
public final class C4285dr implements C4061af.InterfaceC4063b {
    public static final Parcelable.Creator<C4285dr> CREATOR = new C4286a();

    /* renamed from: a */
    public final String f5705a;

    /* renamed from: b */
    public final String f5706b;

    /* renamed from: com.applovin.impl.dr$a */
    /* loaded from: classes2.dex */
    class C4286a implements Parcelable.Creator {
        C4286a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4285dr[] newArray(int i) {
            return new C4285dr[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4285dr createFromParcel(Parcel parcel) {
            return new C4285dr(parcel);
        }
    }

    C4285dr(Parcel parcel) {
        this.f5705a = (String) AbstractC5863xp.m93017a((Object) parcel.readString());
        this.f5706b = (String) AbstractC5863xp.m93017a((Object) parcel.readString());
    }

    @Override // com.applovin.impl.C4061af.InterfaceC4063b
    /* renamed from: a */
    public void mo92341a(C5631ud.C5633b c5633b) {
        String str = this.f5705a;
        str.hashCode();
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
                c5633b.m94131b(this.f5706b);
                return;
            case 1:
                c5633b.m94104k(this.f5706b);
                return;
            case 2:
                c5633b.m94116g(this.f5706b);
                return;
            case 3:
                c5633b.m94139a(this.f5706b);
                return;
            case 4:
                c5633b.m94128c(this.f5706b);
                return;
            default:
                return;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4285dr.class != obj.getClass()) {
            return false;
        }
        C4285dr c4285dr = (C4285dr) obj;
        if (this.f5705a.equals(c4285dr.f5705a) && this.f5706b.equals(c4285dr.f5706b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f5705a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f5706b.hashCode();
    }

    public String toString() {
        return "VC: " + this.f5705a + "=" + this.f5706b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5705a);
        parcel.writeString(this.f5706b);
    }

    public C4285dr(String str, String str2) {
        this.f5705a = str;
        this.f5706b = str2;
    }
}
