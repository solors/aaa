package androidx.compose.p015ui.text;

import java.text.BreakIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: JvmCharHelpers.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.JvmCharHelpers_androidKt */
/* loaded from: classes.dex */
public final class JvmCharHelpers_androidKt {
    public static final int findFollowingBreak(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i);
    }

    public static final int findPrecedingBreak(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }
}
