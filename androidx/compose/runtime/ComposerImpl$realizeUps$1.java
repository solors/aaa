package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p1076zd.InterfaceC45268n;

/* compiled from: Composer.kt */
@Metadata
/* loaded from: classes.dex */
final class ComposerImpl$realizeUps$1 extends Lambda implements InterfaceC45268n<Applier<?>, SlotWriter, RememberManager, Unit> {
    final /* synthetic */ int $count;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerImpl$realizeUps$1(int i) {
        super(3);
        this.$count = i;
    }

    @Override // p1076zd.InterfaceC45268n
    public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
        invoke2(applier, slotWriter, rememberManager);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
        Intrinsics.checkNotNullParameter(applier, "applier");
        Intrinsics.checkNotNullParameter(slotWriter, "<anonymous parameter 1>");
        Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
        int i = this.$count;
        for (int i2 = 0; i2 < i; i2++) {
            applier.mo105431up();
        }
    }
}
