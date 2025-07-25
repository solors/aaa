package androidx.compose.p015ui.text;

import androidx.compose.p015ui.text.style.TextGeometricTransform;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Savers.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.SaversKt$TextGeometricTransformSaver$1 */
/* loaded from: classes.dex */
final class SaversKt$TextGeometricTransformSaver$1 extends Lambda implements Function2<SaverScope, TextGeometricTransform, Object> {
    public static final SaversKt$TextGeometricTransformSaver$1 INSTANCE = new SaversKt$TextGeometricTransformSaver$1();

    SaversKt$TextGeometricTransformSaver$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object mo105910invoke(@NotNull SaverScope Saver, @NotNull TextGeometricTransform it) {
        ArrayList m17172g;
        Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
        Intrinsics.checkNotNullParameter(it, "it");
        m17172g = C37563v.m17172g(Float.valueOf(it.getScaleX()), Float.valueOf(it.getSkewX()));
        return m17172g;
    }
}
