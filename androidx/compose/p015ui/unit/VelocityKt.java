package androidx.compose.p015ui.unit;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;

/* compiled from: Velocity.kt */
@Metadata
/* renamed from: androidx.compose.ui.unit.VelocityKt */
/* loaded from: classes.dex */
public final class VelocityKt {
    @Stable
    public static final long Velocity(float f, float f2) {
        return Velocity.m109953constructorimpl((Float.floatToIntBits(f2) & 4294967295L) | (Float.floatToIntBits(f) << 32));
    }
}
