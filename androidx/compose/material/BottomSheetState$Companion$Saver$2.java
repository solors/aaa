package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BottomSheetScaffold.kt */
@Metadata
/* loaded from: classes.dex */
final class BottomSheetState$Companion$Saver$2 extends Lambda implements Function1<BottomSheetValue, BottomSheetState> {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ Function1<BottomSheetValue, Boolean> $confirmStateChange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetState$Companion$Saver$2(AnimationSpec<Float> animationSpec, Function1<? super BottomSheetValue, Boolean> function1) {
        super(1);
        this.$animationSpec = animationSpec;
        this.$confirmStateChange = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final BottomSheetState invoke(@NotNull BottomSheetValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new BottomSheetState(it, this.$animationSpec, this.$confirmStateChange);
    }
}
