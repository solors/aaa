package com.bytedance.sdk.component.p228IL.p229bg;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.IL.bg.zx */
/* loaded from: classes3.dex */
public final class C7223zx extends C7221yDt {

    /* renamed from: IL */
    List<String> f15582IL;

    /* renamed from: bg */
    List<String> f15583bg;

    C7223zx(List<String> list, List<String> list2) {
        this.f15583bg = list;
        this.f15582IL = list2;
    }

    /* renamed from: com.bytedance.sdk.component.IL.bg.zx$bg */
    /* loaded from: classes3.dex */
    public static final class C7224bg {

        /* renamed from: bg */
        private final List<String> f15585bg = new ArrayList();

        /* renamed from: IL */
        private final List<String> f15584IL = new ArrayList();

        /* renamed from: bg */
        public C7224bg m89557bg(String str, String str2) {
            this.f15585bg.add(str);
            this.f15584IL.add(str2);
            return this;
        }

        /* renamed from: bg */
        public C7223zx m89558bg() {
            return new C7223zx(this.f15585bg, this.f15584IL);
        }
    }
}
