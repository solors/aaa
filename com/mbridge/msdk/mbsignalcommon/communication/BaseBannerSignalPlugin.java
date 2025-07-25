package com.mbridge.msdk.mbsignalcommon.communication;

import android.content.Context;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;

/* loaded from: classes6.dex */
public abstract class BaseBannerSignalPlugin extends BannerSignalPluginDiff {

    /* renamed from: a */
    public IBannerSignalCommunication f57695a;

    /* renamed from: e */
    private final String f57696e = "BannerSignalPlugin";

    public void click(Object obj, String str) {
        try {
            SameLogTool.m51824b("BannerSignalPlugin", "click");
            IBannerSignalCommunication iBannerSignalCommunication = this.f57695a;
            if (iBannerSignalCommunication != null) {
                iBannerSignalCommunication.mo51121b(obj, str);
            }
        } catch (Throwable th) {
            SameLogTool.m51823b("BannerSignalPlugin", "click", th);
        }
    }

    public void getFileInfo(Object obj, String str) {
        try {
            SameLogTool.m51824b("BannerSignalPlugin", "getFileInfo");
            IBannerSignalCommunication iBannerSignalCommunication = this.f57695a;
            if (iBannerSignalCommunication != null) {
                iBannerSignalCommunication.mo51113j(obj, str);
            }
        } catch (Throwable th) {
            SameLogTool.m51823b("BannerSignalPlugin", "getFileInfo", th);
        }
    }

    public void getNetstat(Object obj, String str) {
        try {
            SameLogTool.m51824b("BannerSignalPlugin", "getNetstat");
            IBannerSignalCommunication iBannerSignalCommunication = this.f57695a;
            if (iBannerSignalCommunication != null) {
                iBannerSignalCommunication.mo51108o(obj, str);
            }
        } catch (Throwable th) {
            SameLogTool.m51823b("BannerSignalPlugin", "getNetstat", th);
        }
    }

    public void handlerH5Exception(Object obj, String str) {
        try {
            SameLogTool.m51824b("BannerSignalPlugin", "handlerH5Exception");
            IBannerSignalCommunication iBannerSignalCommunication = this.f57695a;
            if (iBannerSignalCommunication != null) {
                iBannerSignalCommunication.mo51110m(obj, str);
            }
        } catch (Throwable th) {
            SameLogTool.m51823b("BannerSignalPlugin", "handlerH5Exception", th);
        }
    }

    public void increaseOfferFrequence(Object obj, String str) {
        try {
            SameLogTool.m51824b("BannerSignalPlugin", "increaseOfferFrequence");
            IBannerSignalCommunication iBannerSignalCommunication = this.f57695a;
            if (iBannerSignalCommunication != null) {
                iBannerSignalCommunication.mo51111l(obj, str);
            }
        } catch (Throwable th) {
            SameLogTool.m51823b("BannerSignalPlugin", "increaseOfferFrequence", th);
        }
    }

