package androidx.compose.p015ui.text.platform;

import android.graphics.Typeface;
import android.text.style.TypefaceSpan;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidAccessibilitySpannableString.android.kt */
@RequiresApi(28)
@Metadata
/* renamed from: androidx.compose.ui.text.platform.Api28Impl */
/* loaded from: classes.dex */
final class Api28Impl {
    @NotNull
    public static final Api28Impl INSTANCE = new Api28Impl();

    private Api28Impl() {
    }

    @DoNotInline
    @NotNull
    public final TypefaceSpan createTypefaceSpan(@NotNull Typeface typeface) {
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        return new TypefaceSpan(typeface);
    }
}
