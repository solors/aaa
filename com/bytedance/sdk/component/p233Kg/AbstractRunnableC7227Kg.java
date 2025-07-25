package com.bytedance.sdk.component.p233Kg;

/* renamed from: com.bytedance.sdk.component.Kg.Kg */
/* loaded from: classes3.dex */
public abstract class AbstractRunnableC7227Kg implements Comparable<AbstractRunnableC7227Kg>, Runnable {

    /* renamed from: IL */
    private String f15592IL;

    /* renamed from: bg */
    private int f15593bg;

    public AbstractRunnableC7227Kg(String str, int i) {
        this.f15593bg = 0;
        this.f15593bg = i == 0 ? 5 : i;
        this.f15592IL = str;
    }

    public String getName() {
        return this.f15592IL;
    }

    public int getPriority() {
        return this.f15593bg;
    }

    public void setPriority(int i) {
        this.f15593bg = i;
    }

    @Override // java.lang.Comparable
    public int compareTo(AbstractRunnableC7227Kg abstractRunnableC7227Kg) {
        if (getPriority() < abstractRunnableC7227Kg.getPriority()) {
            return 1;
        }
        return getPriority() >= abstractRunnableC7227Kg.getPriority() ? -1 : 0;
    }

    public AbstractRunnableC7227Kg(String str) {
        this.f15593bg = 5;
        this.f15592IL = str;
    }
}
