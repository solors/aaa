package com.fyber.inneractive.sdk.response;

import android.util.Xml;
import com.fyber.inneractive.sdk.util.C15426Q;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: com.fyber.inneractive.sdk.response.h */
/* loaded from: classes4.dex */
public final class C15389h {

    /* renamed from: a */
    public final boolean f30490a;

    /* renamed from: b */
    public String f30491b;

    public C15389h(String str) {
        this.f30490a = false;
        try {
            m76575a(str);
            this.f30490a = true;
            IAlog.m76529a("parser: Parsing finished. parser is ready", new Object[0]);
        } catch (Exception e) {
            IAlog.m76528b("Error parsing Ad XML: %s", e.getMessage());
            throw e;
        }
    }

    /* renamed from: a */
    public final void m76575a(String str) {
        String str2;
        IAlog.m76529a("Start reading Response", new Object[0]);
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        newPullParser.setInput(new StringReader(str));
        newPullParser.nextTag();
        newPullParser.require(2, null, "tns:Response");
        while (newPullParser.next() != 3) {
            if (newPullParser.getEventType() == 2) {
                int i = 1;
                if (newPullParser.getName().equals("tns:Ad")) {
                    newPullParser.require(2, null, "tns:Ad");
                    IAlog.m76529a("Start reading Ad", new Object[0]);
                    if (newPullParser.next() == 4) {
                        str2 = newPullParser.getText();
                        newPullParser.nextTag();
                    } else {
                        IAlog.m76524f("No text: %s", newPullParser.getName());
                        str2 = "";
                    }
                    String trim = str2.trim();
                    IAlog.m76525e("Ad content: %s", trim);
                    if (trim == null) {
                        trim = null;
                    } else {
                        C15426Q c15426q = C15426Q.f30565b;
                        c15426q.getClass();
                        int indexOf = trim.indexOf(38);
                        if (indexOf >= 0) {
                            StringWriter stringWriter = new StringWriter((int) ((trim.length() * 0.1d) + trim.length()));
                            try {
                                c15426q.m76517a(stringWriter, trim, indexOf);
                            } catch (IOException unused) {
                            }
                            trim = stringWriter.toString();
                        }
                    }
                    this.f30491b = trim;
                } else if (newPullParser.getEventType() == 2) {
                    while (i != 0) {
                        int next = newPullParser.next();
                        if (next != 2) {
                            if (next == 3) {
                                i--;
                            }
                        } else {
                            i++;
                        }
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
    }
}
