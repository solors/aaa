package androidx.compose.p015ui.node;

import android.view.KeyEvent;
import androidx.compose.p015ui.semantics.SemanticsOwner;
import androidx.compose.p015ui.text.input.TextInputService;
import androidx.compose.p015ui.unit.Density;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: RootForTest.kt */
@Metadata
/* renamed from: androidx.compose.ui.node.RootForTest */
/* loaded from: classes.dex */
public interface RootForTest {
    @NotNull
    Density getDensity();

    @NotNull
    SemanticsOwner getSemanticsOwner();

    @NotNull
    TextInputService getTextInputService();

    /* renamed from: sendKeyEvent-ZmokQxo  reason: not valid java name */
    boolean mo109196sendKeyEventZmokQxo(@NotNull KeyEvent keyEvent);
}
