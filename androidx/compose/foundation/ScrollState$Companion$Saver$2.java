package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* compiled from: Scroll.kt */
@Metadata
/* loaded from: classes.dex */
final class ScrollState$Companion$Saver$2 extends Lambda implements Function1<Integer, ScrollState> {
    public static final ScrollState$Companion$Saver$2 INSTANCE = new ScrollState$Companion$Saver$2();

    ScrollState$Companion$Saver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ ScrollState invoke(Integer num) {
        return invoke(num.intValue());
    }

    @Nullable
    public final ScrollState invoke(int i) {
        return new ScrollState(i);
    }
}
