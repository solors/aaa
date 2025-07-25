package com.bykv.p135vk.openvk.preload.falconx.p166a;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebResourceResponse;
import com.bykv.p135vk.openvk.preload.p155a.JsonElement;
import com.bykv.p135vk.openvk.preload.p155a.JsonIOException;
import com.bykv.p135vk.openvk.preload.p155a.JsonNull;
import com.bykv.p135vk.openvk.preload.p155a.JsonParseException;
import com.bykv.p135vk.openvk.preload.p155a.JsonSyntaxException;
import com.bykv.p135vk.openvk.preload.p155a.p157b.p158a.TypeAdapters;
import com.bykv.p135vk.openvk.preload.p155a.p162d.JsonReader;
import com.bykv.p135vk.openvk.preload.p155a.p162d.JsonWriter;
import com.bykv.p135vk.openvk.preload.p155a.p162d.MalformedJsonException;
import com.bykv.p135vk.openvk.preload.p163b.Interceptor;
import com.bykv.p135vk.openvk.preload.p163b.p165b.AbstractC6618a;
import com.bykv.p135vk.openvk.preload.p163b.p165b.EventListenerWrapper;
import com.ironsource.C20517nb;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.bykv.vk.openvk.preload.falconx.a.a */
/* loaded from: classes3.dex */
public class WebResourceUtils {

    /* renamed from: a */
    private final Map<Class<? extends Interceptor<?, ?>>, EventListenerWrapper> f13926a = new HashMap();

    /* renamed from: a */
    public static WebResourceResponse m91435a(InputStream inputStream, Map<String, String> map) {
        if (inputStream != null) {
            try {
                String str = map.get("content-type");
                String[] strArr = new String[0];
                if (TextUtils.isEmpty(str)) {
                    str = map.get("Content-Type");
                }
                if (!TextUtils.isEmpty(str) && str != null) {
                    str = str.replace(" ", "");
                    strArr = str.split(";");
                }
                String str2 = "";
                String str3 = str2;
                for (String str4 : strArr) {
                    if (!TextUtils.isEmpty(str4)) {
                        int indexOf = str4.indexOf("=");
                        if (indexOf == -1) {
                            str2 = str4;
                        } else if (str4.contains(C20517nb.f52166M)) {
                            str3 = str4.substring(indexOf + 1);
                        }
                    }
                }
                if (str != null ? str.contains("font/ttf") : false) {
                    return new WebResourceResponse(str2, str3, 200, "OK", map, inputStream);
                }
                WebResourceResponse webResourceResponse = new WebResourceResponse(str2, str3, inputStream);
                webResourceResponse.setResponseHeaders(map);
                return webResourceResponse;
            } catch (Throwable th) {
                Log.e("WebResourceUtils", "getResponseWithHeaders error", th);
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void m91433a(Class<? extends Interceptor<?, ?>> cls, AbstractC6618a abstractC6618a) {
        synchronized (this.f13926a) {
            EventListenerWrapper eventListenerWrapper = this.f13926a.get(cls);
            if (eventListenerWrapper == null) {
                eventListenerWrapper = new EventListenerWrapper(new AbstractC6618a[0]);
                this.f13926a.put(cls, eventListenerWrapper);
            }
            eventListenerWrapper.m91474a(abstractC6618a);
        }
    }

    /* renamed from: a */
    public final AbstractC6618a m91434a(Class<? extends Interceptor<?, ?>> cls) {
        EventListenerWrapper eventListenerWrapper;
        synchronized (this.f13926a) {
            eventListenerWrapper = this.f13926a.get(cls);
        }
        return eventListenerWrapper;
    }

    /* renamed from: a */
    public static <T> T m91432a(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: a */
    public static void m91431a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public static DateFormat m91438a(int i, int i2) {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (i == 0) {
            str = "EEEE, MMMM d, yyyy";
        } else if (i == 1) {
            str = "MMMM d, yyyy";
        } else if (i == 2) {
            str = "MMM d, yyyy";
        } else if (i != 3) {
            throw new IllegalArgumentException("Unknown DateFormat style: ".concat(String.valueOf(i)));
        } else {
            str = "M/d/yy";
        }
        sb2.append(str);
        sb2.append(" ");
        if (i2 == 0 || i2 == 1) {
            str2 = "h:mm:ss a z";
        } else if (i2 == 2) {
            str2 = "h:mm:ss a";
        } else if (i2 != 3) {
            throw new IllegalArgumentException("Unknown DateFormat style: ".concat(String.valueOf(i2)));
        } else {
            str2 = "h:mm a";
        }
        sb2.append(str2);
        return new SimpleDateFormat(sb2.toString(), Locale.US);
    }

    /* renamed from: a */
    public static JsonElement m91437a(JsonReader jsonReader) throws JsonParseException {
        boolean z;
        try {
            try {
                jsonReader.mo91542f();
                z = false;
                try {
                    return TypeAdapters.f13664A.mo91327a(jsonReader);
                } catch (EOFException e) {
                    e = e;
                    if (z) {
                        return JsonNull.f13889a;
                    }
                    throw new JsonSyntaxException(e);
                }
            } catch (MalformedJsonException e2) {
                throw new JsonSyntaxException(e2);
            } catch (IOException e3) {
                throw new JsonIOException(e3);
            } catch (NumberFormatException e4) {
                throw new JsonSyntaxException(e4);
            }
        } catch (EOFException e5) {
            e = e5;
            z = true;
        }
    }

    /* renamed from: a */
    public static void m91436a(JsonElement jsonElement, JsonWriter jsonWriter) throws IOException {
        TypeAdapters.f13664A.mo91326a(jsonWriter, jsonElement);
    }
}
