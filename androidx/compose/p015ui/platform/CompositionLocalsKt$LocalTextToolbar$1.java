package androidx.compose.p015ui.platform;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p804nd.ExceptionsH;

/* compiled from: CompositionLocals.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.CompositionLocalsKt$LocalTextToolbar$1 */
/* loaded from: classes.dex */
final class CompositionLocalsKt$LocalTextToolbar$1 extends Lambda implements Functions<TextToolbar> {
    public static final CompositionLocalsKt$LocalTextToolbar$1 INSTANCE = new CompositionLocalsKt$LocalTextToolbar$1();

    CompositionLocalsKt$LocalTextToolbar$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final TextToolbar invoke() {
        CompositionLocals.noLocalProvidedFor("LocalTextToolbar");
        throw new ExceptionsH();
    }
}
