package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ca */
/* loaded from: classes8.dex */
public final class C30079ca {

    /* renamed from: a */
    private static final long f77561a = (long) (Math.floor(Math.random() * 4294967295L) + 1);

    /* renamed from: b */
    public static final /* synthetic */ int f77562b = 0;

    /* renamed from: a */
    private static String m35328a(String str, Map map) {
        if (map != null) {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            for (Map.Entry entry : map.entrySet()) {
                Uri parse = Uri.parse("?" + ((String) entry.getKey()) + "=" + ((String) entry.getValue()));
                for (String str2 : parse.getQueryParameterNames()) {
                    buildUpon.appendQueryParameter(str2, parse.getQueryParameter(str2));
                }
            }
            String uri = buildUpon.build().toString();
            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
            return uri;
        }
        return str;
    }

    @NotNull
    /* renamed from: a */
    public static final ArrayList m35332a(@NotNull C30149d8 adResponse, @Nullable Map map) {
        boolean m16592R;
        boolean m16592R2;
        pt1 pt1Var;
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        List<String> m35057l = adResponse.m35057l();
        List<Long> m35063f = adResponse.m35063f();
        List<Integer> m35052q = adResponse.m35052q();
        ArrayList arrayList = new ArrayList();
        if (m35057l != null && m35063f != null && m35052q != null) {
            int size = m35057l.size();
            int i = 0;
            while (i < size) {
                String url = m35328a(m35057l.get(i), map);
                long longValue = m35063f.size() > i ? m35063f.get(i).longValue() : 0L;
                int intValue = m35052q.size() > i ? m35052q.get(i).intValue() : 0;
                Intrinsics.checkNotNullParameter(url, "url");
                m16592R = C37690r.m16592R(url, "/rtbcount/", false, 2, null);
                if (!m16592R) {
                    m16592R2 = C37690r.m16592R(url, "/count/", false, 2, null);
                    if (m16592R2) {
                        pt1Var = pt1.f84073b;
                    } else {
                        pt1Var = pt1.f84075d;
                    }
                } else {
                    pt1Var = pt1.f84074c;
                }
                arrayList.add(new ot1(intValue, longValue, pt1Var, url));
                i++;
            }
        }
        return arrayList;
    }

    @Nullable
    /* renamed from: a */
    public static Bitmap m35329a(@NotNull String data) {
        int m16566e0;
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            m16566e0 = C37690r.m16566e0(data, ",", 0, false, 6, null);
            String substring = data.substring(m16566e0 + 1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            if (substring.length() > 0) {
                byte[] decode = Base64.decode(substring, 0);
                return BitmapFactory.decodeByteArray(decode, 0, decode.length);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @NotNull
    /* renamed from: a */
    public static final <T> String m35330a(T t) {
        String obj = t != null ? t.toString() : null;
        return obj == null ? "" : obj;
    }

    /* renamed from: a */
    public static boolean m35331a(@Nullable InterfaceC30957nn interfaceC30957nn) {
        return interfaceC30957nn == null || interfaceC30957nn.mo26159a();
    }

    /* renamed from: a */
    public static final boolean m35333a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return wd2.m27969a(context) != null;
    }

    /* renamed from: a */
    public static long m35334a() {
        return f77561a;
    }
}
