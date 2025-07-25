package androidx.compose.p015ui.text.font;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FontFamilyResolver.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.font.PlatformResolveInterceptor */
/* loaded from: classes.dex */
public interface PlatformResolveInterceptor {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: FontFamilyResolver.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.text.font.PlatformResolveInterceptor$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        @NotNull
        private static final PlatformResolveInterceptor Default = new PlatformResolveInterceptor() { // from class: androidx.compose.ui.text.font.PlatformResolveInterceptor$Companion$Default$1
        };

        private Companion() {
        }

        @NotNull
        public final PlatformResolveInterceptor getDefault$ui_text_release() {
            return Default;
        }
    }

    @NotNull
    default FontWeight interceptFontWeight(@NotNull FontWeight fontWeight) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        return fontWeight;
    }

    @Nullable
    default FontFamily interceptFontFamily(@Nullable FontFamily fontFamily) {
        return fontFamily;
    }

    /* renamed from: interceptFontStyle-T2F_aPo  reason: not valid java name */
    default int m109480interceptFontStyleT2F_aPo(int i) {
        return i;
    }

    /* renamed from: interceptFontSynthesis-Mscr08Y  reason: not valid java name */
    default int m109481interceptFontSynthesisMscr08Y(int i) {
        return i;
    }
}
