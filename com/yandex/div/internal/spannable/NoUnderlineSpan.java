package com.yandex.div.internal.spannable;

import android.text.TextPaint;
import android.text.style.UnderlineSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: NoUnderlineSpan.kt */
@Metadata
/* loaded from: classes8.dex */
public final class NoUnderlineSpan extends UnderlineSpan {
    @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        ds.setUnderlineText(false);
    }
}
