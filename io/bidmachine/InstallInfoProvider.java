package io.bidmachine;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import io.bidmachine.InstallInfoProvider;
import io.bidmachine.core.Logger;
import io.bidmachine.internal.utils.LogSafeRunnable;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: io.bidmachine.c4 */
/* loaded from: classes9.dex */
public class InstallInfoProvider {
    @NonNull
    private static final AtomicLong INSTALL_TIME_MS = new AtomicLong(0);

    InstallInfoProvider() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m20098a(Context context) {
        lambda$initialize$0(context);
    }

    public static long getInstallTimeMs() {
        return INSTALL_TIME_MS.get();
    }

    @WorkerThread
    public static void initialize(@NonNull final Context context) {
        new Thread(new LogSafeRunnable() { // from class: io.bidmachine.b4
            @Override // io.bidmachine.internal.utils.LogSafeRunnable, io.bidmachine.utils.SafeRunnable
            public final void onRun() {
                InstallInfoProvider.m20098a(context);
            }
        }).start();
    }

    public static /* synthetic */ void lambda$initialize$0(Context context) throws Throwable {
        new C35673b(context).retrieve();
    }

    /* compiled from: InstallInfoProvider.java */
    /* renamed from: io.bidmachine.c4$b */
    /* loaded from: classes9.dex */
    public static class C35673b {
        @NonNull
        private final InstallReferrerClient client;

        C35673b(@NonNull Context context) {
            this.client = InstallReferrerClient.newBuilder(context).build();
        }

        public long getInstallTimeMs(@NonNull InstallReferrerClient installReferrerClient) {
            try {
                long installBeginTimestampSeconds = installReferrerClient.getInstallReferrer().getInstallBeginTimestampSeconds();
                if (installBeginTimestampSeconds != 0) {
                    return installBeginTimestampSeconds * 1000;
                }
            } catch (Exception e) {
                Logger.m20086w(e);
            }
            return 0L;
        }

        void retrieve() {
            try {
                this.client.startConnection(new C35674a());
            } catch (Throwable th) {
                Logger.m20086w(th);
            }
        }

        /* compiled from: InstallInfoProvider.java */
        /* renamed from: io.bidmachine.c4$b$a */
        /* loaded from: classes9.dex */
        public class C35674a implements InstallReferrerStateListener {
            private C35674a() {
                C35673b.this = r1;
            }

            /* renamed from: a */
            public static /* synthetic */ void m20097a(C35674a c35674a, int i) {
                c35674a.lambda$onInstallReferrerSetupFinished$0(i);
            }

            /* renamed from: onInstallReferrerSetupFinishedSync */
            public void lambda$onInstallReferrerSetupFinished$0(int i) {
                if (i == 0) {
                    AtomicLong atomicLong = InstallInfoProvider.INSTALL_TIME_MS;
                    C35673b c35673b = C35673b.this;
                    atomicLong.set(c35673b.getInstallTimeMs(c35673b.client));
                }
                C35673b.this.client.endConnection();
            }

            @Override // com.android.installreferrer.api.InstallReferrerStateListener
            public void onInstallReferrerSetupFinished(final int i) {
                new Thread(new LogSafeRunnable() { // from class: io.bidmachine.d4
                    @Override // io.bidmachine.internal.utils.LogSafeRunnable, io.bidmachine.utils.SafeRunnable
                    public final void onRun() {
                        InstallInfoProvider.C35673b.C35674a.m20097a(InstallInfoProvider.C35673b.C35674a.this, i);
                    }
                }).start();
            }

            @Override // com.android.installreferrer.api.InstallReferrerStateListener
            public void onInstallReferrerServiceDisconnected() {
            }
        }
    }
}
