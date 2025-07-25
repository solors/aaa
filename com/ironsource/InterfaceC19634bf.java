package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.bf */
/* loaded from: classes6.dex */
public interface InterfaceC19634bf<T> {

    @Metadata
    /* renamed from: com.ironsource.bf$a */
    /* loaded from: classes6.dex */
    public static class C19635a<ListenerType> implements InterfaceC19634bf<ListenerType> {
        @Nullable

        /* renamed from: a */
        private ListenerType f49275a;

        @Metadata
        /* renamed from: com.ironsource.bf$a$a */
        /* loaded from: classes6.dex */
        public static final class C19636a extends AbstractRunnableC21276yp {

            /* renamed from: a */
            final /* synthetic */ Runnable f49276a;

            C19636a(Runnable runnable) {
                this.f49276a = runnable;
            }

            @Override // com.ironsource.AbstractRunnableC21276yp
            /* renamed from: a */
            public void mo53791a() {
                this.f49276a.run();
            }
        }

        @Nullable
        /* renamed from: a */
        public final ListenerType m59324a() {
            return this.f49275a;
        }

        /* renamed from: b */
        public final void m59319b(@Nullable ListenerType listenertype) {
            this.f49275a = listenertype;
        }

        /* renamed from: a */
        public static /* synthetic */ void m59323a(C19635a c19635a, Runnable runnable, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeOnUIThreadIfConditionMet");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            c19635a.m59321a(runnable, z);
        }

        @Override // com.ironsource.InterfaceC19634bf
        /* renamed from: a */
        public void mo59322a(ListenerType listenertype) {
            this.f49275a = listenertype;
        }

        /* renamed from: a */
        public final void m59321a(@NotNull Runnable runnable, boolean z) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            if (z) {
                IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new C19636a(runnable), 0L, 2, null);
            }
        }

        /* renamed from: a */
        public final void m59320a(@NotNull String instanceId, @NotNull String message) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(message, "message");
            IronLog ironLog = IronLog.CALLBACK;
            ironLog.info(message + " instanceId=" + instanceId);
        }
    }

    /* renamed from: a */
    void mo59322a(T t);
}
