package p1025w8;

import ae.KMarkers;
import android.content.Context;
import android.net.Uri;
import androidx.annotation.WorkerThread;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p1025w8.BeaconItem;
import p1059ya.Clock;
import p1059ya.SingleThreadExecutor;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;
import sa.Log;

@Metadata
/* renamed from: w8.h */
/* loaded from: classes7.dex */
public final class SendBeaconWorkerImpl {
    @NotNull

    /* renamed from: g */
    public static final C44595a f117046g = new C44595a(null);

    /* renamed from: h */
    public static final long f117047h = TimeUnit.DAYS.toMillis(1);
    @NotNull

    /* renamed from: a */
    private final Context f117048a;
    @NotNull

    /* renamed from: b */
    private final SendBeaconConfiguration f117049b;
    @NotNull

    /* renamed from: c */
    private final C44601e f117050c;
    @NotNull

    /* renamed from: d */
    private final C44596b f117051d;
    @NotNull

    /* renamed from: e */
    private final AtomicReference<C44598c> f117052e;
    @Nullable

    /* renamed from: f */
    private volatile Boolean f117053f;

    /* compiled from: SendBeaconWorkerImpl.kt */
    @Metadata
    /* renamed from: w8.h$a */
    /* loaded from: classes7.dex */
    public static final class C44595a {
        private C44595a() {
        }

        public /* synthetic */ C44595a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: SendBeaconWorkerImpl.kt */
    @Metadata
    @WorkerThread
    /* renamed from: w8.h$b */
    /* loaded from: classes7.dex */
    public final class C44596b {
        @NotNull

        /* renamed from: a */
        private final InterfaceC38501j f117054a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SendBeaconWorkerImpl.kt */
        @Metadata
        /* renamed from: w8.h$b$a */
        /* loaded from: classes7.dex */
        public static final class C44597a extends Lambda implements Functions<C44599d> {

            /* renamed from: g */
            final /* synthetic */ SendBeaconWorkerImpl f117056g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C44597a(SendBeaconWorkerImpl sendBeaconWorkerImpl) {
                super(0);
                this.f117056g = sendBeaconWorkerImpl;
            }

            @Override // kotlin.jvm.functions.Functions
            @NotNull
            /* renamed from: b */
            public final C44599d invoke() {
                SendBeaconWorkerImpl sendBeaconWorkerImpl = this.f117056g;
                return new C44599d(sendBeaconWorkerImpl, sendBeaconWorkerImpl.f117048a, this.f117056g.f117049b.m2297a());
            }
        }

        public C44596b() {
            InterfaceC38501j m14554a;
            SendBeaconWorkerImpl.this = r2;
            m14554a = LazyJVM.m14554a(new C44597a(r2));
            this.f117054a = m14554a;
        }

        /* renamed from: a */
        private final void m2272a(boolean z, C44599d c44599d, BeaconItem beaconItem) {
            if (z && m2269d(beaconItem)) {
                c44599d.m2265c();
            } else if (((C44598c) SendBeaconWorkerImpl.this.f117052e.get()) != null) {
            } else {
                SendBeaconWorkerImpl.m2279e(SendBeaconWorkerImpl.this);
                throw null;
            }
        }

        /* renamed from: c */
        private final C44599d m2270c() {
            return (C44599d) this.f117054a.getValue();
        }

        /* renamed from: d */
        private final boolean m2269d(BeaconItem beaconItem) {
            SendBeaconRequest m2284a = SendBeaconRequest.f117037d.m2284a(beaconItem);
            beaconItem.m2301e();
            Intrinsics.checkNotNullExpressionValue(m2284a.m2285a().toString(), "request.url.toString()");
            SendBeaconWorkerImpl.m2280d(SendBeaconWorkerImpl.this);
            throw null;
        }

        /* renamed from: b */
        public final void m2271b(@NotNull Uri url, @NotNull Map<String, String> headers, @Nullable JSONObject jSONObject, boolean z) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(headers, "headers");
            m2272a(z, m2270c(), m2270c().m2264d(url, headers, Clock.m1014a().m1013b(), jSONObject));
        }
    }

    /* compiled from: SendBeaconWorkerImpl.kt */
    @Metadata
    /* renamed from: w8.h$c */
    /* loaded from: classes7.dex */
    public static final class C44598c {
    }

    /* compiled from: SendBeaconWorkerImpl.kt */
    @Metadata
    @WorkerThread
    /* renamed from: w8.h$d */
    /* loaded from: classes7.dex */
    public final class C44599d implements Iterable<BeaconItem>, KMarkers {
        @NotNull

        /* renamed from: b */
        private final SendBeaconDb f117057b;
        @NotNull

        /* renamed from: c */
        private final Deque<BeaconItem> f117058c;

        /* renamed from: d */
        final /* synthetic */ SendBeaconWorkerImpl f117059d;

        /* compiled from: SendBeaconWorkerImpl.kt */
        @Metadata
        /* renamed from: w8.h$d$a */
        /* loaded from: classes7.dex */
        public static final class C44600a implements Iterator<BeaconItem>, KMarkers {
            @Nullable

            /* renamed from: b */
            private BeaconItem f117060b;

            /* renamed from: c */
            final /* synthetic */ Iterator<BeaconItem> f117061c;

