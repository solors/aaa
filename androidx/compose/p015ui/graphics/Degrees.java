package androidx.compose.p015ui.graphics;

import kotlin.Metadata;

@Metadata
/* renamed from: androidx.compose.ui.graphics.DegreesKt */
/* loaded from: classes.dex */
public final class Degrees {
    private static final float RadiansToDegrees = 57.29578f;

    public static final float degrees(float f) {
        return f * RadiansToDegrees;
    }
}
