package ge;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: SharingStarted.kt */
@Metadata
/* renamed from: ge.j0 */
/* loaded from: classes8.dex */
public interface InterfaceC33330j0 {
    @NotNull

    /* renamed from: a */
    public static final C33331a f90958a = C33331a.f90959a;

    /* compiled from: SharingStarted.kt */
    @Metadata
    /* renamed from: ge.j0$a */
    /* loaded from: classes8.dex */
    public static final class C33331a {

        /* renamed from: a */
        static final /* synthetic */ C33331a f90959a = new C33331a();
        @NotNull

        /* renamed from: b */
        private static final InterfaceC33330j0 f90960b = new C33336k0();
        @NotNull

        /* renamed from: c */
        private static final InterfaceC33330j0 f90961c = new C33339l0();

        private C33331a() {
        }

        /* renamed from: b */
        public static /* synthetic */ InterfaceC33330j0 m24073b(C33331a c33331a, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = 0;
            }
            if ((i & 2) != 0) {
                j2 = Long.MAX_VALUE;
            }
            return c33331a.m24074a(j, j2);
        }

        @NotNull
        /* renamed from: a */
        public final InterfaceC33330j0 m24074a(long j, long j2) {
            return new C33345m0(j, j2);
        }

        @NotNull
        /* renamed from: c */
        public final InterfaceC33330j0 m24072c() {
            return f90960b;
        }

        @NotNull
        /* renamed from: d */
        public final InterfaceC33330j0 m24071d() {
            return f90961c;
        }
    }

    @NotNull
    /* renamed from: a */
    InterfaceC33327h<SharingStarted> mo24056a(@NotNull StateFlow<Integer> stateFlow);
}
