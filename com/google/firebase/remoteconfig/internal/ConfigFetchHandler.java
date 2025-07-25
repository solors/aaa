package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.ConfigMetadataClient;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class ConfigFetchHandler {
    public static final long DEFAULT_MINIMUM_FETCH_INTERVAL_IN_SECONDS = TimeUnit.HOURS.toSeconds(12);
    @VisibleForTesting

    /* renamed from: j */
    static final int[] f43479j = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a */
    private final FirebaseInstallationsApi f43480a;

    /* renamed from: b */
    private final Provider<AnalyticsConnector> f43481b;

    /* renamed from: c */
    private final Executor f43482c;

    /* renamed from: d */
    private final Clock f43483d;

    /* renamed from: e */
    private final Random f43484e;

    /* renamed from: f */
    private final ConfigCacheClient f43485f;

    /* renamed from: g */
    private final ConfigFetchHttpClient f43486g;

    /* renamed from: h */
    private final ConfigMetadataClient f43487h;

    /* renamed from: i */
    private final Map<String, String> f43488i;

    /* loaded from: classes4.dex */
    public static class FetchResponse {

        /* renamed from: a */
        private final Date f43489a;

        /* renamed from: b */
        private final int f43490b;

        /* renamed from: c */
        private final ConfigContainer f43491c;
        @Nullable

        /* renamed from: d */
        private final String f43492d;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes4.dex */
        public @interface Status {
            public static final int BACKEND_HAS_NO_UPDATES = 1;
            public static final int BACKEND_UPDATES_FETCHED = 0;
            public static final int LOCAL_STORAGE_USED = 2;
        }

        private FetchResponse(Date date, int i, ConfigContainer configContainer, @Nullable String str) {
            this.f43489a = date;
            this.f43490b = i;
            this.f43491c = configContainer;
            this.f43492d = str;
        }

        public static FetchResponse forBackendHasNoUpdates(Date date, ConfigContainer configContainer) {
            return new FetchResponse(date, 1, configContainer, null);
        }

        public static FetchResponse forBackendUpdatesFetched(ConfigContainer configContainer, String str) {
            return new FetchResponse(configContainer.getFetchTime(), 0, configContainer, str);
        }

        public static FetchResponse forLocalStorageUsed(Date date) {
            return new FetchResponse(date, 2, null, null);
        }

        @Nullable
        /* renamed from: a */
        String m66389a() {
            return this.f43492d;
        }

        /* renamed from: b */
        public int m66388b() {
            return this.f43490b;
        }

        public ConfigContainer getFetchedConfigs() {
            return this.f43491c;
        }
    }

    /* loaded from: classes4.dex */
    public enum FetchType {
        BASE("BASE"),
        REALTIME("REALTIME");
        

        /* renamed from: b */
        private final String f43494b;

        FetchType(String str) {
            this.f43494b = str;
        }

        /* renamed from: c */
        String m66386c() {
            return this.f43494b;
        }
    }

    public ConfigFetchHandler(FirebaseInstallationsApi firebaseInstallationsApi, Provider<AnalyticsConnector> provider, Executor executor, Clock clock, Random random, ConfigCacheClient configCacheClient, ConfigFetchHttpClient configFetchHttpClient, ConfigMetadataClient configMetadataClient, Map<String, String> map) {
        this.f43480a = firebaseInstallationsApi;
        this.f43481b = provider;
        this.f43482c = executor;
        this.f43483d = clock;
        this.f43484e = random;
        this.f43485f = configCacheClient;
        this.f43486g = configFetchHttpClient;
        this.f43487h = configMetadataClient;
        this.f43488i = map;
    }

    /* renamed from: f */
    private boolean m66409f(long j, Date date) {
        Date m66360c = this.f43487h.m66360c();
        if (m66360c.equals(ConfigMetadataClient.f43509e)) {
            return false;
        }
        return date.before(new Date(m66360c.getTime() + TimeUnit.SECONDS.toMillis(j)));
    }

    /* renamed from: g */
    private FirebaseRemoteConfigServerException m66408g(FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) throws FirebaseRemoteConfigClientException {
        String str;
        int httpStatusCode = firebaseRemoteConfigServerException.getHttpStatusCode();
        if (httpStatusCode != 401) {
            if (httpStatusCode != 403) {
                if (httpStatusCode != 429) {
                    if (httpStatusCode != 500) {
                        switch (httpStatusCode) {
                            case 502:
                            case 503:
                            case 504:
                                str = "The server is unavailable. Please try again later.";
                                break;
                            default:
                                str = "The server returned an unexpected error.";
                                break;
                        }
                    } else {
                        str = "There was an internal server error.";
                    }
                } else {
                    throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
            } else {
                str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            }
        } else {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        }
        int httpStatusCode2 = firebaseRemoteConfigServerException.getHttpStatusCode();
        return new FirebaseRemoteConfigServerException(httpStatusCode2, "Fetch failed: " + str, firebaseRemoteConfigServerException);
    }

    /* renamed from: h */
    private String m66407h(long j) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j)));
    }

    @WorkerThread
    /* renamed from: i */
    private FetchResponse m66406i(String str, String str2, Date date, Map<String, String> map) throws FirebaseRemoteConfigException {
        try {
            FetchResponse fetch = this.f43486g.fetch(this.f43486g.m66382d(), str, str2, m66400o(), this.f43487h.m66361b(), map, m66402m(), date);
            if (fetch.getFetchedConfigs() != null) {
                this.f43487h.m66354i(fetch.getFetchedConfigs().getTemplateVersionNumber());
            }
            if (fetch.m66389a() != null) {
                this.f43487h.m66355h(fetch.m66389a());
            }
            this.f43487h.m66358e();
            return fetch;
        } catch (FirebaseRemoteConfigServerException e) {
            ConfigMetadataClient.BackoffMetadata m66392w = m66392w(e.getHttpStatusCode(), date);
            if (m66393v(m66392w, e.getHttpStatusCode())) {
                throw new FirebaseRemoteConfigFetchThrottledException(m66392w.m66349a().getTime());
            }
            throw m66408g(e);
        }
    }

    /* renamed from: j */
    private Task<FetchResponse> m66405j(String str, String str2, Date date, Map<String, String> map) {
        try {
            final FetchResponse m66406i = m66406i(str, str2, date, map);
            if (m66406i.m66388b() != 0) {
                return Tasks.forResult(m66406i);
            }
            return this.f43485f.put(m66406i.getFetchedConfigs()).onSuccessTask(this.f43482c, new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.internal.i
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    Task forResult;
                    ConfigContainer configContainer = (ConfigContainer) obj;
                    forResult = Tasks.forResult(m66406i);
                    return forResult;
                }
            });
        } catch (FirebaseRemoteConfigException e) {
            return Tasks.forException(e);
        }
    }

    /* renamed from: k */
    public Task<FetchResponse> m66398q(Task<ConfigContainer> task, long j, final Map<String, String> map) {
        Task continueWithTask;
        final Date date = new Date(this.f43483d.currentTimeMillis());
        if (task.isSuccessful() && m66409f(j, date)) {
            return Tasks.forResult(FetchResponse.forLocalStorageUsed(date));
        }
        Date m66403l = m66403l(date);
        if (m66403l != null) {
            continueWithTask = Tasks.forException(new FirebaseRemoteConfigFetchThrottledException(m66407h(m66403l.getTime() - date.getTime()), m66403l.getTime()));
        } else {
            final Task<String> id2 = this.f43480a.getId();
            final Task<InstallationTokenResult> token = this.f43480a.getToken(false);
            continueWithTask = Tasks.whenAllComplete(id2, token).continueWithTask(this.f43482c, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.g
                {
                    ConfigFetchHandler.this = this;
                }

                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    Task m66396s;
                    m66396s = ConfigFetchHandler.this.m66396s(id2, token, date, map, task2);
                    return m66396s;
                }
            });
        }
        return continueWithTask.continueWithTask(this.f43482c, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.h
            {
                ConfigFetchHandler.this = this;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                Task m66395t;
                m66395t = ConfigFetchHandler.this.m66395t(date, task2);
                return m66395t;
            }
        });
    }

    @Nullable
    /* renamed from: l */
    private Date m66403l(Date date) {
        Date m66349a = this.f43487h.m66362a().m66349a();
        if (date.before(m66349a)) {
            return m66349a;
        }
        return null;
    }

    @WorkerThread
    /* renamed from: m */
    private Long m66402m() {
        AnalyticsConnector analyticsConnector = this.f43481b.get();
        if (analyticsConnector == null) {
            return null;
        }
        return (Long) analyticsConnector.getUserProperties(true).get("_fot");
    }

    /* renamed from: n */
    private long m66401n(int i) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = f43479j;
        long millis = timeUnit.toMillis(iArr[Math.min(i, iArr.length) - 1]);
        return (millis / 2) + this.f43484e.nextInt((int) millis);
    }

    @WorkerThread
    /* renamed from: o */
    private Map<String, String> m66400o() {
        HashMap hashMap = new HashMap();
        AnalyticsConnector analyticsConnector = this.f43481b.get();
        if (analyticsConnector == null) {
            return hashMap;
        }
        for (Map.Entry<String, Object> entry : analyticsConnector.getUserProperties(false).entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return hashMap;
    }

    /* renamed from: p */
    private boolean m66399p(int i) {
        if (i != 429 && i != 502 && i != 503 && i != 504) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public /* synthetic */ Task m66396s(Task task, Task task2, Date date, Map map, Task task3) throws Exception {
        if (!task.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", task2.getException()));
        }
        return m66405j((String) task.getResult(), ((InstallationTokenResult) task2.getResult()).getToken(), date, map);
    }

    /* renamed from: t */
    public /* synthetic */ Task m66395t(Date date, Task task) throws Exception {
        m66390y(task, date);
        return task;
    }

    /* renamed from: u */
    public /* synthetic */ Task m66394u(Map map, Task task) throws Exception {
        return m66398q(task, 0L, map);
    }

    /* renamed from: v */
    private boolean m66393v(ConfigMetadataClient.BackoffMetadata backoffMetadata, int i) {
        if (backoffMetadata.m66348b() > 1 || i == 429) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    private ConfigMetadataClient.BackoffMetadata m66392w(int i, Date date) {
        if (m66399p(i)) {
            m66391x(date);
        }
        return this.f43487h.m66362a();
    }

    /* renamed from: x */
    private void m66391x(Date date) {
        int m66348b = this.f43487h.m66362a().m66348b() + 1;
        this.f43487h.m66356g(m66348b, new Date(date.getTime() + m66401n(m66348b)));
    }

    /* renamed from: y */
    private void m66390y(Task<FetchResponse> task, Date date) {
        if (task.isSuccessful()) {
            this.f43487h.m66351l(date);
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            return;
        }
        if (exception instanceof FirebaseRemoteConfigFetchThrottledException) {
            this.f43487h.m66350m();
        } else {
            this.f43487h.m66352k();
        }
    }

    public Task<FetchResponse> fetch() {
        return fetch(this.f43487h.getMinimumFetchIntervalInSeconds());
    }

    public Task<FetchResponse> fetchNowWithTypeAndAttemptNumber(FetchType fetchType, int i) {
        final HashMap hashMap = new HashMap(this.f43488i);
        hashMap.put("X-Firebase-RC-Fetch-Type", fetchType.m66386c() + RemoteSettings.FORWARD_SLASH_STRING + i);
        return this.f43485f.get().continueWithTask(this.f43482c, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.f
            {
                ConfigFetchHandler.this = this;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task m66394u;
                m66394u = ConfigFetchHandler.this.m66394u(hashMap, task);
                return m66394u;
            }
        });
    }

    @VisibleForTesting
    public Provider<AnalyticsConnector> getAnalyticsConnector() {
        return this.f43481b;
    }

    public long getTemplateVersionNumber() {
        return this.f43487h.m66359d();
    }

    public Task<FetchResponse> fetch(final long j) {
        final HashMap hashMap = new HashMap(this.f43488i);
        hashMap.put("X-Firebase-RC-Fetch-Type", FetchType.BASE.m66386c() + RemoteSettings.FORWARD_SLASH_STRING + 1);
        return this.f43485f.get().continueWithTask(this.f43482c, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.e
            {
                ConfigFetchHandler.this = this;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task m66398q;
                m66398q = ConfigFetchHandler.this.m66398q(j, hashMap, task);
                return m66398q;
            }
        });
    }
}
