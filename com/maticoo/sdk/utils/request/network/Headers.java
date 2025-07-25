package com.maticoo.sdk.utils.request.network;

import android.text.TextUtils;
import java.net.HttpCookie;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TimeZone;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class Headers {
    public static final String KEY_ACCEPT = "Accept";
    public static final String KEY_ACCEPT_ENCODING = "Accept-Encoding";
    public static final String KEY_ACCEPT_LANGUAGE = "Accept-Language";
    public static final String KEY_ACCEPT_RANGE = "Accept-Range";
    public static final String KEY_CACHE_CONTROL = "Cache-Control";
    public static final String KEY_CONNECTION = "Connection";
    public static final String KEY_CONTENT_DISPOSITION = "Content-Disposition";
    public static final String KEY_CONTENT_ENCODING = "Content-Encoding";
    public static final String KEY_CONTENT_LENGTH = "Content-Length";
    public static final String KEY_CONTENT_RANGE = "Content-Range";
    public static final String KEY_CONTENT_TYPE = "Content-Type";
    public static final String KEY_COOKIE = "Cookie";
    public static final String KEY_DATE = "Date";
    public static final String KEY_EXPIRES = "Expires";
    public static final String KEY_E_TAG = "ETag";
    public static final String KEY_HOST = "Host";
    public static final String KEY_IF_MODIFIED_SINCE = "If-Modified-Since";
    public static final String KEY_IF_NONE_MATCH = "If-None-Match";
    public static final String KEY_LAST_MODIFIED = "Last-Modified";
    public static final String KEY_LOCATION = "Location";
    public static final String KEY_RANGE = "Range";
    public static final String KEY_SET_COOKIE = "Set-Cookie";
    public static final String KEY_USER_AGENT = "User-Agent";
    public static final String TIME_FORMAT_HTTP = "EEE, dd MMM y HH:mm:ss 'GMT'";
    public static final TimeZone TIME_ZONE_GMT = TimeZone.getTimeZone("GMT");
    public static final String VALUE_ACCEPT_ALL = "*/*";
    public static final String VALUE_ACCEPT_ENCODING = "gzip, deflate";
    public static final String VALUE_APPLICATION_FORM = "multipart/form-data";
    public static final String VALUE_APPLICATION_GZIP = "application/gzip";
    public static final String VALUE_APPLICATION_JSON = "application/json";
    public static final String VALUE_APPLICATION_STREAM = "application/octet-stream";
    public static final String VALUE_APPLICATION_URLENCODED = "application/x-www-form-urlencoded";
    public static final String VALUE_APPLICATION_XML = "application/xml";
    public static final String VALUE_CLOSE = "close";
    public static final String VALUE_KEEP_ALIVE = "keep-alive";
    private Map<String, List<String>> mSource = new TreeMap();

    public static long analysisCacheExpires(Headers headers) {
        long j;
        long j2;
        long currentTimeMillis = System.currentTimeMillis();
        String cacheControl = headers.getCacheControl();
        if (!TextUtils.isEmpty(cacheControl)) {
            StringTokenizer stringTokenizer = new StringTokenizer(cacheControl, ",");
            j = 0;
            j2 = 0;
            while (stringTokenizer.hasMoreTokens()) {
                String lowerCase = stringTokenizer.nextToken().trim().toLowerCase(Locale.getDefault());
                if ("no-cache".equals(lowerCase) || "no-store".equals(lowerCase)) {
                    return 0L;
                }
                if (lowerCase.startsWith("max-age=")) {
                    j = Long.parseLong(lowerCase.substring(8)) * 1000;
                } else if (lowerCase.startsWith("must-revalidate")) {
                    return 0L;
                } else {
                    if (lowerCase.startsWith("stale-while-revalidate=")) {
                        j2 = Long.parseLong(lowerCase.substring(23)) * 1000;
                    }
                }
            }
        } else {
            j = 0;
            j2 = 0;
        }
        if (!TextUtils.isEmpty(cacheControl)) {
            long j3 = currentTimeMillis + j;
            if (j2 > 0) {
                return j3 + j2;
            }
            return j3;
        }
        long expires = headers.getExpires();
        long date = headers.getDate();
        if (expires <= date) {
            return 0L;
        }
        return (currentTimeMillis + expires) - date;
    }

    public static long formatGMTToMillis(String str) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(TIME_FORMAT_HTTP, Locale.US);
        simpleDateFormat.setTimeZone(TIME_ZONE_GMT);
        return simpleDateFormat.parse(str).getTime();
    }

    public static String formatKey(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.toLowerCase(Locale.ENGLISH).split("-");
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : split) {
            String substring = str2.substring(0, 1);
            String substring2 = str2.substring(1);
            sb2.append(substring.toUpperCase(Locale.ENGLISH));
            sb2.append(substring2);
            sb2.append("-");
        }
        if (sb2.length() > 0) {
            sb2.deleteCharAt(sb2.lastIndexOf("-"));
        }
        return sb2.toString();
    }

    public static String formatMillisToGMT(long j) {
        Date date = new Date(j);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(TIME_FORMAT_HTTP, Locale.US);
        simpleDateFormat.setTimeZone(TIME_ZONE_GMT);
        return simpleDateFormat.format(date);
    }

    public static Headers fromJSONString(String str) throws JSONException {
        Headers headers = new Headers();
        JSONObject jSONObject = new JSONObject(str);
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONArray jSONArray = new JSONArray(jSONObject.optString(next));
            for (int i = 0; i < jSONArray.length(); i++) {
                headers.add(next, jSONArray.optString(i));
            }
        }
        return headers;
    }

    private long getDateField(String str) {
        String first = getFirst(str);
        if (!TextUtils.isEmpty(first)) {
            try {
                return formatGMTToMillis(first);
            } catch (ParseException unused) {
                return 0L;
            }
        }
        return 0L;
    }

    public static List<HttpCookie> getHttpCookieList(Headers headers) {
        ArrayList arrayList = new ArrayList();
        for (String str : headers.keySet()) {
            if (str.equalsIgnoreCase("Set-Cookie")) {
                for (String str2 : headers.get(str)) {
                    arrayList.addAll(HttpCookie.parse(str2));
                }
            }
        }
        return arrayList;
    }

    public static Map<String, String> getRequestHeaders(Headers headers) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
            linkedHashMap.put(entry.getKey(), TextUtils.join("; ", entry.getValue()));
        }
        return linkedHashMap;
    }

    public static String parseSubValue(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ";");
            while (stringTokenizer.hasMoreElements()) {
                String nextToken = stringTokenizer.nextToken();
                int indexOf = nextToken.indexOf(61);
                if (indexOf > 0 && str2.equalsIgnoreCase(nextToken.substring(0, indexOf).trim())) {
                    return nextToken.substring(indexOf + 1).trim();
                }
            }
            return str3;
        }
        return str3;
    }

    public static String toJSONString(Headers headers) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), new JSONArray((Collection) entry.getValue()));
            } catch (JSONException unused) {
            }
        }
        return jSONObject.toString();
    }

    public void add(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (!this.mSource.containsKey(str)) {
            this.mSource.put(str, new ArrayList(1));
        }
        this.mSource.get(str).add(str2);
    }

    public void clear() {
        this.mSource.clear();
    }

    public boolean containsKey(String str) {
        return this.mSource.containsKey(str);
    }

    public Set<Map.Entry<String, List<String>>> entrySet() {
        return this.mSource.entrySet();
    }

    public List<String> get(String str) {
        return this.mSource.get(str);
    }

    public String getCacheControl() {
        List<String> list = get("Cache-Control");
        if (list == null) {
            list = Collections.emptyList();
        }
        return TextUtils.join(",", list);
    }

    public String getContentDisposition() {
        return getFirst("Content-Disposition");
    }

    public String getContentEncoding() {
        return getFirst("Content-Encoding");
    }

    public long getContentLength() {
        String first = getFirst("Content-Length");
        if (TextUtils.isEmpty(first)) {
            first = "0";
        }
        return Long.parseLong(first);
    }

    public String getContentRange() {
        return getFirst("Content-Range");
    }

    public String getContentType() {
        return getFirst("Content-Type");
    }

    public long getDate() {
        return getDateField("Date");
    }

    public String getETag() {
        return getFirst("ETag");
    }

    public long getExpires() {
        return getDateField("Expires");
    }

    public String getFirst(String str) {
        List<String> list = this.mSource.get(str);
        if (list != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    public long getLastModified() {
        return getDateField("Last-Modified");
    }

    public String getLocation() {
        return getFirst("Location");
    }

    public boolean isEmpty() {
        return this.mSource.isEmpty();
    }

    public Set<String> keySet() {
        return this.mSource.keySet();
    }

    public List<String> remove(String str) {
        return this.mSource.remove(str);
    }

    public void set(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.mSource.remove(str);
        add(str, str2);
    }

    public int size() {
        return this.mSource.size();
    }

    public Map<String, List<String>> toMap() {
        return this.mSource;
    }

    public void set(String str, List<String> list) {
        if (TextUtils.isEmpty(str) || list.isEmpty()) {
            return;
        }
        this.mSource.put(str, list);
    }

    public void add(String str, List<String> list) {
        if (TextUtils.isEmpty(str) || list.isEmpty()) {
            return;
        }
        for (String str2 : list) {
            add(str, str2);
        }
    }

    public void set(Headers headers) {
        for (Map.Entry<String, List<String>> entry : this.mSource.entrySet()) {
            set(entry.getKey(), entry.getValue());
        }
    }

    public void add(Headers headers) {
        for (Map.Entry<String, List<String>> entry : this.mSource.entrySet()) {
            String key = entry.getKey();
            for (String str : entry.getValue()) {
                add(key, str);
            }
        }
    }
}
