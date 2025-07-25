package androidx.compose.p015ui.platform;

import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p804nd.ExceptionsH;

/* compiled from: CompositionLocals.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.CompositionLocalsKt$LocalLayoutDirection$1 */
/* loaded from: classes.dex */
final class CompositionLocalsKt$LocalLayoutDirection$1 extends Lambda implements Functions<LayoutDirection> {
    public static final CompositionLocalsKt$LocalLayoutDirection$1 INSTANCE = new CompositionLocalsKt$LocalLayoutDirection$1();

    CompositionLocalsKt$LocalLayoutDirection$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final LayoutDirection invoke() {
        CompositionLocals.noLocalProvidedFor("LocalLayoutDirection");
        throw new ExceptionsH();
    }
}
