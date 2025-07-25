package me;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: me.a */
/* loaded from: classes8.dex */
public interface Mutex {

    /* compiled from: Mutex.kt */
    @Metadata
    /* renamed from: me.a$a */
    /* loaded from: classes8.dex */
    public static final class C38282a {
        /* renamed from: a */
        public static /* synthetic */ Object m15183a(Mutex mutex, Object obj, Continuation continuation, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 1) != 0) {
                    obj = null;
                }
                return mutex.mo15178d(obj, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
        }

        /* renamed from: b */
        public static /* synthetic */ boolean m15182b(Mutex mutex, Object obj, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 1) != 0) {
                    obj = null;
                }
                return mutex.mo15180a(obj);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
        }

        /* renamed from: c */
        public static /* synthetic */ void m15181c(Mutex mutex, Object obj, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 1) != 0) {
                    obj = null;
                }
                mutex.mo15177e(obj);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
        }
    }

    /* renamed from: a */
    boolean mo15180a(@Nullable Object obj);

    /* renamed from: b */
    boolean mo15179b();

    @Nullable
    /* renamed from: d */
    Object mo15178d(@Nullable Object obj, @NotNull Continuation<? super Unit> continuation);

    /* renamed from: e */
    void mo15177e(@Nullable Object obj);
}
