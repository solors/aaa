package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Random;
import org.json.JSONException;

/* renamed from: com.ironsource.xa */
/* loaded from: classes6.dex */
public class C21218xa {

    /* renamed from: d */
    public static final int f54475d = 1;

    /* renamed from: e */
    public static final int f54476e = 2;

    /* renamed from: f */
    public static final String f54477f = "C38FB23A402222A0C17D34A92F971D1F";

    /* renamed from: g */
    public static final String f54478g = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDaUZaiASqhU4+s3JiQaIzVYtC+rZiPX2K+ZRg4C21kBZDNQM5+SEkp5GT5a9W/IR2oz6Q/ucifXcc7QEo5Xl5GX1BAhFI+8KaxPmn5Km5zFdH0aCvrrpDYQpH239Q+2uuUC79G5MpfSIw0zixU4VkF0WbVdHDpgQDds39cPl6cTwIDAQAB";

    /* renamed from: h */
    public static final String f54479h = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";

    /* renamed from: i */
    public static final int f54480i = 32;

    /* renamed from: j */
    private static final C21218xa f54481j = new C21218xa();

    /* renamed from: a */
    private String f54482a = "";

    /* renamed from: b */
    private String f54483b = "";

    /* renamed from: c */
    private String f54484c = "";

    /* renamed from: b */
    public static C21218xa m54153b() {
        return f54481j;
    }

    /* renamed from: a */
    public String m54155a() throws JSONException {
        if (TextUtils.isEmpty(this.f54484c)) {
            try {
                this.f54484c = C19644bj.m59304a(m54151d(), f54478g);
            } catch (Exception e) {
                C20086i9.m57997d().m58003a(e);
                String str = "Session key encryption exception: " + e.getLocalizedMessage();
                IronLog.INTERNAL.error(str);
                throw new JSONException(str);
            }
        }
        return this.f54484c;
    }

    /* renamed from: c */
    public String m54152c() {
        if (TextUtils.isEmpty(this.f54482a)) {
            this.f54482a = f54477f;
        }
        return this.f54482a;
    }

    /* renamed from: d */
    public synchronized String m54151d() {
        if (TextUtils.isEmpty(this.f54483b)) {
            this.f54483b = m54154a(f54479h, 32);
        }
        return this.f54483b;
    }

    /* renamed from: a */
    private String m54154a(String str, int i) {
        StringBuilder sb2 = new StringBuilder();
        Random random = new Random();
        for (int i2 = 0; i2 < i; i2++) {
            sb2.append(str.charAt(random.nextInt(str.length())));
        }
        return sb2.toString();
    }
}
