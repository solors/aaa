package androidx.compose.p015ui.node;

import kotlin.Metadata;

/* compiled from: HitTestResult.kt */
@Metadata
/* renamed from: androidx.compose.ui.node.HitTestResultKt */
/* loaded from: classes.dex */
public final class HitTestResultKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long DistanceAndInLayer(float f, boolean z) {
        long j;
        long floatToIntBits = Float.floatToIntBits(f);
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        return DistanceAndInLayer.m109100constructorimpl((j & 4294967295L) | (floatToIntBits << 32));
    }
}
