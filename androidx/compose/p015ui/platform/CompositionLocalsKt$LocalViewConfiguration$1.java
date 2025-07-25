package androidx.compose.p015ui.platform;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p804nd.ExceptionsH;

/* compiled from: CompositionLocals.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.CompositionLocalsKt$LocalViewConfiguration$1 */
/* loaded from: classes.dex */
final class CompositionLocalsKt$LocalViewConfiguration$1 extends Lambda implements Functions<ViewConfiguration> {
    public static final CompositionLocalsKt$LocalViewConfiguration$1 INSTANCE = new CompositionLocalsKt$LocalViewConfiguration$1();

    CompositionLocalsKt$LocalViewConfiguration$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final ViewConfiguration invoke() {
        CompositionLocals.noLocalProvidedFor("LocalViewConfiguration");
        throw new ExceptionsH();
    }
}
