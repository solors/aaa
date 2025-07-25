package com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p145bg.p146IL;

import android.content.Context;
import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.p151bX.C6494bX;
import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.p154zx.InterfaceC6518bg;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bykv.vk.openvk.bg.bg.IL.bg.IL.bX */
/* loaded from: classes3.dex */
public class C6452bX {

    /* renamed from: bg */
    public static final ConcurrentHashMap<String, C6450IL> f13463bg = new ConcurrentHashMap<>();

    /* renamed from: bg */
    public static synchronized void m91888bg(Context context, C6494bX c6494bX, InterfaceC6518bg.InterfaceC6519bg interfaceC6519bg) {
        synchronized (C6452bX.class) {
            if (c6494bX == null) {
                return;
            }
            ConcurrentHashMap<String, C6450IL> concurrentHashMap = f13463bg;
            C6450IL c6450il = concurrentHashMap.get(c6494bX.yDt());
            if (c6450il == null) {
                c6450il = new C6450IL(context, c6494bX);
                concurrentHashMap.put(c6494bX.yDt(), c6450il);
                c6494bX.m91712bX();
                c6494bX.yDt();
            }
            c6450il.m91893bg(interfaceC6519bg);
            c6494bX.m91712bX();
            c6494bX.yDt();
        }
    }

    /* renamed from: bg */
    public static synchronized void m91887bg(C6494bX c6494bX) {
        synchronized (C6452bX.class) {
            C6450IL remove = f13463bg.remove(c6494bX.yDt());
            if (remove != null) {
                remove.m91891bg(true);
            }
            c6494bX.m91712bX();
            c6494bX.yDt();
        }
    }
}
