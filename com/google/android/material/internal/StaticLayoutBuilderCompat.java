package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes5.dex */
final class StaticLayoutBuilderCompat {

    /* renamed from: o */
    static final int f37826o = 1;

    /* renamed from: a */
    private CharSequence f37827a;

    /* renamed from: b */
    private final TextPaint f37828b;

    /* renamed from: c */
    private final int f37829c;

    /* renamed from: e */
    private int f37831e;

    /* renamed from: l */
    private boolean f37838l;
    @Nullable

    /* renamed from: n */
    private StaticLayoutBuilderConfigurer f37840n;

    /* renamed from: d */
    private int f37830d = 0;

    /* renamed from: f */
    private Layout.Alignment f37832f = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: g */
    private int f37833g = Integer.MAX_VALUE;

    /* renamed from: h */
    private float f37834h = 0.0f;

    /* renamed from: i */
    private float f37835i = 1.0f;

    /* renamed from: j */
    private int f37836j = f37826o;

    /* renamed from: k */
    private boolean f37837k = true;
    @Nullable

    /* renamed from: m */
    private TextUtils.TruncateAt f37839m = null;

    /* loaded from: classes5.dex */
    static class StaticLayoutBuilderCompatException extends Exception {
    }

    private StaticLayoutBuilderCompat(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f37827a = charSequence;
        this.f37828b = textPaint;
        this.f37829c = i;
        this.f37831e = charSequence.length();
    }

    @NonNull
    public static StaticLayoutBuilderCompat obtain(@NonNull CharSequence charSequence, @NonNull TextPaint textPaint, @IntRange(from = 0) int i) {
        return new StaticLayoutBuilderCompat(charSequence, textPaint, i);
    }

    public StaticLayout build() throws StaticLayoutBuilderCompatException {
        TextDirectionHeuristic textDirectionHeuristic;
        if (this.f37827a == null) {
            this.f37827a = "";
        }
        int max = Math.max(0, this.f37829c);
        CharSequence charSequence = this.f37827a;
        if (this.f37833g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f37828b, max, this.f37839m);
        }
        int min = Math.min(charSequence.length(), this.f37831e);
        this.f37831e = min;
        if (this.f37838l && this.f37833g == 1) {
            this.f37832f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.f37830d, min, this.f37828b, max);
        obtain.setAlignment(this.f37832f);
        obtain.setIncludePad(this.f37837k);
        if (this.f37838l) {
            textDirectionHeuristic = TextDirectionHeuristics.RTL;
        } else {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        }
        obtain.setTextDirection(textDirectionHeuristic);
        TextUtils.TruncateAt truncateAt = this.f37839m;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f37833g);
        float f = this.f37834h;
        if (f != 0.0f || this.f37835i != 1.0f) {
            obtain.setLineSpacing(f, this.f37835i);
        }
        if (this.f37833g > 1) {
            obtain.setHyphenationFrequency(this.f37836j);
        }
        StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer = this.f37840n;
        if (staticLayoutBuilderConfigurer != null) {
            staticLayoutBuilderConfigurer.configure(obtain);
        }
        return obtain.build();
    }

    @NonNull
    public StaticLayoutBuilderCompat setAlignment(@NonNull Layout.Alignment alignment) {
        this.f37832f = alignment;
        return this;
    }

    @NonNull
    public StaticLayoutBuilderCompat setEllipsize(@Nullable TextUtils.TruncateAt truncateAt) {
        this.f37839m = truncateAt;
        return this;
    }

    @NonNull
    public StaticLayoutBuilderCompat setEnd(@IntRange(from = 0) int i) {
        this.f37831e = i;
        return this;
    }

    @NonNull
    public StaticLayoutBuilderCompat setHyphenationFrequency(int i) {
        this.f37836j = i;
        return this;
    }

    @NonNull
    public StaticLayoutBuilderCompat setIncludePad(boolean z) {
        this.f37837k = z;
        return this;
    }

    public StaticLayoutBuilderCompat setIsRtl(boolean z) {
        this.f37838l = z;
        return this;
    }

    @NonNull
    public StaticLayoutBuilderCompat setLineSpacing(float f, float f2) {
        this.f37834h = f;
        this.f37835i = f2;
        return this;
    }

    @NonNull
    public StaticLayoutBuilderCompat setMaxLines(@IntRange(from = 0) int i) {
        this.f37833g = i;
        return this;
    }

    @NonNull
    public StaticLayoutBuilderCompat setStart(@IntRange(from = 0) int i) {
        this.f37830d = i;
        return this;
    }

    @NonNull
    public StaticLayoutBuilderCompat setStaticLayoutBuilderConfigurer(@Nullable StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer) {
        this.f37840n = staticLayoutBuilderConfigurer;
        return this;
    }
}
