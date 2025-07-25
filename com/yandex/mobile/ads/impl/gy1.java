package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes8.dex */
public final class gy1 implements ym1<String> {
    @Override // com.yandex.mobile.ads.impl.ym1
    /* renamed from: a */
    public final String mo26832a(nm1 networkResponse) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        byte[] m29983a = networkResponse.m31465a().m29983a();
        if (m29983a != null) {
            try {
                return new String(m29983a, wc0.m27984a(networkResponse.m31464b()));
            } catch (Exception unused) {
                return new String(m29983a, Charsets.UTF_8);
            }
        }
        return null;
    }
}