            /* renamed from: d */
            final /* synthetic */ C44599d f117062d;

            /* JADX WARN: Multi-variable type inference failed */
            C44600a(Iterator<? extends BeaconItem> it, C44599d c44599d) {
                this.f117061c = it;
                this.f117062d = c44599d;
            }

            @Override // java.util.Iterator
            @NotNull
            /* renamed from: a */
            public BeaconItem next() {
                BeaconItem item = this.f117061c.next();
                this.f117060b = item;
                Intrinsics.checkNotNullExpressionValue(item, "item");
                return item;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f117061c.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                BeaconItem.C44588a c44588a;
                this.f117061c.remove();
                SendBeaconDb sendBeaconDb = this.f117062d.f117057b;
                BeaconItem beaconItem = this.f117060b;
                if (beaconItem != null) {
                    c44588a = beaconItem.mo2300a();
                } else {
                    c44588a = null;
                }
                sendBeaconDb.m2288i(c44588a);
                this.f117062d.m2263f();
            }
        }

        public C44599d(@NotNull SendBeaconWorkerImpl sendBeaconWorkerImpl, @NotNull Context context, String databaseName) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(databaseName, "databaseName");
            this.f117059d = sendBeaconWorkerImpl;
            SendBeaconDb mo2287a = SendBeaconDb.f117033d.mo2287a(context, databaseName);
            this.f117057b = mo2287a;
            ArrayDeque arrayDeque = new ArrayDeque(mo2287a.m2292b());
            this.f117058c = arrayDeque;
            Log.m11981b("SendBeaconWorker", "Reading from database, items count: " + arrayDeque.size());
            m2263f();
        }

        /* renamed from: f */
        public final void m2263f() {
            this.f117059d.f117053f = Boolean.valueOf(!this.f117058c.isEmpty());
        }

        /* renamed from: c */
        public final void m2265c() {
            this.f117057b.m2288i(this.f117058c.pop().mo2300a());
            m2263f();
        }

        @NotNull
        /* renamed from: d */
        public final BeaconItem m2264d(@NotNull Uri url, @NotNull Map<String, String> headers, long j, @Nullable JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(headers, "headers");
            BeaconItem.C44588a m2293a = this.f117057b.m2293a(url, headers, j, jSONObject);
            this.f117058c.push(m2293a);
            m2263f();
            return m2293a;
        }

        @Override // java.lang.Iterable
        @NotNull
        public Iterator<BeaconItem> iterator() {
            Iterator<BeaconItem> it = this.f117058c.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "itemCache.iterator()");
            return new C44600a(it, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SendBeaconWorkerImpl.kt */
    @Metadata
    /* renamed from: w8.h$e */
    /* loaded from: classes7.dex */
    public static final class C44601e extends SingleThreadExecutor {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44601e(@NotNull Executor executor) {
            super(executor, "SendBeacon");
            Intrinsics.checkNotNullParameter(executor, "executor");
        }

        @Override // p1059ya.SingleThreadExecutor
        /* renamed from: h */
        protected void mo982h(@NotNull RuntimeException e) {
            Intrinsics.checkNotNullParameter(e, "e");
        }
    }

    public SendBeaconWorkerImpl(@NotNull Context context, @NotNull SendBeaconConfiguration configuration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f117048a = context;
        this.f117049b = configuration;
        this.f117050c = new C44601e(configuration.m2296b());
        this.f117051d = new C44596b();
        this.f117052e = new AtomicReference<>(null);
        Log.m11982a("SendBeaconWorker", "SendBeaconWorker created");
    }

    /* renamed from: d */
    public static final /* synthetic */ SendBeaconPerWorkerLogger m2280d(SendBeaconWorkerImpl sendBeaconWorkerImpl) {
        sendBeaconWorkerImpl.m2274j();
        return null;
    }

    /* renamed from: e */
    public static final /* synthetic */ SendBeaconWorkerScheduler m2279e(SendBeaconWorkerImpl sendBeaconWorkerImpl) {
        sendBeaconWorkerImpl.m2273k();
        return null;
    }

    /* renamed from: i */
    public static final void m2275i(SendBeaconWorkerImpl this$0, Uri url, Map headers, JSONObject jSONObject, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(url, "$url");
        Intrinsics.checkNotNullParameter(headers, "$headers");
        this$0.f117051d.m2271b(url, headers, jSONObject, z);
    }

    /* renamed from: j */
    private final SendBeaconPerWorkerLogger m2274j() {
        this.f117049b.m2295c();
        return null;
    }

    /* renamed from: k */
    private final SendBeaconWorkerScheduler m2273k() {
        this.f117049b.m2294d();
        return null;
    }

    /* renamed from: h */
    public final void m2276h(@NotNull final Uri url, @NotNull final Map<String, String> headers, @Nullable final JSONObject jSONObject, final boolean z) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Log.m11982a("SendBeaconWorker", "Adding url " + url);
        this.f117050c.m981i(new Runnable() { // from class: w8.g
            {
                SendBeaconWorkerImpl.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                SendBeaconWorkerImpl.m2275i(SendBeaconWorkerImpl.this, url, headers, jSONObject, z);
            }
        });
    }
}
