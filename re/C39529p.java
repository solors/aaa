package re;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1062yd.JvmClassMapping;

/* compiled from: Caching.kt */
@Metadata
/* renamed from: re.p */
/* loaded from: classes8.dex */
final class C39529p<T> implements InterfaceC39564z1<T> {
    @NotNull

    /* renamed from: a */
    private final Function1<KClass<?>, KSerializer<T>> f103895a;
    @NotNull

    /* renamed from: b */
    private final C39537r<C39512k<T>> f103896b;

    /* compiled from: Caching.kt */
    @Metadata
    /* renamed from: re.p$a */
    /* loaded from: classes8.dex */
    public static final class C39530a extends Lambda implements Functions<T> {

        /* renamed from: h */
        final /* synthetic */ KClass f103898h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39530a(KClass kClass) {
            super(0);
            this.f103898h = kClass;
        }

        @Override // kotlin.jvm.functions.Functions
        public final T invoke() {
            return (T) new C39512k(C39529p.this.m12348b().invoke(this.f103898h));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C39529p(@NotNull Function1<? super KClass<?>, ? extends KSerializer<T>> compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f103895a = compute;
        this.f103896b = new C39537r<>();
    }

    @Override // re.InterfaceC39564z1
    @Nullable
    /* renamed from: a */
    public KSerializer<T> mo12257a(@NotNull KClass<Object> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.f103896b.get(JvmClassMapping.m913a(key));
        Intrinsics.checkNotNullExpressionValue(obj, "get(key)");
        Caching caching = (Caching) obj;
        T t = caching.f103812a.get();
        if (t == null) {
            t = (T) caching.m12499a(new C39530a(key));
        }
        return ((C39512k) t).f103871a;
    }

    @NotNull
    /* renamed from: b */
    public final Function1<KClass<?>, KSerializer<T>> m12348b() {
        return this.f103895a;
    }
}
