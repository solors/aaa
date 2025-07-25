package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* compiled from: BasicText.kt */
@Metadata
/* loaded from: classes.dex */
final class BasicTextKt$selectionIdSaver$2 extends Lambda implements Function1<Long, Long> {
    public static final BasicTextKt$selectionIdSaver$2 INSTANCE = new BasicTextKt$selectionIdSaver$2();

    BasicTextKt$selectionIdSaver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Long invoke(Long l) {
        return invoke(l.longValue());
    }

    @Nullable
    public final Long invoke(long j) {
        return Long.valueOf(j);
    }
}
