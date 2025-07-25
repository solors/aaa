package androidx.compose.foundation;

import android.os.Build;
import androidx.compose.p015ui.unit.C1059Dp;
import androidx.compose.p015ui.unit.DpSize;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Magnifier.kt */
@Stable
@ExperimentalFoundationApi
@Metadata
/* loaded from: classes.dex */
public final class MagnifierStyle {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final MagnifierStyle Default;
    @NotNull
    private static final MagnifierStyle TextDefault;
    private final boolean clippingEnabled;
    private final float cornerRadius;
    private final float elevation;
    private final boolean fishEyeEnabled;
    private final long size;
    private final boolean useTextDefault;

    static {
        MagnifierStyle magnifierStyle = new MagnifierStyle(0L, 0.0f, 0.0f, false, false, 31, (DefaultConstructorMarker) null);
        Default = magnifierStyle;
        TextDefault = new MagnifierStyle(true, magnifierStyle.size, magnifierStyle.cornerRadius, magnifierStyle.elevation, magnifierStyle.clippingEnabled, magnifierStyle.fishEyeEnabled, (DefaultConstructorMarker) null);
    }

    @ExperimentalFoundationApi
    public /* synthetic */ MagnifierStyle(long j, float f, float f2, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, f, f2, z, z2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagnifierStyle)) {
            return false;
        }
        MagnifierStyle magnifierStyle = (MagnifierStyle) obj;
        if (this.useTextDefault == magnifierStyle.useTextDefault && DpSize.m109829equalsimpl0(this.size, magnifierStyle.size) && C1059Dp.m109739equalsimpl0(this.cornerRadius, magnifierStyle.cornerRadius) && C1059Dp.m109739equalsimpl0(this.elevation, magnifierStyle.elevation) && this.clippingEnabled == magnifierStyle.clippingEnabled && this.fishEyeEnabled == magnifierStyle.fishEyeEnabled) {
            return true;
        }
        return false;
    }

    public final boolean getClippingEnabled$foundation_release() {
        return this.clippingEnabled;
    }

    /* renamed from: getCornerRadius-D9Ej5fM$foundation_release  reason: not valid java name */
    public final float m106138getCornerRadiusD9Ej5fM$foundation_release() {
        return this.cornerRadius;
    }

    /* renamed from: getElevation-D9Ej5fM$foundation_release  reason: not valid java name */
    public final float m106139getElevationD9Ej5fM$foundation_release() {
        return this.elevation;
    }

    public final boolean getFishEyeEnabled$foundation_release() {
        return this.fishEyeEnabled;
    }

    /* renamed from: getSize-MYxV2XQ$foundation_release  reason: not valid java name */
    public final long m106140getSizeMYxV2XQ$foundation_release() {
        return this.size;
    }

    public final boolean getUseTextDefault$foundation_release() {
        return this.useTextDefault;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.useTextDefault) * 31) + DpSize.m109834hashCodeimpl(this.size)) * 31) + C1059Dp.m109740hashCodeimpl(this.cornerRadius)) * 31) + C1059Dp.m109740hashCodeimpl(this.elevation)) * 31) + Boolean.hashCode(this.clippingEnabled)) * 31) + Boolean.hashCode(this.fishEyeEnabled);
    }

    public final boolean isSupported() {
        return Companion.isStyleSupported$foundation_release$default(Companion, this, 0, 2, null);
    }

    @NotNull
    public String toString() {
        if (this.useTextDefault) {
            return "MagnifierStyle.TextDefault";
        }
        return "MagnifierStyle(size=" + ((Object) DpSize.m109839toStringimpl(this.size)) + ", cornerRadius=" + ((Object) C1059Dp.m109745toStringimpl(this.cornerRadius)) + ", elevation=" + ((Object) C1059Dp.m109745toStringimpl(this.elevation)) + ", clippingEnabled=" + this.clippingEnabled + ", fishEyeEnabled=" + this.fishEyeEnabled + ')';
    }

    public /* synthetic */ MagnifierStyle(boolean z, long j, float f, float f2, boolean z2, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, j, f, f2, z2, z3);
    }

    private MagnifierStyle(boolean z, long j, float f, float f2, boolean z2, boolean z3) {
        this.useTextDefault = z;
        this.size = j;
        this.cornerRadius = f;
        this.elevation = f2;
        this.clippingEnabled = z2;
        this.fishEyeEnabled = z3;
    }

    public /* synthetic */ MagnifierStyle(long j, float f, float f2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DpSize.Companion.m109841getUnspecifiedMYxV2XQ() : j, (i & 2) != 0 ? C1059Dp.Companion.m109754getUnspecifiedD9Ej5fM() : f, (i & 4) != 0 ? C1059Dp.Companion.m109754getUnspecifiedD9Ej5fM() : f2, (i & 8) != 0 ? true : z, (i & 16) != 0 ? false : z2, (DefaultConstructorMarker) null);
    }

    private MagnifierStyle(long j, float f, float f2, boolean z, boolean z2) {
        this(false, j, f, f2, z, z2, (DefaultConstructorMarker) null);
    }

    /* compiled from: Magnifier.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ boolean isStyleSupported$foundation_release$default(Companion companion, MagnifierStyle magnifierStyle, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = Build.VERSION.SDK_INT;
            }
            return companion.isStyleSupported$foundation_release(magnifierStyle, i);
        }

        @NotNull
        public final MagnifierStyle getDefault() {
            return MagnifierStyle.Default;
        }

        @NotNull
        public final MagnifierStyle getTextDefault() {
            return MagnifierStyle.TextDefault;
        }

        public final boolean isStyleSupported$foundation_release(@NotNull MagnifierStyle style, int i) {
            Intrinsics.checkNotNullParameter(style, "style");
            if (!Magnifier.isPlatformMagnifierSupported(i) || style.getFishEyeEnabled$foundation_release()) {
                return false;
            }
            if (!style.getUseTextDefault$foundation_release() && !Intrinsics.m17075f(style, getDefault()) && i < 29) {
                return false;
            }
            return true;
        }

        @ExperimentalFoundationApi
        public static /* synthetic */ void getDefault$annotations() {
        }

        @ExperimentalFoundationApi
        public static /* synthetic */ void getTextDefault$annotations() {
        }
    }
}
