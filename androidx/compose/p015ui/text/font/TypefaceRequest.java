package androidx.compose.p015ui.text.font;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FontFamilyResolver.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.font.TypefaceRequest */
/* loaded from: classes.dex */
public final class TypefaceRequest {
    @Nullable
    private final FontFamily fontFamily;
    private final int fontStyle;
    private final int fontSynthesis;
    @NotNull
    private final FontWeight fontWeight;
    @Nullable
    private final Object resourceLoaderCacheKey;

    public /* synthetic */ TypefaceRequest(FontFamily fontFamily, FontWeight fontWeight, int i, int i2, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(fontFamily, fontWeight, i, i2, obj);
    }

    /* renamed from: copy-e1PVR60$default  reason: not valid java name */
    public static /* synthetic */ TypefaceRequest m109496copye1PVR60$default(TypefaceRequest typefaceRequest, FontFamily fontFamily, FontWeight fontWeight, int i, int i2, Object obj, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            fontFamily = typefaceRequest.fontFamily;
        }
        if ((i3 & 2) != 0) {
            fontWeight = typefaceRequest.fontWeight;
        }
        FontWeight fontWeight2 = fontWeight;
        if ((i3 & 4) != 0) {
            i = typefaceRequest.fontStyle;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = typefaceRequest.fontSynthesis;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            obj = typefaceRequest.resourceLoaderCacheKey;
        }
        return typefaceRequest.m109499copye1PVR60(fontFamily, fontWeight2, i4, i5, obj);
    }

    @Nullable
    public final FontFamily component1() {
        return this.fontFamily;
    }

    @NotNull
    public final FontWeight component2() {
        return this.fontWeight;
    }

    /* renamed from: component3-_-LCdwA  reason: not valid java name */
    public final int m109497component3_LCdwA() {
        return this.fontStyle;
    }

    /* renamed from: component4-GVVA2EU  reason: not valid java name */
    public final int m109498component4GVVA2EU() {
        return this.fontSynthesis;
    }

    @Nullable
    public final Object component5() {
        return this.resourceLoaderCacheKey;
    }

    @NotNull
    /* renamed from: copy-e1PVR60  reason: not valid java name */
    public final TypefaceRequest m109499copye1PVR60(@Nullable FontFamily fontFamily, @NotNull FontWeight fontWeight, int i, int i2, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        return new TypefaceRequest(fontFamily, fontWeight, i, i2, obj, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypefaceRequest)) {
            return false;
        }
        TypefaceRequest typefaceRequest = (TypefaceRequest) obj;
        if (Intrinsics.m17075f(this.fontFamily, typefaceRequest.fontFamily) && Intrinsics.m17075f(this.fontWeight, typefaceRequest.fontWeight) && FontStyle.m109460equalsimpl0(this.fontStyle, typefaceRequest.fontStyle) && FontSynthesis.m109469equalsimpl0(this.fontSynthesis, typefaceRequest.fontSynthesis) && Intrinsics.m17075f(this.resourceLoaderCacheKey, typefaceRequest.resourceLoaderCacheKey)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    /* renamed from: getFontStyle-_-LCdwA  reason: not valid java name */
    public final int m109500getFontStyle_LCdwA() {
        return this.fontStyle;
    }

    /* renamed from: getFontSynthesis-GVVA2EU  reason: not valid java name */
    public final int m109501getFontSynthesisGVVA2EU() {
        return this.fontSynthesis;
    }

    @NotNull
    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    @Nullable
    public final Object getResourceLoaderCacheKey() {
        return this.resourceLoaderCacheKey;
    }

    public int hashCode() {
        int hashCode;
        FontFamily fontFamily = this.fontFamily;
        int i = 0;
        if (fontFamily == null) {
            hashCode = 0;
        } else {
            hashCode = fontFamily.hashCode();
        }
        int hashCode2 = ((((((hashCode * 31) + this.fontWeight.hashCode()) * 31) + FontStyle.m109461hashCodeimpl(this.fontStyle)) * 31) + FontSynthesis.m109470hashCodeimpl(this.fontSynthesis)) * 31;
        Object obj = this.resourceLoaderCacheKey;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public String toString() {
        return "TypefaceRequest(fontFamily=" + this.fontFamily + ", fontWeight=" + this.fontWeight + ", fontStyle=" + ((Object) FontStyle.m109462toStringimpl(this.fontStyle)) + ", fontSynthesis=" + ((Object) FontSynthesis.m109473toStringimpl(this.fontSynthesis)) + ", resourceLoaderCacheKey=" + this.resourceLoaderCacheKey + ')';
    }

    private TypefaceRequest(FontFamily fontFamily, FontWeight fontWeight, int i, int i2, Object obj) {
        this.fontFamily = fontFamily;
        this.fontWeight = fontWeight;
        this.fontStyle = i;
        this.fontSynthesis = i2;
        this.resourceLoaderCacheKey = obj;
    }
}
