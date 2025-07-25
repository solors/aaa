package com.amazon.p047a.p048a.p065m;

import com.amazon.p047a.p048a.p056e.Expirable;
import java.util.Date;

/* renamed from: com.amazon.a.a.m.a */
/* loaded from: classes2.dex */
public abstract class ExpirableValue extends Expirable<ExpirableValue> {

    /* renamed from: b */
    private final Object f2516b;

    /* renamed from: c */
    private final Date f2517c;

    public ExpirableValue(Object obj, Date date) {
        this.f2516b = obj;
        this.f2517c = date;
    }

    @Override // com.amazon.p047a.p048a.p056e.Expirable
    /* renamed from: a */
    public final Date mo103015a() {
        return this.f2517c;
    }

    /* renamed from: h */
    public final Object m103014h() {
        return this.f2516b;
    }
}
