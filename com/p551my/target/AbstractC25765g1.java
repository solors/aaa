package com.p551my.target;

import java.util.ArrayList;

/* renamed from: com.my.target.g1 */
/* loaded from: classes7.dex */
public abstract class AbstractC25765g1 extends AbstractC25756fa {

    /* renamed from: d */
    public final long f66866d;

    /* renamed from: e */
    public long f66867e;

    public AbstractC25765g1(InterfaceC25856k2 interfaceC25856k2, ArrayList arrayList, long j) {
        super(interfaceC25856k2, arrayList);
        this.f66867e = 0L;
        this.f66866d = j;
    }

    /* renamed from: a */
    public final boolean m43883a(boolean z) {
        if (!z) {
            this.f66867e = 0L;
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f66867e == 0) {
            this.f66867e = currentTimeMillis;
        }
        if (currentTimeMillis - this.f66867e < this.f66866d) {
            AbstractC25846ja.m43677b("ViewabilityTracker: ContinuousVisibilityBaseTracker", "view continuous visibility < " + this.f66866d + " millis");
            return false;
        }
        AbstractC25846ja.m43677b("ViewabilityTracker: ContinuousVisibilityBaseTracker", "view continuous visible for " + this.f66866d + " millis");
        return true;
    }
}
