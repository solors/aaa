package com.maticoo.sdk.mraid;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public class MRAIDHtmlProcessor {
    public static String processRawHtml(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        Matcher matcher = Pattern.compile("<script.*(mraid).*script>", 2).matcher(stringBuffer);
        if (matcher.find()) {
            stringBuffer.delete(matcher.start(), matcher.end());
        }
        boolean contains = str.contains("<html");
        boolean contains2 = str.contains("<head");
        boolean contains3 = str.contains("<body");
        if (contains || (!contains2 && !contains3)) {
            if (contains && !contains3) {
                return null;
            }
            String property = System.getProperty("line.separator");
            if (!contains) {
                stringBuffer.insert(0, "<html>" + property + "<head>" + property + "</head>" + property + "<body><div align='center'>" + property);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("</div></body>");
                sb2.append(property);
                sb2.append("</html>");
                stringBuffer.append(sb2.toString());
            } else if (!contains2) {
                Matcher matcher2 = Pattern.compile("<html[^>]*>", 2).matcher(stringBuffer);
                for (int i = 0; matcher2.find(i); i = matcher2.end()) {
                    stringBuffer.insert(matcher2.end(), property + "<head>" + property + "</head>");
                }
            }
            String str2 = "<style>" + property + "body { margin:0; padding:0;}" + property + "*:not(input) { -webkit-touch-callout:none; -webkit-user-select:none; -webkit-text-size-adjust:none; }" + property + "</style>";
            Matcher matcher3 = Pattern.compile("<head[^>]*>", 2).matcher(stringBuffer);
            for (int i2 = 0; matcher3.find(i2); i2 = matcher3.end()) {
                stringBuffer.insert(matcher3.end(), property + "<meta name='viewport' content='width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no' />" + property + str2);
            }
            return stringBuffer.toString();
        }
        return null;
    }
}
