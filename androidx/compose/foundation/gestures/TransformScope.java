package androidx.compose.foundation.gestures;

import androidx.compose.p015ui.geometry.Offset;
import kotlin.Metadata;

/* compiled from: TransformableState.kt */
@Metadata
/* loaded from: classes.dex */
public interface TransformScope {

    /* compiled from: TransformableState.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    /* renamed from: transformBy-d-4ec7I$default  reason: not valid java name */
    static /* synthetic */ void m106233transformByd4ec7I$default(TransformScope transformScope, float f, long j, float f2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                f = 1.0f;
            }
            if ((i & 2) != 0) {
                j = Offset.Companion.m107307getZeroF1C5BW0();
            }
            if ((i & 4) != 0) {
                f2 = 0.0f;
            }
            transformScope.mo106148transformByd4ec7I(f, j, f2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transformBy-d-4ec7I");
    }

    /* renamed from: transformBy-d-4ec7I */
    void mo106148transformByd4ec7I(float f, long j, float f2);
}
