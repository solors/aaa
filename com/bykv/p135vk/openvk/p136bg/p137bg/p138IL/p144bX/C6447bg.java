package com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p144bX;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.device.ads.DtbConstants;
import com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL.C6388WR;
import com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL.C6438zx;
import com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL.p140IL.C6378bX;
import com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL.p140IL.C6381bg;
import com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL.p143zx.AbstractC6443bg;
import com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL.p143zx.C6446zx;
import com.bytedance.sdk.component.p233Kg.AbstractRunnableC7227Kg;
import com.bytedance.sdk.component.p233Kg.C7255ldr;
import com.google.common.net.HttpHeaders;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.maticoo.sdk.utils.request.network.Headers;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.RandomAccessFile;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.bykv.vk.openvk.bg.bg.IL.bX.bg */
/* loaded from: classes3.dex */
public final class C6447bg {

    /* renamed from: IL */
    private static final Handler f13449IL = new Handler(Looper.getMainLooper());

    /* renamed from: bg */
    public static final Charset f13450bg = Charset.forName("UTF-8");

    /* renamed from: com.bykv.vk.openvk.bg.bg.IL.bX.bg$1 */
    /* loaded from: classes3.dex */
    static class C64481 implements FilenameFilter {

        /* renamed from: bg */
        private Pattern f13451bg = Pattern.compile("^cpu[0-9]+$");

