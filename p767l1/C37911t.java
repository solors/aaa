package p767l1;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.iab.utils.C10507d;
import com.explorestack.iab.utils.C10512g;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p734j1.C37248c;

/* renamed from: l1.t */
/* loaded from: classes3.dex */
public class C37911t implements Serializable {

    /* renamed from: b */
    private String f99926b;

    /* renamed from: c */
    private HashMap<String, String> f99927c;

    public C37911t() {
    }

    public C37911t(XmlPullParser xmlPullParser) {
        m15746P(xmlPullParser);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    /* renamed from: A */
    public static Integer m15760A(String str) {
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (Exception e) {
            C37248c.m18679c("VastXmlTag", e.getMessage(), new Object[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public static String m15759B(@NonNull XmlPullParser xmlPullParser) {
        if (xmlPullParser.next() == 4) {
            String text = xmlPullParser.getText();
            if (!TextUtils.isEmpty(text)) {
                text = text.trim();
            }
            xmlPullParser.nextTag();
            return text;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public static void m15758C(@NonNull XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() == 2) {
            int i = 1;
            while (i != 0) {
                int next = xmlPullParser.next();
                if (next != 2) {
                    if (next == 3) {
                        i--;
                    }
                } else {
                    i++;
                }
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: D */
    private boolean m15757D(@Nullable String str) {
        String[] mo15727I = mo15727I();
        if (mo15727I != null && mo15727I.length > 0) {
            for (String str2 : mo15727I) {
                if (str2.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public static int m15756E(@Nullable String str) {
        if (str != null) {
            int indexOf = str.indexOf(".");
            if (indexOf > 0) {
                str = str.substring(0, indexOf);
            }
            String[] split = str.split(":");
            if (split.length > 2) {
                try {
                    return (Integer.parseInt(split[0]) * 3600) + (Integer.parseInt(split[1]) * 60) + Integer.parseInt(split[2]);
                } catch (Exception e) {
                    C37248c.m18680b("VastXmlTag", e);
                    return -1;
                }
            }
            return -1;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static int m15755F(@Nullable String str) {
        if (str != null) {
            String[] split = str.split(":");
            if (split.length > 1) {
                try {
                    return (Integer.parseInt(split[0]) * 60) + Integer.parseInt(split[1]);
                } catch (Exception e) {
                    C37248c.m18680b("VastXmlTag", e);
                    return -1;
                }
            }
            return -1;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    /* renamed from: G */
    public static Integer m15754G(String str) {
        int i;
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            lowerCase.hashCode();
            if (!lowerCase.equals("portrait")) {
                if (lowerCase.equals("landscape")) {
                    i = 2;
                } else {
                    return null;
                }
            } else {
                i = 1;
            }
            return Integer.valueOf(i);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    /* renamed from: K */
    public static Integer m15751K(String str) {
        int i;
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            lowerCase.hashCode();
            char c = 65535;
            switch (lowerCase.hashCode()) {
                case -1364013995:
                    if (lowerCase.equals("center")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3317767:
                    if (lowerCase.equals("left")) {
                        c = 1;
                        break;
                    }
                    break;
                case 108511772:
                    if (lowerCase.equals("right")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return 1;
                case 1:
                    i = 3;
                    break;
                case 2:
                    i = 5;
                    break;
                default:
                    return null;
            }
            return Integer.valueOf(i);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    /* renamed from: L */
    public static Integer m15750L(String str) {
        int i;
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            lowerCase.hashCode();
            char c = 65535;
            switch (lowerCase.hashCode()) {
                case -1383228885:
                    if (lowerCase.equals("bottom")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1364013995:
                    if (lowerCase.equals("center")) {
                        c = 1;
                        break;
                    }
                    break;
                case 115029:
                    if (lowerCase.equals(ViewHierarchyConstants.DIMENSION_TOP_KEY)) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    i = 80;
                    break;
                case 1:
                    i = 16;
                    break;
                case 2:
                    i = 48;
                    break;
                default:
                    return null;
            }
            return Integer.valueOf(i);
        }
        return null;
    }

    /* renamed from: N */
    static boolean m15748N(@Nullable String str) {
        if (str != null && (str.equalsIgnoreCase("false") || str.equalsIgnoreCase("0"))) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    static boolean m15747O(@Nullable String str) {
        if (str != null && (str.equalsIgnoreCase("true") || str.equalsIgnoreCase("1"))) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    private static HashMap<String, String> m15743s(@NonNull C37911t c37911t, @NonNull XmlPullParser xmlPullParser) {
        if (xmlPullParser.getAttributeCount() > 0) {
            HashMap<String, String> hashMap = new HashMap<>();
            for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
                if (c37911t.m15757D(xmlPullParser.getAttributeName(i))) {
                    hashMap.put(xmlPullParser.getAttributeName(i), xmlPullParser.getAttributeValue(i));
                }
            }
            return hashMap;
        }
        return null;
    }

    /* renamed from: t */
    private void m15742t(HashMap<String, String> hashMap) {
        this.f99927c = hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public static void m15740v(@NonNull XmlPullParser xmlPullParser, @NonNull C10507d c10507d) {
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            if (!TextUtils.isEmpty(attributeValue)) {
                try {
                    if ("stroke".equals(attributeName)) {
                        c10507d.m79383T(m15760A(attributeValue));
                    } else if (Reporting.EventType.FILL.equals(attributeName)) {
                        c10507d.m79395H(m15760A(attributeValue));
                    } else if ("outlined".equals(attributeName)) {
                        c10507d.m79386Q(Boolean.valueOf(m15747O(attributeValue)));
                    } else if ("visible".equals(attributeName)) {
                        c10507d.m79379X(Boolean.valueOf(m15747O(attributeValue)));
                    } else if ("x".equals(attributeName)) {
                        c10507d.m79390M(m15751K(attributeValue));
                    } else if ("y".equals(attributeName)) {
                        c10507d.m79380W(m15750L(attributeValue));
                    } else if ("style".equals(attributeName)) {
                        c10507d.m79381V(attributeValue);
                    } else if ("opacity".equals(attributeName)) {
                        c10507d.m79387P(Float.valueOf(Float.parseFloat(attributeValue)));
                    } else if ("hideafter".equals(attributeName)) {
                        c10507d.m79391L(Float.valueOf(Float.parseFloat(attributeValue)));
                    } else if ("padding".equals(attributeName)) {
                        c10507d.m79384S(attributeValue);
                    } else if ("margin".equals(attributeName)) {
                        c10507d.m79388O(attributeValue);
                    } else if ("strokewidth".equals(attributeName)) {
                        c10507d.m79382U(C10512g.m79303n(attributeValue));
                    } else if ("width".equals(attributeName)) {
                        c10507d.m79378Y(C10512g.m79303n(attributeValue));
                    } else if ("height".equals(attributeName)) {
                        c10507d.m79392K(C10512g.m79303n(attributeValue));
                    } else if ("fontstyle".equals(attributeName)) {
                        c10507d.m79393J(Integer.valueOf(Integer.parseInt(attributeValue)));
                    } else if ("fontsize".equals(attributeName)) {
                        c10507d.m79394I(C10512g.m79303n(attributeValue));
                    }
                } catch (Throwable th) {
                    C37248c.m18680b("VastXmlTag", th);
                }
            }
        }
        try {
            c10507d.m79396G(m15759B(xmlPullParser));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            xmlPullParser.require(3, null, xmlPullParser.getName());
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    /* renamed from: w */
    private boolean m15739w() {
        HashMap<String, String> hashMap = this.f99927c;
        if (hashMap != null && !hashMap.isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static boolean m15738x(@Nullable String str, @Nullable String str2) {
        if (str != null && str.equalsIgnoreCase(str2)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public static boolean m15736z(@NonNull XmlPullParser xmlPullParser) {
        return m15747O(m15759B(xmlPullParser));
    }

    /* renamed from: H */
    public final boolean m15753H(@NonNull String str, boolean z) {
        String m15744r = m15744r(str);
        if (m15747O(m15744r)) {
            return true;
        }
        if (m15748N(m15744r)) {
            return false;
        }
        return z;
    }

    /* renamed from: I */
    public String[] mo15727I() {
        return new String[0];
    }

    /* renamed from: J */
    public final String m15752J() {
        return this.f99926b;
    }

    /* renamed from: M */
    public boolean mo15749M() {
        return false;
    }

    /* renamed from: P */
    public void m15746P(XmlPullParser xmlPullParser) {
        m15742t(m15743s(this, xmlPullParser));
        if (mo15749M()) {
            m15745Q(m15759B(xmlPullParser));
        }
        mo15741u(xmlPullParser);
    }

    /* renamed from: Q */
    public final void m15745Q(String str) {
        this.f99926b = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public final String m15744r(@NonNull String str) {
        if (m15739w()) {
            return this.f99927c.get(str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public final int m15737y(@NonNull String str) {
        String m15744r = m15744r(str);
        if (TextUtils.isEmpty(m15744r)) {
            C37248c.m18681a("VastXmlTag", "Error parse attribute value - %s, by name - %s", m15744r, str);
            return -1;
        }
        try {
            return Integer.parseInt(m15744r);
        } catch (Exception unused) {
            C37248c.m18679c("VastXmlTag", "Error parse attribute value - %s, by name - %s", m15744r, str);
            return -1;
        }
    }

    /* renamed from: u */
    protected void mo15741u(XmlPullParser xmlPullParser) {
    }
}
