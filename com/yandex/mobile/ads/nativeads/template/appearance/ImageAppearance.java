package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.v61;
import com.yandex.mobile.ads.nativeads.template.SizeConstraint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes8.dex */
public final class ImageAppearance implements Parcelable, v61 {
    @NotNull
    public static final Parcelable.Creator<ImageAppearance> CREATOR = new C32043a();
    @Nullable

    /* renamed from: b */
    private final SizeConstraint f89271b;

    @Metadata
    /* loaded from: classes8.dex */
    public static final class Builder {
        @Nullable

        /* renamed from: a */
        private SizeConstraint f89272a;

        @NotNull
        public final ImageAppearance build() {
            return new ImageAppearance(this.f89272a, null);
        }

        @NotNull
        public final Builder setWidthConstraint(@Nullable SizeConstraint sizeConstraint) {
            this.f89272a = sizeConstraint;
            return this;
        }
    }

    /* renamed from: com.yandex.mobile.ads.nativeads.template.appearance.ImageAppearance$a */
    /* loaded from: classes8.dex */
    public static final class C32043a implements Parcelable.Creator<ImageAppearance> {
        @Override // android.os.Parcelable.Creator
        public final ImageAppearance createFromParcel(Parcel parcel) {
            SizeConstraint createFromParcel;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = SizeConstraint.CREATOR.createFromParcel(parcel);
            }
            return new ImageAppearance(createFromParcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final ImageAppearance[] newArray(int i) {
            return new ImageAppearance[i];
        }
    }

    public /* synthetic */ ImageAppearance(SizeConstraint sizeConstraint, DefaultConstructorMarker defaultConstructorMarker) {
        this(sizeConstraint);
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
        if (!Intrinsics.m17075f(ImageAppearance.class, cls)) {
            return false;
        }
        Intrinsics.m17073h(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.appearance.ImageAppearance");
        return Intrinsics.m17075f(getWidthConstraint(), ((ImageAppearance) obj).getWidthConstraint());
    }

    public int hashCode() {
        SizeConstraint widthConstraint = getWidthConstraint();
        if (widthConstraint != null) {
            return widthConstraint.hashCode();
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        SizeConstraint sizeConstraint = this.f89271b;
        if (sizeConstraint == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        sizeConstraint.writeToParcel(out, i);
    }

    private ImageAppearance(SizeConstraint sizeConstraint) {
        this.f89271b = sizeConstraint;
    }

    @Override // com.yandex.mobile.ads.impl.v61
    @Nullable
    public SizeConstraint getWidthConstraint() {
        return this.f89271b;
    }
}
