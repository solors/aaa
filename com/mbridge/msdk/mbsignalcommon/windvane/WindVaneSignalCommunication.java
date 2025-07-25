package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.mbsignalcommon.p475c.Mapping;
import java.util.regex.Pattern;

/* renamed from: com.mbridge.msdk.mbsignalcommon.windvane.i */
/* loaded from: classes6.dex */
public final class WindVaneSignalCommunication implements Handler.Callback, ISignalCommunication {

    /* renamed from: a */
    protected Pattern f57766a;

    /* renamed from: b */
    protected String f57767b;

    /* renamed from: d */
    protected Context f57769d;

    /* renamed from: e */
    protected WindVaneWebView f57770e;

    /* renamed from: c */
    protected final int f57768c = 1;

    /* renamed from: f */
    protected Handler f57771f = new Handler(Looper.getMainLooper(), this);

    public WindVaneSignalCommunication(Context context) {
        this.f57769d = context;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.ISignalCommunication
    /* renamed from: a */
    public final void mo51057a(WindVaneWebView windVaneWebView) {
        this.f57770e = windVaneWebView;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x006c  */
    @Override // com.mbridge.msdk.mbsignalcommon.windvane.ISignalCommunication
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo51055b(java.lang.String r8) {
        /*
            r7 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 2
            r1 = 0
            r2 = 1
            if (r8 != 0) goto Ld
            goto L68
        Ld:
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r3 = r7.f57770e
            com.mbridge.msdk.mbsignalcommon.windvane.a r3 = com.mbridge.msdk.mbsignalcommon.mraid.MraidUriUtil.m51088a(r3, r8)
            if (r3 == 0) goto L1a
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r8 = r7.f57770e
            r3.f57740b = r8
            goto L69
        L1a:
            java.util.regex.Pattern r3 = r7.f57766a
            java.util.regex.Matcher r8 = r3.matcher(r8)
            boolean r3 = r8.matches()
            if (r3 == 0) goto L68
            com.mbridge.msdk.mbsignalcommon.windvane.a r3 = new com.mbridge.msdk.mbsignalcommon.windvane.a
            r3.<init>()
            int r4 = r8.groupCount()
            r5 = 5
            if (r4 < r5) goto L38
            java.lang.String r5 = r8.group(r5)
            r3.f57744f = r5
        L38:
            r5 = 3
            if (r4 < r5) goto L68
            java.lang.String r4 = r8.group(r2)
            r3.f57742d = r4
            java.lang.String r4 = r8.group(r0)
            r3.f57745g = r4
            java.lang.String r8 = r8.group(r5)
            r3.f57743e = r8
            java.util.HashMap<java.lang.String, java.lang.String> r4 = com.mbridge.msdk.mbsignalcommon.base.WindVaneKeyMap.f57639k
            if (r4 == 0) goto L63
            boolean r8 = r4.containsKey(r8)
            if (r8 == 0) goto L63
            java.util.HashMap<java.lang.String, java.lang.String> r8 = com.mbridge.msdk.mbsignalcommon.base.WindVaneKeyMap.f57639k
            java.lang.String r4 = r3.f57743e
            java.lang.Object r8 = r8.get(r4)
            java.lang.String r8 = (java.lang.String) r8
            r3.f57743e = r8
        L63:
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r8 = r7.f57770e
            r3.f57740b = r8
            goto L69
        L68:
            r3 = r1
        L69:
            if (r3 != 0) goto L6c
            return
        L6c:
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r8 = r3.f57740b
            if (r8 != 0) goto L71
            goto L77
        L71:
            java.lang.String r1 = r3.f57742d
            java.lang.Object r1 = r8.getJsObject(r1)
        L77:
            if (r1 != 0) goto L7a
            goto Lbf
        L7a:
            android.content.Context r8 = r7.f57769d     // Catch: java.lang.Exception -> Lb6 com.mbridge.msdk.mbsignalcommon.p475c.Mapping.AbstractC22204b.C22205a -> Lbb
            java.lang.ClassLoader r8 = r8.getClassLoader()     // Catch: java.lang.Exception -> Lb6 com.mbridge.msdk.mbsignalcommon.p475c.Mapping.AbstractC22204b.C22205a -> Lbb
            java.lang.Class r4 = r1.getClass()     // Catch: java.lang.Exception -> Lb6 com.mbridge.msdk.mbsignalcommon.p475c.Mapping.AbstractC22204b.C22205a -> Lbb
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Exception -> Lb6 com.mbridge.msdk.mbsignalcommon.p475c.Mapping.AbstractC22204b.C22205a -> Lbb
            com.mbridge.msdk.mbsignalcommon.c.a$c r8 = com.mbridge.msdk.mbsignalcommon.p475c.Mapping.m51162a(r8, r4)     // Catch: java.lang.Exception -> Lb6 com.mbridge.msdk.mbsignalcommon.p475c.Mapping.AbstractC22204b.C22205a -> Lbb
            java.lang.String r4 = r3.f57743e     // Catch: java.lang.Exception -> Lb6 com.mbridge.msdk.mbsignalcommon.p475c.Mapping.AbstractC22204b.C22205a -> Lbb
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> Lb6 com.mbridge.msdk.mbsignalcommon.p475c.Mapping.AbstractC22204b.C22205a -> Lbb
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            r6 = 0
            r0[r6] = r5     // Catch: java.lang.Exception -> Lb6 com.mbridge.msdk.mbsignalcommon.p475c.Mapping.AbstractC22204b.C22205a -> Lbb
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r0[r2] = r5     // Catch: java.lang.Exception -> Lb6 com.mbridge.msdk.mbsignalcommon.p475c.Mapping.AbstractC22204b.C22205a -> Lbb
            com.mbridge.msdk.mbsignalcommon.c.a$d r8 = r8.m51157a(r4, r0)     // Catch: java.lang.Exception -> Lb6 com.mbridge.msdk.mbsignalcommon.p475c.Mapping.AbstractC22204b.C22205a -> Lbb
            r8.m51156a()     // Catch: java.lang.Exception -> Lb6 com.mbridge.msdk.mbsignalcommon.p475c.Mapping.AbstractC22204b.C22205a -> Lbb
            boolean r0 = r1 instanceof com.mbridge.msdk.mbsignalcommon.windvane.WindVanePlugin     // Catch: java.lang.Exception -> Lb6 com.mbridge.msdk.mbsignalcommon.p475c.Mapping.AbstractC22204b.C22205a -> Lbb
            if (r0 == 0) goto Lbf
            r3.f57739a = r8     // Catch: java.lang.Exception -> Lb6 com.mbridge.msdk.mbsignalcommon.p475c.Mapping.AbstractC22204b.C22205a -> Lbb
            r3.f57741c = r1     // Catch: java.lang.Exception -> Lb6 com.mbridge.msdk.mbsignalcommon.p475c.Mapping.AbstractC22204b.C22205a -> Lbb
            android.os.Message r8 = android.os.Message.obtain()     // Catch: java.lang.Exception -> Lb6 com.mbridge.msdk.mbsignalcommon.p475c.Mapping.AbstractC22204b.C22205a -> Lbb
            r8.what = r2     // Catch: java.lang.Exception -> Lb6 com.mbridge.msdk.mbsignalcommon.p475c.Mapping.AbstractC22204b.C22205a -> Lbb
            r8.obj = r3     // Catch: java.lang.Exception -> Lb6 com.mbridge.msdk.mbsignalcommon.p475c.Mapping.AbstractC22204b.C22205a -> Lbb
            android.os.Handler r0 = r7.f57771f     // Catch: java.lang.Exception -> Lb6 com.mbridge.msdk.mbsignalcommon.p475c.Mapping.AbstractC22204b.C22205a -> Lbb
            r0.sendMessage(r8)     // Catch: java.lang.Exception -> Lb6 com.mbridge.msdk.mbsignalcommon.p475c.Mapping.AbstractC22204b.C22205a -> Lbb
            goto Lbf
        Lb6:
            r8 = move-exception
            r8.printStackTrace()
            goto Lbf
        Lbb:
            r8 = move-exception
            r8.printStackTrace()
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbsignalcommon.windvane.WindVaneSignalCommunication.mo51055b(java.lang.String):void");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        String str;
        CallMethodContext callMethodContext = (CallMethodContext) message.obj;
        if (callMethodContext == null) {
            return false;
        }
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (message.what != 1) {
            return false;
        }
        Object obj = callMethodContext.f57741c;
        Mapping.C22207d c22207d = callMethodContext.f57739a;
        if (c22207d != null && obj != null) {
            Object[] objArr = new Object[2];
            objArr[0] = callMethodContext;
            if (TextUtils.isEmpty(callMethodContext.f57744f)) {
                str = JsonUtils.EMPTY_JSON;
            } else {
                str = callMethodContext.f57744f;
            }
            objArr[1] = str;
            c22207d.m51155a(obj, objArr);
        }
        return true;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.ISignalCommunication
    /* renamed from: a */
    public final boolean mo51056a(String str) {
        if (WindVaneUtil.m51054a(str)) {
            this.f57766a = WindVaneUtil.m51053b(str);
            this.f57767b = str;
            return true;
        }
        return false;
    }
}
