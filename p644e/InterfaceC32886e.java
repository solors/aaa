package p644e;

import android.content.Context;
import coil.memory.MemoryCache;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1003v.C44486s;
import p1003v.ImageLoaderOptions;
import p1003v.Requests;
import p1077ze.InterfaceC45299e;
import p1077ze.OkHttpClient;
import p644e.InterfaceC32878c;
import p706i.DiskCache;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;
import p837q.AbstractC39308j;
import p837q.C39305i;
import p837q.DefaultRequestOptions;
import p837q.InterfaceC39303e;

/* compiled from: ImageLoader.kt */
@Metadata
/* renamed from: e.e */
/* loaded from: classes2.dex */
public interface InterfaceC32886e {

    /* compiled from: ImageLoader.kt */
    @Metadata
    /* renamed from: e.e$a */
    /* loaded from: classes2.dex */
    public static final class C32887a {
        @NotNull

        /* renamed from: a */
        private final Context f89644a;
        @NotNull

        /* renamed from: b */
        private DefaultRequestOptions f89645b = Requests.m2836b();
        @Nullable

        /* renamed from: c */
        private InterfaceC38501j<? extends MemoryCache> f89646c = null;
        @Nullable

        /* renamed from: d */
        private InterfaceC38501j<? extends DiskCache> f89647d = null;
        @Nullable

        /* renamed from: e */
        private InterfaceC38501j<? extends InterfaceC45299e.InterfaceC45300a> f89648e = null;
        @Nullable

        /* renamed from: f */
        private InterfaceC32878c.InterfaceC32882d f89649f = null;
        @Nullable

        /* renamed from: g */
        private ComponentRegistry f89650g = null;
        @NotNull

        /* renamed from: h */
        private ImageLoaderOptions f89651h = new ImageLoaderOptions(false, false, false, 0, null, 31, null);

        /* compiled from: ImageLoader.kt */
        @Metadata
        /* renamed from: e.e$a$a */
        /* loaded from: classes2.dex */
        static final class C32888a extends Lambda implements Functions<MemoryCache> {
            C32888a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Functions
            @NotNull
            /* renamed from: b */
            public final MemoryCache invoke() {
                return new MemoryCache.C3477a(C32887a.this.f89644a).m103423a();
            }
        }

        /* compiled from: ImageLoader.kt */
        @Metadata
        /* renamed from: e.e$a$b */
        /* loaded from: classes2.dex */
        static final class C32889b extends Lambda implements Functions<DiskCache> {
            C32889b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Functions
            @NotNull
            /* renamed from: b */
            public final DiskCache invoke() {
                return C44486s.f116764a.m2794a(C32887a.this.f89644a);
            }
        }

        /* compiled from: ImageLoader.kt */
        @Metadata
        /* renamed from: e.e$a$c */
        /* loaded from: classes2.dex */
        static final class C32890c extends Lambda implements Functions<OkHttpClient> {

            /* renamed from: g */
            public static final C32890c f89654g = new C32890c();

            C32890c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Functions
            @NotNull
            /* renamed from: b */
            public final OkHttpClient invoke() {
                return new OkHttpClient();
            }
        }

        public C32887a(@NotNull Context context) {
            this.f89644a = context.getApplicationContext();
        }

        @NotNull
        /* renamed from: b */
        public final InterfaceC32886e m25565b() {
            Context context = this.f89644a;
            DefaultRequestOptions defaultRequestOptions = this.f89645b;
            InterfaceC38501j<? extends MemoryCache> interfaceC38501j = this.f89646c;
            if (interfaceC38501j == null) {
                interfaceC38501j = LazyJVM.m14554a(new C32888a());
            }
            InterfaceC38501j<? extends MemoryCache> interfaceC38501j2 = interfaceC38501j;
            InterfaceC38501j<? extends DiskCache> interfaceC38501j3 = this.f89647d;
            if (interfaceC38501j3 == null) {
                interfaceC38501j3 = LazyJVM.m14554a(new C32889b());
            }
            InterfaceC38501j<? extends DiskCache> interfaceC38501j4 = interfaceC38501j3;
            InterfaceC38501j<? extends InterfaceC45299e.InterfaceC45300a> interfaceC38501j5 = this.f89648e;
            if (interfaceC38501j5 == null) {
                interfaceC38501j5 = LazyJVM.m14554a(C32890c.f89654g);
            }
            InterfaceC38501j<? extends InterfaceC45299e.InterfaceC45300a> interfaceC38501j6 = interfaceC38501j5;
            InterfaceC32878c.InterfaceC32882d interfaceC32882d = this.f89649f;
            if (interfaceC32882d == null) {
                interfaceC32882d = InterfaceC32878c.InterfaceC32882d.f89642b;
            }
            InterfaceC32878c.InterfaceC32882d interfaceC32882d2 = interfaceC32882d;
            ComponentRegistry componentRegistry = this.f89650g;
            if (componentRegistry == null) {
                componentRegistry = new ComponentRegistry();
            }
            return new RealImageLoader(context, defaultRequestOptions, interfaceC38501j2, interfaceC38501j4, interfaceC38501j6, interfaceC32882d2, componentRegistry, this.f89651h, null);
        }
    }

    @NotNull
    /* renamed from: a */
    InterfaceC39303e mo25559a(@NotNull C39305i c39305i);

    @NotNull
    /* renamed from: b */
    DefaultRequestOptions mo25558b();

    @Nullable
    /* renamed from: c */
    Object mo25557c(@NotNull C39305i c39305i, @NotNull Continuation<? super AbstractC39308j> continuation);

    @Nullable
    /* renamed from: d */
    MemoryCache mo25556d();

    @NotNull
    ComponentRegistry getComponents();
}
