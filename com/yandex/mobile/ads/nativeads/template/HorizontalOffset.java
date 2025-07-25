package com.yandex.mobile.ads.nativeads.template;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.u61;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes8.dex */
public final class HorizontalOffset implements u61, Parcelable {
    @NotNull
    public static final Parcelable.Creator<HorizontalOffset> CREATOR = new C32039a();

    /* renamed from: b */
    private final float f89244b;

    /* renamed from: c */
    private final float f89245c;

    /* renamed from: com.yandex.mobile.ads.nativeads.template.HorizontalOffset$a */
    /* loaded from: classes8.dex */
    public static final class C32039a implements Parcelable.Creator<HorizontalOffset> {
        @Override // android.os.Parcelable.Creator
        public final HorizontalOffset createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HorizontalOffset(parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final HorizontalOffset[] newArray(int i) {
            return new HorizontalOffset[i];
        }
    }

    public HorizontalOffset(float f, float f2) {
        this.f89244b = f;
        this.f89245c = f2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.m17075f(HorizontalOffset.class, cls)) {
            return false;
        }
        Intrinsics.m17073h(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.HorizontalOffset");
        HorizontalOffset horizontalOffset = (HorizontalOffset) obj;
        if (getLeft() == horizontalOffset.getLeft() && getRight() == horizontalOffset.getRight()) {
            return true;
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.u61
    public float getLeft() {
        return this.f89244b;
    }

    @Override // com.yandex.mobile.ads.impl.u61
    public float getRight() {
        return this.f89245c;
    }

    public int hashCode() {
        return Float.hashCode(getRight()) + (Float.hashCode(getLeft()) * 31);
    }

    @NotNull
    public String toString() {
        float left = getLeft();
        float right = getRight();
        return left + ", " + right;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeFloat(this.f89244b);
        out.writeFloat(this.f89245c);
    }
}
