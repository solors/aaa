package com.google.firebase.crashlytics.internal.stacktrace;

/* loaded from: classes4.dex */
public class MiddleOutFallbackStrategy implements StackTraceTrimmingStrategy {

    /* renamed from: a */
    private final int f42965a;

    /* renamed from: b */
    private final StackTraceTrimmingStrategy[] f42966b;

    /* renamed from: c */
    private final MiddleOutStrategy f42967c;

    public MiddleOutFallbackStrategy(int i, StackTraceTrimmingStrategy... stackTraceTrimmingStrategyArr) {
        this.f42965a = i;
        this.f42966b = stackTraceTrimmingStrategyArr;
        this.f42967c = new MiddleOutStrategy(i);
    }

    @Override // com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy
    public StackTraceElement[] getTrimmedStackTrace(StackTraceElement[] stackTraceElementArr) {
        StackTraceTrimmingStrategy[] stackTraceTrimmingStrategyArr;
        if (stackTraceElementArr.length <= this.f42965a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (StackTraceTrimmingStrategy stackTraceTrimmingStrategy : this.f42966b) {
            if (stackTraceElementArr2.length <= this.f42965a) {
                break;
            }
            stackTraceElementArr2 = stackTraceTrimmingStrategy.getTrimmedStackTrace(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > this.f42965a) {
            return this.f42967c.getTrimmedStackTrace(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }
}
