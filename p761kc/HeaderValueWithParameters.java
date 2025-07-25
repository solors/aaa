package p761kc;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: kc.i */
/* loaded from: classes9.dex */
public abstract class HeaderValueWithParameters {
    @NotNull

    /* renamed from: c */
    public static final C37461a f98883c = new C37461a(null);
    @NotNull

    /* renamed from: a */
    private final String f98884a;
    @NotNull

    /* renamed from: b */
    private final List<C37459h> f98885b;

    /* compiled from: HeaderValueWithParameters.kt */
    @Metadata
    /* renamed from: kc.i$a */
    /* loaded from: classes9.dex */
    public static final class C37461a {
        private C37461a() {
        }

        public /* synthetic */ C37461a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public HeaderValueWithParameters(@NotNull String content, @NotNull List<C37459h> parameters) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f98884a = content;
        this.f98885b = parameters;
    }

    @NotNull
    /* renamed from: a */
    public final String m17963a() {
        return this.f98884a;
    }

    @NotNull
    /* renamed from: b */
    public final List<C37459h> m17962b() {
        return this.f98885b;
    }

    @Nullable
    /* renamed from: c */
    public final String m17961c(@NotNull String name) {
        int m17164o;
        boolean m16615y;
        Intrinsics.checkNotNullParameter(name, "name");
        m17164o = C37563v.m17164o(this.f98885b);
        if (m17164o >= 0) {
            int i = 0;
            while (true) {
                C37459h c37459h = this.f98885b.get(i);
                m16615y = StringsJVM.m16615y(c37459h.m17974a(), name, true);
                if (m16615y) {
                    return c37459h.m17973b();
                }
                if (i != m17164o) {
                    i++;
                } else {
                    return null;
                }
            }
        } else {
            return null;
        }
    }

    @NotNull
    public String toString() {
        int m17164o;
        boolean m17958c;
        if (this.f98885b.isEmpty()) {
            return this.f98884a;
        }
        int length = this.f98884a.length();
        int i = 0;
        int i2 = 0;
        for (C37459h c37459h : this.f98885b) {
            i2 += c37459h.m17974a().length() + c37459h.m17973b().length() + 3;
        }
        StringBuilder sb2 = new StringBuilder(length + i2);
        sb2.append(this.f98884a);
        m17164o = C37563v.m17164o(this.f98885b);
        if (m17164o >= 0) {
            while (true) {
                C37459h c37459h2 = this.f98885b.get(i);
                sb2.append("; ");
                sb2.append(c37459h2.m17974a());
                sb2.append("=");
                String m17973b = c37459h2.m17973b();
                m17958c = C37463j.m17958c(m17973b);
                if (m17958c) {
                    sb2.append(C37463j.m17957d(m17973b));
                } else {
                    sb2.append(m17973b);
                }
                if (i == m17164o) {
                    break;
                }
                i++;
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "{\n            val size =…   }.toString()\n        }");
        return sb3;
    }
}
