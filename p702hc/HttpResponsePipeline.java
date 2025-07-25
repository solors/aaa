package p702hc;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p866rc.C39471h;
import p866rc.Pipeline;

@Metadata
/* renamed from: hc.b */
/* loaded from: classes9.dex */
public final class HttpResponsePipeline extends Pipeline<AbstractC33495c, Unit> {
    @NotNull

    /* renamed from: h */
    public static final C33494a f91425h = new C33494a(null);
    @NotNull

    /* renamed from: i */
    private static final C39471h f91426i = new C39471h("Before");
    @NotNull

    /* renamed from: j */
    private static final C39471h f91427j = new C39471h("State");
    @NotNull

    /* renamed from: k */
    private static final C39471h f91428k = new C39471h("After");

    /* renamed from: g */
    private final boolean f91429g;

    /* compiled from: HttpResponsePipeline.kt */
    @Metadata
    /* renamed from: hc.b$a */
    /* loaded from: classes9.dex */
    public static final class C33494a {
        private C33494a() {
        }

        public /* synthetic */ C33494a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final C39471h m23622a() {
            return HttpResponsePipeline.f91428k;
        }
    }

    public HttpResponsePipeline(boolean z) {
        super(f91426i, f91427j, f91428k);
        this.f91429g = z;
    }

    @Override // p866rc.Pipeline
    /* renamed from: g */
    public boolean mo12557g() {
        return this.f91429g;
    }
}
