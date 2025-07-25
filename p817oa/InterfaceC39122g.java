package p817oa;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* compiled from: DivParsingHistogramReporter.kt */
@Metadata
/* renamed from: oa.g */
/* loaded from: classes8.dex */
public interface InterfaceC39122g {
    @NotNull

    /* renamed from: a */
    public static final C39123a f102764a = C39123a.f102765a;

    /* compiled from: DivParsingHistogramReporter.kt */
    @Metadata
    /* renamed from: oa.g$a */
    /* loaded from: classes8.dex */
    public static final class C39123a {

        /* renamed from: a */
        static final /* synthetic */ C39123a f102765a = new C39123a();
        @NotNull

        /* renamed from: b */
        private static final InterfaceC38501j<DivParsingHistogramReporter> f102766b;

        /* compiled from: DivParsingHistogramReporter.kt */
        @Metadata
        /* renamed from: oa.g$a$a */
        /* loaded from: classes8.dex */
        /* synthetic */ class C39124a extends FunctionReferenceImpl implements Functions<DivParsingHistogramReporter> {

            /* renamed from: c */
            public static final C39124a f102767c = new C39124a();

            C39124a() {
                super(0, DivParsingHistogramReporter.class, "<init>", "<init>()V", 0);
            }

            @Override // kotlin.jvm.functions.Functions
            @NotNull
            /* renamed from: c */
            public final DivParsingHistogramReporter invoke() {
                return new DivParsingHistogramReporter();
            }
        }

        static {
            InterfaceC38501j<DivParsingHistogramReporter> m14554a;
            m14554a = LazyJVM.m14554a(C39124a.f102767c);
            f102766b = m14554a;
        }

        private C39123a() {
        }

        @NotNull
        /* renamed from: a */
        public final InterfaceC39122g m13882a() {
            return f102766b.getValue();
        }
    }
}
