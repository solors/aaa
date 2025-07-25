package p639da;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p1026w9.DivComparatorReporter;
import p670fa.ComplexRebindReporter;

@Metadata
/* renamed from: da.a */
/* loaded from: classes8.dex */
public interface BindingEventReporter extends DivComparatorReporter, ComplexRebindReporter, SimpleRebindReporter, ForceRebindReporter {
    @NotNull

    /* renamed from: a */
    public static final C32859a f89564a = C32859a.f89565a;

    /* renamed from: h */
    void mo25675h();

    /* renamed from: y */
    void mo25674y();

    /* compiled from: BindingEventReporter.kt */
    @Metadata
    /* renamed from: da.a$a */
    /* loaded from: classes8.dex */
    public static final class C32859a {

        /* renamed from: a */
        static final /* synthetic */ C32859a f89565a = new C32859a();
        @NotNull

        /* renamed from: b */
        private static final BindingEventReporter f89566b = new C32860a();

        private C32859a() {
        }

        @NotNull
        /* renamed from: a */
        public final BindingEventReporter m25677a() {
            return f89566b;
        }

        /* compiled from: BindingEventReporter.kt */
        @Metadata
        /* renamed from: da.a$a$a */
        /* loaded from: classes8.dex */
        public static final class C32860a implements BindingEventReporter {
            C32860a() {
            }

            @Override // p639da.BindingEventReporter
            /* renamed from: h */
            public void mo25675h() {
            }

            @Override // p639da.BindingEventReporter
            /* renamed from: y */
            public void mo25674y() {
            }
        }
    }
}
