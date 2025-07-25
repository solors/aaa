package com.smaato.sdk.video.vast.utils;

import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import com.smaato.sdk.video.vast.model.StaticResource;
import java.util.Locale;

/* renamed from: com.smaato.sdk.video.vast.utils.a */
/* loaded from: classes7.dex */
final class VastScenarioResourceHtmlHelper {

    /* compiled from: VastScenarioResourceHtmlHelper.java */
    /* renamed from: com.smaato.sdk.video.vast.utils.a$a */
    /* loaded from: classes7.dex */
    static /* synthetic */ class C27985a {

        /* renamed from: a */
        static final /* synthetic */ int[] f72848a;

        static {
            int[] iArr = new int[StaticResource.CreativeType.values().length];
            f72848a = iArr;
            try {
                iArr[StaticResource.CreativeType.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f72848a[StaticResource.CreativeType.JAVASCRIPT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f72848a[StaticResource.CreativeType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: a */
    public static String m38704a(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        return String.format(Locale.US, "<html><head></head><body style=\"margin:0;padding:0;-webkit-tap-highlight-color: rgba(0, 0, 0, 0);\">%1$s</body></html>", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: b */
    public static String m38703b(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        return String.format(Locale.US, "<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border:0px;margin:0;padding:0\" width=\"%1$s\" height=\"%2$s\" src=\"%3$s\"></iframe>", str2, str3, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: c */
    public static String m38702c(@NonNull StaticResource staticResource, @NonNull String str, @NonNull String str2) {
        StaticResource.CreativeType creativeType = staticResource.creativeType;
        if (!URLUtil.isValidUrl(staticResource.uri)) {
            return "";
        }
        int i = C27985a.f72848a[creativeType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return "";
                }
                return String.format(Locale.US, "<html><head></head><body style=\"margin:0;padding:0;-webkit-tap-highlight-color: rgba(0, 0, 0, 0);\">%1$s</body></html>", staticResource.uri);
            }
            return String.format(Locale.US, "<script src=\"%1$s\"></script>", staticResource.uri);
        }
        return String.format(Locale.US, "<html><head></head><body style=\"margin:0;padding:0;-webkit-tap-highlight-color: rgba(0, 0, 0, 0);\"><img src=\"%1$s\" width=\"100%%\" style=\"max-width:100%%;max-height:100%%;\" /></body></html>", staticResource.uri);
    }
}
