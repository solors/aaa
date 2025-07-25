package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* compiled from: OverscrollConfiguration.kt */
@Metadata
/* loaded from: classes.dex */
final class OverscrollConfigurationKt$LocalOverscrollConfiguration$1 extends Lambda implements Functions<OverscrollConfiguration> {
    public static final OverscrollConfigurationKt$LocalOverscrollConfiguration$1 INSTANCE = new OverscrollConfigurationKt$LocalOverscrollConfiguration$1();

    OverscrollConfigurationKt$LocalOverscrollConfiguration$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @Nullable
    public final OverscrollConfiguration invoke() {
        return new OverscrollConfiguration(0L, null, 3, null);
    }
}
