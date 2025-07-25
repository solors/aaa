package com.applovin.impl.sdk.utils;

import android.net.Uri;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class StringUtils {

    /* renamed from: a */
    private static final char[] f10245a = "0123456789abcdef".toCharArray();

    /* renamed from: com.applovin.impl.sdk.utils.StringUtils$a */
    /* loaded from: classes2.dex */
    class C5488a implements Comparator {
        C5488a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(String str, String str2) {
            return str.compareToIgnoreCase(str2);
        }
    }

    /* renamed from: a */
    private static String m94677a(String str, Integer num) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
            messageDigest.update(str.getBytes("UTF-8"));
            String hexString = toHexString(messageDigest.digest());
            if (num.intValue() > 0) {
                return hexString.substring(0, Math.min(num.intValue(), hexString.length()));
            }
            return hexString;
        } catch (Throwable th) {
            throw new RuntimeException("SHA-1 for \"" + str + "\" failed.", th);
        }
    }

    public static void addLinks(Spannable spannable, Pattern pattern, ClickableSpan clickableSpan, boolean z) {
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            spannable.setSpan(clickableSpan, start, end, 33);
            if (z) {
                spannable.setSpan(new StyleSpan(1), start, end, 256);
            }
        }
    }

    public static String appendQueryParameter(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            buildUpon.appendQueryParameter(str2, str3);
            return buildUpon.build().toString();
        }
        return str;
    }

    public static String appendQueryParameters(String str, Map<String, String> map, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (map != null && !map.isEmpty()) {
            if (z) {
                TreeMap treeMap = new TreeMap(new C5488a());
                treeMap.putAll(map);
                map = treeMap;
            }
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
            }
            return buildUpon.build().toString();
        }
        return str;
    }

    public static boolean containsAtLeastOneSubstring(String str, List<String> list) {
        for (String str2 : list) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsIgnoreCase(String str, String str2) {
        if (isValidString(str) && isValidString(str2) && str.toLowerCase().contains(str2.toLowerCase())) {
            return true;
        }
        return false;
    }

    public static SpannedString createListItemDetailSpannedString(String str, int i) {
        return createSpannedString(str, i, 16);
    }

    public static SpannedString createListItemDetailSubSpannedString(String str, int i) {
        return createSpannedString(str, i, 12, 1);
    }

    public static SpannedString createSpannedString(String str, int i, int i2) {
        return createSpannedString(str, i, i2, 0);
    }

    public static String emptyIfNull(String str) {
        if (str == null) {
            return "";
        }
        return str;
    }

    public static String encodeUriString(String str) {
        if (isValidString(str)) {
            return Uri.encode(str);
        }
        return "";
    }

    public static Boolean endsWith(String str, List<String> list) {
        for (String str2 : list) {
            if (str.endsWith(str2)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public static String getHost(String str) {
        return Uri.parse(str).getHost();
    }

    public static String getHostAndPath(String str) {
        Uri parse = Uri.parse(str);
        return parse.getHost() + parse.getPath();
    }

    public static List<String> getRegexMatches(Matcher matcher, int i) {
        matcher.reset();
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            String group = matcher.group(i);
            if (isValidString(group)) {
                arrayList.add(group);
            }
        }
        return arrayList;
    }

    public static boolean isAlphaNumeric(String str) {
        if (isValidString(str)) {
            return str.matches("^[a-zA-Z0-9]*$");
        }
        return false;
    }

    public static boolean isNumeric(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        char charAt = str.charAt(0);
        if (charAt != '-' && charAt != '+') {
            i = 0;
        } else {
            i = 1;
        }
        int length = str.length();
        if (i == 1 && length == 1) {
            return false;
        }
        while (i < length) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isValidString(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static String join(CharSequence charSequence, List<?> list) {
        if (list != null && !list.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                sb2.append(it.next());
                sb2.append(charSequence);
            }
            sb2.delete(sb2.length() - charSequence.length(), sb2.length());
            return sb2.toString();
        }
        return "";
    }

    public static Matcher match(String str, String str2) {
        return Pattern.compile(str2).matcher(str);
    }

    public static int parseInt(String str) {
        return parseInt(str, 0);
    }

    public static long parseLong(String str, long j) {
        if (isNumeric(str)) {
            return Long.parseLong(str);
        }
        return j;
    }

    public static String prefixToIndex(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (i > str.length()) {
            i = str.length();
        }
        return str.substring(0, i);
    }

    public static String replace(String str, String str2, String str3) {
        if (str3 != null) {
            if (str == null || str.length() < 1 || str2 == null || str2.length() < 1) {
                return str;
            }
            StringBuilder sb2 = new StringBuilder(str);
            int indexOf = sb2.indexOf(str2);
            while (indexOf != -1) {
                sb2.replace(indexOf, str2.length() + indexOf, str3);
                indexOf = sb2.indexOf(str2, indexOf + str3.length());
            }
            return sb2.toString();
        }
        throw new IllegalArgumentException("No replacement target specified");
    }

    public static void replaceAll(StringBuffer stringBuffer, String str, String str2) {
        if (!TextUtils.isEmpty(stringBuffer) && !TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(str2)) {
                int indexOf = stringBuffer.indexOf(str);
                while (indexOf != -1) {
                    stringBuffer.replace(indexOf, str.length() + indexOf, str2);
                    indexOf = stringBuffer.indexOf(str, indexOf + str2.length());
                }
                return;
            }
            throw new IllegalArgumentException("No replacement target specified");
        }
    }

    public static boolean startsWithAtLeastOnePrefix(String str, List<String> list) {
        for (String str2 : list) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static String toDigitsOnlyVersionString(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] split = str.split("\\.");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str2 : split) {
            if (isValidString(str2)) {
                String[] split2 = str2.split("[^0-9]+");
                if (split2.length > 0) {
                    arrayList.add(split2[0]);
                }
            }
        }
        return TextUtils.join(".", arrayList);
    }

    public static String toFullSHA1Hash(String str) {
        return m94677a(str, -1);
    }

    public static String toHexString(byte[] bArr) {
        if (bArr != null) {
            char[] cArr = new char[bArr.length * 2];
            for (int i = 0; i < bArr.length; i++) {
                int i2 = i * 2;
                char[] cArr2 = f10245a;
                byte b = bArr[i];
                cArr[i2] = cArr2[(b & 240) >>> 4];
                cArr[i2 + 1] = cArr2[b & 15];
            }
            return new String(cArr);
        }
        throw new IllegalArgumentException("No data specified");
    }

    public static String toHumanReadableString(String str) {
        String[] split;
        if (!isValidString(str)) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (String str2 : str.split("_")) {
            if (isValidString(str2)) {
                if (str2.equals("id")) {
                    sb2.append(str2.toUpperCase(Locale.ENGLISH));
                } else {
                    String substring = str2.substring(0, 1);
                    Locale locale = Locale.ENGLISH;
                    sb2.append(substring.toUpperCase(locale));
                    sb2.append(str2.substring(1).toLowerCase(locale));
                }
                sb2.append(" ");
            }
        }
        return sb2.deleteCharAt(sb2.length() - 1).toString();
    }

    public static String toShortSHA1Hash(String str) {
        return m94677a(str, 16);
    }

    public static SpannedString createSpannedString(String str, int i, int i2, int i3) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(i), 0, spannableString.length(), 33);
        spannableString.setSpan(new AbsoluteSizeSpan(i2, true), 0, spannableString.length(), 33);
        spannableString.setSpan(new StyleSpan(i3), 0, spannableString.length(), 33);
        return new SpannedString(spannableString);
    }

    public static int parseInt(String str, int i) {
        return isNumeric(str) ? Integer.parseInt(str) : i;
    }

    public static String replace(String str, Map<String, String> map) {
        if (str != null && map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                str = str.replace(entry.getKey(), entry.getValue());
            }
        }
        return str;
    }
}
