package androidx.compose.p015ui.text.font;

import android.graphics.Typeface;
import androidx.compose.p015ui.text.ExperimentalTextApi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DeviceFontFamilyNameFont.kt */
@ExperimentalTextApi
@Metadata
/* renamed from: androidx.compose.ui.text.font.DeviceFontFamilyNameFont */
/* loaded from: classes.dex */
final class DeviceFontFamilyNameFont extends AndroidFont {
    @NotNull
    private final String familyName;
    @Nullable
    private final Typeface resolvedTypeface;
    private final int style;
    @NotNull
    private final FontWeight weight;

    public /* synthetic */ DeviceFontFamilyNameFont(String str, FontWeight fontWeight, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, fontWeight, i);
    }

    public boolean equals(@Nullable Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.m17075f(DeviceFontFamilyNameFont.class, cls)) {
            return false;
        }
        if (obj != null) {
            DeviceFontFamilyNameFont deviceFontFamilyNameFont = (DeviceFontFamilyNameFont) obj;
            if (DeviceFontFamilyName.m109431equalsimpl0(this.familyName, deviceFontFamilyNameFont.familyName) && Intrinsics.m17075f(getWeight(), deviceFontFamilyNameFont.getWeight()) && FontStyle.m109460equalsimpl0(mo109408getStyle_LCdwA(), deviceFontFamilyNameFont.mo109408getStyle_LCdwA())) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.text.font.DeviceFontFamilyNameFont");
    }

    @Nullable
    public final Typeface getResolvedTypeface() {
        return this.resolvedTypeface;
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
        return (((DeviceFontFamilyName.m109432hashCodeimpl(this.familyName) * 31) + getWeight().hashCode()) * 31) + FontStyle.m109461hashCodeimpl(mo109408getStyle_LCdwA());
    }

    @NotNull
    public String toString() {
        return "Font(familyName=\"" + ((Object) DeviceFontFamilyName.m109433toStringimpl(this.familyName)) + "\", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m109462toStringimpl(mo109408getStyle_LCdwA())) + ')';
    }

    private DeviceFontFamilyNameFont(String str, FontWeight fontWeight, int i) {
        super(FontLoadingStrategy.Companion.m109453getOptionalLocalPKNRLFQ(), NamedFontLoader.INSTANCE, null);
        this.familyName = str;
        this.weight = fontWeight;
        this.style = i;
        this.resolvedTypeface = PlatformTypefacesKt.PlatformTypefaces().mo109484optionalOnDeviceFontFamilyByNameRetOiIg(str, getWeight(), mo109408getStyle_LCdwA());
    }
}
