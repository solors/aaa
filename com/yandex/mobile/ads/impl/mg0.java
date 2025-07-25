package com.yandex.mobile.ads.impl;

import android.content.Context;
import be.MathJVM;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public abstract class mg0 {

    /* renamed from: a */
    private final float f82181a;

    /* renamed from: com.yandex.mobile.ads.impl.mg0$d */
    /* loaded from: classes8.dex */
    public static final class C30852d {

        /* renamed from: a */
        private final int f82182a;

        /* renamed from: b */
        private final int f82183b;

        public C30852d(int i, int i2) {
            this.f82182a = i;
            this.f82183b = i2;
        }

        /* renamed from: a */
        public final int m32010a() {
            return this.f82183b;
        }

        /* renamed from: b */
        public final int m32009b() {
            return this.f82182a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C30852d)) {
                return false;
            }
            C30852d c30852d = (C30852d) obj;
            if (this.f82182a == c30852d.f82182a && this.f82183b == c30852d.f82183b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f82183b) + (Integer.hashCode(this.f82182a) * 31);
        }

        @NotNull
        public final String toString() {
            int i = this.f82182a;
            int i2 = this.f82183b;
            return "Size(width=" + i + ", height=" + i2 + ")";
        }
    }

    public mg0(float f) {
        this.f82181a = mo32012a(f);
    }

    /* renamed from: a */
    protected final float m32013a() {
        return this.f82181a;
    }

    /* renamed from: a */
    protected abstract float mo32012a(float f);

    @NotNull
    /* renamed from: a */
    public abstract C30852d mo32011a(@NotNull Context context, int i, int i2, int i3);

    /* renamed from: com.yandex.mobile.ads.impl.mg0$b */
    /* loaded from: classes8.dex */
    public static final class C30850b extends mg0 {
        public C30850b(float f) {
            super(f);
        }

        @Override // com.yandex.mobile.ads.impl.mg0
        @NotNull
        /* renamed from: a */
        public final C30852d mo32011a(@NotNull Context context, int i, int i2, int i3) {
            int m103791d;
            int m103791d2;
            Intrinsics.checkNotNullParameter(context, "context");
            m103791d = MathJVM.m103791d(i * m32013a());
            m103791d2 = MathJVM.m103791d(i3 * (m103791d / i2));
            return new C30852d(m103791d, m103791d2);
        }

        @Override // com.yandex.mobile.ads.impl.mg0
        /* renamed from: a */
        protected final float mo32012a(float f) {
            float m16909m;
            m16909m = _Ranges.m16909m(f, 0.01f, 1.0f);
            return m16909m;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.mg0$a */
    /* loaded from: classes8.dex */
    public static final class C30849a extends mg0 {
        public C30849a(float f) {
            super(f);
        }

        @Override // com.yandex.mobile.ads.impl.mg0
        @NotNull
        /* renamed from: a */
        public final C30852d mo32011a(@NotNull Context context, int i, int i2, int i3) {
            int m16912j;
            int m103791d;
            Intrinsics.checkNotNullParameter(context, "context");
            m16912j = _Ranges.m16912j(cc2.m35261a(context, m32013a()), i);
            m103791d = MathJVM.m103791d(i3 * (m16912j / i2));
            return new C30852d(m16912j, m103791d);
        }

        @Override // com.yandex.mobile.ads.impl.mg0
        /* renamed from: a */
        protected final float mo32012a(float f) {
            float m16918d;
            m16918d = _Ranges.m16918d(f, 10.0f);
            return m16918d;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.mg0$c */
    /* loaded from: classes8.dex */
    public static final class C30851c extends mg0 {
        public C30851c(float f) {
            super(f);
        }

        @Override // com.yandex.mobile.ads.impl.mg0
        @NotNull
        /* renamed from: a */
        public final C30852d mo32011a(@NotNull Context context, int i, int i2, int i3) {
            int m103791d;
            Intrinsics.checkNotNullParameter(context, "context");
            int m35261a = cc2.m35261a(context, (float) IronSourceConstants.USING_CACHE_FOR_INIT_EVENT);
            m103791d = MathJVM.m103791d(i * m32013a());
            if (i2 > m103791d) {
                i3 = MathJVM.m103791d(i3 / (i2 / m103791d));
                i2 = m103791d;
            }
            if (i3 > m35261a) {
                i2 = MathJVM.m103791d(i2 / (i3 / m35261a));
            } else {
                m35261a = i3;
            }
            return new C30852d(i2, m35261a);
        }

        @Override // com.yandex.mobile.ads.impl.mg0
        /* renamed from: a */
        protected final float mo32012a(float f) {
            float m16909m;
            m16909m = _Ranges.m16909m(f, 0.01f, 1.0f);
            return m16909m;
        }
    }
}
