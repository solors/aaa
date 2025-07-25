package com.yandex.div.core;

import android.graphics.drawable.PictureDrawable;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.view2.DivImagePreloader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p671fb.ExpressionResolver;
import p742j9.DivExtensionController;
import p789m9.CachedBitmap;
import p789m9.DivImageDownloadCallback;
import p789m9.LoadReference;
import p802n9.DivPlayerPreloader;
import p985ta.DivCollectionExtensions;
import p985ta.DivItemBuilderResult;
import p985ta.DivVisitor;
import sb.C41632qr;
import sb.Div;
import sb.DivState;
import sb.DivTabs;

@Metadata
/* renamed from: com.yandex.div.core.w */
/* loaded from: classes8.dex */
public class DivPreloader {
    @NotNull

    /* renamed from: f */
    private static final C29755b f75911f = new C29755b(null);
    @NotNull

    /* renamed from: g */
    private static final InterfaceC29754a f75912g = new InterfaceC29754a() { // from class: com.yandex.div.core.v
        @Override // com.yandex.div.core.DivPreloader.InterfaceC29754a
        public final void finish(boolean z) {
            DivPreloader.m36690b(z);
        }
    };
    @Nullable

    /* renamed from: a */
    private final DivImagePreloader f75913a;
    @Nullable

    /* renamed from: b */
    private final DivCustomViewAdapter f75914b;
    @NotNull

    /* renamed from: c */
    private final DivCustomContainerViewAdapter f75915c;
    @NotNull

    /* renamed from: d */
    private final DivExtensionController f75916d;
    @NotNull

    /* renamed from: e */
    private final DivPlayerPreloader f75917e;

    /* compiled from: DivPreloader.kt */
    @Metadata
    /* renamed from: com.yandex.div.core.w$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC29754a {
        void finish(boolean z);
    }

    /* compiled from: DivPreloader.kt */
    @Metadata
    /* renamed from: com.yandex.div.core.w$b */
    /* loaded from: classes8.dex */
    private static final class C29755b {
        private C29755b() {
        }

        public /* synthetic */ C29755b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: DivPreloader.kt */
    @Metadata
    /* renamed from: com.yandex.div.core.w$c */
    /* loaded from: classes8.dex */
    public static final class C29756c extends DivImageDownloadCallback {
        @NotNull

        /* renamed from: a */
        private final InterfaceC29754a f75918a;
        @NotNull

        /* renamed from: b */
        private AtomicInteger f75919b;
        @NotNull

        /* renamed from: c */
        private AtomicInteger f75920c;
        @NotNull

        /* renamed from: d */
        private AtomicBoolean f75921d;

        public C29756c(@NotNull InterfaceC29754a callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f75918a = callback;
            this.f75919b = new AtomicInteger(0);
            this.f75920c = new AtomicInteger(0);
            this.f75921d = new AtomicBoolean(false);
        }

        /* renamed from: d */
        private final void m36682d() {
            boolean z;
            this.f75919b.decrementAndGet();
            if (this.f75919b.get() == 0 && this.f75921d.get()) {
                InterfaceC29754a interfaceC29754a = this.f75918a;
                if (this.f75920c.get() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                interfaceC29754a.finish(z);
            }
        }

        @Override // p789m9.DivImageDownloadCallback
        /* renamed from: a */
        public void mo626a() {
            this.f75920c.incrementAndGet();
            m36682d();
        }

        @Override // p789m9.DivImageDownloadCallback
        /* renamed from: b */
        public void mo625b(@NotNull PictureDrawable pictureDrawable) {
            Intrinsics.checkNotNullParameter(pictureDrawable, "pictureDrawable");
            m36682d();
        }

        @Override // p789m9.DivImageDownloadCallback
        /* renamed from: c */
        public void mo624c(@NotNull CachedBitmap cachedBitmap) {
            Intrinsics.checkNotNullParameter(cachedBitmap, "cachedBitmap");
            m36682d();
        }

        /* renamed from: e */
        public final void m36681e() {
            boolean z = true;
            this.f75921d.set(true);
            if (this.f75919b.get() == 0) {
                InterfaceC29754a interfaceC29754a = this.f75918a;
                if (this.f75920c.get() == 0) {
                    z = false;
                }
                interfaceC29754a.finish(z);
            }
        }

        /* renamed from: f */
        public final void m36680f() {
            this.f75919b.incrementAndGet();
        }
    }

