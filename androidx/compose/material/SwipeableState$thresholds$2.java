package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: Swipeable.kt */
@Metadata
/* loaded from: classes.dex */
final class SwipeableState$thresholds$2 extends Lambda implements Function2<Float, Float, Float> {
    public static final SwipeableState$thresholds$2 INSTANCE = new SwipeableState$thresholds$2();

    SwipeableState$thresholds$2() {
        super(2);
    }

    @NotNull
    public final Float invoke(float f, float f2) {
        return Float.valueOf(0.0f);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Float mo105910invoke(Float f, Float f2) {
        return invoke(f.floatValue(), f2.floatValue());
    }
}
