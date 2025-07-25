package p702hc;

import io.ktor.utils.p731io.ByteReadChannelJVM;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import p1074zb.C45245b;
import p761kc.HttpMessage;
import p761kc.HttpProtocolVersion;
import p761kc.HttpStatusCode;
import p835pc.Date;

/* compiled from: HttpResponse.kt */
@Metadata
/* renamed from: hc.c */
/* loaded from: classes9.dex */
public abstract class AbstractC33495c implements HttpMessage, CoroutineScope {
    @NotNull
    /* renamed from: N */
    public abstract C45245b mo515N();

    @NotNull
    /* renamed from: b */
    public abstract ByteReadChannelJVM mo514b();

    @NotNull
    /* renamed from: c */
    public abstract Date mo513c();

    @NotNull
    /* renamed from: d */
    public abstract Date mo512d();

    @NotNull
    /* renamed from: e */
    public abstract HttpStatusCode mo511e();

    @NotNull
    /* renamed from: f */
    public abstract HttpProtocolVersion mo510f();

    @NotNull
    public String toString() {
        return "HttpResponse[" + C33497e.m23614e(this).getUrl() + ", " + mo511e() + ']';
    }
}