    /* compiled from: DivPreloader.kt */
    @Metadata
    /* renamed from: com.yandex.div.core.w$e */
    /* loaded from: classes8.dex */
    public final class C29759e extends DivVisitor<Unit> {
        @NotNull

        /* renamed from: b */
        private final C29756c f75925b;
        @NotNull

        /* renamed from: c */
        private final InterfaceC29754a f75926c;
        @NotNull

        /* renamed from: d */
        private final ExpressionResolver f75927d;
        @NotNull

        /* renamed from: f */
        private final C29761g f75928f;

        /* renamed from: g */
        final /* synthetic */ DivPreloader f75929g;

        public C29759e(@NotNull DivPreloader divPreloader, @NotNull C29756c downloadCallback, @NotNull InterfaceC29754a callback, ExpressionResolver resolver) {
            Intrinsics.checkNotNullParameter(downloadCallback, "downloadCallback");
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            this.f75929g = divPreloader;
            this.f75925b = downloadCallback;
            this.f75926c = callback;
            this.f75927d = resolver;
            this.f75928f = new C29761g();
        }

        /* renamed from: A */
        protected void m36676A(@NotNull Div.C41969p data, @NotNull ExpressionResolver resolver) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            for (DivTabs.C40086f c40086f : data.m8288c().f105304o) {
                m3136r(c40086f.f105322a, resolver);
            }
            m36674s(data, resolver);
        }

        /* renamed from: B */
        protected void m36675B(@NotNull Div.C41971r data, @NotNull ExpressionResolver resolver) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            m36674s(data, resolver);
            if (data.m8286c().f108082y.mo24837c(resolver).booleanValue()) {
                ArrayList arrayList = new ArrayList();
                for (C41632qr c41632qr : data.m8286c().f108052O) {
                    arrayList.add(c41632qr.f109038d.mo24837c(resolver));
                }
                this.f75928f.m36665b(this.f75929g.f75917e.mo14659a(arrayList));
            }
        }

        @Override // p985ta.DivVisitor
        /* renamed from: a */
        public /* bridge */ /* synthetic */ Unit mo1889a(Div div, ExpressionResolver expressionResolver) {
            m36674s(div, expressionResolver);
            return Unit.f99208a;
        }

        @Override // p985ta.DivVisitor
        /* renamed from: b */
        public /* bridge */ /* synthetic */ Unit mo1888b(Div.C41956c c41956c, ExpressionResolver expressionResolver) {
            m36672u(c41956c, expressionResolver);
            return Unit.f99208a;
        }

        @Override // p985ta.DivVisitor
        /* renamed from: c */
        public /* bridge */ /* synthetic */ Unit mo3146c(Div.C41957d c41957d, ExpressionResolver expressionResolver) {
            m36671v(c41957d, expressionResolver);
            return Unit.f99208a;
        }

        @Override // p985ta.DivVisitor
        /* renamed from: d */
        public /* bridge */ /* synthetic */ Unit mo1887d(Div.C41958e c41958e, ExpressionResolver expressionResolver) {
            m36670w(c41958e, expressionResolver);
            return Unit.f99208a;
        }

        @Override // p985ta.DivVisitor
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Unit mo1886f(Div.C41960g c41960g, ExpressionResolver expressionResolver) {
            m36669x(c41960g, expressionResolver);
            return Unit.f99208a;
        }

        @Override // p985ta.DivVisitor
        /* renamed from: j */
        public /* bridge */ /* synthetic */ Unit mo1885j(Div.C41964k c41964k, ExpressionResolver expressionResolver) {
            m36668y(c41964k, expressionResolver);
            return Unit.f99208a;
        }

        @Override // p985ta.DivVisitor
        /* renamed from: n */
        public /* bridge */ /* synthetic */ Unit mo1884n(Div.C41968o c41968o, ExpressionResolver expressionResolver) {
            m36667z(c41968o, expressionResolver);
            return Unit.f99208a;
        }

