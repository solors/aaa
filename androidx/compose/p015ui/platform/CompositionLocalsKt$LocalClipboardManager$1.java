package androidx.compose.p015ui.platform;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p804nd.ExceptionsH;

/* compiled from: CompositionLocals.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.CompositionLocalsKt$LocalClipboardManager$1 */
/* loaded from: classes.dex */
final class CompositionLocalsKt$LocalClipboardManager$1 extends Lambda implements Functions<ClipboardManager> {
    public static final CompositionLocalsKt$LocalClipboardManager$1 INSTANCE = new CompositionLocalsKt$LocalClipboardManager$1();

    CompositionLocalsKt$LocalClipboardManager$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final ClipboardManager invoke() {
        CompositionLocals.noLocalProvidedFor("LocalClipboardManager");
        throw new ExceptionsH();
    }
}
