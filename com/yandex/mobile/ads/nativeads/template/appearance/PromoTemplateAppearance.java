package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes8.dex */
public final class PromoTemplateAppearance implements Parcelable {
    @NotNull
    public static final Parcelable.Creator<PromoTemplateAppearance> CREATOR = new C32045a();
    @NotNull

    /* renamed from: b */
    private final BannerAppearance f89301b;
    @NotNull

    /* renamed from: c */
    private final TextAppearance f89302c;
    @NotNull

    /* renamed from: d */
    private final TextAppearance f89303d;
    @NotNull

    /* renamed from: e */
    private final TextAppearance f89304e;
    @NotNull

    /* renamed from: f */
    private final ImageAppearance f89305f;
    @NotNull

    /* renamed from: g */
    private final ImageAppearance f89306g;
    @NotNull

    /* renamed from: h */
    private final ButtonAppearance f89307h;
    @NotNull

    /* renamed from: i */
    private final ButtonAppearance f89308i;

    /* renamed from: com.yandex.mobile.ads.nativeads.template.appearance.PromoTemplateAppearance$a */
    /* loaded from: classes8.dex */
    public static final class C32045a implements Parcelable.Creator<PromoTemplateAppearance> {
        @Override // android.os.Parcelable.Creator
        public final PromoTemplateAppearance createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            BannerAppearance createFromParcel = BannerAppearance.CREATOR.createFromParcel(parcel);
            Parcelable.Creator<TextAppearance> creator = TextAppearance.CREATOR;
            TextAppearance createFromParcel2 = creator.createFromParcel(parcel);
            Parcelable.Creator<ImageAppearance> creator2 = ImageAppearance.CREATOR;
            ImageAppearance createFromParcel3 = creator2.createFromParcel(parcel);
            Parcelable.Creator<ButtonAppearance> creator3 = ButtonAppearance.CREATOR;
            return new PromoTemplateAppearance(createFromParcel, creator.createFromParcel(parcel), creator.createFromParcel(parcel), createFromParcel2, creator2.createFromParcel(parcel), createFromParcel3, creator3.createFromParcel(parcel), creator3.createFromParcel(parcel), 0);
        }

        @Override // android.os.Parcelable.Creator
        public final PromoTemplateAppearance[] newArray(int i) {
            return new PromoTemplateAppearance[i];
        }
    }

    public /* synthetic */ PromoTemplateAppearance(BannerAppearance bannerAppearance, TextAppearance textAppearance, TextAppearance textAppearance2, TextAppearance textAppearance3, ImageAppearance imageAppearance, ImageAppearance imageAppearance2, ButtonAppearance buttonAppearance, ButtonAppearance buttonAppearance2, int i) {
        this(bannerAppearance, textAppearance, textAppearance2, textAppearance3, imageAppearance, imageAppearance2, buttonAppearance, buttonAppearance2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.m17075f(PromoTemplateAppearance.class, cls)) {
            return false;
        }
        Intrinsics.m17073h(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.appearance.PromoTemplateAppearance");
        PromoTemplateAppearance promoTemplateAppearance = (PromoTemplateAppearance) obj;
        if (!Intrinsics.m17075f(this.f89301b, promoTemplateAppearance.f89301b) || !Intrinsics.m17075f(this.f89302c, promoTemplateAppearance.f89302c) || !Intrinsics.m17075f(this.f89303d, promoTemplateAppearance.f89303d) || !Intrinsics.m17075f(this.f89304e, promoTemplateAppearance.f89304e) || !Intrinsics.m17075f(this.f89305f, promoTemplateAppearance.f89305f) || !Intrinsics.m17075f(this.f89306g, promoTemplateAppearance.f89306g) || !Intrinsics.m17075f(this.f89307h, promoTemplateAppearance.f89307h)) {
            return false;
        }
        return Intrinsics.m17075f(this.f89308i, promoTemplateAppearance.f89308i);
    }

    public final int hashCode() {
        int hashCode = this.f89302c.hashCode();
        int hashCode2 = this.f89303d.hashCode();
        int hashCode3 = this.f89304e.hashCode();
        int hashCode4 = this.f89305f.hashCode();
        int hashCode5 = this.f89306g.hashCode();
        int hashCode6 = this.f89307h.hashCode();
        return this.f89308i.hashCode() + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.f89301b.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        this.f89301b.writeToParcel(out, i);
        this.f89302c.writeToParcel(out, i);
        this.f89303d.writeToParcel(out, i);
        this.f89304e.writeToParcel(out, i);
        this.f89305f.writeToParcel(out, i);
        this.f89306g.writeToParcel(out, i);
        this.f89307h.writeToParcel(out, i);
        this.f89308i.writeToParcel(out, i);
    }

    private PromoTemplateAppearance(BannerAppearance bannerAppearance, TextAppearance textAppearance, TextAppearance textAppearance2, TextAppearance textAppearance3, ImageAppearance imageAppearance, ImageAppearance imageAppearance2, ButtonAppearance buttonAppearance, ButtonAppearance buttonAppearance2) {
        this.f89301b = bannerAppearance;
        this.f89302c = textAppearance;
        this.f89303d = textAppearance2;
        this.f89304e = textAppearance3;
        this.f89305f = imageAppearance;
        this.f89306g = imageAppearance2;
        this.f89307h = buttonAppearance;
        this.f89308i = buttonAppearance2;
    }
}
