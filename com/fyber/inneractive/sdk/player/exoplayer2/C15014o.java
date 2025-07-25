package com.fyber.inneractive.sdk.player.exoplayer2;

import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C14830d;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.C14991b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;
import com.fyber.inneractive.sdk.player.exoplayer2.video.C15137c;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.o */
/* loaded from: classes4.dex */
public final class C15014o implements Parcelable {
    public static final Parcelable.Creator<C15014o> CREATOR = new C15013n();

    /* renamed from: A */
    public int f29450A;

    /* renamed from: a */
    public final String f29451a;

    /* renamed from: b */
    public final int f29452b;

    /* renamed from: c */
    public final String f29453c;

    /* renamed from: d */
    public final C14991b f29454d;

    /* renamed from: e */
    public final String f29455e;

    /* renamed from: f */
    public final String f29456f;

    /* renamed from: g */
    public final int f29457g;

    /* renamed from: h */
    public final List f29458h;

    /* renamed from: i */
    public final C14830d f29459i;

    /* renamed from: j */
    public final int f29460j;

    /* renamed from: k */
    public final int f29461k;

    /* renamed from: l */
    public final float f29462l;

    /* renamed from: m */
    public final int f29463m;

    /* renamed from: n */
    public final float f29464n;

    /* renamed from: o */
    public final int f29465o;

    /* renamed from: p */
    public final byte[] f29466p;

    /* renamed from: q */
    public final C15137c f29467q;

    /* renamed from: r */
    public final int f29468r;

    /* renamed from: s */
    public final int f29469s;

    /* renamed from: t */
    public final int f29470t;

    /* renamed from: u */
    public final int f29471u;

    /* renamed from: v */
    public final int f29472v;

    /* renamed from: w */
    public final long f29473w;

    /* renamed from: x */
    public final int f29474x;

    /* renamed from: y */
    public final String f29475y;

    /* renamed from: z */
    public final int f29476z;

    public C15014o(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, C15137c c15137c, int i7, int i8, int i9, int i10, int i11, int i12, String str5, int i13, long j, List list, C14830d c14830d, C14991b c14991b) {
        this.f29451a = str;
        this.f29455e = str2;
        this.f29456f = str3;
        this.f29453c = str4;
        this.f29452b = i;
        this.f29457g = i2;
        this.f29460j = i3;
        this.f29461k = i4;
        this.f29462l = f;
        this.f29463m = i5;
        this.f29464n = f2;
        this.f29466p = bArr;
        this.f29465o = i6;
        this.f29467q = c15137c;
        this.f29468r = i7;
        this.f29469s = i8;
        this.f29470t = i9;
        this.f29471u = i10;
        this.f29472v = i11;
        this.f29474x = i12;
        this.f29475y = str5;
        this.f29476z = i13;
        this.f29473w = j;
        this.f29458h = list == null ? Collections.emptyList() : list;
        this.f29459i = c14830d;
        this.f29454d = c14991b;
    }

    /* renamed from: a */
    public static C15014o m77308a(String str, String str2, int i, int i2, int i3, List list, int i4, float f, byte[] bArr, int i5, C15137c c15137c, C14830d c14830d) {
        return new C15014o(str, null, str2, null, -1, i, i2, i3, -1.0f, i4, f, bArr, i5, c15137c, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, c14830d, null);
    }

