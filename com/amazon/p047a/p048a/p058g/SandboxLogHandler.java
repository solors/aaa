package com.amazon.p047a.p048a.p058g;

import android.util.Log;

/* renamed from: com.amazon.a.a.g.d */
/* loaded from: classes2.dex */
public class SandboxLogHandler implements LogHandler {

    /* renamed from: a */
    private static final boolean f2401a = true;

    /* renamed from: b */
    private static final boolean f2402b = true;

    /* renamed from: c */
    private static final boolean f2403c = true;

    @Override // com.amazon.p047a.p048a.p058g.LogHandler
    /* renamed from: a */
    public boolean mo103124a() {
        return true;
    }

    @Override // com.amazon.p047a.p048a.p058g.LogHandler
    /* renamed from: b */
    public boolean mo103121b() {
        return true;
    }

    @Override // com.amazon.p047a.p048a.p058g.LogHandler
    /* renamed from: c */
    public boolean mo103119c() {
        return true;
    }

    @Override // com.amazon.p047a.p048a.p058g.LogHandler
    /* renamed from: a */
    public void mo103122a(String str, String str2) {
        Log.d(str, m103123a(str2));
    }

    @Override // com.amazon.p047a.p048a.p058g.LogHandler
    /* renamed from: b */
    public void mo103120b(String str, String str2) {
        Log.e(str, m103123a(str2));
    }

    @Override // com.amazon.p047a.p048a.p058g.LogHandler
    /* renamed from: c */
    public void mo103118c(String str, String str2) {
        Log.v(str, m103123a(str2));
    }

    /* renamed from: a */
    private static String m103123a(String str) {
        return "Appstore SDK - Sandbox Mode: " + str;
    }
}
