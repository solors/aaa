package va;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: va.u */
/* loaded from: classes8.dex */
public interface TypeHelpers<T> {
    @NotNull

    /* renamed from: a */
    public static final C44543a f116923a = C44543a.f116924a;

    /* compiled from: TypeHelpers.kt */
    @Metadata
    /* renamed from: va.u$a */
    /* loaded from: classes8.dex */
    public static final class C44543a {

        /* renamed from: a */
        static final /* synthetic */ C44543a f116924a = new C44543a();

        /* compiled from: TypeHelpers.kt */
        @Metadata
        /* renamed from: va.u$a$a */
        /* loaded from: classes8.dex */
        public static final class C44544a implements TypeHelpers<T> {
            @NotNull

            /* renamed from: b */
            private final T f116925b;

            /* renamed from: c */
            final /* synthetic */ Function1<Object, Boolean> f116926c;

            C44544a(T t, Function1<Object, Boolean> function1) {
                this.f116926c = function1;
                this.f116925b = t;
            }

            @Override // va.TypeHelpers
            @NotNull
            /* renamed from: a */
            public T mo2520a() {
                return this.f116925b;
            }

            @Override // va.TypeHelpers
            /* renamed from: b */
            public boolean mo2519b(@NotNull Object value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return this.f116926c.invoke(value).booleanValue();
            }
        }

        private C44543a() {
        }

        @NotNull
        /* renamed from: a */
        public final <T> TypeHelpers<T> m2527a(@NotNull T t, @NotNull Function1<Object, Boolean> validator) {
            Intrinsics.checkNotNullParameter(t, "default");
            Intrinsics.checkNotNullParameter(validator, "validator");
            return new C44544a(t, validator);
        }
    }

    /* renamed from: a */
    T mo2520a();

    /* renamed from: b */
    boolean mo2519b(@NotNull Object obj);
}
