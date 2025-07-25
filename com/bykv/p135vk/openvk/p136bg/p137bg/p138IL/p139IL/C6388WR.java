package com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL;

import android.net.Uri;
import android.text.TextUtils;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p144bX.C6447bg;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C21114v8;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bykv.vk.openvk.bg.bg.IL.IL.WR */
/* loaded from: classes3.dex */
public class C6388WR {

    /* renamed from: IL */
    public final List<C6389IL> f13319IL;

    /* renamed from: bX */
    public final C6391bg f13320bX;

    /* renamed from: bg */
    public final C6390bX f13321bg;

    /* renamed from: com.bykv.vk.openvk.bg.bg.IL.IL.WR$IL */
    /* loaded from: classes3.dex */
    public static final class C6389IL {

        /* renamed from: IL */
        public final String f13322IL;

        /* renamed from: bg */
        public final String f13323bg;

        public C6389IL(String str, String str2) {
            this.f13323bg = str;
            this.f13322IL = str2;
        }

        /* renamed from: bg */
        static C6389IL m92056bg(String str) throws C6392eqN {
            int indexOf = str.indexOf(":");
            if (indexOf != -1) {
                String trim = str.substring(0, indexOf).trim();
                String trim2 = str.substring(indexOf + 1).trim();
                if (trim.length() != 0 && trim2.length() != 0) {
                    return new C6389IL(trim, trim2);
                }
                throw new C6392eqN("request header format error, header: ".concat(str));
            }
            throw new C6392eqN("request header format error, header: ".concat(str));
        }

