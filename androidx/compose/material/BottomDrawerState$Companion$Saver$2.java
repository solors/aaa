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
public final class BottomDrawerState$Companion$Saver$2 extends Lambda implements Function1<BottomDrawerValue, Drawer> {
    final /* synthetic */ Function1<BottomDrawerValue, Boolean> $confirmStateChange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomDrawerState$Companion$Saver$2(Function1<? super BottomDrawerValue, Boolean> function1) {
        super(1);
        this.$confirmStateChange = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Drawer invoke(@NotNull BottomDrawerValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new Drawer(it, this.$confirmStateChange);
    }
}
