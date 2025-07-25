package androidx.compose.p015ui.text.android.selection;

import androidx.compose.p015ui.text.android.InternalPlatformTextApi;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: WordBoundary.kt */
@InternalPlatformTextApi
@Metadata
/* renamed from: androidx.compose.ui.text.android.selection.WordBoundary */
/* loaded from: classes.dex */
public final class WordBoundary {
    @NotNull
    private final WordIterator wordIterator;

    public WordBoundary(@NotNull Locale locale, @NotNull CharSequence text) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(text, "text");
        this.wordIterator = new WordIterator(text, 0, text.length(), locale);
    }

    public final int getWordEnd(int i) {
        int nextWordEndOnTwoWordBoundary;
        if (this.wordIterator.isAfterPunctuation(this.wordIterator.nextBoundary(i))) {
            nextWordEndOnTwoWordBoundary = this.wordIterator.getPunctuationEnd(i);
        } else {
            nextWordEndOnTwoWordBoundary = this.wordIterator.getNextWordEndOnTwoWordBoundary(i);
        }
        if (nextWordEndOnTwoWordBoundary != -1) {
            return nextWordEndOnTwoWordBoundary;
        }
        return i;
    }

    public final int getWordStart(int i) {
        int prevWordBeginningOnTwoWordsBoundary;
        if (this.wordIterator.isOnPunctuation(this.wordIterator.prevBoundary(i))) {
            prevWordBeginningOnTwoWordsBoundary = this.wordIterator.getPunctuationBeginning(i);
        } else {
            prevWordBeginningOnTwoWordsBoundary = this.wordIterator.getPrevWordBeginningOnTwoWordsBoundary(i);
        }
        if (prevWordBeginningOnTwoWordsBoundary != -1) {
            return prevWordBeginningOnTwoWordsBoundary;
        }
        return i;
    }
}
