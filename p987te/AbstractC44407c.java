package p987te;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p821oe.InterfaceC39165j;

/* compiled from: SerializersModule.kt */
@Metadata
/* renamed from: te.c */
/* loaded from: classes8.dex */
public abstract class AbstractC44407c {
    private AbstractC44407c() {
    }

    public /* synthetic */ AbstractC44407c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static /* synthetic */ KSerializer m3103c(AbstractC44407c abstractC44407c, KClass kClass, List list, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                list = C37563v.m17166m();
            }
            return abstractC44407c.mo3104b(kClass, list);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
    }

    /* renamed from: a */
    public abstract void mo3105a(@NotNull SerializersModuleCollector serializersModuleCollector);

    @Nullable
    /* renamed from: b */
    public abstract <T> KSerializer<T> mo3104b(@NotNull KClass<T> kClass, @NotNull List<? extends KSerializer<?>> list);

    @Nullable
    /* renamed from: d */
    public abstract <T> p821oe.KSerializer<T> mo3102d(@NotNull KClass<? super T> kClass, @Nullable String str);

    @Nullable
    /* renamed from: e */
    public abstract <T> InterfaceC39165j<T> mo3101e(@NotNull KClass<? super T> kClass, @NotNull T t);
}
