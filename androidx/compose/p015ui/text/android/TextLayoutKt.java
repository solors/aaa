package androidx.compose.p015ui.text.android;

import android.graphics.Rect;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import androidx.compose.p015ui.text.android.style.LineHeightStyleSpan;
import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextLayout.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.android.TextLayoutKt */
/* loaded from: classes.dex */
public final class TextLayoutKt {
    @NotNull
    private static final Tuples<Integer, Integer> EmptyPair = new Tuples<>(0, 0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Tuples<Integer, Integer> getLineHeightPaddings(TextLayout textLayout) {
        LineHeightStyleSpan[] lineHeightSpans;
        int i = 0;
        int i2 = 0;
        for (LineHeightStyleSpan lineHeightStyleSpan : getLineHeightSpans(textLayout)) {
            if (lineHeightStyleSpan.getFirstAscentDiff() < 0) {
                i = Math.max(i, Math.abs(lineHeightStyleSpan.getFirstAscentDiff()));
            }
            if (lineHeightStyleSpan.getLastDescentDiff() < 0) {
                i2 = Math.max(i, Math.abs(lineHeightStyleSpan.getLastDescentDiff()));
            }
        }
        if (i == 0 && i2 == 0) {
            return EmptyPair;
        }
        return new Tuples<>(Integer.valueOf(i), Integer.valueOf(i2));
    }

    private static final LineHeightStyleSpan[] getLineHeightSpans(TextLayout textLayout) {
        boolean z;
        if (!(textLayout.getText() instanceof Spanned)) {
            return new LineHeightStyleSpan[0];
        }
        LineHeightStyleSpan[] lineHeightStyleSpans = (LineHeightStyleSpan[]) ((Spanned) textLayout.getText()).getSpans(0, textLayout.getText().length(), LineHeightStyleSpan.class);
        Intrinsics.checkNotNullExpressionValue(lineHeightStyleSpans, "lineHeightStyleSpans");
        if (lineHeightStyleSpans.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new LineHeightStyleSpan[0];
        }
        return lineHeightStyleSpans;
    }

    @NotNull
    public static final TextDirectionHeuristic getTextDirectionHeuristic(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                TextDirectionHeuristic FIRSTSTRONG_LTR = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                                Intrinsics.checkNotNullExpressionValue(FIRSTSTRONG_LTR, "FIRSTSTRONG_LTR");
                                return FIRSTSTRONG_LTR;
                            }
                            TextDirectionHeuristic LOCALE = TextDirectionHeuristics.LOCALE;
                            Intrinsics.checkNotNullExpressionValue(LOCALE, "LOCALE");
                            return LOCALE;
                        }
                        TextDirectionHeuristic ANYRTL_LTR = TextDirectionHeuristics.ANYRTL_LTR;
                        Intrinsics.checkNotNullExpressionValue(ANYRTL_LTR, "ANYRTL_LTR");
                        return ANYRTL_LTR;
                    }
                    TextDirectionHeuristic FIRSTSTRONG_RTL = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    Intrinsics.checkNotNullExpressionValue(FIRSTSTRONG_RTL, "FIRSTSTRONG_RTL");
                    return FIRSTSTRONG_RTL;
                }
                TextDirectionHeuristic FIRSTSTRONG_LTR2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                Intrinsics.checkNotNullExpressionValue(FIRSTSTRONG_LTR2, "FIRSTSTRONG_LTR");
                return FIRSTSTRONG_LTR2;
            }
            TextDirectionHeuristic RTL = TextDirectionHeuristics.RTL;
            Intrinsics.checkNotNullExpressionValue(RTL, "RTL");
            return RTL;
        }
        TextDirectionHeuristic LTR = TextDirectionHeuristics.LTR;
        Intrinsics.checkNotNullExpressionValue(LTR, "LTR");
        return LTR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Tuples<Integer, Integer> getVerticalPaddings(TextLayout textLayout) {
        int topPadding;
        int bottomPadding;
        if (!textLayout.getIncludePadding() && !textLayout.isFallbackLinespacingApplied$ui_text_release()) {
            TextPaint paint = textLayout.getLayout().getPaint();
            CharSequence text = textLayout.getLayout().getText();
            Intrinsics.checkNotNullExpressionValue(paint, "paint");
            Intrinsics.checkNotNullExpressionValue(text, "text");
            Rect charSequenceBounds = PaintExtensionsKt.getCharSequenceBounds(paint, text, textLayout.getLayout().getLineStart(0), textLayout.getLayout().getLineEnd(0));
            int lineAscent = textLayout.getLayout().getLineAscent(0);
            int i = charSequenceBounds.top;
            if (i < lineAscent) {
                topPadding = lineAscent - i;
            } else {
                topPadding = textLayout.getLayout().getTopPadding();
            }
            if (textLayout.getLineCount() != 1) {
                int lineCount = textLayout.getLayout().getLineCount() - 1;
                charSequenceBounds = PaintExtensionsKt.getCharSequenceBounds(paint, text, textLayout.getLayout().getLineStart(lineCount), textLayout.getLayout().getLineEnd(lineCount));
            }
            int lineDescent = textLayout.getLayout().getLineDescent(textLayout.getLayout().getLineCount() - 1);
            int i2 = charSequenceBounds.bottom;
            if (i2 > lineDescent) {
                bottomPadding = i2 - lineDescent;
            } else {
                bottomPadding = textLayout.getLayout().getBottomPadding();
            }
            if (topPadding == 0 && bottomPadding == 0) {
                return EmptyPair;
            }
            return new Tuples<>(Integer.valueOf(topPadding), Integer.valueOf(bottomPadding));
        }
        return new Tuples<>(0, 0);
    }
}
