package ec;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C37572z0;
import org.jetbrains.annotations.NotNull;
import p761kc.C37490t;
import p761kc.HttpStatusCode;
import p849qc.KtorSimpleLoggerJvm;
import p852qf.InterfaceC39416a;

/* compiled from: HttpRedirect.kt */
@Metadata
/* renamed from: ec.r */
/* loaded from: classes9.dex */
public final class C33022r {
    @NotNull

    /* renamed from: a */
    private static final Set<C37490t> f90005a;
    @NotNull

    /* renamed from: b */
    private static final InterfaceC39416a f90006b;

    static {
        Set<C37490t> m17119j;
        C37490t.C37491a c37491a = C37490t.f99030b;
        m17119j = C37572z0.m17119j(c37491a.m17854a(), c37491a.m17853b());
        f90005a = m17119j;
        f90006b = KtorSimpleLoggerJvm.m12789a("io.ktor.client.plugins.HttpRedirect");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m25263d(HttpStatusCode httpStatusCode) {
        boolean z;
        boolean z2;
        boolean z3;
        int m17815e0 = httpStatusCode.m17815e0();
        HttpStatusCode.C37493a c37493a = HttpStatusCode.f99078d;
        if (m17815e0 == c37493a.m17747s().m17815e0() || m17815e0 == c37493a.m17755k().m17815e0()) {
            z = true;
        } else {
            z = false;
        }
        if (z || m17815e0 == c37493a.m17775S().m17815e0()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || m17815e0 == c37493a.m17788F().m17815e0()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 && m17815e0 != c37493a.m17779O().m17815e0()) {
            return false;
        }
        return true;
    }
}
