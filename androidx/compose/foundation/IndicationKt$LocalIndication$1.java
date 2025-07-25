package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: Indication.kt */
@Metadata
/* loaded from: classes.dex */
final class IndicationKt$LocalIndication$1 extends Lambda implements Functions<Indication> {
    public static final IndicationKt$LocalIndication$1 INSTANCE = new IndicationKt$LocalIndication$1();

    IndicationKt$LocalIndication$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final Indication invoke() {
        return DefaultDebugIndication.INSTANCE;
    }
}
