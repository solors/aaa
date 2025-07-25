package com.monetization.ads.exo.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.monetization.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.C30937nf;
import com.yandex.mobile.ads.impl.mt0;
import com.yandex.mobile.ads.impl.y32;

/* loaded from: classes7.dex */
public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator<IcyHeaders> CREATOR = new C25530a();

    /* renamed from: b */
    public final int f66251b;
    @Nullable

    /* renamed from: c */
    public final String f66252c;
    @Nullable

    /* renamed from: d */
    public final String f66253d;
    @Nullable

    /* renamed from: e */
    public final String f66254e;

    /* renamed from: f */
    public final boolean f66255f;

    /* renamed from: g */
    public final int f66256g;

    /* renamed from: com.monetization.ads.exo.metadata.icy.IcyHeaders$a */
    /* loaded from: classes7.dex */
    final class C25530a implements Parcelable.Creator<IcyHeaders> {
        C25530a() {
        }

        @Override // android.os.Parcelable.Creator
        public final IcyHeaders createFromParcel(Parcel parcel) {
            return new IcyHeaders(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final IcyHeaders[] newArray(int i) {
            return new IcyHeaders[i];
        }
    }

    public IcyHeaders(int i, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z, int i2) {
        C30937nf.m31567a(i2 == -1 || i2 > 0);
        this.f66251b = i;
        this.f66252c = str;
        this.f66253d = str2;
        this.f66254e = str3;
        this.f66255f = z;
        this.f66256g = i2;
    }

    @Override // com.monetization.ads.exo.metadata.Metadata.Entry
    /* renamed from: a */
    public final void mo44375a(mt0.C30881a c30881a) {
        String str = this.f66253d;
        if (str != null) {
            c30881a.m31795h(str);
        }
        String str2 = this.f66252c;
        if (str2 != null) {
            c30881a.m31799g(str2);
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
        if (obj == null || IcyHeaders.class != obj.getClass()) {
            return false;
        }
        IcyHeaders icyHeaders = (IcyHeaders) obj;
        if (this.f66251b == icyHeaders.f66251b && y32.m27076a(this.f66252c, icyHeaders.f66252c) && y32.m27076a(this.f66253d, icyHeaders.f66253d) && y32.m27076a(this.f66254e, icyHeaders.f66254e) && this.f66255f == icyHeaders.f66255f && this.f66256g == icyHeaders.f66256g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = (this.f66251b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f66252c;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = (i3 + i) * 31;
        String str2 = this.f66253d;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        String str3 = this.f66254e;
        if (str3 != null) {
            i4 = str3.hashCode();
        }
        return ((((i6 + i4) * 31) + (this.f66255f ? 1 : 0)) * 31) + this.f66256g;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f66253d + "\", genre=\"" + this.f66252c + "\", bitrate=" + this.f66251b + ", metadataInterval=" + this.f66256g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f66251b);
        parcel.writeString(this.f66252c);
        parcel.writeString(this.f66253d);
        parcel.writeString(this.f66254e);
        boolean z = this.f66255f;
        int i2 = y32.f88010a;
        parcel.writeInt(z ? 1 : 0);
        parcel.writeInt(this.f66256g);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    @androidx.annotation.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.monetization.ads.exo.metadata.icy.IcyHeaders m44376a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r15) {
        /*
            java.lang.String r0 = "Invalid metadata interval: "
            java.lang.String r1 = "Invalid bitrate: "
            java.lang.String r2 = "icy-br"
            java.lang.Object r2 = r15.get(r2)
            java.util.List r2 = (java.util.List) r2
            java.lang.String r3 = "IcyHeaders"
            r4 = 1
            r5 = 0
            r6 = -1
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r2.get(r5)
            java.lang.String r2 = (java.lang.String) r2
            int r7 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L33
            int r7 = r7 * 1000
            if (r7 <= 0) goto L23
            r1 = r4
            goto L3a
        L23:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L34
            r8.<init>(r1)     // Catch: java.lang.NumberFormatException -> L34
            r8.append(r2)     // Catch: java.lang.NumberFormatException -> L34
            java.lang.String r1 = r8.toString()     // Catch: java.lang.NumberFormatException -> L34
            com.yandex.mobile.ads.impl.gq0.m33792d(r3, r1)     // Catch: java.lang.NumberFormatException -> L34
            goto L3c
        L33:
            r7 = r6
        L34:
            java.lang.String r1 = "Invalid bitrate header: "
            com.yandex.mobile.ads.impl.ss0.m29541a(r1, r2, r3)
            r1 = r5
        L3a:
            r9 = r7
            goto L3e
        L3c:
            r1 = r5
            r9 = r6
        L3e:
            java.lang.String r2 = "icy-genre"
            java.lang.Object r2 = r15.get(r2)
            java.util.List r2 = (java.util.List) r2
            r7 = 0
            if (r2 == 0) goto L52
            java.lang.Object r1 = r2.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r10 = r1
            r1 = r4
            goto L53
        L52:
            r10 = r7
        L53:
            java.lang.String r2 = "icy-name"
            java.lang.Object r2 = r15.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L66
            java.lang.Object r1 = r2.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r11 = r1
            r1 = r4
            goto L67
        L66:
            r11 = r7
        L67:
            java.lang.String r2 = "icy-url"
            java.lang.Object r2 = r15.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L7a
            java.lang.Object r1 = r2.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r12 = r1
            r1 = r4
            goto L7b
        L7a:
            r12 = r7
        L7b:
            java.lang.String r2 = "icy-pub"
            java.lang.Object r2 = r15.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L94
            java.lang.Object r1 = r2.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "1"
            boolean r1 = r1.equals(r2)
            r13 = r1
            r1 = r4
            goto L95
        L94:
            r13 = r5
        L95:
            java.lang.String r2 = "icy-metaint"
            java.lang.Object r15 = r15.get(r2)
            java.util.List r15 = (java.util.List) r15
            if (r15 == 0) goto Lc1
            java.lang.Object r15 = r15.get(r5)
            java.lang.String r15 = (java.lang.String) r15
            int r2 = java.lang.Integer.parseInt(r15)     // Catch: java.lang.NumberFormatException -> Lbe
            if (r2 <= 0) goto Lad
            r14 = r2
            goto Lc3
        Lad:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> Lbd
            r4.<init>(r0)     // Catch: java.lang.NumberFormatException -> Lbd
            r4.append(r15)     // Catch: java.lang.NumberFormatException -> Lbd
            java.lang.String r4 = r4.toString()     // Catch: java.lang.NumberFormatException -> Lbd
            com.yandex.mobile.ads.impl.gq0.m33792d(r3, r4)     // Catch: java.lang.NumberFormatException -> Lbd
            goto Lc1
        Lbd:
            r6 = r2
        Lbe:
            com.yandex.mobile.ads.impl.ss0.m29541a(r0, r15, r3)
        Lc1:
            r4 = r1
            r14 = r6
        Lc3:
            if (r4 == 0) goto Lcb
            com.monetization.ads.exo.metadata.icy.IcyHeaders r7 = new com.monetization.ads.exo.metadata.icy.IcyHeaders
            r8 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14)
        Lcb:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.monetization.ads.exo.metadata.icy.IcyHeaders.m44376a(java.util.Map):com.monetization.ads.exo.metadata.icy.IcyHeaders");
    }

    IcyHeaders(Parcel parcel) {
        this.f66251b = parcel.readInt();
        this.f66252c = parcel.readString();
        this.f66253d = parcel.readString();
        this.f66254e = parcel.readString();
        this.f66255f = y32.m27081a(parcel);
        this.f66256g = parcel.readInt();
    }
}
