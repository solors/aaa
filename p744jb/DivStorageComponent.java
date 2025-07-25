package p744jb;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import lb.AndroidDatabaseOpenHelper;
import lb.DatabaseOpenHelper;
import lb.DatabaseOpenHelperProvider;
import md.Provider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p656eb.ParsingErrorLogger;
import p744jb.DivStorageComponent;
import p760kb.CardErrorLoggerFactory;
import p790mb.HistogramNameProvider;
import p790mb.HistogramRecorder;
import p817oa.InterfaceC39122g;
import p818ob.C39138c;
import p818ob.DivParsingHistogramProxy;
import p834pb.CardErrorTransformer;
import p834pb.LazyProvider;
import qa.HistogramReporterDelegate;

@Metadata
/* renamed from: jb.e */
/* loaded from: classes8.dex */
public interface DivStorageComponent {
    @NotNull

    /* renamed from: a */
    public static final C37322a f98536a = C37322a.f98537a;

    /* compiled from: DivStorageComponent.kt */
    @Metadata
    /* renamed from: jb.e$a */
    /* loaded from: classes8.dex */
    public static final class C37322a {

        /* renamed from: a */
        static final /* synthetic */ C37322a f98537a = new C37322a();

        /* compiled from: DivStorageComponent.kt */
        @Metadata
        /* renamed from: jb.e$a$a */
        /* loaded from: classes8.dex */
        public static final class C37323a extends Lambda implements Functions<InterfaceC39122g> {

            /* renamed from: g */
            public static final C37323a f98538g = new C37323a();

            C37323a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Functions
            @NotNull
            /* renamed from: b */
            public final InterfaceC39122g invoke() {
                return InterfaceC39122g.f102764a.m13882a();
            }
        }

        /* compiled from: DivStorageComponent.kt */
        @Metadata
        /* renamed from: jb.e$a$b */
        /* loaded from: classes8.dex */
        public static final class C37324b extends Lambda implements Functions<DivParsingHistogramProxy> {

            /* renamed from: g */
            final /* synthetic */ Provider<InterfaceC39122g> f98539g;

            /* compiled from: DivStorageComponent.kt */
            @Metadata
            /* renamed from: jb.e$a$b$a */
            /* loaded from: classes8.dex */
            public static final class C37325a extends Lambda implements Functions<InterfaceC39122g> {

                /* renamed from: g */
                final /* synthetic */ Provider<InterfaceC39122g> f98540g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C37325a(Provider<InterfaceC39122g> provider) {
                    super(0);
                    this.f98540g = provider;
                }

                @Override // kotlin.jvm.functions.Functions
                @NotNull
                /* renamed from: b */
                public final InterfaceC39122g invoke() {
                    InterfaceC39122g interfaceC39122g = this.f98540g.get();
                    Intrinsics.checkNotNullExpressionValue(interfaceC39122g, "parsingHistogramReporter.get()");
                    return interfaceC39122g;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C37324b(Provider<InterfaceC39122g> provider) {
                super(0);
                this.f98539g = provider;
            }

            @Override // kotlin.jvm.functions.Functions
            @NotNull
            /* renamed from: b */
            public final DivParsingHistogramProxy invoke() {
                return new DivParsingHistogramProxy(new C37325a(this.f98539g));
            }
        }

        private C37322a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: c */
        public static /* synthetic */ DivStorageComponent m18431c(C37322a c37322a, Context context, HistogramReporterDelegate histogramReporterDelegate, HistogramNameProvider histogramNameProvider, ParsingErrorLogger parsingErrorLogger, Provider provider, Provider provider2, String str, int i, Object obj) {
            HistogramReporterDelegate histogramReporterDelegate2;
            HistogramNameProvider histogramNameProvider2;
            ParsingErrorLogger LOG;
            LazyProvider lazyProvider;
            String str2;
            if ((i & 2) != 0) {
                histogramReporterDelegate2 = HistogramReporterDelegate.C39376a.f103561a;
            } else {
                histogramReporterDelegate2 = histogramReporterDelegate;
            }
            Provider<? extends CardErrorTransformer> provider3 = null;
            if ((i & 4) != 0) {
                histogramNameProvider2 = null;
            } else {
                histogramNameProvider2 = histogramNameProvider;
            }
            if ((i & 8) != 0) {
                LOG = ParsingErrorLogger.f89835a;
                Intrinsics.checkNotNullExpressionValue(LOG, "LOG");
            } else {
                LOG = parsingErrorLogger;
            }
            if ((i & 16) == 0) {
                provider3 = provider;
            }
            if ((i & 32) != 0) {
                lazyProvider = new LazyProvider(C37323a.f98538g);
            } else {
                lazyProvider = provider2;
            }
            if ((i & 64) != 0) {
                str2 = "";
            } else {
                str2 = str;
            }
            return c37322a.m18432b(context, histogramReporterDelegate2, histogramNameProvider2, LOG, provider3, lazyProvider, str2);
        }

