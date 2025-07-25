package androidx.compose.p015ui.text;

import androidx.compose.p015ui.text.style.TextGeometricTransform;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Savers.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.SaversKt$TextGeometricTransformSaver$2 */
/* loaded from: classes.dex */
final class SaversKt$TextGeometricTransformSaver$2 extends Lambda implements Function1<Object, TextGeometricTransform> {
    public static final SaversKt$TextGeometricTransformSaver$2 INSTANCE = new SaversKt$TextGeometricTransformSaver$2();

    SaversKt$TextGeometricTransformSaver$2() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final TextGeometricTransform invoke(@NotNull Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        List list = (List) it;
        return new TextGeometricTransform(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
    }
}
