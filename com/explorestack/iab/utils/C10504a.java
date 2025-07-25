package com.explorestack.iab.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import net.pubnative.lite.sdk.vpaid.enums.EventConstants;

/* renamed from: com.explorestack.iab.utils.a */
/* loaded from: classes3.dex */
public class C10504a {

    /* renamed from: a */
    public static final int f23989a = Color.parseColor("#B4FFFFFF");

    /* renamed from: b */
    public static final int f23990b = Color.parseColor("#5c000000");

    /* renamed from: c */
    public static final int f23991c = Color.parseColor("#52000000");

    /* renamed from: d */
    public static final C10507d f23992d;

    /* renamed from: e */
    public static final C10507d f23993e;

    /* renamed from: f */
    public static final C10507d f23994f;

    /* renamed from: g */
    public static final C10507d f23995g;

    /* renamed from: h */
    public static final C10507d f23996h;

    /* renamed from: i */
    public static final C10507d f23997i;

    /* renamed from: j */
    public static final C10507d f23998j;

    /* renamed from: k */
    public static final C10507d f23999k;

    /* renamed from: l */
    public static final C10507d f24000l;

    /* renamed from: m */
    public static final C10507d f24001m;

    /* renamed from: n */
    public static final C10507d f24002n;

    /* renamed from: o */
    public static final C10507d f24003o;

    /* renamed from: p */
    public static final C10507d f24004p;

    /* renamed from: q */
    public static final C10507d f24005q;