        C64481() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return this.f13451bg.matcher(str).matches();
        }
    }

    /* renamed from: IL */
    public static int m91935IL(String str) {
        return m91919bg(str, 0);
    }

    /* renamed from: bX */
    public static boolean m91932bX(String str) {
        if (str != null) {
            if (str.startsWith("video/") || Headers.VALUE_APPLICATION_STREAM.equals(str) || "binary/octet-stream".equals(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: bg */
    public static void m91923bg(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: IL */
    public static String m91936IL(int i, int i2) {
        if (i >= 0 && i2 > 0) {
            return i + "-" + i2;
        } else if (i > 0) {
            return i + "-";
        } else if (i >= 0 || i2 <= 0) {
            return null;
        } else {
            return "-".concat(String.valueOf(i2));
        }
    }

    /* renamed from: bg */
    public static void m91918bg(ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: bg */
    public static void m91917bg(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: bg */
    public static void m91922bg(RandomAccessFile randomAccessFile) {
        if (randomAccessFile != null) {
            try {
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: IL */
    public static boolean m91937IL() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    /* renamed from: IL */
    public static String m91934IL(List<C6388WR.C6389IL> list) {
        if (list == null || list.size() == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C6388WR.C6389IL c6389il = list.get(0);
            if (c6389il != null) {
                sb2.append(c6389il.f13323bg);
                sb2.append(": ");
                sb2.append(c6389il.f13322IL);
                sb2.append("\r\n");
            }
        }
        return sb2.toString();
    }

    /* renamed from: bg */
    public static boolean m91920bg(String str) {
        if (str != null) {
            return str.startsWith("http://") || str.startsWith(DtbConstants.HTTPS);
        }
        return false;
    }

    /* renamed from: bg */
    public static int m91919bg(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* renamed from: bg */
    public static String m91927bg(AbstractC6443bg abstractC6443bg, int i) {
        int m91928bg;
        if (abstractC6443bg == null || !abstractC6443bg.mo91942IL()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(abstractC6443bg.mo91938zx().toUpperCase());
        sb2.append(' ');
        sb2.append(abstractC6443bg.mo91940bg());
        sb2.append(' ');
        sb2.append(abstractC6443bg.ldr());
        sb2.append("\r\n");
        if (C6438zx.f13435bX) {
            Log.i("TAG_PROXY_headers", abstractC6443bg.mo91938zx().toUpperCase() + " " + abstractC6443bg.mo91940bg() + " " + abstractC6443bg.ldr());
        }
        List<C6388WR.C6389IL> m91916bg = m91916bg(abstractC6443bg.mo91941bX());
        boolean z = true;
        if (m91916bg != null) {
            int size = m91916bg.size();
            for (int i2 = 0; i2 < size; i2++) {
                C6388WR.C6389IL c6389il = m91916bg.get(i2);
                if (c6389il != null) {
                    String str = c6389il.f13323bg;
                    String str2 = c6389il.f13322IL;
                    sb2.append(str);
                    sb2.append(": ");
                    sb2.append(str2);
                    sb2.append("\r\n");
                    if ("Content-Range".equalsIgnoreCase(str) || (HttpHeaders.ACCEPT_RANGES.equalsIgnoreCase(str) && "bytes".equalsIgnoreCase(str2))) {
                        z = false;
                    }
                }
            }
        }
        if (z && (m91928bg = m91928bg(abstractC6443bg)) > 0) {
            sb2.append("Content-Range: bytes ");
            sb2.append(Math.max(i, 0));
            sb2.append("-");
            sb2.append(m91928bg - 1);
            sb2.append(RemoteSettings.FORWARD_SLASH_STRING);
            sb2.append(m91928bg);
            sb2.append("\r\n");
        }
        sb2.append("Connection: close\r\n");
        sb2.append("\r\n");
        String sb3 = sb2.toString();
        if (C6438zx.f13435bX) {
            Log.i("TAG_PROXY_WRITE_TO_MP", sb3);
        }
        return sb3;
    }

    /* renamed from: IL */
    public static String m91933IL(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb2.append((Object) entry.getKey());
            sb2.append(": ");
            sb2.append((Object) entry.getValue());
            sb2.append("\r\n");
        }
        return sb2.toString();
    }

    /* renamed from: bg */
    public static String m91930bg(int i, int i2) {
        String m91936IL = m91936IL(i, i2);
        if (m91936IL == null) {
            return null;
        }
        return "bytes=".concat(m91936IL);
    }

    /* renamed from: bg */
    public static List<String> m91914bg(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            if (m91920bg(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* renamed from: bg */
    public static String m91929bg(C6381bg c6381bg, int i) {
        StringBuilder sb2 = new StringBuilder();
        if (i <= 0) {
            sb2.append("HTTP/1.1 200 OK\r\n");
        } else {
            sb2.append("HTTP/1.1 206 Partial Content\r\n");
        }
        sb2.append("Accept-Ranges: bytes\r\n");
        sb2.append("Content-Type: ");
        sb2.append(c6381bg.f13306IL);
        sb2.append("\r\n");
        if (i <= 0) {
            sb2.append("Content-Length: ");
            sb2.append(c6381bg.f13307bX);
            sb2.append("\r\n");
        } else {
            sb2.append("Content-Range: bytes ");
            sb2.append(i);
            sb2.append("-");
            sb2.append(c6381bg.f13307bX - 1);
            sb2.append(RemoteSettings.FORWARD_SLASH_STRING);
            sb2.append(c6381bg.f13307bX);
            sb2.append("\r\n");
            sb2.append("Content-Length: ");
            sb2.append(c6381bg.f13307bX - i);
            sb2.append("\r\n");
        }
        sb2.append("Connection: close\r\n");
        sb2.append("\r\n");
        String sb3 = sb2.toString();
        if (C6438zx.f13435bX) {
            Log.i("TAG_PROXY_WRITE_TO_MP", sb3);
        }
        return sb3;
    }

    /* renamed from: bg */
    public static int m91931bg() {
        return Math.max(Runtime.getRuntime().availableProcessors(), 1);
    }

    /* renamed from: bg */
    public static int m91928bg(AbstractC6443bg abstractC6443bg) {
        int lastIndexOf;
        if (abstractC6443bg == null) {
            return -1;
        }
        if (abstractC6443bg.mo91940bg() == 200) {
            return m91919bg(abstractC6443bg.mo91939bg("Content-Length", null), -1);
        }
        if (abstractC6443bg.mo91940bg() == 206) {
            String mo91939bg = abstractC6443bg.mo91939bg("Content-Range", null);
            if (!TextUtils.isEmpty(mo91939bg) && (lastIndexOf = mo91939bg.lastIndexOf(RemoteSettings.FORWARD_SLASH_STRING)) >= 0 && lastIndexOf < mo91939bg.length() - 1) {
                return m91919bg(mo91939bg.substring(lastIndexOf + 1), -1);
            }
        }
        return -1;
    }

    /* renamed from: bg */
    public static String m91925bg(AbstractC6443bg abstractC6443bg, boolean z, boolean z2) {
        String mo91939bg;
        if (abstractC6443bg == null) {
            if (C6438zx.f13435bX) {
                Log.e("TAG_PROXY_Response", "response null");
            }
            return "response null";
        } else if (!abstractC6443bg.mo91942IL()) {
            if (C6438zx.f13435bX) {
                Log.e("TAG_PROXY_Response", "response code: " + abstractC6443bg.mo91940bg());
            }
            return "response code: " + abstractC6443bg.mo91940bg();
        } else {
            String mo91939bg2 = abstractC6443bg.mo91939bg("Content-Type", null);
            if (!m91932bX(mo91939bg2)) {
                if (C6438zx.f13435bX) {
                    Log.e("TAG_PROXY_Response", "Content-Type: ".concat(String.valueOf(mo91939bg2)));
                }
                return "Content-Type: ".concat(String.valueOf(mo91939bg2));
            }
            int m91928bg = m91928bg(abstractC6443bg);
            if (m91928bg <= 0) {
                if (C6438zx.f13435bX) {
                    Log.e("TAG_PROXY_Response", "Content-Length: ".concat(String.valueOf(m91928bg)));
                }
                return "Content-Length: ".concat(String.valueOf(m91928bg));
            } else if (z && ((mo91939bg = abstractC6443bg.mo91939bg(HttpHeaders.ACCEPT_RANGES, null)) == null || !mo91939bg.contains("bytes"))) {
                if (C6438zx.f13435bX) {
                    Log.e("TAG_PROXY_Response", "Accept-Ranges: ".concat(String.valueOf(mo91939bg)));
                }
                return "Accept-Ranges: ".concat(String.valueOf(mo91939bg));
            } else if (z2 && abstractC6443bg.eqN() == null) {
                if (C6438zx.f13435bX) {
                    Log.e("TAG_PROXY_Response", "response body null");
                }
                return "response body null";
            } else {
                return null;
            }
        }
    }

    /* renamed from: bg */
    public static void m91924bg(AbstractRunnableC7227Kg abstractRunnableC7227Kg) {
        if (abstractRunnableC7227Kg != null) {
            if (m91937IL()) {
                C7255ldr.m89462IL(abstractRunnableC7227Kg);
                if (C6438zx.f13435bX) {
                    Log.e("TAG_PROXY_UTIL", "invoke in pool thread");
                    return;
                }
                return;
            }
            abstractRunnableC7227Kg.run();
            if (C6438zx.f13435bX) {
                Log.e("TAG_PROXY_UTIL", "invoke calling thread");
            }
        }
    }

    /* renamed from: bg */
    public static void m91921bg(Runnable runnable) {
        if (runnable != null) {
            if (m91937IL()) {
                runnable.run();
            } else {
                f13449IL.post(runnable);
            }
        }
    }

    /* renamed from: bg */
    public static List<C6388WR.C6389IL> m91916bg(List<C6388WR.C6389IL> list) {
        C6388WR.C6389IL c6389il;
        C6388WR.C6389IL c6389il2;
        if (list == null || list.size() == 0) {
            return null;
        }
        if (C6438zx.f13435bX) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i) != null) {
                    Log.i("TAG_PROXY_PRE_FILTER", c6389il2.f13323bg + ": " + c6389il2.f13323bg);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (C6388WR.C6389IL c6389il3 : list) {
            if ("Host".equals(c6389il3.f13323bg) || HttpHeaders.KEEP_ALIVE.equals(c6389il3.f13323bg) || "Connection".equals(c6389il3.f13323bg) || "Proxy-Connection".equals(c6389il3.f13323bg)) {
                arrayList.add(c6389il3);
            }
        }
        list.removeAll(arrayList);
        if (C6438zx.f13435bX) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (list.get(i2) != null) {
                    Log.i("TAG_PROXY_POST_FILTER", c6389il.f13323bg + ": " + c6389il.f13322IL);
                }
            }
        }
        return list;
    }

    /* renamed from: bg */
    public static List<C6388WR.C6389IL> m91915bg(Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            try {
                Set<Map.Entry<String, String>> entrySet = map.entrySet();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, String> entry : entrySet) {
                    arrayList.add(new C6388WR.C6389IL(entry.getKey(), entry.getValue()));
                }
                return arrayList;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: bg */
    public static C6381bg m91926bg(AbstractC6443bg abstractC6443bg, C6378bX c6378bX, String str, int i) {
        String str2;
        String str3;
        String str4;
        C6381bg m92081bg = c6378bX.m92081bg(str, i);
        if (m92081bg == null) {
            int m91928bg = m91928bg(abstractC6443bg);
            String mo91939bg = abstractC6443bg.mo91939bg("Content-Type", null);
            if (m91928bg <= 0 || TextUtils.isEmpty(mo91939bg)) {
                return m92081bg;
            }
            C6446zx m91944iR = abstractC6443bg.m91944iR();
            if (m91944iR != null) {
                str3 = m91944iR.f13445IL;
                str2 = m91933IL(m91944iR.f13448zx);
            } else {
                str2 = "";
                str3 = str2;
            }
            String m91934IL = m91934IL(abstractC6443bg.mo91941bX());
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(IronSourceConstants.REQUEST_URL, str3);
                jSONObject.put("requestHeaders", str2);
                jSONObject.put("responseHeaders", m91934IL);
                str4 = jSONObject.toString();
            } catch (Throwable unused) {
                str4 = "";
            }
            C6381bg c6381bg = new C6381bg(str, mo91939bg, m91928bg, i, str4);
            c6378bX.m92082bg(c6381bg);
            return c6381bg;
        }
        return m92081bg;
    }
}
