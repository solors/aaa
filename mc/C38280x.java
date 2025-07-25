package mc;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: StringValues.kt */
@Metadata
/* renamed from: mc.x */
/* loaded from: classes9.dex */
public final class C38280x {
    @NotNull
    /* renamed from: c */
    public static final InterfaceC38276u m15190c(@NotNull InterfaceC38276u interfaceC38276u, @NotNull InterfaceC38276u builder) {
        Intrinsics.checkNotNullParameter(interfaceC38276u, "<this>");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Iterator<T> it = builder.entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            interfaceC38276u.mo15207c((String) entry.getKey(), (List) entry.getValue());
        }
        return interfaceC38276u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m15189d(Set<? extends Map.Entry<String, ? extends List<String>>> set, Set<? extends Map.Entry<String, ? extends List<String>>> set2) {
        return Intrinsics.m17075f(set, set2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final int m15188e(Set<? extends Map.Entry<String, ? extends List<String>>> set, int i) {
        return (i * 31) + set.hashCode();
    }
}
