package com.monetization.ads.video.parser.offset;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import td.C44401b;

@Metadata
/* loaded from: classes7.dex */
public class VastTimeOffset implements Parcelable {
    @NotNull
    public static final Parcelable.Creator<VastTimeOffset> CREATOR = new C25617a();
    @Nullable

    /* renamed from: b */
    private final EnumC25618b f66574b;

    /* renamed from: c */
    private final float f66575c;

    /* renamed from: com.monetization.ads.video.parser.offset.VastTimeOffset$a */
    /* loaded from: classes7.dex */
    public static final class C25617a implements Parcelable.Creator<VastTimeOffset> {
        C25617a() {
        }

        @Override // android.os.Parcelable.Creator
        public final VastTimeOffset createFromParcel(Parcel parcel) {
            EnumC25618b enumC25618b;
            Intrinsics.checkNotNullParameter(parcel, "source");
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == -1) {
                enumC25618b = null;
            } else {
                enumC25618b = EnumC25618b.values()[parcel.readInt()];
            }
            return new VastTimeOffset(enumC25618b, parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final VastTimeOffset[] newArray(int i) {
            return new VastTimeOffset[i];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.monetization.ads.video.parser.offset.VastTimeOffset$b */
    /* loaded from: classes7.dex */
    public static final class EnumC25618b {

        /* renamed from: b */
        public static final EnumC25618b f66576b;

        /* renamed from: c */
        public static final EnumC25618b f66577c;

        /* renamed from: d */
        public static final EnumC25618b f66578d;

        /* renamed from: e */
        private static final /* synthetic */ EnumC25618b[] f66579e;

        static {
            EnumC25618b enumC25618b = new EnumC25618b(0, "MILLISECONDS");
            f66576b = enumC25618b;
            EnumC25618b enumC25618b2 = new EnumC25618b(1, "PERCENTS");
            f66577c = enumC25618b2;
            EnumC25618b enumC25618b3 = new EnumC25618b(2, "POSITION");
            f66578d = enumC25618b3;
            EnumC25618b[] enumC25618bArr = {enumC25618b, enumC25618b2, enumC25618b3};
            f66579e = enumC25618bArr;
            C44401b.m3113a(enumC25618bArr);
        }

        private EnumC25618b(int i, String str) {
        }

        public static EnumC25618b valueOf(String str) {
            return (EnumC25618b) Enum.valueOf(EnumC25618b.class, str);
        }

        public static EnumC25618b[] values() {
            return (EnumC25618b[]) f66579e.clone();
        }
    }

    public VastTimeOffset(@Nullable EnumC25618b enumC25618b, float f) {
        this.f66574b = enumC25618b;
        this.f66575c = f;
    }

    @Nullable
    /* renamed from: c */
    public final EnumC25618b m44263c() {
        return this.f66574b;
    }

    /* renamed from: d */
    public final float m44262d() {
        return this.f66575c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(dest, "dest");
        EnumC25618b enumC25618b = this.f66574b;
        if (enumC25618b != null) {
            i2 = enumC25618b.ordinal();
        } else {
            i2 = -1;
        }
        dest.writeInt(i2);
        dest.writeFloat(this.f66575c);
    }
}
