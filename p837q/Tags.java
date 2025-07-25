package p837q;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1003v.C44473c;

@Metadata
/* renamed from: q.s */
/* loaded from: classes2.dex */
public final class Tags {
    @NotNull

    /* renamed from: b */
    public static final C39317a f103378b = new C39317a(null);
    @NotNull

    /* renamed from: c */
    public static final Tags f103379c;
    @NotNull

    /* renamed from: a */
    private final Map<Class<?>, Object> f103380a;

    /* compiled from: Tags.kt */
    @Metadata
    /* renamed from: q.s$a */
    /* loaded from: classes2.dex */
    public static final class C39317a {
        private C39317a() {
        }

        public /* synthetic */ C39317a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final Tags m13012a(@NotNull Map<Class<?>, ? extends Object> map) {
            return new Tags(C44473c.m2849b(map), null);
        }
    }

    static {
        Map m17284j;
        m17284j = C37559r0.m17284j();
        f103379c = new Tags(m17284j);
    }

    public /* synthetic */ Tags(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    @NotNull
    /* renamed from: a */
    public final Map<Class<?>, Object> m13013a() {
        return this.f103380a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Tags) && Intrinsics.m17075f(this.f103380a, ((Tags) obj).f103380a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f103380a.hashCode();
    }

    @NotNull
    public String toString() {
        return "Tags(tags=" + this.f103380a + ')';
    }

    private Tags(Map<Class<?>, ? extends Object> map) {
        this.f103380a = map;
    }
}
