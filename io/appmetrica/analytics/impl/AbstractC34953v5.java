package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* renamed from: io.appmetrica.analytics.impl.v5 */
/* loaded from: classes9.dex */
public abstract class AbstractC34953v5 implements InterfaceC34966vi {

    /* renamed from: a */
    public BaseRequestConfig f95500a;

    /* renamed from: b */
    public final BaseRequestConfig.RequestConfigLoader f95501b;

    /* renamed from: c */
    public C34152Q5 f95502c;

    public AbstractC34953v5(@NonNull BaseRequestConfig.RequestConfigLoader<Object, C34152Q5> requestConfigLoader, @NonNull C34650jl c34650jl, @NonNull ArgumentsMerger<Object, Object> argumentsMerger) {
        this.f95501b = requestConfigLoader;
        C34693la.m21444h().m21433s().m20820a(this);
        m20887a(new C34152Q5(c34650jl, C34693la.m21444h().m21433s(), C34693la.m21444h().m21436p(), argumentsMerger));
    }

    /* renamed from: a */
    public final synchronized void m20887a(@NonNull C34152Q5 c34152q5) {
        this.f95502c = c34152q5;
    }

    @NonNull
    @VisibleForTesting(otherwise = 4)
    /* renamed from: b */
    public final synchronized ArgumentsMerger<Object, Object> m20884b() {
        return (ArgumentsMerger) this.f95502c.componentArguments;
    }

    @NonNull
    /* renamed from: c */
    public final synchronized C34650jl m20883c() {
        return this.f95502c.f93387a;
    }

    /* renamed from: d */
    public final void m20882d() {
        synchronized (this) {
            this.f95500a = null;
        }
    }

    /* renamed from: e */
    public final synchronized void m20881e() {
        this.f95500a = null;
    }

    /* renamed from: a */
    public synchronized void mo20885a(@NonNull Object obj) {
        if (!((ArgumentsMerger) this.f95502c.componentArguments).compareWithOtherArguments(obj)) {
            m20887a(new C34152Q5(m20883c(), C34693la.f94825C.m21433s(), C34693la.f94825C.m21436p(), (ArgumentsMerger) ((ArgumentsMerger) this.f95502c.componentArguments).mergeFrom(obj)));
            m20881e();
        }
    }

    /* renamed from: a */
    public final synchronized void m20886a(@NonNull C34650jl c34650jl) {
        m20887a(new C34152Q5(c34650jl, C34693la.f94825C.m21433s(), C34693la.f94825C.m21436p(), m20884b()));
        m20881e();
    }

    @NonNull
    /* renamed from: a */
    public final synchronized BaseRequestConfig m20888a() {
        if (this.f95500a == null) {
            this.f95500a = this.f95501b.load(this.f95502c);
        }
        return this.f95500a;
    }
}
