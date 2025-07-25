package p688gc;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p761kc.HttpProtocolVersion;
import p761kc.HttpStatusCode;
import p761kc.InterfaceC37464k;
import p835pc.Date;
import p835pc.DateJvm;

/* compiled from: HttpRequest.kt */
@Metadata
/* renamed from: gc.g */
/* loaded from: classes9.dex */
public final class C33304g {
    @NotNull

    /* renamed from: a */
    private final HttpStatusCode f90872a;
    @NotNull

    /* renamed from: b */
    private final Date f90873b;
    @NotNull

    /* renamed from: c */
    private final InterfaceC37464k f90874c;
    @NotNull

    /* renamed from: d */
    private final HttpProtocolVersion f90875d;
    @NotNull

    /* renamed from: e */
    private final Object f90876e;
    @NotNull

    /* renamed from: f */
    private final CoroutineContext f90877f;
    @NotNull

    /* renamed from: g */
    private final Date f90878g;

    public C33304g(@NotNull HttpStatusCode statusCode, @NotNull Date requestTime, @NotNull InterfaceC37464k headers, @NotNull HttpProtocolVersion version, @NotNull Object body, @NotNull CoroutineContext callContext) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(requestTime, "requestTime");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(callContext, "callContext");
        this.f90872a = statusCode;
        this.f90873b = requestTime;
        this.f90874c = headers;
        this.f90875d = version;
        this.f90876e = body;
        this.f90877f = callContext;
        this.f90878g = DateJvm.m13198b(null, 1, null);
    }

    @NotNull
    /* renamed from: a */
    public final Object m24181a() {
        return this.f90876e;
    }

    @NotNull
    /* renamed from: b */
    public final CoroutineContext m24180b() {
        return this.f90877f;
    }

    @NotNull
    /* renamed from: c */
    public final InterfaceC37464k m24179c() {
        return this.f90874c;
    }

    @NotNull
    /* renamed from: d */
    public final Date m24178d() {
        return this.f90873b;
    }

    @NotNull
    /* renamed from: e */
    public final Date m24177e() {
        return this.f90878g;
    }

    @NotNull
    /* renamed from: f */
    public final HttpStatusCode m24176f() {
        return this.f90872a;
    }

    @NotNull
    /* renamed from: g */
    public final HttpProtocolVersion m24175g() {
        return this.f90875d;
    }

    @NotNull
    public String toString() {
        return "HttpResponseData=(statusCode=" + this.f90872a + ')';
    }
}
