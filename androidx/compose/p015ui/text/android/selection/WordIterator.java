package androidx.compose.p015ui.text.android.selection;

import androidx.compose.p015ui.text.android.CharSequenceCharacterIterator;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WordIterator.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.android.selection.WordIterator */
/* loaded from: classes.dex */
public final class WordIterator {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int WINDOW_WIDTH = 50;
    @NotNull
    private final CharSequence charSequence;
    private final int end;
    @NotNull
    private final BreakIterator iterator;
    private final int start;

    /* compiled from: WordIterator.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.text.android.selection.WordIterator$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isPunctuation$ui_text_release(int i) {
            int type = Character.getType(i);
            if (type != 23 && type != 20 && type != 22 && type != 30 && type != 29 && type != 24 && type != 21) {
                return false;
            }
            return true;
        }
    }

    public WordIterator(@NotNull CharSequence charSequence, int i, int i2, @Nullable Locale locale) {
        boolean z;
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        this.charSequence = charSequence;
        boolean z2 = true;
        if (i >= 0 && i <= charSequence.length()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if ((i2 < 0 || i2 > charSequence.length()) ? false : z2) {
                BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
                Intrinsics.checkNotNullExpressionValue(wordInstance, "getWordInstance(locale)");
                this.iterator = wordInstance;
                this.start = Math.max(0, i - 50);
                this.end = Math.min(charSequence.length(), i2 + 50);
                wordInstance.setText(new CharSequenceCharacterIterator(charSequence, i, i2));
                return;
            }
            throw new IllegalArgumentException("input end index is outside the CharSequence".toString());
        }
        throw new IllegalArgumentException("input start index is outside the CharSequence".toString());
    }

    private final void checkOffsetIsValid(int i) {
        int i2 = this.start;
        boolean z = false;
        if (i <= this.end && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(("Invalid offset: " + i + ". Valid range is [" + this.start + " , " + this.end + ']').toString());
    }

    private final int getBeginning(int i, boolean z) {
        checkOffsetIsValid(i);
        if (isOnLetterOrDigit(i)) {
            if (!this.iterator.isBoundary(i) || (isAfterLetterOrDigit(i) && z)) {
                return this.iterator.preceding(i);
            }
            return i;
        } else if (isAfterLetterOrDigit(i)) {
            return this.iterator.preceding(i);
        } else {
            return -1;
        }
    }

    private final int getEnd(int i, boolean z) {
        checkOffsetIsValid(i);
        if (isAfterLetterOrDigit(i)) {
            if (!this.iterator.isBoundary(i) || (isOnLetterOrDigit(i) && z)) {
                return this.iterator.following(i);
            }
            return i;
        } else if (isOnLetterOrDigit(i)) {
            return this.iterator.following(i);
        } else {
            return -1;
        }
    }

    private final boolean isAfterLetterOrDigit(int i) {
        boolean z;
        int i2 = this.start + 1;
        if (i <= this.end && i2 <= i) {
            z = true;
        } else {
            z = false;
        }
        if (z && Character.isLetterOrDigit(Character.codePointBefore(this.charSequence, i))) {
            return true;
        }
        return false;
    }

    private final boolean isOnLetterOrDigit(int i) {
        boolean z;
        int i2 = this.start;
        if (i < this.end && i2 <= i) {
            z = true;
        } else {
            z = false;
        }
        if (z && Character.isLetterOrDigit(Character.codePointAt(this.charSequence, i))) {
            return true;
        }
        return false;
    }

    private final boolean isPunctuationEndBoundary(int i) {
        if (!isOnPunctuation(i) && isAfterPunctuation(i)) {
            return true;
        }
        return false;
    }

    private final boolean isPunctuationStartBoundary(int i) {
        if (isOnPunctuation(i) && !isAfterPunctuation(i)) {
            return true;
        }
        return false;
    }

    public final int getNextWordEndOnTwoWordBoundary(int i) {
        return getEnd(i, true);
    }

    public final int getPrevWordBeginningOnTwoWordsBoundary(int i) {
        return getBeginning(i, true);
    }

    public final int getPunctuationBeginning(int i) {
        checkOffsetIsValid(i);
        while (i != -1 && !isPunctuationStartBoundary(i)) {
            i = prevBoundary(i);
        }
        return i;
    }

    public final int getPunctuationEnd(int i) {
        checkOffsetIsValid(i);
        while (i != -1 && !isPunctuationEndBoundary(i)) {
            i = nextBoundary(i);
        }
        return i;
    }

    public final boolean isAfterPunctuation(int i) {
        boolean z = true;
        int i2 = this.start + 1;
        if (i > this.end || i2 > i) {
            z = false;
        }
        if (!z) {
            return false;
        }
        return Companion.isPunctuation$ui_text_release(Character.codePointBefore(this.charSequence, i));
    }

    public final boolean isOnPunctuation(int i) {
        boolean z;
        int i2 = this.start;
        if (i < this.end && i2 <= i) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return Companion.isPunctuation$ui_text_release(Character.codePointAt(this.charSequence, i));
    }

    public final int nextBoundary(int i) {
        checkOffsetIsValid(i);
        return this.iterator.following(i);
    }

    public final int prevBoundary(int i) {
        checkOffsetIsValid(i);
        return this.iterator.preceding(i);
    }
}
