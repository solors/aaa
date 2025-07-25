package com.bytedance.sdk.openadsdk.core.p316PX.p318bX;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.media3.common.MimeTypes;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;
import com.bytedance.sdk.openadsdk.utils.ZQc;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.sdk.openadsdk.core.PX.bX.bg */
/* loaded from: classes3.dex */
public class C8637bg {

    /* renamed from: bg */
    public static final Set<String> f19055bg = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.PX.bX.bg.1
        {
            add("image/jpeg");
            add("image/png");
            add(MimeTypes.IMAGE_BMP);
            add("image/gif");
            add("image/jpg");
        }
    };

    /* renamed from: IL */
    public static Set<String> f19054IL = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.PX.bX.bg.2
        {
            add("application/x-javascript");
        }
    };

    /* renamed from: com.bytedance.sdk.openadsdk.core.PX.bX.bg$IL */
    /* loaded from: classes3.dex */
    public enum EnumC8640IL {
        HTML_RESOURCE,
        STATIC_RESOURCE,
        IFRAME_RESOURCE
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.PX.bX.bg$bg */
    /* loaded from: classes3.dex */
    public enum EnumC8641bg {
        NONE,
        IMAGE,
        JAVASCRIPT
    }

    @NonNull
    /* renamed from: bg */
    public static Point m85479bg(Context context, int i, int i2, EnumC8640IL enumC8640IL) {
        if (context == null) {
            context = C8838VzQ.m84740bg();
        }
        Point point = new Point(i, i2);
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        int m82537bX = ZQc.m82537bX(context, i);
        int m82537bX2 = ZQc.m82537bX(context, i2);
        if (m82537bX <= width && m82537bX2 <= height) {
            return point;
        }
        Point point2 = new Point();
        if (EnumC8640IL.HTML_RESOURCE == enumC8640IL) {
            point2.x = Math.min(width, m82537bX);
            point2.y = Math.min(height, m82537bX2);
        } else {
            float f = m82537bX;
            float f2 = f / width;
            float f3 = m82537bX2;
            float f4 = f3 / height;
            if (f2 >= f4) {
                point2.x = width;
                point2.y = (int) (f3 / f2);
            } else {
                point2.x = (int) (f / f4);
                point2.y = height;
            }
        }
        int i3 = point2.x;
        if (i3 >= 0 && point2.y >= 0) {
            point2.x = ZQc.eqN(context, i3);
            point2.y = ZQc.eqN(context, point2.y);
            return point2;
        }
        return point;
    }
}
