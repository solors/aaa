package com.taurusx.tax.p606j.p613b0;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.common.primitives.UnsignedBytes;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.p606j.C28530n;
import com.taurusx.tax.p606j.C28535r;
import com.taurusx.tax.p606j.p613b0.AsyncTaskC28504d;
import java.util.EnumSet;
import java.util.Iterator;

/* renamed from: com.taurusx.tax.j.b0.e */
/* loaded from: classes7.dex */
public class C28506e {

    /* renamed from: h */
    public static final InterfaceC28510d f73933h = new C28507a();

    /* renamed from: i */
    public static final InterfaceC28511e f73934i = new C28508b();

    /* renamed from: a */
    public EnumSet<EnumC28492b> f73935a;

    /* renamed from: b */
    public InterfaceC28510d f73936b;

    /* renamed from: c */
    public InterfaceC28511e f73937c;

    /* renamed from: d */
    public String f73938d;

    /* renamed from: e */
    public boolean f73939e;

    /* renamed from: f */
    public boolean f73940f = false;

    /* renamed from: g */
    public boolean f73941g = false;

    /* renamed from: com.taurusx.tax.j.b0.e$b */
    /* loaded from: classes7.dex */
    public class C28508b implements InterfaceC28511e {
    }

    /* renamed from: com.taurusx.tax.j.b0.e$c */
    /* loaded from: classes7.dex */
    public class C28509c implements AsyncTaskC28504d.InterfaceC28505a {

        /* renamed from: a */
        public final /* synthetic */ Context f73942a;

        /* renamed from: b */
        public final /* synthetic */ boolean f73943b;

        /* renamed from: c */
        public final /* synthetic */ Iterable f73944c;

        /* renamed from: d */
        public final /* synthetic */ String f73945d;

        public C28509c(Context context, boolean z, Iterable iterable, String str) {
            this.f73942a = context;
            this.f73943b = z;
            this.f73944c = iterable;
            this.f73945d = str;
        }
    }

    /* renamed from: com.taurusx.tax.j.b0.e$d */
    /* loaded from: classes7.dex */
    public interface InterfaceC28510d {
        /* renamed from: a */
        void mo38046a(String str, EnumC28492b enumC28492b);

        /* renamed from: b */
        void mo38045b(String str, EnumC28492b enumC28492b);
    }

    /* renamed from: com.taurusx.tax.j.b0.e$e */
    /* loaded from: classes7.dex */
    public interface InterfaceC28511e {
    }

    public C28506e(EnumSet<EnumC28492b> enumSet, InterfaceC28510d interfaceC28510d, InterfaceC28511e interfaceC28511e, boolean z, String str) {
        this.f73935a = EnumSet.copyOf((EnumSet) enumSet);
        this.f73936b = interfaceC28510d;
        this.f73937c = interfaceC28511e;
        this.f73939e = z;
        this.f73938d = str;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC28511e m38059a() {
        return f73934i;
    }

    /* renamed from: a */
    public void m38057a(Context context, String str, boolean z, Iterable<String> iterable) {
        C28530n.m37997a(context);
        if (TextUtils.isEmpty(str)) {
            m38055a(str, (EnumC28492b) null, C28162a.f73047a.m23824a(new byte[]{12, 45, 57, 60, 32, 41, 57, 60, 41, 121, 57, 54, 109, 49, 44, 55, 41, 53, 40, 121, 40, 52, 61, 45, 52, 121, 56, 43, 33, 119}, new byte[]{77, 89}));
            return;
        }
        C28509c c28509c = new C28509c(context, z, iterable, str);
        try {
            C28490a.m38065a(new AsyncTaskC28504d(c28509c), str);
        } catch (Exception unused) {
            String m23824a = C28162a.f73047a.m23824a(new byte[]{-77, -103, -100, -108, -112, -100, -43, -116, -102, -40, -121, -99, -122, -105, -103, -114, -112, -40, UnsignedBytes.MAX_POWER_OF_TWO, -118, -103}, new byte[]{-11, -8});
            C28506e.this.f73941g = false;
            C28506e.this.m38055a(c28509c.f73945d, (EnumC28492b) null, m23824a);
        }
        this.f73941g = true;
    }

    /* renamed from: a */
    public boolean m38058a(Context context, String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            m38055a(str, (EnumC28492b) null, C28162a.f73047a.m23824a(new byte[]{-42, 121, -29, 104, -6, 125, -29, 104, -13, 45, -29, 98, -73, 101, -10, 99, -13, 97, -14, 45, -14, 96, -25, 121, -18, 45, -30, Byte.MAX_VALUE, -5, 35}, new byte[]{-105, 13}));
            return false;
        }
        EnumC28492b enumC28492b = EnumC28492b.NOOP;
        Uri parse = Uri.parse(str);
        Iterator<E> it = this.f73935a.iterator();
        while (it.hasNext()) {
            EnumC28492b enumC28492b2 = (EnumC28492b) it.next();
            if (enumC28492b2.shouldTryHandlingUrl(parse)) {
                try {
                    enumC28492b2.handleUrl(this, context, parse, z, this.f73938d);
                    if (!this.f73940f && !this.f73941g && !EnumC28492b.IGNORE_ABOUT_SCHEME.equals(enumC28492b2) && !EnumC28492b.HANDLE_TAX_SCHEME.equals(enumC28492b2)) {
                        this.f73936b.mo38046a(parse.toString(), enumC28492b2);
                        this.f73940f = true;
                    }
                    return true;
                } catch (C28535r e) {
                    LogUtil.m37905d(C28162a.f73047a.m23824a(new byte[]{34, 89, 35, 74, 35, 75, 46}, new byte[]{86, 56}), e.getMessage());
                    enumC28492b = enumC28492b2;
                }
            }
        }
        m38055a(str, enumC28492b, C28162a.f73047a.m23824a(new byte[]{102, -98, 68, -100, 10, -98, 77, -103, 69, -123, 79, -109, 4, -41, Byte.MAX_VALUE, -103, 75, -107, 70, -110, 10, -125, 69, -41, 66, -106, 68, -109, 70, -110, 10, -126, 88, -101, 16, -41}, new byte[]{42, -9}) + str);
        return false;
    }

    /* renamed from: a */
    public final void m38055a(String str, EnumC28492b enumC28492b, String str2) {
        C28530n.m37997a(str2);
        if (enumC28492b == null) {
            enumC28492b = EnumC28492b.NOOP;
        }
        this.f73936b.mo38045b(str, enumC28492b);
    }

    /* renamed from: com.taurusx.tax.j.b0.e$a */
    /* loaded from: classes7.dex */
    public class C28507a implements InterfaceC28510d {
        @Override // com.taurusx.tax.p606j.p613b0.C28506e.InterfaceC28510d
        /* renamed from: a */
        public void mo38046a(String str, EnumC28492b enumC28492b) {
        }

        @Override // com.taurusx.tax.p606j.p613b0.C28506e.InterfaceC28510d
        /* renamed from: b */
        public void mo38045b(String str, EnumC28492b enumC28492b) {
        }
    }
}
