package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: BottomSheetScaffold.kt */
@Metadata
/* loaded from: classes.dex */
final class BottomSheetScaffoldKt$rememberBottomSheetState$1 extends Lambda implements Function1<BottomSheetValue, Boolean> {
    public static final BottomSheetScaffoldKt$rememberBottomSheetState$1 INSTANCE = new BottomSheetScaffoldKt$rememberBottomSheetState$1();

    BottomSheetScaffoldKt$rememberBottomSheetState$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull BottomSheetValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.TRUE;
    }
}