        @Override // p985ta.DivVisitor
        /* renamed from: o */
        public /* bridge */ /* synthetic */ Unit mo1883o(Div.C41969p c41969p, ExpressionResolver expressionResolver) {
            m36676A(c41969p, expressionResolver);
            return Unit.f99208a;
        }

        @Override // p985ta.DivVisitor
        /* renamed from: q */
        public /* bridge */ /* synthetic */ Unit mo3137q(Div.C41971r c41971r, ExpressionResolver expressionResolver) {
            m36675B(c41971r, expressionResolver);
            return Unit.f99208a;
        }

        /* renamed from: s */
        protected void m36674s(@NotNull Div data, @NotNull ExpressionResolver resolver) {
            List<LoadReference> m36782c;
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            DivImagePreloader divImagePreloader = this.f75929g.f75913a;
            if (divImagePreloader != null && (m36782c = divImagePreloader.m36782c(data, resolver, this.f75925b)) != null) {
                for (LoadReference loadReference : m36782c) {
                    this.f75928f.m36666a(loadReference);
                }
            }
            this.f75929g.f75916d.m18509d(data.m8305b(), resolver);
        }

        @NotNull
        /* renamed from: t */
        public final InterfaceC29760f m36673t(@NotNull Div div) {
            Intrinsics.checkNotNullParameter(div, "div");
            m3136r(div, this.f75927d);
            return this.f75928f;
        }

