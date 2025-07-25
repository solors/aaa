package androidx.compose.p015ui.graphics.vector;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: VectorCompose.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$1 */
/* loaded from: classes.dex */
final class VectorComposeKt$Path$1 extends Lambda implements Functions<PathComponent> {
    public static final VectorComposeKt$Path$1 INSTANCE = new VectorComposeKt$Path$1();

    VectorComposeKt$Path$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final PathComponent invoke() {
        return new PathComponent();
    }
}
