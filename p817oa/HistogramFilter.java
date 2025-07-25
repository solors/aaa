package p817oa;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p817oa.HistogramFilter;

@Metadata
/* renamed from: oa.p */
/* loaded from: classes8.dex */
public interface HistogramFilter {
    @NotNull

    /* renamed from: a */
    public static final C39135a f102789a = C39135a.f102790a;

    /* compiled from: HistogramFilter.kt */
    @Metadata
    /* renamed from: oa.p$a */
    /* loaded from: classes8.dex */
    public static final class C39135a {

        /* renamed from: a */
        static final /* synthetic */ C39135a f102790a = new C39135a();
        @NotNull

        /* renamed from: b */
        private static final HistogramFilter f102791b = new HistogramFilter() { // from class: oa.n
            @Override // p817oa.HistogramFilter
            /* renamed from: a */
            public final boolean mo13867a(String str) {
                return HistogramFilter.C39135a.m13865b(str);
            }
        };
        @NotNull

        /* renamed from: c */
        private static final HistogramFilter f102792c = new HistogramFilter() { // from class: oa.o
            @Override // p817oa.HistogramFilter
            /* renamed from: a */
            public final boolean mo13867a(String str) {
                return HistogramFilter.C39135a.m13866a(str);
            }
        };

        private C39135a() {
        }

        /* renamed from: a */
        public static /* synthetic */ boolean m13866a(String str) {
            return m13864c(str);
        }

        /* renamed from: b */
        public static /* synthetic */ boolean m13865b(String str) {
            return m13863d(str);
        }

        /* renamed from: c */
        public static final boolean m13864c(String str) {
            return false;
        }

        /* renamed from: d */
        public static final boolean m13863d(String str) {
            return true;
        }

        @NotNull
        /* renamed from: e */
        public final HistogramFilter m13862e() {
            return f102792c;
        }

        @NotNull
        /* renamed from: f */
        public final HistogramFilter m13861f() {
            return f102791b;
        }
    }

    /* renamed from: a */
    boolean mo13867a(@Nullable String str);
}
