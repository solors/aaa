package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.p724io.IExecutionPolicy;
import io.appmetrica.analytics.networktasks.impl.AbstractC35124e;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes9.dex */
public class NetworkTask {

    /* renamed from: a */
    private int f95888a = 1;

    /* renamed from: b */
    private final Executor f95889b;

    /* renamed from: c */
    private final IExecutionPolicy f95890c;

    /* renamed from: d */
    private final ExponentialBackoffPolicy f95891d;

    /* renamed from: e */
    private final UnderlyingNetworkTask f95892e;

    /* renamed from: f */
    private final List f95893f;

    /* renamed from: g */
    private final String f95894g;

    /* loaded from: classes9.dex */
    public enum Method {
        GET,
        POST
    }

    /* loaded from: classes9.dex */
    public interface ShouldTryNextHostCondition {
        boolean shouldTryNextHost(int i);
    }

    public NetworkTask(@NonNull Executor executor, @NonNull IExecutionPolicy iExecutionPolicy, @NonNull ExponentialBackoffPolicy exponentialBackoffPolicy, @NonNull UnderlyingNetworkTask underlyingNetworkTask, @NonNull List<ShouldTryNextHostCondition> list, @NonNull String str) {
        this.f95889b = executor;
        this.f95890c = iExecutionPolicy;
        this.f95891d = exponentialBackoffPolicy;
        this.f95892e = underlyingNetworkTask;
        this.f95893f = list;
        this.f95894g = str;
    }

    /* renamed from: a */
    private synchronized boolean m20656a(int i) {
        if (m20655a(i)) {
            this.f95888a = i;
            return true;
        }
        return false;
    }

    @NonNull
    public String description() {
        return this.f95892e.description();
    }

    @NonNull
    public IExecutionPolicy getConnectionExecutionPolicy() {
        return this.f95890c;
    }

    @NonNull
    public Executor getExecutor() {
        return this.f95889b;
    }

    @NonNull
    public ExponentialBackoffPolicy getExponentialBackoffPolicy() {
        return this.f95891d;
    }

    @NonNull
    public RequestDataHolder getRequestDataHolder() {
        return this.f95892e.getRequestDataHolder();
    }

    @NonNull
    public ResponseDataHolder getResponseDataHolder() {
        return this.f95892e.getResponseDataHolder();
    }

    @Nullable
    public RetryPolicyConfig getRetryPolicyConfig() {
        return this.f95892e.getRetryPolicyConfig();
    }

    @Nullable
    public SSLSocketFactory getSslSocketFactory() {
        return this.f95892e.getSslSocketFactory();
    }

    @NonNull
    public UnderlyingNetworkTask getUnderlyingTask() {
        return this.f95892e;
    }

    @Nullable
    public String getUrl() {
        return this.f95892e.getFullUrlFormer().getUrl();
    }

    @NonNull
    public String getUserAgent() {
        return this.f95894g;
    }

    public boolean onCreateNetworkTask() {
        if (m20656a(3)) {
            return this.f95892e.onCreateTask();
        }
        return false;
    }

    public boolean onPerformRequest() {
        boolean m20656a = m20656a(4);
        if (m20656a) {
            this.f95892e.getFullUrlFormer().incrementAttemptNumber();
            this.f95892e.getFullUrlFormer().buildAndSetFullHostUrl();
            this.f95892e.onPerformRequest();
        }
        return m20656a;
    }

    public boolean onRequestComplete() {
        boolean z;
        boolean z2;
        synchronized (this) {
            z = false;
            if (m20655a(5, 6)) {
                boolean onRequestComplete = this.f95892e.onRequestComplete();
                if (onRequestComplete) {
                    this.f95888a = 5;
                } else {
                    this.f95888a = 6;
                }
                z2 = onRequestComplete;
                z = true;
            } else {
                z2 = false;
            }
        }
        if (z) {
            this.f95892e.onPostRequestComplete(z2);
        }
        return z2;
    }

