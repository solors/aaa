package io.appmetrica.analytics.billingv6.internal;

import android.content.Context;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy;
import io.appmetrica.analytics.billingv6.impl.C33694e;
import io.appmetrica.analytics.billingv6.impl.C33710u;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes9.dex */
public final class BillingLibraryMonitor implements BillingMonitor {

    /* renamed from: a */
    private final Context f92329a;

    /* renamed from: b */
    private final Executor f92330b;

    /* renamed from: c */
    private final Executor f92331c;

    /* renamed from: d */
    private final BillingInfoSender f92332d;

    /* renamed from: e */
    private final BillingInfoManager f92333e;

    /* renamed from: f */
    private final UpdatePolicy f92334f;

    /* renamed from: g */
    private BillingConfig f92335g;

    public BillingLibraryMonitor(@NotNull Context context, @NotNull Executor executor, @NotNull Executor executor2, @NotNull BillingInfoStorage billingInfoStorage, @NotNull BillingInfoSender billingInfoSender, @NotNull BillingInfoManager billingInfoManager, @NotNull UpdatePolicy updatePolicy) {
        this.f92329a = context;
        this.f92330b = executor;
        this.f92331c = executor2;
        this.f92332d = billingInfoSender;
        this.f92333e = billingInfoManager;
        this.f92334f = updatePolicy;
    }

    public static final /* synthetic */ BillingInfoManager access$getBillingInfoManager$p(BillingLibraryMonitor billingLibraryMonitor) {
        return billingLibraryMonitor.f92333e;
    }

    public static final /* synthetic */ BillingInfoSender access$getBillingInfoSender$p(BillingLibraryMonitor billingLibraryMonitor) {
        return billingLibraryMonitor.f92332d;
    }

    public static final /* synthetic */ Executor access$getUiExecutor$p(BillingLibraryMonitor billingLibraryMonitor) {
        return billingLibraryMonitor.f92331c;
    }

    public static final /* synthetic */ UpdatePolicy access$getUpdatePolicy$p(BillingLibraryMonitor billingLibraryMonitor) {
        return billingLibraryMonitor.f92334f;
    }

    public static final /* synthetic */ Executor access$getWorkerExecutor$p(BillingLibraryMonitor billingLibraryMonitor) {
        return billingLibraryMonitor.f92330b;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.config.BillingConfigChangedListener
    public synchronized void onBillingConfigChanged(@Nullable BillingConfig billingConfig) {
        if (Intrinsics.m17075f(this.f92335g, billingConfig)) {
            return;
        }
        this.f92335g = billingConfig;
        if (billingConfig != null) {
            this.f92331c.execute(new BillingLibraryMonitor$updateBilling$1(this, billingConfig));
        }
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor
    @WorkerThread
    public void onSessionResumed() {
        BillingConfig billingConfig = this.f92335g;
        if (billingConfig != null) {
            this.f92331c.execute(new BillingLibraryMonitor$updateBilling$1(this, billingConfig));
        }
    }

    public /* synthetic */ BillingLibraryMonitor(Context context, Executor executor, Executor executor2, BillingInfoStorage billingInfoStorage, BillingInfoSender billingInfoSender, BillingInfoManager billingInfoManager, UpdatePolicy updatePolicy, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, executor, executor2, billingInfoStorage, billingInfoSender, (i & 32) != 0 ? new C33694e(billingInfoStorage) : billingInfoManager, (i & 64) != 0 ? new C33710u(null, 1, null) : updatePolicy);
    }
}
