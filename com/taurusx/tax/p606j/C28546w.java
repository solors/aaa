package com.taurusx.tax.p606j;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.common.primitives.SignedBytes;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.log.LogUtil;
import java.util.EnumSet;
import java.util.Iterator;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.j.w */
/* loaded from: classes7.dex */
public class C28546w {

    /* renamed from: d */
    public static final EnumSet<EnumC28538u> f73996d = EnumSet.of(EnumC28538u.HANDLE_PHONE_SCHEME, EnumC28538u.OPEN_APP_MARKET, EnumC28538u.OPEN_NATIVE_BROWSER, EnumC28538u.FOLLOW_DEEP_LINK_WITH_FALLBACK, EnumC28538u.FOLLOW_DEEP_LINK);

    /* renamed from: e */
    public static final InterfaceC28548b f73997e = new C28547a();

    /* renamed from: a */
    public EnumSet<EnumC28538u> f73998a;

    /* renamed from: b */
    public InterfaceC28548b f73999b;

    /* renamed from: c */
    public boolean f74000c = false;

    /* renamed from: com.taurusx.tax.j.w$b */
    /* loaded from: classes7.dex */
    public interface InterfaceC28548b {
        /* renamed from: a */
        void mo37979a(String str, EnumC28538u enumC28538u);

        /* renamed from: b */
        void mo37978b(String str, EnumC28538u enumC28538u);
    }

    public C28546w(EnumSet<EnumC28538u> enumSet, InterfaceC28548b interfaceC28548b) {
        this.f73998a = EnumSet.copyOf((EnumSet) enumSet);
        this.f73999b = interfaceC28548b;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC28548b m37982a() {
        return f73997e;
    }

    /* renamed from: a */
    public boolean m37981a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            C28162a.f73047a.m23824a(new byte[]{99, 113, 86, 96, 79, 117, 86, 96, 70, 37, 86, 106, 2, 109, 67, 107, 70, 105, 71, 37, 71, 104, 82, 113, 91, 37, 87, 119, 78, 43}, new byte[]{34, 5});
            m37980a(str, null, null);
            return false;
        }
        EnumC28538u enumC28538u = EnumC28538u.NOOP;
        Uri parse = Uri.parse(str);
        Iterator<E> it = this.f73998a.iterator();
        while (it.hasNext()) {
            EnumC28538u enumC28538u2 = (EnumC28538u) it.next();
            if (enumC28538u2.shouldTryHandlingUrl(parse)) {
                try {
                    enumC28538u2.handleUrl(this, context, parse);
                    if (!this.f74000c) {
                        this.f73999b.mo37978b(parse.toString(), enumC28538u2);
                        this.f74000c = true;
                    }
                    return true;
                } catch (Exception e) {
                    StringFogImpl stringFogImpl = C28162a.f73047a;
                    String m23824a = stringFogImpl.m23824a(new byte[]{20, -76, 21, -89, 21, -90, 24}, new byte[]{96, -43});
                    LogUtil.m37901iv(m23824a, stringFogImpl.m23824a(new byte[]{-66, 115, -87, 110, -87, 33, -31, 33}, new byte[]{-37, 1}) + e);
                    enumC28538u = enumC28538u2;
                }
            }
        }
        C28162a.f73047a.m23824a(new byte[]{-33, SignedBytes.MAX_POWER_OF_TWO, -3, 66, -77, SignedBytes.MAX_POWER_OF_TWO, -12, 71, -4, 91, -10, 77, -67, 9, -58, 71, -14, 75, -1, 76, -77, 93, -4, 9, -5, 72, -3, 77, -1, 76, -77, 92, -31, 69, -87, 9}, new byte[]{-109, 41});
        m37980a(str, enumC28538u, null);
        return false;
    }

    /* renamed from: a */
    public final void m37980a(String str, EnumC28538u enumC28538u, Throwable th) {
        if (enumC28538u == null) {
            enumC28538u = EnumC28538u.NOOP;
        }
        this.f73999b.mo37979a(str, enumC28538u);
    }

    /* renamed from: com.taurusx.tax.j.w$a */
    /* loaded from: classes7.dex */
    public class C28547a implements InterfaceC28548b {
        @Override // com.taurusx.tax.p606j.C28546w.InterfaceC28548b
        /* renamed from: a */
        public void mo37979a(String str, EnumC28538u enumC28538u) {
        }

        @Override // com.taurusx.tax.p606j.C28546w.InterfaceC28548b
        /* renamed from: b */
        public void mo37978b(String str, EnumC28538u enumC28538u) {
        }
    }
}
