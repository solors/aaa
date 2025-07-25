package com.yandex.div.internal.spannable;

import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextColorSpan.kt */
@Metadata
/* loaded from: classes8.dex */
public final class TextColorSpan extends ForegroundColorSpan {
    public TextColorSpan(int i) {
        super(i);
    }

    @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        super.updateDrawState(textPaint);
        textPaint.setShader(null);
    }
}
