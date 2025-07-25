package androidx.compose.p015ui.focus;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.ExceptionsH;

/* compiled from: FocusProperties.kt */
@Metadata
/* renamed from: androidx.compose.ui.focus.DefaultFocusProperties */
/* loaded from: classes.dex */
public final class DefaultFocusProperties implements FocusProperties {
    @NotNull
    public static final DefaultFocusProperties INSTANCE = new DefaultFocusProperties();

    private DefaultFocusProperties() {
    }

    private final Void noSet() {
        throw new IllegalStateException("Attempting to change DefaultFocusProperties".toString());
    }

    @Override // androidx.compose.p015ui.focus.FocusProperties
    public boolean getCanFocus() {
        return true;
    }

    @Override // androidx.compose.p015ui.focus.FocusProperties
    @NotNull
    public FocusRequester getDown() {
        return FocusRequester.Companion.getDefault();
    }

    @Override // androidx.compose.p015ui.focus.FocusProperties
    @NotNull
    public FocusRequester getEnd() {
        return FocusRequester.Companion.getDefault();
    }

    @Override // androidx.compose.p015ui.focus.FocusProperties
    @NotNull
    public FocusRequester getLeft() {
        return FocusRequester.Companion.getDefault();
    }

    @Override // androidx.compose.p015ui.focus.FocusProperties
    @NotNull
    public FocusRequester getNext() {
        return FocusRequester.Companion.getDefault();
    }

    @Override // androidx.compose.p015ui.focus.FocusProperties
    @NotNull
    public FocusRequester getPrevious() {
        return FocusRequester.Companion.getDefault();
    }

    @Override // androidx.compose.p015ui.focus.FocusProperties
    @NotNull
    public FocusRequester getRight() {
        return FocusRequester.Companion.getDefault();
    }

    @Override // androidx.compose.p015ui.focus.FocusProperties
    @NotNull
    public FocusRequester getStart() {
        return FocusRequester.Companion.getDefault();
    }

    @Override // androidx.compose.p015ui.focus.FocusProperties
    @NotNull
    public FocusRequester getUp() {
        return FocusRequester.Companion.getDefault();
    }

    @Override // androidx.compose.p015ui.focus.FocusProperties
    public void setCanFocus(boolean z) {
        noSet();
        throw new ExceptionsH();
    }

    @Override // androidx.compose.p015ui.focus.FocusProperties
    public void setDown(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
        noSet();
        throw new ExceptionsH();
    }

    @Override // androidx.compose.p015ui.focus.FocusProperties
    public void setEnd(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
        noSet();
        throw new ExceptionsH();
    }

    @Override // androidx.compose.p015ui.focus.FocusProperties
    public void setLeft(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
        noSet();
        throw new ExceptionsH();
    }

    @Override // androidx.compose.p015ui.focus.FocusProperties
    public void setNext(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
        noSet();
        throw new ExceptionsH();
    }

    @Override // androidx.compose.p015ui.focus.FocusProperties
    public void setPrevious(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
        noSet();
        throw new ExceptionsH();
    }

    @Override // androidx.compose.p015ui.focus.FocusProperties
    public void setRight(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
        noSet();
        throw new ExceptionsH();
    }

    @Override // androidx.compose.p015ui.focus.FocusProperties
    public void setStart(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
        noSet();
        throw new ExceptionsH();
    }

    @Override // androidx.compose.p015ui.focus.FocusProperties
    public void setUp(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
        noSet();
        throw new ExceptionsH();
    }
}
