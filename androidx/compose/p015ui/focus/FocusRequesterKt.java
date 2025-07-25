package androidx.compose.p015ui.focus;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: FocusRequester.kt */
@Metadata
/* renamed from: androidx.compose.ui.focus.FocusRequesterKt */
/* loaded from: classes.dex */
public final class FocusRequesterKt {
    @NotNull
    private static final String focusRequesterNotInitialized = "\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n";
}
