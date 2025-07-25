package com.bytedance.sdk.component.p233Kg.p235bX;

/* renamed from: com.bytedance.sdk.component.Kg.bX.IL */
/* loaded from: classes3.dex */
public abstract class AbstractRunnableC7230IL implements Comparable<AbstractRunnableC7230IL>, Runnable {

    /* renamed from: IL */
    private String f15597IL;

    /* renamed from: bX */
    private Runnable f15598bX;

    /* renamed from: bg */
    private int f15599bg;
    private long eqN;
    private long ldr;

    /* renamed from: zx */
    private long f15600zx;

    public AbstractRunnableC7230IL(String str) {
        this.f15599bg = 5;
        this.f15597IL = str;
    }

    /* renamed from: IL */
    public String m89552IL() {
        return this.f15597IL;
    }

    /* renamed from: Kg */
    public Runnable m89550Kg() {
        return this.f15598bX;
    }

    /* renamed from: bX */
    public long m89549bX() {
        return this.eqN;
    }

    /* renamed from: bg */
    public void m89546bg(int i) {
        this.f15599bg = i;
    }

    public long eqN() {
        return this.f15600zx;
    }

    /* renamed from: iR */
    public long m89543iR() {
        return this.ldr - this.f15600zx;
    }

    public long ldr() {
        return this.f15600zx - this.eqN;
    }

    /* renamed from: zx */
    public long m89542zx() {
        return this.ldr;
    }

    /* renamed from: IL */
    public void m89551IL(long j) {
        this.f15600zx = j;
    }

    /* renamed from: bX */
    public void m89548bX(long j) {
        this.ldr = j;
    }

    /* renamed from: bg */
    public int m89547bg() {
        return this.f15599bg;
    }

    @Override // java.lang.Comparable
    /* renamed from: bg */
    public int compareTo(AbstractRunnableC7230IL abstractRunnableC7230IL) {
        if (m89547bg() < abstractRunnableC7230IL.m89547bg()) {
            return 1;
        }
        return m89547bg() >= abstractRunnableC7230IL.m89547bg() ? -1 : 0;
    }

    public AbstractRunnableC7230IL(int i, String str) {
        this.f15599bg = i;
        this.f15597IL = str;
    }

    /* renamed from: bg */
    public void m89545bg(long j) {
        this.eqN = j;
    }

    public AbstractRunnableC7230IL(String str, Runnable runnable) {
        this.f15599bg = 5;
        this.f15597IL = str;
        this.f15598bX = runnable;
    }
}
