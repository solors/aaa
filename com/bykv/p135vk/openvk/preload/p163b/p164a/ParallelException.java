package com.bykv.p135vk.openvk.preload.p163b.p164a;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bykv.vk.openvk.preload.b.a.a */
/* loaded from: classes3.dex */
public final class ParallelException extends Exception {

    /* renamed from: a */
    private List<Throwable> f13895a;

    public ParallelException(List<Throwable> list) {
        this.f13895a = list;
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Throwable th : list) {
            m91475a(th, arrayList);
        }
        setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[arrayList.size()]));
    }

    /* renamed from: a */
    private static void m91475a(Throwable th, List<StackTraceElement> list) {
        while (th != null) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            for (int i = 0; i < length; i++) {
                StackTraceElement stackTraceElement = stackTrace[i];
                if (i == 0) {
                    String message = th.getMessage();
                    StringBuilder sb2 = new StringBuilder("\b\b\b\nCaused by:");
                    if (message == null) {
                        message = "";
                    }
                    sb2.append(message);
                    sb2.append("\n\t");
                    sb2.append(stackTraceElement.getClassName());
                    list.add(new StackTraceElement(sb2.toString(), stackTraceElement.getMethodName(), stackTraceElement.getFileName(), stackTraceElement.getLineNumber()));
                } else {
                    list.add(stackTraceElement);
                }
            }
            th = th.getCause();
        }
    }
}
