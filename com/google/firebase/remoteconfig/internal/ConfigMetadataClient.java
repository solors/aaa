package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import java.util.Date;

/* loaded from: classes4.dex */
public class ConfigMetadataClient {
    @VisibleForTesting
    public static final long LAST_FETCH_TIME_IN_MILLIS_NO_FETCH_YET = -1;

    /* renamed from: e */
    static final Date f43509e = new Date(-1);
    @VisibleForTesting

    /* renamed from: f */
    static final Date f43510f = new Date(-1);

    /* renamed from: a */
    private final SharedPreferences f43511a;

    /* renamed from: b */
    private final Object f43512b = new Object();

    /* renamed from: c */
    private final Object f43513c = new Object();

    /* renamed from: d */
    private final Object f43514d = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class BackoffMetadata {

        /* renamed from: a */
        private int f43515a;

        /* renamed from: b */
        private Date f43516b;

        BackoffMetadata(int i, Date date) {
            this.f43515a = i;
            this.f43516b = date;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public Date m66349a() {
            return this.f43516b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public int m66348b() {
            return this.f43515a;
        }
    }

    @VisibleForTesting
    /* loaded from: classes4.dex */
    public static class RealtimeBackoffMetadata {

        /* renamed from: a */
        private int f43517a;

        /* renamed from: b */
        private Date f43518b;

        @VisibleForTesting
        public RealtimeBackoffMetadata(int i, Date date) {
            this.f43517a = i;
            this.f43518b = date;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public Date m66347a() {
            return this.f43518b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public int m66346b() {
            return this.f43517a;
        }
    }

    public ConfigMetadataClient(SharedPreferences sharedPreferences) {
        this.f43511a = sharedPreferences;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public BackoffMetadata m66362a() {
        BackoffMetadata backoffMetadata;
        synchronized (this.f43513c) {
            backoffMetadata = new BackoffMetadata(this.f43511a.getInt("num_failed_fetches", 0), new Date(this.f43511a.getLong("backoff_end_time_in_millis", -1L)));
        }
        return backoffMetadata;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    /* renamed from: b */
    public String m66361b() {
        return this.f43511a.getString("last_fetch_etag", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Date m66360c() {
        return new Date(this.f43511a.getLong("last_fetch_time_in_millis", -1L));
    }

    @WorkerThread
    public void clear() {
        synchronized (this.f43512b) {
            this.f43511a.edit().clear().commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public long m66359d() {
        return this.f43511a.getLong("last_template_version", 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m66358e() {
        m66356g(0, f43510f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m66357f() {
        m66353j(0, f43510f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m66356g(int i, Date date) {
        synchronized (this.f43513c) {
            this.f43511a.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public long getFetchTimeoutInSeconds() {
        return this.f43511a.getLong("fetch_timeout_in_seconds", 60L);
    }

    public FirebaseRemoteConfigInfo getInfo() {
        FirebaseRemoteConfigInfoImpl build;
        synchronized (this.f43512b) {
            long j = this.f43511a.getLong("last_fetch_time_in_millis", -1L);
            int i = this.f43511a.getInt("last_fetch_status", 0);
            build = FirebaseRemoteConfigInfoImpl.m66318a().m66316b(i).withLastSuccessfulFetchTimeInMillis(j).m66317a(new FirebaseRemoteConfigSettings.Builder().setFetchTimeoutInSeconds(this.f43511a.getLong("fetch_timeout_in_seconds", 60L)).setMinimumFetchIntervalInSeconds(this.f43511a.getLong("minimum_fetch_interval_in_seconds", ConfigFetchHandler.DEFAULT_MINIMUM_FETCH_INTERVAL_IN_SECONDS)).build()).build();
        }
        return build;
    }

    public long getMinimumFetchIntervalInSeconds() {
        return this.f43511a.getLong("minimum_fetch_interval_in_seconds", ConfigFetchHandler.DEFAULT_MINIMUM_FETCH_INTERVAL_IN_SECONDS);
    }

    @VisibleForTesting
    public RealtimeBackoffMetadata getRealtimeBackoffMetadata() {
        RealtimeBackoffMetadata realtimeBackoffMetadata;
        synchronized (this.f43514d) {
            realtimeBackoffMetadata = new RealtimeBackoffMetadata(this.f43511a.getInt("num_failed_realtime_streams", 0), new Date(this.f43511a.getLong("realtime_backoff_end_time_in_millis", -1L)));
        }
        return realtimeBackoffMetadata;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m66355h(String str) {
        synchronized (this.f43512b) {
            this.f43511a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m66354i(long j) {
        synchronized (this.f43512b) {
            this.f43511a.edit().putLong("last_template_version", j).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m66353j(int i, Date date) {
        synchronized (this.f43514d) {
            this.f43511a.edit().putInt("num_failed_realtime_streams", i).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m66352k() {
        synchronized (this.f43512b) {
            this.f43511a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m66351l(Date date) {
        synchronized (this.f43512b) {
            this.f43511a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m66350m() {
        synchronized (this.f43512b) {
            this.f43511a.edit().putInt("last_fetch_status", 2).apply();
        }
    }

    @WorkerThread
    public void setConfigSettings(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        synchronized (this.f43512b) {
            this.f43511a.edit().putLong("fetch_timeout_in_seconds", firebaseRemoteConfigSettings.getFetchTimeoutInSeconds()).putLong("minimum_fetch_interval_in_seconds", firebaseRemoteConfigSettings.getMinimumFetchIntervalInSeconds()).commit();
        }
    }

    public void setConfigSettingsWithoutWaitingOnDiskWrite(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        synchronized (this.f43512b) {
            this.f43511a.edit().putLong("fetch_timeout_in_seconds", firebaseRemoteConfigSettings.getFetchTimeoutInSeconds()).putLong("minimum_fetch_interval_in_seconds", firebaseRemoteConfigSettings.getMinimumFetchIntervalInSeconds()).apply();
        }
    }
}
