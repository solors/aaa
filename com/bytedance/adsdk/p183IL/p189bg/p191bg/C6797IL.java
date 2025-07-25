package com.bytedance.adsdk.p183IL.p189bg.p191bg;

import android.graphics.Path;
import com.bytedance.adsdk.p183IL.ldr.C6863ldr;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.adsdk.IL.bg.bg.IL */
/* loaded from: classes3.dex */
public class C6797IL {

    /* renamed from: bg */
    private final List<C6815tC> f14522bg = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public void m90809bg(C6815tC c6815tC) {
        this.f14522bg.add(c6815tC);
    }

    /* renamed from: bg */
    public void m90810bg(Path path) {
        for (int size = this.f14522bg.size() - 1; size >= 0; size--) {
            C6863ldr.m90612bg(path, this.f14522bg.get(size));
        }
    }
}
