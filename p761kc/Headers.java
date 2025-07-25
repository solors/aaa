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
import p761kc.InterfaceC37464k;

@Metadata
/* renamed from: kc.e */
/* loaded from: classes9.dex */
public final class Headers implements InterfaceC37464k {
    @NotNull

    /* renamed from: c */
    public static final Headers f98863c = new Headers();

    private Headers() {
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
        InterfaceC37464k.C37466b.m17954a(this, function2);
    }

    @Override // mc.StringValues
    @NotNull
    public Set<Map.Entry<String, List<String>>> entries() {
        Set<Map.Entry<String, List<String>>> m17123f;
        m17123f = C37572z0.m17123f();
        return m17123f;
    }

    @Override // mc.StringValues
    @Nullable
    public String get(@NotNull String str) {
        return InterfaceC37464k.C37466b.m17953b(this, str);
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
        return "Headers " + entries();
    }
}
