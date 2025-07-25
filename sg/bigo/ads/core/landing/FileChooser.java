package sg.bigo.ads.core.landing;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.webkit.ValueCallback;
import androidx.annotation.Keep;
import com.maticoo.sdk.utils.request.network.Headers;
import java.io.Serializable;
import java.util.ArrayList;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.common.utils.C43836q;

/* loaded from: classes10.dex */
public class FileChooser {

    /* renamed from: a */
    final Activity f116097a;

    /* renamed from: b */
    ValueCallback<Uri> f116098b;

    /* renamed from: c */
    ValueCallback<Uri[]> f116099c;

    public FileChooser(Activity activity) {
        this.f116097a = activity;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[], java.io.Serializable] */
    /* renamed from: a */
    public final void m3629a(String... strArr) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        ArrayList arrayList = new ArrayList();
        if (strArr != null) {
            for (String str : strArr) {
                if (!C43836q.m4837a((CharSequence) str)) {
                    arrayList.add(str);
                }
            }
        }
        if (arrayList.isEmpty()) {
            intent.setType(Headers.VALUE_ACCEPT_ALL);
        } else {
            intent.setType((String) arrayList.get(0));
            if (arrayList.size() > 1) {
                intent.putExtra("android.intent.extra.MIME_TYPES", (Serializable) arrayList.toArray());
            }
        }
        this.f116097a.startActivityForResult(Intent.createChooser(intent, "Select File"), 101);
    }

    @Keep
    public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        C43782a.m5010a(0, 3, "FileChooser", "openFileChooser");
        this.f116098b = valueCallback;
        m3629a(str);
    }
}
