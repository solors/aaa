package com.bytedance.sdk.component.p233Kg;

/* renamed from: com.bytedance.sdk.component.Kg.zx */
/* loaded from: classes3.dex */
public class C7257zx {

    /* renamed from: bg */
    private static InterfaceC7251eo f15671bg = new InterfaceC7251eo() { // from class: com.bytedance.sdk.component.Kg.zx.1
        @Override // com.bytedance.sdk.component.p233Kg.InterfaceC7251eo
        public ThreadFactoryC7228WR createThreadFactory(int i, String str) {
            return new ThreadFactoryC7228WR(i, str);
        }
    };

    /* renamed from: bg */
    public static void m89443bg(InterfaceC7251eo interfaceC7251eo) {
        f15671bg = interfaceC7251eo;
    }

    /* renamed from: bg */
    public static InterfaceC7251eo m89444bg() {
        return f15671bg;
    }
}
