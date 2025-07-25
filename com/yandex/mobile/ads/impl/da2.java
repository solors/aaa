package com.yandex.mobile.ads.impl;

import android.graphics.Matrix;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.NoWhenBranchMatchedException;
import td.C44401b;

/* loaded from: classes8.dex */
public final class da2 {
    @NotNull

    /* renamed from: a */
    private final pu1 f78017a;
    @NotNull

    /* renamed from: b */
    private final pu1 f78018b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.yandex.mobile.ads.impl.da2$a */
    /* loaded from: classes8.dex */
    private static final class EnumC30156a {

        /* renamed from: b */
        public static final EnumC30156a f78019b;

        /* renamed from: c */
        public static final EnumC30156a f78020c;

        /* renamed from: d */
        private static final /* synthetic */ EnumC30156a[] f78021d;

        static {
            EnumC30156a enumC30156a = new EnumC30156a(0, "LEFT_TOP");
            f78019b = enumC30156a;
            EnumC30156a enumC30156a2 = new EnumC30156a(1, "CENTER");
            f78020c = enumC30156a2;
            EnumC30156a[] enumC30156aArr = {enumC30156a, enumC30156a2};
            f78021d = enumC30156aArr;
            C44401b.m3113a(enumC30156aArr);
        }

        private EnumC30156a(int i, String str) {
        }

        public static EnumC30156a valueOf(String str) {
            return (EnumC30156a) Enum.valueOf(EnumC30156a.class, str);
        }

        public static EnumC30156a[] values() {
            return (EnumC30156a[]) f78021d.clone();
        }
    }

    public da2(@NotNull pu1 viewSize, @NotNull pu1 videoSize) {
        Intrinsics.checkNotNullParameter(viewSize, "viewSize");
        Intrinsics.checkNotNullParameter(videoSize, "videoSize");
        this.f78017a = viewSize;
        this.f78018b = videoSize;
    }

    /* renamed from: a */
    private final Matrix m34980a(float f, float f2, EnumC30156a enumC30156a) {
        int ordinal = enumC30156a.ordinal();
        if (ordinal == 0) {
            Matrix matrix = new Matrix();
            matrix.setScale(f, f2, 0.0f, 0.0f);
            return matrix;
        } else if (ordinal == 1) {
            Matrix matrix2 = new Matrix();
            matrix2.setScale(f, f2, this.f78017a.m30581b() / 2.0f, this.f78017a.m30582a() / 2.0f);
            return matrix2;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Nullable
    /* renamed from: a */
    public final Matrix m34979a(@NotNull ea2 videoScaleType) {
        Intrinsics.checkNotNullParameter(videoScaleType, "videoScaleType");
        pu1 pu1Var = this.f78018b;
        if (pu1Var.m30581b() > 0 && pu1Var.m30582a() > 0) {
            pu1 pu1Var2 = this.f78017a;
            if (pu1Var2.m30581b() > 0 && pu1Var2.m30582a() > 0) {
                int ordinal = videoScaleType.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        float m30581b = this.f78017a.m30581b() / this.f78018b.m30581b();
                        float m30582a = this.f78017a.m30582a() / this.f78018b.m30582a();
                        float min = Math.min(m30581b, m30582a);
                        return m34980a(min / m30581b, min / m30582a, EnumC30156a.f78020c);
                    } else if (ordinal == 2) {
                        float m30581b2 = this.f78017a.m30581b() / this.f78018b.m30581b();
                        float m30582a2 = this.f78017a.m30582a() / this.f78018b.m30582a();
                        float max = Math.max(m30581b2, m30582a2);
                        return m34980a(max / m30581b2, max / m30582a2, EnumC30156a.f78020c);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return m34980a(1.0f, 1.0f, EnumC30156a.f78019b);
            }
        }
        return null;
    }
}
