package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.t61;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes8.dex */
public final class ButtonAppearance implements Parcelable, t61 {
    @NotNull
    public static final Parcelable.Creator<ButtonAppearance> CREATOR = new C32042a();
    @Nullable

    /* renamed from: b */
    private final TextAppearance f89261b;

    /* renamed from: c */
    private final int f89262c;

    /* renamed from: d */
    private final float f89263d;

    /* renamed from: e */
    private final int f89264e;

    /* renamed from: f */
    private final int f89265f;

    @Metadata
    /* loaded from: classes8.dex */
    public static final class Builder {

        /* renamed from: a */
        private int f89266a;

        /* renamed from: b */
        private float f89267b;

        /* renamed from: c */
        private int f89268c;

        /* renamed from: d */
        private int f89269d;
        @Nullable

        /* renamed from: e */
        private TextAppearance f89270e;

        @NotNull
        public final ButtonAppearance build() {
            return new ButtonAppearance(this.f89270e, this.f89266a, this.f89267b, this.f89268c, this.f89269d, null);
        }

        @NotNull
        public final Builder setBorderColor(int i) {
            this.f89266a = i;
            return this;
        }

        @NotNull
        public final Builder setBorderWidth(float f) {
            this.f89267b = f;
            return this;
        }

        @NotNull
        public final Builder setNormalColor(int i) {
            this.f89268c = i;
            return this;
        }

        @NotNull
        public final Builder setPressedColor(int i) {
            this.f89269d = i;
            return this;
        }

        @NotNull
        public final Builder setTextAppearance(@Nullable TextAppearance textAppearance) {
            this.f89270e = textAppearance;
            return this;
        }
    }

    /* renamed from: com.yandex.mobile.ads.nativeads.template.appearance.ButtonAppearance$a */
    /* loaded from: classes8.dex */
    public static final class C32042a implements Parcelable.Creator<ButtonAppearance> {
        @Override // android.os.Parcelable.Creator
        public final ButtonAppearance createFromParcel(Parcel parcel) {
            TextAppearance createFromParcel;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = TextAppearance.CREATOR.createFromParcel(parcel);
            }
            return new ButtonAppearance(createFromParcel, parcel.readInt(), parcel.readFloat(), parcel.readInt(), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        public final ButtonAppearance[] newArray(int i) {
            return new ButtonAppearance[i];
        }
    }

    public /* synthetic */ ButtonAppearance(TextAppearance textAppearance, int i, float f, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAppearance, i, f, i2, i3);
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
        if (!Intrinsics.m17075f(ButtonAppearance.class, cls)) {
            return false;
        }
        Intrinsics.m17073h(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.appearance.ButtonAppearance");
        ButtonAppearance buttonAppearance = (ButtonAppearance) obj;
        if (Intrinsics.m17075f(getTextAppearance(), buttonAppearance.getTextAppearance()) && getBorderColor() == buttonAppearance.getBorderColor() && getBorderWidth() == buttonAppearance.getBorderWidth() && getNormalColor() == buttonAppearance.getNormalColor() && getPressedColor() == buttonAppearance.getPressedColor()) {
            return true;
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.t61
    public int getBorderColor() {
        return this.f89262c;
    }

    @Override // com.yandex.mobile.ads.impl.t61
    public float getBorderWidth() {
        return this.f89263d;
    }

    @Override // com.yandex.mobile.ads.impl.t61
    public int getNormalColor() {
        return this.f89264e;
    }

    @Override // com.yandex.mobile.ads.impl.t61
    public int getPressedColor() {
        return this.f89265f;
    }

    public int hashCode() {
        int i;
        TextAppearance textAppearance = getTextAppearance();
        if (textAppearance != null) {
            i = textAppearance.hashCode();
        } else {
            i = 0;
        }
        int borderColor = getBorderColor();
        int hashCode = Float.hashCode(getBorderWidth());
        int normalColor = getNormalColor();
        return getPressedColor() + ((normalColor + ((hashCode + ((borderColor + (i * 31)) * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        TextAppearance textAppearance = this.f89261b;
        if (textAppearance == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            textAppearance.writeToParcel(out, i);
        }
        out.writeInt(this.f89262c);
        out.writeFloat(this.f89263d);
        out.writeInt(this.f89264e);
        out.writeInt(this.f89265f);
    }

    private ButtonAppearance(TextAppearance textAppearance, int i, float f, int i2, int i3) {
        this.f89261b = textAppearance;
        this.f89262c = i;
        this.f89263d = f;
        this.f89264e = i2;
        this.f89265f = i3;
    }

    @Override // com.yandex.mobile.ads.impl.t61
    @Nullable
    public TextAppearance getTextAppearance() {
        return this.f89261b;
    }
}