    static {
        C10507d c10507d = new C10507d();
        f23992d = c10507d;
        c10507d.m79390M(5);
        c10507d.m79380W(48);
        Float valueOf = Float.valueOf(2.0f);
        c10507d.m79382U(valueOf);
        c10507d.m79381V("cross");
        c10507d.m79389N(8, 8, 8, 8);
        Float valueOf2 = Float.valueOf(30.0f);
        c10507d.m79378Y(valueOf2);
        c10507d.m79392K(valueOf2);
        Float valueOf3 = Float.valueOf(3.0f);
        c10507d.m79391L(valueOf3);
        C10507d c10507d2 = new C10507d();
        f23993e = c10507d2;
        c10507d2.m79390M(5);
        c10507d2.m79380W(48);
        c10507d2.m79382U(valueOf);
        c10507d2.m79381V(EventConstants.SKIP);
        c10507d2.m79389N(8, 8, 8, 8);
        c10507d2.m79378Y(valueOf2);
        c10507d2.m79392K(valueOf2);
        c10507d2.m79391L(valueOf3);
        C10507d c10507d3 = new C10507d();
        f23996h = c10507d3;
        c10507d3.m79390M(5);
        c10507d3.m79380W(48);
        c10507d3.m79382U(valueOf);
        c10507d3.m79381V("circular");
        c10507d3.m79389N(8, 8, 8, 8);
        c10507d3.m79378Y(valueOf2);
        c10507d3.m79392K(valueOf2);
        c10507d3.m79393J(1);
        c10507d3.m79391L(valueOf3);
        C10507d c10507d4 = new C10507d();
        f23997i = c10507d4;
        c10507d4.m79390M(5);
        c10507d4.m79380W(48);
        Float valueOf4 = Float.valueOf(16.0f);
        c10507d4.m79394I(valueOf4);
        c10507d4.m79382U(valueOf);
        c10507d4.m79385R(12, 2, 12, 2);
        c10507d4.m79396G("%1.0f%");
        c10507d4.m79381V("text");
        c10507d4.m79389N(8, 8, 8, 8);
        c10507d4.m79393J(1);
        c10507d4.m79391L(valueOf3);
        C10507d c10507d5 = new C10507d();
        f23995g = c10507d5;
        c10507d5.m79390M(3);
        c10507d5.m79380W(48);
        c10507d5.m79382U(valueOf);
        c10507d5.m79389N(8, 8, 8, 8);
        c10507d5.m79378Y(valueOf2);
        c10507d5.m79392K(valueOf2);
        c10507d5.m79391L(valueOf3);
        C10507d c10507d6 = new C10507d();
        f23994f = c10507d6;
        c10507d6.m79390M(17);
        c10507d6.m79380W(48);
        c10507d6.m79382U(valueOf);
        c10507d6.m79389N(8, 8, 8, 8);
        c10507d6.m79378Y(valueOf2);
        c10507d6.m79392K(valueOf2);
        c10507d6.m79379X(Boolean.FALSE);
        c10507d6.m79391L(valueOf3);
        C10507d c10507d7 = new C10507d();
        f24002n = c10507d7;
        c10507d7.m79390M(17);
        c10507d7.m79380W(80);
        c10507d7.m79395H(0);
        c10507d7.m79382U(valueOf3);
        c10507d7.m79378Y(-1);
        c10507d7.m79392K(3);
        c10507d7.m79381V("linear");
        c10507d7.m79391L(valueOf3);
        C10507d c10507d8 = new C10507d();
        f24001m = c10507d8;
        c10507d8.m79390M(17);
        c10507d8.m79380W(80);
        c10507d8.m79394I(valueOf4);
        c10507d8.m79382U(valueOf);
        c10507d8.m79385R(12, 2, 12, 2);
        c10507d8.m79396G("%1.0f%");
        c10507d8.m79381V("text");
        c10507d8.m79389N(3, 3, 3, 3);
        c10507d8.m79393J(1);
        c10507d8.m79391L(valueOf3);
        C10507d c10507d9 = new C10507d();
        f24003o = c10507d9;
        c10507d9.m79390M(17);
        c10507d9.m79380W(80);
        c10507d9.m79382U(valueOf);
        c10507d9.m79386Q(Boolean.TRUE);
        c10507d9.m79381V("circular");
        c10507d9.m79389N(8, 8, 8, 8);
        c10507d9.m79378Y(valueOf2);
        c10507d9.m79392K(valueOf2);
        c10507d9.m79393J(1);
        c10507d9.m79391L(valueOf3);
        C10507d c10507d10 = new C10507d();
        f23998j = c10507d10;
        c10507d10.m79390M(5);
        c10507d10.m79380W(80);
        c10507d10.m79394I(valueOf4);
        c10507d10.m79382U(valueOf);
        c10507d10.m79385R(16, 6, 16, 6);
        c10507d10.m79381V("text");
        c10507d10.m79389N(3, 3, 3, 3);
        c10507d10.m79393J(1);
        c10507d10.m79391L(valueOf3);
        C10507d c10507d11 = new C10507d();
        f23999k = c10507d11;
        c10507d11.m79390M(17);
        c10507d11.m79380W(80);
        c10507d11.m79395H(0);
        c10507d11.m79389N(3, 3, 3, 3);
        C10507d c10507d12 = new C10507d(c10507d11);
        f24000l = c10507d12;
        c10507d12.m79389N(0, 0, 0, 0);
        C10507d c10507d13 = new C10507d();
        f24004p = c10507d13;
        c10507d13.m79390M(1);
        c10507d13.m79380W(16);
        c10507d13.m79385R(8, 8, 8, 8);
        c10507d13.m79382U(valueOf3);
        c10507d13.m79378Y(48);
        c10507d13.m79392K(48);
        C10507d c10507d14 = new C10507d();
        f24005q = c10507d14;
        c10507d14.m79390M(3);
        c10507d14.m79380W(48);
        c10507d14.m79395H(Integer.valueOf((int) ViewCompat.MEASURED_STATE_MASK));
        c10507d14.m79381V("fullscreen");
    }

    /* renamed from: a */
    public static Bitmap m79404a(String str) {
        byte[] decode = Base64.decode(str, 0);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    @NonNull
    /* renamed from: b */
    public static C10507d m79403b(@NonNull Context context, @Nullable C10507d c10507d) {
        if (c10507d != null && ("crossfill".equals(c10507d.m79354x()) || "skipfill".equals(c10507d.m79354x()))) {
            C10507d c10507d2 = new C10507d();
            c10507d2.m79386Q(Boolean.TRUE);
            return f23992d.m79373e(c10507d2);
        }
        return f23992d;
    }
}
