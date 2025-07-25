package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.inmobi.media.J */
/* loaded from: classes6.dex */
public final class C18971J implements Parcelable {
    @NotNull
    public static final Parcelable.Creator<C18971J> CREATOR = new C18957I();

    /* renamed from: a */
    public final long f47352a;

    /* renamed from: b */
    public final String f47353b;

    /* renamed from: c */
    public Map f47354c;

    /* renamed from: d */
    public String f47355d;

    /* renamed from: e */
    public final String f47356e;

    /* renamed from: f */
    public final String f47357f;

    /* renamed from: g */
    public String f47358g;

    /* renamed from: h */
    public String f47359h;

    /* renamed from: i */
    public String f47360i;

    /* renamed from: j */
    public boolean f47361j;

    /* renamed from: k */
    public String f47362k;

    public C18971J(long j, String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this.f47359h = "";
        this.f47360i = "activity";
        this.f47352a = j;
        this.f47353b = str;
        this.f47356e = str2;
        this.f47353b = str == null ? "" : str;
        this.f47357f = str3;
    }

    /* renamed from: c */
    public static /* synthetic */ void m61013c() {
    }

    @NotNull
    /* renamed from: d */
    public final String m61011d() {
        String str = this.f47358g;
        Intrinsics.m17074g(str);
        return str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    /* renamed from: e */
    public final String m61010e() {
        return this.f47362k;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18971J)) {
            return false;
        }
        C18971J c18971j = (C18971J) obj;
        if (this.f47352a == c18971j.f47352a && Intrinsics.m17075f(this.f47360i, c18971j.f47360i) && Intrinsics.m17075f(this.f47353b, c18971j.f47353b) && Intrinsics.m17075f(this.f47356e, c18971j.f47356e)) {
            return true;
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public final Map<String, String> m61009f() {
        return this.f47354c;
    }

    /* renamed from: g */
    public final long m61008g() {
        return this.f47352a;
    }

    @NotNull
    /* renamed from: h */
    public final String m61007h() {
        return "im";
    }

    public int hashCode() {
        int i;
        long j = this.f47352a;
        int i2 = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.f47356e;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return this.f47360i.hashCode() + ((i2 + i) * 30);
    }

    @Nullable
    /* renamed from: i */
    public final String m61006i() {
        return this.f47355d;
    }

    @NotNull
    /* renamed from: j */
    public final String m61005j() {
        return this.f47360i;
    }

    /* renamed from: l */
    public final long m61003l() {
        return this.f47352a;
    }

    @Nullable
    /* renamed from: m */
    public final String m61002m() {
        return this.f47357f;
    }

    @Nullable
    /* renamed from: o */
    public final String m61000o() {
        return this.f47353b;
    }

    /* renamed from: p */
    public final boolean m60999p() {
        return this.f47361j;
    }

    @NotNull
    public String toString() {
        return String.valueOf(this.f47352a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f47352a);
        dest.writeString(this.f47360i);
        dest.writeString(this.f47356e);
    }

    @Nullable
    /* renamed from: b */
    public final String m61016b() {
        return this.f47356e;
    }

    /* renamed from: a */
    public final void m61017a(@Nullable Map<String, String> map) {
        this.f47354c = map;
    }

    /* renamed from: b */
    public final void m61014b(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f47360i = str;
    }

    @NotNull
    /* renamed from: a */
    public final String m61021a() {
        return this.f47359h;
    }

    /* renamed from: a */
    public final void m61018a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f47359h = str;
    }

    public C18971J(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this.f47359h = "";
        String str = "activity";
        this.f47360i = "activity";
        this.f47352a = parcel.readLong();
        String readString = parcel.readString();
        if (readString != null && !Intrinsics.m17075f(readString, "activity") && Intrinsics.m17075f(readString, "others")) {
            str = "others";
        }
        this.f47360i = str;
        this.f47356e = parcel.readString();
    }

    /* renamed from: k */
    public static /* synthetic */ void m61004k() {
    }

    /* renamed from: n */
    public static /* synthetic */ void m61001n() {
    }
}
