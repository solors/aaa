package com.monetization.ads.video.models.p550ad;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.C31014o3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.monetization.ads.video.models.ad.JavaScriptResource */
/* loaded from: classes7.dex */
public final class JavaScriptResource implements Parcelable {
    @NotNull
    public static final Parcelable.Creator<JavaScriptResource> CREATOR = new C25616a();
    @NotNull

    /* renamed from: b */
    private final String f66571b;
    @NotNull

    /* renamed from: c */
    private final String f66572c;

    /* renamed from: d */
    private final boolean f66573d;

    /* renamed from: com.monetization.ads.video.models.ad.JavaScriptResource$a */
    /* loaded from: classes7.dex */
    public static final class C25616a implements Parcelable.Creator<JavaScriptResource> {
        @Override // android.os.Parcelable.Creator
        public final JavaScriptResource createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new JavaScriptResource(readString, readString2, z);
        }

        @Override // android.os.Parcelable.Creator
        public final JavaScriptResource[] newArray(int i) {
            return new JavaScriptResource[i];
        }
    }

    public JavaScriptResource(@NotNull String apiFramework, @NotNull String url, boolean z) {
        Intrinsics.checkNotNullParameter(apiFramework, "apiFramework");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f66571b = apiFramework;
        this.f66572c = url;
        this.f66573d = z;
    }

    @NotNull
    /* renamed from: c */
    public final String m44265c() {
        return this.f66571b;
    }

    @NotNull
    /* renamed from: d */
    public final String m44264d() {
        return this.f66572c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JavaScriptResource)) {
            return false;
        }
        JavaScriptResource javaScriptResource = (JavaScriptResource) obj;
        if (Intrinsics.m17075f(this.f66571b, javaScriptResource.f66571b) && Intrinsics.m17075f(this.f66572c, javaScriptResource.f66572c) && this.f66573d == javaScriptResource.f66573d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f66573d) + C31014o3.m31189a(this.f66572c, this.f66571b.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f66571b;
        String str2 = this.f66572c;
        boolean z = this.f66573d;
        return "JavaScriptResource(apiFramework=" + str + ", url=" + str2 + ", browserOptional=" + z + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66571b);
        out.writeString(this.f66572c);
        out.writeInt(this.f66573d ? 1 : 0);
    }
}
