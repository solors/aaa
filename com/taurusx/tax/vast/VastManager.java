package com.taurusx.tax.vast;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.Display;
import android.view.WindowManager;
import com.taurusx.tax.api.TaurusXAds;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.p578b.p579c.C28210c;
import com.taurusx.tax.p597g.p599b.C28396c;
import com.taurusx.tax.p597g.p599b.C28399f;
import com.taurusx.tax.p597g.p599b.C28412n;
import com.taurusx.tax.p597g.p599b.p600r.AbstractC28420d;
import com.taurusx.tax.p606j.C28466a;
import com.taurusx.tax.p606j.C28530n;
import com.taurusx.tax.p606j.p613b0.C28490a;
import com.taurusx.tax.p606j.p615y.C28550a;
import com.taurusx.tax.vast.VastXmlManagerAggregator;
import com.taurusx.tax.vast.VideoDownloader;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import net.pubnative.lite.sdk.models.Protocol;

/* loaded from: classes7.dex */
public class VastManager implements VastXmlManagerAggregator.InterfaceC28599a {

    /* renamed from: a */
    public boolean f74342a;

    /* renamed from: b */
    public VastManagerListener f74343b;

    /* renamed from: c */
    public VastXmlManagerAggregator f74344c;

    /* renamed from: d */
    public double f74345d;

    /* renamed from: e */
    public int f74346e;

    /* renamed from: f */
    public final boolean f74347f;

    /* renamed from: g */
    public C28210c f74348g;

    /* renamed from: h */
    public int f74349h;

    /* loaded from: classes7.dex */
    public interface VastManagerListener {
        void onVastVideoConfigurationPrepared(VastConfig vastConfig, String str);

        void onVastVideoDownloadStart();
    }

    /* renamed from: com.taurusx.tax.vast.VastManager$a */
    /* loaded from: classes7.dex */
    public class RunnableC28597a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ VastConfig f74350a;

        /* renamed from: b */
        public final /* synthetic */ String f74351b;

