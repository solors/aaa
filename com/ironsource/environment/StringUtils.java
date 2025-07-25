package com.ironsource.environment;

import com.ironsource.C20086i9;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Locale;

/* loaded from: classes6.dex */
public class StringUtils {
    public static String decodeURI(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            C20086i9.m57997d().m58003a(e);
            return "";
        }
    }

    public static String encodeURI(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replace("+", "%20");
        } catch (UnsupportedEncodingException e) {
            C20086i9.m57997d().m58003a(e);
            return "";
        }
    }

    public static String toLowerCase(String str) {
        if (str == null) {
            return "";
        }
        return str.toLowerCase(Locale.ENGLISH);
    }

    public static String toUpperCase(String str) {
        if (str == null) {
            return "";
        }
        return str.toUpperCase(Locale.ENGLISH);
    }
}
