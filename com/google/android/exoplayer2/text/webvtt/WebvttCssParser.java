package com.google.android.exoplayer2.text.webvtt;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.appevents.UserDataStore;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ColorParser;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
final class WebvttCssParser {

    /* renamed from: c */
    private static final Pattern f34986c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d */
    private static final Pattern f34987d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a */
    private final ParsableByteArray f34988a = new ParsableByteArray();

    /* renamed from: b */
    private final StringBuilder f34989b = new StringBuilder();

    /* renamed from: a */
    private void m73399a(WebvttCssStyle webvttCssStyle, String str) {
        if ("".equals(str)) {
            return;
        }
        int indexOf = str.indexOf(91);
        if (indexOf != -1) {
            Matcher matcher = f34986c.matcher(str.substring(indexOf));
            if (matcher.matches()) {
                webvttCssStyle.setTargetVoice((String) Assertions.checkNotNull(matcher.group(1)));
            }
            str = str.substring(0, indexOf);
        }
        String[] split = Util.split(str, "\\.");
        String str2 = split[0];
        int indexOf2 = str2.indexOf(35);
        if (indexOf2 != -1) {
            webvttCssStyle.setTargetTagName(str2.substring(0, indexOf2));
            webvttCssStyle.setTargetId(str2.substring(indexOf2 + 1));
        } else {
            webvttCssStyle.setTargetTagName(str2);
        }
        if (split.length > 1) {
            webvttCssStyle.setTargetClasses((String[]) Util.nullSafeArrayCopyOfRange(split, 1, split.length));
        }
    }

