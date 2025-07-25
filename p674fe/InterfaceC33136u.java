package p674fe;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Channel.kt */
@Metadata
/* renamed from: fe.u */
/* loaded from: classes7.dex */
public interface InterfaceC33136u<E> {

    /* compiled from: Channel.kt */
    @Metadata
    /* renamed from: fe.u$a */
    /* loaded from: classes7.dex */
    public static final class C33137a {
        /* renamed from: a */
        public static /* synthetic */ boolean m24639a(InterfaceC33136u interfaceC33136u, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                return interfaceC33136u.mo24643d(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }
    }

    @Nullable
    /* renamed from: F */
    Object mo24644F(E e, @NotNull Continuation<? super Unit> continuation);

    /* renamed from: d */
    boolean mo24643d(@Nullable Throwable th);

    /* renamed from: o */
    void mo24642o(@NotNull Function1<? super Throwable, Unit> function1);

    @NotNull
    /* renamed from: p */
    Object mo24641p(E e);

    /* renamed from: u */
    boolean mo24640u();
}
