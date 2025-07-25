package androidx.compose.p015ui.text.font;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidFontResolveInterceptor.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.font.AndroidFontResolveInterceptor */
/* loaded from: classes.dex */
public final class AndroidFontResolveInterceptor implements PlatformResolveInterceptor {
    private final int fontWeightAdjustment;

    public AndroidFontResolveInterceptor(int i) {
        this.fontWeightAdjustment = i;
    }

    private final int component1() {
        return this.fontWeightAdjustment;
    }

    public static /* synthetic */ AndroidFontResolveInterceptor copy$default(AndroidFontResolveInterceptor androidFontResolveInterceptor, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = androidFontResolveInterceptor.fontWeightAdjustment;
        }
        return androidFontResolveInterceptor.copy(i);
    }

    @NotNull
    public final AndroidFontResolveInterceptor copy(int i) {
        return new AndroidFontResolveInterceptor(i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof AndroidFontResolveInterceptor) && this.fontWeightAdjustment == ((AndroidFontResolveInterceptor) obj).fontWeightAdjustment) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Integer.hashCode(this.fontWeightAdjustment);
    }

    @Override // androidx.compose.p015ui.text.font.PlatformResolveInterceptor
    @NotNull
    public FontWeight interceptFontWeight(@NotNull FontWeight fontWeight) {
        int m16908n;
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        int i = this.fontWeightAdjustment;
        if (i != 0 && i != Integer.MAX_VALUE) {
            m16908n = _Ranges.m16908n(fontWeight.getWeight() + this.fontWeightAdjustment, 1, 1000);
            return new FontWeight(m16908n);
        }
        return fontWeight;
    }

    @NotNull
    public String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.fontWeightAdjustment + ')';
    }
}
