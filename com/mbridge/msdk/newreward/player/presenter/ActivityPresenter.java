package com.mbridge.msdk.newreward.player.presenter;

import android.view.ViewGroup;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.p431c.FailureInfo;
import com.mbridge.msdk.newreward.function.command.AbstractCommand;
import com.mbridge.msdk.newreward.function.command.CommandManager;
import com.mbridge.msdk.newreward.function.command.CommandManagerGlobal;
import com.mbridge.msdk.newreward.function.command.CommandType;
import com.mbridge.msdk.newreward.function.command.p489a.ShowCommand;
import com.mbridge.msdk.newreward.function.command.receiver.ReceiverFactory;
import com.mbridge.msdk.newreward.function.p494g.ReportHandler;
import com.mbridge.msdk.newreward.p477a.AdapterModel;
import com.mbridge.msdk.newreward.player.iview.IMetaData;
import java.lang.reflect.Proxy;

/* loaded from: classes6.dex */
public class ActivityPresenter {
    AdapterModel adapterModel;
    CommandManager commandManager;
    CommandManagerGlobal commandManagerGlobal;
    IMetaData mMetaData;

    public ActivityPresenter(IMetaData iMetaData, String str) {
        String m50767ai;
        try {
            this.commandManagerGlobal = CommandManagerGlobal.m50449a();
            this.commandManager = CommandManagerGlobal.m50449a().m50445b();
            this.adapterModel = this.commandManagerGlobal.m50446a(str);
            IMetaData iMetaData2 = (IMetaData) Proxy.newProxyInstance(iMetaData.getClass().getClassLoader(), iMetaData.getClass().getInterfaces(), new ReportHandler(iMetaData, this.adapterModel, this.commandManager));
            this.mMetaData = iMetaData2;
            iMetaData2.setDate(this.adapterModel);
            this.mMetaData.activityReport("onCreate");
            this.commandManager.m50467b((AbstractCommand) new ShowCommand());
            if (this.adapterModel.m50798U() == null) {
                m50767ai = String.valueOf(this.adapterModel.m50815D().m50341b().m50618C());
            } else {
                m50767ai = this.adapterModel.m50767ai();
            }
            m50767ai = this.adapterModel.m50765ak() ? this.adapterModel.m50764al() : m50767ai;
            setActivityOrientation(iMetaData);
            addTemplate(m50767ai, iMetaData.getRootViewGroup());
        } catch (Exception e) {
            IMetaData iMetaData3 = this.mMetaData;
            if (iMetaData3 != null) {
                iMetaData3.onShowFail(FailureInfo.m52837a(890010), 890010);
            }
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    private void addTemplate(String str, ViewGroup viewGroup) {
        try {
            CommandManager commandManager = this.commandManager;
            commandManager.m50452g(commandManager.m50468a("add_temple", str, "adapter_model", this.adapterModel, "template_type", 17, "parent_temple", viewGroup), CommandType.SHOW_ADD_TEMPLE);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0043 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setActivityOrientation(com.mbridge.msdk.newreward.player.iview.IMetaData r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L5f
            android.app.Activity r6 = (android.app.Activity) r6     // Catch: java.lang.Throwable -> L55
            com.mbridge.msdk.newreward.a.e r0 = r5.adapterModel     // Catch: java.lang.Throwable -> L55
            java.lang.String r0 = r0.m50767ai()     // Catch: java.lang.Throwable -> L55
            int r1 = r0.hashCode()     // Catch: java.lang.Throwable -> L55
            r2 = 50549(0xc575, float:7.0834E-41)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L36
            r2 = 55354(0xd83a, float:7.7567E-41)
            if (r1 == r2) goto L2c
            r2 = 1213120338(0x484ebf52, float:211709.28)
            if (r1 == r2) goto L22
            goto L40
        L22:
            java.lang.String r1 = "5002010"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L40
            r0 = r3
            goto L41
        L2c:
            java.lang.String r1 = "802"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L40
            r0 = r4
            goto L41
        L36:
            java.lang.String r1 = "302"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L40
            r0 = 0
            goto L41
        L40:
            r0 = -1
        L41:
            if (r0 == 0) goto L51
            if (r0 == r4) goto L51
            if (r0 == r3) goto L51
            com.mbridge.msdk.newreward.a.e r0 = r5.adapterModel     // Catch: java.lang.Throwable -> L55
            int r0 = r0.m50763am()     // Catch: java.lang.Throwable -> L55
            r6.setRequestedOrientation(r0)     // Catch: java.lang.Throwable -> L55
            goto L5f
        L51:
            r6.setRequestedOrientation(r4)     // Catch: java.lang.Throwable -> L55
            return
        L55:
            r6 = move-exception
            java.lang.String r0 = "ActivityPresenter"
            java.lang.String r6 = r6.getMessage()
            com.mbridge.msdk.foundation.tools.SameLogTool.m51824b(r0, r6)
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.newreward.player.presenter.ActivityPresenter.setActivityOrientation(com.mbridge.msdk.newreward.player.iview.IMetaData):void");
    }

    public void bindMethodName(String str) {
        try {
            CommandManager commandManager = this.commandManager;
            Object[] objArr = new Object[6];
            boolean z = false;
            objArr[0] = "life_cycle";
            objArr[1] = str;
            objArr[2] = "parent_temple";
            objArr[3] = this.mMetaData.getRootViewGroup();
            objArr[4] = "is_dy";
            AdapterModel adapterModel = this.adapterModel;
            if (adapterModel != null && adapterModel.m50716r()) {
                z = true;
            }
            objArr[5] = Boolean.valueOf(z);
            commandManager.m50451h(commandManager.m50468a(objArr), CommandType.SHOW_LIFE_CYCLE);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        if (str.equals("onDestroy") || str.equals("onCreate")) {
            this.mMetaData.activityReport(str);
        }
        if (str.equals("onDestroy")) {
            try {
                AdapterModel adapterModel2 = this.adapterModel;
                if (adapterModel2 != null) {
                    CommandManagerGlobal commandManagerGlobal = this.commandManagerGlobal;
                    if (commandManagerGlobal != null) {
                        commandManagerGlobal.m50444b(adapterModel2.m50812G());
                    }
                    ReceiverFactory.m50389a().m50386a(this.adapterModel.m50812G());
                    ReceiverFactory.m50389a().m50383d(CommandType.SHOW_OR_PRELOAD_WEB_EC);
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
