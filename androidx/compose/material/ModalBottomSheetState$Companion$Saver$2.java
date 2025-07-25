package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ModalBottomSheet.kt */
@Metadata
/* loaded from: classes.dex */
final class ModalBottomSheetState$Companion$Saver$2 extends Lambda implements Function1<ModalBottomSheetValue, ModalBottomSheetState> {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ Function1<ModalBottomSheetValue, Boolean> $confirmStateChange;
    final /* synthetic */ boolean $skipHalfExpanded;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModalBottomSheetState$Companion$Saver$2(AnimationSpec<Float> animationSpec, boolean z, Function1<? super ModalBottomSheetValue, Boolean> function1) {
        super(1);
        this.$animationSpec = animationSpec;
        this.$skipHalfExpanded = z;
        this.$confirmStateChange = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final ModalBottomSheetState invoke(@NotNull ModalBottomSheetValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new ModalBottomSheetState(it, this.$animationSpec, this.$skipHalfExpanded, this.$confirmStateChange);
    }
}
