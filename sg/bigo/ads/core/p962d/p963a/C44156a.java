package sg.bigo.ads.core.p962d.p963a;

import java.util.Arrays;
import java.util.Map;
import sg.bigo.ads.api.core.C43579q;
import sg.bigo.ads.common.utils.C43828k;

/* renamed from: sg.bigo.ads.core.d.a.a */
/* loaded from: classes10.dex */
public final class C44156a extends AbstractC44161b {
    public C44156a(C43579q c43579q, C44172d[] c44172dArr, C44172d[] c44172dArr2, C44172d[] c44172dArr3, C44172d[] c44172dArr4, Map<String, String> map) {
        super(c43579q);
        this.f115889a.addAll(Arrays.asList(c44172dArr));
        this.f115890b.addAll(Arrays.asList(c44172dArr2));
        this.f115891c.addAll(Arrays.asList(c44172dArr3));
        this.f115892d.addAll(Arrays.asList(c44172dArr4));
        for (Map.Entry<String, String> entry : map.entrySet()) {
            m3798a(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: a */
    public final void m3800a(Map<String, String> map) {
        if (C43828k.m4873a(map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            m3798a(entry.getKey(), entry.getValue());
        }
    }
}
