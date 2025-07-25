package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: ModalBottomSheet.kt */
@Metadata
/* loaded from: classes.dex */
final class ModalBottomSheetKt$rememberModalBottomSheetState$2 extends Lambda implements Functions<ModalBottomSheetState> {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ Function1<ModalBottomSheetValue, Boolean> $confirmStateChange;
    final /* synthetic */ ModalBottomSheetValue $initialValue;
    final /* synthetic */ boolean $skipHalfExpanded;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModalBottomSheetKt$rememberModalBottomSheetState$2(ModalBottomSheetValue modalBottomSheetValue, AnimationSpec<Float> animationSpec, boolean z, Function1<? super ModalBottomSheetValue, Boolean> function1) {
        super(0);
        this.$initialValue = modalBottomSheetValue;
        this.$animationSpec = animationSpec;
        this.$skipHalfExpanded = z;
        this.$confirmStateChange = function1;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final ModalBottomSheetState invoke() {
        return new ModalBottomSheetState(this.$initialValue, this.$animationSpec, this.$skipHalfExpanded, this.$confirmStateChange);
    }
}
