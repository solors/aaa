package com.applovin.impl.adview;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.AbstractC5947z3;
import com.applovin.impl.sdk.p134ad.AbstractC5346b;
import com.unity3d.ads.adplayer.AndroidWebViewClient;

/* loaded from: classes2.dex */
public class AppLovinWebViewBase extends WebView {
    public AppLovinWebViewBase(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void applySettings(AbstractC5346b abstractC5346b) {
        Boolean m100818m;
        loadUrl(AndroidWebViewClient.BLANK_PAGE);
        int m95344v0 = abstractC5346b.m95344v0();
        if (m95344v0 >= 0) {
            setLayerType(m95344v0, null);
        }
        if (AbstractC5947z3.m92538d()) {
            getSettings().setMediaPlaybackRequiresUserGesture(abstractC5346b.m95492H());
        }
        if (AbstractC5947z3.m92537e() && abstractC5346b.m95478L0()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        C4044m m95342w0 = abstractC5346b.m95342w0();
        if (m95342w0 != null) {
            WebSettings settings = getSettings();
            WebSettings.PluginState m100829b = m95342w0.m100829b();
            if (m100829b != null) {
                settings.setPluginState(m100829b);
            }
            Boolean m100826e = m95342w0.m100826e();
            if (m100826e != null) {
                settings.setAllowFileAccess(m100826e.booleanValue());
            }
            Boolean m100822i = m95342w0.m100822i();
            if (m100822i != null) {
                settings.setLoadWithOverviewMode(m100822i.booleanValue());
            }
            Boolean m100814q = m95342w0.m100814q();
            if (m100814q != null) {
                settings.setUseWideViewPort(m100814q.booleanValue());
            }
            Boolean m100827d = m95342w0.m100827d();
            if (m100827d != null) {
                settings.setAllowContentAccess(m100827d.booleanValue());
            }
            Boolean m100815p = m95342w0.m100815p();
            if (m100815p != null) {
                settings.setBuiltInZoomControls(m100815p.booleanValue());
            }
            Boolean m100823h = m95342w0.m100823h();
            if (m100823h != null) {
                settings.setDisplayZoomControls(m100823h.booleanValue());
            }
            Boolean m100819l = m95342w0.m100819l();
            if (m100819l != null) {
                settings.setSaveFormData(m100819l.booleanValue());
            }
            Boolean m100828c = m95342w0.m100828c();
            if (m100828c != null) {
                settings.setGeolocationEnabled(m100828c.booleanValue());
            }
            Boolean m100821j = m95342w0.m100821j();
            if (m100821j != null) {
                settings.setNeedInitialFocus(m100821j.booleanValue());
            }
            Boolean m100825f = m95342w0.m100825f();
            if (m100825f != null) {
                settings.setAllowFileAccessFromFileURLs(m100825f.booleanValue());
            }
            Boolean m100824g = m95342w0.m100824g();
            if (m100824g != null) {
                settings.setAllowUniversalAccessFromFileURLs(m100824g.booleanValue());
            }
            Boolean m100816o = m95342w0.m100816o();
            if (m100816o != null) {
                settings.setLoadsImagesAutomatically(m100816o.booleanValue());
            }
            Boolean m100817n = m95342w0.m100817n();
            if (m100817n != null) {
                settings.setBlockNetworkImage(m100817n.booleanValue());
            }
            if (AbstractC5947z3.m92536f()) {
                Integer m100830a = m95342w0.m100830a();
                if (m100830a != null) {
                    settings.setMixedContentMode(m100830a.intValue());
                }
                if (AbstractC5947z3.m92535g()) {
                    Boolean m100820k = m95342w0.m100820k();
                    if (m100820k != null) {
                        settings.setOffscreenPreRaster(m100820k.booleanValue());
                    }
                    if (AbstractC5947z3.m92530l() && (m100818m = m95342w0.m100818m()) != null) {
                        settings.setAlgorithmicDarkeningAllowed(m100818m.booleanValue());
                    }
                }
            }
        }
    }
}
