package p026b3;

import java.util.List;
import java.util.Map;

/* renamed from: b3.j */
/* loaded from: classes5.dex */
public class HSResponse {

    /* renamed from: a */
    private final int f1574a;

    /* renamed from: b */
    private final String f1575b;

    /* renamed from: c */
    private final Map<String, List<String>> f1576c;

    /* compiled from: HSResponse.java */
    /* renamed from: b3.j$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC3348a {

        /* renamed from: a */
        public static final Integer f1577a = 200;

        /* renamed from: b */
        public static final Integer f1578b = 304;

        /* renamed from: c */
        public static final Integer f1579c = 400;

        /* renamed from: d */
        public static final Integer f1580d = 401;

        /* renamed from: e */
        public static final Integer f1581e = 441;

        /* renamed from: f */
        public static final Integer f1582f = 443;
    }

    public HSResponse(int i, String str, Map<String, List<String>> map) {
        this.f1574a = i;
        this.f1575b = str;
        this.f1576c = map;
    }

    /* renamed from: a */
    public String m103958a() {
        return this.f1575b;
    }

    /* renamed from: b */
    public int m103957b() {
        return this.f1574a;
    }

    /* renamed from: c */
    public boolean m103956c() {
        int i = this.f1574a;
        if (i >= 200 && i < 300) {
            return true;
        }
        return false;
    }
}
