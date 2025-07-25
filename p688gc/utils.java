package p688gc;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p761kc.InterfaceC37487r;

@Metadata
/* renamed from: gc.j */
/* loaded from: classes9.dex */
public final class utils {
    /* renamed from: a */
    public static final void m24169a(@NotNull InterfaceC37487r interfaceC37487r, @NotNull String key, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(interfaceC37487r, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (obj != null) {
            interfaceC37487r.getHeaders().mo15205e(key, obj.toString());
            Unit unit = Unit.f99208a;
        }
    }
}
