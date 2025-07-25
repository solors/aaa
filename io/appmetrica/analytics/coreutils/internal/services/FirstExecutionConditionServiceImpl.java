package io.appmetrica.analytics.coreutils.internal.services;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public class FirstExecutionConditionServiceImpl implements FirstExecutionConditionService {

    /* renamed from: a */
    private final ArrayList f92433a = new ArrayList();

    /* renamed from: b */
    private UtilityServiceConfiguration f92434b;

    /* renamed from: c */
    final UtilityServiceProvider f92435c;

    /* loaded from: classes9.dex */
    public static class FirstExecutionConditionChecker {

        /* renamed from: a */
        private boolean f92436a = false;

        /* renamed from: b */
        private long f92437b;

        /* renamed from: c */
        private long f92438c;

        /* renamed from: d */
        private long f92439d;

        /* renamed from: e */
        private final FirstExecutionDelayChecker f92440e;
        public final String tag;

        public FirstExecutionConditionChecker(@Nullable UtilityServiceConfiguration utilityServiceConfiguration, @NonNull FirstExecutionDelayChecker firstExecutionDelayChecker, @NonNull String str) {
            long initialConfigTime;
            this.f92440e = firstExecutionDelayChecker;
            if (utilityServiceConfiguration == null) {
                initialConfigTime = 0;
            } else {
                initialConfigTime = utilityServiceConfiguration.getInitialConfigTime();
            }
            this.f92438c = initialConfigTime;
            this.f92437b = utilityServiceConfiguration != null ? utilityServiceConfiguration.getLastUpdateConfigTime() : 0L;
            this.f92439d = Long.MAX_VALUE;
            this.tag = str;
        }

        /* renamed from: a */
        final void m22807a(long j) {
            this.f92439d = TimeUnit.SECONDS.toMillis(j);
        }

        /* renamed from: b */
        final boolean m22805b() {
            if (this.f92436a) {
                return true;
            }
            return this.f92440e.delaySinceFirstStartupWasPassed(this.f92438c, this.f92437b, this.f92439d);
        }

        /* renamed from: a */
        final void m22808a() {
            this.f92436a = true;
        }

        /* renamed from: a */
        final void m22806a(UtilityServiceConfiguration utilityServiceConfiguration) {
            this.f92438c = utilityServiceConfiguration.getInitialConfigTime();
            this.f92437b = utilityServiceConfiguration.getLastUpdateConfigTime();
        }
    }

    /* loaded from: classes9.dex */
    public static class FirstExecutionDelayChecker {
        public boolean delaySinceFirstStartupWasPassed(long j, long j2, long j3) {
            if (j2 - j >= j3) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes9.dex */
    public static class FirstExecutionHandler implements FirstExecutionDelayedTask {

        /* renamed from: a */
        private final FirstExecutionConditionChecker f92441a;

        /* renamed from: b */
        private final WaitForActivationDelayBarrier.ActivationBarrierHelper f92442b;

        /* renamed from: c */
        private final ICommonExecutor f92443c;

        /* synthetic */ FirstExecutionHandler(ICommonExecutor iCommonExecutor, WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker, int i) {
            this(iCommonExecutor, activationBarrierHelper, firstExecutionConditionChecker);
        }

        public boolean canExecute() {
            boolean m22805b = this.f92441a.m22805b();
            if (m22805b) {
                this.f92441a.m22808a();
            }
            return m22805b;
        }

        @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask
        public void setInitialDelaySeconds(long j) {
            this.f92441a.m22807a(j);
        }

        @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask
        public boolean tryExecute(long j) {
            if (this.f92441a.m22805b()) {
                this.f92442b.subscribeIfNeeded(TimeUnit.SECONDS.toMillis(j), this.f92443c);
                this.f92441a.m22808a();
                return true;
            }
            return false;
        }

        public void updateConfig(@NonNull UtilityServiceConfiguration utilityServiceConfiguration) {
            this.f92441a.m22806a(utilityServiceConfiguration);
        }

        private FirstExecutionHandler(ICommonExecutor iCommonExecutor, WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker) {
            this.f92442b = activationBarrierHelper;
            this.f92441a = firstExecutionConditionChecker;
            this.f92443c = iCommonExecutor;
        }
    }

    public FirstExecutionConditionServiceImpl(@NonNull UtilityServiceProvider utilityServiceProvider) {
        this.f92435c = utilityServiceProvider;
    }

    /* renamed from: a */
    final synchronized FirstExecutionHandler m22809a(ICommonExecutor iCommonExecutor, WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker) {
        FirstExecutionHandler firstExecutionHandler;
        firstExecutionHandler = new FirstExecutionHandler(iCommonExecutor, activationBarrierHelper, firstExecutionConditionChecker, 0);
        this.f92433a.add(firstExecutionHandler);
        return firstExecutionHandler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService
    @NonNull
    public synchronized FirstExecutionDelayedTask createDelayedTask(@NonNull String str, @NonNull ICommonExecutor iCommonExecutor, @NonNull Runnable runnable) {
        return m22809a(iCommonExecutor, new WaitForActivationDelayBarrier.ActivationBarrierHelper(runnable, this.f92435c.getActivationBarrier()), new FirstExecutionConditionChecker(this.f92434b, new FirstExecutionDelayChecker(), str));
    }

    public void updateConfig(@NonNull UtilityServiceConfiguration utilityServiceConfiguration) {
        ArrayList arrayList;
        synchronized (this) {
            this.f92434b = utilityServiceConfiguration;
            arrayList = new ArrayList(this.f92433a);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((FirstExecutionHandler) it.next()).updateConfig(utilityServiceConfiguration);
        }
    }
}
