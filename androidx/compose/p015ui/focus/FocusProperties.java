package androidx.compose.p015ui.focus;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: FocusProperties.kt */
@Metadata
/* renamed from: androidx.compose.ui.focus.FocusProperties */
/* loaded from: classes.dex */
public interface FocusProperties {
    boolean getCanFocus();

    @NotNull
    default FocusRequester getDown() {
        return FocusRequester.Companion.getDefault();
    }

    @NotNull
    default FocusRequester getEnd() {
        return FocusRequester.Companion.getDefault();
    }

    @NotNull
    default FocusRequester getLeft() {
        return FocusRequester.Companion.getDefault();
    }

    @NotNull
    default FocusRequester getNext() {
        return FocusRequester.Companion.getDefault();
    }

    @NotNull
    default FocusRequester getPrevious() {
        return FocusRequester.Companion.getDefault();
    }

    @NotNull
    default FocusRequester getRight() {
        return FocusRequester.Companion.getDefault();
    }

    @NotNull
    default FocusRequester getStart() {
        return FocusRequester.Companion.getDefault();
    }

    @NotNull
    default FocusRequester getUp() {
        return FocusRequester.Companion.getDefault();
    }

    void setCanFocus(boolean z);

    default void setDown(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
    }

    default void setEnd(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
    }

    default void setLeft(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
    }

    default void setNext(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
    }

    default void setPrevious(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
    }

    default void setRight(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
    }

    default void setStart(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
    }

    default void setUp(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
    }
}
