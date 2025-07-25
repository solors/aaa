package androidx.compose.p015ui.text.android;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: LayoutCompat.kt */
@InternalPlatformTextApi
@Metadata
/* renamed from: androidx.compose.ui.text.android.LayoutCompat */
/* loaded from: classes.dex */
public final class LayoutCompat {
    public static final int ALIGN_CENTER = 2;
    public static final int ALIGN_LEFT = 3;
    public static final int ALIGN_NORMAL = 0;
    public static final int ALIGN_OPPOSITE = 1;
    public static final int ALIGN_RIGHT = 4;
    public static final int BREAK_STRATEGY_BALANCED = 2;
    public static final int BREAK_STRATEGY_HIGH_QUALITY = 1;
    public static final int BREAK_STRATEGY_SIMPLE = 0;
    public static final int DEFAULT_ALIGNMENT = 0;
    public static final int DEFAULT_BREAK_STRATEGY = 0;
    public static final boolean DEFAULT_FALLBACK_LINE_SPACING = true;
    public static final int DEFAULT_HYPHENATION_FREQUENCY = 0;
    public static final boolean DEFAULT_INCLUDE_PADDING = false;
    public static final int DEFAULT_JUSTIFICATION_MODE = 0;
    public static final float DEFAULT_LINESPACING_EXTRA = 0.0f;
    public static final float DEFAULT_LINESPACING_MULTIPLIER = 1.0f;
    public static final int DEFAULT_MAX_LINES = Integer.MAX_VALUE;
    public static final int DEFAULT_TEXT_DIRECTION = 2;
    @NotNull
    private static final TextDirectionHeuristic DEFAULT_TEXT_DIRECTION_HEURISTIC;
    public static final int HYPHENATION_FREQUENCY_FULL = 2;
    public static final int HYPHENATION_FREQUENCY_NONE = 0;
    public static final int HYPHENATION_FREQUENCY_NORMAL = 1;
    public static final int JUSTIFICATION_MODE_INTER_WORD = 1;
    public static final int JUSTIFICATION_MODE_NONE = 0;
    public static final int TEXT_DIRECTION_ANY_RTL_LTR = 4;
    public static final int TEXT_DIRECTION_FIRST_STRONG_LTR = 2;
    public static final int TEXT_DIRECTION_FIRST_STRONG_RTL = 3;
    public static final int TEXT_DIRECTION_LOCALE = 5;
    public static final int TEXT_DIRECTION_LTR = 0;
    public static final int TEXT_DIRECTION_RTL = 1;
    @NotNull
    public static final LayoutCompat INSTANCE = new LayoutCompat();
    @NotNull
    private static final Layout.Alignment DEFAULT_LAYOUT_ALIGNMENT = Layout.Alignment.ALIGN_NORMAL;

    /* compiled from: LayoutCompat.kt */
    @Retention(RetentionPolicy.SOURCE)
    @Metadata
    /* renamed from: androidx.compose.ui.text.android.LayoutCompat$BreakStrategy */
    /* loaded from: classes.dex */
    public @interface BreakStrategy {
    }

    /* compiled from: LayoutCompat.kt */
    @Retention(RetentionPolicy.SOURCE)
    @Metadata
    /* renamed from: androidx.compose.ui.text.android.LayoutCompat$HyphenationFrequency */
    /* loaded from: classes.dex */
    public @interface HyphenationFrequency {
    }

    /* compiled from: LayoutCompat.kt */
    @Retention(RetentionPolicy.SOURCE)
    @Metadata
    /* renamed from: androidx.compose.ui.text.android.LayoutCompat$JustificationMode */
    /* loaded from: classes.dex */
    public @interface JustificationMode {
    }

    /* compiled from: LayoutCompat.kt */
    @Retention(RetentionPolicy.SOURCE)
    @Metadata
    /* renamed from: androidx.compose.ui.text.android.LayoutCompat$TextDirection */
    /* loaded from: classes.dex */
    public @interface TextDirection {
    }

    /* compiled from: LayoutCompat.kt */
    @Retention(RetentionPolicy.SOURCE)
    @Metadata
    /* renamed from: androidx.compose.ui.text.android.LayoutCompat$TextLayoutAlignment */
    /* loaded from: classes.dex */
    public @interface TextLayoutAlignment {
    }

    static {
        TextDirectionHeuristic FIRSTSTRONG_LTR = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        Intrinsics.checkNotNullExpressionValue(FIRSTSTRONG_LTR, "FIRSTSTRONG_LTR");
        DEFAULT_TEXT_DIRECTION_HEURISTIC = FIRSTSTRONG_LTR;
    }

    private LayoutCompat() {
    }

    @NotNull
    public final Layout.Alignment getDEFAULT_LAYOUT_ALIGNMENT$ui_text_release() {
        return DEFAULT_LAYOUT_ALIGNMENT;
    }

    @NotNull
    public final TextDirectionHeuristic getDEFAULT_TEXT_DIRECTION_HEURISTIC$ui_text_release() {
        return DEFAULT_TEXT_DIRECTION_HEURISTIC;
    }
}
