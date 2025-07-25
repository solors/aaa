package net.pubnative.lite.sdk.views.shape.path.parser;

import java.io.InputStream;
import net.pubnative.lite.sdk.HyBid;

/* loaded from: classes10.dex */
public class IoUtil {
    public static final void closeQuitely(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Throwable th) {
                HyBid.reportException(th);
            }
        }
    }
}
