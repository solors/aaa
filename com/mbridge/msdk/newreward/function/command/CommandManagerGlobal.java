package com.mbridge.msdk.newreward.function.command;

import com.mbridge.msdk.newreward.p477a.AdapterModel;
import java.util.HashMap;

/* renamed from: com.mbridge.msdk.newreward.function.command.d */
/* loaded from: classes6.dex */
public class CommandManagerGlobal {

    /* renamed from: a */
    private static volatile CommandManagerGlobal f58401a;

    /* renamed from: b */
    private HashMap<String, AdapterModel> f58402b = new HashMap<>();

    /* renamed from: c */
    private CommandManager f58403c;

    private CommandManagerGlobal() {
    }

    /* renamed from: a */
    public static CommandManagerGlobal m50449a() {
        if (f58401a == null) {
            synchronized (CommandManagerGlobal.class) {
                if (f58401a == null) {
                    f58401a = new CommandManagerGlobal();
                }
            }
        }
        return f58401a;
    }

    /* renamed from: b */
    public final CommandManager m50445b() {
        return this.f58403c;
    }

    /* renamed from: b */
    public final void m50444b(String str) {
        this.f58402b.remove(str);
    }

    /* renamed from: a */
    public final void m50447a(CommandManager commandManager) {
        this.f58403c = commandManager;
    }

    /* renamed from: a */
    public final AdapterModel m50446a(String str) {
        return this.f58402b.get(str);
    }

    /* renamed from: a */
    public final void m50448a(AdapterModel adapterModel) {
        if (this.f58402b.get(adapterModel.m50812G()) == null) {
            this.f58402b.put(adapterModel.m50812G(), adapterModel);
        }
    }
}
