package ie;

import kotlin.Metadata;
import p804nd.C38508r;
import p804nd.Result;

/* compiled from: FastServiceLoader.kt */
@Metadata
/* renamed from: ie.m */
/* loaded from: classes8.dex */
public final class C33644m {

    /* renamed from: a */
    private static final boolean f92113a;

    static {
        Object m14549b;
        try {
            Result.C38506a c38506a = Result.f101870c;
            m14549b = Result.m14549b(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            Result.C38506a c38506a2 = Result.f101870c;
            m14549b = Result.m14549b(C38508r.m14540a(th));
        }
        f92113a = Result.m14543h(m14549b);
    }

    /* renamed from: a */
    public static final boolean m22940a() {
        return f92113a;
    }
}
