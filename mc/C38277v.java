package mc;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections._Collections;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: StringValues.kt */
@Metadata
/* renamed from: mc.v */
/* loaded from: classes9.dex */
public class C38277v implements InterfaceC38276u {

    /* renamed from: a */
    private final boolean f101165a;
    @NotNull

    /* renamed from: b */
    private final Map<String, List<String>> f101166b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StringValues.kt */
    @Metadata
    /* renamed from: mc.v$a */
    /* loaded from: classes9.dex */
    public static final class C38278a extends Lambda implements Function2<String, List<? extends String>, Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C38278a() {
            super(2);
            C38277v.this = r1;
        }

        /* renamed from: a */
        public final void m15197a(@NotNull String name, @NotNull List<String> values) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(values, "values");
            C38277v.this.mo15207c(name, values);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit mo105910invoke(String str, List<? extends String> list) {
            m15197a(str, list);
            return Unit.f99208a;
        }
    }

    public C38277v(boolean z, int i) {
        Map<String, List<String>> linkedHashMap;
        this.f101165a = z;
        if (z) {
            linkedHashMap = C38268k.m15230a();
        } else {
            linkedHashMap = new LinkedHashMap<>(i);
        }
        this.f101166b = linkedHashMap;
    }

    /* renamed from: f */
    private final List<String> m15204f(String str) {
        List<String> list = this.f101166b.get(str);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            mo15199k(str);
            this.f101166b.put(str, arrayList);
            return arrayList;
        }
        return list;
    }

    @Override // mc.InterfaceC38276u
    @Nullable
    /* renamed from: a */
    public List<String> mo15209a(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f101166b.get(name);
    }

    @Override // mc.InterfaceC38276u
    /* renamed from: b */
    public final boolean mo15208b() {
        return this.f101165a;
    }

    @Override // mc.InterfaceC38276u
    /* renamed from: c */
    public void mo15207c(@NotNull String name, @NotNull Iterable<String> values) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(values, "values");
        List<String> m15204f = m15204f(name);
        for (String str : values) {
            mo15198l(str);
            m15204f.add(str);
        }
    }

    @Override // mc.InterfaceC38276u
    public void clear() {
        this.f101166b.clear();
    }

    @Override // mc.InterfaceC38276u
    public boolean contains(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f101166b.containsKey(name);
    }

    @Override // mc.InterfaceC38276u
    /* renamed from: d */
    public void mo15206d(@NotNull StringValues stringValues) {
        Intrinsics.checkNotNullParameter(stringValues, "stringValues");
        stringValues.mo15194c(new C38278a());
    }

    @Override // mc.InterfaceC38276u
    /* renamed from: e */
    public void mo15205e(@NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        mo15198l(value);
        m15204f(name).add(value);
    }

    @Override // mc.InterfaceC38276u
    @NotNull
    public Set<Map.Entry<String, List<String>>> entries() {
        return CollectionsJvm.m15231a(this.f101166b.entrySet());
    }

    @Nullable
    /* renamed from: g */
    public String m15203g(@NotNull String name) {
        Object m17529r0;
        Intrinsics.checkNotNullParameter(name, "name");
        List<String> mo15209a = mo15209a(name);
        if (mo15209a != null) {
            m17529r0 = _Collections.m17529r0(mo15209a);
            return (String) m17529r0;
        }
        return null;
    }

    @NotNull
    /* renamed from: h */
    public final Map<String, List<String>> m15202h() {
        return this.f101166b;
    }

    /* renamed from: i */
    public void m15201i(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f101166b.remove(name);
    }

    @Override // mc.InterfaceC38276u
    public boolean isEmpty() {
        return this.f101166b.isEmpty();
    }

    /* renamed from: j */
    public void m15200j(@NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        mo15198l(value);
        List<String> m15204f = m15204f(name);
        m15204f.clear();
        m15204f.add(value);
    }

    /* renamed from: k */
    public void mo15199k(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
    }

    /* renamed from: l */
    public void mo15198l(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // mc.InterfaceC38276u
    @NotNull
    public Set<String> names() {
        return this.f101166b.keySet();
    }
}