    /* renamed from: b */
    private static boolean m73398b(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        int limit = parsableByteArray.limit();
        byte[] data = parsableByteArray.getData();
        if (position + 2 <= limit) {
            int i = position + 1;
            if (data[position] == 47) {
                int i2 = i + 1;
                if (data[i] != 42) {
                    return false;
                }
                while (true) {
                    int i3 = i2 + 1;
                    if (i3 < limit) {
                        if (((char) data[i2]) == '*' && ((char) data[i3]) == '/') {
                            i2 = i3 + 1;
                            limit = i2;
                        } else {
                            i2 = i3;
                        }
                    } else {
                        parsableByteArray.skipBytes(limit - parsableByteArray.getPosition());
                        return true;
                    }
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /* renamed from: c */
    private static boolean m73397c(ParsableByteArray parsableByteArray) {
        char m73390j = m73390j(parsableByteArray, parsableByteArray.getPosition());
        if (m73390j != '\t' && m73390j != '\n' && m73390j != '\f' && m73390j != '\r' && m73390j != ' ') {
            return false;
        }
        parsableByteArray.skipBytes(1);
        return true;
    }

    /* renamed from: d */
    private static void m73396d(String str, WebvttCssStyle webvttCssStyle) {
        Matcher matcher = f34987d.matcher(Ascii.toLowerCase(str));
        if (!matcher.matches()) {
            Log.m72602w("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) Assertions.checkNotNull(matcher.group(2));
        str2.hashCode();
        char c = 65535;
        switch (str2.hashCode()) {
            case 37:
                if (str2.equals("%")) {
                    c = 0;
                    break;
                }
                break;
            case 3240:
                if (str2.equals(UserDataStore.EMAIL)) {
                    c = 1;
                    break;
                }
                break;
            case 3592:
                if (str2.equals("px")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                webvttCssStyle.setFontSizeUnit(3);
                break;
            case 1:
                webvttCssStyle.setFontSizeUnit(2);
                break;
            case 2:
                webvttCssStyle.setFontSizeUnit(1);
                break;
            default:
                throw new IllegalStateException();
        }
        webvttCssStyle.setFontSize(Float.parseFloat((String) Assertions.checkNotNull(matcher.group(1))));
    }

    /* renamed from: e */
    private static String m73395e(ParsableByteArray parsableByteArray, StringBuilder sb2) {
        boolean z = false;
        sb2.setLength(0);
        int position = parsableByteArray.getPosition();
        int limit = parsableByteArray.limit();
        while (position < limit && !z) {
            char c = (char) parsableByteArray.getData()[position];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && ((c < '0' || c > '9') && c != '#' && c != '-' && c != '.' && c != '_'))) {
                z = true;
            } else {
                position++;
                sb2.append(c);
            }
        }
        parsableByteArray.skipBytes(position - parsableByteArray.getPosition());
        return sb2.toString();
    }

    @Nullable
    /* renamed from: f */
    static String m73394f(ParsableByteArray parsableByteArray, StringBuilder sb2) {
        m73387m(parsableByteArray);
        if (parsableByteArray.bytesLeft() == 0) {
            return null;
        }
        String m73395e = m73395e(parsableByteArray, sb2);
        if (!"".equals(m73395e)) {
            return m73395e;
        }
        return "" + ((char) parsableByteArray.readUnsignedByte());
    }

    @Nullable
    /* renamed from: g */
    private static String m73393g(ParsableByteArray parsableByteArray, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int position = parsableByteArray.getPosition();
            String m73394f = m73394f(parsableByteArray, sb2);
            if (m73394f == null) {
                return null;
            }
            if (!"}".equals(m73394f) && !";".equals(m73394f)) {
                sb3.append(m73394f);
            } else {
                parsableByteArray.setPosition(position);
                z = true;
            }
        }
        return sb3.toString();
    }

    @Nullable
    /* renamed from: h */
    private static String m73392h(ParsableByteArray parsableByteArray, StringBuilder sb2) {
        String str;
        m73387m(parsableByteArray);
        if (parsableByteArray.bytesLeft() < 5 || !"::cue".equals(parsableByteArray.readString(5))) {
            return null;
        }
        int position = parsableByteArray.getPosition();
        String m73394f = m73394f(parsableByteArray, sb2);
        if (m73394f == null) {
            return null;
        }
        if ("{".equals(m73394f)) {
            parsableByteArray.setPosition(position);
            return "";
        }
        if ("(".equals(m73394f)) {
            str = m73389k(parsableByteArray);
        } else {
            str = null;
        }
        if (!")".equals(m73394f(parsableByteArray, sb2))) {
            return null;
        }
        return str;
    }

    /* renamed from: i */
    private static void m73391i(ParsableByteArray parsableByteArray, WebvttCssStyle webvttCssStyle, StringBuilder sb2) {
        m73387m(parsableByteArray);
        String m73395e = m73395e(parsableByteArray, sb2);
        if ("".equals(m73395e) || !":".equals(m73394f(parsableByteArray, sb2))) {
            return;
        }
        m73387m(parsableByteArray);
        String m73393g = m73393g(parsableByteArray, sb2);
        if (m73393g != null && !"".equals(m73393g)) {
            int position = parsableByteArray.getPosition();
            String m73394f = m73394f(parsableByteArray, sb2);
            if (!";".equals(m73394f)) {
                if ("}".equals(m73394f)) {
                    parsableByteArray.setPosition(position);
                } else {
                    return;
                }
            }
            if ("color".equals(m73395e)) {
                webvttCssStyle.setFontColor(ColorParser.parseCssColor(m73393g));
            } else if ("background-color".equals(m73395e)) {
                webvttCssStyle.setBackgroundColor(ColorParser.parseCssColor(m73393g));
            } else {
                boolean z = true;
                if ("ruby-position".equals(m73395e)) {
                    if ("over".equals(m73393g)) {
                        webvttCssStyle.setRubyPosition(1);
                    } else if ("under".equals(m73393g)) {
                        webvttCssStyle.setRubyPosition(2);
                    }
                } else if ("text-combine-upright".equals(m73395e)) {
                    if (!"all".equals(m73393g) && !m73393g.startsWith("digits")) {
                        z = false;
                    }
                    webvttCssStyle.setCombineUpright(z);
                } else if ("text-decoration".equals(m73395e)) {
                    if ("underline".equals(m73393g)) {
                        webvttCssStyle.setUnderline(true);
                    }
                } else if ("font-family".equals(m73395e)) {
                    webvttCssStyle.setFontFamily(m73393g);
                } else if ("font-weight".equals(m73395e)) {
                    if ("bold".equals(m73393g)) {
                        webvttCssStyle.setBold(true);
                    }
                } else if ("font-style".equals(m73395e)) {
                    if ("italic".equals(m73393g)) {
                        webvttCssStyle.setItalic(true);
                    }
                } else if ("font-size".equals(m73395e)) {
                    m73396d(m73393g, webvttCssStyle);
                }
            }
        }
    }

    /* renamed from: j */
    private static char m73390j(ParsableByteArray parsableByteArray, int i) {
        return (char) parsableByteArray.getData()[i];
    }

    /* renamed from: k */
    private static String m73389k(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        int limit = parsableByteArray.limit();
        boolean z = false;
        while (position < limit && !z) {
            int i = position + 1;
            if (((char) parsableByteArray.getData()[position]) == ')') {
                z = true;
            } else {
                z = false;
            }
            position = i;
        }
        return parsableByteArray.readString((position - 1) - parsableByteArray.getPosition()).trim();
    }

    /* renamed from: l */
    static void m73388l(ParsableByteArray parsableByteArray) {
        do {
        } while (!TextUtils.isEmpty(parsableByteArray.readLine()));
    }

    /* renamed from: m */
    static void m73387m(ParsableByteArray parsableByteArray) {
        while (true) {
            for (boolean z = true; parsableByteArray.bytesLeft() > 0 && z; z = false) {
                if (!m73397c(parsableByteArray) && !m73398b(parsableByteArray)) {
                }
            }
            return;
        }
    }

    public List<WebvttCssStyle> parseBlock(ParsableByteArray parsableByteArray) {
        boolean z;
        this.f34989b.setLength(0);
        int position = parsableByteArray.getPosition();
        m73388l(parsableByteArray);
        this.f34988a.reset(parsableByteArray.getData(), parsableByteArray.getPosition());
        this.f34988a.setPosition(position);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String m73392h = m73392h(this.f34988a, this.f34989b);
            if (m73392h != null) {
                if (!"{".equals(m73394f(this.f34988a, this.f34989b))) {
                    return arrayList;
                }
                WebvttCssStyle webvttCssStyle = new WebvttCssStyle();
                m73399a(webvttCssStyle, m73392h);
                String str = null;
                boolean z2 = false;
                while (!z2) {
                    int position2 = this.f34988a.getPosition();
                    String m73394f = m73394f(this.f34988a, this.f34989b);
                    if (m73394f != null && !"}".equals(m73394f)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        this.f34988a.setPosition(position2);
                        m73391i(this.f34988a, webvttCssStyle, this.f34989b);
                    }
                    str = m73394f;
                    z2 = z;
                }
                if ("}".equals(str)) {
                    arrayList.add(webvttCssStyle);
                }
            } else {
                return arrayList;
            }
        }
    }
}
