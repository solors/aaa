package androidx.compose.p015ui.input.pointer;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: PointerIcon.kt */
@Metadata
/* renamed from: androidx.compose.ui.input.pointer.PointerIconService */
/* loaded from: classes.dex */
public interface PointerIconService {
    @NotNull
    PointerIcon getCurrent();

    void setCurrent(@NotNull PointerIcon pointerIcon);
}
