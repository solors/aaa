package androidx.compose.p015ui.platform;

import androidx.compose.p015ui.hapticfeedback.HapticFeedback;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p804nd.ExceptionsH;

/* compiled from: CompositionLocals.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.CompositionLocalsKt$LocalHapticFeedback$1 */
/* loaded from: classes.dex */
final class CompositionLocalsKt$LocalHapticFeedback$1 extends Lambda implements Functions<HapticFeedback> {
    public static final CompositionLocalsKt$LocalHapticFeedback$1 INSTANCE = new CompositionLocalsKt$LocalHapticFeedback$1();

    CompositionLocalsKt$LocalHapticFeedback$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final HapticFeedback invoke() {
        CompositionLocals.noLocalProvidedFor("LocalHapticFeedback");
        throw new ExceptionsH();
    }
}
