package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* compiled from: ElevationOverlay.kt */
@Metadata
/* loaded from: classes.dex */
final class ElevationOverlayKt$LocalElevationOverlay$1 extends Lambda implements Functions<ElevationOverlay> {
    public static final ElevationOverlayKt$LocalElevationOverlay$1 INSTANCE = new ElevationOverlayKt$LocalElevationOverlay$1();

    ElevationOverlayKt$LocalElevationOverlay$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @Nullable
    public final ElevationOverlay invoke() {
        return DefaultElevationOverlay.INSTANCE;
    }
}
