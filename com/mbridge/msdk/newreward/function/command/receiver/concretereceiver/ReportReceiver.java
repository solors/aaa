package com.mbridge.msdk.newreward.function.command.receiver.concretereceiver;

import android.text.TextUtils;
import com.mbridge.apt_anotation.ReceiverAction;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.report.p452d.C22011d;
import com.mbridge.msdk.foundation.same.report.p452d.MetricsData;
import com.mbridge.msdk.foundation.same.report.p452d.p453a.MetricsReportCallBack;
import com.mbridge.msdk.newreward.function.command.C22351b;
import com.mbridge.msdk.newreward.function.command.CommandType;
import com.mbridge.msdk.newreward.function.command.receiver.Receiver;
import com.mbridge.msdk.newreward.function.p492e.MetricsModel;
import com.mbridge.msdk.newreward.p477a.AdapterModel;
import com.mbridge.msdk.newreward.p481b.ControllerModel;
import com.mbridge.msdk.videocommon.p538d.RewardSetting;
import com.mbridge.msdk.videocommon.p538d.RewardUnitSetting;
import java.util.HashMap;
import java.util.Map;

@ReceiverAction(m53541id = "ReportReceiver", type = Receiver.class)
/* loaded from: classes6.dex */
public class ReportReceiver implements Receiver {

    /* renamed from: a */
    private AdapterModel f58502a;

    /* renamed from: b */
    private ControllerModel f58503b;

    /* renamed from: com.mbridge.msdk.newreward.function.command.receiver.concretereceiver.ReportReceiver$1 */
    /* loaded from: classes6.dex */
    static /* synthetic */ class C223621 {

        /* renamed from: a */
        static final /* synthetic */ int[] f58504a;

        static {
            int[] iArr = new int[CommandType.values().length];
            f58504a = iArr;
            try {
                iArr[CommandType.REPORT_LOAD_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public ReportReceiver() {
    }

    @Override // com.mbridge.msdk.newreward.function.command.receiver.Receiver
    /* renamed from: a */
    public final void mo50370a(Object obj) {
        AdapterModel adapterModel;
        Map map;
        String str;
        String str2 = "";
        Map<String, String> map2 = null;
        if (obj instanceof C22351b) {
            C22351b c22351b = (C22351b) obj;
            try {
                if (c22351b.m50476b() instanceof Map) {
                    map = (Map) c22351b.m50476b();
                } else {
                    map = null;
                }
                AdapterModel adapterModel2 = this.f58502a;
                if (adapterModel2 != null && adapterModel2.m50708z() != null) {
                    if (C223621.f58504a[c22351b.m50480a().ordinal()] != 1) {
                        MetricsModel m50708z = this.f58502a.m50708z();
                        AdapterModel adapterModel3 = this.f58502a;
                        if (map == null) {
                            map = new HashMap();
                        }
                        m50708z.m50326a(adapterModel3, map, c22351b.m50480a());
                        return;
                    }
                    this.f58502a.m50708z();
                    AdapterModel adapterModel4 = this.f58502a;
                    if (adapterModel4 != null) {
                        try {
                            if (adapterModel4.m50815D() != null && adapterModel4.m50815D().m50341b() != null) {
                                str2 = adapterModel4.m50815D().m50341b().m50609a() + "";
                            }
                            MetricsData m52039a = C22011d.m52050a().m52039a(adapterModel4.m50812G(), str2);
                            if (m52039a == null) {
                                m52039a = new MetricsData();
                                m52039a.m52085c(adapterModel4.m50812G());
                                m52039a.m52091b(adapterModel4.m50736h());
                                C22011d.m52050a().m52036b().put(adapterModel4.m50812G() + str2, m52039a);
                            }
                            m52039a.m52081d(adapterModel4.m50811H());
                            m52039a.m52077e(adapterModel4.m50809J());
                            if (adapterModel4.m50801R()) {
                                str = "1";
                            } else {
                                str = "0";
                            }
                            m52039a.m52067i(str);
                            RewardSetting m50313a = adapterModel4.m50710x().m50313a();
                            if (m50313a != null) {
                                m52039a.m52069h(m50313a.m48359b());
                                m52039a.m52074f(m50313a.m48356c());
                            }
                            RewardUnitSetting m50306b = adapterModel4.m50710x().m50306b();
                            if (m50306b != null) {
                                m52039a.m52071g(m50306b.m48281l());
                                m52039a.m52057n(m50306b.m48283k());
                            }
                            m52039a.m52097a("2000123");
                            C22011d.m52050a().m52047a(m52039a);
                            C22011d.m52050a().m52041a(m52039a.m52087c(), m52039a, (MetricsReportCallBack) null);
                        } catch (Exception e) {
                            if (MBridgeConstans.DEBUG) {
                                e.printStackTrace();
                            }
                        }
                    }
                } else if (this.f58503b != null) {
                    MetricsModel metricsModel = new MetricsModel();
                    ControllerModel controllerModel = this.f58503b;
                    if (map == null) {
                        map = new HashMap();
                    }
                    metricsModel.m50324a(controllerModel, map, c22351b.m50480a());
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        } else if (obj instanceof Map) {
            try {
                Map map3 = (Map) obj;
                if (map3.get("adapter_model") instanceof AdapterModel) {
                    this.f58502a = (AdapterModel) map3.get("adapter_model");
                }
                if (map3.get("metrics_data") instanceof Map) {
                    map2 = (Map) map3.get("metrics_data");
                }
                if (map3.get("metrics_report_key") instanceof String) {
                    str2 = (String) map3.get("metrics_report_key");
                }
                if (!TextUtils.isEmpty(str2) && (adapterModel = this.f58502a) != null) {
                    adapterModel.m50708z().m50325a(this.f58502a, map2, str2);
                }
            } catch (Exception e3) {
                if (MBridgeConstans.DEBUG) {
                    e3.printStackTrace();
                }
            }
        }
    }

    public ReportReceiver(Object obj) {
        if (obj instanceof AdapterModel) {
            this.f58502a = (AdapterModel) obj;
        }
        if (obj instanceof ControllerModel) {
            this.f58503b = (ControllerModel) obj;
        }
    }
}
