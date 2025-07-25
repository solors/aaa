package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.y61;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes8.dex */
public final class TextAppearance implements Parcelable, y61 {
    @NotNull
    public static final Parcelable.Creator<TextAppearance> CREATOR = new C32047a();

    /* renamed from: b */
    private final int f89313b;

    /* renamed from: c */
    private final float f89314c;

    /* renamed from: d */
    private final int f89315d;
    @Nullable

    /* renamed from: e */
    private final String f89316e;

    @Metadata
    /* loaded from: classes8.dex */
    public static final class Builder {

        /* renamed from: a */
        private int f89317a;

        /* renamed from: b */
        private float f89318b;

        /* renamed from: c */
        private int f89319c;
        @Nullable

        /* renamed from: d */
        private String f89320d;

        @NotNull
        public final TextAppearance build() {
            return new TextAppearance(this.f89317a, this.f89318b, this.f89319c, this.f89320d, null);
        }

        @NotNull
        public final Builder setFontFamilyName(@Nullable String str) {
            this.f89320d = str;
            return this;
        }

        @NotNull
        public final Builder setFontStyle(int i) {
            this.f89319c = i;
            return this;
        }

        @NotNull
        public final Builder setTextColor(int i) {
            this.f89317a = i;
            return this;
        }

        @NotNull
        public final Builder setTextSize(float f) {
            this.f89318b = f;
            return this;
        }
    }

    /* renamed from: com.yandex.mobile.ads.nativeads.template.appearance.TextAppearance$a */
    /* loaded from: classes8.dex */
    public static final class C32047a implements Parcelable.Creator<TextAppearance> {
        @Override // android.os.Parcelable.Creator
        public final TextAppearance createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TextAppearance(parcel.readInt(), parcel.readFloat(), parcel.readInt(), parcel.readString(), null);
        }

        @Override // android.os.Parcelable.Creator
        public final TextAppearance[] newArray(int i) {
            return new TextAppearance[i];
        }
    }

    public /* synthetic */ TextAppearance(int i, float f, int i2, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, f, i2, str);
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
        if (!Intrinsics.m17075f(TextAppearance.class, cls)) {
            return false;
        }
        Intrinsics.m17073h(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.appearance.TextAppearance");
        TextAppearance textAppearance = (TextAppearance) obj;
        if (getTextColor() != textAppearance.getTextColor() || getTextSize() != textAppearance.getTextSize() || getFontStyle() != textAppearance.getFontStyle()) {
            return false;
        }
        return Intrinsics.m17075f(getFontFamilyName(), textAppearance.getFontFamilyName());
    }

    @Override // com.yandex.mobile.ads.impl.y61
    @Nullable
    public String getFontFamilyName() {
        return this.f89316e;
    }

    @Override // com.yandex.mobile.ads.impl.y61
    public int getFontStyle() {
        return this.f89315d;
    }

    @Override // com.yandex.mobile.ads.impl.y61
    public int getTextColor() {
        return this.f89313b;
    }

    @Override // com.yandex.mobile.ads.impl.y61
    public float getTextSize() {
        return this.f89314c;
    }

    public int hashCode() {
        int i;
        int hashCode = Float.hashCode(getTextSize());
        int fontStyle = (getFontStyle() + ((hashCode + (getTextColor() * 31)) * 31)) * 31;
        String fontFamilyName = getFontFamilyName();
        if (fontFamilyName != null) {
            i = fontFamilyName.hashCode();
        } else {
            i = 0;
        }
        return fontStyle + i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.f89313b);
        out.writeFloat(this.f89314c);
        out.writeInt(this.f89315d);
        out.writeString(this.f89316e);
    }

    private TextAppearance(int i, float f, int i2, String str) {
        this.f89313b = i;
        this.f89314c = f;
        this.f89315d = i2;
        this.f89316e = str;
    }
}
