package com.apm.insight.entity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.NpthBus;
import com.apm.insight.p130l.App;

/* renamed from: com.apm.insight.entity.c */
/* loaded from: classes2.dex */
public final class EventBody extends CrashBody {

    /* renamed from: a */
    private String f3744a;

    private EventBody(String str) {
        this.f3744a = str;
    }

    @NonNull
    /* renamed from: a */
    public static EventBody m101925a(@NonNull StackTraceElement stackTraceElement, @NonNull String str, @Nullable String str2, @NonNull String str3, boolean z, String str4, String str5) {
        EventBody eventBody = new EventBody(str5);
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        int lineNumber = stackTraceElement.getLineNumber();
        eventBody.m101960a("event_type", (Object) "exception");
        eventBody.m101960a("log_type", (Object) str5);
        eventBody.m101960a("timestamp", Long.valueOf(System.currentTimeMillis()));
        eventBody.m101960a("crash_time", Long.valueOf(System.currentTimeMillis()));
        eventBody.m101960a("class_ref", (Object) className);
        eventBody.m101960a("method", (Object) methodName);
        eventBody.m101960a("line_num", Integer.valueOf(lineNumber));
        eventBody.m101960a("stack", (Object) str);
        eventBody.m101960a("exception_type", (Object) 1);
        eventBody.m101960a("ensure_type", (Object) str4);
        eventBody.m101960a("is_core", Integer.valueOf(z ? 1 : 0));
        eventBody.m101960a("message", (Object) str2);
        eventBody.m101960a("process_name", (Object) App.m101754d(NpthBus.m102011g()));
        eventBody.m101960a("crash_thread_name", (Object) str3);
        HeaderCombiner.m101922b(eventBody.m101944c());
        return eventBody;
    }
}
