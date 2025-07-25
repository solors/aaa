package p761kc;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mc.C38279w;
import org.jetbrains.annotations.NotNull;

/* compiled from: Parameters.kt */
@Metadata
/* renamed from: kc.c0 */
/* loaded from: classes9.dex */
public final class C37454c0 extends C38279w implements InterfaceC37497z {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37454c0(@NotNull Map<String, ? extends List<String>> values) {
        super(true, values);
        Intrinsics.checkNotNullParameter(values, "values");
    }

    @NotNull
    public String toString() {
        return "Parameters " + entries();
    }
}
