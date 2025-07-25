package com.mbridge.msdk.newreward.function.command;

import com.mbridge.msdk.newreward.function.command.p489a.ReportCommand;
import com.mbridge.msdk.newreward.function.command.p489a.ShowCommand;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import com.mbridge.msdk.newreward.p477a.p479b.IReqCallBack;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.mbridge.msdk.newreward.function.command.c */
/* loaded from: classes6.dex */
public final class CommandManager {

    /* renamed from: a */
    private AbstractCommand f58399a;

    /* renamed from: b */
    private AbstractCommand f58400b;

    /* renamed from: a */
    public final void m50475a(AbstractCommand abstractCommand) {
        this.f58399a = abstractCommand;
    }

    /* renamed from: b */
    public final void m50467b(AbstractCommand abstractCommand) {
        if (this.f58400b == null) {
            this.f58400b = abstractCommand;
        }
    }

    /* renamed from: c */
    public final Object m50461c(Object obj, CommandType commandType) {
        if (this.f58399a == null) {
            return Boolean.FALSE;
        }
        C22351b c22351b = new C22351b();
        c22351b.m50478a(commandType);
        c22351b.m50477a(obj);
        return this.f58399a.mo50483a(c22351b).m50443a();
    }

    /* renamed from: d */
    public final void m50460d(Object obj) throws MBridgeError {
        if (this.f58399a == null) {
            return;
        }
        C22351b c22351b = new C22351b();
        c22351b.m50478a(CommandType.CHECK_CAMPAIGN_EXCLUDE_INS);
        c22351b.m50477a(obj);
        C22352e mo50483a = this.f58399a.mo50483a(c22351b);
        if (!mo50483a.m50440b()) {
            throw ((MBridgeError) mo50483a.m50443a());
        }
    }

    /* renamed from: e */
    public final void m50457e(Object obj) {
        if (this.f58399a == null) {
            return;
        }
        C22351b c22351b = new C22351b();
        c22351b.m50477a(obj);
        c22351b.m50478a(CommandType.HANDLER_ALREADY_INSTALL_CAMPAIGN);
        this.f58399a.mo50483a(c22351b);
    }

    /* renamed from: f */
    public final void m50454f(Object obj) {
        C22351b c22351b = new C22351b();
        c22351b.m50477a(obj);
        c22351b.m50478a(CommandType.START_LOAD_CHECK);
        this.f58399a.mo50483a(c22351b);
    }

    /* renamed from: g */
    public final Object m50452g(Object obj, CommandType commandType) {
        if (this.f58400b == null) {
            return null;
        }
        C22351b c22351b = new C22351b();
        c22351b.m50478a(commandType);
        c22351b.m50477a(obj);
        return this.f58400b.mo50483a(c22351b).m50443a();
    }

    /* renamed from: h */
    public final Object m50451h(Object obj, CommandType commandType) {
        if (this.f58400b == null) {
            return null;
        }
        C22351b c22351b = new C22351b();
        c22351b.m50478a(commandType);
        c22351b.m50477a(obj);
        return this.f58400b.mo50483a(c22351b).m50443a();
    }

    /* renamed from: i */
    public final Object m50450i(Object obj, CommandType commandType) {
        if (this.f58400b == null) {
            this.f58400b = new ShowCommand();
        }
        C22351b c22351b = new C22351b();
        c22351b.m50478a(commandType);
        c22351b.m50477a(obj);
        return this.f58400b.mo50483a(c22351b).m50443a();
    }

