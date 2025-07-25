package androidx.compose.p015ui.text.font;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$2$1 */
/* loaded from: classes.dex */
final class FontListFontFamilyTypefaceAdapter$preload$2$1 extends Lambda implements Function1<TypefaceRequest, Unit> {
    public static final FontListFontFamilyTypefaceAdapter$preload$2$1 INSTANCE = new FontListFontFamilyTypefaceAdapter$preload$2$1();

    FontListFontFamilyTypefaceAdapter$preload$2$1() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull TypefaceRequest it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TypefaceRequest typefaceRequest) {
        invoke2(typefaceRequest);
        return Unit.f99208a;
    }
}
