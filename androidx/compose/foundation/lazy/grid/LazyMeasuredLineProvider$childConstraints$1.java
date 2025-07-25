package androidx.compose.foundation.lazy.grid;

import androidx.compose.p015ui.unit.Constraints;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LazyMeasuredLineProvider.kt */
@Metadata
/* loaded from: classes.dex */
public final class LazyMeasuredLineProvider$childConstraints$1 extends Lambda implements Function2<Integer, Integer, Constraints> {
    final /* synthetic */ int $crossAxisSpacing;
    final /* synthetic */ List<Integer> $slotSizesSums;
    final /* synthetic */ LazyMeasuredLineProvider this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyMeasuredLineProvider$childConstraints$1(List<Integer> list, int i, LazyMeasuredLineProvider lazyMeasuredLineProvider) {
        super(2);
        this.$slotSizesSums = list;
        this.$crossAxisSpacing = i;
        this.this$0 = lazyMeasuredLineProvider;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Constraints mo105910invoke(Integer num, Integer num2) {
        return Constraints.m109678boximpl(m106513invokeJhjzzOo(num.intValue(), num2.intValue()));
    }

    /* renamed from: invoke-JhjzzOo  reason: not valid java name */
    public final long m106513invokeJhjzzOo(int i, int i2) {
        int intValue;
        boolean z;
        int intValue2 = this.$slotSizesSums.get((i + i2) - 1).intValue();
        if (i == 0) {
            intValue = 0;
        } else {
            intValue = this.$slotSizesSums.get(i - 1).intValue();
        }
        int i3 = (intValue2 - intValue) + (this.$crossAxisSpacing * (i2 - 1));
        z = this.this$0.isVertical;
        if (z) {
            return Constraints.Companion.m109700fixedWidthOenEA2s(i3);
        }
        return Constraints.Companion.m109699fixedHeightOenEA2s(i3);
    }
}
