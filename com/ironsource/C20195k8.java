package com.ironsource;

import java.util.ArrayList;

/* renamed from: com.ironsource.k8 */
/* loaded from: classes6.dex */
public class C20195k8 {

    /* renamed from: a */
    private EnumC20196a f50827a = EnumC20196a.NOT_READY;

    /* renamed from: b */
    private ArrayList f50828b = new ArrayList();

    /* renamed from: c */
    private String f50829c;

    /* renamed from: com.ironsource.k8$a */
    /* loaded from: classes6.dex */
    enum EnumC20196a {
        NOT_READY,
        READY
    }

    public C20195k8(String str) {
        this.f50829c = str;
    }

    /* renamed from: a */
    public synchronized void m57679a() {
        Object[] array = this.f50828b.toArray();
        for (int i = 0; i < array.length; i++) {
            ((Runnable) array[i]).run();
            array[i] = null;
        }
        this.f50828b.clear();
    }

    /* renamed from: b */
    public synchronized void m57677b() {
        this.f50827a = EnumC20196a.NOT_READY;
    }

    /* renamed from: c */
    public synchronized void m57676c() {
        this.f50827a = EnumC20196a.READY;
    }

    /* renamed from: a */
    public synchronized void m57678a(Runnable runnable) {
        if (this.f50827a != EnumC20196a.READY) {
            this.f50828b.add(runnable);
        } else {
            runnable.run();
        }
    }
}
