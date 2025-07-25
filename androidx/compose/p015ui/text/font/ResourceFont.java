package androidx.compose.p015ui.text.font;

import androidx.compose.p015ui.text.ExperimentalTextApi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Font.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.font.ResourceFont */
/* loaded from: classes.dex */
public final class ResourceFont implements Font {
    private final int loadingStrategy;
    private final int resId;
    private final int style;
    @NotNull
    private final FontWeight weight;

    public /* synthetic */ ResourceFont(int i, FontWeight fontWeight, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, fontWeight, i2, i3);
    }

    /* renamed from: copy-RetOiIg$default  reason: not valid java name */
    public static /* synthetic */ ResourceFont m109491copyRetOiIg$default(ResourceFont resourceFont, int i, FontWeight fontWeight, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = resourceFont.resId;
        }
        if ((i3 & 2) != 0) {
            fontWeight = resourceFont.getWeight();
        }
        if ((i3 & 4) != 0) {
            i2 = resourceFont.mo109408getStyle_LCdwA();
        }
        return resourceFont.m109494copyRetOiIg(i, fontWeight, i2);
    }

    /* renamed from: copy-YpTlLL0$default  reason: not valid java name */
    public static /* synthetic */ ResourceFont m109492copyYpTlLL0$default(ResourceFont resourceFont, int i, FontWeight fontWeight, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = resourceFont.resId;
        }
        if ((i4 & 2) != 0) {
            fontWeight = resourceFont.getWeight();
        }
        if ((i4 & 4) != 0) {
            i2 = resourceFont.mo109408getStyle_LCdwA();
        }
        if ((i4 & 8) != 0) {
            i3 = resourceFont.mo109409getLoadingStrategyPKNRLFQ();
        }
        return resourceFont.m109495copyYpTlLL0(i, fontWeight, i2, i3);
    }

    @NotNull
    /* renamed from: copy-RetOiIg  reason: not valid java name */
    public final ResourceFont m109494copyRetOiIg(int i, @NotNull FontWeight weight, int i2) {
        Intrinsics.checkNotNullParameter(weight, "weight");
        return m109495copyYpTlLL0(i, weight, i2, mo109409getLoadingStrategyPKNRLFQ());
    }

    @ExperimentalTextApi
    @NotNull
    /* renamed from: copy-YpTlLL0  reason: not valid java name */
    public final ResourceFont m109495copyYpTlLL0(int i, @NotNull FontWeight weight, int i2, int i3) {
        Intrinsics.checkNotNullParameter(weight, "weight");
        return new ResourceFont(i, weight, i2, i3, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourceFont)) {
            return false;
        }
        ResourceFont resourceFont = (ResourceFont) obj;
        if (this.resId == resourceFont.resId && Intrinsics.m17075f(getWeight(), resourceFont.getWeight()) && FontStyle.m109460equalsimpl0(mo109408getStyle_LCdwA(), resourceFont.mo109408getStyle_LCdwA()) && FontLoadingStrategy.m109447equalsimpl0(mo109409getLoadingStrategyPKNRLFQ(), resourceFont.mo109409getLoadingStrategyPKNRLFQ())) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.p015ui.text.font.Font
    @ExperimentalTextApi
    /* renamed from: getLoadingStrategy-PKNRLFQ */
    public int mo109409getLoadingStrategyPKNRLFQ() {
        return this.loadingStrategy;
    }

    public final int getResId() {
        return this.resId;
    }

    @Override // androidx.compose.p015ui.text.font.Font
    /* renamed from: getStyle-_-LCdwA */
    public int mo109408getStyle_LCdwA() {
        return this.style;
    }

    @Override // androidx.compose.p015ui.text.font.Font
    @NotNull
    public FontWeight getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return (((((this.resId * 31) + getWeight().hashCode()) * 31) + FontStyle.m109461hashCodeimpl(mo109408getStyle_LCdwA())) * 31) + FontLoadingStrategy.m109448hashCodeimpl(mo109409getLoadingStrategyPKNRLFQ());
    }

    @NotNull
    public String toString() {
        return "ResourceFont(resId=" + this.resId + ", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m109462toStringimpl(mo109408getStyle_LCdwA())) + ", loadingStrategy=" + ((Object) FontLoadingStrategy.m109449toStringimpl(mo109409getLoadingStrategyPKNRLFQ())) + ')';
    }

    private ResourceFont(int i, FontWeight fontWeight, int i2, int i3) {
        this.resId = i;
        this.weight = fontWeight;
        this.style = i2;
        this.loadingStrategy = i3;
    }

    public /* synthetic */ ResourceFont(int i, FontWeight fontWeight, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i4 & 2) != 0 ? FontWeight.Companion.getNormal() : fontWeight, (i4 & 4) != 0 ? FontStyle.Companion.m109465getNormal_LCdwA() : i2, (i4 & 8) != 0 ? FontLoadingStrategy.Companion.m109451getAsyncPKNRLFQ() : i3, null);
    }

    @ExperimentalTextApi
    /* renamed from: getLoadingStrategy-PKNRLFQ$annotations  reason: not valid java name */
    public static /* synthetic */ void m109493getLoadingStrategyPKNRLFQ$annotations() {
    }
}
