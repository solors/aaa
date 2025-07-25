package kotlin.coroutines;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C37607l0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CoroutineContextImpl.kt */
@Metadata
/* renamed from: kotlin.coroutines.c */
/* loaded from: classes7.dex */
public final class C37578c implements CoroutineContext, Serializable {
    @NotNull

    /* renamed from: b */
    private final CoroutineContext f99280b;
    @NotNull

    /* renamed from: c */
    private final CoroutineContext.Element f99281c;

    /* compiled from: CoroutineContextImpl.kt */
    @Metadata
    /* renamed from: kotlin.coroutines.c$a */
    /* loaded from: classes7.dex */
    private static final class C37579a implements Serializable {
        @NotNull

        /* renamed from: c */
        public static final C37580a f99282c = new C37580a(null);
        @NotNull

        /* renamed from: b */
        private final CoroutineContext[] f99283b;

        /* compiled from: CoroutineContextImpl.kt */
        @Metadata
        /* renamed from: kotlin.coroutines.c$a$a */
        /* loaded from: classes7.dex */
        public static final class C37580a {
            private C37580a() {
            }

            public /* synthetic */ C37580a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C37579a(@NotNull CoroutineContext[] elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.f99283b = elements;
        }

        private final Object readResolve() {
            CoroutineContext[] coroutineContextArr = this.f99283b;
            CoroutineContext coroutineContext = C37586g.f99289b;
            for (CoroutineContext coroutineContext2 : coroutineContextArr) {
                coroutineContext = coroutineContext.plus(coroutineContext2);
            }
            return coroutineContext;
        }
    }

    /* compiled from: CoroutineContextImpl.kt */
    @Metadata
    /* renamed from: kotlin.coroutines.c$b */
    /* loaded from: classes7.dex */
    static final class C37581b extends Lambda implements Function2<String, CoroutineContext.Element, String> {

        /* renamed from: g */
        public static final C37581b f99284g = new C37581b();

        C37581b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* renamed from: a */
        public final String mo105910invoke(@NotNull String acc, @NotNull CoroutineContext.Element element) {
            boolean z;
            Intrinsics.checkNotNullParameter(acc, "acc");
            Intrinsics.checkNotNullParameter(element, "element");
            if (acc.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return element.toString();
            }
            return acc + ", " + element;
        }
    }

    /* compiled from: CoroutineContextImpl.kt */
    @Metadata
    /* renamed from: kotlin.coroutines.c$c */
    /* loaded from: classes7.dex */
    static final class C37582c extends Lambda implements Function2<Unit, CoroutineContext.Element, Unit> {

        /* renamed from: g */
        final /* synthetic */ CoroutineContext[] f99285g;

        /* renamed from: h */
        final /* synthetic */ C37607l0 f99286h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C37582c(CoroutineContext[] coroutineContextArr, C37607l0 c37607l0) {
            super(2);
            this.f99285g = coroutineContextArr;
            this.f99286h = c37607l0;
        }

        /* renamed from: a */
        public final void m17106a(@NotNull Unit unit, @NotNull CoroutineContext.Element element) {
            Intrinsics.checkNotNullParameter(unit, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(element, "element");
            CoroutineContext[] coroutineContextArr = this.f99285g;
            C37607l0 c37607l0 = this.f99286h;
            int i = c37607l0.f99325b;
            c37607l0.f99325b = i + 1;
            coroutineContextArr[i] = element;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit mo105910invoke(Unit unit, CoroutineContext.Element element) {
            m17106a(unit, element);
            return Unit.f99208a;
        }
    }

    public C37578c(@NotNull CoroutineContext left, @NotNull CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(element, "element");
        this.f99280b = left;
        this.f99281c = element;
    }

    /* renamed from: c */
    private final boolean m17110c(CoroutineContext.Element element) {
        return Intrinsics.m17075f(get(element.getKey()), element);
    }

    /* renamed from: d */
    private final boolean m17109d(C37578c c37578c) {
        while (m17110c(c37578c.f99281c)) {
            CoroutineContext coroutineContext = c37578c.f99280b;
            if (coroutineContext instanceof C37578c) {
                c37578c = (C37578c) coroutineContext;
            } else {
                Intrinsics.m17073h(coroutineContext, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return m17110c((CoroutineContext.Element) coroutineContext);
            }
        }
        return false;
    }

    /* renamed from: g */
    private final int m17108g() {
        int i = 2;
        C37578c c37578c = this;
        while (true) {
            CoroutineContext coroutineContext = c37578c.f99280b;
            if (coroutineContext instanceof C37578c) {
                c37578c = (C37578c) coroutineContext;
            } else {
                c37578c = null;
            }
            if (c37578c == null) {
                return i;
            }
            i++;
        }
    }

    private final Object writeReplace() {
        boolean z;
        int m17108g = m17108g();
        CoroutineContext[] coroutineContextArr = new CoroutineContext[m17108g];
        C37607l0 c37607l0 = new C37607l0();
        fold(Unit.f99208a, new C37582c(coroutineContextArr, c37607l0));
        if (c37607l0.f99325b == m17108g) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new C37579a(coroutineContextArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof C37578c) {
                C37578c c37578c = (C37578c) obj;
                if (c37578c.m17108g() != m17108g() || !c37578c.m17109d(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.mo105910invoke((Object) this.f99280b.fold(r, operation), this.f99281c);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.InterfaceC37576b<E> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        C37578c c37578c = this;
        while (true) {
            E e = (E) c37578c.f99281c.get(key);
            if (e != null) {
                return e;
            }
            CoroutineContext coroutineContext = c37578c.f99280b;
            if (coroutineContext instanceof C37578c) {
                c37578c = (C37578c) coroutineContext;
            } else {
                return (E) coroutineContext.get(key);
            }
        }
    }

    public int hashCode() {
        return this.f99280b.hashCode() + this.f99281c.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.InterfaceC37576b<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.f99281c.get(key) != null) {
            return this.f99280b;
        }
        CoroutineContext minusKey = this.f99280b.minusKey(key);
        if (minusKey == this.f99280b) {
            return this;
        }
        if (minusKey == C37586g.f99289b) {
            return this.f99281c;
        }
        return new C37578c(minusKey, this.f99281c);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return CoroutineContext.C37574a.m17114a(this, coroutineContext);
    }

    @NotNull
    public String toString() {
        return '[' + ((String) fold("", C37581b.f99284g)) + ']';
    }
}