        public RunnableC28597a(VastManager vastManager, VastConfig vastConfig, String str) {
            this.f74350a = vastConfig;
            this.f74351b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C28466a m38076a = C28466a.m38076a();
            Context context = TaurusXAds.getContext();
            String networkMediaFileUrl = this.f74350a.getNetworkMediaFileUrl();
            if (m38076a.f73900a == null) {
                m38076a.m38075a(context);
            }
            if (!m38076a.f73900a.m38132b(networkMediaFileUrl)) {
                MediaPlayer mediaPlayer = new MediaPlayer();
                try {
                    mediaPlayer.setDataSource(TaurusXAds.getContext(), Uri.parse(this.f74351b));
                    mediaPlayer.prepare();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.taurusx.tax.vast.VastManager$b */
    /* loaded from: classes7.dex */
    public class C28598b implements VideoDownloader.InterfaceC28600a {

        /* renamed from: a */
        public final /* synthetic */ VastConfig f74352a;

        public C28598b(VastConfig vastConfig) {
            this.f74352a = vastConfig;
        }

        /* renamed from: a */
        public void m37812a(boolean z, String str) {
            if (z && VastManager.this.m37814a(this.f74352a)) {
                VastManager.this.f74343b.onVastVideoConfigurationPrepared(this.f74352a, str);
            } else if (VastManager.this.f74349h > 0) {
                LogUtil.m37900v("taurusx", "Failed to download VAST video.");
                VastManager.this.f74343b.onVastVideoConfigurationPrepared(null, str);
            } else {
                LogUtil.m37900v("taurusx", "retry download");
                VastManager.this.f74349h++;
                String networkMediaFileUrl = this.f74352a.getNetworkMediaFileUrl();
                if (networkMediaFileUrl != null && networkMediaFileUrl.endsWith(".mp")) {
                    networkMediaFileUrl = networkMediaFileUrl + Protocol.VAST_1_0_WRAPPER;
                }
                VideoDownloader.download(networkMediaFileUrl, this);
            }
        }
    }

    public VastManager(Context context, boolean z) {
        m37815a(context);
        this.f74347f = z;
        if (z) {
            C28550a.m37959a(context);
        }
    }

    public static String getVastNetworkMediaUrl(VastConfig vastConfig) {
        if (vastConfig == null) {
            return "";
        }
        return vastConfig.getNetworkMediaFileUrl();
    }

    public void cancel() {
        VastXmlManagerAggregator vastXmlManagerAggregator = this.f74344c;
        if (vastXmlManagerAggregator != null) {
            vastXmlManagerAggregator.cancel(true);
            this.f74344c = null;
        }
    }

    public boolean isStartDownload() {
        return this.f74342a;
    }

    @Override // com.taurusx.tax.vast.VastXmlManagerAggregator.InterfaceC28599a
    public void onAggregationComplete(VastConfig vastConfig) {
        C28210c.C28214b c28214b;
        C28210c.C28214b.C28216b c28216b;
        VastManagerListener vastManagerListener = this.f74343b;
        if (vastManagerListener != null) {
            if (vastConfig == null) {
                vastManagerListener.onVastVideoConfigurationPrepared(null, "vastVideoConfig is null");
                return;
            }
            C28210c c28210c = this.f74348g;
            if (c28210c != null && (c28214b = c28210c.f73228d) != null && (c28216b = c28214b.f73249b) != null && c28216b.f73267o) {
                C28466a m38076a = C28466a.m38076a();
                Context context = TaurusXAds.getContext();
                String networkMediaFileUrl = vastConfig.getNetworkMediaFileUrl();
                if (m38076a.f73900a == null) {
                    m38076a.m38075a(context);
                }
                C28399f c28399f = m38076a.f73900a;
                if (c28399f.m38132b(networkMediaFileUrl)) {
                    C28396c c28396c = c28399f.f73796g;
                    File file = new File(c28396c.f73776a, c28396c.f73777b.m38100a(networkMediaFileUrl));
                    try {
                        AbstractC28420d abstractC28420d = (AbstractC28420d) c28399f.f73796g.f73778c;
                        abstractC28420d.f73845a.submit(new AbstractC28420d.CallableC28421a(file));
                    } catch (IOException e) {
                        C28399f.f73789i.m38148a(6, "Error touching file " + file, e);
                    }
                    networkMediaFileUrl = Uri.fromFile(file).toString();
                } else if (c28399f.m38133b()) {
                    networkMediaFileUrl = String.format(Locale.US, "http://%s:%d/%s", "127.0.0.1", Integer.valueOf(c28399f.f73794e), C28412n.m38114c(networkMediaFileUrl));
                }
                new Thread(new RunnableC28597a(this, vastConfig, networkMediaFileUrl)).start();
                vastConfig.setDiskMediaFileUrl(networkMediaFileUrl);
                this.f74343b.onVastVideoConfigurationPrepared(vastConfig, "");
                return;
            } else if (this.f74347f && !m37814a(vastConfig)) {
                C28598b c28598b = new C28598b(vastConfig);
                String networkMediaFileUrl2 = vastConfig.getNetworkMediaFileUrl();
                if (networkMediaFileUrl2 != null && networkMediaFileUrl2.endsWith(".mp")) {
                    networkMediaFileUrl2 = networkMediaFileUrl2 + Protocol.VAST_1_0_WRAPPER;
                }
                VideoDownloader.download(networkMediaFileUrl2, c28598b);
                return;
            } else {
                this.f74342a = true;
                this.f74343b.onVastVideoDownloadStart();
                this.f74343b.onVastVideoConfigurationPrepared(vastConfig, "");
                return;
            }
        }
        throw new IllegalStateException("mVastManagerListener cannot be null here. Did you call prepareVastVideoConfiguration()?");
    }

    public void prepareVastVideoConfiguration(String str, VastManagerListener vastManagerListener, Context context) {
        C28530n.m37996a(vastManagerListener, "vastManagerListener cannot be null");
        C28530n.m37996a(context, "context cannot be null");
        if (this.f74344c == null) {
            this.f74343b = vastManagerListener;
            VastXmlManagerAggregator vastXmlManagerAggregator = new VastXmlManagerAggregator(this, this.f74345d, this.f74346e, context.getApplicationContext());
            this.f74344c = vastXmlManagerAggregator;
            try {
                C28490a.m38065a(vastXmlManagerAggregator, str);
            } catch (Exception e) {
                LogUtil.m37900v("taurusx", "Failed to aggregate vast xml" + e);
                VastManagerListener vastManagerListener2 = this.f74343b;
                vastManagerListener2.onVastVideoConfigurationPrepared(null, "Failed to aggregate vast xml " + e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[RETURN] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m37814a(com.taurusx.tax.vast.VastConfig r7) {
        /*
            r6 = this;
            java.lang.String r0 = "vastVideoConfig cannot be null"
            com.taurusx.tax.p606j.C28530n.m37996a(r7, r0)
            java.lang.String r0 = r7.getNetworkMediaFileUrl()
            if (r0 == 0) goto L24
            java.lang.String r1 = "mp"
            boolean r1 = r0.endsWith(r1)
            if (r1 == 0) goto L24
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "4"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L24:
            com.taurusx.tax.j.y.c r1 = com.taurusx.tax.p606j.p615y.C28550a.f74002b
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L2b
            goto L37
        L2b:
            java.lang.String r4 = com.taurusx.tax.p606j.C28549x.m37965a(r0)     // Catch: java.lang.Exception -> L37
            com.taurusx.tax.j.y.c$d r1 = r1.m37945b(r4)     // Catch: java.lang.Exception -> L37
            if (r1 == 0) goto L37
            r1 = r2
            goto L38
        L37:
            r1 = r3
        L38:
            if (r1 == 0) goto L78
            com.taurusx.tax.j.y.c r1 = com.taurusx.tax.p606j.p615y.C28550a.f74002b
            if (r1 != 0) goto L40
            r0 = 0
            goto L74
        L40:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.taurusx.tax.j.y.c r4 = com.taurusx.tax.p606j.p615y.C28550a.f74002b
            java.io.File r4 = r4.f74025h
            r1.append(r4)
            java.lang.String r4 = java.io.File.separator
            r1.append(r4)
            java.lang.String r0 = com.taurusx.tax.p606j.C28549x.m37965a(r0)
            r1.append(r0)
            byte[] r0 = new byte[r2]
            r4 = 30
            r0[r3] = r4
            r4 = 2
            byte[] r4 = new byte[r4]
            r4 = {x007a: FILL_ARRAY_DATA  , data: [48, -84} // fill-array
            h2.a r5 = com.taurusx.tax.C28162a.f73047a
            java.lang.String r0 = r5.m23824a(r0, r4)
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
        L74:
            r7.setDiskMediaFileUrl(r0)
            return r2
        L78:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.vast.VastManager.m37814a(com.taurusx.tax.vast.VastConfig):boolean");
    }

    public VastManager(Context context, boolean z, C28210c c28210c) {
        m37815a(context);
        this.f74347f = z;
        this.f74348g = c28210c;
        if (z) {
            C28550a.m37959a(context);
        }
    }

    /* renamed from: a */
    public final void m37815a(Context context) {
        C28530n.m37996a(context, "context cannot be null");
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        float f = context.getResources().getDisplayMetrics().density;
        if (f <= 0.0f) {
            f = 1.0f;
        }
        this.f74345d = width / height;
        this.f74346e = (int) (width / f);
    }
}
