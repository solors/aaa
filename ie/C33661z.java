package ie;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C37774m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38497f;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: E
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: OnUndeliveredElement.kt */
@Metadata
/* renamed from: ie.z */
/* loaded from: classes8.dex */
public final class C33661z {

    /* compiled from: OnUndeliveredElement.kt */
    @Metadata
    /* renamed from: ie.z$a */
    /* loaded from: classes8.dex */
    static final class C33662a extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        final /* synthetic */ Function1<E, Unit> f92154g;

        /* renamed from: h */
        final /* synthetic */ E f92155h;

        /* renamed from: i */
        final /* synthetic */ CoroutineContext f92156i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C33662a(Function1<? super E, Unit> function1, E e, CoroutineContext coroutineContext) {
            super(1);
            this.f92154g = function1;
            this.f92155h = e;
            this.f92156i = coroutineContext;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.f99208a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Throwable th) {
            C33661z.m22868b(this.f92154g, this.f92155h, this.f92156i);
        }
    }

    @NotNull
    /* renamed from: a */
    public static final <E> Function1<Throwable, Unit> m22869a(@NotNull Function1<? super E, Unit> function1, E e, @NotNull CoroutineContext coroutineContext) {
        return new C33662a(function1, e, coroutineContext);
    }

    /* renamed from: b */
    public static final <E> void m22868b(@NotNull Function1<? super E, Unit> function1, E e, @NotNull CoroutineContext coroutineContext) {
        OnUndeliveredElement m22867c = m22867c(function1, e, null);
        if (m22867c != null) {
            C37774m0.m16176a(coroutineContext, m22867c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* renamed from: c */
    public static final <E> OnUndeliveredElement m22867c(@NotNull Function1<? super E, Unit> function1, E e, @Nullable OnUndeliveredElement onUndeliveredElement) {
        try {
            function1.invoke(e);
        } catch (Throwable th) {
            if (onUndeliveredElement != null && onUndeliveredElement.getCause() != th) {
                C38497f.m14566a(onUndeliveredElement, th);
            } else {
                return new OnUndeliveredElement("Exception in undelivered element handler for " + e, th);
            }
        }
        return onUndeliveredElement;
    }

    /* renamed from: d */
    public static /* synthetic */ OnUndeliveredElement m22866d(Function1 function1, Object obj, OnUndeliveredElement onUndeliveredElement, int i, Object obj2) {
        if ((i & 2) != 0) {
            onUndeliveredElement = null;
        }
        return m22867c(function1, obj, onUndeliveredElement);
    }
}
