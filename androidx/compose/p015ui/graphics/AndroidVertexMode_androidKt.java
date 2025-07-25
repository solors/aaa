package androidx.compose.p015ui.graphics;

import android.graphics.Canvas;
import androidx.compose.p015ui.graphics.VertexMode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidVertexMode.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.AndroidVertexMode_androidKt */
/* loaded from: classes.dex */
public final class AndroidVertexMode_androidKt {
    @NotNull
    /* renamed from: toAndroidVertexMode-JOOmi9M  reason: not valid java name */
    public static final Canvas.VertexMode m107435toAndroidVertexModeJOOmi9M(int i) {
        VertexMode.Companion companion = VertexMode.Companion;
        if (VertexMode.m107873equalsimpl0(i, companion.m107879getTrianglesc2xauaI())) {
            return Canvas.VertexMode.TRIANGLES;
        }
        if (VertexMode.m107873equalsimpl0(i, companion.m107878getTriangleStripc2xauaI())) {
            return Canvas.VertexMode.TRIANGLE_STRIP;
        }
        if (VertexMode.m107873equalsimpl0(i, companion.m107877getTriangleFanc2xauaI())) {
            return Canvas.VertexMode.TRIANGLE_FAN;
        }
        return Canvas.VertexMode.TRIANGLES;
    }
}
