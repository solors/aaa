package com.applovin.impl;

import com.applovin.impl.C4061af;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.applovin.impl.y9 */
/* loaded from: classes2.dex */
public final class C5905y9 {

    /* renamed from: c */
    private static final Pattern f12303c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f12304a = -1;

    /* renamed from: b */
    public int f12305b = -1;

    /* renamed from: a */
    public boolean m92785a() {
        return (this.f12304a == -1 || this.f12305b == -1) ? false : true;
    }

    /* renamed from: a */
    public boolean m92783a(C4061af c4061af) {
        for (int i = 0; i < c4061af.m100807c(); i++) {
            C4061af.InterfaceC4063b m100810a = c4061af.m100810a(i);
            if (m100810a instanceof C5597u3) {
                C5597u3 c5597u3 = (C5597u3) m100810a;
                if ("iTunSMPB".equals(c5597u3.f11033c) && m92782a(c5597u3.f11034d)) {
                    return true;
                }
            } else if (m100810a instanceof C5259rb) {
                C5259rb c5259rb = (C5259rb) m100810a;
                if ("com.apple.iTunes".equals(c5259rb.f9416b) && "iTunSMPB".equals(c5259rb.f9417c) && m92782a(c5259rb.f9418d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m92784a(int i) {
        int i2 = i >> 12;
        int i3 = i & 4095;
        if (i2 > 0 || i3 > 0) {
            this.f12304a = i2;
            this.f12305b = i3;
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m92782a(String str) {
        Matcher matcher = f12303c.matcher(str);
        if (matcher.find()) {
            try {
                int parseInt = Integer.parseInt((String) AbstractC5863xp.m93017a((Object) matcher.group(1)), 16);
                int parseInt2 = Integer.parseInt((String) AbstractC5863xp.m93017a((Object) matcher.group(2)), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f12304a = parseInt;
                    this.f12305b = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }
}
