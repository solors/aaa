package com.mbridge.msdk.foundation.same.p437b;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mbridge.msdk.foundation.same.b.d */
/* loaded from: classes6.dex */
public final class MBridgeDirContext extends DirectoryContext {
    public MBridgeDirContext(String str) {
        super(str);
    }

    @Override // com.mbridge.msdk.foundation.same.p437b.DirectoryContext
    /* renamed from: a */
    protected final List<Directory> mo52277a() {
        ArrayList<Directory> arrayList = new ArrayList<>();
        m52279a(arrayList, MBridgeDir.MBRIDGE_RES_MANAGER_DIR, "mb/res");
        m52279a(arrayList, MBridgeDir.AD_MOVIES, "mb/res/Movies").m52285a(MBridgeDir.MBRIDGE_VC, "mb/res/.MBridge_VC");
        Directory m52279a = m52279a(arrayList, MBridgeDir.AD_MBRIDGE_700, "mb/res/.mbridge700");
        m52279a.m52285a(MBridgeDir.MBRIDGE_700_IMG, "mb/res/img");
        m52279a.m52285a(MBridgeDir.MBRIDGE_700_IMG_PICASSO, "mb/res/picasso");
        m52279a.m52285a(MBridgeDir.MBRIDGE_700_RES, "mb/res/res");
        m52279a.m52285a(MBridgeDir.MBRIDGE_700_HTML, "mb/res/html");
        m52279a.m52285a(MBridgeDir.MBRIDGE_700_XML, "mb/res/xml");
        m52279a.m52285a(MBridgeDir.MBRIDGE_700_CONFIG, "mb/config");
        MBridgeDir mBridgeDir = MBridgeDir.MBRIDGE_OTHER;
        m52279a(arrayList, mBridgeDir, "mb/other");
        m52279a(arrayList, MBridgeDir.MBRIDGE_CRASH_INFO, "mb/crashinfo");
        m52279a(arrayList, mBridgeDir, "mb/other");
        return arrayList;
    }
}
