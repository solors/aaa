package androidx.compose.foundation.lazy;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LazyDsl.kt */
@Metadata
/* loaded from: classes.dex */
public final class LazyListScope$items$1 extends Lambda implements Function1 {
    public static final LazyListScope$items$1 INSTANCE = new LazyListScope$items$1();

    LazyListScope$items$1() {
        super(1);
    }

    @Nullable
    public final Void invoke(int i) {
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
