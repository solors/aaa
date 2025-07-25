package se;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringNumberConversions;
import p804nd.C38508r;
import p804nd.Result;

@Metadata
/* renamed from: se.i */
/* loaded from: classes8.dex */
public final class ArrayPools {

    /* renamed from: a */
    private static final int f111843a;

    static {
        Object m14549b;
        int i;
        Integer m16640m;
        try {
            Result.C38506a c38506a = Result.f101870c;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            Intrinsics.checkNotNullExpressionValue(property, "getProperty(\"kotlinx.ser…lization.json.pool.size\")");
            m16640m = StringNumberConversions.m16640m(property);
            m14549b = Result.m14549b(m16640m);
        } catch (Throwable th) {
            Result.C38506a c38506a2 = Result.f101870c;
            m14549b = Result.m14549b(C38508r.m14540a(th));
        }
        if (Result.m14544g(m14549b)) {
            m14549b = null;
        }
        Integer num = (Integer) m14549b;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 2097152;
        }
        f111843a = i;
    }
}
