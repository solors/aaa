package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Hk */
/* loaded from: classes9.dex */
public final class C33951Hk {

    /* renamed from: a */
    public final String f92972a;

    /* renamed from: b */
    public final String f92973b;

    /* renamed from: c */
    public final Integer f92974c;

    /* renamed from: d */
    public final Integer f92975d;

    /* renamed from: e */
    public final String f92976e;

    /* renamed from: f */
    public final Boolean f92977f;

    public C33951Hk(String str, String str2, Integer num, Integer num2, String str3, Boolean bool) {
        this.f92972a = str;
        this.f92973b = str2;
        this.f92974c = num;
        this.f92975d = num2;
        this.f92976e = str3;
        this.f92977f = bool;
    }

    public C33951Hk(StackTraceElement stackTraceElement) {
        this(stackTraceElement.getClassName(), stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber()), null, stackTraceElement.getMethodName(), Boolean.valueOf(stackTraceElement.isNativeMethod()));
    }
}
