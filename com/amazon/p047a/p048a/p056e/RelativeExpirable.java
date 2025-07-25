package com.amazon.p047a.p048a.p056e;

import com.amazon.p047a.p048a.p056e.Expirable;
import com.amazon.p047a.p048a.p071o.KiwiLogger;
import java.util.Date;

/* renamed from: com.amazon.a.a.e.c */
/* loaded from: classes2.dex */
public abstract class RelativeExpirable<T extends Expirable<T>> extends Expirable<T> {

    /* renamed from: b */
    private static final KiwiLogger f2390b = new KiwiLogger("RelativeExpirable");

    /* renamed from: c */
    private static final long f2391c = 1000;

    /* renamed from: d */
    private final Date f2392d = new Date();

    @Override // com.amazon.p047a.p048a.p056e.Expirable
    /* renamed from: a */
    public final Date mo103015a() {
        KiwiLogger kiwiLogger = f2390b;
        kiwiLogger.m102829a("RelativeExpiration duration: " + mo102471h() + ", expirable: " + this);
        Date date = new Date(this.f2392d.getTime() + (mo102471h() * 1000));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Expiration should occur at time: ");
        sb2.append(date);
        kiwiLogger.m102829a(sb2.toString());
        return date;
    }

    /* renamed from: h */
    protected abstract long mo102471h();
}
