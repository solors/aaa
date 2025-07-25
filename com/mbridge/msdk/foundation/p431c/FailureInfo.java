package com.mbridge.msdk.foundation.p431c;

import android.text.TextUtils;
import android.util.SparseArray;
import com.mbridge.msdk.newreward.function.common.MBridgeError;

/* renamed from: com.mbridge.msdk.foundation.c.a */
/* loaded from: classes6.dex */
public final class FailureInfo {

    /* renamed from: a */
    private static final SparseArray<String> f56071a;

    static {
        SparseArray<String> sparseArray = new SparseArray<>();
        f56071a = sparseArray;
        sparseArray.put(880022, "exception when request");
        sparseArray.put(880001, "v3 params invalid");
        sparseArray.put(880002, "v3 request error");
        sparseArray.put(880003, "v3 response error");
        sparseArray.put(880004, "video download error");
        sparseArray.put(880005, "big template download error");
        sparseArray.put(880006, "template download error");
        sparseArray.put(880007, "endcard template download error");
        sparseArray.put(880039, "image download error");
        sparseArray.put(880008, "big template render error");
        sparseArray.put(880009, "template render error");
        sparseArray.put(880010, "load time out error");
        sparseArray.put(880012, "render half img fail");
        sparseArray.put(880013, "write marid fail");
        sparseArray.put(880014, "download js file fail");
        sparseArray.put(880015, "isready false error");
        sparseArray.put(880016, "current unit is loading");
        sparseArray.put(880017, "adn no offer fill");
        sparseArray.put(880018, "local return empty");
        sparseArray.put(880021, "app already install");
        sparseArray.put(880019, "ad over cap");
        sparseArray.put(880020, "load exception");
        sparseArray.put(880023, "v3 time out");
        sparseArray.put(880024, MBridgeError.ERROR_MESSAGE_UN_KNOWN);
        sparseArray.put(880025, "context is null");
        sparseArray.put(880026, "auto refresh fail because unitId status is pause or stop");
        sparseArray.put(880027, "download resource fail");
        sparseArray.put(880000, "has exception happen : ");
        sparseArray.put(880028, "view width or height is 0 or view size is too small");
        sparseArray.put(880029, "AD display requires webView but current environment not included");
        sparseArray.put(880030, "view is null");
        sparseArray.put(880031, "webView was destroyed");
        sparseArray.put(880032, "unitId is null");
        sparseArray.put(880033, "campaign is filtered");
        sparseArray.put(880034, "render dynamic view fail");
        sparseArray.put(880035, "bid token is null");
        sparseArray.put(880036, "view container is null");
        sparseArray.put(880037, "AD parameter setting error");
        sparseArray.put(880038, "cb is open");
        sparseArray.put(880040, "db restore failed");
        sparseArray.put(880041, "network no connection error");
        sparseArray.put(880049, "load second request error");
        sparseArray.put(880042, "Check ad init code because ad init error");
        sparseArray.put(880043, "Ad has error because campaign is null");
        sparseArray.put(880044, "Ad load or show environment error");
        sparseArray.put(880045, "Ad render timeout");
        sparseArray.put(880046, "Ad can not show because view is null");
        sparseArray.put(880047, "Campaign image url is null");
        sparseArray.put(880048, "Ad web resource render fail");
        sparseArray.put(890001, "context or unitid is null");
        sparseArray.put(890002, "load failed");
        sparseArray.put(890003, "show fail : unexpected destroy");
        sparseArray.put(890004, "play error");
        sparseArray.put(890005, "no adapter_model");
        sparseArray.put(890006, "no isReadyCampaign");
        sparseArray.put(890007, "all campaign is loading");
        sparseArray.put(890008, "dynamicBean parse Exception");
        sparseArray.put(890009, "show parse Exception");
        sparseArray.put(890010, "activityPresenter create exception");
        sparseArray.put(890011, "network is exception");
        sparseArray.put(990001, "build Exception");
    }

    /* renamed from: a */
    public static String m52837a(int i) {
        String str = f56071a.get(i);
        return TextUtils.isEmpty(str) ? "" : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0033 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045 A[ORIG_RETURN, RETURN] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m52834b(int r0) {
        /*
            switch(r0) {
                case 880001: goto L45;
                case 880002: goto L43;
                case 880003: goto L41;
                case 880004: goto L3f;
                case 880005: goto L3d;
                case 880006: goto L3b;
                case 880007: goto L39;
                case 880008: goto L36;
                case 880009: goto L33;
                case 880010: goto L30;
                default: goto L3;
            }
        L3:
            switch(r0) {
                case 880012: goto L2d;
                case 880013: goto L2a;
                case 880014: goto L27;
                case 880015: goto L24;
                case 880016: goto L21;
                case 880017: goto L1e;
                case 880018: goto L1b;
                case 880019: goto L18;
                case 880020: goto L15;
                case 880021: goto L12;
                default: goto L6;
            }
        L6:
            switch(r0) {
                case 880023: goto L10;
                case 880035: goto L45;
                case 880038: goto Ld;
                case 880048: goto L33;
                default: goto L9;
            }
        L9:
            r0 = 880024(0xd6d98, float:1.233176E-39)
            goto L46
        Ld:
            r0 = 21
            goto L46
        L10:
            r0 = 2
            goto L46
        L12:
            r0 = 11
            goto L46
        L15:
            r0 = 20
            goto L46
        L18:
            r0 = 19
            goto L46
        L1b:
            r0 = 18
            goto L46
        L1e:
            r0 = 17
            goto L46
        L21:
            r0 = 16
            goto L46
        L24:
            r0 = 15
            goto L46
        L27:
            r0 = 14
            goto L46
        L2a:
            r0 = 13
            goto L46
        L2d:
            r0 = 12
            goto L46
        L30:
            r0 = 10
            goto L46
        L33:
            r0 = 9
            goto L46
        L36:
            r0 = 8
            goto L46
        L39:
            r0 = 7
            goto L46
        L3b:
            r0 = 6
            goto L46
        L3d:
            r0 = 5
            goto L46
        L3f:
            r0 = 4
            goto L46
        L41:
            r0 = 3
            goto L46
        L43:
            r0 = 1
            goto L46
        L45:
            r0 = 0
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p431c.FailureInfo.m52834b(int):int");
    }

    /* renamed from: b */
    public static MBFailureReason m52833b(int i, String str) {
        return new MBFailureReason(i, str);
    }

    /* renamed from: a */
    public static String m52835a(int i, String str) {
        return i + "#" + f56071a.get(i) + "#" + str;
    }

    /* renamed from: a */
    public static MBFailureReason m52836a(int i, int i2, String str) {
        return new MBFailureReason(i, i2, str);
    }
}
