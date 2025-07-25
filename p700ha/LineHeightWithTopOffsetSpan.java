package p700ha;

import android.graphics.Paint;
import android.text.Spanned;
import android.text.style.LineHeightSpan;
import androidx.annotation.InterfaceC0152Px;
import be.MathJVM;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: ha.c */
/* loaded from: classes8.dex */
public final class LineHeightWithTopOffsetSpan implements LineHeightSpan {
    @InterfaceC0152Px

    /* renamed from: b */
    private final int f91398b;
    @InterfaceC0152Px

    /* renamed from: c */
    private final int f91399c;
    @InterfaceC0152Px

    /* renamed from: d */
    private final int f91400d;

    /* renamed from: f */
    private boolean f91401f;

    /* renamed from: g */
    private int f91402g = -1;

    /* renamed from: h */
    private int f91403h = -1;

    /* renamed from: i */
    private int f91404i = -1;

    /* renamed from: j */
    private int f91405j = -1;

    public LineHeightWithTopOffsetSpan(int i, int i2, int i3) {
        this.f91398b = i;
        this.f91399c = i2;
        this.f91400d = i3;
    }

    /* renamed from: a */
    private final void m23633a(Paint.FontMetricsInt fontMetricsInt) {
        int m103791d;
        int i = this.f91399c;
        if (i <= 0) {
            return;
        }
        int i2 = fontMetricsInt.descent;
        int i3 = fontMetricsInt.ascent;
        int i4 = i2 - i3;
        int i5 = fontMetricsInt.top - i3;
        int i6 = fontMetricsInt.bottom - i2;
        if (i4 >= 0) {
            m103791d = MathJVM.m103791d(i2 * ((i * 1.0f) / i4));
            fontMetricsInt.descent = m103791d;
            int i7 = m103791d - i;
            fontMetricsInt.ascent = i7;
            fontMetricsInt.top = i7 + i5;
            fontMetricsInt.bottom = m103791d + i6;
        }
    }

    /* renamed from: b */
    private final void m23632b(Paint.FontMetricsInt fontMetricsInt) {
        int i = this.f91398b;
        if (i <= 0) {
            return;
        }
        fontMetricsInt.top -= i;
        fontMetricsInt.ascent -= i;
    }

    /* renamed from: c */
    private final void m23631c(Paint.FontMetricsInt fontMetricsInt) {
        fontMetricsInt.top = this.f91402g;
        fontMetricsInt.ascent = this.f91403h;
        fontMetricsInt.descent = this.f91404i;
        fontMetricsInt.bottom = this.f91405j;
    }

    /* renamed from: d */
    private final void m23630d(Paint.FontMetricsInt fontMetricsInt) {
        this.f91402g = fontMetricsInt.top;
        this.f91403h = fontMetricsInt.ascent;
        this.f91404i = fontMetricsInt.descent;
        this.f91405j = fontMetricsInt.bottom;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(@Nullable CharSequence charSequence, int i, int i2, int i3, int i4, @NotNull Paint.FontMetricsInt fm) {
        Spanned spanned;
        boolean m16592R;
        Intrinsics.checkNotNullParameter(fm, "fm");
        if (charSequence instanceof Spanned) {
            spanned = (Spanned) charSequence;
        } else {
            spanned = null;
        }
        if (spanned == null) {
            return;
        }
        int spanStart = spanned.getSpanStart(this);
        int spanEnd = spanned.getSpanEnd(this);
        boolean z = true;
        if (this.f91401f) {
            m23631c(fm);
        } else if (i >= spanStart) {
            this.f91401f = true;
            m23630d(fm);
        }
        if (i <= spanEnd && spanStart <= i2) {
            if (i >= spanStart && i2 <= spanEnd) {
                m23633a(fm);
            } else if (this.f91399c > this.f91400d) {
                m23633a(fm);
            }
        }
        if (i > spanStart || spanStart > i2) {
            z = false;
        }
        if (z) {
            m23632b(fm);
        }
        m16592R = C37690r.m16592R(charSequence.subSequence(i, i2).toString(), "\n", false, 2, null);
        if (m16592R) {
            this.f91401f = false;
        }
    }
}
