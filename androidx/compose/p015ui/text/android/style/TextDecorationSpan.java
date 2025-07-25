package androidx.compose.p015ui.text.android.style;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.compose.p015ui.text.android.InternalPlatformTextApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextDecorationSpan.kt */
@InternalPlatformTextApi
@Metadata
/* renamed from: androidx.compose.ui.text.android.style.TextDecorationSpan */
/* loaded from: classes.dex */
public final class TextDecorationSpan extends CharacterStyle {
    private final boolean isStrikethroughText;
    private final boolean isUnderlineText;

    public TextDecorationSpan(boolean z, boolean z2) {
        this.isUnderlineText = z;
        this.isStrikethroughText = z2;
    }

    public final boolean isStrikethroughText() {
        return this.isStrikethroughText;
    }

    public final boolean isUnderlineText() {
        return this.isUnderlineText;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        textPaint.setUnderlineText(this.isUnderlineText);
        textPaint.setStrikeThruText(this.isStrikethroughText);
    }
}
