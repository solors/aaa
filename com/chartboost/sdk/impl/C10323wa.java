package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.wa */
/* loaded from: classes3.dex */
public final class C10323wa {

    /* renamed from: a */
    public final String f23462a;

    public C10323wa(String actionName) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        this.f23462a = actionName;
    }

    /* renamed from: a */
    public final String m80147a() {
        return this.f23462a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C10323wa) && Intrinsics.m17075f(this.f23462a, ((C10323wa) obj).f23462a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f23462a.hashCode();
    }

    public String toString() {
        String str = this.f23462a;
        return "UrlActionResult(actionName=" + str + ")";
    }
}
