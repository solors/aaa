package ie;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: ie.n */
/* loaded from: classes8.dex */
public final class InlineList<E> {
    /* renamed from: b */
    public static /* synthetic */ Object m22938b(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return m22939a(obj);
    }

    @NotNull
    /* renamed from: c */
    public static final Object m22937c(Object obj, E e) {
        if (obj == null) {
            return m22939a(e);
        }
        if (obj instanceof ArrayList) {
            Intrinsics.m17073h(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ((ArrayList) obj).add(e);
            return m22939a(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e);
        return m22939a(arrayList);
    }

    @NotNull
    /* renamed from: a */
    public static <E> Object m22939a(@Nullable Object obj) {
        return obj;
    }
}
