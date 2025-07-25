package p657ed;

import ad.Flowable;
import p642dd.ObjectHelper;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ed.a */
/* loaded from: classes9.dex */
public abstract class AbstractFlowableWithUpstream<T, R> extends Flowable<R> {

    /* renamed from: b */
    protected final Flowable<T> f90113b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractFlowableWithUpstream(Flowable<T> flowable) {
        this.f90113b = (Flowable) ObjectHelper.m25661a(flowable, "source is null");
    }
}
