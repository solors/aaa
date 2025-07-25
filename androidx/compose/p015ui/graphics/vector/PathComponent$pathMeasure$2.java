package androidx.compose.p015ui.graphics.vector;

import androidx.compose.p015ui.graphics.AndroidPathMeasure_androidKt;
import androidx.compose.p015ui.graphics.PathMeasure;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: Vector.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.vector.PathComponent$pathMeasure$2 */
/* loaded from: classes.dex */
final class PathComponent$pathMeasure$2 extends Lambda implements Functions<PathMeasure> {
    public static final PathComponent$pathMeasure$2 INSTANCE = new PathComponent$pathMeasure$2();

    PathComponent$pathMeasure$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final PathMeasure invoke() {
        return AndroidPathMeasure_androidKt.PathMeasure();
    }
}