        /* renamed from: e */
        public static final DatabaseOpenHelper m18429e(Context c, String name, int i, DatabaseOpenHelper.InterfaceC38136a ccb, DatabaseOpenHelper.InterfaceC38138c ucb) {
            Intrinsics.checkNotNullParameter(c, "c");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(ccb, "ccb");
            Intrinsics.checkNotNullParameter(ucb, "ucb");
            return new AndroidDatabaseOpenHelper(c, name, i, ccb, ucb);
        }

        @NotNull
        /* renamed from: b */
        public final DivStorageComponent m18432b(@NotNull Context context, @NotNull HistogramReporterDelegate histogramReporter, @Nullable HistogramNameProvider histogramNameProvider, @NotNull ParsingErrorLogger errorLogger, @Nullable Provider<? extends CardErrorTransformer> provider, @NotNull Provider<InterfaceC39122g> parsingHistogramReporter, @NotNull String databaseNamePrefix) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(histogramReporter, "histogramReporter");
            Intrinsics.checkNotNullParameter(errorLogger, "errorLogger");
            Intrinsics.checkNotNullParameter(parsingHistogramReporter, "parsingHistogramReporter");
            Intrinsics.checkNotNullParameter(databaseNamePrefix, "databaseNamePrefix");
            return m18430d(context, histogramReporter, histogramNameProvider, errorLogger, provider, parsingHistogramReporter, databaseNamePrefix);
        }

        @NotNull
        /* renamed from: d */
        public final InternalStorageComponent m18430d(@NotNull Context context, @NotNull HistogramReporterDelegate histogramReporter, @Nullable HistogramNameProvider histogramNameProvider, @NotNull ParsingErrorLogger errorLogger, @Nullable Provider<? extends CardErrorTransformer> provider, @NotNull Provider<InterfaceC39122g> parsingHistogramReporter, @NotNull String databaseNamePrefix) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(histogramReporter, "histogramReporter");
            Intrinsics.checkNotNullParameter(errorLogger, "errorLogger");
            Intrinsics.checkNotNullParameter(parsingHistogramReporter, "parsingHistogramReporter");
            Intrinsics.checkNotNullParameter(databaseNamePrefix, "databaseNamePrefix");
            DivStorageImpl divStorageImpl = new DivStorageImpl(context, new DatabaseOpenHelperProvider() { // from class: jb.d
                @Override // lb.DatabaseOpenHelperProvider
                /* renamed from: a */
                public final DatabaseOpenHelper mo15573a(Context context2, String str, int i, DatabaseOpenHelper.InterfaceC38136a interfaceC38136a, DatabaseOpenHelper.InterfaceC38138c interfaceC38138c) {
                    DatabaseOpenHelper m18429e;
                    m18429e = DivStorageComponent.C37322a.m18429e(context2, str, i, interfaceC38136a, interfaceC38138c);
                    return m18429e;
                }
            }, databaseNamePrefix);
            LazyProvider lazyProvider = new LazyProvider(new C37324b(parsingHistogramReporter));
            HistogramRecorder histogramRecorder = new HistogramRecorder(histogramReporter, histogramNameProvider);
            C39138c c39138c = new C39138c(divStorageImpl, errorLogger, histogramRecorder, lazyProvider, histogramNameProvider);
            return new InternalStorageComponent(new DivDataRepositoryImpl(divStorageImpl, c39138c, histogramRecorder, histogramNameProvider, lazyProvider, new CardErrorLoggerFactory(provider, c39138c, errorLogger)), new RawJsonRepositoryImpl(divStorageImpl), divStorageImpl);
        }
    }

    @NotNull
    /* renamed from: a */
    RawJsonRepository mo18389a();
}
