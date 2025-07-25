package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: Drawer.kt */
@Metadata
/* loaded from: classes.dex */
final class DrawerKt$rememberBottomDrawerState$1 extends Lambda implements Function1<BottomDrawerValue, Boolean> {
    public static final DrawerKt$rememberBottomDrawerState$1 INSTANCE = new DrawerKt$rememberBottomDrawerState$1();

    DrawerKt$rememberBottomDrawerState$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull BottomDrawerValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.TRUE;
    }
}
