package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.s61;
import com.yandex.mobile.ads.nativeads.template.HorizontalOffset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes8.dex */
public final class BannerAppearance implements Parcelable, s61 {
    @NotNull
    public static final Parcelable.Creator<BannerAppearance> CREATOR = new C32041a();
    @Nullable

    /* renamed from: b */
    private final HorizontalOffset f89251b;
    @Nullable

    /* renamed from: c */
    private final HorizontalOffset f89252c;

    /* renamed from: d */
    private final int f89253d;

    /* renamed from: e */
    private final int f89254e;

    /* renamed from: f */
    private final float f89255f;

    @Metadata
    /* loaded from: classes8.dex */
    public static final class Builder {

        /* renamed from: a */
        private int f89256a;

        /* renamed from: b */
        private int f89257b;

        /* renamed from: c */
        private float f89258c;
        @Nullable

        /* renamed from: d */
        private HorizontalOffset f89259d;
        @Nullable

        /* renamed from: e */
        private HorizontalOffset f89260e;

        @NotNull
        public final BannerAppearance build() {
            return new BannerAppearance(this.f89259d, this.f89260e, this.f89256a, this.f89257b, this.f89258c, null);
        }

        @NotNull
        public final Builder setBackgroundColor(int i) {
            this.f89256a = i;
            return this;
        }

        @NotNull
        public final Builder setBorderColor(int i) {
            this.f89257b = i;
            return this;
        }

        @NotNull
        public final Builder setBorderWidth(float f) {
            this.f89258c = f;
            return this;
        }

        @NotNull
        public final Builder setContentPadding(@Nullable HorizontalOffset horizontalOffset) {
            this.f89259d = horizontalOffset;
            return this;
        }

        @NotNull
        public final Builder setImageMargins(@Nullable HorizontalOffset horizontalOffset) {
            this.f89260e = horizontalOffset;
            return this;
        }
    }

    /* renamed from: com.yandex.mobile.ads.nativeads.template.appearance.BannerAppearance$a */
    /* loaded from: classes8.dex */
    public static final class C32041a implements Parcelable.Creator<BannerAppearance> {
        @Override // android.os.Parcelable.Creator
        public final BannerAppearance createFromParcel(Parcel parcel) {
            HorizontalOffset createFromParcel;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            HorizontalOffset horizontalOffset = null;
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = HorizontalOffset.CREATOR.createFromParcel(parcel);
            }
            HorizontalOffset horizontalOffset2 = createFromParcel;
            if (parcel.readInt() != 0) {
                horizontalOffset = HorizontalOffset.CREATOR.createFromParcel(parcel);
            }
            return new BannerAppearance(horizontalOffset2, horizontalOffset, parcel.readInt(), parcel.readInt(), parcel.readFloat(), null);
        }

        @Override // android.os.Parcelable.Creator
        public final BannerAppearance[] newArray(int i) {
            return new BannerAppearance[i];
        }
    }

    public /* synthetic */ BannerAppearance(HorizontalOffset horizontalOffset, HorizontalOffset horizontalOffset2, int i, int i2, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(horizontalOffset, horizontalOffset2, i, i2, f);
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
        if (!Intrinsics.m17075f(BannerAppearance.class, cls)) {
            return false;
        }
        Intrinsics.m17073h(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.appearance.BannerAppearance");
        BannerAppearance bannerAppearance = (BannerAppearance) obj;
        if (Intrinsics.m17075f(getContentPadding(), bannerAppearance.getContentPadding()) && Intrinsics.m17075f(getImageMargins(), bannerAppearance.getImageMargins()) && getBackgroundColor() == bannerAppearance.getBackgroundColor() && getBorderColor() == bannerAppearance.getBorderColor() && getBorderWidth() == bannerAppearance.getBorderWidth()) {
            return true;
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.s61
    public int getBackgroundColor() {
        return this.f89253d;
    }

    @Override // com.yandex.mobile.ads.impl.s61
    public int getBorderColor() {
        return this.f89254e;
    }

    @Override // com.yandex.mobile.ads.impl.s61
    public float getBorderWidth() {
        return this.f89255f;
    }

    public int hashCode() {
        int i;
        HorizontalOffset contentPadding = getContentPadding();
        int i2 = 0;
        if (contentPadding != null) {
            i = contentPadding.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        HorizontalOffset imageMargins = getImageMargins();
        if (imageMargins != null) {
            i2 = imageMargins.hashCode();
        }
        int backgroundColor = getBackgroundColor();
        return Float.hashCode(getBorderWidth()) + ((getBorderColor() + ((backgroundColor + ((i3 + i2) * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        HorizontalOffset horizontalOffset = this.f89251b;
        if (horizontalOffset == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            horizontalOffset.writeToParcel(out, i);
        }
        HorizontalOffset horizontalOffset2 = this.f89252c;
        if (horizontalOffset2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            horizontalOffset2.writeToParcel(out, i);
        }
        out.writeInt(this.f89253d);
        out.writeInt(this.f89254e);
        out.writeFloat(this.f89255f);
    }

    private BannerAppearance(HorizontalOffset horizontalOffset, HorizontalOffset horizontalOffset2, int i, int i2, float f) {
        this.f89251b = horizontalOffset;
        this.f89252c = horizontalOffset2;
        this.f89253d = i;
        this.f89254e = i2;
        this.f89255f = f;
    }

    @Override // com.yandex.mobile.ads.impl.s61
    @Nullable
    public HorizontalOffset getContentPadding() {
        return this.f89251b;
    }

    @Override // com.yandex.mobile.ads.impl.s61
    @Nullable
    public HorizontalOffset getImageMargins() {
        return this.f89252c;
    }
}
