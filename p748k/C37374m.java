package p748k;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p689h.AbstractC33446p;
import p689h.DataSource;

/* compiled from: FetchResult.kt */
@Metadata
/* renamed from: k.m */
/* loaded from: classes2.dex */
public final class C37374m extends AbstractC37365h {
    @NotNull

    /* renamed from: a */
    private final AbstractC33446p f98656a;
    @Nullable

    /* renamed from: b */
    private final String f98657b;
    @NotNull

    /* renamed from: c */
    private final DataSource f98658c;

    public C37374m(@NotNull AbstractC33446p abstractC33446p, @Nullable String str, @NotNull DataSource dataSource) {
        super(null);
        this.f98656a = abstractC33446p;
        this.f98657b = str;
        this.f98658c = dataSource;
    }

    @NotNull
    /* renamed from: a */
    public final DataSource m18278a() {
        return this.f98658c;
    }

    @NotNull
    /* renamed from: b */
    public final AbstractC33446p m18277b() {
        return this.f98656a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C37374m) {
            C37374m c37374m = (C37374m) obj;
            if (Intrinsics.m17075f(this.f98656a, c37374m.f98656a) && Intrinsics.m17075f(this.f98657b, c37374m.f98657b) && this.f98658c == c37374m.f98658c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f98656a.hashCode() * 31;
        String str = this.f98657b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return ((hashCode + i) * 31) + this.f98658c.hashCode();
    }
}