    /* renamed from: a */
    public final Map m50468a(Object... objArr) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        if (objArr.length % 2 != 0) {
            return concurrentHashMap;
        }
        for (int i = 0; i < objArr.length; i++) {
            if (i % 2 == 0) {
                Object obj = objArr[i];
                Object obj2 = objArr[i + 1];
                if (obj == null) {
                    obj = "";
                }
                if (obj2 == null) {
                    obj2 = "";
                }
                concurrentHashMap.put(obj, obj2);
            }
        }
        return concurrentHashMap;
    }

    /* renamed from: b */
    public final void m50465b(Object obj, IReqCallBack iReqCallBack) {
        if (this.f58399a == null) {
            return;
        }
        C22351b c22351b = new C22351b();
        c22351b.m50477a(obj);
        c22351b.m50478a(CommandType.SMART_LOAD);
        this.f58399a.mo50482a(c22351b, iReqCallBack);
    }

    /* renamed from: f */
    public final Object m50453f(Object obj, CommandType commandType) {
        if (this.f58400b == null) {
            return null;
        }
        C22351b c22351b = new C22351b();
        c22351b.m50478a(commandType);
        c22351b.m50477a(obj);
        return this.f58400b.mo50483a(c22351b).m50443a();
    }

    /* renamed from: c */
    public final void m50463c(Object obj) throws MBridgeError {
        if (this.f58399a == null) {
            return;
        }
        C22351b c22351b = new C22351b();
        c22351b.m50478a(CommandType.CHECK_CAMPAIGN);
        c22351b.m50477a(obj);
        C22352e mo50483a = this.f58399a.mo50483a(c22351b);
        if (!mo50483a.m50440b()) {
            throw ((MBridgeError) mo50483a.m50443a());
        }
    }

    /* renamed from: e */
    public final Object m50455e(Object obj, CommandType commandType) {
        if (this.f58400b == null) {
            return null;
        }
        C22351b c22351b = new C22351b();
        c22351b.m50478a(commandType);
        c22351b.m50477a(obj);
        return this.f58400b.mo50483a(c22351b).m50443a();
    }

    /* renamed from: b */
    public final Object m50466b(Object obj) {
        if (this.f58399a == null) {
            return null;
        }
        C22351b c22351b = new C22351b();
        c22351b.m50477a(obj);
        c22351b.m50478a(CommandType.CANDIDATE_LOAD_ACTION);
        return this.f58399a.mo50483a(c22351b).m50443a();
    }

    /* renamed from: d */
    public final Object m50458d(Object obj, CommandType commandType) {
        if (this.f58400b == null) {
            return null;
        }
        C22351b c22351b = new C22351b();
        c22351b.m50478a(commandType);
        c22351b.m50477a(obj);
        return this.f58400b.mo50483a(c22351b).m50443a();
    }

    /* renamed from: a */
    public final Object m50472a(Object obj, CommandType commandType) {
        if (this.f58399a == null) {
            return null;
        }
        C22351b c22351b = new C22351b();
        c22351b.m50477a(obj);
        c22351b.m50478a(commandType);
        return this.f58399a.mo50483a(c22351b).m50443a();
    }

    /* renamed from: e */
    public final void m50456e(Object obj, IReqCallBack iReqCallBack) {
        if (this.f58400b == null) {
            return;
        }
        C22351b c22351b = new C22351b();
        c22351b.m50478a((CommandType) ((Map) obj).get("command_type"));
        c22351b.m50477a(obj);
        this.f58400b.mo50482a(c22351b, iReqCallBack);
    }

    /* renamed from: b */
    public final Object m50464b(Object obj, CommandType commandType) {
        if (this.f58399a == null) {
            return Boolean.FALSE;
        }
        C22351b c22351b = new C22351b();
        c22351b.m50478a(commandType);
        c22351b.m50477a(obj);
        return this.f58399a.mo50483a(c22351b).m50443a();
    }

    /* renamed from: c */
    public final void m50462c(Object obj, IReqCallBack iReqCallBack) {
        if (this.f58399a == null) {
            return;
        }
        C22351b c22351b = new C22351b();
        c22351b.m50477a(obj);
        c22351b.m50478a((CommandType) ((Map) obj).get("command_type"));
        this.f58399a.mo50482a(c22351b, iReqCallBack);
    }

    /* renamed from: d */
    public final void m50459d(Object obj, IReqCallBack iReqCallBack) {
        if (this.f58400b == null) {
            return;
        }
        C22351b c22351b = new C22351b();
        c22351b.m50477a(obj);
        c22351b.m50478a((CommandType) ((Map) obj).get("command_type"));
        this.f58400b.mo50482a(c22351b, iReqCallBack);
    }

    /* renamed from: a */
    public final void m50471a(Object obj, CommandType commandType, IReqCallBack iReqCallBack) {
        if (this.f58399a == null) {
            return;
        }
        C22351b c22351b = new C22351b();
        c22351b.m50477a(obj);
        c22351b.m50478a(commandType);
        this.f58399a.mo50482a(c22351b, iReqCallBack);
    }

    /* renamed from: a */
    public final void m50473a(Object obj, IReqCallBack iReqCallBack) {
        if (this.f58399a == null) {
            return;
        }
        C22351b c22351b = new C22351b();
        c22351b.m50477a(obj);
        c22351b.m50478a(CommandType.NORMAL_LOAD);
        this.f58399a.mo50482a(c22351b, iReqCallBack);
    }

    /* renamed from: a */
    public final void m50474a(Object obj) {
        if (this.f58399a == null) {
            return;
        }
        C22351b c22351b = new C22351b();
        c22351b.m50478a(CommandType.SHOW);
        c22351b.m50477a(obj);
        this.f58399a.mo50483a(c22351b);
    }

    /* renamed from: a */
    public final void m50470a(Object obj, CommandType commandType, Object obj2) {
        C22351b c22351b = new C22351b();
        c22351b.m50477a(obj2);
        c22351b.m50478a(commandType);
        new ReportCommand(obj).mo50483a(c22351b);
    }

    /* renamed from: a */
    public final void m50469a(Object obj, String str) {
        if (this.f58400b == null) {
            this.f58400b = new ShowCommand();
        }
        C22351b c22351b = new C22351b();
        c22351b.m50477a(obj);
        this.f58400b.mo50481a(c22351b, str);
    }
}
