package com.google.firebase.sessions.settings;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import ge.C33329j;
import ge.InterfaceC33327h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37596l;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C37739j;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import sd.C42688d;

/* compiled from: SettingsCache.kt */
@Metadata
/* loaded from: classes4.dex */
public final class SettingsCache {
    @Deprecated
    @NotNull
    public static final String TAG = "SettingsCache";
    @NotNull

    /* renamed from: c */
    private static final Companion f43863c = new Companion(null);
    @NotNull

    /* renamed from: d */
    private static final Preferences.Key<Boolean> f43864d = PreferencesKeys.booleanKey(LocalOverrideSettings.SESSIONS_ENABLED);
    @NotNull

    /* renamed from: e */
    private static final Preferences.Key<Double> f43865e = PreferencesKeys.doubleKey(LocalOverrideSettings.SAMPLING_RATE);
    @NotNull

    /* renamed from: f */
    private static final Preferences.Key<Integer> f43866f = PreferencesKeys.intKey("firebase_sessions_restart_timeout");
    @NotNull

    /* renamed from: g */
    private static final Preferences.Key<Integer> f43867g = PreferencesKeys.intKey("firebase_sessions_cache_duration");
    @NotNull

    /* renamed from: h */
    private static final Preferences.Key<Long> f43868h = PreferencesKeys.longKey("firebase_sessions_cache_updated_time");
    @NotNull

    /* renamed from: a */
    private final DataStore<Preferences> f43869a;

    /* renamed from: b */
    private SessionConfigs f43870b;

    /* compiled from: SettingsCache.kt */
    @DebugMetadata(m17095c = "com.google.firebase.sessions.settings.SettingsCache$1", m17094f = "SettingsCache.kt", m17093l = {46}, m17092m = "invokeSuspend")
    @Metadata
    /* renamed from: com.google.firebase.sessions.settings.SettingsCache$1 */
    /* loaded from: classes4.dex */
    static final class C175321 extends AbstractC37596l implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: l */
        Object f43871l;

        /* renamed from: m */
        int f43872m;

