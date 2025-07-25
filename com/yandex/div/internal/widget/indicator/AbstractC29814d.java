package com.yandex.div.internal.widget.indicator;

import com.yandex.div.internal.widget.indicator.AbstractC29811c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: IndicatorParams.kt */
@Metadata
/* renamed from: com.yandex.div.internal.widget.indicator.d */
/* loaded from: classes8.dex */
public abstract class AbstractC29814d {

    /* compiled from: IndicatorParams.kt */
    @Metadata
    /* renamed from: com.yandex.div.internal.widget.indicator.d$a */
    /* loaded from: classes8.dex */
    public static final class C29815a extends AbstractC29814d {

        /* renamed from: a */
        private final int f76172a;
        @NotNull

        /* renamed from: b */
        private final AbstractC29811c.C29812a f76173b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29815a(int i, @NotNull AbstractC29811c.C29812a itemSize) {
            super(null);
            Intrinsics.checkNotNullParameter(itemSize, "itemSize");
            this.f76172a = i;
            this.f76173b = itemSize;
        }

        @Override // com.yandex.div.internal.widget.indicator.AbstractC29814d
        /* renamed from: c */
        public int mo36327c() {
            return this.f76172a;
        }

        @Override // com.yandex.div.internal.widget.indicator.AbstractC29814d
        @NotNull
        /* renamed from: e */
        public AbstractC29811c.C29812a mo36326d() {
            return this.f76173b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29815a)) {
                return false;
            }
            C29815a c29815a = (C29815a) obj;
            if (this.f76172a == c29815a.f76172a && Intrinsics.m17075f(this.f76173b, c29815a.f76173b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f76172a) * 31) + this.f76173b.hashCode();
        }

        @NotNull
        public String toString() {
            return "Circle(color=" + this.f76172a + ", itemSize=" + this.f76173b + ')';
        }
    }

    /* compiled from: IndicatorParams.kt */
    @Metadata
    /* renamed from: com.yandex.div.internal.widget.indicator.d$b */
    /* loaded from: classes8.dex */
    public static final class C29816b extends AbstractC29814d {

        /* renamed from: a */
        private final int f76174a;
        @NotNull

        /* renamed from: b */
        private final AbstractC29811c.C29813b f76175b;

        /* renamed from: c */
        private final float f76176c;

        /* renamed from: d */
        private final int f76177d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29816b(int i, @NotNull AbstractC29811c.C29813b itemSize, float f, int i2) {
            super(null);
            Intrinsics.checkNotNullParameter(itemSize, "itemSize");
            this.f76174a = i;
            this.f76175b = itemSize;
            this.f76176c = f;
            this.f76177d = i2;
        }

        @Override // com.yandex.div.internal.widget.indicator.AbstractC29814d
        /* renamed from: c */
        public int mo36327c() {
            return this.f76174a;
        }

        @Override // com.yandex.div.internal.widget.indicator.AbstractC29814d
        @NotNull
        /* renamed from: e */
        public AbstractC29811c.C29813b mo36326d() {
            return this.f76175b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29816b)) {
                return false;
            }
            C29816b c29816b = (C29816b) obj;
            if (this.f76174a == c29816b.f76174a && Intrinsics.m17075f(this.f76175b, c29816b.f76175b) && Float.compare(this.f76176c, c29816b.f76176c) == 0 && this.f76177d == c29816b.f76177d) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public final int m36324f() {
            return this.f76177d;
        }

        /* renamed from: g */
        public final float m36323g() {
            return this.f76176c;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.f76174a) * 31) + this.f76175b.hashCode()) * 31) + Float.hashCode(this.f76176c)) * 31) + Integer.hashCode(this.f76177d);
        }

        @NotNull
        public String toString() {
            return "RoundedRect(color=" + this.f76174a + ", itemSize=" + this.f76175b + ", strokeWidth=" + this.f76176c + ", strokeColor=" + this.f76177d + ')';
        }
    }

    private AbstractC29814d() {
    }

    public /* synthetic */ AbstractC29814d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public final int m36330a() {
        if (this instanceof C29816b) {
            return ((C29816b) this).m36324f();
        }
        return 0;
    }

    /* renamed from: b */
    public final float m36329b() {
        if (this instanceof C29816b) {
            return ((C29816b) this).m36323g();
        }
        return 0.0f;
    }

    /* renamed from: c */
    public abstract int mo36327c();

    @NotNull
    /* renamed from: d */
    public abstract AbstractC29811c mo36326d();
}
