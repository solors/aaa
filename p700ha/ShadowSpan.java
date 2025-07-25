package p700ha;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: ha.d */
/* loaded from: classes8.dex */
public final class ShadowSpan extends CharacterStyle {
    @NotNull

    /* renamed from: a */
    private final C33493a f91406a;

    /* compiled from: ShadowSpan.kt */
    @Metadata
    /* renamed from: ha.d$a */
    /* loaded from: classes8.dex */
    public static final class C33493a {

        /* renamed from: a */
        private final float f91407a;

        /* renamed from: b */
        private final float f91408b;

        /* renamed from: c */
        private final float f91409c;

        /* renamed from: d */
        private final int f91410d;

        public C33493a(float f, float f2, float f3, int i) {
            this.f91407a = f;
            this.f91408b = f2;
            this.f91409c = f3;
            this.f91410d = i;
        }

        /* renamed from: a */
        public final int m23629a() {
            return this.f91410d;
        }

        /* renamed from: b */
        public final float m23628b() {
            return this.f91407a;
        }

        /* renamed from: c */
        public final float m23627c() {
            return this.f91408b;
        }

        /* renamed from: d */
        public final float m23626d() {
            return this.f91409c;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C33493a)) {
                return false;
            }
            C33493a c33493a = (C33493a) obj;
            if (Float.compare(this.f91407a, c33493a.f91407a) == 0 && Float.compare(this.f91408b, c33493a.f91408b) == 0 && Float.compare(this.f91409c, c33493a.f91409c) == 0 && this.f91410d == c33493a.f91410d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f91407a) * 31) + Float.hashCode(this.f91408b)) * 31) + Float.hashCode(this.f91409c)) * 31) + Integer.hashCode(this.f91410d);
        }

        @NotNull
        public String toString() {
            return "ShadowParams(offsetX=" + this.f91407a + ", offsetY=" + this.f91408b + ", radius=" + this.f91409c + ", color=" + this.f91410d + ')';
        }
    }

    public ShadowSpan(@NotNull C33493a shadow) {
        Intrinsics.checkNotNullParameter(shadow, "shadow");
        this.f91406a = shadow;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@Nullable TextPaint textPaint) {
        C33493a c33493a = this.f91406a;
        if (textPaint != null) {
            textPaint.setShadowLayer(c33493a.m23626d(), c33493a.m23628b(), c33493a.m23627c(), c33493a.m23629a());
        }
    }
}
