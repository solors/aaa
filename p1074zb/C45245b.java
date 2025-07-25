package p1074zb;

import io.ktor.utils.p731io.ByteReadChannelJVM;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import mc.Attributes;
import mc.InterfaceC38258b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1060yb.HttpClient;
import p688gc.C33301d;
import p688gc.C33304g;
import p688gc.DefaultHttpRequest;
import p688gc.HttpRequest;
import p702hc.AbstractC33495c;
import p702hc.DefaultHttpResponse;

/* compiled from: HttpClientCall.kt */
@Metadata
/* renamed from: zb.b */
/* loaded from: classes9.dex */
public class C45245b implements CoroutineScope {
    @NotNull

    /* renamed from: b */
    private final HttpClient f118965b;

    /* renamed from: c */
    protected HttpRequest f118966c;

    /* renamed from: d */
    protected AbstractC33495c f118967d;

    /* renamed from: f */
    private final boolean f118968f;
    @NotNull
    private volatile /* synthetic */ int received;
    @NotNull

    /* renamed from: g */
    public static final C45246a f118962g = new C45246a(null);
    @NotNull

    /* renamed from: i */
    private static final Attributes<Object> f118964i = new Attributes<>("CustomResponse");

    /* renamed from: h */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f118963h = AtomicIntegerFieldUpdater.newUpdater(C45245b.class, "received");

    /* compiled from: HttpClientCall.kt */
    @Metadata
    /* renamed from: zb.b$a */
    /* loaded from: classes9.dex */
    public static final class C45246a {
        private C45246a() {
        }

        public /* synthetic */ C45246a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: HttpClientCall.kt */
    @DebugMetadata(m17095c = "io.ktor.client.call.HttpClientCall", m17094f = "HttpClientCall.kt", m17093l = {86, 89}, m17092m = "bodyNullable")
    @Metadata
    /* renamed from: zb.b$b */
    /* loaded from: classes9.dex */
    public static final class C45247b extends AbstractC37589d {

        /* renamed from: l */
        Object f118969l;

        /* renamed from: m */
        Object f118970m;

        /* renamed from: n */
        /* synthetic */ Object f118971n;

        /* renamed from: p */
        int f118973p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C45247b(Continuation<? super C45247b> continuation) {
            super(continuation);
            C45245b.this = r1;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f118971n = obj;
            this.f118973p |= Integer.MIN_VALUE;
            return C45245b.this.m528b(null, this);
        }
    }

    public C45245b(@NotNull HttpClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f118965b = client;
        this.received = 0;
    }

    /* renamed from: i */
    static /* synthetic */ Object m524i(C45245b c45245b, Continuation<? super ByteReadChannelJVM> continuation) {
        return c45245b.m525f().mo514b();
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0050  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m528b(@org.jetbrains.annotations.NotNull sc.Type r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<java.lang.Object> r8) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p1074zb.C45245b.m528b(sc.a, kotlin.coroutines.d):java.lang.Object");
    }

    /* renamed from: c */
    protected boolean mo519c() {
        return this.f118968f;
    }

    @NotNull
    /* renamed from: d */
    public final HttpClient m527d() {
        return this.f118965b;
    }

    @NotNull
    /* renamed from: e */
    public final HttpRequest m526e() {
        HttpRequest httpRequest = this.f118966c;
        if (httpRequest != null) {
            return httpRequest;
        }
        Intrinsics.m17056y("request");
        return null;
    }

    @NotNull
    /* renamed from: f */
    public final AbstractC33495c m525f() {
        AbstractC33495c abstractC33495c = this.f118967d;
        if (abstractC33495c != null) {
            return abstractC33495c;
        }
        Intrinsics.m17056y("response");
        return null;
    }

    @NotNull
    public final InterfaceC38258b getAttributes() {
        return m526e().getAttributes();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return m525f().getCoroutineContext();
    }

    @Nullable
    /* renamed from: h */
    protected Object mo518h(@NotNull Continuation<? super ByteReadChannelJVM> continuation) {
        return m524i(this, continuation);
    }

    /* renamed from: j */
    public final void m523j(@NotNull HttpRequest httpRequest) {
        Intrinsics.checkNotNullParameter(httpRequest, "<set-?>");
        this.f118966c = httpRequest;
    }

    /* renamed from: k */
    public final void m522k(@NotNull AbstractC33495c abstractC33495c) {
        Intrinsics.checkNotNullParameter(abstractC33495c, "<set-?>");
        this.f118967d = abstractC33495c;
    }

    /* renamed from: l */
    public final void m521l(@NotNull AbstractC33495c response) {
        Intrinsics.checkNotNullParameter(response, "response");
        m522k(response);
    }

    @NotNull
    public String toString() {
        return "HttpClientCall[" + m526e().getUrl() + ", " + m525f().mo511e() + ']';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C45245b(@NotNull HttpClient client, @NotNull C33301d requestData, @NotNull C33304g responseData) {
        this(client);
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        Intrinsics.checkNotNullParameter(responseData, "responseData");
        m523j(new DefaultHttpRequest(this, requestData));
        m522k(new DefaultHttpResponse(this, responseData));
        if (responseData.m24181a() instanceof ByteReadChannelJVM) {
            return;
        }
        getAttributes().mo15251f(f118964i, responseData.m24181a());
    }
}
