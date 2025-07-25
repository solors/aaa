package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: Switch.kt */
@Metadata
/* loaded from: classes.dex */
final class SwitchKt$Switch$2 extends Lambda implements Function2<Boolean, Boolean, ThresholdConfig> {
    public static final SwitchKt$Switch$2 INSTANCE = new SwitchKt$Switch$2();

    SwitchKt$Switch$2() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ ThresholdConfig mo105910invoke(Boolean bool, Boolean bool2) {
        return invoke(bool.booleanValue(), bool2.booleanValue());
    }

    @NotNull
    public final ThresholdConfig invoke(boolean z, boolean z2) {
        return new FractionalThreshold(0.5f);
    }
}
