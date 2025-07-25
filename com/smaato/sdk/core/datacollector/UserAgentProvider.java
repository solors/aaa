package com.smaato.sdk.core.datacollector;

import android.content.Context;
import android.webkit.WebSettings;
import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p574fi.Supplier;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.smaato.sdk.core.datacollector.q */
/* loaded from: classes7.dex */
public class UserAgentProvider implements Supplier<String> {
    @NonNull

    /* renamed from: a */
    private final Context f71474a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public UserAgentProvider(@NonNull Context context) {
        this.f71474a = (Context) Objects.requireNonNull(context);
    }

    @Override // com.smaato.sdk.core.util.p574fi.Supplier
    @NonNull
    /* renamed from: a */
    public String get() {
        String str = null;
        try {
            str = WebSettings.getDefaultUserAgent(this.f71474a);
            if (str == null) {
                str = System.getProperty("http.agent");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (str == null) {
            return "";
        }
        return str;
    }
}