        public String toString() {
            return "Header{name='" + this.f13323bg + "', value='" + this.f13322IL + "'}";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bykv.vk.openvk.bg.bg.IL.IL.WR$bX */
    /* loaded from: classes3.dex */
    public static final class C6390bX {

        /* renamed from: IL */
        final String f13324IL;

        /* renamed from: bX */
        final String f13325bX;

        /* renamed from: bg */
        final String f13326bg;

        private C6390bX(String str, String str2, String str3) {
            this.f13326bg = str;
            this.f13324IL = str2;
            this.f13325bX = str3;
        }

        /* renamed from: bg */
        static C6390bX m92055bg(String str) throws C6392eqN {
            int indexOf = str.indexOf(32);
            if (indexOf != -1) {
                int lastIndexOf = str.lastIndexOf(32);
                if (lastIndexOf > indexOf) {
                    String trim = str.substring(0, indexOf).trim();
                    String trim2 = str.substring(indexOf + 1, lastIndexOf).trim();
                    String trim3 = str.substring(lastIndexOf + 1).trim();
                    if (trim.length() != 0 && trim2.length() != 0 && trim3.length() != 0) {
                        return new C6390bX(trim, trim2, trim3);
                    }
                    throw new C6392eqN("request line format error, line: ".concat(str));
                }
                throw new C6392eqN("request line format error, line: ".concat(str));
            }
            throw new C6392eqN("request line format error, line: ".concat(str));
        }

        public String toString() {
            return "RequestLine{method='" + this.f13326bg + "', path='" + this.f13324IL + "', version='" + this.f13325bX + "'}";
        }
    }

    /* renamed from: com.bykv.vk.openvk.bg.bg.IL.IL.WR$bg */
    /* loaded from: classes3.dex */
    static final class C6391bg {

        /* renamed from: IL */
        final String f13327IL;

        /* renamed from: bX */
        final String f13328bX;

        /* renamed from: bg */
        final int f13329bg;
        final int eqN;

        /* renamed from: iR */
        final List<String> f13330iR;
        final String ldr;

        /* renamed from: zx */
        final int f13331zx;

        private C6391bg(int i, String str, String str2, int i2, int i3, String str3, List<String> list) {
            this.f13329bg = i;
            this.f13327IL = str;
            this.f13328bX = str2;
            this.eqN = i2;
            this.f13331zx = i3;
            this.ldr = str3;
            this.f13330iR = list;
        }

        /* renamed from: bg */
        static C6391bg m92054bg(C6390bX c6390bX, List<C6389IL> list) throws C6392eqN {
            String str;
            int i;
            int i2;
            int indexOf = c6390bX.f13324IL.indexOf("?");
            if (indexOf != -1) {
                ArrayList arrayList = new ArrayList();
                String str2 = null;
                String str3 = null;
                String str4 = null;
                int i3 = 0;
                for (String str5 : c6390bX.f13324IL.substring(indexOf + 1).split(C21114v8.C21123i.f54135c)) {
                    String[] split = str5.split("=");
                    if (split.length == 2) {
                        if ("rk".equals(split[0])) {
                            str3 = Uri.decode(split[1]);
                        } else if ("k".equals(split[0])) {
                            str4 = Uri.decode(split[1]);
                        } else if (split[0].startsWith(ApsMetricsDataMap.APSMETRICS_FIELD_URL)) {
                            arrayList.add(Uri.decode(split[1]));
                        } else if (InneractiveMediationDefs.GENDER_FEMALE.equals(split[0]) && C6447bg.m91935IL(split[1]) == 1) {
                            i3 = 1;
                        }
                    }
                }
                if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                    if (list != null) {
                        i2 = 0;
                        int i4 = 0;
                        for (C6389IL c6389il : list) {
                            if (c6389il != null && "Range".equalsIgnoreCase(c6389il.f13323bg)) {
                                int indexOf2 = c6389il.f13322IL.indexOf("=");
                                if (indexOf2 != -1) {
                                    if ("bytes".equalsIgnoreCase(c6389il.f13322IL.substring(0, indexOf2).trim())) {
                                        String substring = c6389il.f13322IL.substring(indexOf2 + 1);
                                        if (!substring.contains(",")) {
                                            int indexOf3 = substring.indexOf("-");
                                            if (indexOf3 != -1) {
                                                String trim = substring.substring(0, indexOf3).trim();
                                                String trim2 = substring.substring(indexOf3 + 1).trim();
                                                try {
                                                    if (trim.length() > 0) {
                                                        i2 = Integer.parseInt(trim);
                                                    }
                                                    if (trim2.length() > 0 && i2 > (i4 = Integer.parseInt(trim2))) {
                                                        throw new C6392eqN("Range format error, Range: " + c6389il.f13322IL);
                                                    }
                                                    str2 = c6389il.f13322IL;
                                                } catch (NumberFormatException unused) {
                                                    throw new C6392eqN("Range format error, Range: " + c6389il.f13322IL);
                                                }
                                            } else {
                                                throw new C6392eqN("Range format error, Range: " + c6389il.f13322IL);
                                            }
                                        } else {
                                            throw new C6392eqN("Range format error, Range: " + c6389il.f13322IL);
                                        }
                                    } else {
                                        throw new C6392eqN("Range format error, Range: " + c6389il.f13322IL);
                                    }
                                } else {
                                    throw new C6392eqN("Range format error, Range: " + c6389il.f13322IL);
                                }
                            }
                        }
                        i = i4;
                        str = str2;
                    } else {
                        str = null;
                        i = 0;
                        i2 = 0;
                    }
                    if (!arrayList.isEmpty()) {
                        return new C6391bg(i3, str3, str4, i2, i, str, arrayList);
                    }
                    throw new C6392eqN("no url found: path: " + c6390bX.f13324IL);
                }
                throw new C6392eqN("rawKey or key is empty, path: " + c6390bX.f13324IL);
            }
            throw new C6392eqN("path format error, path: " + c6390bX.f13324IL);
        }

        public String toString() {
            return "Extra{flag=" + this.f13329bg + ", rawKey='" + this.f13327IL + "', key='" + this.f13328bX + "', from=" + this.eqN + ", to=" + this.f13331zx + ", urls=" + this.f13330iR + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bykv.vk.openvk.bg.bg.IL.IL.WR$eqN */
    /* loaded from: classes3.dex */
    public static final class C6392eqN extends Exception {
        C6392eqN(String str) {
            super(str);
        }
    }

    public C6388WR(C6390bX c6390bX, List<C6389IL> list, C6391bg c6391bg) {
        this.f13321bg = c6390bX;
        this.f13319IL = list;
        this.f13320bX = c6391bg;
    }

    /* renamed from: bg */
    public static C6388WR m92059bg(InputStream inputStream) throws IOException, C6392eqN {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, C6447bg.f13450bg));
        ArrayList arrayList = new ArrayList();
        C6390bX c6390bX = null;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (TextUtils.isEmpty(readLine)) {
                break;
            }
            String trim = readLine.trim();
            if (c6390bX == null) {
                c6390bX = C6390bX.m92055bg(trim);
            } else {
                arrayList.add(C6389IL.m92056bg(trim));
            }
        }
        if (c6390bX != null) {
            return new C6388WR(c6390bX, arrayList, C6391bg.m92054bg(c6390bX, arrayList));
        }
        throw new C6392eqN("request line is null");
    }

    public String toString() {
        return "Request{requestLine=" + this.f13321bg + ", headers=" + this.f13319IL + ", extra=" + this.f13320bX + '}';
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public static String m92058bg(String str, String str2, List<String> list) {
        StringBuilder sb2 = new StringBuilder(512);
        String str3 = null;
        do {
            if (str3 != null) {
                if (list.size() == 1) {
                    return null;
                }
                list.remove(list.size() - 1);
            }
            str3 = m92057bg(sb2, str, str2, list);
        } while (str3.length() > 3072);
        return str3;
    }

    /* renamed from: bg */
    private static String m92057bg(StringBuilder sb2, String str, String str2, List<String> list) {
        sb2.delete(0, sb2.length());
        sb2.append("rk=");
        sb2.append(Uri.encode(str));
        sb2.append("&k=");
        sb2.append(Uri.encode(str2));
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb2.append("&u");
            sb2.append(i);
            sb2.append("=");
            sb2.append(Uri.encode(list.get(i)));
        }
        return sb2.toString();
    }
}
