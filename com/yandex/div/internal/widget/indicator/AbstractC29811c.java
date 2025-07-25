package com.yandex.div.internal.widget.indicator;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.NoWhenBranchMatchedException;

/* compiled from: IndicatorParams.kt */
@Metadata
/* renamed from: com.yandex.div.internal.widget.indicator.c */
/* loaded from: classes8.dex */
public abstract class AbstractC29811c {

    /* compiled from: IndicatorParams.kt */
    @Metadata
    /* renamed from: com.yandex.div.internal.widget.indicator.c$a */
    /* loaded from: classes8.dex */
    public static final class C29812a extends AbstractC29811c {

        /* renamed from: a */
        private float f76168a;

        public C29812a(float f) {
            super(null);
            this.f76168a = f;
        }

        @NotNull
        /* renamed from: c */
        public final C29812a m36337c(float f) {
            return new C29812a(f);
        }

        /* renamed from: d */
        public final float m36336d() {
            return this.f76168a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C29812a) && Float.compare(this.f76168a, ((C29812a) obj).f76168a) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Float.hashCode(this.f76168a);
        }

        @NotNull
        public String toString() {
            return "Circle(radius=" + this.f76168a + ')';
        }
    }

    /* compiled from: IndicatorParams.kt */
    @Metadata
    /* renamed from: com.yandex.div.internal.widget.indicator.c$b */
    /* loaded from: classes8.dex */
    public static final class C29813b extends AbstractC29811c {

        /* renamed from: a */
        private float f76169a;

        /* renamed from: b */
        private float f76170b;

        /* renamed from: c */
        private float f76171c;

        public C29813b(float f, float f2, float f3) {
            super(null);
            this.f76169a = f;
            this.f76170b = f2;
            this.f76171c = f3;
        }

        /* renamed from: d */
        public static /* synthetic */ C29813b m36334d(C29813b c29813b, float f, float f2, float f3, int i, Object obj) {
            if ((i & 1) != 0) {
                f = c29813b.f76169a;
            }
            if ((i & 2) != 0) {
                f2 = c29813b.f76170b;
            }
            if ((i & 4) != 0) {
                f3 = c29813b.f76171c;
            }
            return c29813b.m36335c(f, f2, f3);
        }

        @NotNull
        /* renamed from: c */
        public final C29813b m36335c(float f, float f2, float f3) {
            return new C29813b(f, f2, f3);
        }

        /* renamed from: e */
        public final float m36333e() {
            return this.f76171c;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29813b)) {
                return false;
            }
            C29813b c29813b = (C29813b) obj;
            if (Float.compare(this.f76169a, c29813b.f76169a) == 0 && Float.compare(this.f76170b, c29813b.f76170b) == 0 && Float.compare(this.f76171c, c29813b.f76171c) == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public final float m36332f() {
            return this.f76170b;
        }

        /* renamed from: g */
        public final float m36331g() {
            return this.f76169a;
        }

        public int hashCode() {
            return (((Float.hashCode(this.f76169a) * 31) + Float.hashCode(this.f76170b)) * 31) + Float.hashCode(this.f76171c);
        }

        @NotNull
        public String toString() {
            return "RoundedRect(itemWidth=" + this.f76169a + ", itemHeight=" + this.f76170b + ", cornerRadius=" + this.f76171c + ')';
        }
    }

    private AbstractC29811c() {
    }

    public /* synthetic */ AbstractC29811c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public final float m36339a() {
        if (this instanceof C29813b) {
            return ((C29813b) this).m36332f();
        }
        if (this instanceof C29812a) {
            return ((C29812a) this).m36336d() * 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    public final float m36338b() {
        if (this instanceof C29813b) {
            return ((C29813b) this).m36331g();
        }
        if (this instanceof C29812a) {
            return ((C29812a) this).m36336d() * 2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
