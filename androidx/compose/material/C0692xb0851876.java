package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45268n;

/* compiled from: BottomSheetScaffold.kt */
@Metadata
/* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$sheetPlaceable$1 */
/* loaded from: classes.dex */
final class C0692xb0851876 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ InterfaceC45268n<Integer, Composer, Integer, Unit> $bottomSheet;
    final /* synthetic */ int $layoutHeight;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0692xb0851876(InterfaceC45268n<? super Integer, ? super Composer, ? super Integer, Unit> interfaceC45268n, int i, int i2) {
        super(2);
        this.$bottomSheet = interfaceC45268n;
        this.$layoutHeight = i;
        this.$$dirty = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Unit mo105910invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.f99208a;
    }

    @Composable
    public final void invoke(@Nullable Composer composer, int i) {
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            this.$bottomSheet.invoke(Integer.valueOf(this.$layoutHeight), composer, Integer.valueOf((this.$$dirty >> 3) & 112));
        }
    }
}
