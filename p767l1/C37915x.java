package p767l1;

import android.text.TextUtils;
import android.util.Xml;
import androidx.annotation.Nullable;
import com.smaato.sdk.video.vast.model.VastTree;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.xmlpull.v1.XmlPullParser;
import p734j1.C37248c;

/* renamed from: l1.x */
/* loaded from: classes3.dex */
public class C37915x {
    /* renamed from: a */
    public static C37910s m15724a(InputStream inputStream) {
        if (inputStream != null) {
            XmlPullParser newPullParser = Xml.newPullParser();
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            newPullParser.setInput(inputStream, null);
            int next = newPullParser.next();
            if (next != 1) {
                while (next != 3 && next != 1) {
                    if (newPullParser.getEventType() == 2 && C37911t.m15738x(newPullParser.getName(), VastTree.VAST)) {
                        return new C37910s(newPullParser);
                    }
                    next = newPullParser.next();
                }
                return null;
            }
            throw new Exception();
        }
        throw new Exception();
    }

    /* renamed from: b */
    public static C37910s m15723b(@Nullable String str) {
        ByteArrayInputStream byteArrayInputStream;
        if (!TextUtils.isEmpty(str)) {
            ByteArrayInputStream byteArrayInputStream2 = null;
            try {
                try {
                    byteArrayInputStream = new ByteArrayInputStream(str.getBytes(Charset.defaultCharset().name()));
                    try {
                        C37910s m15724a = m15724a(byteArrayInputStream);
                        try {
                            byteArrayInputStream.close();
                        } catch (Exception e) {
                            C37248c.m18680b("VastXmlParser", e);
                        }
                        return m15724a;
                    } catch (Exception e2) {
                        e = e2;
                        byteArrayInputStream2 = byteArrayInputStream;
                        C37248c.m18680b("VastXmlParser", e);
                        throw new Exception();
                    } catch (Throwable th) {
                        th = th;
                        if (byteArrayInputStream != null) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Exception e3) {
                                C37248c.m18680b("VastXmlParser", e3);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayInputStream = byteArrayInputStream2;
                }
            } catch (Exception e4) {
                e = e4;
            }
        } else {
            throw new Exception();
        }
    }
}
