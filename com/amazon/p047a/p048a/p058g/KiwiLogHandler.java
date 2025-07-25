package com.amazon.p047a.p048a.p058g;

import com.amazon.p047a.p048a.p071o.KiwiLogger;

/* renamed from: com.amazon.a.a.g.b */
/* loaded from: classes2.dex */
public class KiwiLogHandler implements LogHandler {

    /* renamed from: a */
    private static KiwiLogger f2400a = new KiwiLogger("Appstore SDK - Production Mode");

    /* renamed from: d */
    private static String m103125d(String str, String str2) {
        return str + ": " + str2;
    }

    @Override // com.amazon.p047a.p048a.p058g.LogHandler
    /* renamed from: a */
    public boolean mo103124a() {
        return KiwiLogger.f2770a;
    }

    @Override // com.amazon.p047a.p048a.p058g.LogHandler
    /* renamed from: b */
    public boolean mo103121b() {
        return KiwiLogger.f2771b;
    }

    @Override // com.amazon.p047a.p048a.p058g.LogHandler
    /* renamed from: c */
    public boolean mo103119c() {
        return KiwiLogger.m102827b();
    }

    @Override // com.amazon.p047a.p048a.p058g.LogHandler
    /* renamed from: a */
    public void mo103122a(String str, String str2) {
        f2400a.m102829a(m103125d(str, str2));
    }

    @Override // com.amazon.p047a.p048a.p058g.LogHandler
    /* renamed from: b */
    public void mo103120b(String str, String str2) {
        f2400a.m102826b(m103125d(str, str2));
    }

    @Override // com.amazon.p047a.p048a.p058g.LogHandler
    /* renamed from: c */
    public void mo103118c(String str, String str2) {
        f2400a.m102824c(m103125d(str, str2));
    }
}
