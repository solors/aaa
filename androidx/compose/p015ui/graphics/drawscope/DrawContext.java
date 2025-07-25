package androidx.compose.p015ui.graphics.drawscope;

import androidx.compose.p015ui.graphics.Canvas;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: DrawContext.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.drawscope.DrawContext */
/* loaded from: classes.dex */
public interface DrawContext {
    @NotNull
    Canvas getCanvas();

    /* renamed from: getSize-NH-jbRc */
    long mo107946getSizeNHjbRc();

    @NotNull
    DrawTransform getTransform();

    /* renamed from: setSize-uvyYCjk */
    void mo107947setSizeuvyYCjk(long j);
}
