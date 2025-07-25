package com.google.firebase.sessions.api;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.sessions.api.SessionSubscriber;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.C38289c;
import me.Mutex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FirebaseSessionsDependencies.kt */
@Metadata
/* loaded from: classes4.dex */
public final class FirebaseSessionsDependencies {
    @NotNull
    public static final FirebaseSessionsDependencies INSTANCE = new FirebaseSessionsDependencies();

    /* renamed from: a */
    private static final Map<SessionSubscriber.Name, Dependency> f43804a = Collections.synchronizedMap(new LinkedHashMap());

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FirebaseSessionsDependencies.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Dependency {
        @NotNull

        /* renamed from: a */
        private final Mutex f43805a;
        @Nullable

        /* renamed from: b */
        private SessionSubscriber f43806b;

        public Dependency(@NotNull Mutex mutex, @Nullable SessionSubscriber sessionSubscriber) {
            Intrinsics.checkNotNullParameter(mutex, "mutex");
            this.f43805a = mutex;
            this.f43806b = sessionSubscriber;
        }

        public static /* synthetic */ Dependency copy$default(Dependency dependency, Mutex mutex, SessionSubscriber sessionSubscriber, int i, Object obj) {
            if ((i & 1) != 0) {
                mutex = dependency.f43805a;
            }
            if ((i & 2) != 0) {
                sessionSubscriber = dependency.f43806b;
            }
            return dependency.copy(mutex, sessionSubscriber);
        }

        @NotNull
        public final Mutex component1() {
            return this.f43805a;
        }

        @Nullable
        public final SessionSubscriber component2() {
            return this.f43806b;
        }

        @NotNull
        public final Dependency copy(@NotNull Mutex mutex, @Nullable SessionSubscriber sessionSubscriber) {
            Intrinsics.checkNotNullParameter(mutex, "mutex");
            return new Dependency(mutex, sessionSubscriber);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Dependency)) {
                return false;
            }
            Dependency dependency = (Dependency) obj;
            if (Intrinsics.m17075f(this.f43805a, dependency.f43805a) && Intrinsics.m17075f(this.f43806b, dependency.f43806b)) {
                return true;
            }
            return false;
        }

        @NotNull
        public final Mutex getMutex() {
            return this.f43805a;
        }

        @Nullable
        public final SessionSubscriber getSubscriber() {
            return this.f43806b;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f43805a.hashCode() * 31;
            SessionSubscriber sessionSubscriber = this.f43806b;
            if (sessionSubscriber == null) {
                hashCode = 0;
            } else {
                hashCode = sessionSubscriber.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public final void setSubscriber(@Nullable SessionSubscriber sessionSubscriber) {
            this.f43806b = sessionSubscriber;
        }

        @NotNull
        public String toString() {
            return "Dependency(mutex=" + this.f43805a + ", subscriber=" + this.f43806b + ')';
        }

        public /* synthetic */ Dependency(Mutex mutex, SessionSubscriber sessionSubscriber, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(mutex, (i & 2) != 0 ? null : sessionSubscriber);
        }
    }

    private FirebaseSessionsDependencies() {
    }

    /* renamed from: a */
    private final Dependency m66262a(SessionSubscriber.Name name) {
        Map<SessionSubscriber.Name, Dependency> dependencies = f43804a;
        Intrinsics.checkNotNullExpressionValue(dependencies, "dependencies");
        Dependency dependency = dependencies.get(name);
        if (dependency != null) {
            Intrinsics.checkNotNullExpressionValue(dependency, "dependencies.getOrElse(s…load time.\"\n      )\n    }");
            return dependency;
        }
        throw new IllegalStateException("Cannot get dependency " + name + ". Dependencies should be added at class load time.");
    }

    public static final void addDependency(@NotNull SessionSubscriber.Name subscriberName) {
        Intrinsics.checkNotNullParameter(subscriberName, "subscriberName");
        if (subscriberName != SessionSubscriber.Name.PERFORMANCE) {
            Map<SessionSubscriber.Name, Dependency> dependencies = f43804a;
            if (dependencies.containsKey(subscriberName)) {
                Log.d("SessionsDependencies", "Dependency " + subscriberName + " already added.");
                return;
            }
            Intrinsics.checkNotNullExpressionValue(dependencies, "dependencies");
            dependencies.put(subscriberName, new Dependency(C38289c.m15158a(true), null, 2, null));
            Log.d("SessionsDependencies", "Dependency to " + subscriberName + " added.");
            return;
        }
        throw new IllegalArgumentException("Incompatible versions of Firebase Perf and Firebase Sessions.\nA safe combination would be:\n  firebase-sessions:1.1.0\n  firebase-crashlytics:18.5.0\n  firebase-perf:20.5.0\nFor more information contact Firebase Support.");
    }

    public static final void register(@NotNull SessionSubscriber subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        SessionSubscriber.Name sessionSubscriberName = subscriber.getSessionSubscriberName();
        Dependency m66262a = INSTANCE.m66262a(sessionSubscriberName);
        if (m66262a.getSubscriber() != null) {
            Log.d("SessionsDependencies", "Subscriber " + sessionSubscriberName + " already registered.");
            return;
        }
        m66262a.setSubscriber(subscriber);
        Log.d("SessionsDependencies", "Subscriber " + sessionSubscriberName + " registered.");
        Mutex.C38282a.m15181c(m66262a.getMutex(), null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b5 A[RETURN] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00a1 -> B:27:0x00a2). Please submit an issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getRegisteredSubscribers$com_google_firebase_firebase_sessions(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.Map<com.google.firebase.sessions.api.SessionSubscriber.Name, ? extends com.google.firebase.sessions.api.SessionSubscriber>> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1
            if (r0 == 0) goto L13
            r0 = r11
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1 r0 = (com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1) r0
            int r1 = r0.f43815t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f43815t = r1
            goto L18
        L13:
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1 r0 = new com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f43813r
            java.lang.Object r1 = sd.C42683b.m6964e()
            int r2 = r0.f43815t
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 != r4) goto L40
            java.lang.Object r2 = r0.f43812q
            java.lang.Object r5 = r0.f43811p
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.f43810o
            me.a r6 = (me.Mutex) r6
            java.lang.Object r7 = r0.f43809n
            com.google.firebase.sessions.api.SessionSubscriber$Name r7 = (com.google.firebase.sessions.api.SessionSubscriber.Name) r7
            java.lang.Object r8 = r0.f43808m
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.f43807l
            java.util.Map r9 = (java.util.Map) r9
            p804nd.C38508r.m14539b(r11)
            goto La2
        L40:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L48:
            p804nd.C38508r.m14539b(r11)
            java.util.Map<com.google.firebase.sessions.api.SessionSubscriber$Name, com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency> r11 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.f43804a
            java.lang.String r2 = "dependencies"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r5 = r11.size()
            int r5 = kotlin.collections.C37554o0.m17369f(r5)
            r2.<init>(r5)
            java.util.Set r11 = r11.entrySet()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
            r8 = r11
            r5 = r2
        L6b:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto Lb5
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r6 = r11.getKey()
            r7 = r6
            com.google.firebase.sessions.api.SessionSubscriber$Name r7 = (com.google.firebase.sessions.api.SessionSubscriber.Name) r7
            java.lang.Object r11 = r11.getValue()
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency r11 = (com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency) r11
            me.a r6 = r11.getMutex()
            r0.f43807l = r5
            r0.f43808m = r8
            r0.f43809n = r7
            r0.f43810o = r6
            r0.f43811p = r5
            r0.f43812q = r2
            r0.f43815t = r4
            java.lang.Object r11 = r6.mo15178d(r3, r0)
            if (r11 != r1) goto La1
            return r1
        La1:
            r9 = r5
        La2:
            com.google.firebase.sessions.api.FirebaseSessionsDependencies r11 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.INSTANCE     // Catch: java.lang.Throwable -> Lb0
            com.google.firebase.sessions.api.SessionSubscriber r11 = r11.getSubscriber$com_google_firebase_firebase_sessions(r7)     // Catch: java.lang.Throwable -> Lb0
            r6.mo15177e(r3)
            r5.put(r2, r11)
            r5 = r9
            goto L6b
        Lb0:
            r11 = move-exception
            r6.mo15177e(r3)
            throw r11
        Lb5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.api.FirebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(kotlin.coroutines.d):java.lang.Object");
    }

    @VisibleForTesting
    @NotNull
    public final SessionSubscriber getSubscriber$com_google_firebase_firebase_sessions(@NotNull SessionSubscriber.Name subscriberName) {
        Intrinsics.checkNotNullParameter(subscriberName, "subscriberName");
        SessionSubscriber subscriber = m66262a(subscriberName).getSubscriber();
        if (subscriber != null) {
            return subscriber;
        }
        throw new IllegalStateException("Subscriber " + subscriberName + " has not been registered.");
    }

    @VisibleForTesting
    public final void reset$com_google_firebase_firebase_sessions() {
        f43804a.clear();
    }
}
