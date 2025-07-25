package com.yandex.mobile.ads.impl;

import com.ironsource.C20517nb;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.collections.C37563v;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import p804nd.Result;

/* loaded from: classes8.dex */
public final class wc0 {
    @NotNull

    /* renamed from: a */
    private static final Charset f87203a = Charsets.f99446f;

    /* renamed from: b */
    public static final /* synthetic */ int f87204b = 0;

    /* renamed from: com.yandex.mobile.ads.impl.wc0$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC31735a<T> {
        @Nullable
        /* renamed from: a */
        T mo27578a(@NotNull String str);
    }

    @Nullable
    /* renamed from: a */
    public static final String m27983a(@Nullable Map<String, String> map, @NotNull df0 httpHeader) {
        Intrinsics.checkNotNullParameter(httpHeader, "httpHeader");
        if (map != null) {
            return map.get(httpHeader.m34950a());
        }
        return null;
    }

    /* renamed from: b */
    public static int m27981b(Map map, df0 httpHeader) {
        Intrinsics.checkNotNullParameter(httpHeader, "httpHeader");
        String m27983a = m27983a(map, httpHeader);
        int i = C30079ca.f77562b;
        if (m27983a != null) {
            try {
                return Integer.parseInt(m27983a);
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    @NotNull
    /* renamed from: c */
    public static final ArrayList m27980c(@NotNull Map responseHeaders, @NotNull df0 header) {
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        Intrinsics.checkNotNullParameter(header, "header");
        return m27982a(responseHeaders, header, new xc0());
    }

    @NotNull
    /* renamed from: a */
    public static final ArrayList m27982a(@NotNull Map responseHeaders, @NotNull df0 header, @NotNull InterfaceC31735a parser) {
        List m17166m;
        String[] strArr;
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(parser, "parser");
        ArrayList arrayList = new ArrayList();
        String m27983a = m27983a(responseHeaders, header);
        if (m27983a != null && m27983a.length() != 0) {
            List<String> m16763h = new Regex(",").m16763h(m27983a, 0);
            if (!m16763h.isEmpty()) {
                ListIterator<String> listIterator = m16763h.listIterator(m16763h.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        m17166m = _Collections.m17559T0(m16763h, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            m17166m = C37563v.m17166m();
            for (String str : (String[]) m17166m.toArray(new String[0])) {
                try {
                    Result.C38506a c38506a = Result.f101870c;
                    int length = str.length() - 1;
                    int i = 0;
                    boolean z = false;
                    while (i <= length) {
                        boolean z2 = Intrinsics.m17071j(str.charAt(!z ? i : length), 32) <= 0;
                        if (z) {
                            if (!z2) {
                                break;
                            }
                            length--;
                        } else if (z2) {
                            i++;
                        } else {
                            z = true;
                        }
                    }
                    String decode = URLDecoder.decode(str.subSequence(i, length + 1).toString(), "UTF-8");
                    Intrinsics.m17074g(decode);
                    Object mo27578a = parser.mo27578a(decode);
                    if (mo27578a != null) {
                        arrayList.add(mo27578a);
                    } else {
                        mo27578a = null;
                    }
                    Result.m14549b(mo27578a);
                } catch (Throwable th) {
                    Result.C38506a c38506a2 = Result.f101870c;
                    Result.m14549b(C38508r.m14540a(th));
                }
            }
        }
        return arrayList;
    }

    @NotNull
    /* renamed from: a */
    public static final Charset m27984a(@Nullable Map<String, String> map) {
        List m17166m;
        List m17166m2;
        if (map == null) {
            return f87203a;
        }
        String str = map.get("Content-Type");
        if (str != null) {
            List<String> m16763h = new Regex(";").m16763h(str, 0);
            if (!m16763h.isEmpty()) {
                ListIterator<String> listIterator = m16763h.listIterator(m16763h.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        m17166m = _Collections.m17559T0(m16763h, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            m17166m = C37563v.m17166m();
            String[] strArr = (String[]) m17166m.toArray(new String[0]);
            int length = strArr.length;
            for (int i = 1; i < length; i++) {
                String str2 = strArr[i];
                int length2 = str2.length() - 1;
                int i2 = 0;
                boolean z = false;
                while (i2 <= length2) {
                    boolean z2 = Intrinsics.m17071j(str2.charAt(!z ? i2 : length2), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        }
                        length2--;
                    } else if (z2) {
                        i2++;
                    } else {
                        z = true;
                    }
                }
                List<String> m16763h2 = new Regex("=").m16763h(str2.subSequence(i2, length2 + 1).toString(), 0);
                if (!m16763h2.isEmpty()) {
                    ListIterator<String> listIterator2 = m16763h2.listIterator(m16763h2.size());
                    while (listIterator2.hasPrevious()) {
                        if (listIterator2.previous().length() != 0) {
                            m17166m2 = _Collections.m17559T0(m16763h2, listIterator2.nextIndex() + 1);
                            break;
                        }
                    }
                }
                m17166m2 = C37563v.m17166m();
                String[] strArr2 = (String[]) m17166m2.toArray(new String[0]);
                if (strArr2.length == 2 && Intrinsics.m17075f(strArr2[0], C20517nb.f52166M)) {
                    Charset forName = Charset.forName(strArr2[1]);
                    Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
                    return forName;
                }
            }
        }
        return f87203a;
    }
}
