package com.yandex.mobile.ads.nativeads.template;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.x61;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import td.C44401b;

@Metadata
/* loaded from: classes8.dex */
public final class SizeConstraint implements Parcelable, x61 {
    @NotNull
    public static final Parcelable.Creator<SizeConstraint> CREATOR = new C32040a();
    @NotNull

    /* renamed from: b */
    private final SizeConstraintType f89247b;

    /* renamed from: c */
    private final float f89248c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata
    /* loaded from: classes8.dex */
    public static final class SizeConstraintType implements x61.InterfaceC31798b {
        public static final SizeConstraintType FIXED;
        public static final SizeConstraintType FIXED_RATIO;
        public static final SizeConstraintType PREFERRED_RATIO;

        /* renamed from: c */
        private static final /* synthetic */ SizeConstraintType[] f89249c;
        @NotNull

        /* renamed from: b */
        private final x61.EnumC31797a f89250b;

        static {
            SizeConstraintType sizeConstraintType = new SizeConstraintType("FIXED", 0, x61.EnumC31797a.f87556b);
            FIXED = sizeConstraintType;
            SizeConstraintType sizeConstraintType2 = new SizeConstraintType("FIXED_RATIO", 1, x61.EnumC31797a.f87557c);
            FIXED_RATIO = sizeConstraintType2;
            SizeConstraintType sizeConstraintType3 = new SizeConstraintType("PREFERRED_RATIO", 2, x61.EnumC31797a.f87558d);
            PREFERRED_RATIO = sizeConstraintType3;
            SizeConstraintType[] sizeConstraintTypeArr = {sizeConstraintType, sizeConstraintType2, sizeConstraintType3};
            f89249c = sizeConstraintTypeArr;
            C44401b.m3113a(sizeConstraintTypeArr);
        }

        private SizeConstraintType(String str, int i, x61.EnumC31797a enumC31797a) {
            this.f89250b = enumC31797a;
        }

        public static SizeConstraintType valueOf(String str) {
            return (SizeConstraintType) Enum.valueOf(SizeConstraintType.class, str);
        }

        public static SizeConstraintType[] values() {
            return (SizeConstraintType[]) f89249c.clone();
        }

        @Override // com.yandex.mobile.ads.impl.x61.InterfaceC31798b
        @NotNull
        public final x61.EnumC31797a getType() {
            return this.f89250b;
        }
    }

    /* renamed from: com.yandex.mobile.ads.nativeads.template.SizeConstraint$a */
    /* loaded from: classes8.dex */
    public static final class C32040a implements Parcelable.Creator<SizeConstraint> {
        @Override // android.os.Parcelable.Creator
        public final SizeConstraint createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SizeConstraint(SizeConstraintType.valueOf(parcel.readString()), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final SizeConstraint[] newArray(int i) {
            return new SizeConstraint[i];
        }
    }

    public SizeConstraint(@NotNull SizeConstraintType sizeConstraintType, float f) {
        Intrinsics.checkNotNullParameter(sizeConstraintType, "sizeConstraintType");
        this.f89247b = sizeConstraintType;
        this.f89248c = f;
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
        if (!Intrinsics.m17075f(SizeConstraint.class, cls)) {
            return false;
        }
        Intrinsics.m17073h(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.SizeConstraint");
        SizeConstraint sizeConstraint = (SizeConstraint) obj;
        if (getSizeConstraintType() == sizeConstraint.getSizeConstraintType() && getValue() == sizeConstraint.getValue()) {
            return true;
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.x61
    public float getValue() {
        return this.f89248c;
    }

    public int hashCode() {
        return Float.hashCode(getValue()) + (getSizeConstraintType().hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f89247b.name());
        out.writeFloat(this.f89248c);
    }

    @Override // com.yandex.mobile.ads.impl.x61
    @NotNull
    public SizeConstraintType getSizeConstraintType() {
        return this.f89247b;
    }
}