    public void onRequestError(@Nullable Throwable th) {
        if (m20656a(6)) {
            this.f95892e.onRequestError(th);
        }
    }

    public void onShouldNotExecute() {
        if (m20656a(7)) {
            this.f95892e.onShouldNotExecute();
        }
    }

    public boolean onTaskAdded() {
        boolean m20656a = m20656a(2);
        if (m20656a) {
            this.f95892e.onTaskAdded();
        }
        return m20656a;
    }

    public void onTaskFinished() {
        int i;
        boolean m20656a;
        synchronized (this) {
            i = this.f95888a;
            m20656a = m20656a(8);
        }
        if (m20656a) {
            this.f95892e.onTaskFinished();
            if (i == 5) {
                this.f95892e.onSuccessfulTaskFinished();
            } else if (i == 6 || i == 7) {
                this.f95892e.onUnsuccessfulTaskFinished();
            }
        }
    }

    public void onTaskRemoved() {
        if (m20656a(9)) {
            this.f95892e.onTaskRemoved();
        }
    }

    public synchronized boolean shouldTryNextHost() {
        boolean z;
        boolean z2;
        boolean hasMoreHosts = this.f95892e.getFullUrlFormer().hasMoreHosts();
        int responseCode = this.f95892e.getResponseDataHolder().getResponseCode();
        Iterator it = this.f95893f.iterator();
        while (true) {
            z = false;
            if (it.hasNext()) {
                if (!((ShouldTryNextHostCondition) it.next()).shouldTryNextHost(responseCode)) {
                    z2 = false;
                    break;
                }
            } else {
                z2 = true;
                break;
            }
        }
        int i = this.f95888a;
        if (i != 9 && i != 8 && hasMoreHosts && z2) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    private synchronized boolean m20655a(int... iArr) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        bool = Boolean.TRUE;
        int i = this.f95888a;
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                boolean z = true;
                switch (AbstractC35124e.m20658a(iArr[i2])) {
                    case 0:
                        bool3 = null;
                        break;
                    case 1:
                        if (i != 1) {
                            z = false;
                        }
                        bool3 = Boolean.valueOf(z);
                        break;
                    case 2:
                    case 6:
                        if (i != 2) {
                            if (i == 9) {
                                bool3 = Boolean.FALSE;
                                break;
                            }
                            bool3 = null;
                            break;
                        } else {
                            bool3 = Boolean.TRUE;
                            break;
                        }
                    case 3:
                        if (i != 3 && i != 5 && i != 6) {
                            if (i == 9) {
                                bool3 = Boolean.FALSE;
                                break;
                            }
                            bool3 = null;
                            break;
                        }
                        bool3 = Boolean.TRUE;
                    case 4:
                    case 5:
                        if (i != 4) {
                            if (i == 9) {
                                bool3 = Boolean.FALSE;
                                break;
                            }
                            bool3 = null;
                            break;
                        } else {
                            bool3 = Boolean.TRUE;
                            break;
                        }
                    case 7:
                        if (i != 5 && i != 6 && i != 7 && i != 2 && i != 3 && i != 4) {
                            if (i == 9) {
                                bool3 = Boolean.FALSE;
                                break;
                            }
                            bool3 = null;
                            break;
                        }
                        bool3 = Boolean.TRUE;
                    case 8:
                        if (i != 1) {
                            if (i == 9) {
                                z = false;
                            }
                            bool3 = Boolean.valueOf(z);
                            break;
                        } else {
                            bool3 = null;
                            break;
                        }
                    default:
                        bool3 = Boolean.FALSE;
                        break;
                }
                if (Boolean.TRUE.equals(bool3)) {
                    i2++;
                } else {
                    bool = bool3;
                }
            }
        }
        bool2 = Boolean.TRUE;
        bool2.equals(bool);
        return bool2.equals(bool);
    }
}
