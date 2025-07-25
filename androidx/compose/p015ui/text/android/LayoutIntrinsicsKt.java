package androidx.compose.p015ui.text.android;

import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import androidx.compose.p015ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.p015ui.text.android.style.LetterSpacingSpanPx;
import java.text.BreakIterator;
import java.util.Comparator;
import java.util.PriorityQueue;
import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: LayoutIntrinsics.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.android.LayoutIntrinsicsKt */
/* loaded from: classes.dex */
public final class LayoutIntrinsicsKt {
    /* renamed from: a */
    public static /* synthetic */ int m105291a(Tuples tuples, Tuples tuples2) {
        return m109407minIntrinsicWidth$lambda0(tuples, tuples2);
    }

    public static final float minIntrinsicWidth(@NotNull CharSequence text, @NotNull TextPaint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BreakIterator lineInstance = BreakIterator.getLineInstance(paint.getTextLocale());
        int i = 0;
        lineInstance.setText(new CharSequenceCharacterIterator(text, 0, text.length()));
        PriorityQueue<Tuples> priorityQueue = new PriorityQueue(10, new Comparator() { // from class: androidx.compose.ui.text.android.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return LayoutIntrinsicsKt.m105291a((Tuples) obj, (Tuples) obj2);
            }
        });
        int next = lineInstance.next();
        while (true) {
            int i2 = i;
            i = next;
            if (i == -1) {
                break;
            }
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new Tuples(Integer.valueOf(i2), Integer.valueOf(i)));
            } else {
                Tuples tuples = (Tuples) priorityQueue.peek();
                if (tuples != null && ((Number) tuples.m17629d()).intValue() - ((Number) tuples.m17630c()).intValue() < i - i2) {
                    priorityQueue.poll();
                    priorityQueue.add(new Tuples(Integer.valueOf(i2), Integer.valueOf(i)));
                }
            }
            next = lineInstance.next();
        }
        float f = 0.0f;
        for (Tuples tuples2 : priorityQueue) {
            f = Math.max(f, Layout.getDesiredWidth(text, ((Number) tuples2.m17632a()).intValue(), ((Number) tuples2.m17631b()).intValue(), paint));
        }
        return f;
    }

    /* renamed from: minIntrinsicWidth$lambda-0 */
    public static final int m109407minIntrinsicWidth$lambda0(Tuples tuples, Tuples tuples2) {
        return (((Number) tuples.m17629d()).intValue() - ((Number) tuples.m17630c()).intValue()) - (((Number) tuples2.m17629d()).intValue() - ((Number) tuples2.m17630c()).intValue());
    }

    public static final boolean shouldIncreaseMaxIntrinsic(float f, CharSequence charSequence, TextPaint textPaint) {
        boolean z;
        boolean z2;
        if (f == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z && (charSequence instanceof Spanned)) {
            if (textPaint.getLetterSpacing() == 0.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                return true;
            }
            Spanned spanned = (Spanned) charSequence;
            if (SpannedExtensions.hasSpan(spanned, LetterSpacingSpanPx.class) || SpannedExtensions.hasSpan(spanned, LetterSpacingSpanEm.class)) {
                return true;
            }
        }
        return false;
    }
}
