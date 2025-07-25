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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: StringValues.kt */
@Metadata
/* renamed from: mc.w */
/* loaded from: classes9.dex */
public class C38279w implements StringValues {

    /* renamed from: c */
    private final boolean f101168c;
    @NotNull

    /* renamed from: d */
    private final Map<String, List<String>> f101169d;

    public C38279w(boolean z, @NotNull Map<String, ? extends List<String>> values) {
        Map linkedHashMap;
        Intrinsics.checkNotNullParameter(values, "values");
        this.f101168c = z;
        if (z) {
            linkedHashMap = C38268k.m15230a();
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        for (Map.Entry<String, ? extends List<String>> entry : values.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            int size = value.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(value.get(i));
            }
            linkedHashMap.put(key, arrayList);
        }
        this.f101169d = linkedHashMap;
    }

    /* renamed from: d */
    private final List<String> m15193d(String str) {
        return this.f101169d.get(str);
    }

    @Override // mc.StringValues
    @Nullable
    /* renamed from: a */
    public List<String> mo15196a(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return m15193d(name);
    }

    @Override // mc.StringValues
    /* renamed from: b */
    public final boolean mo15195b() {
        return this.f101168c;
    }

    @Override // mc.StringValues
    /* renamed from: c */
    public void mo15194c(@NotNull Function2<? super String, ? super List<String>, Unit> body) {
        Intrinsics.checkNotNullParameter(body, "body");
        for (Map.Entry<String, List<String>> entry : this.f101169d.entrySet()) {
            body.mo105910invoke(entry.getKey(), entry.getValue());
        }
    }

    @Override // mc.StringValues
    @NotNull
    public Set<Map.Entry<String, List<String>>> entries() {
        return CollectionsJvm.m15231a(this.f101169d.entrySet());
    }

    public boolean equals(@Nullable Object obj) {
        boolean m15189d;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StringValues)) {
            return false;
        }
        StringValues stringValues = (StringValues) obj;
        if (this.f101168c == stringValues.mo15195b()) {
            m15189d = C38280x.m15189d(entries(), stringValues.entries());
            return m15189d;
        }
        return false;
    }

    @Override // mc.StringValues
    @Nullable
    public String get(@NotNull String name) {
        Object m17529r0;
        Intrinsics.checkNotNullParameter(name, "name");
        List<String> m15193d = m15193d(name);
        if (m15193d != null) {
            m17529r0 = _Collections.m17529r0(m15193d);
            return (String) m17529r0;
        }
        return null;
    }

    public int hashCode() {
        int m15188e;
        m15188e = C38280x.m15188e(entries(), Boolean.hashCode(this.f101168c) * 31);
        return m15188e;
    }

    @Override // mc.StringValues
    public boolean isEmpty() {
        return this.f101169d.isEmpty();
    }

    @Override // mc.StringValues
    @NotNull
    public Set<String> names() {
        return CollectionsJvm.m15231a(this.f101169d.keySet());
    }
}