        C175321(Continuation<? super C175321> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C175321(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object m6959e;
            SettingsCache settingsCache;
            m6959e = C42688d.m6959e();
            int i = this.f43872m;
            if (i != 0) {
                if (i == 1) {
                    settingsCache = (SettingsCache) this.f43871l;
                    C38508r.m14539b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C38508r.m14539b(obj);
                SettingsCache settingsCache2 = SettingsCache.this;
                InterfaceC33327h data = settingsCache2.f43869a.getData();
                this.f43871l = settingsCache2;
                this.f43872m = 1;
                Object m24078w = C33329j.m24078w(data, this);
                if (m24078w == m6959e) {
                    return m6959e;
                }
                settingsCache = settingsCache2;
                obj = m24078w;
            }
            settingsCache.m66253b(((Preferences) obj).toPreferences());
            return Unit.f99208a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object mo105910invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C175321) create(coroutineScope, continuation)).invokeSuspend(Unit.f99208a);
        }
    }

    /* compiled from: SettingsCache.kt */
    @Metadata
    /* loaded from: classes4.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Preferences.Key<Integer> getCACHE_DURATION_SECONDS() {
            return SettingsCache.f43867g;
        }

        @NotNull
        public final Preferences.Key<Long> getCACHE_UPDATED_TIME() {
            return SettingsCache.f43868h;
        }

        @NotNull
        public final Preferences.Key<Integer> getRESTART_TIMEOUT_SECONDS() {
            return SettingsCache.f43866f;
        }

        @NotNull
        public final Preferences.Key<Double> getSAMPLING_RATE() {
            return SettingsCache.f43865e;
        }

        @NotNull
        public final Preferences.Key<Boolean> getSESSIONS_ENABLED() {
            return SettingsCache.f43864d;
        }
    }

    public SettingsCache(@NotNull DataStore<Preferences> dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.f43869a = dataStore;
        C37739j.m16312b(null, new C175321(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
        android.util.Log.w(com.google.firebase.sessions.settings.SettingsCache.TAG, "Failed to update cache config value: " + r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> java.lang.Object m66254a(androidx.datastore.preferences.core.Preferences.Key<T> r6, T r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1
            if (r0 == 0) goto L13
            r0 = r8
            com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1 r0 = (com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1) r0
            int r1 = r0.f43882n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f43882n = r1
            goto L18
        L13:
            com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1 r0 = new com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f43880l
            java.lang.Object r1 = sd.C42683b.m6964e()
            int r2 = r0.f43882n
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            p804nd.C38508r.m14539b(r8)     // Catch: java.io.IOException -> L29
            goto L5d
        L29:
            r6 = move-exception
            goto L47
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            p804nd.C38508r.m14539b(r8)
            androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> r8 = r5.f43869a     // Catch: java.io.IOException -> L29
            com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2 r2 = new com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2     // Catch: java.io.IOException -> L29
            r4 = 0
            r2.<init>(r7, r6, r5, r4)     // Catch: java.io.IOException -> L29
            r0.f43882n = r3     // Catch: java.io.IOException -> L29
            java.lang.Object r6 = androidx.datastore.preferences.core.PreferencesKt.edit(r8, r2, r0)     // Catch: java.io.IOException -> L29
            if (r6 != r1) goto L5d
            return r1
        L47:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Failed to update cache config value: "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "SettingsCache"
            android.util.Log.w(r7, r6)
        L5d:
            kotlin.Unit r6 = kotlin.Unit.f99208a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.SettingsCache.m66254a(androidx.datastore.preferences.core.Preferences$Key, java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final void m66253b(Preferences preferences) {
        this.f43870b = new SessionConfigs((Boolean) preferences.get(f43864d), (Double) preferences.get(f43865e), (Integer) preferences.get(f43866f), (Integer) preferences.get(f43867g), (Long) preferences.get(f43868h));
    }

    public final boolean hasCacheExpired$com_google_firebase_firebase_sessions() {
        SessionConfigs sessionConfigs = this.f43870b;
        SessionConfigs sessionConfigs2 = null;
        if (sessionConfigs == null) {
            Intrinsics.m17056y("sessionConfigs");
            sessionConfigs = null;
        }
        Long cacheUpdatedTime = sessionConfigs.getCacheUpdatedTime();
        SessionConfigs sessionConfigs3 = this.f43870b;
        if (sessionConfigs3 == null) {
            Intrinsics.m17056y("sessionConfigs");
        } else {
            sessionConfigs2 = sessionConfigs3;
        }
        Integer cacheDuration = sessionConfigs2.getCacheDuration();
        if (cacheUpdatedTime != null && cacheDuration != null && (System.currentTimeMillis() - cacheUpdatedTime.longValue()) / 1000 < cacheDuration.intValue()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
        android.util.Log.w(com.google.firebase.sessions.settings.SettingsCache.TAG, "Failed to remove config values: " + r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    @androidx.annotation.VisibleForTesting
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object removeConfigs$com_google_firebase_firebase_sessions(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.firebase.sessions.settings.SettingsCache$removeConfigs$1
            if (r0 == 0) goto L13
            r0 = r6
            com.google.firebase.sessions.settings.SettingsCache$removeConfigs$1 r0 = (com.google.firebase.sessions.settings.SettingsCache$removeConfigs$1) r0
            int r1 = r0.f43876n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f43876n = r1
            goto L18
        L13:
            com.google.firebase.sessions.settings.SettingsCache$removeConfigs$1 r0 = new com.google.firebase.sessions.settings.SettingsCache$removeConfigs$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f43874l
            java.lang.Object r1 = sd.C42683b.m6964e()
            int r2 = r0.f43876n
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            p804nd.C38508r.m14539b(r6)     // Catch: java.io.IOException -> L29
            goto L5d
        L29:
            r6 = move-exception
            goto L47
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            p804nd.C38508r.m14539b(r6)
            androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> r6 = r5.f43869a     // Catch: java.io.IOException -> L29
            com.google.firebase.sessions.settings.SettingsCache$removeConfigs$2 r2 = new com.google.firebase.sessions.settings.SettingsCache$removeConfigs$2     // Catch: java.io.IOException -> L29
            r4 = 0
            r2.<init>(r5, r4)     // Catch: java.io.IOException -> L29
            r0.f43876n = r3     // Catch: java.io.IOException -> L29
            java.lang.Object r6 = androidx.datastore.preferences.core.PreferencesKt.edit(r6, r2, r0)     // Catch: java.io.IOException -> L29
            if (r6 != r1) goto L5d
            return r1
        L47:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to remove config values: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "SettingsCache"
            android.util.Log.w(r0, r6)
        L5d:
            kotlin.Unit r6 = kotlin.Unit.f99208a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.SettingsCache.removeConfigs$com_google_firebase_firebase_sessions(kotlin.coroutines.d):java.lang.Object");
    }

    @Nullable
    public final Integer sessionRestartTimeout() {
        SessionConfigs sessionConfigs = this.f43870b;
        if (sessionConfigs == null) {
            Intrinsics.m17056y("sessionConfigs");
            sessionConfigs = null;
        }
        return sessionConfigs.getSessionRestartTimeout();
    }

    @Nullable
    public final Double sessionSamplingRate() {
        SessionConfigs sessionConfigs = this.f43870b;
        if (sessionConfigs == null) {
            Intrinsics.m17056y("sessionConfigs");
            sessionConfigs = null;
        }
        return sessionConfigs.getSessionSamplingRate();
    }

    @Nullable
    public final Boolean sessionsEnabled() {
        SessionConfigs sessionConfigs = this.f43870b;
        if (sessionConfigs == null) {
            Intrinsics.m17056y("sessionConfigs");
            sessionConfigs = null;
        }
        return sessionConfigs.getSessionEnabled();
    }

    @Nullable
    public final Object updateSamplingRate(@Nullable Double d, @NotNull Continuation<? super Unit> continuation) {
        Object m6959e;
        Object m66254a = m66254a(f43865e, d, continuation);
        m6959e = C42688d.m6959e();
        if (m66254a == m6959e) {
            return m66254a;
        }
        return Unit.f99208a;
    }

    @Nullable
    public final Object updateSessionCacheDuration(@Nullable Integer num, @NotNull Continuation<? super Unit> continuation) {
        Object m6959e;
        Object m66254a = m66254a(f43867g, num, continuation);
        m6959e = C42688d.m6959e();
        if (m66254a == m6959e) {
            return m66254a;
        }
        return Unit.f99208a;
    }

    @Nullable
    public final Object updateSessionCacheUpdatedTime(@Nullable Long l, @NotNull Continuation<? super Unit> continuation) {
        Object m6959e;
        Object m66254a = m66254a(f43868h, l, continuation);
        m6959e = C42688d.m6959e();
        if (m66254a == m6959e) {
            return m66254a;
        }
        return Unit.f99208a;
    }

    @Nullable
    public final Object updateSessionRestartTimeout(@Nullable Integer num, @NotNull Continuation<? super Unit> continuation) {
        Object m6959e;
        Object m66254a = m66254a(f43866f, num, continuation);
        m6959e = C42688d.m6959e();
        if (m66254a == m6959e) {
            return m66254a;
        }
        return Unit.f99208a;
    }

    @Nullable
    public final Object updateSettingsEnabled(@Nullable Boolean bool, @NotNull Continuation<? super Unit> continuation) {
        Object m6959e;
        Object m66254a = m66254a(f43864d, bool, continuation);
        m6959e = C42688d.m6959e();
        if (m66254a == m6959e) {
            return m66254a;
        }
        return Unit.f99208a;
    }
}
