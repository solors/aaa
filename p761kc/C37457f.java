package p761kc;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C37572z0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p761kc.InterfaceC37497z;

/* compiled from: Parameters.kt */
@Metadata
/* renamed from: kc.f */
/* loaded from: classes9.dex */
public final class C37457f implements InterfaceC37497z {
    @NotNull

    /* renamed from: c */
    public static final C37457f f98864c = new C37457f();

    private C37457f() {
    }

    @Override // mc.StringValues
    @Nullable
    /* renamed from: a */
    public List<String> mo15196a(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return null;
    }

    @Override // mc.StringValues
    /* renamed from: b */
    public boolean mo15195b() {
        return true;
    }

    @Override // mc.StringValues
    /* renamed from: c */
    public void mo15194c(@NotNull Function2<? super String, ? super List<String>, Unit> function2) {
        InterfaceC37497z.C37499b.m17737a(this, function2);
    }

    @Override // mc.StringValues
    @NotNull
    public Set<Map.Entry<String, List<String>>> entries() {
        Set<Map.Entry<String, List<String>>> m17123f;
        m17123f = C37572z0.m17123f();
        return m17123f;
    }

    public boolean equals(@Nullable Object obj) {
        if ((obj instanceof InterfaceC37497z) && ((InterfaceC37497z) obj).isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // mc.StringValues
    public boolean isEmpty() {
        return true;
    }

    @Override // mc.StringValues
    @NotNull
    public Set<String> names() {
        Set<String> m17123f;
        m17123f = C37572z0.m17123f();
        return m17123f;
    }

    @NotNull
    public String toString() {
        return "Parameters " + entries();
    }
}
