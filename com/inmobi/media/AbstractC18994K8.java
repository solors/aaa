package com.inmobi.media;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.PowerManager;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import kotlin.Unit;
import kotlin.jvm.internal.C37612s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.K8 */
/* loaded from: classes6.dex */
public abstract class AbstractC18994K8 {

    /* renamed from: a */
    public static final /* synthetic */ int f47403a = 0;

    /* renamed from: a */
    public static EnumC19506w3 m60980a() {
        EnumC19506w3 enumC19506w3;
        Context m61068d = C18954Ha.m61068d();
        if (m61068d != null) {
            try {
                Object systemService = m61068d.getSystemService("connectivity");
                Intrinsics.m17073h(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                enumC19506w3 = (networkCapabilities == null || !networkCapabilities.hasCapability(16)) ? EnumC19506w3.f48805p : null;
            } catch (Exception unused) {
                Intrinsics.checkNotNullExpressionValue("K8", "TAG");
                enumC19506w3 = EnumC19506w3.f48807r;
            }
            if (enumC19506w3 == null) {
                Context m61068d2 = C18954Ha.m61068d();
                boolean z = false;
                if (m61068d2 != null) {
                    try {
                        Object systemService2 = m61068d2.getSystemService("power");
                        PowerManager powerManager = systemService2 instanceof PowerManager ? (PowerManager) systemService2 : null;
                        if (powerManager != null) {
                            z = powerManager.isDeviceIdleMode();
                        }
                    } catch (Exception unused2) {
                        Intrinsics.checkNotNullExpressionValue("K8", "TAG");
                    }
                }
                if (z) {
                    return EnumC19506w3.f48804o;
                }
                return null;
            }
            return enumC19506w3;
        }
        return EnumC19506w3.f48803n;
    }

    /* renamed from: a */
    public static String m60976a(String delimiter, Map map) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        StringBuilder sb2 = new StringBuilder();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                String str4 = (String) entry.getValue();
                if (sb2.length() > 0) {
                    sb2.append(delimiter);
                }
                C37612s0 c37612s0 = C37612s0.f99333a;
                Locale locale = Locale.US;
                try {
                    str = URLEncoder.encode(str3, "UTF-8");
                    Intrinsics.checkNotNullExpressionValue(str, "encode(...)");
                } catch (UnsupportedEncodingException unused) {
                    str = "";
                }
                try {
                    str2 = URLEncoder.encode(str4, "UTF-8");
                    Intrinsics.checkNotNullExpressionValue(str2, "encode(...)");
                } catch (UnsupportedEncodingException unused2) {
                    str2 = "";
                }
                String format = String.format(locale, "%s=%s", Arrays.copyOf(new Object[]{str, str2}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
                sb2.append(format);
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    /* renamed from: a */
    public static void m60974a(Map map) {
        if (map != null) {
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    String str = (String) entry.getValue();
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
                    if (str.subSequence(i, length + 1).toString().length() > 0 && entry.getKey() != null) {
                        String str2 = (String) entry.getKey();
                        int length2 = str2.length() - 1;
                        int i2 = 0;
                        boolean z3 = false;
                        while (i2 <= length2) {
                            boolean z4 = Intrinsics.m17071j(str2.charAt(!z3 ? i2 : length2), 32) <= 0;
                            if (z3) {
                                if (!z4) {
                                    break;
                                }
                                length2--;
                            } else if (z4) {
                                i2++;
                            } else {
                                z3 = true;
                            }
                        }
                        if (str2.subSequence(i2, length2 + 1).toString().length() > 0) {
                            String str3 = (String) entry.getKey();
                            int length3 = str3.length() - 1;
                            int i3 = 0;
                            boolean z5 = false;
                            while (i3 <= length3) {
                                boolean z6 = Intrinsics.m17071j(str3.charAt(!z5 ? i3 : length3), 32) <= 0;
                                if (z5) {
                                    if (!z6) {
                                        break;
                                    }
                                    length3--;
                                } else if (z6) {
                                    i3++;
                                } else {
                                    z5 = true;
                                }
                            }
                            String m61239a = AbstractC18880C6.m61239a(length3, 1, str3, i3);
                            String str4 = (String) entry.getValue();
                            int length4 = str4.length() - 1;
                            int i4 = 0;
                            boolean z7 = false;
                            while (i4 <= length4) {
                                boolean z8 = Intrinsics.m17071j(str4.charAt(!z7 ? i4 : length4), 32) <= 0;
                                if (z7) {
                                    if (!z8) {
                                        break;
                                    }
                                    length4--;
                                } else if (z8) {
                                    i4++;
                                } else {
                                    z7 = true;
                                }
                            }
                            hashMap.put(m61239a, AbstractC18880C6.m61239a(length4, 1, str4, i4));
                        }
                    }
                }
            }
            map.clear();
            map.putAll(hashMap);
        }
    }

    /* renamed from: a */
    public static HashMap m60973a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Intrinsics.m17074g(next);
                    String string = jSONObject.getString(next);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    hashMap.put(next, string);
                }
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static String m60977a(String url, HashMap hashMap) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (hashMap == null || !(!hashMap.isEmpty())) {
            return url;
        }
        String str = url;
        for (Map.Entry entry : hashMap.entrySet()) {
            str = StringsJVM.m16628I(str, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
        }
        return str;
    }

    /* renamed from: a */
    public static byte[] m60972a(byte[] compressedData) {
        GZIPInputStream gZIPInputStream;
        Intrinsics.checkNotNullParameter(compressedData, "compressedData");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(compressedData);
        GZIPInputStream gZIPInputStream2 = null;
        try {
            try {
                gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                try {
                    compressedData = m60978a((InputStream) gZIPInputStream);
                } catch (IOException e) {
                    e = e;
                    gZIPInputStream2 = gZIPInputStream;
                    AbstractC19187Z5.m60513a((byte) 2, "K8", "Failed to decompress response", e);
                    gZIPInputStream = gZIPInputStream2;
                    m60979a((Closeable) byteArrayInputStream);
                    m60979a((Closeable) gZIPInputStream);
                    return compressedData;
                } catch (Throwable th) {
                    th = th;
                    gZIPInputStream2 = gZIPInputStream;
                    m60979a((Closeable) byteArrayInputStream);
                    m60979a((Closeable) gZIPInputStream2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
        m60979a((Closeable) byteArrayInputStream);
        m60979a((Closeable) gZIPInputStream);
        return compressedData;
    }

    /* renamed from: a */
    public static byte[] m60978a(InputStream input) {
        Intrinsics.checkNotNullParameter(input, "input");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            try {
                int read = input.read(bArr);
                Unit unit = Unit.f99208a;
                if (-1 != read) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    Intrinsics.m17074g(byteArray);
                    return byteArray;
                }
            } finally {
                m60979a(byteArrayOutputStream);
            }
        }
    }

    /* renamed from: a */
    public static void m60975a(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        if (httpURLConnection != null) {
            try {
                inputStream = httpURLConnection.getInputStream();
            } catch (Error | Exception unused) {
                return;
            }
        } else {
            inputStream = null;
        }
        m60979a((Closeable) inputStream);
        m60979a((Closeable) (httpURLConnection != null ? httpURLConnection.getErrorStream() : null));
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    /* renamed from: a */
    public static final void m60979a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException | Error | Exception unused) {
            }
        }
    }
}