    public void init(Object obj, String str) {
        try {
            SameLogTool.m51824b("BannerSignalPlugin", "init");
            IBannerSignalCommunication iBannerSignalCommunication = this.f57695a;
            if (iBannerSignalCommunication != null) {
                iBannerSignalCommunication.mo51122a(obj, str);
            }
        } catch (Throwable th) {
            SameLogTool.m51823b("BannerSignalPlugin", "init", th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.WindVanePlugin
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (context instanceof IBannerSignalCommunication) {
                this.f57695a = (IBannerSignalCommunication) context;
            } else if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof IBannerSignalCommunication)) {
                this.f57695a = (IBannerSignalCommunication) windVaneWebView.getObject();
            }
        } catch (Throwable th) {
            SameLogTool.m51823b("BannerSignalPlugin", "initialize", th);
        }
    }

    public void install(Object obj, String str) {
        try {
            SameLogTool.m51824b("BannerSignalPlugin", "install");
            IBannerSignalCommunication iBannerSignalCommunication = this.f57695a;
            if (iBannerSignalCommunication != null) {
                iBannerSignalCommunication.mo51116g(obj, str);
            }
        } catch (Throwable th) {
            SameLogTool.m51823b("BannerSignalPlugin", "install", th);
        }
    }

    public void onSignalCommunication(Object obj, String str) {
        try {
            SameLogTool.m51824b("BannerSignalPlugin", "onSignalCommunication");
            IBannerSignalCommunication iBannerSignalCommunication = this.f57695a;
            if (iBannerSignalCommunication != null) {
                iBannerSignalCommunication.mo51117f(obj, str);
            }
        } catch (Throwable th) {
            SameLogTool.m51823b("BannerSignalPlugin", "onSignalCommunication", th);
        }
    }

    public void openURL(Object obj, String str) {
        try {
            SameLogTool.m51824b("BannerSignalPlugin", "openURL");
            IBannerSignalCommunication iBannerSignalCommunication = this.f57695a;
            if (iBannerSignalCommunication != null) {
                iBannerSignalCommunication.mo51109n(obj, str);
            }
        } catch (Throwable th) {
            SameLogTool.m51823b("BannerSignalPlugin", "openURL", th);
        }
    }

    public void readyStatus(Object obj, String str) {
        try {
            SameLogTool.m51824b("BannerSignalPlugin", "readyStatus");
            IBannerSignalCommunication iBannerSignalCommunication = this.f57695a;
            if (iBannerSignalCommunication != null) {
                iBannerSignalCommunication.mo51120c(obj, str);
            }
        } catch (Throwable th) {
            SameLogTool.m51823b("BannerSignalPlugin", "readyStatus", th);
        }
    }

    public void reportUrls(Object obj, String str) {
        try {
            SameLogTool.m51824b("BannerSignalPlugin", "reportUrls");
            IBannerSignalCommunication iBannerSignalCommunication = this.f57695a;
            if (iBannerSignalCommunication != null) {
                iBannerSignalCommunication.mo51112k(obj, str);
            }
        } catch (Throwable th) {
            SameLogTool.m51823b("BannerSignalPlugin", "reportUrls", th);
        }
    }

    public void resetCountdown(Object obj, String str) {
        try {
            SameLogTool.m51824b("BannerSignalPlugin", "resetCountdown");
            IBannerSignalCommunication iBannerSignalCommunication = this.f57695a;
            if (iBannerSignalCommunication != null) {
                iBannerSignalCommunication.mo51115h(obj, str);
            }
        } catch (Throwable th) {
            SameLogTool.m51823b("BannerSignalPlugin", "resetCountdown", th);
        }
    }

    public void sendImpressions(Object obj, String str) {
        try {
            SameLogTool.m51824b("BannerSignalPlugin", "sendImpressions");
            IBannerSignalCommunication iBannerSignalCommunication = this.f57695a;
            if (iBannerSignalCommunication != null) {
                iBannerSignalCommunication.mo51114i(obj, str);
            }
        } catch (Throwable th) {
            SameLogTool.m51823b("BannerSignalPlugin", "sendImpressions", th);
        }
    }

    public void toggleCloseBtn(Object obj, String str) {
        try {
            SameLogTool.m51824b("BannerSignalPlugin", "toggleCloseBtn");
            IBannerSignalCommunication iBannerSignalCommunication = this.f57695a;
            if (iBannerSignalCommunication != null) {
                iBannerSignalCommunication.mo51119d(obj, str);
            }
        } catch (Throwable th) {
            SameLogTool.m51823b("BannerSignalPlugin", "toggleCloseBtn", th);
        }
    }

    public void triggerCloseBtn(Object obj, String str) {
        try {
            SameLogTool.m51824b("BannerSignalPlugin", "triggerCloseBtn");
            IBannerSignalCommunication iBannerSignalCommunication = this.f57695a;
            if (iBannerSignalCommunication != null) {
                iBannerSignalCommunication.mo51118e(obj, str);
            }
        } catch (Throwable th) {
            SameLogTool.m51823b("BannerSignalPlugin", "triggerCloseBtn", th);
        }
    }
}
