package androidx.compose.runtime;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C37607l0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p1076zd.InterfaceC45268n;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Composer.kt */
@Metadata
/* loaded from: classes.dex */
public final class ComposerImpl$insertMovableContentReferences$1$1$3 extends Lambda implements InterfaceC45268n<Applier<?>, SlotWriter, RememberManager, Unit> {
    final /* synthetic */ C37607l0 $effectiveNodeIndex;
    final /* synthetic */ List<Object> $nodesToInsert;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerImpl$insertMovableContentReferences$1$1$3(C37607l0 c37607l0, List<? extends Object> list) {
        super(3);
        this.$effectiveNodeIndex = c37607l0;
        this.$nodesToInsert = list;
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
        int i = this.$effectiveNodeIndex.f99325b;
        List<Object> list = this.$nodesToInsert;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            int i3 = i + i2;
            applier.insertBottomUp(i3, obj);
            applier.insertTopDown(i3, obj);
        }
    }
}
