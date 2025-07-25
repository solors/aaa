package com.bytedance.sdk.component.adexpress.eqN;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: com.bytedance.sdk.component.adexpress.eqN.eo */
/* loaded from: classes3.dex */
public class C7493eo {

    /* renamed from: com.bytedance.sdk.component.adexpress.eqN.eo$bg */
    /* loaded from: classes3.dex */
    public enum EnumC7494bg {
        HTML("text/html"),
        CSS("text/css"),
        JS("application/x-javascript"),
        IMAGE("image/*");
        

        /* renamed from: zx */
        private String f16275zx;

        EnumC7494bg(String str) {
            this.f16275zx = str;
        }

        /* renamed from: bg */
        public String m88667bg() {
            return this.f16275zx;
        }
    }

    /* renamed from: IL */
    public static boolean m88669IL(String str) {
        Uri parse;
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null) {
            return false;
        }
        String path = parse.getPath();
        if (TextUtils.isEmpty(path)) {
            return false;
        }
        return path.endsWith(".gif");
    }

    /* renamed from: bg */
    public static EnumC7494bg m88668bg(String str) {
        EnumC7494bg enumC7494bg = EnumC7494bg.IMAGE;
        if (!TextUtils.isEmpty(str)) {
            try {
                String path = Uri.parse(str).getPath();
                if (path != null) {
                    if (path.endsWith(".css")) {
                        enumC7494bg = EnumC7494bg.CSS;
                    } else if (path.endsWith(".js")) {
                        enumC7494bg = EnumC7494bg.JS;
                    } else if (!path.endsWith(".jpg") && !path.endsWith(".gif") && !path.endsWith(".png") && !path.endsWith(".jpeg") && !path.endsWith(".webp") && !path.endsWith(".bmp") && !path.endsWith(".ico") && path.endsWith(".html")) {
                        enumC7494bg = EnumC7494bg.HTML;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return enumC7494bg;
    }
}
