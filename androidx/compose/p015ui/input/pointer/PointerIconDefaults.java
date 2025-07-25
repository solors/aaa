package androidx.compose.p015ui.input.pointer;

import androidx.compose.p015ui.ExperimentalComposeUiApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: PointerIcon.kt */
@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
@Metadata
/* renamed from: androidx.compose.ui.input.pointer.PointerIconDefaults */
/* loaded from: classes.dex */
public final class PointerIconDefaults {
    public static final int $stable = 0;
    @NotNull
    public static final PointerIconDefaults INSTANCE = new PointerIconDefaults();
    @NotNull
    private static final PointerIcon Default = PointerIcon_androidKt.getPointerIconDefault();
    @NotNull
    private static final PointerIcon Crosshair = PointerIcon_androidKt.getPointerIconCrosshair();
    @NotNull
    private static final PointerIcon Text = PointerIcon_androidKt.getPointerIconText();
    @NotNull
    private static final PointerIcon Hand = PointerIcon_androidKt.getPointerIconHand();

    private PointerIconDefaults() {
    }

    @NotNull
    public final PointerIcon getCrosshair() {
        return Crosshair;
    }

    @NotNull
    public final PointerIcon getDefault() {
        return Default;
    }

    @NotNull
    public final PointerIcon getHand() {
        return Hand;
    }

    @NotNull
    public final PointerIcon getText() {
        return Text;
    }
}
