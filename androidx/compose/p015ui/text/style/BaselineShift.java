package androidx.compose.p015ui.text.style;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: BaselineShift.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.text.style.BaselineShift */
/* loaded from: classes.dex */
public final class BaselineShift {
    private final float multiplier;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final float Superscript = m109592constructorimpl(0.5f);
    private static final float Subscript = m109592constructorimpl(-0.5f);
    private static final float None = m109592constructorimpl(0.0f);

    private /* synthetic */ BaselineShift(float f) {
        this.multiplier = f;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ BaselineShift m109591boximpl(float f) {
        return new BaselineShift(f);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m109593equalsimpl(float f, Object obj) {
        if (!(obj instanceof BaselineShift)) {
            return false;
        }
        if (!Intrinsics.m17075f(Float.valueOf(f), Float.valueOf(((BaselineShift) obj).m109597unboximpl()))) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m109594equalsimpl0(float f, float f2) {
        return Intrinsics.m17075f(Float.valueOf(f), Float.valueOf(f2));
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m109595hashCodeimpl(float f) {
        return Float.hashCode(f);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m109596toStringimpl(float f) {
        return "BaselineShift(multiplier=" + f + ')';
    }

    public boolean equals(Object obj) {
        return m109593equalsimpl(this.multiplier, obj);
    }

    public final float getMultiplier() {
        return this.multiplier;
    }

    public int hashCode() {
        return m109595hashCodeimpl(this.multiplier);
    }

    public String toString() {
        return m109596toStringimpl(this.multiplier);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ float m109597unboximpl() {
        return this.multiplier;
    }

    /* compiled from: BaselineShift.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.text.style.BaselineShift$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getNone-y9eOQZs  reason: not valid java name */
        public final float m109601getNoney9eOQZs() {
            return BaselineShift.None;
        }

        /* renamed from: getSubscript-y9eOQZs  reason: not valid java name */
        public final float m109602getSubscripty9eOQZs() {
            return BaselineShift.Subscript;
        }

        /* renamed from: getSuperscript-y9eOQZs  reason: not valid java name */
        public final float m109603getSuperscripty9eOQZs() {
            return BaselineShift.Superscript;
        }

        @Stable
        /* renamed from: getNone-y9eOQZs$annotations  reason: not valid java name */
        public static /* synthetic */ void m109598getNoney9eOQZs$annotations() {
        }

        @Stable
        /* renamed from: getSubscript-y9eOQZs$annotations  reason: not valid java name */
        public static /* synthetic */ void m109599getSubscripty9eOQZs$annotations() {
        }

        @Stable
        /* renamed from: getSuperscript-y9eOQZs$annotations  reason: not valid java name */
        public static /* synthetic */ void m109600getSuperscripty9eOQZs$annotations() {
        }
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static float m109592constructorimpl(float f) {
        return f;
    }
}
