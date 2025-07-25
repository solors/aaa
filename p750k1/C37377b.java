package p750k1;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import p734j1.C37248c;

/* renamed from: k1.b */
/* loaded from: classes3.dex */
public class C37377b implements InterfaceC37376a {
    @Override // p750k1.InterfaceC37376a
    @Nullable
    /* renamed from: a */
    public String mo18276a(@Nullable String str, @Nullable Bundle bundle) {
        int i;
        if (!TextUtils.isEmpty(str) && bundle != null && bundle.containsKey("params_error_code") && (i = bundle.getInt("params_error_code", -1)) > -1) {
            C37248c.m18681a("VastAdUrlProcessor", "Before prepare url: %s", str);
            if (str.contains("[ERRORCODE]")) {
                str = str.replace("[ERRORCODE]", String.valueOf(i));
            }
            if (str.contains("%5BERRORCODE%5D")) {
                str = str.replace("%5BERRORCODE%5D", String.valueOf(i));
            }
            C37248c.m18681a("VastAdUrlProcessor", "After prepare url: %s", str);
        }
        return str;
    }
}
