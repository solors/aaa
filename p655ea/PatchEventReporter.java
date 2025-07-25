package p655ea;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p639da.SimpleRebindReporter;

@Metadata
/* renamed from: ea.a */
/* loaded from: classes8.dex */
public interface PatchEventReporter extends SimpleRebindReporter {
    @NotNull

    /* renamed from: b */
    public static final C32960a f89829b = C32960a.f89830a;

    /* renamed from: a */
    void mo25402a();

    /* compiled from: PatchEventReporter.kt */
    @Metadata
    /* renamed from: ea.a$a */
    /* loaded from: classes8.dex */
    public static final class C32960a {

        /* renamed from: a */
        static final /* synthetic */ C32960a f89830a = new C32960a();
        @NotNull

        /* renamed from: b */
        private static final PatchEventReporter f89831b = new C32961a();

        private C32960a() {
        }

        @NotNull
        /* renamed from: a */
        public final PatchEventReporter m25404a() {
            return f89831b;
        }

        /* compiled from: PatchEventReporter.kt */
        @Metadata
        /* renamed from: ea.a$a$a */
        /* loaded from: classes8.dex */
        public static final class C32961a implements PatchEventReporter {
            C32961a() {
            }

            @Override // p655ea.PatchEventReporter
            /* renamed from: a */
            public void mo25402a() {
            }
        }
    }
}
