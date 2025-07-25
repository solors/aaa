package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: BottomSheetScaffold.kt */
@Metadata
/* loaded from: classes.dex */
final class BottomSheetScaffoldKt$rememberBottomSheetState$2 extends Lambda implements Functions<BottomSheetState> {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ Function1<BottomSheetValue, Boolean> $confirmStateChange;
    final /* synthetic */ BottomSheetValue $initialValue;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetScaffoldKt$rememberBottomSheetState$2(BottomSheetValue bottomSheetValue, AnimationSpec<Float> animationSpec, Function1<? super BottomSheetValue, Boolean> function1) {
        super(0);
        this.$initialValue = bottomSheetValue;
        this.$animationSpec = animationSpec;
        this.$confirmStateChange = function1;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final BottomSheetState invoke() {
        return new BottomSheetState(this.$initialValue, this.$animationSpec, this.$confirmStateChange);
    }
}
