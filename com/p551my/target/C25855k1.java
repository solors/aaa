package com.p551my.target;

import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.my.target.k1 */
/* loaded from: classes7.dex */
public final class C25855k1 extends AbstractC26021q1 {

    /* renamed from: a */
    public volatile String f67085a;

    /* renamed from: b */
    public C25834j1 f67086b;

    /* renamed from: c */
    public Map f67087c;

    /* JADX WARN: Can't wrap try/catch for region: R(34:10|11|(3:12|13|14)|(2:15|16)|17|(13:18|19|20|21|22|23|24|25|26|27|(1:29)(1:119)|30|31)|(32:33|34|35|36|37|(1:39)(1:112)|40|41|42|(5:44|(1:46)(1:109)|47|(2:49|(1:51)(1:107))(1:108)|52)(1:110)|53|(1:106)(1:57)|58|(1:60)(1:105)|61|(1:63)(1:104)|64|(7:66|67|(1:69)(1:78)|70|72|73|(1:75))|80|81|83|84|86|87|89|90|91|(2:94|92)|95|96|97|98)(1:117)|116|41|42|(0)(0)|53|(1:55)|106|58|(0)(0)|61|(0)(0)|64|(0)|80|81|83|84|86|87|89|90|91|(1:92)|95|96|97|98) */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0198 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0 A[Catch: all -> 0x00dc, TRY_ENTER, TryCatch #14 {all -> 0x00dc, blocks: (B:28:0x00c0, B:30:0x00ca), top: B:138:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ca A[Catch: all -> 0x00dc, TRY_LEAVE, TryCatch #14 {all -> 0x00dc, blocks: (B:28:0x00c0, B:30:0x00ca), top: B:138:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0112 A[Catch: all -> 0x02c5, TryCatch #4 {, blocks: (B:4:0x0005, B:6:0x0009, B:9:0x0012, B:20:0x00a1, B:49:0x0108, B:51:0x0112, B:53:0x0121, B:55:0x0128, B:57:0x0132, B:59:0x013b, B:64:0x0160, B:66:0x016c, B:70:0x0173, B:78:0x0193, B:92:0x01d8, B:93:0x0274, B:95:0x027a, B:96:0x02a9, B:19:0x0089), top: B:119:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016c A[Catch: all -> 0x02c5, TryCatch #4 {, blocks: (B:4:0x0005, B:6:0x0009, B:9:0x0012, B:20:0x00a1, B:49:0x0108, B:51:0x0112, B:53:0x0121, B:55:0x0128, B:57:0x0132, B:59:0x013b, B:64:0x0160, B:66:0x016c, B:70:0x0173, B:78:0x0193, B:92:0x01d8, B:93:0x0274, B:95:0x027a, B:96:0x02a9, B:19:0x0089), top: B:119:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x027a A[Catch: all -> 0x02c5, LOOP:0: B:93:0x0274->B:95:0x027a, LOOP_END, TryCatch #4 {, blocks: (B:4:0x0005, B:6:0x0009, B:9:0x0012, B:20:0x00a1, B:49:0x0108, B:51:0x0112, B:53:0x0121, B:55:0x0128, B:57:0x0132, B:59:0x013b, B:64:0x0160, B:66:0x016c, B:70:0x0173, B:78:0x0193, B:92:0x01d8, B:93:0x0274, B:95:0x027a, B:96:0x02a9, B:19:0x0089), top: B:119:0x0005 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized java.util.Map m43665a(com.p551my.target.common.MyTargetConfig r28, android.content.Context r29) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p551my.target.C25855k1.m43665a(com.my.target.common.MyTargetConfig, android.content.Context):java.util.Map");
    }

    /* renamed from: b */
    public final void m43661b(Map map, Context context) {
        List<InputMethodInfo> enabledInputMethodList;
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager == null || (enabledInputMethodList = inputMethodManager.getEnabledInputMethodList()) == null) {
            return;
        }
        HashSet hashSet = null;
        for (InputMethodInfo inputMethodInfo : enabledInputMethodList) {
            List<InputMethodSubtype> enabledInputMethodSubtypeList = inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true);
            if (enabledInputMethodSubtypeList != null) {
                for (InputMethodSubtype inputMethodSubtype : enabledInputMethodSubtypeList) {
                    if ("keyboard".equals(inputMethodSubtype.getMode())) {
                        String locale = inputMethodSubtype.getLocale();
                        if (!TextUtils.isEmpty(locale)) {
                            if (hashSet == null) {
                                hashSet = new HashSet();
                            }
                            hashSet.add(locale.split("_", 2)[0]);
                        }
                    }
                }
            }
        }
        if (hashSet == null || hashSet.isEmpty()) {
            return;
        }
        String join = TextUtils.join(",", hashSet);
        if (TextUtils.isEmpty(join)) {
            return;
        }
        map.put("kb_lang", join);
    }

    /* renamed from: c */
    public final void m43660c(Map map, Context context) {
        String str;
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return;
        }
        if (audioManager.getRingerMode() == 2) {
            str = "1";
        } else {
            str = "0";
        }
        map.put("rs", str);
    }

    /* renamed from: a */
    public final void m43663a(Map map, Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            return;
        }
        long totalSpace = filesDir.getTotalSpace();
        long freeSpace = filesDir.getFreeSpace();
        map.put("mm_tt", String.valueOf(totalSpace));
        map.put("mm_av", String.valueOf(freeSpace));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:21|22|23|24|25|27|28|(2:29|(1:31)(1:32))|33|(5:49|50|51|52|53)|35|36|(2:44|42)|38|39|41|42) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0096, code lost:
        if (r8 == null) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00a2 A[SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m43662b() {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p551my.target.C25855k1.m43662b():boolean");
    }

    /* renamed from: a */
    public C25834j1 m43667a() {
        return this.f67086b;
    }

    /* renamed from: a */
    public String m43666a(Context context) {
        if (AbstractC25671c0.m44128a()) {
            AbstractC25846ja.m43680a("DeviceParamsDataProvider: You must not call getInstanceId method from main thread");
            return "";
        }
        if (this.f67085a == null) {
            synchronized (this) {
                if (this.f67085a == null) {
                    String m44209g = C25634a8.m44224a(context).m44209g();
                    if (TextUtils.isEmpty(m44209g)) {
                        m44209g = UUID.randomUUID().toString();
                        C25634a8.m44224a(context).m44208g(m44209g);
                    }
                    this.f67085a = m44209g;
                }
            }
        }
        String str = this.f67085a;
        return str == null ? "" : str;
    }

    /* renamed from: a */
    public final /* synthetic */ void m43664a(Map map) {
        boolean m43662b = m43662b();
        synchronized (this) {
            map.put("rooted", m43662b ? "1" : "0");
        }
    }
}
