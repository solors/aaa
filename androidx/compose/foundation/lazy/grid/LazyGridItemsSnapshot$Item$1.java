package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LazyGridItemProviderImpl.kt */
@Metadata
/* loaded from: classes.dex */
public final class LazyGridItemsSnapshot$Item$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $index;
    final /* synthetic */ LazyGridItemsSnapshot $tmp0_rcvr;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridItemsSnapshot$Item$1(LazyGridItemsSnapshot lazyGridItemsSnapshot, int i, int i2) {
        super(2);
        this.$tmp0_rcvr = lazyGridItemsSnapshot;
        this.$index = i;
        this.$$changed = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Unit mo105910invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.f99208a;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        this.$tmp0_rcvr.Item(this.$index, composer, this.$$changed | 1);
    }
}
