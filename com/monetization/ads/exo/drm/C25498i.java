package com.monetization.ads.exo.drm;

import android.media.MediaDrm;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.yandex.mobile.ads.impl.y32;

@RequiresApi(21)
/* renamed from: com.monetization.ads.exo.drm.i */
/* loaded from: classes7.dex */
final class C25498i {
    @DoNotInline
    /* renamed from: a */
    public static boolean m44420a(@Nullable Throwable th) {
        return th instanceof MediaDrm.MediaDrmStateException;
    }

    @DoNotInline
    /* renamed from: b */
    public static int m44419b(Throwable th) {
        int m27075a = y32.m27075a(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo());
        if (m27075a != 2 && m27075a != 4) {
            if (m27075a != 10) {
                if (m27075a != 7) {
                    if (m27075a != 8) {
                        switch (m27075a) {
                            case 15:
                                break;
                            case 16:
                            case 18:
                                break;
                            case 17:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                                break;
                            default:
                                switch (m27075a) {
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                        return 6002;
                                    default:
                                        return 6006;
                                }
                        }
                    }
                    return 6003;
                }
            }
            return 6004;
        }
        return 6005;
    }
}
