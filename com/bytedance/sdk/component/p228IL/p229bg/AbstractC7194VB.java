package com.bytedance.sdk.component.p228IL.p229bg;

import com.bytedance.sdk.component.p228IL.p229bg.p231bg.C7201bg;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.sdk.component.IL.bg.VB */
/* loaded from: classes3.dex */
public abstract class AbstractC7194VB implements Cloneable {

    /* renamed from: IL */
    public long f15512IL;

    /* renamed from: bX */
    public TimeUnit f15513bX;

    /* renamed from: bg */
    public List<InterfaceC7187Kg> f15514bg;
    public long eqN;

    /* renamed from: iR */
    public TimeUnit f15515iR;
    public long ldr;

    /* renamed from: zx */
    public TimeUnit f15516zx;

    public AbstractC7194VB(C7195bg c7195bg) {
        this.f15512IL = c7195bg.f15517IL;
        this.eqN = c7195bg.eqN;
        this.ldr = c7195bg.ldr;
        List<InterfaceC7187Kg> list = c7195bg.f15519bg;
        this.f15513bX = c7195bg.f15518bX;
        this.f15516zx = c7195bg.f15521zx;
        this.f15515iR = c7195bg.f15520iR;
        this.f15514bg = list;
    }

    /* renamed from: IL */
    public C7195bg m89641IL() {
        return new C7195bg(this);
    }

    /* renamed from: bg */
    public abstract InterfaceC7177IL mo89615bg(AbstractC7191Ta abstractC7191Ta);

    /* renamed from: bg */
    public abstract AbstractC7215eqN mo89616bg();

    /* renamed from: com.bytedance.sdk.component.IL.bg.VB$bg */
    /* loaded from: classes3.dex */
    public static final class C7195bg {

        /* renamed from: IL */
        public long f15517IL;

        /* renamed from: bX */
        public TimeUnit f15518bX;

        /* renamed from: bg */
        public final List<InterfaceC7187Kg> f15519bg;
        public long eqN;

        /* renamed from: iR */
        public TimeUnit f15520iR;
        public long ldr;

        /* renamed from: zx */
        public TimeUnit f15521zx;

        public C7195bg() {
            this.f15519bg = new ArrayList();
            this.f15517IL = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f15518bX = timeUnit;
            this.eqN = 10000L;
            this.f15521zx = timeUnit;
            this.ldr = 10000L;
            this.f15520iR = timeUnit;
        }

        /* renamed from: IL */
        public C7195bg m89640IL(long j, TimeUnit timeUnit) {
            this.eqN = j;
            this.f15521zx = timeUnit;
            return this;
        }

        /* renamed from: bX */
        public C7195bg m89639bX(long j, TimeUnit timeUnit) {
            this.ldr = j;
            this.f15520iR = timeUnit;
            return this;
        }

        /* renamed from: bg */
        public C7195bg m89637bg(long j, TimeUnit timeUnit) {
            this.f15517IL = j;
            this.f15518bX = timeUnit;
            return this;
        }

        /* renamed from: bg */
        public C7195bg m89636bg(InterfaceC7187Kg interfaceC7187Kg) {
            this.f15519bg.add(interfaceC7187Kg);
            return this;
        }

        /* renamed from: bg */
        public AbstractC7194VB m89638bg() {
            return C7201bg.m89630bg(this);
        }

        public C7195bg(String str) {
            this.f15519bg = new ArrayList();
            this.f15517IL = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f15518bX = timeUnit;
            this.eqN = 10000L;
            this.f15521zx = timeUnit;
            this.ldr = 10000L;
            this.f15520iR = timeUnit;
        }

        public C7195bg(AbstractC7194VB abstractC7194VB) {
            this.f15519bg = new ArrayList();
            this.f15517IL = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f15518bX = timeUnit;
            this.eqN = 10000L;
            this.f15521zx = timeUnit;
            this.ldr = 10000L;
            this.f15520iR = timeUnit;
            this.f15517IL = abstractC7194VB.f15512IL;
            this.f15518bX = abstractC7194VB.f15513bX;
            this.eqN = abstractC7194VB.eqN;
            this.f15521zx = abstractC7194VB.f15516zx;
            this.ldr = abstractC7194VB.ldr;
            this.f15520iR = abstractC7194VB.f15515iR;
        }
    }
}
