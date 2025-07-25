package androidx.compose.p015ui.input.pointer;

import android.view.PointerIcon;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PointerIcon.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.input.pointer.PointerIcon_androidKt */
/* loaded from: classes.dex */
public final class PointerIcon_androidKt {
    @NotNull
    private static final PointerIcon pointerIconDefault = new AndroidPointerIconType(1000);
    @NotNull
    private static final PointerIcon pointerIconCrosshair = new AndroidPointerIconType(1007);
    @NotNull
    private static final PointerIcon pointerIconText = new AndroidPointerIconType(1008);
    @NotNull
    private static final PointerIcon pointerIconHand = new AndroidPointerIconType(1002);

    @NotNull
    public static final PointerIcon PointerIcon(@NotNull PointerIcon pointerIcon) {
        Intrinsics.checkNotNullParameter(pointerIcon, "pointerIcon");
        return new AndroidPointerIcon(pointerIcon);
    }

    @NotNull
    public static final PointerIcon getPointerIconCrosshair() {
        return pointerIconCrosshair;
    }

    @NotNull
    public static final PointerIcon getPointerIconDefault() {
        return pointerIconDefault;
    }

    @NotNull
    public static final PointerIcon getPointerIconHand() {
        return pointerIconHand;
    }

    @NotNull
    public static final PointerIcon getPointerIconText() {
        return pointerIconText;
    }

    @NotNull
    public static final PointerIcon PointerIcon(int i) {
        return new AndroidPointerIconType(i);
    }
}
