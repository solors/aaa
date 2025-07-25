package com.taurusx.tax.vast;

import android.os.AsyncTask;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.p593d.AbstractC28318g;
import com.taurusx.tax.p606j.C28549x;
import com.taurusx.tax.p606j.p613b0.C28490a;
import com.taurusx.tax.p606j.p615y.C28550a;
import com.taurusx.tax.vast.VastManager;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.ArrayDeque;
import java.util.Deque;

/* loaded from: classes7.dex */
public class VideoDownloader {

    /* renamed from: a */
    public static final Deque<WeakReference<VideoDownloaderTask>> f74378a = new ArrayDeque();

    /* loaded from: classes7.dex */
    public static class VideoDownloaderTask extends AsyncTask<String, Void, MessageBean> {

        /* renamed from: a */
        public final InterfaceC28600a f74379a;

        /* renamed from: b */
        public final WeakReference<VideoDownloaderTask> f74380b;

        /* loaded from: classes7.dex */
        public class MessageBean {

            /* renamed from: a */
            public boolean f74381a;

            /* renamed from: b */
            public String f74382b;

            public MessageBean(VideoDownloaderTask videoDownloaderTask, boolean z, String str) {
                this.f74381a = z;
                this.f74382b = str;
            }
        }

        public VideoDownloaderTask(InterfaceC28600a interfaceC28600a) {
            this.f74379a = interfaceC28600a;
            WeakReference<VideoDownloaderTask> weakReference = new WeakReference<>(this);
            this.f74380b = weakReference;
            VideoDownloader.f74378a.add(weakReference);
        }

        @Override // android.os.AsyncTask
        public MessageBean doInBackground(String[] strArr) {
            String str;
            HttpURLConnection httpURLConnection;
            MessageBean messageBean;
            String[] strArr2 = strArr;
            if (strArr2 != null && strArr2.length != 0 && (str = strArr2[0]) != null) {
                BufferedInputStream bufferedInputStream = null;
                try {
                    httpURLConnection = AbstractC28318g.m38239a(str);
                    try {
                        try {
                            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(httpURLConnection.getInputStream());
                            try {
                                int responseCode = httpURLConnection.getResponseCode();
                                if (responseCode >= 200 && responseCode < 300) {
                                    int contentLength = httpURLConnection.getContentLength();
                                    if (contentLength > 26214400) {
                                        LogUtil.m37900v("taurusx", String.format("VideoDownloader encountered video larger than disk cap. (%d bytes / %d maximum).", Integer.valueOf(contentLength), 26214400));
                                        messageBean = new MessageBean(this, false, String.format("VideoDownloader encountered video larger than disk cap. (%d bytes / %d maximum).", Integer.valueOf(contentLength), 26214400));
                                        C28549x.m37968a((Closeable) bufferedInputStream2);
                                        httpURLConnection.disconnect();
                                        return messageBean;
                                    }
                                    boolean m37958a = C28550a.m37958a(str, bufferedInputStream2);
                                    MessageBean messageBean2 = new MessageBean(this, m37958a, "diskPutResult: " + m37958a);
                                    C28549x.m37968a((Closeable) bufferedInputStream2);
                                    httpURLConnection.disconnect();
                                    return messageBean2;
                                }
                                LogUtil.m37900v("taurusx", "VideoDownloader encountered unexpected statusCode: " + responseCode);
                                messageBean = new MessageBean(this, false, "VideoDownloader encountered unexpected statusCode: " + responseCode);
                                C28549x.m37968a((Closeable) bufferedInputStream2);
                                httpURLConnection.disconnect();
                                return messageBean;
                            } catch (Exception e) {
                                e = e;
                                bufferedInputStream = bufferedInputStream2;
                                LogUtil.m37900v("taurusx", "VideoDownloader task threw an internal exception." + e);
                                MessageBean messageBean3 = new MessageBean(this, false, "VideoDownloader task threw an internal exception." + e);
                                C28549x.m37968a((Closeable) bufferedInputStream);
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                    return messageBean3;
                                }
                                return messageBean3;
                            } catch (Throwable th) {
                                th = th;
                                bufferedInputStream = bufferedInputStream2;
                                C28549x.m37968a((Closeable) bufferedInputStream);
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Exception e2) {
                        e = e2;
                    }
                } catch (Exception e3) {
                    e = e3;
                    httpURLConnection = null;
                } catch (Throwable th3) {
                    th = th3;
                    httpURLConnection = null;
                }
            } else {
                return new MessageBean(this, false, "VideoDownloader task tried to execute null or empty url");
            }
        }

        @Override // android.os.AsyncTask
        public void onCancelled() {
            LogUtil.m37900v("taurusx", "VideoDownloader task was cancelled.");
            VideoDownloader.f74378a.remove(this.f74380b);
            ((VastManager.C28598b) this.f74379a).m37812a(false, "VideoDownloader task was cancelled");
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(MessageBean messageBean) {
            MessageBean messageBean2 = messageBean;
            if (isCancelled()) {
                onCancelled();
                return;
            }
            VideoDownloader.f74378a.remove(this.f74380b);
            if (messageBean2 == null) {
                ((VastManager.C28598b) this.f74379a).m37812a(false, "downLoadBean is null");
                return;
            }
            ((VastManager.C28598b) this.f74379a).m37812a(messageBean2.f74381a, messageBean2.f74382b);
        }
    }

    /* renamed from: com.taurusx.tax.vast.VideoDownloader$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC28600a {
    }

    public static void download(String str, InterfaceC28600a interfaceC28600a) {
        if (interfaceC28600a != null) {
            VastManager.C28598b c28598b = (VastManager.C28598b) interfaceC28600a;
            VastManager.this.f74342a = true;
            VastManager.this.f74343b.onVastVideoDownloadStart();
            if (str == null) {
                LogUtil.m37900v("taurusx", "VideoDownloader attempted to cache video with null url.");
                c28598b.m37812a(false, "VideoDownloader attempted to cache video with null url");
                return;
            }
            try {
                C28490a.m38065a(new VideoDownloaderTask(interfaceC28600a), str);
            } catch (Exception e) {
                c28598b.m37812a(false, "Exception: " + e);
            }
        }
    }
}
