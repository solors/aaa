package com.yandex.div.internal.spannable;

import android.text.TextPaint;
import android.text.style.StrikethroughSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: NoStrikethroughSpan.kt */
@Metadata
/* loaded from: classes8.dex */
public final class NoStrikethroughSpan extends StrikethroughSpan {
    @Override // android.text.style.StrikethroughSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        ds.setStrikeThruText(false);
    }
}
