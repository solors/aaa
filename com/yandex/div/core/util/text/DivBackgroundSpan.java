package com.yandex.div.core.util.text;

import android.text.TextPaint;
import android.text.style.UnderlineSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sb.DivTextRangeBackground;
import sb.DivTextRangeBorder;

/* compiled from: DivBackgroundSpan.kt */
@Metadata
/* loaded from: classes8.dex */
public final class DivBackgroundSpan extends UnderlineSpan {
    @Nullable

    /* renamed from: b */
    private final DivTextRangeBorder f75376b;
    @Nullable

    /* renamed from: c */
    private final DivTextRangeBackground f75377c;

    public DivBackgroundSpan(@Nullable DivTextRangeBorder divTextRangeBorder, @Nullable DivTextRangeBackground divTextRangeBackground) {
        this.f75376b = divTextRangeBorder;
        this.f75377c = divTextRangeBackground;
    }

    @Nullable
    /* renamed from: c */
    public final DivTextRangeBackground m37169c() {
        return this.f75377c;
    }

    @Nullable
    /* renamed from: d */
    public final DivTextRangeBorder m37168d() {
        return this.f75376b;
    }

    @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        ds.setUnderlineText(false);
    }
}
