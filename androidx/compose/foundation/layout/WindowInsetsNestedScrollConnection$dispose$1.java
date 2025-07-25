package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: WindowInsetsConnection.android.kt */
@Metadata
/* loaded from: classes.dex */
final class WindowInsetsNestedScrollConnection$dispose$1 extends Lambda implements Function1<Throwable, Unit> {
    public static final WindowInsetsNestedScrollConnection$dispose$1 INSTANCE = new WindowInsetsNestedScrollConnection$dispose$1();

    WindowInsetsNestedScrollConnection$dispose$1() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.f99208a;
    }
}
