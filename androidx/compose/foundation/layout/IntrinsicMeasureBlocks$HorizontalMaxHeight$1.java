package androidx.compose.foundation.layout;

import androidx.compose.p015ui.layout.IntrinsicMeasurable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p1076zd.InterfaceC45268n;

/* compiled from: RowColumnImpl.kt */
@Metadata
/* loaded from: classes.dex */
final class IntrinsicMeasureBlocks$HorizontalMaxHeight$1 extends Lambda implements InterfaceC45268n<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> {
    public static final IntrinsicMeasureBlocks$HorizontalMaxHeight$1 INSTANCE = new IntrinsicMeasureBlocks$HorizontalMaxHeight$1();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RowColumnImpl.kt */
    @Metadata
    /* renamed from: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxHeight$1$1 */
    /* loaded from: classes.dex */
    public static final class C04831 extends Lambda implements Function2<IntrinsicMeasurable, Integer, Integer> {
        public static final C04831 INSTANCE = new C04831();

        C04831() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Integer mo105910invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
            return invoke(intrinsicMeasurable, num.intValue());
        }

        @NotNull
        public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicSize, int i) {
            Intrinsics.checkNotNullParameter(intrinsicSize, "$this$intrinsicSize");
            return Integer.valueOf(intrinsicSize.maxIntrinsicHeight(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RowColumnImpl.kt */
    @Metadata
    /* renamed from: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxHeight$1$2 */
    /* loaded from: classes.dex */
    public static final class C04842 extends Lambda implements Function2<IntrinsicMeasurable, Integer, Integer> {
        public static final C04842 INSTANCE = new C04842();

        C04842() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Integer mo105910invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
            return invoke(intrinsicMeasurable, num.intValue());
        }

        @NotNull
        public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicSize, int i) {
            Intrinsics.checkNotNullParameter(intrinsicSize, "$this$intrinsicSize");
            return Integer.valueOf(intrinsicSize.maxIntrinsicWidth(i));
        }
    }

    IntrinsicMeasureBlocks$HorizontalMaxHeight$1() {
        super(3);
    }

    @Override // p1076zd.InterfaceC45268n
    public /* bridge */ /* synthetic */ Integer invoke(List<? extends IntrinsicMeasurable> list, Integer num, Integer num2) {
        return invoke(list, num.intValue(), num2.intValue());
    }

    @NotNull
    public final Integer invoke(@NotNull List<? extends IntrinsicMeasurable> measurables, int i, int i2) {
        int intrinsicSize;
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        intrinsicSize = RowColumnImplKt.intrinsicSize(measurables, C04831.INSTANCE, C04842.INSTANCE, i, i2, LayoutOrientation.Horizontal, LayoutOrientation.Vertical);
        return Integer.valueOf(intrinsicSize);
    }
}
