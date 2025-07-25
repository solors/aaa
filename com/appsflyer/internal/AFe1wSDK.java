package com.appsflyer.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class AFe1wSDK {

    @Metadata
    /* renamed from: com.appsflyer.internal.AFe1wSDK$1 */
    /* loaded from: classes2.dex */
    static final class C62521 extends Lambda implements Function1<StackTraceElement, CharSequence> {
        public static final C62521 AFInAppEventParameterName = new C62521();

        C62521() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: valueOf */
        public final CharSequence invoke(@NotNull StackTraceElement stackTraceElement) {
            Intrinsics.checkNotNullParameter(stackTraceElement, "");
            return "at ".concat(String.valueOf(stackTraceElement));
        }
    }

    @NotNull
    public static final List<StackTraceElement> AFInAppEventParameterName(@NotNull Throwable th) {
        boolean m16624M;
        Intrinsics.checkNotNullParameter(th, "");
        StackTraceElement[] stackTrace = th.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "");
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "");
            m16624M = StringsJVM.m16624M(className, "com.appsflyer", false, 2, null);
            if (!m16624M) {
                stackTraceElement = null;
            }
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
        }
        return arrayList;
    }
}
