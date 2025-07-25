package com.yandex.div.internal.widget.indicator;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: IndicatorParams.kt */
@Metadata
/* renamed from: com.yandex.div.internal.widget.indicator.b */
/* loaded from: classes8.dex */
public interface InterfaceC29808b {

    /* compiled from: IndicatorParams.kt */
    @Metadata
    /* renamed from: com.yandex.div.internal.widget.indicator.b$a */
    /* loaded from: classes8.dex */
    public static final class C29809a implements InterfaceC29808b {

        /* renamed from: a */
        private final float f76165a;

        public C29809a(float f) {
            this.f76165a = f;
        }

        /* renamed from: a */
        public final float m36342a() {
            return this.f76165a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C29809a) && Float.compare(this.f76165a, ((C29809a) obj).f76165a) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Float.hashCode(this.f76165a);
        }

        @NotNull
        public String toString() {
            return "Default(spaceBetweenCenters=" + this.f76165a + ')';
        }
    }

    /* compiled from: IndicatorParams.kt */
    @Metadata
    /* renamed from: com.yandex.div.internal.widget.indicator.b$b */
    /* loaded from: classes8.dex */
    public static final class C29810b implements InterfaceC29808b {

        /* renamed from: a */
        private final float f76166a;

        /* renamed from: b */
        private final int f76167b;

        public C29810b(float f, int i) {
            this.f76166a = f;
            this.f76167b = i;
        }

        /* renamed from: a */
        public final float m36341a() {
            return this.f76166a;
        }

        /* renamed from: b */
        public final int m36340b() {
            return this.f76167b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29810b)) {
                return false;
            }
            C29810b c29810b = (C29810b) obj;
            if (Float.compare(this.f76166a, c29810b.f76166a) == 0 && this.f76167b == c29810b.f76167b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (Float.hashCode(this.f76166a) * 31) + Integer.hashCode(this.f76167b);
        }

        @NotNull
        public String toString() {
            return "Stretch(itemSpacing=" + this.f76166a + ", maxVisibleItems=" + this.f76167b + ')';
        }
    }
}
