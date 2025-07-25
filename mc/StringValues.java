package mc;

import java.util.Iterator;
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

@Metadata
/* renamed from: mc.t */
/* loaded from: classes9.dex */
public interface StringValues {

    /* compiled from: StringValues.kt */
    @Metadata
    /* renamed from: mc.t$a */
    /* loaded from: classes9.dex */
    public static final class C38275a {
        /* renamed from: a */
        public static void m15211a(@NotNull StringValues stringValues, @NotNull Function2<? super String, ? super List<String>, Unit> body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Iterator<T> it = stringValues.entries().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                body.mo105910invoke((String) entry.getKey(), (List) entry.getValue());
            }
        }

        @Nullable
        /* renamed from: b */
        public static String m15210b(@NotNull StringValues stringValues, @NotNull String name) {
            Object m17529r0;
            Intrinsics.checkNotNullParameter(name, "name");
            List<String> mo15196a = stringValues.mo15196a(name);
            if (mo15196a != null) {
                m17529r0 = _Collections.m17529r0(mo15196a);
                return (String) m17529r0;
            }
            return null;
        }
    }

    @Nullable
    /* renamed from: a */
    List<String> mo15196a(@NotNull String str);

    /* renamed from: b */
    boolean mo15195b();

    /* renamed from: c */
    void mo15194c(@NotNull Function2<? super String, ? super List<String>, Unit> function2);

    @NotNull
    Set<Map.Entry<String, List<String>>> entries();

    @Nullable
    String get(@NotNull String str);

    boolean isEmpty();

    @NotNull
    Set<String> names();
}
