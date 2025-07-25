package com.mbridge.msdk.foundation.same.p437b;

import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.foundation.tools.SameSDCardTool;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.mbridge.msdk.foundation.same.b.e */
/* loaded from: classes6.dex */
public final class MBridgeDirManager {

    /* renamed from: a */
    private static volatile MBridgeDirManager f56520a;

    /* renamed from: b */
    private final DirectoryContext f56521b;

    /* renamed from: c */
    private final ArrayList<C21966a> f56522c = new ArrayList<>();

    /* compiled from: MBridgeDirManager.java */
    /* renamed from: com.mbridge.msdk.foundation.same.b.e$a */
    /* loaded from: classes6.dex */
    public static final class C21966a {

        /* renamed from: a */
        public File f56523a;

        /* renamed from: b */
        public MBridgeDir f56524b;

        public C21966a(MBridgeDir mBridgeDir, File file) {
            this.f56524b = mBridgeDir;
            this.f56523a = file;
        }
    }

    private MBridgeDirManager(DirectoryContext directoryContext) {
        this.f56521b = directoryContext;
    }

    /* renamed from: a */
    public static String m52273a(MBridgeDir mBridgeDir) {
        File m52271b = m52271b(mBridgeDir);
        if (m52271b != null) {
            return m52271b.getAbsolutePath();
        }
        return null;
    }

    /* renamed from: b */
    public static File m52271b(MBridgeDir mBridgeDir) {
        try {
            if (m52276a() == null || m52276a().f56522c == null || m52276a().f56522c.isEmpty()) {
                return null;
            }
            Iterator<C21966a> it = m52276a().f56522c.iterator();
            while (it.hasNext()) {
                C21966a next = it.next();
                if (next.f56524b.equals(mBridgeDir)) {
                    return next.f56523a;
                }
            }
            return null;
        } catch (Throwable th) {
            SameLogTool.m51823b("MBridgeDirManager", th.getMessage(), th);
            return null;
        }
    }

    /* renamed from: a */
    public static synchronized MBridgeDirManager m52276a() {
        MBridgeDirManager mBridgeDirManager;
        synchronized (MBridgeDirManager.class) {
            if (f56520a == null && MBSDKContext.m52746m().m52792c() != null) {
                SameSDCardTool.m51799a(MBSDKContext.m52746m().m52792c());
            }
            mBridgeDirManager = f56520a;
        }
        return mBridgeDirManager;
    }

    /* renamed from: a */
    public static synchronized void m52274a(DirectoryContext directoryContext) {
        synchronized (MBridgeDirManager.class) {
            if (f56520a == null) {
                f56520a = new MBridgeDirManager(directoryContext);
            }
        }
    }

    /* renamed from: b */
    public final boolean m52272b() {
        return m52275a(this.f56521b.m52278b());
    }

    /* renamed from: a */
    private boolean m52275a(Directory directory) {
        File m52271b;
        String str;
        Directory m52281c = directory.m52281c();
        if (m52281c == null) {
            str = directory.m52282b();
        } else {
            if (m52271b(m52281c.m52280d()) == null) {
                return false;
            }
            str = m52271b.getAbsolutePath() + File.separator + directory.m52282b();
        }
        File file = new File(str);
        if (!file.exists() ? file.mkdirs() : true) {
            this.f56522c.add(new C21966a(directory.m52280d(), file));
            List<Directory> m52288a = directory.m52288a();
            if (m52288a != null) {
                for (Directory directory2 : m52288a) {
                    if (!m52275a(directory2)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
}
