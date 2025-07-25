package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.ha */
/* loaded from: classes9.dex */
public final class C34585ha implements InterfaceC34110Ob {
    @Override // io.appmetrica.analytics.impl.InterfaceC34110Ob
    @Nullable
    /* renamed from: a */
    public final C34346Y8 mo21589a(@Nullable C34663k7 c34663k7) {
        Double d;
        C34346Y8 c34346y8 = null;
        if (c34663k7 != null) {
            d = c34663k7.f94767b;
        } else {
            d = null;
        }
        if (d != null && c34663k7.f94768c != null) {
            c34346y8 = new C34346Y8();
            c34346y8.f93812b = c34663k7.f94767b.doubleValue();
            c34346y8.f93811a = c34663k7.f94768c.doubleValue();
            Integer num = c34663k7.f94769d;
            if (num != null) {
                c34346y8.f93817g = num.intValue();
            }
            Integer num2 = c34663k7.f94770e;
            if (num2 != null) {
                c34346y8.f93815e = num2.intValue();
            }
            Integer num3 = c34663k7.f94771f;
            if (num3 != null) {
                c34346y8.f93814d = num3.intValue();
            }
            Integer num4 = c34663k7.f94772g;
            if (num4 != null) {
                c34346y8.f93816f = num4.intValue();
            }
            Long l = c34663k7.f94773h;
            if (l != null) {
                c34346y8.f93813c = TimeUnit.MILLISECONDS.toSeconds(l.longValue());
            }
            String str = c34663k7.f94774i;
            if (str != null) {
                if (Intrinsics.m17075f(str, "gps")) {
                    c34346y8.f93818h = 1;
                } else if (Intrinsics.m17075f(str, "network")) {
                    c34346y8.f93818h = 2;
                }
            }
            String str2 = c34663k7.f94775j;
            if (str2 != null) {
                c34346y8.f93819i = str2;
            }
        }
        return c34346y8;
    }
}
