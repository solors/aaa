package com.bytedance.sdk.component.ldr.p261bg.p274zx;

import java.util.UUID;

/* renamed from: com.bytedance.sdk.component.ldr.bg.zx.zx */
/* loaded from: classes3.dex */
public abstract class AbstractRunnableC7729zx implements Comparable<AbstractRunnableC7729zx>, Runnable {

    /* renamed from: bX */
    private String f16899bX;

    /* renamed from: bg */
    private int f16900bg = 5;

    /* renamed from: IL */
    private String f16898IL = UUID.randomUUID().toString() + "-" + String.valueOf(System.nanoTime());

    public AbstractRunnableC7729zx(String str) {
        this.f16899bX = str;
    }

    /* renamed from: bg */
    public void m87930bg(int i) {
        this.f16900bg = i;
    }

    /* renamed from: bg */
    public int m87931bg() {
        return this.f16900bg;
    }

    @Override // java.lang.Comparable
    /* renamed from: bg */
    public int compareTo(AbstractRunnableC7729zx abstractRunnableC7729zx) {
        if (m87931bg() < abstractRunnableC7729zx.m87931bg()) {
            return 1;
        }
        return m87931bg() >= abstractRunnableC7729zx.m87931bg() ? -1 : 0;
    }
}
