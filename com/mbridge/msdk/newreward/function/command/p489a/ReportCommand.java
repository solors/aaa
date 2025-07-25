package com.mbridge.msdk.newreward.function.command.p489a;

import com.mbridge.msdk.newreward.function.command.AbstractCommand;
import com.mbridge.msdk.newreward.function.command.C22351b;
import com.mbridge.msdk.newreward.function.command.C22352e;
import com.mbridge.msdk.newreward.function.command.receiver.Receiver;
import com.mbridge.msdk.newreward.function.command.receiver.concretereceiver.ReportReceiver;
import com.mbridge.msdk.newreward.p477a.p479b.IReqCallBack;

/* renamed from: com.mbridge.msdk.newreward.function.command.a.b */
/* loaded from: classes6.dex */
public final class ReportCommand extends AbstractCommand {

    /* renamed from: a */
    private Receiver f58392a;

    public ReportCommand(Object obj) {
        this.f58392a = new ReportReceiver(obj);
    }

    @Override // com.mbridge.msdk.newreward.function.command.AbstractCommand
    /* renamed from: a */
    public final void mo50482a(C22351b c22351b, IReqCallBack iReqCallBack) {
    }

    @Override // com.mbridge.msdk.newreward.function.command.AbstractCommand
    /* renamed from: a */
    public final <T extends C22352e> T mo50483a(C22351b c22351b) {
        Receiver receiver;
        if (c22351b != null && (receiver = this.f58392a) != null) {
            receiver.mo50370a(c22351b);
        }
        return null;
    }
}
