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
final class IntrinsicMeasureBlocks$HorizontalMaxWidth$1 extends Lambda implements InterfaceC45268n<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> {
    public static final IntrinsicMeasureBlocks$HorizontalMaxWidth$1 INSTANCE = new IntrinsicMeasureBlocks$HorizontalMaxWidth$1();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RowColumnImpl.kt */
    @Metadata
    /* renamed from: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxWidth$1$1 */
    /* loaded from: classes.dex */
    public static final class C04851 extends Lambda implements Function2<IntrinsicMeasurable, Integer, Integer> {
        public static final C04851 INSTANCE = new C04851();

        C04851() {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RowColumnImpl.kt */
    @Metadata
    /* renamed from: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxWidth$1$2 */
    /* loaded from: classes.dex */
    public static final class C04862 extends Lambda implements Function2<IntrinsicMeasurable, Integer, Integer> {
        public static final C04862 INSTANCE = new C04862();

        C04862() {
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

    IntrinsicMeasureBlocks$HorizontalMaxWidth$1() {
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
        C04851 c04851 = C04851.INSTANCE;
        C04862 c04862 = C04862.INSTANCE;
        LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
        intrinsicSize = RowColumnImplKt.intrinsicSize(measurables, c04851, c04862, i, i2, layoutOrientation, layoutOrientation);
        return Integer.valueOf(intrinsicSize);
    }
}
