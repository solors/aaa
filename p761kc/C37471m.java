package p761kc;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mc.C38279w;
import org.jetbrains.annotations.NotNull;

/* compiled from: Headers.kt */
@Metadata
/* renamed from: kc.m */
/* loaded from: classes9.dex */
public final class C37471m extends C38279w implements InterfaceC37464k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37471m(@NotNull Map<String, ? extends List<String>> values) {
        super(true, values);
        Intrinsics.checkNotNullParameter(values, "values");
    }

    @NotNull
    public String toString() {
        return "Headers " + entries();
    }
}
