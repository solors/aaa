package net.pubnative.lite.sdk.views.shape.path.parser;

import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.Stack;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes10.dex */
public class IdHandler {
    private static final String TAG = SvgToPath.TAG;
    private final XmlPullParser atts;
    final HashMap<String, String> idXml = new HashMap<>();
    private final Stack<IdRecording> idRecordingStack = new Stack<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes10.dex */
    public class IdRecording {

        /* renamed from: id */
        final String f102156id;
        int level = 0;

        /* renamed from: sb */
        final StringBuilder f102157sb = new StringBuilder();

        public IdRecording(String str) {
            this.f102156id = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IdHandler(XmlPullParser xmlPullParser) {
        this.atts = xmlPullParser;
    }

    private void appendElementString(StringBuilder sb2, String str, XmlPullParser xmlPullParser) {
        sb2.append("<");
        sb2.append(str);
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            sb2.append(" ");
            sb2.append(xmlPullParser.getAttributeName(i));
            sb2.append("='");
            sb2.append(ParseUtil.escape(xmlPullParser.getAttributeValue(i)));
            sb2.append("'");
        }
        sb2.append(">");
    }

    void endElement() {
        String name = this.atts.getName();
        if (this.idRecordingStack.size() > 0) {
            IdRecording lastElement = this.idRecordingStack.lastElement();
            lastElement.f102157sb.append("</");
            lastElement.f102157sb.append(name);
            lastElement.f102157sb.append(">");
            int i = lastElement.level - 1;
            lastElement.level = i;
            if (i == 0) {
                String sb2 = lastElement.f102157sb.toString();
                this.idXml.put(lastElement.f102156id, sb2);
                this.idRecordingStack.pop();
                if (this.idRecordingStack.size() > 0) {
                    this.idRecordingStack.lastElement().f102157sb.append(sb2);
                }
                Log.w(TAG, sb2);
            }
        }
    }

    public void processIds() throws XmlPullParserException, IOException {
        int eventType = this.atts.getEventType();
        do {
            if (eventType != 0 && eventType != 1) {
                if (eventType == 2) {
                    startElement();
                } else if (eventType == 3) {
                    endElement();
                }
            }
            eventType = this.atts.next();
        } while (eventType != 1);
    }

    void startElement() {
        String name = this.atts.getName();
        String stringAttr = ParseUtil.getStringAttr("id", this.atts);
        if (stringAttr != null) {
            this.idRecordingStack.push(new IdRecording(stringAttr));
        }
        if (this.idRecordingStack.size() > 0) {
            IdRecording lastElement = this.idRecordingStack.lastElement();
            lastElement.level++;
            appendElementString(lastElement.f102157sb, name, this.atts);
        }
    }
}
