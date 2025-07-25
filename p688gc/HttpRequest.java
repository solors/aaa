package p688gc;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import mc.InterfaceC38258b;
import org.jetbrains.annotations.NotNull;
import p1074zb.C45245b;
import p761kc.C37490t;
import p761kc.HttpMessage;
import p761kc.Url;

@Metadata
/* renamed from: gc.b */
/* loaded from: classes9.dex */
public interface HttpRequest extends HttpMessage, CoroutineScope {

    /* compiled from: HttpRequest.kt */
    @Metadata
    /* renamed from: gc.b$a */
    /* loaded from: classes9.dex */
    public static final class C33297a {
        @NotNull
        /* renamed from: a */
        public static CoroutineContext m24215a(@NotNull HttpRequest httpRequest) {
            return httpRequest.mo517N().getCoroutineContext();
        }
    }

    @NotNull
    /* renamed from: N */
    C45245b mo517N();

    @NotNull
    InterfaceC38258b getAttributes();

    @NotNull
    CoroutineContext getCoroutineContext();

    @NotNull
    C37490t getMethod();

    @NotNull
    Url getUrl();
}
