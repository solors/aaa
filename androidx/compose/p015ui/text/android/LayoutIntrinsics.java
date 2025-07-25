package androidx.compose.p015ui.text.android;

import android.text.BoringLayout;
import android.text.TextPaint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.EnumC38505n;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* compiled from: LayoutIntrinsics.kt */
@InternalPlatformTextApi
@Metadata
/* renamed from: androidx.compose.ui.text.android.LayoutIntrinsics */
/* loaded from: classes.dex */
public final class LayoutIntrinsics {
    @NotNull
    private final InterfaceC38501j boringMetrics$delegate;
    @NotNull
    private final InterfaceC38501j maxIntrinsicWidth$delegate;
    @NotNull
    private final InterfaceC38501j minIntrinsicWidth$delegate;

    public LayoutIntrinsics(@NotNull CharSequence charSequence, @NotNull TextPaint textPaint, int i) {
        InterfaceC38501j m14553b;
        InterfaceC38501j m14553b2;
        InterfaceC38501j m14553b3;
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        EnumC38505n enumC38505n = EnumC38505n.f101867d;
        m14553b = LazyJVM.m14553b(enumC38505n, new LayoutIntrinsics$boringMetrics$2(i, charSequence, textPaint));
        this.boringMetrics$delegate = m14553b;
        m14553b2 = LazyJVM.m14553b(enumC38505n, new LayoutIntrinsics$minIntrinsicWidth$2(charSequence, textPaint));
        this.minIntrinsicWidth$delegate = m14553b2;
        m14553b3 = LazyJVM.m14553b(enumC38505n, new LayoutIntrinsics$maxIntrinsicWidth$2(this, charSequence, textPaint));
        this.maxIntrinsicWidth$delegate = m14553b3;
    }

    @Nullable
    public final BoringLayout.Metrics getBoringMetrics() {
        return (BoringLayout.Metrics) this.boringMetrics$delegate.getValue();
    }

    public final float getMaxIntrinsicWidth() {
        return ((Number) this.maxIntrinsicWidth$delegate.getValue()).floatValue();
    }

    public final float getMinIntrinsicWidth() {
        return ((Number) this.minIntrinsicWidth$delegate.getValue()).floatValue();
    }
}
