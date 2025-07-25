package androidx.compose.material;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Drawer.kt */
@Metadata
/* loaded from: classes.dex */
public final class DrawerState$Companion$Saver$1 extends Lambda implements Function2<SaverScope, DrawerState, DrawerValue> {
    public static final DrawerState$Companion$Saver$1 INSTANCE = new DrawerState$Companion$Saver$1();

    DrawerState$Companion$Saver$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final DrawerValue mo105910invoke(@NotNull SaverScope Saver, @NotNull DrawerState it) {
        Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getCurrentValue();
    }
}
