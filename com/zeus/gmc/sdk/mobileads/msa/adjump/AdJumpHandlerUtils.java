package com.zeus.gmc.sdk.mobileads.msa.adjump;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import com.zeus.gmc.sdk.mobileads.msa.adjump.common.AdInfoBean;
import com.zeus.gmc.sdk.mobileads.msa.adjump.common.MLog;
import com.zeus.gmc.sdk.mobileads.msa.adjump.common.SDKConfig;
import com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jjuuju.C32779jujujpjjp;
import com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jjuuju.C32780puujujuupp;
import com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jjuuju.C32781uppjpjj;
import com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jujujpjjp.C32786jujujpjjp;
import com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jujujpjjp.C32787puujujuupp;
import com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jujujpjjp.jjppjjupu;
import com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jujujpjjp.upupjjppj;
import com.zeus.gmc.sdk.mobileads.msa.adjump.internal.puujujuupp.C32790jujujpjjp;
import com.zeus.gmc.sdk.mobileads.msa.adjump.internal.uppjpjj.C32793jujujpjjp;
import com.zeus.gmc.sdk.mobileads.msa.adjump.internal.uppjpjj.C32794puujujuupp;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class AdJumpHandlerUtils {
    public static final int JUMP_302_MODE_DEFAULT = 0;
    public static final int JUMP_302_MODE_HTTPURLCONNECTION = 4;
    public static final int JUMP_302_MODE_OKHTTP = 1;
    public static final int JUMP_302_MODE_PARALLEL_HTTPURLCONNECTION = 5;
    public static final int JUMP_302_MODE_PARALLEL_WEBVIEW = 3;
    public static final int JUMP_302_MODE_WEBVIEW = 2;
    public static final int JUMP_GMC_MARKET = 8;
    public static final int JUMP_GP = 9;
    public static final int JUMP_H5 = 1;
    public static final int JUMP_HYBRID = 10;
    public static final String MARKET_PACKAGE_NAME_GMC_GLOBAL = "com.xiaomi.mipicks";
    public static final String MARKET_PACKAGE_NAME_GP = "com.android.vending";
    public static final String MARKET_PACKAGE_NAME_HYBRID = "com.miui.hybrid";
    public static boolean USE_STAGING = false;
    private static final int jpjjjjp = 1;
    private static final String jujujpjjp = "AdJumpHandlerUtils";
    private static final String puujujuupp = "com.mi.globalbrowser";
    private static final String uppjpjj = "AdJump";
    private static final String jjuuju = "com.android.browser";
    private static final String[] jupppjuju = {"com.mi.globalbrowser", jjuuju};

    /* renamed from: com.zeus.gmc.sdk.mobileads.msa.adjump.AdJumpHandlerUtils$jjuuju */
    /* loaded from: classes8.dex */
    public class C32758jjuuju extends com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jujujpjjp.jupppjuju {
        public final /* synthetic */ C32794puujujuupp jpjjjjp;
        public final /* synthetic */ Context jupppjuju;
        public final /* synthetic */ AdInfoBean puujujuupp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32758jjuuju(String str, String str2, AdInfoBean adInfoBean, Context context, C32794puujujuupp c32794puujujuupp) {
            super(str, str2);
            this.puujujuupp = adInfoBean;
            this.jupppjuju = context;
            this.jpjjjjp = c32794puujujuupp;
        }

        @Override // com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jujujpjjp.jupppjuju
        public void jujujpjjp() {
            C32786jujujpjjp c32786jujujpjjp = new C32786jujujpjjp(this.puujujuupp);
            c32786jujujpjjp.jjuuju(5);
            String jujujpjjp = com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jujujpjjp.jpjjjjp.jujujpjjp(this.jupppjuju, c32786jujujpjjp, this.jpjjjjp);
            MLog.m25881d(AdJumpHandlerUtils.jujujpjjp, "attributeUrl: " + jujujpjjp);
        }
    }

    /* loaded from: classes8.dex */
    public class jpjjjjp extends com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jujujpjjp.jupppjuju {
        public final /* synthetic */ C32794puujujuupp jpjjjjp;
        public final /* synthetic */ AdInfoBean jupppjuju;
        public final /* synthetic */ Context puujujuupp;
        public final /* synthetic */ long ujjuupp;

        /* renamed from: com.zeus.gmc.sdk.mobileads.msa.adjump.AdJumpHandlerUtils$jpjjjjp$jujujpjjp */
        /* loaded from: classes8.dex */
        public class C32759jujujpjjp implements jjppjjupu.InterfaceC32784uppjpjj {
            public C32759jujujpjjp() {
            }

            @Override // com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jujujpjjp.jjppjjupu.InterfaceC32784uppjpjj
            public void jujujpjjp(String str) {
                jpjjjjp jpjjjjpVar = jpjjjjp.this;
                String jujujpjjp = C32790jujujpjjp.jujujpjjp(jpjjjjpVar.puujujuupp, str, jpjjjjpVar.jpjjjjp, jpjjjjpVar.jupppjuju);
                if (TextUtils.isEmpty(jujujpjjp)) {
                    jpjjjjp jpjjjjpVar2 = jpjjjjp.this;
                    AdJumpHandlerUtils.doTrack(jpjjjjpVar2.puujujuupp, C32781uppjpjj.jpjjjjp, jpjjjjpVar2.jupppjuju, System.currentTimeMillis() - jpjjjjp.this.ujjuupp, 2, null);
                    return;
                }
                jpjjjjp jpjjjjpVar3 = jpjjjjp.this;
                AdJumpHandlerUtils.doTrack(jpjjjjpVar3.puujujuupp, C32781uppjpjj.ujjuupp, jpjjjjpVar3.jupppjuju, System.currentTimeMillis() - jpjjjjp.this.ujjuupp, -1, jujujpjjp);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public jpjjjjp(String str, String str2, Context context, AdInfoBean adInfoBean, C32794puujujuupp c32794puujujuupp, long j) {
            super(str, str2);
            this.puujujuupp = context;
            this.jupppjuju = adInfoBean;
            this.jpjjjjp = c32794puujujuupp;
            this.ujjuupp = j;
        }

        @Override // com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jujujpjjp.jupppjuju
        public void jujujpjjp() throws Exception {
            new jjppjjupu(this.puujujuupp, this.jupppjuju, this.jpjjjjp, new C32759jujujpjjp()).jjuuju(this.jupppjuju.getLandingPageUrl());
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.msa.adjump.AdJumpHandlerUtils$jujujpjjp */
    /* loaded from: classes8.dex */
    public class C32760jujujpjjp extends com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jujujpjjp.jupppjuju {
        public final /* synthetic */ String jjppjjupu;
        public final /* synthetic */ long jpjjjjp;
        public final /* synthetic */ String jupppjuju;
        public final /* synthetic */ Context puujujuupp;
        public final /* synthetic */ int ujjuupp;
        public final /* synthetic */ AdInfoBean uppj;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32760jujujpjjp(String str, String str2, Context context, String str3, long j, int i, String str4, AdInfoBean adInfoBean) {
            super(str, str2);
            this.puujujuupp = context;
            this.jupppjuju = str3;
            this.jpjjjjp = j;
            this.ujjuupp = i;
            this.jjppjjupu = str4;
            this.uppj = adInfoBean;
        }

        @Override // com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jujujpjjp.jupppjuju
        public void jujujpjjp() throws Exception {
            String str;
            if (this.puujujuupp == null) {
                MLog.m25879e(AdJumpHandlerUtils.jujujpjjp, "Context is null!");
                return;
            }
            C32779jujujpjjp c32779jujujpjjp = new C32779jujujpjjp();
            c32779jujujpjjp.jjuuju = this.jupppjuju;
            c32779jujujpjjp.uujpuuupj = this.jpjjjjp;
            c32779jujujpjjp.puuuuj = this.ujjuupp;
            c32779jujujpjjp.ujjuupp = this.jjppjjupu;
            AdInfoBean adInfoBean = this.uppj;
            if (adInfoBean != null) {
                c32779jujujpjjp.jjppjjupu = adInfoBean.getTagID();
                c32779jujujpjjp.pppjujup = this.uppj.getCreativeType();
                c32779jujujpjjp.upupjjppj = this.uppj.getCosdkVersion();
                c32779jujujpjjp.jupppjuju = this.uppj.getEx();
                c32779jujujpjjp.ujpupujju = this.uppj.getCustomMap();
            }
            if (AdJumpHandlerUtils.USE_STAGING) {
                str = "systemadsolution_globalnativestaging";
            } else {
                str = "systemadsolution_globalnative";
            }
            c32779jujujpjjp.jpjjjjp = str;
            C32780puujujuupp.jujujpjjp(this.puujujuupp, c32779jujujpjjp);
        }
    }

    /* loaded from: classes8.dex */
    public class jupppjuju extends com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jujujpjjp.jupppjuju {
        public final /* synthetic */ C32794puujujuupp jpjjjjp;
        public final /* synthetic */ AdInfoBean jupppjuju;
        public final /* synthetic */ Context puujujuupp;

        /* renamed from: com.zeus.gmc.sdk.mobileads.msa.adjump.AdJumpHandlerUtils$jupppjuju$jujujpjjp */
        /* loaded from: classes8.dex */
        public class C32761jujujpjjp implements jjppjjupu.InterfaceC32784uppjpjj {
            public C32761jujujpjjp() {
            }

            @Override // com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jujujpjjp.jjppjjupu.InterfaceC32784uppjpjj
            public void jujujpjjp(String str) {
                MLog.m25877i(AdJumpHandlerUtils.jujujpjjp, "jumpParallel with WebView finish with final url : " + str);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public jupppjuju(String str, String str2, Context context, AdInfoBean adInfoBean, C32794puujujuupp c32794puujujuupp) {
            super(str, str2);
            this.puujujuupp = context;
            this.jupppjuju = adInfoBean;
            this.jpjjjjp = c32794puujujuupp;
        }

        @Override // com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jujujpjjp.jupppjuju
        public void jujujpjjp() throws Exception {
            new jjppjjupu(this.puujujuupp, this.jupppjuju, this.jpjjjjp, new C32761jujujpjjp()).jjuuju(this.jpjjjjp.jjuuju());
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.msa.adjump.AdJumpHandlerUtils$puujujuupp */
    /* loaded from: classes8.dex */
    public class C32762puujujuupp extends com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jujujpjjp.jupppjuju {
        public final /* synthetic */ C32794puujujuupp jpjjjjp;
        public final /* synthetic */ AdInfoBean jupppjuju;
        public final /* synthetic */ Context puujujuupp;
        public final /* synthetic */ jjppjjupu.InterfaceC32782jjuuju ujjuupp;

        /* renamed from: com.zeus.gmc.sdk.mobileads.msa.adjump.AdJumpHandlerUtils$puujujuupp$jujujpjjp */
        /* loaded from: classes8.dex */
        public class C32763jujujpjjp implements jjppjjupu.InterfaceC32784uppjpjj {
            public C32763jujujpjjp() {
            }

            @Override // com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jujujpjjp.jjppjjupu.InterfaceC32784uppjpjj
            public void jujujpjjp(String str) {
                MLog.m25877i(AdJumpHandlerUtils.jujujpjjp, "HandlerTestUrlAction final url : " + str);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32762puujujuupp(String str, String str2, Context context, AdInfoBean adInfoBean, C32794puujujuupp c32794puujujuupp, jjppjjupu.InterfaceC32782jjuuju interfaceC32782jjuuju) {
            super(str, str2);
            this.puujujuupp = context;
            this.jupppjuju = adInfoBean;
            this.jpjjjjp = c32794puujujuupp;
            this.ujjuupp = interfaceC32782jjuuju;
        }

        @Override // com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jujujpjjp.jupppjuju
        public void jujujpjjp() throws Exception {
            jjppjjupu jjppjjupuVar = new jjppjjupu(this.puujujuupp, this.jupppjuju, this.jpjjjjp, new C32763jujujpjjp());
            jjppjjupuVar.jujujpjjp(this.ujjuupp);
            jjppjjupuVar.jjuuju(this.jupppjuju.getLandingPageUrl());
        }
    }

    /* loaded from: classes8.dex */
    public class ujjuupp extends com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jujujpjjp.jupppjuju {
        public final /* synthetic */ C32794puujujuupp jpjjjjp;
        public final /* synthetic */ AdInfoBean jupppjuju;
        public final /* synthetic */ Context puujujuupp;
        public final /* synthetic */ long ujjuupp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ujjuupp(String str, String str2, Context context, AdInfoBean adInfoBean, C32794puujujuupp c32794puujujuupp, long j) {
            super(str, str2);
            this.puujujuupp = context;
            this.jupppjuju = adInfoBean;
            this.jpjjjjp = c32794puujujuupp;
            this.ujjuupp = j;
        }

        @Override // com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jujujpjjp.jupppjuju
        public void jujujpjjp() {
            String uppjpjj = com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jujujpjjp.jpjjjjp.uppjpjj(this.puujujuupp, new C32786jujujpjjp(this.jupppjuju), this.jpjjjjp);
            MLog.m25881d(AdJumpHandlerUtils.jujujpjjp, "finalUrl: " + uppjpjj);
            if (!TextUtils.isEmpty(uppjpjj) && uppjpjj.startsWith("Error:")) {
                AdJumpHandlerUtils.doTrack(this.puujujuupp, C32781uppjpjj.ujjuupp, this.jupppjuju, -1L, -1, uppjpjj);
            } else if (TextUtils.isEmpty(uppjpjj)) {
                AdJumpHandlerUtils.doTrack(this.puujujuupp, C32781uppjpjj.ujjuupp, this.jupppjuju, -1L, -1, "finalUrl is null");
            } else {
                String handleWithCallee = AdJumpHandlerUtils.handleWithCallee(this.puujujuupp, uppjpjj, this.jpjjjjp.uppjpjj());
                if (handleWithCallee == null) {
                    AdJumpHandlerUtils.doTrack(this.puujujuupp, C32781uppjpjj.jpjjjjp, this.jupppjuju, System.currentTimeMillis() - this.ujjuupp, 2, null);
                } else {
                    AdJumpHandlerUtils.doTrack(this.puujujuupp, C32781uppjpjj.ujjuupp, this.jupppjuju, System.currentTimeMillis() - this.ujjuupp, -1, handleWithCallee);
                }
            }
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.msa.adjump.AdJumpHandlerUtils$uppjpjj */
    /* loaded from: classes8.dex */
    public class C32764uppjpjj extends com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jujujpjjp.jupppjuju {
        public final /* synthetic */ C32794puujujuupp jpjjjjp;
        public final /* synthetic */ Context jupppjuju;
        public final /* synthetic */ AdInfoBean puujujuupp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32764uppjpjj(String str, String str2, AdInfoBean adInfoBean, Context context, C32794puujujuupp c32794puujujuupp) {
            super(str, str2);
            this.puujujuupp = adInfoBean;
            this.jupppjuju = context;
            this.jpjjjjp = c32794puujujuupp;
        }

        @Override // com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jujujpjjp.jupppjuju
        public void jujujpjjp() {
            C32786jujujpjjp c32786jujujpjjp = new C32786jujujpjjp(this.puujujuupp);
            c32786jujujpjjp.jjuuju(5);
            String jujujpjjp = com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jujujpjjp.jpjjjjp.jujujpjjp(this.jupppjuju, c32786jujujpjjp, this.jpjjjjp);
            MLog.m25881d(AdJumpHandlerUtils.jujujpjjp, "attributeUrl: " + jujujpjjp);
        }
    }

    private AdJumpHandlerUtils() {
    }

    public static void addAllConfigEvents(List<String> list) {
        List<String> list2 = C32780puujujuupp.uppjpjj;
        list2.clear();
        list2.addAll(list);
    }

    public static void doTrack(Context context, String str, AdInfoBean adInfoBean, long j, int i, String str2) {
        C32787puujujuupp.jujujpjjp.execute(new C32760jujujpjjp(jujujpjjp, "doTrack()", context, str, j, i, str2, adInfoBean));
    }

    public static boolean handleJumpAction(Context context, AdInfoBean adInfoBean, JSONObject jSONObject) {
        C32794puujujuupp jujujpjjp2;
        boolean jjuuju2;
        MLog.m25881d(jujujpjjp, "handleJumpAction");
        C32793jujujpjjp.jujujpjjp();
        if (jSONObject != null) {
            try {
                jujujpjjp2 = jujujpjjp(jSONObject);
            } catch (Exception e) {
                MLog.m25878e(jujujpjjp, "handleJumpAction error ", e);
                doTrack(context, C32781uppjpjj.ujjuupp, adInfoBean, -1L, -1, e.getMessage());
                return false;
            }
        } else {
            jujujpjjp2 = null;
        }
        if (adInfoBean == null) {
            MLog.m25879e(jujujpjjp, "adInfoBean is null!");
            doTrack(context, C32781uppjpjj.ujjuupp, null, -1L, -1, "adInfoBean is null");
            return false;
        } else if (TextUtils.isEmpty(adInfoBean.getLandingPageUrl())) {
            MLog.m25879e(jujujpjjp, "landingpage is null!");
            doTrack(context, C32781uppjpjj.ujjuupp, adInfoBean, -1L, -1, "landingpage is null");
            return false;
        } else {
            String deeplink = adInfoBean.getDeeplink();
            MLog.m25881d(jujujpjjp, "deepLink=" + deeplink);
            if (jujujpjjp(deeplink, context)) {
                doTrack(context, C32781uppjpjj.jpjjjjp, adInfoBean, -1L, 0, null);
                return true;
            } else if (jjuuju(context, adInfoBean.getDownloadPackageName())) {
                doTrack(context, C32781uppjpjj.jpjjjjp, adInfoBean, -1L, 1, null);
                return true;
            } else {
                int targetType = adInfoBean.getTargetType();
                Context jujujpjjp3 = jujujpjjp(context);
                MLog.m25881d(jujujpjjp, "handleJumpAction->targetType=" + targetType);
                if (targetType != 1) {
                    switch (targetType) {
                        case 8:
                            if (jujujpjjp2 == null) {
                                MLog.m25879e(jujujpjjp, "When targetType is gmc market haven't jumpControl info error!");
                                doTrack(jujujpjjp3, C32781uppjpjj.ujjuupp, adInfoBean, -1L, -1, "When targetType is gmc market haven't jumpControl info error!");
                                return false;
                            }
                            jjuuju2 = jujujpjjp(jujujpjjp3, adInfoBean, jujujpjjp2);
                            break;
                        case 9:
                            jjuuju2 = uppjpjj(jujujpjjp3, adInfoBean, jujujpjjp2);
                            break;
                        case 10:
                            boolean jujujpjjp4 = jujujpjjp(jujujpjjp3, adInfoBean.getLandingPageUrl());
                            if (jujujpjjp4) {
                                doTrack(jujujpjjp3, C32781uppjpjj.jpjjjjp, adInfoBean, -1L, 2, null);
                            } else {
                                doTrack(jujujpjjp3, C32781uppjpjj.ujjuupp, adInfoBean, -1L, -1, "hybrid is error!");
                            }
                            return jujujpjjp4;
                        default:
                            return false;
                    }
                } else {
                    jjuuju2 = jjuuju(jujujpjjp3, adInfoBean, jujujpjjp2);
                }
                return jjuuju2;
            }
        }
    }

    public static String handleWithCallee(Context context, String str, String str2) {
        try {
            Intent parseUri = Intent.parseUri(str, 0);
            parseUri.addFlags(268435456);
            if (upupjjppj.uppjpjj(context, str)) {
                parseUri.setPackage("com.android.vending");
            } else if (upupjjppj.jujujpjjp(context, str)) {
                parseUri.setPackage("com.xiaomi.mipicks");
            } else if (!TextUtils.isEmpty(str2)) {
                parseUri.setPackage(jujujpjjp(context, str2, parseUri));
            } else {
                parseUri.addCategory("android.intent.category.BROWSABLE");
                parseUri.setComponent(null);
                parseUri.setSelector(null);
            }
            Bundle bundle = new Bundle();
            bundle.putString(uppjpjj, uppjpjj);
            context.startActivity(parseUri, bundle);
            return null;
        } catch (Exception e) {
            MLog.m25878e(jujujpjjp, "handleWithCallee error ", e);
            return e.getMessage();
        }
    }

    public static void handlerTestUrlAction(Context context, AdInfoBean adInfoBean, C32794puujujuupp c32794puujujuupp, jjppjjupu.InterfaceC32782jjuuju interfaceC32782jjuuju) {
        MLog.m25877i(jujujpjjp, "handlerTestUrlAction: " + adInfoBean.getLandingPageUrl());
        new Handler(Looper.getMainLooper()).post(new C32762puujujuupp(jujujpjjp, "handlerTestUrlAction", context, adInfoBean, c32794puujujuupp, interfaceC32782jjuuju));
    }

    private static boolean jjppjjupu(Context context, AdInfoBean adInfoBean, C32794puujujuupp c32794puujujuupp) {
        MLog.m25877i(jujujpjjp, "jumpGooglePlayParallelWithHttpUrlConnection");
        C32787puujujuupp.jujujpjjp.execute(new C32764uppjpjj(jujujpjjp, "jump302Parallel use httpUrlConnection", adInfoBean, context, c32794puujujuupp));
        String handleWithCallee = handleWithCallee(context, adInfoBean.getLandingPageUrl(), c32794puujujuupp.uppjpjj());
        if (TextUtils.isEmpty(handleWithCallee)) {
            doTrack(context, C32781uppjpjj.jpjjjjp, adInfoBean, -1L, 2, null);
            return true;
        }
        doTrack(context, C32781uppjpjj.ujjuupp, adInfoBean, -1L, -1, handleWithCallee);
        return false;
    }

    private static boolean jjuuju(Context context, AdInfoBean adInfoBean, C32794puujujuupp c32794puujujuupp) {
        if (context != null && adInfoBean.getBrowserType() == 1) {
            try {
                MLog.m25877i(jujujpjjp, "customTabsIntent");
                CustomTabsIntent build = new CustomTabsIntent.Builder().build();
                build.intent.addFlags(268435456);
                build.launchUrl(context, Uri.parse(adInfoBean.getLandingPageUrl()));
                doTrack(context, C32781uppjpjj.jpjjjjp, adInfoBean, -1L, 2, null);
                return true;
            } catch (Exception e) {
                MLog.m25878e(jujujpjjp, "jumpBrowser:", e);
                doTrack(context, C32781uppjpjj.ujjuupp, adInfoBean, -1L, -1, e.getMessage());
                return false;
            }
        }
        MLog.m25877i(jujujpjjp, "jumpBrowser");
        String uppjpjj2 = c32794puujujuupp != null ? c32794puujujuupp.uppjpjj() : null;
        String handleWithCallee = handleWithCallee(context, adInfoBean.getLandingPageUrl(), uppjpjj2);
        if (!TextUtils.isEmpty(handleWithCallee) && !TextUtils.isEmpty(uppjpjj2)) {
            handleWithCallee = handleWithCallee(context, adInfoBean.getLandingPageUrl(), null);
        }
        String str = handleWithCallee;
        if (TextUtils.isEmpty(str)) {
            doTrack(context, C32781uppjpjj.jpjjjjp, adInfoBean, -1L, 2, null);
            return true;
        }
        doTrack(context, C32781uppjpjj.ujjuupp, adInfoBean, -1L, -1, str);
        return false;
    }

    private static boolean jpjjjjp(Context context, AdInfoBean adInfoBean, C32794puujujuupp c32794puujujuupp) {
        C32787puujujuupp.jujujpjjp.execute(new C32758jjuuju(jujujpjjp, "jump302 use httpUrlConnection", adInfoBean, context, c32794puujujuupp));
        String jujujpjjp2 = C32790jujujpjjp.jujujpjjp(context, adInfoBean.getLandingPageUrl(), c32794puujujuupp, adInfoBean);
        if (jujujpjjp2 == null) {
            doTrack(context, C32781uppjpjj.jpjjjjp, adInfoBean, -1L, 2, null);
            return true;
        }
        doTrack(context, C32781uppjpjj.ujjuupp, adInfoBean, -1L, -1, jujujpjjp2);
        return false;
    }

    private static Context jujujpjjp(Context context) {
        return (context == null || context.getApplicationContext() == null) ? context : context.getApplicationContext();
    }

    private static boolean jupppjuju(Context context, AdInfoBean adInfoBean, C32794puujujuupp c32794puujujuupp) {
        if (!upupjjppj.jujujpjjp(context) && !SDKConfig.isLite()) {
            try {
                new Handler(Looper.getMainLooper()).post(new jpjjjjp(jujujpjjp, "handle GmcMarket 302 Jump", context, adInfoBean, c32794puujujuupp, System.currentTimeMillis()));
                return true;
            } catch (Exception e) {
                MLog.m25878e(jujujpjjp, "jumpParallel e : ", e);
                return false;
            }
        }
        MLog.m25879e(jujujpjjp, "System Uid or lite device can not use WebView !");
        return jjuuju(context, adInfoBean, c32794puujujuupp);
    }

    private static boolean puujujuupp(Context context, AdInfoBean adInfoBean, C32794puujujuupp c32794puujujuupp) {
        MLog.m25877i(jujujpjjp, "jumpGmcMarket302WithHttpUrlConnection");
        C32787puujujuupp.jujujpjjp.execute(new ujjuupp(jujujpjjp, "jump302 use httpUrlConnection", context, adInfoBean, c32794puujujuupp, System.currentTimeMillis()));
        return true;
    }

    private static boolean ujjuupp(Context context, AdInfoBean adInfoBean, C32794puujujuupp c32794puujujuupp) {
        if (!upupjjppj.jujujpjjp(context) && !SDKConfig.isLite()) {
            if (upupjjppj(context, adInfoBean, c32794puujujuupp)) {
                return true;
            }
            String jujujpjjp2 = C32790jujujpjjp.jujujpjjp(context, adInfoBean.getLandingPageUrl(), c32794puujujuupp, adInfoBean);
            if (TextUtils.isEmpty(jujujpjjp2)) {
                doTrack(context, C32781uppjpjj.jpjjjjp, adInfoBean, -1L, 2, null);
                return true;
            }
            doTrack(context, C32781uppjpjj.ujjuupp, adInfoBean, -1L, -1, jujujpjjp2);
            return false;
        }
        MLog.m25879e(jujujpjjp, "System Uid can not use WebView !");
        return jjuuju(context, adInfoBean, c32794puujujuupp);
    }

    private static boolean uppj(Context context, AdInfoBean adInfoBean, C32794puujujuupp c32794puujujuupp) {
        if (!upupjjppj.jujujpjjp(context) && !SDKConfig.isLite()) {
            if (upupjjppj(context, adInfoBean, c32794puujujuupp)) {
                return true;
            }
            String handleWithCallee = handleWithCallee(context, adInfoBean.getLandingPageUrl(), c32794puujujuupp.uppjpjj());
            if (TextUtils.isEmpty(handleWithCallee)) {
                doTrack(context, C32781uppjpjj.jpjjjjp, adInfoBean, -1L, 2, null);
                return true;
            }
            doTrack(context, C32781uppjpjj.ujjuupp, adInfoBean, -1L, -1, handleWithCallee);
            return false;
        }
        MLog.m25879e(jujujpjjp, "System Uid or lite device can not use WebView !");
        return jjuuju(context, adInfoBean, c32794puujujuupp);
    }

    private static boolean uppjpjj(Context context, AdInfoBean adInfoBean, C32794puujujuupp c32794puujujuupp) {
        MLog.m25877i(jujujpjjp, "handleGooglePlay");
        if (TextUtils.isEmpty(adInfoBean.getLandingPageUrl())) {
            MLog.m25879e(jujujpjjp, "handleGooglePlay url is null!");
            return false;
        }
        int puujujuupp2 = c32794puujujuupp != null ? c32794puujujuupp.puujujuupp() : 0;
        if (puujujuupp2 != 0) {
            if (puujujuupp2 != 1) {
                if (puujujuupp2 == 2) {
                    if (!upupjjppj.jujujpjjp(context) && !SDKConfig.isLite()) {
                        return AdJumperLoadingActivity.jujujpjjp(context, adInfoBean, C32794puujujuupp.jujujpjjp(c32794puujujuupp));
                    }
                    MLog.m25879e(jujujpjjp, "System Uid  or lite device can not use WebView!");
                    return jjuuju(context, adInfoBean, c32794puujujuupp);
                } else if (puujujuupp2 == 3) {
                    return uppj(context, adInfoBean, c32794puujujuupp);
                } else {
                    if (puujujuupp2 != 4) {
                        if (puujujuupp2 != 5) {
                            return false;
                        }
                        return jjppjjupu(context, adInfoBean, c32794puujujuupp);
                    }
                }
            }
            return AdJumperLoadingActivity.jujujpjjp(context, adInfoBean, C32794puujujuupp.jujujpjjp(c32794puujujuupp));
        }
        return jjuuju(context, adInfoBean, c32794puujujuupp);
    }

    private static boolean upupjjppj(Context context, AdInfoBean adInfoBean, C32794puujujuupp c32794puujujuupp) {
        if (!upupjjppj.jujujpjjp(context) && !SDKConfig.isLite()) {
            try {
                new Handler(Looper.getMainLooper()).post(new jupppjuju(jujujpjjp, "handle GmcMarket parallel Jump", context, adInfoBean, c32794puujujuupp));
                return false;
            } catch (Exception e) {
                MLog.m25878e(jujujpjjp, "jumpParallelWithWebViewInBackground e : ", e);
                return false;
            }
        }
        MLog.m25879e(jujujpjjp, "System Uid or lite device can not use WebView !");
        return jjuuju(context, adInfoBean, c32794puujujuupp);
    }

    private static boolean jujujpjjp(Context context, String str) {
        return jujujpjjp(context, str, "com.miui.hybrid");
    }

    private static String jujujpjjp(Context context, String str, Intent intent) {
        String[] strArr;
        if (context == null || intent == null) {
            return str;
        }
        if (!"com.mi.globalbrowser".equals(str) && !jjuuju.equals(str)) {
            intent.setPackage(str);
            if (C32793jujujpjjp.jujujpjjp(context, intent)) {
                return str;
            }
            return null;
        }
        for (String str2 : jupppjuju) {
            intent.setPackage(str2);
            if (C32793jujujpjjp.jujujpjjp(context, intent)) {
                return str2;
            }
        }
        return null;
    }

    private static boolean jujujpjjp(Context context, AdInfoBean adInfoBean, C32794puujujuupp c32794puujujuupp) {
        int puujujuupp2 = c32794puujujuupp != null ? c32794puujujuupp.puujujuupp() : 0;
        MLog.m25879e(jujujpjjp, "jumpMode = " + puujujuupp2);
        if (puujujuupp2 != 0) {
            if (puujujuupp2 != 2) {
                if (puujujuupp2 != 3) {
                    if (puujujuupp2 != 4) {
                        if (puujujuupp2 != 5) {
                            return false;
                        }
                        return jpjjjjp(context, adInfoBean, c32794puujujuupp);
                    }
                    return puujujuupp(context, adInfoBean, c32794puujujuupp);
                }
                return ujjuupp(context, adInfoBean, c32794puujujuupp);
            }
            return jupppjuju(context, adInfoBean, c32794puujujuupp);
        }
        return jjuuju(context, adInfoBean, c32794puujujuupp);
    }

    private static boolean uppjpjj(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.setPackage("com.xiaomi.mipicks");
        return context.getPackageManager().queryIntentActivities(intent, 0).size() > 0;
    }

    private static boolean jujujpjjp(Context context, String str, String str2) {
        try {
            Uri parse = Uri.parse(str);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(268435456);
            if (!TextUtils.isEmpty(str2)) {
                intent.setPackage(str2);
            }
            intent.setData(parse);
            Bundle bundle = new Bundle();
            bundle.putString(uppjpjj, uppjpjj);
            context.startActivity(intent, bundle);
            return true;
        } catch (Exception e) {
            MLog.m25878e(jujujpjjp, "openMarket exception", e);
            return false;
        }
    }

    private static boolean jjuuju(Context context, String str) {
        Intent launchIntentForPackage;
        try {
            if (!TextUtils.isEmpty(str) && (launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str)) != null) {
                launchIntentForPackage.setFlags(268435456);
                Bundle bundle = new Bundle();
                bundle.putString(uppjpjj, uppjpjj);
                context.startActivity(launchIntentForPackage, bundle);
                return true;
            }
        } catch (Exception e) {
            MLog.m25878e(jujujpjjp, "startAppWithPackageName exception", e);
        }
        return false;
    }

    private static boolean jujujpjjp(Context context, String str, C32794puujujuupp c32794puujujuupp) {
        if (c32794puujujuupp != null && !TextUtils.isEmpty(c32794puujujuupp.uppjpjj())) {
            return jujujpjjp(context, str, c32794puujujuupp.uppjpjj());
        }
        return jujujpjjp(context, str, "com.android.vending");
    }

    private static C32794puujujuupp jujujpjjp(JSONObject jSONObject) {
        return C32794puujujuupp.jujujpjjp(jSONObject);
    }

    private static PackageInfo jujujpjjp(Context context, String str, int i) {
        try {
            return context.getPackageManager().getPackageInfo(str, i);
        } catch (Exception e) {
            MLog.m25878e(jujujpjjp, "getPackageInfo had Exception: ", e);
            return null;
        }
    }

    private static boolean jujujpjjp(String str, Context context) {
        try {
            MLog.m25881d(jujujpjjp, "open Url " + str);
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            intent.setFlags(268435456);
            Bundle bundle = new Bundle();
            bundle.putString(uppjpjj, uppjpjj);
            context.startActivity(intent, bundle);
            return true;
        } catch (Exception e) {
            MLog.m25878e(jujujpjjp, "openUrl exception", e);
            return false;
        }
    }
}
