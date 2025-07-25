package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Drawer.kt */
@Metadata
/* loaded from: classes.dex */
public final class DrawerKt$rememberBottomDrawerState$2 extends Lambda implements Functions<Drawer> {
    final /* synthetic */ Function1<BottomDrawerValue, Boolean> $confirmStateChange;
    final /* synthetic */ BottomDrawerValue $initialValue;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DrawerKt$rememberBottomDrawerState$2(BottomDrawerValue bottomDrawerValue, Function1<? super BottomDrawerValue, Boolean> function1) {
        super(0);
        this.$initialValue = bottomDrawerValue;
        this.$confirmStateChange = function1;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final Drawer invoke() {
        return new Drawer(this.$initialValue, this.$confirmStateChange);
    }
}
