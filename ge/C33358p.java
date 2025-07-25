package ge;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Distinct.kt */
@Metadata
/* renamed from: ge.p */
/* loaded from: classes8.dex */
public final /* synthetic */ class C33358p {
    @NotNull

    /* renamed from: a */
    private static final Function1<Object, Object> f91026a = C33360b.f91029g;
    @NotNull

    /* renamed from: b */
    private static final Function2<Object, Object, Boolean> f91027b = C33359a.f91028g;

    /* compiled from: Distinct.kt */
    @Metadata
    /* renamed from: ge.p$a */
    /* loaded from: classes8.dex */
    static final class C33359a extends Lambda implements Function2<Object, Object, Boolean> {

        /* renamed from: g */
        public static final C33359a f91028g = new C33359a();

        C33359a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* renamed from: a */
        public final Boolean mo105910invoke(@Nullable Object obj, @Nullable Object obj2) {
            return Boolean.valueOf(Intrinsics.m17075f(obj, obj2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* renamed from: a */
    public static final <T> InterfaceC33327h<T> m24037a(@NotNull InterfaceC33327h<? extends T> interfaceC33327h) {
        if (!(interfaceC33327h instanceof StateFlow)) {
            return m24035c(interfaceC33327h, f91026a, f91027b);
        }
        return interfaceC33327h;
    }

    @NotNull
    /* renamed from: b */
    public static final <T, K> InterfaceC33327h<T> m24036b(@NotNull InterfaceC33327h<? extends T> interfaceC33327h, @NotNull Function1<? super T, ? extends K> function1) {
        return m24035c(interfaceC33327h, function1, f91027b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    private static final <T> InterfaceC33327h<T> m24035c(InterfaceC33327h<? extends T> interfaceC33327h, Function1<? super T, ? extends Object> function1, Function2<Object, Object, Boolean> function2) {
        if (interfaceC33327h instanceof Distinct) {
            Distinct distinct = (Distinct) interfaceC33327h;
            if (distinct.f90940c == function1 && distinct.f90941d == function2) {
                return interfaceC33327h;
            }
        }
        return new Distinct(interfaceC33327h, function1, function2);
    }

    /* compiled from: Distinct.kt */
    @Metadata
    /* renamed from: ge.p$b */
    /* loaded from: classes8.dex */
    static final class C33360b extends Lambda implements Function1<Object, Object> {

        /* renamed from: g */
        public static final C33360b f91029g = new C33360b();

        C33360b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable Object obj) {
            return obj;
        }
    }
}