    /* renamed from: b */
    public final int m77305b() {
        int i;
        int i2 = this.f29460j;
        if (i2 == -1 || (i = this.f29461k) == -1) {
            return -1;
        }
        return i2 * i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C15014o.class == obj.getClass()) {
            C15014o c15014o = (C15014o) obj;
            if (this.f29452b == c15014o.f29452b && this.f29457g == c15014o.f29457g && this.f29460j == c15014o.f29460j && this.f29461k == c15014o.f29461k && this.f29462l == c15014o.f29462l && this.f29463m == c15014o.f29463m && this.f29464n == c15014o.f29464n && this.f29465o == c15014o.f29465o && this.f29468r == c15014o.f29468r && this.f29469s == c15014o.f29469s && this.f29470t == c15014o.f29470t && this.f29471u == c15014o.f29471u && this.f29472v == c15014o.f29472v && this.f29473w == c15014o.f29473w && this.f29474x == c15014o.f29474x && AbstractC15133z.m77159a(this.f29451a, c15014o.f29451a) && AbstractC15133z.m77159a(this.f29475y, c15014o.f29475y) && this.f29476z == c15014o.f29476z && AbstractC15133z.m77159a(this.f29455e, c15014o.f29455e) && AbstractC15133z.m77159a(this.f29456f, c15014o.f29456f) && AbstractC15133z.m77159a(this.f29453c, c15014o.f29453c) && AbstractC15133z.m77159a(this.f29459i, c15014o.f29459i) && AbstractC15133z.m77159a(this.f29454d, c15014o.f29454d) && AbstractC15133z.m77159a(this.f29467q, c15014o.f29467q) && Arrays.equals(this.f29466p, c15014o.f29466p) && this.f29458h.size() == c15014o.f29458h.size()) {
                for (int i = 0; i < this.f29458h.size(); i++) {
                    if (!Arrays.equals((byte[]) this.f29458h.get(i), (byte[]) c15014o.f29458h.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        if (this.f29450A == 0) {
            String str = this.f29451a;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = (hashCode + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.f29455e;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            String str3 = this.f29456f;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i4 = (i3 + hashCode3) * 31;
            String str4 = this.f29453c;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i5 = (((((((((((i4 + hashCode4) * 31) + this.f29452b) * 31) + this.f29460j) * 31) + this.f29461k) * 31) + this.f29468r) * 31) + this.f29469s) * 31;
            String str5 = this.f29475y;
            if (str5 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str5.hashCode();
            }
            int i6 = (((i5 + hashCode5) * 31) + this.f29476z) * 31;
            C14830d c14830d = this.f29459i;
            if (c14830d == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = c14830d.hashCode();
            }
            int i7 = (i6 + hashCode6) * 31;
            C14991b c14991b = this.f29454d;
            if (c14991b != null) {
                i = Arrays.hashCode(c14991b.f29414a);
            }
            this.f29450A = i7 + i;
        }
        return this.f29450A;
    }

    public final String toString() {
        return "Format(" + this.f29451a + ", " + this.f29455e + ", " + this.f29456f + ", " + this.f29452b + ", " + this.f29475y + ", [" + this.f29460j + ", " + this.f29461k + ", " + this.f29462l + "], [" + this.f29468r + ", " + this.f29469s + "])";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeString(this.f29451a);
        parcel.writeString(this.f29455e);
        parcel.writeString(this.f29456f);
        parcel.writeString(this.f29453c);
        parcel.writeInt(this.f29452b);
        parcel.writeInt(this.f29457g);
        parcel.writeInt(this.f29460j);
        parcel.writeInt(this.f29461k);
        parcel.writeFloat(this.f29462l);
        parcel.writeInt(this.f29463m);
        parcel.writeFloat(this.f29464n);
        if (this.f29466p != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        byte[] bArr = this.f29466p;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f29465o);
        parcel.writeParcelable(this.f29467q, i);
        parcel.writeInt(this.f29468r);
        parcel.writeInt(this.f29469s);
        parcel.writeInt(this.f29470t);
        parcel.writeInt(this.f29471u);
        parcel.writeInt(this.f29472v);
        parcel.writeInt(this.f29474x);
        parcel.writeString(this.f29475y);
        parcel.writeInt(this.f29476z);
        parcel.writeLong(this.f29473w);
        int size = this.f29458h.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeByteArray((byte[]) this.f29458h.get(i3));
        }
        parcel.writeParcelable(this.f29459i, 0);
        parcel.writeParcelable(this.f29454d, 0);
    }

    /* renamed from: a */
    public static C15014o m77309a(String str, String str2, int i, int i2, int i3, int i4, List list, C14830d c14830d, String str3) {
        return m77310a(str, str2, i, i2, i3, i4, -1, -1, -1, list, c14830d, 0, str3, null);
    }

    /* renamed from: a */
    public static C15014o m77310a(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, List list, C14830d c14830d, int i8, String str3, C14991b c14991b) {
        return new C15014o(str, null, str2, null, i, i2, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i3, i4, i5, i6, i7, i8, str3, -1, Long.MAX_VALUE, list, c14830d, c14991b);
    }

    /* renamed from: a */
    public static C15014o m77307a(String str, String str2, int i, String str3, int i2, C14830d c14830d, long j, List list) {
        return new C15014o(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i, str3, i2, j, list, c14830d, null);
    }

    /* renamed from: a */
    public static C15014o m77306a(String str, String str2, C14830d c14830d) {
        return new C15014o(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, c14830d, null);
    }

    /* renamed from: a */
    public final MediaFormat m77312a() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.f29456f);
        String str = this.f29475y;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        m77311a(mediaFormat, "max-input-size", this.f29457g);
        m77311a(mediaFormat, "width", this.f29460j);
        m77311a(mediaFormat, "height", this.f29461k);
        float f = this.f29462l;
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
        m77311a(mediaFormat, "rotation-degrees", this.f29463m);
        m77311a(mediaFormat, "channel-count", this.f29468r);
        m77311a(mediaFormat, "sample-rate", this.f29469s);
        m77311a(mediaFormat, "encoder-delay", this.f29471u);
        m77311a(mediaFormat, "encoder-padding", this.f29472v);
        for (int i = 0; i < this.f29458h.size(); i++) {
            mediaFormat.setByteBuffer(AbstractC14979m.m77354a("csd-", i), ByteBuffer.wrap((byte[]) this.f29458h.get(i)));
        }
        C15137c c15137c = this.f29467q;
        if (c15137c != null) {
            m77311a(mediaFormat, "color-transfer", c15137c.f29880c);
            m77311a(mediaFormat, "color-standard", c15137c.f29878a);
            m77311a(mediaFormat, "color-range", c15137c.f29879b);
            byte[] bArr = c15137c.f29881d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    public C15014o(Parcel parcel) {
        this.f29451a = parcel.readString();
        this.f29455e = parcel.readString();
        this.f29456f = parcel.readString();
        this.f29453c = parcel.readString();
        this.f29452b = parcel.readInt();
        this.f29457g = parcel.readInt();
        this.f29460j = parcel.readInt();
        this.f29461k = parcel.readInt();
        this.f29462l = parcel.readFloat();
        this.f29463m = parcel.readInt();
        this.f29464n = parcel.readFloat();
        this.f29466p = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.f29465o = parcel.readInt();
        this.f29467q = (C15137c) parcel.readParcelable(C15137c.class.getClassLoader());
        this.f29468r = parcel.readInt();
        this.f29469s = parcel.readInt();
        this.f29470t = parcel.readInt();
        this.f29471u = parcel.readInt();
        this.f29472v = parcel.readInt();
        this.f29474x = parcel.readInt();
        this.f29475y = parcel.readString();
        this.f29476z = parcel.readInt();
        this.f29473w = parcel.readLong();
        int readInt = parcel.readInt();
        this.f29458h = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f29458h.add(parcel.createByteArray());
        }
        this.f29459i = (C14830d) parcel.readParcelable(C14830d.class.getClassLoader());
        this.f29454d = (C14991b) parcel.readParcelable(C14991b.class.getClassLoader());
    }

    /* renamed from: a */
    public static void m77311a(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }
}
