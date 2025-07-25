package androidx.compose.p015ui.semantics;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SemanticsProperties.kt */
@Metadata
/* renamed from: androidx.compose.ui.semantics.SemanticsProperties$TestTag$1 */
/* loaded from: classes.dex */
final class SemanticsProperties$TestTag$1 extends Lambda implements Function2<String, String, String> {
    public static final SemanticsProperties$TestTag$1 INSTANCE = new SemanticsProperties$TestTag$1();

    SemanticsProperties$TestTag$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final String mo105910invoke(@Nullable String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, "<anonymous parameter 1>");
        return str;
    }
}
