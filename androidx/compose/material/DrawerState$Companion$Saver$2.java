package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Drawer.kt */
@Metadata
/* loaded from: classes.dex */
public final class DrawerState$Companion$Saver$2 extends Lambda implements Function1<DrawerValue, DrawerState> {
    final /* synthetic */ Function1<DrawerValue, Boolean> $confirmStateChange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DrawerState$Companion$Saver$2(Function1<? super DrawerValue, Boolean> function1) {
        super(1);
        this.$confirmStateChange = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final DrawerState invoke(@NotNull DrawerValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new DrawerState(it, this.$confirmStateChange);
    }
}