        /* renamed from: u */
        protected void m36672u(@NotNull Div.C41956c data, @NotNull ExpressionResolver resolver) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensions.m3167d(data.m8301c(), resolver)) {
                m3136r(divItemBuilderResult.m3150a(), divItemBuilderResult.m3149b());
            }
            m36674s(data, resolver);
        }

        /* renamed from: v */
        protected void m36671v(@NotNull Div.C41957d data, @NotNull ExpressionResolver resolver) {
            InterfaceC29757d preload;
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            List<Div> list = data.m8300c().f104189o;
            if (list != null) {
                for (Div div : list) {
                    m3136r(div, resolver);
                }
            }
            DivCustomViewAdapter divCustomViewAdapter = this.f75929g.f75914b;
            if (divCustomViewAdapter != null && (preload = divCustomViewAdapter.preload(data.m8300c(), this.f75926c)) != null) {
                this.f75928f.m36665b(preload);
            }
            this.f75928f.m36665b(this.f75929g.f75915c.preload(data.m8300c(), this.f75926c));
            m36674s(data, resolver);
        }

        /* renamed from: w */
        protected void m36670w(@NotNull Div.C41958e data, @NotNull ExpressionResolver resolver) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensions.m3166e(data.m8299c(), resolver)) {
                m3136r(divItemBuilderResult.m3150a(), divItemBuilderResult.m3149b());
            }
            m36674s(data, resolver);
        }

        /* renamed from: x */
        protected void m36669x(@NotNull Div.C41960g data, @NotNull ExpressionResolver resolver) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            for (Div div : DivCollectionExtensions.m3157n(data.m8297c())) {
                m3136r(div, resolver);
            }
            m36674s(data, resolver);
        }

        /* renamed from: y */
        protected void m36668y(@NotNull Div.C41964k data, @NotNull ExpressionResolver resolver) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensions.m3165f(data.m8293c(), resolver)) {
                m3136r(divItemBuilderResult.m3150a(), divItemBuilderResult.m3149b());
            }
            m36674s(data, resolver);
        }

        /* renamed from: z */
        protected void m36667z(@NotNull Div.C41968o data, @NotNull ExpressionResolver resolver) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            for (DivState.C39938g c39938g : data.m8289c().f104927v) {
                Div div = c39938g.f104941c;
                if (div != null) {
                    m3136r(div, resolver);
                }
            }
            m36674s(data, resolver);
        }
    }

    /* compiled from: DivPreloader.kt */
    @Metadata
    /* renamed from: com.yandex.div.core.w$f */
    /* loaded from: classes8.dex */
    public interface InterfaceC29760f {
        void cancel();
    }

    /* compiled from: DivPreloader.kt */
    @Metadata
    /* renamed from: com.yandex.div.core.w$g */
    /* loaded from: classes8.dex */
    public static final class C29761g implements InterfaceC29760f {
        @NotNull

        /* renamed from: a */
        private final List<InterfaceC29757d> f75930a = new ArrayList();

        /* compiled from: DivPreloader.kt */
        @Metadata
        /* renamed from: com.yandex.div.core.w$g$a */
        /* loaded from: classes8.dex */
        public static final class C29762a implements InterfaceC29757d {

            /* renamed from: b */
            final /* synthetic */ LoadReference f75931b;

            C29762a(LoadReference loadReference) {
                this.f75931b = loadReference;
            }

            @Override // com.yandex.div.core.DivPreloader.InterfaceC29757d
            public void cancel() {
                this.f75931b.cancel();
            }
        }

        /* renamed from: c */
        private final InterfaceC29757d m36664c(LoadReference loadReference) {
            return new C29762a(loadReference);
        }

        /* renamed from: a */
        public final void m36666a(@NotNull LoadReference reference) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            this.f75930a.add(m36664c(reference));
        }

        /* renamed from: b */
        public final void m36665b(@NotNull InterfaceC29757d reference) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            this.f75930a.add(reference);
        }

        @Override // com.yandex.div.core.DivPreloader.InterfaceC29760f
        public void cancel() {
            for (InterfaceC29757d interfaceC29757d : this.f75930a) {
                interfaceC29757d.cancel();
            }
        }
    }

    public DivPreloader(@Nullable DivImagePreloader divImagePreloader, @Nullable DivCustomViewAdapter divCustomViewAdapter, @NotNull DivCustomContainerViewAdapter customContainerViewAdapter, @NotNull DivExtensionController extensionController, @NotNull DivPlayerPreloader videoPreloader) {
        Intrinsics.checkNotNullParameter(customContainerViewAdapter, "customContainerViewAdapter");
        Intrinsics.checkNotNullParameter(extensionController, "extensionController");
        Intrinsics.checkNotNullParameter(videoPreloader, "videoPreloader");
        this.f75913a = divImagePreloader;
        this.f75914b = divCustomViewAdapter;
        this.f75915c = customContainerViewAdapter;
        this.f75916d = extensionController;
        this.f75917e = videoPreloader;
    }

    /* renamed from: i */
    public static /* synthetic */ InterfaceC29760f m36683i(DivPreloader divPreloader, Div div, ExpressionResolver expressionResolver, InterfaceC29754a interfaceC29754a, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                interfaceC29754a = f75912g;
            }
            return divPreloader.m36684h(div, expressionResolver, interfaceC29754a);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: preload");
    }

    @NotNull
    /* renamed from: h */
    public InterfaceC29760f m36684h(@NotNull Div div, @NotNull ExpressionResolver resolver, @NotNull InterfaceC29754a callback) {
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C29756c c29756c = new C29756c(callback);
        InterfaceC29760f m36673t = new C29759e(this, c29756c, callback, resolver).m36673t(div);
        c29756c.m36681e();
        return m36673t;
    }

    /* compiled from: DivPreloader.kt */
    @Metadata
    /* renamed from: com.yandex.div.core.w$d */
    /* loaded from: classes8.dex */
    public interface InterfaceC29757d {
        @NotNull

        /* renamed from: a */
        public static final C29758a f75922a = C29758a.f75923a;

        void cancel();

        /* compiled from: DivPreloader.kt */
        @Metadata
        /* renamed from: com.yandex.div.core.w$d$a */
        /* loaded from: classes8.dex */
        public static final class C29758a {

            /* renamed from: a */
            static final /* synthetic */ C29758a f75923a = new C29758a();
            @NotNull

            /* renamed from: b */
            private static final InterfaceC29757d f75924b = new InterfaceC29757d() { // from class: com.yandex.div.core.x
                @Override // com.yandex.div.core.DivPreloader.InterfaceC29757d
                public final void cancel() {
                    DivPreloader.InterfaceC29757d.C29758a.m36678b();
                }
            };

            private C29758a() {
            }

            @NotNull
            /* renamed from: c */
            public final InterfaceC29757d m36677c() {
                return f75924b;
            }

            /* renamed from: b */
            public static final void m36678b() {
            }
        }
    }

    /* renamed from: b */
    public static final void m36690b(boolean z) {
    }
}
